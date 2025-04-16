/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class SpeakeasyHTTPClient implements HTTPClient {

    private static boolean debugEnabled = false;

    // uppercase
    private static Set<String> redactedHeaders = Set.of("AUTHORIZATION", "X-API-KEY");
    
    private static Consumer<? super String> logger = System.out::println;

    /**
     * Experimental, may be changed anytime. Sets debug logging on or off for
     * requests and responses including bodies for JSON content. WARNING: this
     * setting may expose sensitive information in logs (like <i>Authorization</i>
     * headers), and should only be enabled temporarily for local debugging
     * purposes. By default, <i>Authorization</i> headers are redacted in the logs
     * ( printed with a value of {@code [*******]}). Header suppression is controlled
     * with the {@link #setRedactedHeaders(Collection)} method.
     *
     * @param enabled true to enable debug logging, false to disable it
     */
    public static void setDebugLogging(boolean enabled) {
        debugEnabled = enabled;
    }

    /**
     * Experimental, may be changed anytime. When debug logging is enabled this
     * method controls the suppression of header values in the logs. By default,
     * <i>Authorization</i> headers are redacted in the logs (printed with a value
     * of {@code [*******]}). Header suppression is controlled with the
     * {@link #setRedactedHeaders(Collection)} method.
     * 
     * @param headerNames the names (case-insensitive) of the headers whose values 
     * will be redacted in the logs
     */
    public static void setRedactedHeaders(Collection<String> headerNames) {
        redactedHeaders = headerNames.stream() //
                .map(x -> x.toUpperCase(Locale.ENGLISH)) //
                .collect(Collectors.toSet());
    }
    
    public static void setLogger(Consumer<? super String> logger) {
        SpeakeasyHTTPClient.logger = logger;
    }

    @Override
    public HttpResponse<InputStream> send(HttpRequest request)
            throws IOException, InterruptedException, URISyntaxException {
        HttpClient client = HttpClient.newHttpClient();
        if (debugEnabled) {
            request = logRequest(request);
        }
        var response = client.send(request, HttpResponse.BodyHandlers.ofInputStream());
        if (debugEnabled) {
            response = logResponse(response);
        }
        return response;
    }

    private HttpRequest logRequest(HttpRequest request) {
        log("Sending request: " + request);
        log("Request headers: " + redactHeaders(request.headers()));
        // only log the body if it is present and the content type is JSON
        if (request.bodyPublisher().isPresent() && request.headers() //
                .firstValue("Content-Type") //
                .filter(x -> x.equals("application/json") || x.equals("text/plain")).isPresent()) {
            // we read the body and ensure that the BodyPublisher is rebuilt to pass to the
            // http client
            byte[] body = Helpers.bodyBytes(request);
            request = Helpers //
                    .copy(request) //
                    .method(request.method(), BodyPublishers.ofByteArray(body)) //
                    .build();
            // note that in the case of text/plain a different encoding from UTF-8
            // may be in use but we just log the bytes as UTF-8. Unexpected encodings
            // do not throw (substitution happens).
            log("Request body:\n" + new String(body, StandardCharsets.UTF_8));
        }
        return request;
    }

    private static HttpResponse<InputStream> logResponse(HttpResponse<InputStream> response) throws IOException {
        // make the response re-readable by loading the response body into a byte array
        // and allowing the InputStream to be read many times
        response = Utils.cache(response);
        log("Received response: " + response);
        log("Response headers: " + redactHeaders(response.headers()));
        // only log the response body if it is present and the content type is JSON or plain text
        if (response.headers() //
                .firstValue("Content-Type") //
                .filter(x -> x.equals("application/json") || x.equals("text/plain")) //
                .isPresent()) {
            // the response is re-readable so we can read and close it without
            // affecting later processing of the response.

            // note that in the case of text/plain a different encoding from UTF-8
            // may be in use but we just log the bytes as UTF-8. Unexpected encodings
            // do not throw (substitution happens).
            log("Response body:\n" + Utils.toUtf8AndClose(response.body()));
        }
        return response;
    }

    private static String redactHeaders(HttpHeaders headers) {
        return "{" + headers.map() //
                .entrySet() //
                .stream() //
                .map(entry -> {
                    final String value;
                    if (redactedHeaders.contains(entry.getKey().toUpperCase(Locale.ENGLISH))) {
                        value = "[******]";
                    } else {
                        value = String.valueOf(entry.getValue());
                    }
                    return entry.getKey() + "=" + value;
                }) //
                .collect(Collectors.joining(", ")) + "}";
    }

    private static void log(String message) {
        logger.accept(message);
    }
}

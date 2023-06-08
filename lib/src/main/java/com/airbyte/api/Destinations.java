/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api;

import com.airbyte.api.utils.HTTPClient;
import com.airbyte.api.utils.HTTPRequest;
import com.airbyte.api.utils.JSON;
import com.airbyte.api.utils.SerializedBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

public class Destinations {
	
	private SDKConfiguration sdkConfiguration;

	public Destinations(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Create a destination
     * Creates a destination given a name, workspace id, and a json blob containing the configuration for the source.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.airbyte.api.models.operations.CreateDestinationResponse createDestination(com.airbyte.api.models.shared.DestinationCreateRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.airbyte.api.utils.Utils.generateURL(baseUrl, "/destinations");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.airbyte.api.utils.Utils.serializeRequestBody(request, "request", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.airbyte.api.models.operations.CreateDestinationResponse res = new com.airbyte.api.models.operations.CreateDestinationResponse(contentType, httpRes.statusCode()) {{
            destinationResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.DestinationResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.airbyte.api.models.shared.DestinationResponse.class);
                res.destinationResponse = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
        }

        return res;
    }

    /**
     * Delete a Destination
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.airbyte.api.models.operations.DeleteDestinationResponse deleteDestination(com.airbyte.api.models.operations.DeleteDestinationRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.airbyte.api.utils.Utils.generateURL(com.airbyte.api.models.operations.DeleteDestinationRequest.class, baseUrl, "/destinations/{destinationId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "*/*");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.airbyte.api.models.operations.DeleteDestinationResponse res = new com.airbyte.api.models.operations.DeleteDestinationResponse(contentType, httpRes.statusCode()) {{
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
        }

        return res;
    }

    /**
     * Get Destination details
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.airbyte.api.models.operations.GetDestinationResponse getDestination(com.airbyte.api.models.operations.GetDestinationRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.airbyte.api.utils.Utils.generateURL(com.airbyte.api.models.operations.GetDestinationRequest.class, baseUrl, "/destinations/{destinationId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.airbyte.api.models.operations.GetDestinationResponse res = new com.airbyte.api.models.operations.GetDestinationResponse(contentType, httpRes.statusCode()) {{
            destinationResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.DestinationResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.airbyte.api.models.shared.DestinationResponse.class);
                res.destinationResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
        }

        return res;
    }

    /**
     * List destinations
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.airbyte.api.models.operations.ListDestinationsResponse listDestinations(com.airbyte.api.models.operations.ListDestinationsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.airbyte.api.utils.Utils.generateURL(baseUrl, "/destinations");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = com.airbyte.api.utils.Utils.getQueryParams(com.airbyte.api.models.operations.ListDestinationsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.airbyte.api.models.operations.ListDestinationsResponse res = new com.airbyte.api.models.operations.ListDestinationsResponse(contentType, httpRes.statusCode()) {{
            destinationsResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.DestinationsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.airbyte.api.models.shared.DestinationsResponse.class);
                res.destinationsResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
        }

        return res;
    }

    /**
     * Update a Destination
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.airbyte.api.models.operations.PatchDestinationResponse patchDestination(com.airbyte.api.models.operations.PatchDestinationRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.airbyte.api.utils.Utils.generateURL(com.airbyte.api.models.operations.PatchDestinationRequest.class, baseUrl, "/destinations/{destinationId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.airbyte.api.utils.Utils.serializeRequestBody(request, "destinationPatchRequest", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.airbyte.api.models.operations.PatchDestinationResponse res = new com.airbyte.api.models.operations.PatchDestinationResponse(contentType, httpRes.statusCode()) {{
            destinationResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.DestinationResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.airbyte.api.models.shared.DestinationResponse.class);
                res.destinationResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
        }

        return res;
    }

    /**
     * Update a Destination and fully overwrite it
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.airbyte.api.models.operations.PutDestinationResponse putDestination(com.airbyte.api.models.operations.PutDestinationRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.airbyte.api.utils.Utils.generateURL(com.airbyte.api.models.operations.PutDestinationRequest.class, baseUrl, "/destinations/{destinationId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.airbyte.api.utils.Utils.serializeRequestBody(request, "destinationPutRequest", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.airbyte.api.models.operations.PutDestinationResponse res = new com.airbyte.api.models.operations.PutDestinationResponse(contentType, httpRes.statusCode()) {{
            destinationResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.DestinationResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.airbyte.api.models.shared.DestinationResponse.class);
                res.destinationResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
        }

        return res;
    }
}
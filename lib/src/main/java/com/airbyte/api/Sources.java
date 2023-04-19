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

public class Sources {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Sources(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    /**
     * Create a source
     * Creates a source given a name, workspace id, and a json blob containing the configuration for the source.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.airbyte.api.models.operations.CreateSourceResponse createSource(com.airbyte.api.models.shared.SourceCreateRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.airbyte.api.utils.Utils.generateURL(baseUrl, "/sources");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.airbyte.api.utils.Utils.serializeRequestBody(request, "request", "json");
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.airbyte.api.models.operations.CreateSourceResponse res = new com.airbyte.api.models.operations.CreateSourceResponse() {{
            sourceResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.SourceResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.airbyte.api.models.shared.SourceResponse.class);
                res.sourceResponse = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 403) {
        }

        return res;
    }

    /**
     * Delete a Source
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.airbyte.api.models.operations.DeleteSourceResponse deleteSource(com.airbyte.api.models.operations.DeleteSourceRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.airbyte.api.utils.Utils.generateURL(com.airbyte.api.models.operations.DeleteSourceRequest.class, baseUrl, "/sources/{sourceId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.airbyte.api.models.operations.DeleteSourceResponse res = new com.airbyte.api.models.operations.DeleteSourceResponse() {{
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
        }

        return res;
    }

    /**
     * Get Source details
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.airbyte.api.models.operations.GetSourceResponse getSource(com.airbyte.api.models.operations.GetSourceRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.airbyte.api.utils.Utils.generateURL(com.airbyte.api.models.operations.GetSourceRequest.class, baseUrl, "/sources/{sourceId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.airbyte.api.models.operations.GetSourceResponse res = new com.airbyte.api.models.operations.GetSourceResponse() {{
            sourceResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.SourceResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.airbyte.api.models.shared.SourceResponse.class);
                res.sourceResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
        }

        return res;
    }

    /**
     * Initiate OAuth for a source.
     * Given a source ID, workspace ID, and redirect URL, initiates OAuth for the source.
     * 
     * This returns a fully formed URL for performing user authentication against the relevant source identity provider (IdP). Once authentication has been completed, the IdP will redirect to an Airbyte endpoint which will save the access and refresh tokens off as a secret and return the secret ID to the redirect URL specified in the `secret_id` query string parameter.
     * 
     * That secret ID can be used to create a source with credentials in place of actual tokens.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.airbyte.api.models.operations.InitiateOAuthResponse initiateOAuth(com.airbyte.api.models.shared.InitiateOauthRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.airbyte.api.utils.Utils.generateURL(baseUrl, "/sources/initiateOAuth");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.airbyte.api.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.airbyte.api.models.operations.InitiateOAuthResponse res = new com.airbyte.api.models.operations.InitiateOAuthResponse() {{
            initiateOauthResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.InitiateOauthResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.airbyte.api.models.shared.InitiateOauthResponse.class);
                res.initiateOauthResponse = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 403) {
        }

        return res;
    }

    /**
     * List sources
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.airbyte.api.models.operations.ListSourcesResponse listSources(com.airbyte.api.models.operations.ListSourcesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.airbyte.api.utils.Utils.generateURL(baseUrl, "/sources");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = com.airbyte.api.utils.Utils.getQueryParams(com.airbyte.api.models.operations.ListSourcesRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.airbyte.api.models.operations.ListSourcesResponse res = new com.airbyte.api.models.operations.ListSourcesResponse() {{
            sourcesResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.SourcesResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.airbyte.api.models.shared.SourcesResponse.class);
                res.sourcesResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
        }

        return res;
    }
}
/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api;

import com.airbyte.api.models.errors.SDKError;
import com.airbyte.api.models.operations.SDKMethodInterfaces.*;
import com.airbyte.api.utils.HTTPClient;
import com.airbyte.api.utils.HTTPRequest;
import com.airbyte.api.utils.Hook.AfterErrorContextImpl;
import com.airbyte.api.utils.Hook.AfterSuccessContextImpl;
import com.airbyte.api.utils.Hook.BeforeRequestContextImpl;
import com.airbyte.api.utils.JSON;
import com.airbyte.api.utils.Retries.NonRetryableException;
import com.airbyte.api.utils.SerializedBody;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import org.apache.http.NameValuePair;
import org.openapitools.jackson.nullable.JsonNullable;

public class Workspaces implements
            MethodCallCreateOrUpdateWorkspaceOAuthCredentials,
            MethodCallCreateWorkspace,
            MethodCallDeleteWorkspace,
            MethodCallGetWorkspace,
            MethodCallListWorkspaces,
            MethodCallUpdateWorkspace {

    private final SDKConfiguration sdkConfiguration;

    Workspaces(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Create OAuth override credentials for a workspace and source type.
     * Create/update a set of OAuth credentials to override the Airbyte-provided OAuth credentials used for source/destination OAuth.
     * In order to determine what the credential configuration needs to be, please see the connector specification of the relevant source/destination.
     * @return The call builder
     */
    public com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsRequestBuilder createOrUpdateWorkspaceOAuthCredentials() {
        return new com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsRequestBuilder(this);
    }

    /**
     * Create OAuth override credentials for a workspace and source type.
     * Create/update a set of OAuth credentials to override the Airbyte-provided OAuth credentials used for source/destination OAuth.
     * In order to determine what the credential configuration needs to be, please see the connector specification of the relevant source/destination.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsResponse createOrUpdateWorkspaceOAuthCredentials(
            com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsRequest.class,
                _baseUrl,
                "/workspaces/{workspaceId}/oauthCredentials",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "PUT");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "workspaceOAuthCredentialsRequest", "json", false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "*/*")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("createOrUpdateWorkspaceOAuthCredentials", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "403", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("createOrUpdateWorkspaceOAuthCredentials", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("createOrUpdateWorkspaceOAuthCredentials", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("createOrUpdateWorkspaceOAuthCredentials", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsResponse.Builder _resBuilder = 
            com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "403", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }



    /**
     * Create a workspace
     * @return The call builder
     */
    public com.airbyte.api.models.operations.CreateWorkspaceRequestBuilder createWorkspace() {
        return new com.airbyte.api.models.operations.CreateWorkspaceRequestBuilder(this);
    }

    /**
     * Create a workspace
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.airbyte.api.models.operations.CreateWorkspaceResponse createWorkspace(
            com.airbyte.api.models.shared.WorkspaceCreateRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/workspaces");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<com.airbyte.api.models.shared.WorkspaceCreateRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "request", "json", false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("createWorkspace", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "403", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("createWorkspace", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("createWorkspace", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("createWorkspace", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.airbyte.api.models.operations.CreateWorkspaceResponse.Builder _resBuilder = 
            com.airbyte.api.models.operations.CreateWorkspaceResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.airbyte.api.models.operations.CreateWorkspaceResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                com.airbyte.api.models.shared.WorkspaceResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.airbyte.api.models.shared.WorkspaceResponse>() {});
                _res.withWorkspaceResponse(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "403", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }



    /**
     * Delete a Workspace
     * @return The call builder
     */
    public com.airbyte.api.models.operations.DeleteWorkspaceRequestBuilder deleteWorkspace() {
        return new com.airbyte.api.models.operations.DeleteWorkspaceRequestBuilder(this);
    }

    /**
     * Delete a Workspace
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.airbyte.api.models.operations.DeleteWorkspaceResponse deleteWorkspace(
            com.airbyte.api.models.operations.DeleteWorkspaceRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                com.airbyte.api.models.operations.DeleteWorkspaceRequest.class,
                _baseUrl,
                "/workspaces/{workspaceId}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "DELETE");
        _req.addHeader("Accept", "*/*")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("deleteWorkspace", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "403", "404", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("deleteWorkspace", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("deleteWorkspace", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("deleteWorkspace", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.airbyte.api.models.operations.DeleteWorkspaceResponse.Builder _resBuilder = 
            com.airbyte.api.models.operations.DeleteWorkspaceResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.airbyte.api.models.operations.DeleteWorkspaceResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "204")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "403", "404", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }



    /**
     * Get Workspace details
     * @return The call builder
     */
    public com.airbyte.api.models.operations.GetWorkspaceRequestBuilder getWorkspace() {
        return new com.airbyte.api.models.operations.GetWorkspaceRequestBuilder(this);
    }

    /**
     * Get Workspace details
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.airbyte.api.models.operations.GetWorkspaceResponse getWorkspace(
            com.airbyte.api.models.operations.GetWorkspaceRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                com.airbyte.api.models.operations.GetWorkspaceRequest.class,
                _baseUrl,
                "/workspaces/{workspaceId}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("getWorkspace", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "403", "404", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("getWorkspace", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("getWorkspace", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("getWorkspace", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.airbyte.api.models.operations.GetWorkspaceResponse.Builder _resBuilder = 
            com.airbyte.api.models.operations.GetWorkspaceResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.airbyte.api.models.operations.GetWorkspaceResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                com.airbyte.api.models.shared.WorkspaceResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.airbyte.api.models.shared.WorkspaceResponse>() {});
                _res.withWorkspaceResponse(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "403", "404", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }



    /**
     * List workspaces
     * @return The call builder
     */
    public com.airbyte.api.models.operations.ListWorkspacesRequestBuilder listWorkspaces() {
        return new com.airbyte.api.models.operations.ListWorkspacesRequestBuilder(this);
    }

    /**
     * List workspaces
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.airbyte.api.models.operations.ListWorkspacesResponse listWorkspaces(
            com.airbyte.api.models.operations.ListWorkspacesRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/workspaces");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                com.airbyte.api.models.operations.ListWorkspacesRequest.class,
                request, 
                null));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("listWorkspaces", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "403", "404", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("listWorkspaces", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("listWorkspaces", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("listWorkspaces", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.airbyte.api.models.operations.ListWorkspacesResponse.Builder _resBuilder = 
            com.airbyte.api.models.operations.ListWorkspacesResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.airbyte.api.models.operations.ListWorkspacesResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                com.airbyte.api.models.shared.WorkspacesResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.airbyte.api.models.shared.WorkspacesResponse>() {});
                _res.withWorkspacesResponse(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "403", "404", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }



    /**
     * Update a workspace
     * @return The call builder
     */
    public com.airbyte.api.models.operations.UpdateWorkspaceRequestBuilder updateWorkspace() {
        return new com.airbyte.api.models.operations.UpdateWorkspaceRequestBuilder(this);
    }

    /**
     * Update a workspace
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.airbyte.api.models.operations.UpdateWorkspaceResponse updateWorkspace(
            com.airbyte.api.models.operations.UpdateWorkspaceRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                com.airbyte.api.models.operations.UpdateWorkspaceRequest.class,
                _baseUrl,
                "/workspaces/{workspaceId}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "PATCH");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<com.airbyte.api.models.operations.UpdateWorkspaceRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "workspaceUpdateRequest", "json", false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("updateWorkspace", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "403", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("updateWorkspace", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("updateWorkspace", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("updateWorkspace", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.airbyte.api.models.operations.UpdateWorkspaceResponse.Builder _resBuilder = 
            com.airbyte.api.models.operations.UpdateWorkspaceResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.airbyte.api.models.operations.UpdateWorkspaceResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                com.airbyte.api.models.shared.WorkspaceResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.airbyte.api.models.shared.WorkspaceResponse>() {});
                _res.withWorkspaceResponse(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "403", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }

}

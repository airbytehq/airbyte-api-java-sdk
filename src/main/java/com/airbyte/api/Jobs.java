/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api;

import com.airbyte.api.models.errors.SDKError;
import com.airbyte.api.models.operations.CancelJobRequest;
import com.airbyte.api.models.operations.CancelJobRequestBuilder;
import com.airbyte.api.models.operations.CancelJobResponse;
import com.airbyte.api.models.operations.CreateJobRequestBuilder;
import com.airbyte.api.models.operations.CreateJobResponse;
import com.airbyte.api.models.operations.GetJobRequest;
import com.airbyte.api.models.operations.GetJobRequestBuilder;
import com.airbyte.api.models.operations.GetJobResponse;
import com.airbyte.api.models.operations.ListJobsRequest;
import com.airbyte.api.models.operations.ListJobsRequestBuilder;
import com.airbyte.api.models.operations.ListJobsResponse;
import com.airbyte.api.models.operations.SDKMethodInterfaces.*;
import com.airbyte.api.models.shared.JobCreateRequest;
import com.airbyte.api.models.shared.JobResponse;
import com.airbyte.api.models.shared.JobsResponse;
import com.airbyte.api.utils.HTTPClient;
import com.airbyte.api.utils.HTTPRequest;
import com.airbyte.api.utils.Hook.AfterErrorContextImpl;
import com.airbyte.api.utils.Hook.AfterSuccessContextImpl;
import com.airbyte.api.utils.Hook.BeforeRequestContextImpl;
import com.airbyte.api.utils.SerializedBody;
import com.airbyte.api.utils.Utils.JsonShape;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.Object;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

public class Jobs implements
            MethodCallCancelJob,
            MethodCallCreateJob,
            MethodCallGetJob,
            MethodCallListJobs {

    private final SDKConfiguration sdkConfiguration;

    Jobs(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Cancel a running Job
     * 
     * @return The call builder
     */
    public CancelJobRequestBuilder cancelJob() {
        return new CancelJobRequestBuilder(this);
    }

    /**
     * Cancel a running Job
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CancelJobResponse cancelJob(
            CancelJobRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                CancelJobRequest.class,
                _baseUrl,
                "/jobs/{jobId}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "DELETE");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      _baseUrl,
                      "cancelJob", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "403", "404", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "cancelJob",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "cancelJob",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "cancelJob",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CancelJobResponse.Builder _resBuilder = 
            CancelJobResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CancelJobResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                JobResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<JobResponse>() {});
                _res.withJobResponse(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "403", "404", "4XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }



    /**
     * Trigger a sync or reset job of a connection
     * 
     * @return The call builder
     */
    public CreateJobRequestBuilder createJob() {
        return new CreateJobRequestBuilder(this);
    }

    /**
     * Trigger a sync or reset job of a connection
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateJobResponse createJob(
            JobCreateRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/jobs");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<JobCreateRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "request",
                "json",
                false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      _baseUrl,
                      "createJob", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "403", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "createJob",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "createJob",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "createJob",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateJobResponse.Builder _resBuilder = 
            CreateJobResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateJobResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                JobResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<JobResponse>() {});
                _res.withJobResponse(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "403", "4XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }



    /**
     * Get Job status and details
     * 
     * @return The call builder
     */
    public GetJobRequestBuilder getJob() {
        return new GetJobRequestBuilder(this);
    }

    /**
     * Get Job status and details
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetJobResponse getJob(
            GetJobRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetJobRequest.class,
                _baseUrl,
                "/jobs/{jobId}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      _baseUrl,
                      "getJob", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "403", "404", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "getJob",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "getJob",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "getJob",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetJobResponse.Builder _resBuilder = 
            GetJobResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetJobResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                JobResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<JobResponse>() {});
                _res.withJobResponse(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "403", "404", "4XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }



    /**
     * List Jobs by sync type
     * 
     * @return The call builder
     */
    public ListJobsRequestBuilder listJobs() {
        return new ListJobsRequestBuilder(this);
    }

    /**
     * List Jobs by sync type
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListJobsResponse listJobs(
            ListJobsRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/jobs");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                ListJobsRequest.class,
                request, 
                null));
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      _baseUrl,
                      "listJobs", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "403", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "listJobs",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "listJobs",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "listJobs",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListJobsResponse.Builder _resBuilder = 
            ListJobsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListJobsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                JobsResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<JobsResponse>() {});
                _res.withJobsResponse(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "403", "4XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }

}

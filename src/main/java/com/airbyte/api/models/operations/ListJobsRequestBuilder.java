/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.operations;

import com.airbyte.api.utils.Utils;
import java.lang.Exception;

public class ListJobsRequestBuilder {

    private ListJobsRequest request;
    private final SDKMethodInterfaces.MethodCallListJobs sdk;

    public ListJobsRequestBuilder(SDKMethodInterfaces.MethodCallListJobs sdk) {
        this.sdk = sdk;
    }

    public ListJobsRequestBuilder request(ListJobsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListJobsResponse call() throws Exception {

        return sdk.listJobs(
            request);
    }
}

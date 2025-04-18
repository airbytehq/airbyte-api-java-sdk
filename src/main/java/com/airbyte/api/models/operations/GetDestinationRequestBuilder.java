/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.operations;

import com.airbyte.api.utils.Utils;
import java.lang.Exception;

public class GetDestinationRequestBuilder {

    private GetDestinationRequest request;
    private final SDKMethodInterfaces.MethodCallGetDestination sdk;

    public GetDestinationRequestBuilder(SDKMethodInterfaces.MethodCallGetDestination sdk) {
        this.sdk = sdk;
    }

    public GetDestinationRequestBuilder request(GetDestinationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetDestinationResponse call() throws Exception {

        return sdk.getDestination(
            request);
    }
}

/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.operations;

import com.airbyte.api.utils.Utils;
import java.lang.Exception;

public class PatchDestinationRequestBuilder {

    private PatchDestinationRequest request;
    private final SDKMethodInterfaces.MethodCallPatchDestination sdk;

    public PatchDestinationRequestBuilder(SDKMethodInterfaces.MethodCallPatchDestination sdk) {
        this.sdk = sdk;
    }

    public PatchDestinationRequestBuilder request(PatchDestinationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchDestinationResponse call() throws Exception {

        return sdk.patchDestination(
            request);
    }
}

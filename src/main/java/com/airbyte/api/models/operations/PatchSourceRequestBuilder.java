/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.operations;

import com.airbyte.api.utils.Utils;
import java.lang.Exception;

public class PatchSourceRequestBuilder {

    private PatchSourceRequest request;
    private final SDKMethodInterfaces.MethodCallPatchSource sdk;

    public PatchSourceRequestBuilder(SDKMethodInterfaces.MethodCallPatchSource sdk) {
        this.sdk = sdk;
    }

    public PatchSourceRequestBuilder request(PatchSourceRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchSourceResponse call() throws Exception {

        return sdk.patchSource(
            request);
    }
}

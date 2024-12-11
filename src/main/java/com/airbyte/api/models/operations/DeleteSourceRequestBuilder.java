/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import com.airbyte.api.utils.Utils;

public class DeleteSourceRequestBuilder {

    private DeleteSourceRequest request;
    private final SDKMethodInterfaces.MethodCallDeleteSource sdk;

    public DeleteSourceRequestBuilder(SDKMethodInterfaces.MethodCallDeleteSource sdk) {
        this.sdk = sdk;
    }

    public DeleteSourceRequestBuilder request(DeleteSourceRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public DeleteSourceResponse call() throws Exception {

        return sdk.deleteSource(
            request);
    }
}

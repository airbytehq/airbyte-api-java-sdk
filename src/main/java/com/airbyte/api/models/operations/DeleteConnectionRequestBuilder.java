/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import com.airbyte.api.utils.Utils;

public class DeleteConnectionRequestBuilder {

    private DeleteConnectionRequest request;
    private final SDKMethodInterfaces.MethodCallDeleteConnection sdk;

    public DeleteConnectionRequestBuilder(SDKMethodInterfaces.MethodCallDeleteConnection sdk) {
        this.sdk = sdk;
    }

    public DeleteConnectionRequestBuilder request(DeleteConnectionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public DeleteConnectionResponse call() throws Exception {

        return sdk.deleteConnection(
            request);
    }
}

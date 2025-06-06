/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.operations;

import com.airbyte.api.utils.Utils;
import java.lang.Exception;

public class UpdateSourceDefinitionRequestBuilder {

    private UpdateSourceDefinitionRequest request;
    private final SDKMethodInterfaces.MethodCallUpdateSourceDefinition sdk;

    public UpdateSourceDefinitionRequestBuilder(SDKMethodInterfaces.MethodCallUpdateSourceDefinition sdk) {
        this.sdk = sdk;
    }

    public UpdateSourceDefinitionRequestBuilder request(UpdateSourceDefinitionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateSourceDefinitionResponse call() throws Exception {

        return sdk.updateSourceDefinition(
            request);
    }
}

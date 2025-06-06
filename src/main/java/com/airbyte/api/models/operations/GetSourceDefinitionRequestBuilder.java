/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.operations;

import com.airbyte.api.utils.Utils;
import java.lang.Exception;

public class GetSourceDefinitionRequestBuilder {

    private GetSourceDefinitionRequest request;
    private final SDKMethodInterfaces.MethodCallGetSourceDefinition sdk;

    public GetSourceDefinitionRequestBuilder(SDKMethodInterfaces.MethodCallGetSourceDefinition sdk) {
        this.sdk = sdk;
    }

    public GetSourceDefinitionRequestBuilder request(GetSourceDefinitionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetSourceDefinitionResponse call() throws Exception {

        return sdk.getSourceDefinition(
            request);
    }
}

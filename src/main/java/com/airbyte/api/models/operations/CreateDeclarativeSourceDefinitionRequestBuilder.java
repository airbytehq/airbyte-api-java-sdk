/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.operations;

import com.airbyte.api.utils.Utils;
import java.lang.Exception;

public class CreateDeclarativeSourceDefinitionRequestBuilder {

    private CreateDeclarativeSourceDefinitionRequest request;
    private final SDKMethodInterfaces.MethodCallCreateDeclarativeSourceDefinition sdk;

    public CreateDeclarativeSourceDefinitionRequestBuilder(SDKMethodInterfaces.MethodCallCreateDeclarativeSourceDefinition sdk) {
        this.sdk = sdk;
    }

    public CreateDeclarativeSourceDefinitionRequestBuilder request(CreateDeclarativeSourceDefinitionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateDeclarativeSourceDefinitionResponse call() throws Exception {

        return sdk.createDeclarativeSourceDefinition(
            request);
    }
}

/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.operations;

import com.airbyte.api.utils.Utils;
import java.lang.Exception;

public class ListSourceDefinitionsRequestBuilder {

    private ListSourceDefinitionsRequest request;
    private final SDKMethodInterfaces.MethodCallListSourceDefinitions sdk;

    public ListSourceDefinitionsRequestBuilder(SDKMethodInterfaces.MethodCallListSourceDefinitions sdk) {
        this.sdk = sdk;
    }

    public ListSourceDefinitionsRequestBuilder request(ListSourceDefinitionsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListSourceDefinitionsResponse call() throws Exception {

        return sdk.listSourceDefinitions(
            request);
    }
}

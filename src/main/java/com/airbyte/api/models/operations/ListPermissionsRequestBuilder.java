/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.operations;

import com.airbyte.api.utils.Utils;
import java.lang.Exception;

public class ListPermissionsRequestBuilder {

    private ListPermissionsRequest request;
    private final SDKMethodInterfaces.MethodCallListPermissions sdk;

    public ListPermissionsRequestBuilder(SDKMethodInterfaces.MethodCallListPermissions sdk) {
        this.sdk = sdk;
    }

    public ListPermissionsRequestBuilder request(ListPermissionsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListPermissionsResponse call() throws Exception {

        return sdk.listPermissions(
            request);
    }
}

/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import com.airbyte.api.models.shared.PermissionCreateRequest;
import com.airbyte.api.utils.Utils;

public class CreatePermissionRequestBuilder {

    private PermissionCreateRequest request;
    private final SDKMethodInterfaces.MethodCallCreatePermission sdk;

    public CreatePermissionRequestBuilder(SDKMethodInterfaces.MethodCallCreatePermission sdk) {
        this.sdk = sdk;
    }

    public CreatePermissionRequestBuilder request(com.airbyte.api.models.shared.PermissionCreateRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreatePermissionResponse call() throws Exception {

        return sdk.createPermission(
            request);
    }
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import com.airbyte.api.models.errors.SDKError;
import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


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

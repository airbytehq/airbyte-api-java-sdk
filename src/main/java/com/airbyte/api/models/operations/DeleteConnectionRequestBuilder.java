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
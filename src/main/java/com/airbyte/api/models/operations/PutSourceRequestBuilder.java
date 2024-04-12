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


public class PutSourceRequestBuilder {

    private PutSourceRequest request;
    private final SDKMethodInterfaces.MethodCallPutSource sdk;

    public PutSourceRequestBuilder(SDKMethodInterfaces.MethodCallPutSource sdk) {
        this.sdk = sdk;
    }

    public PutSourceRequestBuilder request(PutSourceRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PutSourceResponse call() throws Exception {

        return sdk.putSource(
            request);
    }
}

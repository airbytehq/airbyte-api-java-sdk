/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum ZohoAnalyticsMetadataApi {
    ZOHO_ANALYTICS_METADATA_API("zoho-analytics-metadata-api");

    @JsonValue
    private final String value;

    private ZohoAnalyticsMetadataApi(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ZohoAnalyticsMetadataApi> fromValue(String value) {
        for (ZohoAnalyticsMetadataApi o: ZohoAnalyticsMetadataApi.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
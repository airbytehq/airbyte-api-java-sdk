/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceZuoraTenantEndpointLocation - Please choose the right endpoint where your Tenant is located. More info by this &lt;a href="https://www.zuora.com/developer/api-reference/#section/Introduction/Access-to-the-API"&gt;Link&lt;/a&gt;
 */
public enum SourceZuoraTenantEndpointLocation {
    US_PRODUCTION("US Production"),
    US_CLOUD_PRODUCTION("US Cloud Production"),
    USAPI_SANDBOX("US API Sandbox"),
    US_CLOUD_API_SANDBOX("US Cloud API Sandbox"),
    US_CENTRAL_SANDBOX("US Central Sandbox"),
    US_PERFORMANCE_TEST("US Performance Test"),
    EU_PRODUCTION("EU Production"),
    EUAPI_SANDBOX("EU API Sandbox"),
    EU_CENTRAL_SANDBOX("EU Central Sandbox");

    @JsonValue
    public final String value;

    private SourceZuoraTenantEndpointLocation(String value) {
        this.value = value;
    }
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceTiktokMarketingCredentialsSandboxAccessToken - Authentication method
 */

public class SourceTiktokMarketingCredentialsSandboxAccessToken {
    /**
     * The long-term authorized access token.
     */
    @JsonProperty("access_token")
    public String accessToken;

    public SourceTiktokMarketingCredentialsSandboxAccessToken withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    /**
     * The Advertiser ID which generated for the developer's Sandbox application.
     */
    @JsonProperty("advertiser_id")
    public String advertiserId;

    public SourceTiktokMarketingCredentialsSandboxAccessToken withAdvertiserId(String advertiserId) {
        this.advertiserId = advertiserId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public SourceTiktokMarketingCredentialsSandboxAccessTokenAuthType authType;

    public SourceTiktokMarketingCredentialsSandboxAccessToken withAuthType(SourceTiktokMarketingCredentialsSandboxAccessTokenAuthType authType) {
        this.authType = authType;
        return this;
    }
    
    public SourceTiktokMarketingCredentialsSandboxAccessToken(@JsonProperty("access_token") String accessToken, @JsonProperty("advertiser_id") String advertiserId) {
        this.accessToken = accessToken;
        this.advertiserId = advertiserId;
  }
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class SandboxAccessToken {

    /**
     * The long-term authorized access token.
     */
    @JsonProperty("access_token")
    private String accessToken;

    /**
     * The Advertiser ID which generated for the developer's Sandbox application.
     */
    @JsonProperty("advertiser_id")
    private String advertiserId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends SourceTiktokMarketingSchemasAuthType> authType;

    public SandboxAccessToken(
            @JsonProperty("access_token") String accessToken,
            @JsonProperty("advertiser_id") String advertiserId) {
        Utils.checkNotNull(accessToken, "accessToken");
        Utils.checkNotNull(advertiserId, "advertiserId");
        this.accessToken = accessToken;
        this.advertiserId = advertiserId;
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
    }

    /**
     * The long-term authorized access token.
     */
    public String accessToken() {
        return accessToken;
    }

    /**
     * The Advertiser ID which generated for the developer's Sandbox application.
     */
    public String advertiserId() {
        return advertiserId;
    }

    public Optional<? extends SourceTiktokMarketingSchemasAuthType> authType() {
        return authType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The long-term authorized access token.
     */
    public SandboxAccessToken withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    /**
     * The Advertiser ID which generated for the developer's Sandbox application.
     */
    public SandboxAccessToken withAdvertiserId(String advertiserId) {
        Utils.checkNotNull(advertiserId, "advertiserId");
        this.advertiserId = advertiserId;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SandboxAccessToken other = (SandboxAccessToken) o;
        return 
            java.util.Objects.deepEquals(this.accessToken, other.accessToken) &&
            java.util.Objects.deepEquals(this.advertiserId, other.advertiserId) &&
            java.util.Objects.deepEquals(this.authType, other.authType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accessToken,
            advertiserId,
            authType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SandboxAccessToken.class,
                "accessToken", accessToken,
                "advertiserId", advertiserId,
                "authType", authType);
    }
    
    public final static class Builder {
 
        private String accessToken;
 
        private String advertiserId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The long-term authorized access token.
         */
        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }

        /**
         * The Advertiser ID which generated for the developer's Sandbox application.
         */
        public Builder advertiserId(String advertiserId) {
            Utils.checkNotNull(advertiserId, "advertiserId");
            this.advertiserId = advertiserId;
            return this;
        }
        
        public SandboxAccessToken build() {
            return new SandboxAccessToken(
                accessToken,
                advertiserId);
        }

        private static final LazySingletonValue<Optional<? extends SourceTiktokMarketingSchemasAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"sandbox_access_token\"",
                        new TypeReference<Optional<? extends SourceTiktokMarketingSchemasAuthType>>() {});
    }
}


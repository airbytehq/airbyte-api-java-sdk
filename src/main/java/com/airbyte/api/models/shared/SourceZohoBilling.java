/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;


import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SourceZohoBilling {

    @JsonProperty("client_id")
    private String clientId;

    @JsonProperty("client_secret")
    private String clientSecret;

    @JsonProperty("refresh_token")
    private String refreshToken;

    @JsonProperty("region")
    private SourceZohoBillingRegion region;

    @JsonProperty("sourceType")
    private ZohoBilling sourceType;

    @JsonCreator
    public SourceZohoBilling(
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("refresh_token") String refreshToken,
            @JsonProperty("region") SourceZohoBillingRegion region) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(refreshToken, "refreshToken");
        Utils.checkNotNull(region, "region");
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
        this.region = region;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    @JsonIgnore
    public String refreshToken() {
        return refreshToken;
    }

    @JsonIgnore
    public SourceZohoBillingRegion region() {
        return region;
    }

    @JsonIgnore
    public ZohoBilling sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceZohoBilling withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    public SourceZohoBilling withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    public SourceZohoBilling withRefreshToken(String refreshToken) {
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.refreshToken = refreshToken;
        return this;
    }

    public SourceZohoBilling withRegion(SourceZohoBillingRegion region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
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
        SourceZohoBilling other = (SourceZohoBilling) o;
        return 
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            Objects.deepEquals(this.refreshToken, other.refreshToken) &&
            Objects.deepEquals(this.region, other.region) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            clientId,
            clientSecret,
            refreshToken,
            region,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceZohoBilling.class,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "refreshToken", refreshToken,
                "region", region,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String clientId;
 
        private String clientSecret;
 
        private String refreshToken;
 
        private SourceZohoBillingRegion region;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder refreshToken(String refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = refreshToken;
            return this;
        }

        public Builder region(SourceZohoBillingRegion region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }
        
        public SourceZohoBilling build() {
            return new SourceZohoBilling(
                clientId,
                clientSecret,
                refreshToken,
                region);
        }

        private static final LazySingletonValue<ZohoBilling> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"zoho-billing\"",
                        new TypeReference<ZohoBilling>() {});
    }
}

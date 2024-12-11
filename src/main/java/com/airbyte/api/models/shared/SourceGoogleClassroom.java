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


public class SourceGoogleClassroom {

    @JsonProperty("client_id")
    private String clientId;

    @JsonProperty("client_refresh_token")
    private String clientRefreshToken;

    @JsonProperty("client_secret")
    private String clientSecret;

    @JsonProperty("sourceType")
    private GoogleClassroom sourceType;

    @JsonCreator
    public SourceGoogleClassroom(
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_refresh_token") String clientRefreshToken,
            @JsonProperty("client_secret") String clientSecret) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientRefreshToken, "clientRefreshToken");
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientId = clientId;
        this.clientRefreshToken = clientRefreshToken;
        this.clientSecret = clientSecret;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    @JsonIgnore
    public String clientRefreshToken() {
        return clientRefreshToken;
    }

    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    @JsonIgnore
    public GoogleClassroom sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceGoogleClassroom withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    public SourceGoogleClassroom withClientRefreshToken(String clientRefreshToken) {
        Utils.checkNotNull(clientRefreshToken, "clientRefreshToken");
        this.clientRefreshToken = clientRefreshToken;
        return this;
    }

    public SourceGoogleClassroom withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
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
        SourceGoogleClassroom other = (SourceGoogleClassroom) o;
        return 
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.clientRefreshToken, other.clientRefreshToken) &&
            Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            clientId,
            clientRefreshToken,
            clientSecret,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleClassroom.class,
                "clientId", clientId,
                "clientRefreshToken", clientRefreshToken,
                "clientSecret", clientSecret,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String clientId;
 
        private String clientRefreshToken;
 
        private String clientSecret;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        public Builder clientRefreshToken(String clientRefreshToken) {
            Utils.checkNotNull(clientRefreshToken, "clientRefreshToken");
            this.clientRefreshToken = clientRefreshToken;
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }
        
        public SourceGoogleClassroom build() {
            return new SourceGoogleClassroom(
                clientId,
                clientRefreshToken,
                clientSecret);
        }

        private static final LazySingletonValue<GoogleClassroom> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"google-classroom\"",
                        new TypeReference<GoogleClassroom>() {});
    }
}


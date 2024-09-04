/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;


import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class SourceGoogleDriveAuthenticateViaGoogleOAuth {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends SourceGoogleDriveAuthType> authType;

    /**
     * Client ID for the Google Drive API
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * Client Secret for the Google Drive API
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    /**
     * Refresh Token for the Google Drive API
     */
    @JsonProperty("refresh_token")
    private String refreshToken;

    @JsonCreator
    public SourceGoogleDriveAuthenticateViaGoogleOAuth(
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("refresh_token") String refreshToken) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceGoogleDriveAuthType> authType() {
        return (Optional<SourceGoogleDriveAuthType>) authType;
    }

    /**
     * Client ID for the Google Drive API
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * Client Secret for the Google Drive API
     */
    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    /**
     * Refresh Token for the Google Drive API
     */
    @JsonIgnore
    public String refreshToken() {
        return refreshToken;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Client ID for the Google Drive API
     */
    public SourceGoogleDriveAuthenticateViaGoogleOAuth withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * Client Secret for the Google Drive API
     */
    public SourceGoogleDriveAuthenticateViaGoogleOAuth withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Refresh Token for the Google Drive API
     */
    public SourceGoogleDriveAuthenticateViaGoogleOAuth withRefreshToken(String refreshToken) {
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.refreshToken = refreshToken;
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
        SourceGoogleDriveAuthenticateViaGoogleOAuth other = (SourceGoogleDriveAuthenticateViaGoogleOAuth) o;
        return 
            Objects.deepEquals(this.authType, other.authType) &&
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            Objects.deepEquals(this.refreshToken, other.refreshToken);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            authType,
            clientId,
            clientSecret,
            refreshToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleDriveAuthenticateViaGoogleOAuth.class,
                "authType", authType,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "refreshToken", refreshToken);
    }
    
    public final static class Builder {
 
        private String clientId;
 
        private String clientSecret;
 
        private String refreshToken;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Client ID for the Google Drive API
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * Client Secret for the Google Drive API
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * Refresh Token for the Google Drive API
         */
        public Builder refreshToken(String refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = refreshToken;
            return this;
        }
        
        public SourceGoogleDriveAuthenticateViaGoogleOAuth build() {
            return new SourceGoogleDriveAuthenticateViaGoogleOAuth(
                clientId,
                clientSecret,
                refreshToken);
        }

        private static final LazySingletonValue<Optional<? extends SourceGoogleDriveAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"Client\"",
                        new TypeReference<Optional<? extends SourceGoogleDriveAuthType>>() {});
    }
}


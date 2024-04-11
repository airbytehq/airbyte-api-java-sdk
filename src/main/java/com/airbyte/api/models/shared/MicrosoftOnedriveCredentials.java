/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

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


public class MicrosoftOnedriveCredentials {

    /**
     * Client ID of your Microsoft developer application
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")
    private Optional<? extends String> clientId;

    /**
     * Client Secret of your Microsoft developer application
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    private Optional<? extends String> clientSecret;

    public MicrosoftOnedriveCredentials(
            @JsonProperty("client_id") Optional<? extends String> clientId,
            @JsonProperty("client_secret") Optional<? extends String> clientSecret) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    /**
     * Client ID of your Microsoft developer application
     */
    public Optional<? extends String> clientId() {
        return clientId;
    }

    /**
     * Client Secret of your Microsoft developer application
     */
    public Optional<? extends String> clientSecret() {
        return clientSecret;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Client ID of your Microsoft developer application
     */
    public MicrosoftOnedriveCredentials withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = Optional.ofNullable(clientId);
        return this;
    }

    /**
     * Client ID of your Microsoft developer application
     */
    public MicrosoftOnedriveCredentials withClientId(Optional<? extends String> clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * Client Secret of your Microsoft developer application
     */
    public MicrosoftOnedriveCredentials withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = Optional.ofNullable(clientSecret);
        return this;
    }

    /**
     * Client Secret of your Microsoft developer application
     */
    public MicrosoftOnedriveCredentials withClientSecret(Optional<? extends String> clientSecret) {
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
        MicrosoftOnedriveCredentials other = (MicrosoftOnedriveCredentials) o;
        return 
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.clientSecret, other.clientSecret);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            clientId,
            clientSecret);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MicrosoftOnedriveCredentials.class,
                "clientId", clientId,
                "clientSecret", clientSecret);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> clientId = Optional.empty();
 
        private Optional<? extends String> clientSecret = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Client ID of your Microsoft developer application
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = Optional.ofNullable(clientId);
            return this;
        }

        /**
         * Client ID of your Microsoft developer application
         */
        public Builder clientId(Optional<? extends String> clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * Client Secret of your Microsoft developer application
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = Optional.ofNullable(clientSecret);
            return this;
        }

        /**
         * Client Secret of your Microsoft developer application
         */
        public Builder clientSecret(Optional<? extends String> clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }
        
        public MicrosoftOnedriveCredentials build() {
            return new MicrosoftOnedriveCredentials(
                clientId,
                clientSecret);
        }
    }
}


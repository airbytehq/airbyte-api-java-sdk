/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;


import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class GoogleAnalyticsDataApiCredentials {

    /**
     * The Client ID of your Google Analytics developer application.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")
    private Optional<String> clientId;

    /**
     * The Client Secret of your Google Analytics developer application.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    private Optional<String> clientSecret;

    @JsonCreator
    public GoogleAnalyticsDataApiCredentials(
            @JsonProperty("client_id") Optional<String> clientId,
            @JsonProperty("client_secret") Optional<String> clientSecret) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }
    
    public GoogleAnalyticsDataApiCredentials() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * The Client ID of your Google Analytics developer application.
     */
    @JsonIgnore
    public Optional<String> clientId() {
        return clientId;
    }

    /**
     * The Client Secret of your Google Analytics developer application.
     */
    @JsonIgnore
    public Optional<String> clientSecret() {
        return clientSecret;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Client ID of your Google Analytics developer application.
     */
    public GoogleAnalyticsDataApiCredentials withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = Optional.ofNullable(clientId);
        return this;
    }

    /**
     * The Client ID of your Google Analytics developer application.
     */
    public GoogleAnalyticsDataApiCredentials withClientId(Optional<String> clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The Client Secret of your Google Analytics developer application.
     */
    public GoogleAnalyticsDataApiCredentials withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = Optional.ofNullable(clientSecret);
        return this;
    }

    /**
     * The Client Secret of your Google Analytics developer application.
     */
    public GoogleAnalyticsDataApiCredentials withClientSecret(Optional<String> clientSecret) {
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
        GoogleAnalyticsDataApiCredentials other = (GoogleAnalyticsDataApiCredentials) o;
        return 
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.clientSecret, other.clientSecret);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            clientId,
            clientSecret);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GoogleAnalyticsDataApiCredentials.class,
                "clientId", clientId,
                "clientSecret", clientSecret);
    }
    
    public final static class Builder {
 
        private Optional<String> clientId = Optional.empty();
 
        private Optional<String> clientSecret = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Client ID of your Google Analytics developer application.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = Optional.ofNullable(clientId);
            return this;
        }

        /**
         * The Client ID of your Google Analytics developer application.
         */
        public Builder clientId(Optional<String> clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * The Client Secret of your Google Analytics developer application.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = Optional.ofNullable(clientSecret);
            return this;
        }

        /**
         * The Client Secret of your Google Analytics developer application.
         */
        public Builder clientSecret(Optional<String> clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }
        
        public GoogleAnalyticsDataApiCredentials build() {
            return new GoogleAnalyticsDataApiCredentials(
                clientId,
                clientSecret);
        }
    }
}


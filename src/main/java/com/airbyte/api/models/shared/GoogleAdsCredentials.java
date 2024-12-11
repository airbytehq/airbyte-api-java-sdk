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


public class GoogleAdsCredentials {

    /**
     * The Client ID of your Google Ads developer application. For detailed instructions on finding this value, refer to our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;documentation&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")
    private Optional<String> clientId;

    /**
     * The Client Secret of your Google Ads developer application. For detailed instructions on finding this value, refer to our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;documentation&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    private Optional<String> clientSecret;

    /**
     * The Developer Token granted by Google to use their APIs. For detailed instructions on finding this value, refer to our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;documentation&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("developer_token")
    private Optional<String> developerToken;

    @JsonCreator
    public GoogleAdsCredentials(
            @JsonProperty("client_id") Optional<String> clientId,
            @JsonProperty("client_secret") Optional<String> clientSecret,
            @JsonProperty("developer_token") Optional<String> developerToken) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(developerToken, "developerToken");
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.developerToken = developerToken;
    }
    
    public GoogleAdsCredentials() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The Client ID of your Google Ads developer application. For detailed instructions on finding this value, refer to our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;documentation&lt;/a&gt;.
     */
    @JsonIgnore
    public Optional<String> clientId() {
        return clientId;
    }

    /**
     * The Client Secret of your Google Ads developer application. For detailed instructions on finding this value, refer to our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;documentation&lt;/a&gt;.
     */
    @JsonIgnore
    public Optional<String> clientSecret() {
        return clientSecret;
    }

    /**
     * The Developer Token granted by Google to use their APIs. For detailed instructions on finding this value, refer to our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;documentation&lt;/a&gt;.
     */
    @JsonIgnore
    public Optional<String> developerToken() {
        return developerToken;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Client ID of your Google Ads developer application. For detailed instructions on finding this value, refer to our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;documentation&lt;/a&gt;.
     */
    public GoogleAdsCredentials withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = Optional.ofNullable(clientId);
        return this;
    }

    /**
     * The Client ID of your Google Ads developer application. For detailed instructions on finding this value, refer to our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;documentation&lt;/a&gt;.
     */
    public GoogleAdsCredentials withClientId(Optional<String> clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The Client Secret of your Google Ads developer application. For detailed instructions on finding this value, refer to our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;documentation&lt;/a&gt;.
     */
    public GoogleAdsCredentials withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = Optional.ofNullable(clientSecret);
        return this;
    }

    /**
     * The Client Secret of your Google Ads developer application. For detailed instructions on finding this value, refer to our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;documentation&lt;/a&gt;.
     */
    public GoogleAdsCredentials withClientSecret(Optional<String> clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * The Developer Token granted by Google to use their APIs. For detailed instructions on finding this value, refer to our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;documentation&lt;/a&gt;.
     */
    public GoogleAdsCredentials withDeveloperToken(String developerToken) {
        Utils.checkNotNull(developerToken, "developerToken");
        this.developerToken = Optional.ofNullable(developerToken);
        return this;
    }

    /**
     * The Developer Token granted by Google to use their APIs. For detailed instructions on finding this value, refer to our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;documentation&lt;/a&gt;.
     */
    public GoogleAdsCredentials withDeveloperToken(Optional<String> developerToken) {
        Utils.checkNotNull(developerToken, "developerToken");
        this.developerToken = developerToken;
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
        GoogleAdsCredentials other = (GoogleAdsCredentials) o;
        return 
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            Objects.deepEquals(this.developerToken, other.developerToken);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            clientId,
            clientSecret,
            developerToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GoogleAdsCredentials.class,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "developerToken", developerToken);
    }
    
    public final static class Builder {
 
        private Optional<String> clientId = Optional.empty();
 
        private Optional<String> clientSecret = Optional.empty();
 
        private Optional<String> developerToken = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Client ID of your Google Ads developer application. For detailed instructions on finding this value, refer to our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;documentation&lt;/a&gt;.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = Optional.ofNullable(clientId);
            return this;
        }

        /**
         * The Client ID of your Google Ads developer application. For detailed instructions on finding this value, refer to our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;documentation&lt;/a&gt;.
         */
        public Builder clientId(Optional<String> clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * The Client Secret of your Google Ads developer application. For detailed instructions on finding this value, refer to our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;documentation&lt;/a&gt;.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = Optional.ofNullable(clientSecret);
            return this;
        }

        /**
         * The Client Secret of your Google Ads developer application. For detailed instructions on finding this value, refer to our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;documentation&lt;/a&gt;.
         */
        public Builder clientSecret(Optional<String> clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * The Developer Token granted by Google to use their APIs. For detailed instructions on finding this value, refer to our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;documentation&lt;/a&gt;.
         */
        public Builder developerToken(String developerToken) {
            Utils.checkNotNull(developerToken, "developerToken");
            this.developerToken = Optional.ofNullable(developerToken);
            return this;
        }

        /**
         * The Developer Token granted by Google to use their APIs. For detailed instructions on finding this value, refer to our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;documentation&lt;/a&gt;.
         */
        public Builder developerToken(Optional<String> developerToken) {
            Utils.checkNotNull(developerToken, "developerToken");
            this.developerToken = developerToken;
            return this;
        }
        
        public GoogleAdsCredentials build() {
            return new GoogleAdsCredentials(
                clientId,
                clientSecret,
                developerToken);
        }
    }
}


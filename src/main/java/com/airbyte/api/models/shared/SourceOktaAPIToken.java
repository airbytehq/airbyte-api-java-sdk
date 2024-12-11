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


public class SourceOktaAPIToken {

    /**
     * An Okta token. See the &lt;a href="https://docs.airbyte.com/integrations/sources/okta"&gt;docs&lt;/a&gt; for instructions on how to generate it.
     */
    @JsonProperty("api_token")
    private String apiToken;

    @JsonProperty("auth_type")
    private SourceOktaSchemasCredentialsAuthType authType;

    @JsonCreator
    public SourceOktaAPIToken(
            @JsonProperty("api_token") String apiToken) {
        Utils.checkNotNull(apiToken, "apiToken");
        this.apiToken = apiToken;
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
    }

    /**
     * An Okta token. See the &lt;a href="https://docs.airbyte.com/integrations/sources/okta"&gt;docs&lt;/a&gt; for instructions on how to generate it.
     */
    @JsonIgnore
    public String apiToken() {
        return apiToken;
    }

    @JsonIgnore
    public SourceOktaSchemasCredentialsAuthType authType() {
        return authType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * An Okta token. See the &lt;a href="https://docs.airbyte.com/integrations/sources/okta"&gt;docs&lt;/a&gt; for instructions on how to generate it.
     */
    public SourceOktaAPIToken withApiToken(String apiToken) {
        Utils.checkNotNull(apiToken, "apiToken");
        this.apiToken = apiToken;
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
        SourceOktaAPIToken other = (SourceOktaAPIToken) o;
        return 
            Objects.deepEquals(this.apiToken, other.apiToken) &&
            Objects.deepEquals(this.authType, other.authType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiToken,
            authType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceOktaAPIToken.class,
                "apiToken", apiToken,
                "authType", authType);
    }
    
    public final static class Builder {
 
        private String apiToken;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * An Okta token. See the &lt;a href="https://docs.airbyte.com/integrations/sources/okta"&gt;docs&lt;/a&gt; for instructions on how to generate it.
         */
        public Builder apiToken(String apiToken) {
            Utils.checkNotNull(apiToken, "apiToken");
            this.apiToken = apiToken;
            return this;
        }
        
        public SourceOktaAPIToken build() {
            return new SourceOktaAPIToken(
                apiToken);
        }

        private static final LazySingletonValue<SourceOktaSchemasCredentialsAuthType> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"api_token\"",
                        new TypeReference<SourceOktaSchemasCredentialsAuthType>() {});
    }
}


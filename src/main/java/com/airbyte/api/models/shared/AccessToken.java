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


public class AccessToken {

    /**
     * Drift Access Token. See the &lt;a href="https://docs.airbyte.com/integrations/sources/drift"&gt;docs&lt;/a&gt; for more information on how to generate this key.
     */
    @JsonProperty("access_token")
    private String accessToken;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    private Optional<? extends SourceDriftSchemasCredentials> credentials;

    @JsonCreator
    public AccessToken(
            @JsonProperty("access_token") String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        this.credentials = Builder._SINGLETON_VALUE_Credentials.value();
    }

    /**
     * Drift Access Token. See the &lt;a href="https://docs.airbyte.com/integrations/sources/drift"&gt;docs&lt;/a&gt; for more information on how to generate this key.
     */
    @JsonIgnore
    public String accessToken() {
        return accessToken;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceDriftSchemasCredentials> credentials() {
        return (Optional<SourceDriftSchemasCredentials>) credentials;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Drift Access Token. See the &lt;a href="https://docs.airbyte.com/integrations/sources/drift"&gt;docs&lt;/a&gt; for more information on how to generate this key.
     */
    public AccessToken withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
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
        AccessToken other = (AccessToken) o;
        return 
            Objects.deepEquals(this.accessToken, other.accessToken) &&
            Objects.deepEquals(this.credentials, other.credentials);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accessToken,
            credentials);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccessToken.class,
                "accessToken", accessToken,
                "credentials", credentials);
    }
    
    public final static class Builder {
 
        private String accessToken;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Drift Access Token. See the &lt;a href="https://docs.airbyte.com/integrations/sources/drift"&gt;docs&lt;/a&gt; for more information on how to generate this key.
         */
        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }
        
        public AccessToken build() {
            return new AccessToken(
                accessToken);
        }

        private static final LazySingletonValue<Optional<? extends SourceDriftSchemasCredentials>> _SINGLETON_VALUE_Credentials =
                new LazySingletonValue<>(
                        "credentials",
                        "\"access_token\"",
                        new TypeReference<Optional<? extends SourceDriftSchemasCredentials>>() {});
    }
}


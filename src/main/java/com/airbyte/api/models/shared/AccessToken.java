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
     * The access token generated for your developer application. Refer to our &lt;a href='https://docs.airbyte.com/integrations/sources/linkedin-ads#setup-guide'&gt;documentation&lt;/a&gt; for more information.
     */
    @JsonProperty("access_token")
    private String accessToken;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_method")
    private Optional<? extends SourceLinkedinAdsSchemasAuthMethod> authMethod;

    @JsonCreator
    public AccessToken(
            @JsonProperty("access_token") String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        this.authMethod = Builder._SINGLETON_VALUE_AuthMethod.value();
    }

    /**
     * The access token generated for your developer application. Refer to our &lt;a href='https://docs.airbyte.com/integrations/sources/linkedin-ads#setup-guide'&gt;documentation&lt;/a&gt; for more information.
     */
    @JsonIgnore
    public String accessToken() {
        return accessToken;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceLinkedinAdsSchemasAuthMethod> authMethod() {
        return (Optional<SourceLinkedinAdsSchemasAuthMethod>) authMethod;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The access token generated for your developer application. Refer to our &lt;a href='https://docs.airbyte.com/integrations/sources/linkedin-ads#setup-guide'&gt;documentation&lt;/a&gt; for more information.
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
            Objects.deepEquals(this.authMethod, other.authMethod);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accessToken,
            authMethod);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccessToken.class,
                "accessToken", accessToken,
                "authMethod", authMethod);
    }
    
    public final static class Builder {
 
        private String accessToken;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The access token generated for your developer application. Refer to our &lt;a href='https://docs.airbyte.com/integrations/sources/linkedin-ads#setup-guide'&gt;documentation&lt;/a&gt; for more information.
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

        private static final LazySingletonValue<Optional<? extends SourceLinkedinAdsSchemasAuthMethod>> _SINGLETON_VALUE_AuthMethod =
                new LazySingletonValue<>(
                        "auth_method",
                        "\"access_token\"",
                        new TypeReference<Optional<? extends SourceLinkedinAdsSchemasAuthMethod>>() {});
    }
}


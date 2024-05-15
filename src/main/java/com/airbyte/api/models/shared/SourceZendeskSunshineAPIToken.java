/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class SourceZendeskSunshineAPIToken {

    /**
     * API Token. See the &lt;a href="https://docs.airbyte.com/integrations/sources/zendesk_sunshine"&gt;docs&lt;/a&gt; for information on how to generate this key.
     */
    @JsonProperty("api_token")
    private String apiToken;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_method")
    private Optional<? extends SourceZendeskSunshineSchemasAuthMethod> authMethod;

    /**
     * The user email for your Zendesk account
     */
    @JsonProperty("email")
    private String email;

    @JsonCreator
    public SourceZendeskSunshineAPIToken(
            @JsonProperty("api_token") String apiToken,
            @JsonProperty("email") String email) {
        Utils.checkNotNull(apiToken, "apiToken");
        Utils.checkNotNull(email, "email");
        this.apiToken = apiToken;
        this.authMethod = Builder._SINGLETON_VALUE_AuthMethod.value();
        this.email = email;
    }

    /**
     * API Token. See the &lt;a href="https://docs.airbyte.com/integrations/sources/zendesk_sunshine"&gt;docs&lt;/a&gt; for information on how to generate this key.
     */
    @JsonIgnore
    public String apiToken() {
        return apiToken;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceZendeskSunshineSchemasAuthMethod> authMethod() {
        return (Optional<SourceZendeskSunshineSchemasAuthMethod>) authMethod;
    }

    /**
     * The user email for your Zendesk account
     */
    @JsonIgnore
    public String email() {
        return email;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API Token. See the &lt;a href="https://docs.airbyte.com/integrations/sources/zendesk_sunshine"&gt;docs&lt;/a&gt; for information on how to generate this key.
     */
    public SourceZendeskSunshineAPIToken withApiToken(String apiToken) {
        Utils.checkNotNull(apiToken, "apiToken");
        this.apiToken = apiToken;
        return this;
    }

    /**
     * The user email for your Zendesk account
     */
    public SourceZendeskSunshineAPIToken withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
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
        SourceZendeskSunshineAPIToken other = (SourceZendeskSunshineAPIToken) o;
        return 
            java.util.Objects.deepEquals(this.apiToken, other.apiToken) &&
            java.util.Objects.deepEquals(this.authMethod, other.authMethod) &&
            java.util.Objects.deepEquals(this.email, other.email);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiToken,
            authMethod,
            email);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceZendeskSunshineAPIToken.class,
                "apiToken", apiToken,
                "authMethod", authMethod,
                "email", email);
    }
    
    public final static class Builder {
 
        private String apiToken;
 
        private String email;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API Token. See the &lt;a href="https://docs.airbyte.com/integrations/sources/zendesk_sunshine"&gt;docs&lt;/a&gt; for information on how to generate this key.
         */
        public Builder apiToken(String apiToken) {
            Utils.checkNotNull(apiToken, "apiToken");
            this.apiToken = apiToken;
            return this;
        }

        /**
         * The user email for your Zendesk account
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }
        
        public SourceZendeskSunshineAPIToken build() {
            return new SourceZendeskSunshineAPIToken(
                apiToken,
                email);
        }

        private static final LazySingletonValue<Optional<? extends SourceZendeskSunshineSchemasAuthMethod>> _SINGLETON_VALUE_AuthMethod =
                new LazySingletonValue<>(
                        "auth_method",
                        "\"api_token\"",
                        new TypeReference<Optional<? extends SourceZendeskSunshineSchemasAuthMethod>>() {});
    }
}

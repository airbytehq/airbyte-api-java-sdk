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

public class SourceAirtablePersonalAccessToken {

    /**
     * The Personal Access Token for the Airtable account. See the &lt;a href="https://airtable.com/developers/web/guides/personal-access-tokens"&gt;Support Guide&lt;/a&gt; for more information on how to obtain this token.
     */
    @JsonProperty("api_key")
    private String apiKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_method")
    private Optional<? extends SourceAirtableAuthMethod> authMethod;

    @JsonCreator
    public SourceAirtablePersonalAccessToken(
            @JsonProperty("api_key") String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        this.authMethod = Builder._SINGLETON_VALUE_AuthMethod.value();
    }

    /**
     * The Personal Access Token for the Airtable account. See the &lt;a href="https://airtable.com/developers/web/guides/personal-access-tokens"&gt;Support Guide&lt;/a&gt; for more information on how to obtain this token.
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceAirtableAuthMethod> authMethod() {
        return (Optional<SourceAirtableAuthMethod>) authMethod;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The Personal Access Token for the Airtable account. See the &lt;a href="https://airtable.com/developers/web/guides/personal-access-tokens"&gt;Support Guide&lt;/a&gt; for more information on how to obtain this token.
     */
    public SourceAirtablePersonalAccessToken withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
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
        SourceAirtablePersonalAccessToken other = (SourceAirtablePersonalAccessToken) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.authMethod, other.authMethod);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            authMethod);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceAirtablePersonalAccessToken.class,
                "apiKey", apiKey,
                "authMethod", authMethod);
    }
    
    public final static class Builder {
 
        private String apiKey;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Personal Access Token for the Airtable account. See the &lt;a href="https://airtable.com/developers/web/guides/personal-access-tokens"&gt;Support Guide&lt;/a&gt; for more information on how to obtain this token.
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }
        
        public SourceAirtablePersonalAccessToken build() {
            return new SourceAirtablePersonalAccessToken(
                apiKey);
        }

        private static final LazySingletonValue<Optional<? extends SourceAirtableAuthMethod>> _SINGLETON_VALUE_AuthMethod =
                new LazySingletonValue<>(
                        "auth_method",
                        "\"api_key\"",
                        new TypeReference<Optional<? extends SourceAirtableAuthMethod>>() {});
    }
}

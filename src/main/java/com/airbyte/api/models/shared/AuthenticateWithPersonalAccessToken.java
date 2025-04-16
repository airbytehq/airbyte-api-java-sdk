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

public class AuthenticateWithPersonalAccessToken {

    /**
     * PAT Credentials
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("option_title")
    private Optional<? extends SourceAsanaSchemasCredentialsTitle> optionTitle;

    /**
     * Asana Personal Access Token (generate yours &lt;a href="https://app.asana.com/0/developer-console"&gt;here&lt;/a&gt;).
     */
    @JsonProperty("personal_access_token")
    private String personalAccessToken;

    @JsonCreator
    public AuthenticateWithPersonalAccessToken(
            @JsonProperty("personal_access_token") String personalAccessToken) {
        Utils.checkNotNull(personalAccessToken, "personalAccessToken");
        this.optionTitle = Builder._SINGLETON_VALUE_OptionTitle.value();
        this.personalAccessToken = personalAccessToken;
    }

    /**
     * PAT Credentials
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceAsanaSchemasCredentialsTitle> optionTitle() {
        return (Optional<SourceAsanaSchemasCredentialsTitle>) optionTitle;
    }

    /**
     * Asana Personal Access Token (generate yours &lt;a href="https://app.asana.com/0/developer-console"&gt;here&lt;/a&gt;).
     */
    @JsonIgnore
    public String personalAccessToken() {
        return personalAccessToken;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Asana Personal Access Token (generate yours &lt;a href="https://app.asana.com/0/developer-console"&gt;here&lt;/a&gt;).
     */
    public AuthenticateWithPersonalAccessToken withPersonalAccessToken(String personalAccessToken) {
        Utils.checkNotNull(personalAccessToken, "personalAccessToken");
        this.personalAccessToken = personalAccessToken;
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
        AuthenticateWithPersonalAccessToken other = (AuthenticateWithPersonalAccessToken) o;
        return 
            Objects.deepEquals(this.optionTitle, other.optionTitle) &&
            Objects.deepEquals(this.personalAccessToken, other.personalAccessToken);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            optionTitle,
            personalAccessToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AuthenticateWithPersonalAccessToken.class,
                "optionTitle", optionTitle,
                "personalAccessToken", personalAccessToken);
    }
    
    public final static class Builder {
 
        private String personalAccessToken;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Asana Personal Access Token (generate yours &lt;a href="https://app.asana.com/0/developer-console"&gt;here&lt;/a&gt;).
         */
        public Builder personalAccessToken(String personalAccessToken) {
            Utils.checkNotNull(personalAccessToken, "personalAccessToken");
            this.personalAccessToken = personalAccessToken;
            return this;
        }
        
        public AuthenticateWithPersonalAccessToken build() {
            return new AuthenticateWithPersonalAccessToken(
                personalAccessToken);
        }

        private static final LazySingletonValue<Optional<? extends SourceAsanaSchemasCredentialsTitle>> _SINGLETON_VALUE_OptionTitle =
                new LazySingletonValue<>(
                        "option_title",
                        "\"PAT Credentials\"",
                        new TypeReference<Optional<? extends SourceAsanaSchemasCredentialsTitle>>() {});
    }
}

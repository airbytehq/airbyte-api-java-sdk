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
import java.util.Objects;
import java.util.Optional;


public class SourceOnfleet {

    /**
     * API key to use for authenticating requests. You can create and manage your API keys in the API section of the Onfleet dashboard.
     */
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * Placeholder for basic HTTP auth password - should be set to empty string
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<String> password;

    @JsonProperty("sourceType")
    private Onfleet sourceType;

    @JsonCreator
    public SourceOnfleet(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("password") Optional<String> password) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(password, "password");
        this.apiKey = apiKey;
        this.password = password;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }
    
    public SourceOnfleet(
            String apiKey) {
        this(apiKey, Optional.empty());
    }

    /**
     * API key to use for authenticating requests. You can create and manage your API keys in the API section of the Onfleet dashboard.
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * Placeholder for basic HTTP auth password - should be set to empty string
     */
    @JsonIgnore
    public Optional<String> password() {
        return password;
    }

    @JsonIgnore
    public Onfleet sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API key to use for authenticating requests. You can create and manage your API keys in the API section of the Onfleet dashboard.
     */
    public SourceOnfleet withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Placeholder for basic HTTP auth password - should be set to empty string
     */
    public SourceOnfleet withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    /**
     * Placeholder for basic HTTP auth password - should be set to empty string
     */
    public SourceOnfleet withPassword(Optional<String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
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
        SourceOnfleet other = (SourceOnfleet) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.password, other.password) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            password,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceOnfleet.class,
                "apiKey", apiKey,
                "password", password,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<String> password;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API key to use for authenticating requests. You can create and manage your API keys in the API section of the Onfleet dashboard.
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Placeholder for basic HTTP auth password - should be set to empty string
         */
        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = Optional.ofNullable(password);
            return this;
        }

        /**
         * Placeholder for basic HTTP auth password - should be set to empty string
         */
        public Builder password(Optional<String> password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }
        
        public SourceOnfleet build() {
            if (password == null) {
                password = _SINGLETON_VALUE_Password.value();
            }            return new SourceOnfleet(
                apiKey,
                password);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_Password =
                new LazySingletonValue<>(
                        "password",
                        "\"x\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<Onfleet> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"onfleet\"",
                        new TypeReference<Onfleet>() {});
    }
}

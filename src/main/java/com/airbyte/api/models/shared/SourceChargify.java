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

public class SourceChargify {

    /**
     * Maxio Advanced Billing/Chargify API Key.
     */
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * Chargify domain. Normally this domain follows the following format
     */
    @JsonProperty("domain")
    private String domain;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<String> password;

    @JsonProperty("sourceType")
    private Chargify sourceType;

    @JsonProperty("username")
    private String username;

    @JsonCreator
    public SourceChargify(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("domain") String domain,
            @JsonProperty("password") Optional<String> password,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(domain, "domain");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(username, "username");
        this.apiKey = apiKey;
        this.domain = domain;
        this.password = password;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.username = username;
    }
    
    public SourceChargify(
            String apiKey,
            String domain,
            String username) {
        this(apiKey, domain, Optional.empty(), username);
    }

    /**
     * Maxio Advanced Billing/Chargify API Key.
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * Chargify domain. Normally this domain follows the following format
     */
    @JsonIgnore
    public String domain() {
        return domain;
    }

    @JsonIgnore
    public Optional<String> password() {
        return password;
    }

    @JsonIgnore
    public Chargify sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Maxio Advanced Billing/Chargify API Key.
     */
    public SourceChargify withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Chargify domain. Normally this domain follows the following format
     */
    public SourceChargify withDomain(String domain) {
        Utils.checkNotNull(domain, "domain");
        this.domain = domain;
        return this;
    }

    public SourceChargify withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    public SourceChargify withPassword(Optional<String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    public SourceChargify withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
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
        SourceChargify other = (SourceChargify) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.domain, other.domain) &&
            Objects.deepEquals(this.password, other.password) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            domain,
            password,
            sourceType,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceChargify.class,
                "apiKey", apiKey,
                "domain", domain,
                "password", password,
                "sourceType", sourceType,
                "username", username);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private String domain;
 
        private Optional<String> password = Optional.empty();
 
        private String username;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Maxio Advanced Billing/Chargify API Key.
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Chargify domain. Normally this domain follows the following format
         */
        public Builder domain(String domain) {
            Utils.checkNotNull(domain, "domain");
            this.domain = domain;
            return this;
        }

        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = Optional.ofNullable(password);
            return this;
        }

        public Builder password(Optional<String> password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public SourceChargify build() {
            return new SourceChargify(
                apiKey,
                domain,
                password,
                username);
        }

        private static final LazySingletonValue<Chargify> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"chargify\"",
                        new TypeReference<Chargify>() {});
    }
}

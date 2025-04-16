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

public class SourceGreythr {

    /**
     * https://api.greythr.com
     */
    @JsonProperty("base_url")
    private String baseUrl;

    /**
     * Your GreytHR Host URL
     */
    @JsonProperty("domain")
    private String domain;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<String> password;

    @JsonProperty("sourceType")
    private Greythr sourceType;

    @JsonProperty("username")
    private String username;

    @JsonCreator
    public SourceGreythr(
            @JsonProperty("base_url") String baseUrl,
            @JsonProperty("domain") String domain,
            @JsonProperty("password") Optional<String> password,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(baseUrl, "baseUrl");
        Utils.checkNotNull(domain, "domain");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(username, "username");
        this.baseUrl = baseUrl;
        this.domain = domain;
        this.password = password;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.username = username;
    }
    
    public SourceGreythr(
            String baseUrl,
            String domain,
            String username) {
        this(baseUrl, domain, Optional.empty(), username);
    }

    /**
     * https://api.greythr.com
     */
    @JsonIgnore
    public String baseUrl() {
        return baseUrl;
    }

    /**
     * Your GreytHR Host URL
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
    public Greythr sourceType() {
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
     * https://api.greythr.com
     */
    public SourceGreythr withBaseUrl(String baseUrl) {
        Utils.checkNotNull(baseUrl, "baseUrl");
        this.baseUrl = baseUrl;
        return this;
    }

    /**
     * Your GreytHR Host URL
     */
    public SourceGreythr withDomain(String domain) {
        Utils.checkNotNull(domain, "domain");
        this.domain = domain;
        return this;
    }

    public SourceGreythr withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    public SourceGreythr withPassword(Optional<String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    public SourceGreythr withUsername(String username) {
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
        SourceGreythr other = (SourceGreythr) o;
        return 
            Objects.deepEquals(this.baseUrl, other.baseUrl) &&
            Objects.deepEquals(this.domain, other.domain) &&
            Objects.deepEquals(this.password, other.password) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            baseUrl,
            domain,
            password,
            sourceType,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGreythr.class,
                "baseUrl", baseUrl,
                "domain", domain,
                "password", password,
                "sourceType", sourceType,
                "username", username);
    }
    
    public final static class Builder {
 
        private String baseUrl;
 
        private String domain;
 
        private Optional<String> password = Optional.empty();
 
        private String username;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * https://api.greythr.com
         */
        public Builder baseUrl(String baseUrl) {
            Utils.checkNotNull(baseUrl, "baseUrl");
            this.baseUrl = baseUrl;
            return this;
        }

        /**
         * Your GreytHR Host URL
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
        
        public SourceGreythr build() {
            return new SourceGreythr(
                baseUrl,
                domain,
                password,
                username);
        }

        private static final LazySingletonValue<Greythr> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"greythr\"",
                        new TypeReference<Greythr>() {});
    }
}

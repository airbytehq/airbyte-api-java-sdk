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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

public class SourceTestrail {

    /**
     * The unique domain name for accessing testrail
     */
    @JsonProperty("domain_name")
    private String domainName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<String> password;

    @JsonProperty("sourceType")
    private Testrail sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonProperty("username")
    private String username;

    @JsonCreator
    public SourceTestrail(
            @JsonProperty("domain_name") String domainName,
            @JsonProperty("password") Optional<String> password,
            @JsonProperty("start_date") OffsetDateTime startDate,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(domainName, "domainName");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(username, "username");
        this.domainName = domainName;
        this.password = password;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.username = username;
    }
    
    public SourceTestrail(
            String domainName,
            OffsetDateTime startDate,
            String username) {
        this(domainName, Optional.empty(), startDate, username);
    }

    /**
     * The unique domain name for accessing testrail
     */
    @JsonIgnore
    public String domainName() {
        return domainName;
    }

    @JsonIgnore
    public Optional<String> password() {
        return password;
    }

    @JsonIgnore
    public Testrail sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    @JsonIgnore
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The unique domain name for accessing testrail
     */
    public SourceTestrail withDomainName(String domainName) {
        Utils.checkNotNull(domainName, "domainName");
        this.domainName = domainName;
        return this;
    }

    public SourceTestrail withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    public SourceTestrail withPassword(Optional<String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    public SourceTestrail withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    public SourceTestrail withUsername(String username) {
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
        SourceTestrail other = (SourceTestrail) o;
        return 
            Objects.deepEquals(this.domainName, other.domainName) &&
            Objects.deepEquals(this.password, other.password) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            domainName,
            password,
            sourceType,
            startDate,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceTestrail.class,
                "domainName", domainName,
                "password", password,
                "sourceType", sourceType,
                "startDate", startDate,
                "username", username);
    }
    
    public final static class Builder {
 
        private String domainName;
 
        private Optional<String> password = Optional.empty();
 
        private OffsetDateTime startDate;
 
        private String username;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The unique domain name for accessing testrail
         */
        public Builder domainName(String domainName) {
            Utils.checkNotNull(domainName, "domainName");
            this.domainName = domainName;
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

        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public SourceTestrail build() {
            return new SourceTestrail(
                domainName,
                password,
                startDate,
                username);
        }

        private static final LazySingletonValue<Testrail> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"testrail\"",
                        new TypeReference<Testrail>() {});
    }
}

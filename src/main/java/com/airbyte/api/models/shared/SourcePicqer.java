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

public class SourcePicqer {

    /**
     * The organization name which is used to login to picqer
     */
    @JsonProperty("organization_name")
    private String organizationName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<String> password;

    @JsonProperty("sourceType")
    private Picqer sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonProperty("username")
    private String username;

    @JsonCreator
    public SourcePicqer(
            @JsonProperty("organization_name") String organizationName,
            @JsonProperty("password") Optional<String> password,
            @JsonProperty("start_date") OffsetDateTime startDate,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(organizationName, "organizationName");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(username, "username");
        this.organizationName = organizationName;
        this.password = password;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.username = username;
    }
    
    public SourcePicqer(
            String organizationName,
            OffsetDateTime startDate,
            String username) {
        this(organizationName, Optional.empty(), startDate, username);
    }

    /**
     * The organization name which is used to login to picqer
     */
    @JsonIgnore
    public String organizationName() {
        return organizationName;
    }

    @JsonIgnore
    public Optional<String> password() {
        return password;
    }

    @JsonIgnore
    public Picqer sourceType() {
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
     * The organization name which is used to login to picqer
     */
    public SourcePicqer withOrganizationName(String organizationName) {
        Utils.checkNotNull(organizationName, "organizationName");
        this.organizationName = organizationName;
        return this;
    }

    public SourcePicqer withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    public SourcePicqer withPassword(Optional<String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    public SourcePicqer withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    public SourcePicqer withUsername(String username) {
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
        SourcePicqer other = (SourcePicqer) o;
        return 
            Objects.deepEquals(this.organizationName, other.organizationName) &&
            Objects.deepEquals(this.password, other.password) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            organizationName,
            password,
            sourceType,
            startDate,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourcePicqer.class,
                "organizationName", organizationName,
                "password", password,
                "sourceType", sourceType,
                "startDate", startDate,
                "username", username);
    }
    
    public final static class Builder {
 
        private String organizationName;
 
        private Optional<String> password = Optional.empty();
 
        private OffsetDateTime startDate;
 
        private String username;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The organization name which is used to login to picqer
         */
        public Builder organizationName(String organizationName) {
            Utils.checkNotNull(organizationName, "organizationName");
            this.organizationName = organizationName;
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
        
        public SourcePicqer build() {
            return new SourcePicqer(
                organizationName,
                password,
                startDate,
                username);
        }

        private static final LazySingletonValue<Picqer> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"picqer\"",
                        new TypeReference<Picqer>() {});
    }
}

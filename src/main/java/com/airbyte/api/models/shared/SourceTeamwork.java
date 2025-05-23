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

public class SourceTeamwork {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<String> password;

    /**
     * The teamwork site name appearing at the url
     */
    @JsonProperty("site_name")
    private String siteName;

    @JsonProperty("sourceType")
    private Teamwork sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonProperty("username")
    private String username;

    @JsonCreator
    public SourceTeamwork(
            @JsonProperty("password") Optional<String> password,
            @JsonProperty("site_name") String siteName,
            @JsonProperty("start_date") OffsetDateTime startDate,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(siteName, "siteName");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(username, "username");
        this.password = password;
        this.siteName = siteName;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.username = username;
    }
    
    public SourceTeamwork(
            String siteName,
            OffsetDateTime startDate,
            String username) {
        this(Optional.empty(), siteName, startDate, username);
    }

    @JsonIgnore
    public Optional<String> password() {
        return password;
    }

    /**
     * The teamwork site name appearing at the url
     */
    @JsonIgnore
    public String siteName() {
        return siteName;
    }

    @JsonIgnore
    public Teamwork sourceType() {
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

    public SourceTeamwork withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    public SourceTeamwork withPassword(Optional<String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * The teamwork site name appearing at the url
     */
    public SourceTeamwork withSiteName(String siteName) {
        Utils.checkNotNull(siteName, "siteName");
        this.siteName = siteName;
        return this;
    }

    public SourceTeamwork withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    public SourceTeamwork withUsername(String username) {
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
        SourceTeamwork other = (SourceTeamwork) o;
        return 
            Objects.deepEquals(this.password, other.password) &&
            Objects.deepEquals(this.siteName, other.siteName) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            password,
            siteName,
            sourceType,
            startDate,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceTeamwork.class,
                "password", password,
                "siteName", siteName,
                "sourceType", sourceType,
                "startDate", startDate,
                "username", username);
    }
    
    public final static class Builder {
 
        private Optional<String> password = Optional.empty();
 
        private String siteName;
 
        private OffsetDateTime startDate;
 
        private String username;
        
        private Builder() {
          // force use of static builder() method
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

        /**
         * The teamwork site name appearing at the url
         */
        public Builder siteName(String siteName) {
            Utils.checkNotNull(siteName, "siteName");
            this.siteName = siteName;
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
        
        public SourceTeamwork build() {
            return new SourceTeamwork(
                password,
                siteName,
                startDate,
                username);
        }

        private static final LazySingletonValue<Teamwork> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"teamwork\"",
                        new TypeReference<Teamwork>() {});
    }
}

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


public class SourceCampaignMonitor {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<String> password;

    @JsonProperty("sourceType")
    private CampaignMonitor sourceType;

    /**
     * Date from when the sync should start
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<String> startDate;

    @JsonProperty("username")
    private String username;

    @JsonCreator
    public SourceCampaignMonitor(
            @JsonProperty("password") Optional<String> password,
            @JsonProperty("start_date") Optional<String> startDate,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(username, "username");
        this.password = password;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.username = username;
    }
    
    public SourceCampaignMonitor(
            String username) {
        this(Optional.empty(), Optional.empty(), username);
    }

    @JsonIgnore
    public Optional<String> password() {
        return password;
    }

    @JsonIgnore
    public CampaignMonitor sourceType() {
        return sourceType;
    }

    /**
     * Date from when the sync should start
     */
    @JsonIgnore
    public Optional<String> startDate() {
        return startDate;
    }

    @JsonIgnore
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceCampaignMonitor withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    public SourceCampaignMonitor withPassword(Optional<String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * Date from when the sync should start
     */
    public SourceCampaignMonitor withStartDate(String startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * Date from when the sync should start
     */
    public SourceCampaignMonitor withStartDate(Optional<String> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    public SourceCampaignMonitor withUsername(String username) {
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
        SourceCampaignMonitor other = (SourceCampaignMonitor) o;
        return 
            Objects.deepEquals(this.password, other.password) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            password,
            sourceType,
            startDate,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceCampaignMonitor.class,
                "password", password,
                "sourceType", sourceType,
                "startDate", startDate,
                "username", username);
    }
    
    public final static class Builder {
 
        private Optional<String> password = Optional.empty();
 
        private Optional<String> startDate = Optional.empty();
 
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
         * Date from when the sync should start
         */
        public Builder startDate(String startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * Date from when the sync should start
         */
        public Builder startDate(Optional<String> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public SourceCampaignMonitor build() {
            return new SourceCampaignMonitor(
                password,
                startDate,
                username);
        }

        private static final LazySingletonValue<CampaignMonitor> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"campaign-monitor\"",
                        new TypeReference<CampaignMonitor>() {});
    }
}

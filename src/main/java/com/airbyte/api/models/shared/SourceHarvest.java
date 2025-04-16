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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

public class SourceHarvest {

    /**
     * Harvest account ID. Required for all Harvest requests in pair with Personal Access Token
     */
    @JsonProperty("account_id")
    private String accountId;

    /**
     * Choose how to authenticate to Harvest.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    private Optional<? extends SourceHarvestAuthenticationMechanism> credentials;

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonProperty("replication_start_date")
    private OffsetDateTime replicationStartDate;

    @JsonProperty("sourceType")
    private Harvest sourceType;

    @JsonCreator
    public SourceHarvest(
            @JsonProperty("account_id") String accountId,
            @JsonProperty("credentials") Optional<? extends SourceHarvestAuthenticationMechanism> credentials,
            @JsonProperty("replication_start_date") OffsetDateTime replicationStartDate) {
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(replicationStartDate, "replicationStartDate");
        this.accountId = accountId;
        this.credentials = credentials;
        this.replicationStartDate = replicationStartDate;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }
    
    public SourceHarvest(
            String accountId,
            OffsetDateTime replicationStartDate) {
        this(accountId, Optional.empty(), replicationStartDate);
    }

    /**
     * Harvest account ID. Required for all Harvest requests in pair with Personal Access Token
     */
    @JsonIgnore
    public String accountId() {
        return accountId;
    }

    /**
     * Choose how to authenticate to Harvest.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceHarvestAuthenticationMechanism> credentials() {
        return (Optional<SourceHarvestAuthenticationMechanism>) credentials;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonIgnore
    public OffsetDateTime replicationStartDate() {
        return replicationStartDate;
    }

    @JsonIgnore
    public Harvest sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Harvest account ID. Required for all Harvest requests in pair with Personal Access Token
     */
    public SourceHarvest withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    /**
     * Choose how to authenticate to Harvest.
     */
    public SourceHarvest withCredentials(SourceHarvestAuthenticationMechanism credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = Optional.ofNullable(credentials);
        return this;
    }

    /**
     * Choose how to authenticate to Harvest.
     */
    public SourceHarvest withCredentials(Optional<? extends SourceHarvestAuthenticationMechanism> credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    public SourceHarvest withReplicationStartDate(OffsetDateTime replicationStartDate) {
        Utils.checkNotNull(replicationStartDate, "replicationStartDate");
        this.replicationStartDate = replicationStartDate;
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
        SourceHarvest other = (SourceHarvest) o;
        return 
            Objects.deepEquals(this.accountId, other.accountId) &&
            Objects.deepEquals(this.credentials, other.credentials) &&
            Objects.deepEquals(this.replicationStartDate, other.replicationStartDate) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountId,
            credentials,
            replicationStartDate,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceHarvest.class,
                "accountId", accountId,
                "credentials", credentials,
                "replicationStartDate", replicationStartDate,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String accountId;
 
        private Optional<? extends SourceHarvestAuthenticationMechanism> credentials = Optional.empty();
 
        private OffsetDateTime replicationStartDate;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Harvest account ID. Required for all Harvest requests in pair with Personal Access Token
         */
        public Builder accountId(String accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = accountId;
            return this;
        }

        /**
         * Choose how to authenticate to Harvest.
         */
        public Builder credentials(SourceHarvestAuthenticationMechanism credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = Optional.ofNullable(credentials);
            return this;
        }

        /**
         * Choose how to authenticate to Harvest.
         */
        public Builder credentials(Optional<? extends SourceHarvestAuthenticationMechanism> credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
         */
        public Builder replicationStartDate(OffsetDateTime replicationStartDate) {
            Utils.checkNotNull(replicationStartDate, "replicationStartDate");
            this.replicationStartDate = replicationStartDate;
            return this;
        }
        
        public SourceHarvest build() {
            return new SourceHarvest(
                accountId,
                credentials,
                replicationStartDate);
        }

        private static final LazySingletonValue<Harvest> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"harvest\"",
                        new TypeReference<Harvest>() {});
    }
}

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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;


public class SourcePaystack {

    /**
     * When set, the connector will always reload data from the past N days, where N is the value set here. This is useful if your data is updated after creation.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lookback_window_days")
    private Optional<Long> lookbackWindowDays;

    /**
     * The Paystack API key (usually starts with 'sk_live_'; find yours &lt;a href="https://dashboard.paystack.com/#/settings/developer"&gt;here&lt;/a&gt;).
     */
    @JsonProperty("secret_key")
    private String secretKey;

    @JsonProperty("sourceType")
    private Paystack sourceType;

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonCreator
    public SourcePaystack(
            @JsonProperty("lookback_window_days") Optional<Long> lookbackWindowDays,
            @JsonProperty("secret_key") String secretKey,
            @JsonProperty("start_date") OffsetDateTime startDate) {
        Utils.checkNotNull(lookbackWindowDays, "lookbackWindowDays");
        Utils.checkNotNull(secretKey, "secretKey");
        Utils.checkNotNull(startDate, "startDate");
        this.lookbackWindowDays = lookbackWindowDays;
        this.secretKey = secretKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourcePaystack(
            String secretKey,
            OffsetDateTime startDate) {
        this(Optional.empty(), secretKey, startDate);
    }

    /**
     * When set, the connector will always reload data from the past N days, where N is the value set here. This is useful if your data is updated after creation.
     */
    @JsonIgnore
    public Optional<Long> lookbackWindowDays() {
        return lookbackWindowDays;
    }

    /**
     * The Paystack API key (usually starts with 'sk_live_'; find yours &lt;a href="https://dashboard.paystack.com/#/settings/developer"&gt;here&lt;/a&gt;).
     */
    @JsonIgnore
    public String secretKey() {
        return secretKey;
    }

    @JsonIgnore
    public Paystack sourceType() {
        return sourceType;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * When set, the connector will always reload data from the past N days, where N is the value set here. This is useful if your data is updated after creation.
     */
    public SourcePaystack withLookbackWindowDays(long lookbackWindowDays) {
        Utils.checkNotNull(lookbackWindowDays, "lookbackWindowDays");
        this.lookbackWindowDays = Optional.ofNullable(lookbackWindowDays);
        return this;
    }

    /**
     * When set, the connector will always reload data from the past N days, where N is the value set here. This is useful if your data is updated after creation.
     */
    public SourcePaystack withLookbackWindowDays(Optional<Long> lookbackWindowDays) {
        Utils.checkNotNull(lookbackWindowDays, "lookbackWindowDays");
        this.lookbackWindowDays = lookbackWindowDays;
        return this;
    }

    /**
     * The Paystack API key (usually starts with 'sk_live_'; find yours &lt;a href="https://dashboard.paystack.com/#/settings/developer"&gt;here&lt;/a&gt;).
     */
    public SourcePaystack withSecretKey(String secretKey) {
        Utils.checkNotNull(secretKey, "secretKey");
        this.secretKey = secretKey;
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    public SourcePaystack withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
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
        SourcePaystack other = (SourcePaystack) o;
        return 
            Objects.deepEquals(this.lookbackWindowDays, other.lookbackWindowDays) &&
            Objects.deepEquals(this.secretKey, other.secretKey) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            lookbackWindowDays,
            secretKey,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourcePaystack.class,
                "lookbackWindowDays", lookbackWindowDays,
                "secretKey", secretKey,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private Optional<Long> lookbackWindowDays;
 
        private String secretKey;
 
        private OffsetDateTime startDate;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * When set, the connector will always reload data from the past N days, where N is the value set here. This is useful if your data is updated after creation.
         */
        public Builder lookbackWindowDays(long lookbackWindowDays) {
            Utils.checkNotNull(lookbackWindowDays, "lookbackWindowDays");
            this.lookbackWindowDays = Optional.ofNullable(lookbackWindowDays);
            return this;
        }

        /**
         * When set, the connector will always reload data from the past N days, where N is the value set here. This is useful if your data is updated after creation.
         */
        public Builder lookbackWindowDays(Optional<Long> lookbackWindowDays) {
            Utils.checkNotNull(lookbackWindowDays, "lookbackWindowDays");
            this.lookbackWindowDays = lookbackWindowDays;
            return this;
        }

        /**
         * The Paystack API key (usually starts with 'sk_live_'; find yours &lt;a href="https://dashboard.paystack.com/#/settings/developer"&gt;here&lt;/a&gt;).
         */
        public Builder secretKey(String secretKey) {
            Utils.checkNotNull(secretKey, "secretKey");
            this.secretKey = secretKey;
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourcePaystack build() {
            if (lookbackWindowDays == null) {
                lookbackWindowDays = _SINGLETON_VALUE_LookbackWindowDays.value();
            }            return new SourcePaystack(
                lookbackWindowDays,
                secretKey,
                startDate);
        }

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_LookbackWindowDays =
                new LazySingletonValue<>(
                        "lookback_window_days",
                        "0",
                        new TypeReference<Optional<Long>>() {});

        private static final LazySingletonValue<Paystack> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"paystack\"",
                        new TypeReference<Paystack>() {});
    }
}


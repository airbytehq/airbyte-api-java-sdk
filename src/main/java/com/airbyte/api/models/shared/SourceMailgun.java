/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;


public class SourceMailgun {

    /**
     * Domain region code. 'EU' or 'US' are possible values. The default is 'US'.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("domain_region")
    private Optional<? extends String> domainRegion;

    /**
     * Primary account API key to access your Mailgun data.
     */
    @JsonProperty("private_key")
    private String privateKey;

    @JsonProperty("sourceType")
    private Mailgun sourceType;

    /**
     * UTC date and time in the format 2020-10-01 00:00:00. Any data before this date will not be replicated. If omitted, defaults to 3 days ago.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<? extends OffsetDateTime> startDate;

    @JsonCreator
    public SourceMailgun(
            @JsonProperty("domain_region") Optional<? extends String> domainRegion,
            @JsonProperty("private_key") String privateKey,
            @JsonProperty("start_date") Optional<? extends OffsetDateTime> startDate) {
        Utils.checkNotNull(domainRegion, "domainRegion");
        Utils.checkNotNull(privateKey, "privateKey");
        Utils.checkNotNull(startDate, "startDate");
        this.domainRegion = domainRegion;
        this.privateKey = privateKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceMailgun(
            String privateKey) {
        this(Optional.empty(), privateKey, Optional.empty());
    }

    /**
     * Domain region code. 'EU' or 'US' are possible values. The default is 'US'.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> domainRegion() {
        return (Optional<String>) domainRegion;
    }

    /**
     * Primary account API key to access your Mailgun data.
     */
    @JsonIgnore
    public String privateKey() {
        return privateKey;
    }

    @JsonIgnore
    public Mailgun sourceType() {
        return sourceType;
    }

    /**
     * UTC date and time in the format 2020-10-01 00:00:00. Any data before this date will not be replicated. If omitted, defaults to 3 days ago.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> startDate() {
        return (Optional<OffsetDateTime>) startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Domain region code. 'EU' or 'US' are possible values. The default is 'US'.
     */
    public SourceMailgun withDomainRegion(String domainRegion) {
        Utils.checkNotNull(domainRegion, "domainRegion");
        this.domainRegion = Optional.ofNullable(domainRegion);
        return this;
    }

    /**
     * Domain region code. 'EU' or 'US' are possible values. The default is 'US'.
     */
    public SourceMailgun withDomainRegion(Optional<? extends String> domainRegion) {
        Utils.checkNotNull(domainRegion, "domainRegion");
        this.domainRegion = domainRegion;
        return this;
    }

    /**
     * Primary account API key to access your Mailgun data.
     */
    public SourceMailgun withPrivateKey(String privateKey) {
        Utils.checkNotNull(privateKey, "privateKey");
        this.privateKey = privateKey;
        return this;
    }

    /**
     * UTC date and time in the format 2020-10-01 00:00:00. Any data before this date will not be replicated. If omitted, defaults to 3 days ago.
     */
    public SourceMailgun withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * UTC date and time in the format 2020-10-01 00:00:00. Any data before this date will not be replicated. If omitted, defaults to 3 days ago.
     */
    public SourceMailgun withStartDate(Optional<? extends OffsetDateTime> startDate) {
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
        SourceMailgun other = (SourceMailgun) o;
        return 
            java.util.Objects.deepEquals(this.domainRegion, other.domainRegion) &&
            java.util.Objects.deepEquals(this.privateKey, other.privateKey) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            domainRegion,
            privateKey,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMailgun.class,
                "domainRegion", domainRegion,
                "privateKey", privateKey,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> domainRegion;
 
        private String privateKey;
 
        private Optional<? extends OffsetDateTime> startDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Domain region code. 'EU' or 'US' are possible values. The default is 'US'.
         */
        public Builder domainRegion(String domainRegion) {
            Utils.checkNotNull(domainRegion, "domainRegion");
            this.domainRegion = Optional.ofNullable(domainRegion);
            return this;
        }

        /**
         * Domain region code. 'EU' or 'US' are possible values. The default is 'US'.
         */
        public Builder domainRegion(Optional<? extends String> domainRegion) {
            Utils.checkNotNull(domainRegion, "domainRegion");
            this.domainRegion = domainRegion;
            return this;
        }

        /**
         * Primary account API key to access your Mailgun data.
         */
        public Builder privateKey(String privateKey) {
            Utils.checkNotNull(privateKey, "privateKey");
            this.privateKey = privateKey;
            return this;
        }

        /**
         * UTC date and time in the format 2020-10-01 00:00:00. Any data before this date will not be replicated. If omitted, defaults to 3 days ago.
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * UTC date and time in the format 2020-10-01 00:00:00. Any data before this date will not be replicated. If omitted, defaults to 3 days ago.
         */
        public Builder startDate(Optional<? extends OffsetDateTime> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceMailgun build() {
            if (domainRegion == null) {
                domainRegion = _SINGLETON_VALUE_DomainRegion.value();
            }
            return new SourceMailgun(
                domainRegion,
                privateKey,
                startDate);
        }

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_DomainRegion =
                new LazySingletonValue<>(
                        "domain_region",
                        "\"US\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<Mailgun> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"mailgun\"",
                        new TypeReference<Mailgun>() {});
    }
}


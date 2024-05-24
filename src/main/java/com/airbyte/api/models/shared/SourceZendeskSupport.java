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

public class SourceZendeskSupport {

    /**
     * Zendesk allows two authentication methods. We recommend using `OAuth2.0` for Airbyte Cloud users and `API token` for Airbyte Open Source users.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    private Optional<? extends java.lang.Object> credentials;

    /**
     * Makes each stream read a single page of data.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ignore_pagination")
    private Optional<? extends Boolean> ignorePagination;

    @JsonProperty("sourceType")
    private SourceZendeskSupportZendeskSupport sourceType;

    /**
     * The UTC date and time from which you'd like to replicate data, in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<? extends OffsetDateTime> startDate;

    /**
     * This is your unique Zendesk subdomain that can be found in your account URL. For example, in https://MY_SUBDOMAIN.zendesk.com/, MY_SUBDOMAIN is the value of your subdomain.
     */
    @JsonProperty("subdomain")
    private String subdomain;

    @JsonCreator
    public SourceZendeskSupport(
            @JsonProperty("credentials") Optional<? extends java.lang.Object> credentials,
            @JsonProperty("ignore_pagination") Optional<? extends Boolean> ignorePagination,
            @JsonProperty("start_date") Optional<? extends OffsetDateTime> startDate,
            @JsonProperty("subdomain") String subdomain) {
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(ignorePagination, "ignorePagination");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(subdomain, "subdomain");
        this.credentials = credentials;
        this.ignorePagination = ignorePagination;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.subdomain = subdomain;
    }
    
    public SourceZendeskSupport(
            String subdomain) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), subdomain);
    }

    /**
     * Zendesk allows two authentication methods. We recommend using `OAuth2.0` for Airbyte Cloud users and `API token` for Airbyte Open Source users.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.lang.Object> credentials() {
        return (Optional<java.lang.Object>) credentials;
    }

    /**
     * Makes each stream read a single page of data.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> ignorePagination() {
        return (Optional<Boolean>) ignorePagination;
    }

    @JsonIgnore
    public SourceZendeskSupportZendeskSupport sourceType() {
        return sourceType;
    }

    /**
     * The UTC date and time from which you'd like to replicate data, in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> startDate() {
        return (Optional<OffsetDateTime>) startDate;
    }

    /**
     * This is your unique Zendesk subdomain that can be found in your account URL. For example, in https://MY_SUBDOMAIN.zendesk.com/, MY_SUBDOMAIN is the value of your subdomain.
     */
    @JsonIgnore
    public String subdomain() {
        return subdomain;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Zendesk allows two authentication methods. We recommend using `OAuth2.0` for Airbyte Cloud users and `API token` for Airbyte Open Source users.
     */
    public SourceZendeskSupport withCredentials(java.lang.Object credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = Optional.ofNullable(credentials);
        return this;
    }

    /**
     * Zendesk allows two authentication methods. We recommend using `OAuth2.0` for Airbyte Cloud users and `API token` for Airbyte Open Source users.
     */
    public SourceZendeskSupport withCredentials(Optional<? extends java.lang.Object> credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * Makes each stream read a single page of data.
     */
    public SourceZendeskSupport withIgnorePagination(boolean ignorePagination) {
        Utils.checkNotNull(ignorePagination, "ignorePagination");
        this.ignorePagination = Optional.ofNullable(ignorePagination);
        return this;
    }

    /**
     * Makes each stream read a single page of data.
     */
    public SourceZendeskSupport withIgnorePagination(Optional<? extends Boolean> ignorePagination) {
        Utils.checkNotNull(ignorePagination, "ignorePagination");
        this.ignorePagination = ignorePagination;
        return this;
    }

    /**
     * The UTC date and time from which you'd like to replicate data, in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated.
     */
    public SourceZendeskSupport withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * The UTC date and time from which you'd like to replicate data, in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated.
     */
    public SourceZendeskSupport withStartDate(Optional<? extends OffsetDateTime> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * This is your unique Zendesk subdomain that can be found in your account URL. For example, in https://MY_SUBDOMAIN.zendesk.com/, MY_SUBDOMAIN is the value of your subdomain.
     */
    public SourceZendeskSupport withSubdomain(String subdomain) {
        Utils.checkNotNull(subdomain, "subdomain");
        this.subdomain = subdomain;
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
        SourceZendeskSupport other = (SourceZendeskSupport) o;
        return 
            java.util.Objects.deepEquals(this.credentials, other.credentials) &&
            java.util.Objects.deepEquals(this.ignorePagination, other.ignorePagination) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate) &&
            java.util.Objects.deepEquals(this.subdomain, other.subdomain);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            credentials,
            ignorePagination,
            sourceType,
            startDate,
            subdomain);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceZendeskSupport.class,
                "credentials", credentials,
                "ignorePagination", ignorePagination,
                "sourceType", sourceType,
                "startDate", startDate,
                "subdomain", subdomain);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.lang.Object> credentials = Optional.empty();
 
        private Optional<? extends Boolean> ignorePagination;
 
        private Optional<? extends OffsetDateTime> startDate = Optional.empty();
 
        private String subdomain;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Zendesk allows two authentication methods. We recommend using `OAuth2.0` for Airbyte Cloud users and `API token` for Airbyte Open Source users.
         */
        public Builder credentials(java.lang.Object credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = Optional.ofNullable(credentials);
            return this;
        }

        /**
         * Zendesk allows two authentication methods. We recommend using `OAuth2.0` for Airbyte Cloud users and `API token` for Airbyte Open Source users.
         */
        public Builder credentials(Optional<? extends java.lang.Object> credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * Makes each stream read a single page of data.
         */
        public Builder ignorePagination(boolean ignorePagination) {
            Utils.checkNotNull(ignorePagination, "ignorePagination");
            this.ignorePagination = Optional.ofNullable(ignorePagination);
            return this;
        }

        /**
         * Makes each stream read a single page of data.
         */
        public Builder ignorePagination(Optional<? extends Boolean> ignorePagination) {
            Utils.checkNotNull(ignorePagination, "ignorePagination");
            this.ignorePagination = ignorePagination;
            return this;
        }

        /**
         * The UTC date and time from which you'd like to replicate data, in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated.
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * The UTC date and time from which you'd like to replicate data, in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated.
         */
        public Builder startDate(Optional<? extends OffsetDateTime> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * This is your unique Zendesk subdomain that can be found in your account URL. For example, in https://MY_SUBDOMAIN.zendesk.com/, MY_SUBDOMAIN is the value of your subdomain.
         */
        public Builder subdomain(String subdomain) {
            Utils.checkNotNull(subdomain, "subdomain");
            this.subdomain = subdomain;
            return this;
        }
        
        public SourceZendeskSupport build() {
            if (ignorePagination == null) {
                ignorePagination = _SINGLETON_VALUE_IgnorePagination.value();
            }
            return new SourceZendeskSupport(
                credentials,
                ignorePagination,
                startDate,
                subdomain);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_IgnorePagination =
                new LazySingletonValue<>(
                        "ignore_pagination",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<SourceZendeskSupportZendeskSupport> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"zendesk-support\"",
                        new TypeReference<SourceZendeskSupportZendeskSupport>() {});
    }
}


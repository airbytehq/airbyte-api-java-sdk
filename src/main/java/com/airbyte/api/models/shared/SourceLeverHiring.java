/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class SourceLeverHiring {

    /**
     * Choose how to authenticate to Lever Hiring.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    private Optional<? extends SourceLeverHiringAuthenticationMechanism> credentials;

    /**
     * The environment in which you'd like to replicate data for Lever. This is used to determine which Lever API endpoint to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("environment")
    private Optional<? extends SourceLeverHiringEnvironment> environment;

    @JsonProperty("sourceType")
    private SourceLeverHiringLeverHiring sourceType;

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. Note that it will be used only in the following incremental streams: comments, commits, and issues.
     */
    @JsonProperty("start_date")
    private String startDate;

    public SourceLeverHiring(
            @JsonProperty("credentials") Optional<? extends SourceLeverHiringAuthenticationMechanism> credentials,
            @JsonProperty("environment") Optional<? extends SourceLeverHiringEnvironment> environment,
            @JsonProperty("start_date") String startDate) {
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(environment, "environment");
        Utils.checkNotNull(startDate, "startDate");
        this.credentials = credentials;
        this.environment = environment;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }

    /**
     * Choose how to authenticate to Lever Hiring.
     */
    public Optional<? extends SourceLeverHiringAuthenticationMechanism> credentials() {
        return credentials;
    }

    /**
     * The environment in which you'd like to replicate data for Lever. This is used to determine which Lever API endpoint to use.
     */
    public Optional<? extends SourceLeverHiringEnvironment> environment() {
        return environment;
    }

    public SourceLeverHiringLeverHiring sourceType() {
        return sourceType;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. Note that it will be used only in the following incremental streams: comments, commits, and issues.
     */
    public String startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Choose how to authenticate to Lever Hiring.
     */
    public SourceLeverHiring withCredentials(SourceLeverHiringAuthenticationMechanism credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = Optional.ofNullable(credentials);
        return this;
    }

    /**
     * Choose how to authenticate to Lever Hiring.
     */
    public SourceLeverHiring withCredentials(Optional<? extends SourceLeverHiringAuthenticationMechanism> credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * The environment in which you'd like to replicate data for Lever. This is used to determine which Lever API endpoint to use.
     */
    public SourceLeverHiring withEnvironment(SourceLeverHiringEnvironment environment) {
        Utils.checkNotNull(environment, "environment");
        this.environment = Optional.ofNullable(environment);
        return this;
    }

    /**
     * The environment in which you'd like to replicate data for Lever. This is used to determine which Lever API endpoint to use.
     */
    public SourceLeverHiring withEnvironment(Optional<? extends SourceLeverHiringEnvironment> environment) {
        Utils.checkNotNull(environment, "environment");
        this.environment = environment;
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. Note that it will be used only in the following incremental streams: comments, commits, and issues.
     */
    public SourceLeverHiring withStartDate(String startDate) {
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
        SourceLeverHiring other = (SourceLeverHiring) o;
        return 
            java.util.Objects.deepEquals(this.credentials, other.credentials) &&
            java.util.Objects.deepEquals(this.environment, other.environment) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            credentials,
            environment,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceLeverHiring.class,
                "credentials", credentials,
                "environment", environment,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private Optional<? extends SourceLeverHiringAuthenticationMechanism> credentials = Optional.empty();
 
        private Optional<? extends SourceLeverHiringEnvironment> environment;
 
        private String startDate;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Choose how to authenticate to Lever Hiring.
         */
        public Builder credentials(SourceLeverHiringAuthenticationMechanism credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = Optional.ofNullable(credentials);
            return this;
        }

        /**
         * Choose how to authenticate to Lever Hiring.
         */
        public Builder credentials(Optional<? extends SourceLeverHiringAuthenticationMechanism> credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * The environment in which you'd like to replicate data for Lever. This is used to determine which Lever API endpoint to use.
         */
        public Builder environment(SourceLeverHiringEnvironment environment) {
            Utils.checkNotNull(environment, "environment");
            this.environment = Optional.ofNullable(environment);
            return this;
        }

        /**
         * The environment in which you'd like to replicate data for Lever. This is used to determine which Lever API endpoint to use.
         */
        public Builder environment(Optional<? extends SourceLeverHiringEnvironment> environment) {
            Utils.checkNotNull(environment, "environment");
            this.environment = environment;
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. Note that it will be used only in the following incremental streams: comments, commits, and issues.
         */
        public Builder startDate(String startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceLeverHiring build() {
            if (environment == null) {
                environment = _SINGLETON_VALUE_Environment.value();
            }
            return new SourceLeverHiring(
                credentials,
                environment,
                startDate);
        }

        private static final LazySingletonValue<Optional<? extends SourceLeverHiringEnvironment>> _SINGLETON_VALUE_Environment =
                new LazySingletonValue<>(
                        "environment",
                        "\"Sandbox\"",
                        new TypeReference<Optional<? extends SourceLeverHiringEnvironment>>() {});

        private static final LazySingletonValue<SourceLeverHiringLeverHiring> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"lever-hiring\"",
                        new TypeReference<SourceLeverHiringLeverHiring>() {});
    }
}


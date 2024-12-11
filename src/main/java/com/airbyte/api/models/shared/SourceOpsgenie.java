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


public class SourceOpsgenie {

    /**
     * API token used to access the Opsgenie platform
     */
    @JsonProperty("api_token")
    private String apiToken;

    /**
     * Service endpoint to use for API calls.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("endpoint")
    private Optional<String> endpoint;

    @JsonProperty("sourceType")
    private Opsgenie sourceType;

    /**
     * The date from which you'd like to replicate data from Opsgenie in the format of YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated. Note that it will be used only in the following incremental streams: issues.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<String> startDate;

    @JsonCreator
    public SourceOpsgenie(
            @JsonProperty("api_token") String apiToken,
            @JsonProperty("endpoint") Optional<String> endpoint,
            @JsonProperty("start_date") Optional<String> startDate) {
        Utils.checkNotNull(apiToken, "apiToken");
        Utils.checkNotNull(endpoint, "endpoint");
        Utils.checkNotNull(startDate, "startDate");
        this.apiToken = apiToken;
        this.endpoint = endpoint;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceOpsgenie(
            String apiToken) {
        this(apiToken, Optional.empty(), Optional.empty());
    }

    /**
     * API token used to access the Opsgenie platform
     */
    @JsonIgnore
    public String apiToken() {
        return apiToken;
    }

    /**
     * Service endpoint to use for API calls.
     */
    @JsonIgnore
    public Optional<String> endpoint() {
        return endpoint;
    }

    @JsonIgnore
    public Opsgenie sourceType() {
        return sourceType;
    }

    /**
     * The date from which you'd like to replicate data from Opsgenie in the format of YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated. Note that it will be used only in the following incremental streams: issues.
     */
    @JsonIgnore
    public Optional<String> startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API token used to access the Opsgenie platform
     */
    public SourceOpsgenie withApiToken(String apiToken) {
        Utils.checkNotNull(apiToken, "apiToken");
        this.apiToken = apiToken;
        return this;
    }

    /**
     * Service endpoint to use for API calls.
     */
    public SourceOpsgenie withEndpoint(String endpoint) {
        Utils.checkNotNull(endpoint, "endpoint");
        this.endpoint = Optional.ofNullable(endpoint);
        return this;
    }

    /**
     * Service endpoint to use for API calls.
     */
    public SourceOpsgenie withEndpoint(Optional<String> endpoint) {
        Utils.checkNotNull(endpoint, "endpoint");
        this.endpoint = endpoint;
        return this;
    }

    /**
     * The date from which you'd like to replicate data from Opsgenie in the format of YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated. Note that it will be used only in the following incremental streams: issues.
     */
    public SourceOpsgenie withStartDate(String startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * The date from which you'd like to replicate data from Opsgenie in the format of YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated. Note that it will be used only in the following incremental streams: issues.
     */
    public SourceOpsgenie withStartDate(Optional<String> startDate) {
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
        SourceOpsgenie other = (SourceOpsgenie) o;
        return 
            Objects.deepEquals(this.apiToken, other.apiToken) &&
            Objects.deepEquals(this.endpoint, other.endpoint) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiToken,
            endpoint,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceOpsgenie.class,
                "apiToken", apiToken,
                "endpoint", endpoint,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String apiToken;
 
        private Optional<String> endpoint;
 
        private Optional<String> startDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API token used to access the Opsgenie platform
         */
        public Builder apiToken(String apiToken) {
            Utils.checkNotNull(apiToken, "apiToken");
            this.apiToken = apiToken;
            return this;
        }

        /**
         * Service endpoint to use for API calls.
         */
        public Builder endpoint(String endpoint) {
            Utils.checkNotNull(endpoint, "endpoint");
            this.endpoint = Optional.ofNullable(endpoint);
            return this;
        }

        /**
         * Service endpoint to use for API calls.
         */
        public Builder endpoint(Optional<String> endpoint) {
            Utils.checkNotNull(endpoint, "endpoint");
            this.endpoint = endpoint;
            return this;
        }

        /**
         * The date from which you'd like to replicate data from Opsgenie in the format of YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated. Note that it will be used only in the following incremental streams: issues.
         */
        public Builder startDate(String startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * The date from which you'd like to replicate data from Opsgenie in the format of YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated. Note that it will be used only in the following incremental streams: issues.
         */
        public Builder startDate(Optional<String> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceOpsgenie build() {
            if (endpoint == null) {
                endpoint = _SINGLETON_VALUE_Endpoint.value();
            }            return new SourceOpsgenie(
                apiToken,
                endpoint,
                startDate);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_Endpoint =
                new LazySingletonValue<>(
                        "endpoint",
                        "\"api.opsgenie.com\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<Opsgenie> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"opsgenie\"",
                        new TypeReference<Opsgenie>() {});
    }
}


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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;


public class SourceAmplitude {

    /**
     * Amplitude API Key. See the &lt;a href="https://docs.airbyte.com/integrations/sources/amplitude#setup-guide"&gt;setup guide&lt;/a&gt; for more information on how to obtain this key.
     */
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * Amplitude data region server
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data_region")
    private Optional<? extends DataRegion> dataRegion;

    /**
     * According to &lt;a href="https://www.docs.developers.amplitude.com/analytics/apis/export-api/#considerations"&gt;Considerations&lt;/a&gt; too big time range in request can cause a timeout error. In this case, set shorter time interval in hours.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("request_time_range")
    private Optional<? extends Long> requestTimeRange;

    /**
     * Amplitude Secret Key. See the &lt;a href="https://docs.airbyte.com/integrations/sources/amplitude#setup-guide"&gt;setup guide&lt;/a&gt; for more information on how to obtain this key.
     */
    @JsonProperty("secret_key")
    private String secretKey;

    @JsonProperty("sourceType")
    private Amplitude sourceType;

    /**
     * UTC date and time in the format 2021-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    public SourceAmplitude(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("data_region") Optional<? extends DataRegion> dataRegion,
            @JsonProperty("request_time_range") Optional<? extends Long> requestTimeRange,
            @JsonProperty("secret_key") String secretKey,
            @JsonProperty("start_date") OffsetDateTime startDate) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(dataRegion, "dataRegion");
        Utils.checkNotNull(requestTimeRange, "requestTimeRange");
        Utils.checkNotNull(secretKey, "secretKey");
        Utils.checkNotNull(startDate, "startDate");
        this.apiKey = apiKey;
        this.dataRegion = dataRegion;
        this.requestTimeRange = requestTimeRange;
        this.secretKey = secretKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }

    /**
     * Amplitude API Key. See the &lt;a href="https://docs.airbyte.com/integrations/sources/amplitude#setup-guide"&gt;setup guide&lt;/a&gt; for more information on how to obtain this key.
     */
    public String apiKey() {
        return apiKey;
    }

    /**
     * Amplitude data region server
     */
    public Optional<? extends DataRegion> dataRegion() {
        return dataRegion;
    }

    /**
     * According to &lt;a href="https://www.docs.developers.amplitude.com/analytics/apis/export-api/#considerations"&gt;Considerations&lt;/a&gt; too big time range in request can cause a timeout error. In this case, set shorter time interval in hours.
     */
    public Optional<? extends Long> requestTimeRange() {
        return requestTimeRange;
    }

    /**
     * Amplitude Secret Key. See the &lt;a href="https://docs.airbyte.com/integrations/sources/amplitude#setup-guide"&gt;setup guide&lt;/a&gt; for more information on how to obtain this key.
     */
    public String secretKey() {
        return secretKey;
    }

    public Amplitude sourceType() {
        return sourceType;
    }

    /**
     * UTC date and time in the format 2021-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    public OffsetDateTime startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Amplitude API Key. See the &lt;a href="https://docs.airbyte.com/integrations/sources/amplitude#setup-guide"&gt;setup guide&lt;/a&gt; for more information on how to obtain this key.
     */
    public SourceAmplitude withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Amplitude data region server
     */
    public SourceAmplitude withDataRegion(DataRegion dataRegion) {
        Utils.checkNotNull(dataRegion, "dataRegion");
        this.dataRegion = Optional.ofNullable(dataRegion);
        return this;
    }

    /**
     * Amplitude data region server
     */
    public SourceAmplitude withDataRegion(Optional<? extends DataRegion> dataRegion) {
        Utils.checkNotNull(dataRegion, "dataRegion");
        this.dataRegion = dataRegion;
        return this;
    }

    /**
     * According to &lt;a href="https://www.docs.developers.amplitude.com/analytics/apis/export-api/#considerations"&gt;Considerations&lt;/a&gt; too big time range in request can cause a timeout error. In this case, set shorter time interval in hours.
     */
    public SourceAmplitude withRequestTimeRange(long requestTimeRange) {
        Utils.checkNotNull(requestTimeRange, "requestTimeRange");
        this.requestTimeRange = Optional.ofNullable(requestTimeRange);
        return this;
    }

    /**
     * According to &lt;a href="https://www.docs.developers.amplitude.com/analytics/apis/export-api/#considerations"&gt;Considerations&lt;/a&gt; too big time range in request can cause a timeout error. In this case, set shorter time interval in hours.
     */
    public SourceAmplitude withRequestTimeRange(Optional<? extends Long> requestTimeRange) {
        Utils.checkNotNull(requestTimeRange, "requestTimeRange");
        this.requestTimeRange = requestTimeRange;
        return this;
    }

    /**
     * Amplitude Secret Key. See the &lt;a href="https://docs.airbyte.com/integrations/sources/amplitude#setup-guide"&gt;setup guide&lt;/a&gt; for more information on how to obtain this key.
     */
    public SourceAmplitude withSecretKey(String secretKey) {
        Utils.checkNotNull(secretKey, "secretKey");
        this.secretKey = secretKey;
        return this;
    }

    /**
     * UTC date and time in the format 2021-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    public SourceAmplitude withStartDate(OffsetDateTime startDate) {
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
        SourceAmplitude other = (SourceAmplitude) o;
        return 
            java.util.Objects.deepEquals(this.apiKey, other.apiKey) &&
            java.util.Objects.deepEquals(this.dataRegion, other.dataRegion) &&
            java.util.Objects.deepEquals(this.requestTimeRange, other.requestTimeRange) &&
            java.util.Objects.deepEquals(this.secretKey, other.secretKey) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKey,
            dataRegion,
            requestTimeRange,
            secretKey,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceAmplitude.class,
                "apiKey", apiKey,
                "dataRegion", dataRegion,
                "requestTimeRange", requestTimeRange,
                "secretKey", secretKey,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<? extends DataRegion> dataRegion;
 
        private Optional<? extends Long> requestTimeRange;
 
        private String secretKey;
 
        private OffsetDateTime startDate;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Amplitude API Key. See the &lt;a href="https://docs.airbyte.com/integrations/sources/amplitude#setup-guide"&gt;setup guide&lt;/a&gt; for more information on how to obtain this key.
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Amplitude data region server
         */
        public Builder dataRegion(DataRegion dataRegion) {
            Utils.checkNotNull(dataRegion, "dataRegion");
            this.dataRegion = Optional.ofNullable(dataRegion);
            return this;
        }

        /**
         * Amplitude data region server
         */
        public Builder dataRegion(Optional<? extends DataRegion> dataRegion) {
            Utils.checkNotNull(dataRegion, "dataRegion");
            this.dataRegion = dataRegion;
            return this;
        }

        /**
         * According to &lt;a href="https://www.docs.developers.amplitude.com/analytics/apis/export-api/#considerations"&gt;Considerations&lt;/a&gt; too big time range in request can cause a timeout error. In this case, set shorter time interval in hours.
         */
        public Builder requestTimeRange(long requestTimeRange) {
            Utils.checkNotNull(requestTimeRange, "requestTimeRange");
            this.requestTimeRange = Optional.ofNullable(requestTimeRange);
            return this;
        }

        /**
         * According to &lt;a href="https://www.docs.developers.amplitude.com/analytics/apis/export-api/#considerations"&gt;Considerations&lt;/a&gt; too big time range in request can cause a timeout error. In this case, set shorter time interval in hours.
         */
        public Builder requestTimeRange(Optional<? extends Long> requestTimeRange) {
            Utils.checkNotNull(requestTimeRange, "requestTimeRange");
            this.requestTimeRange = requestTimeRange;
            return this;
        }

        /**
         * Amplitude Secret Key. See the &lt;a href="https://docs.airbyte.com/integrations/sources/amplitude#setup-guide"&gt;setup guide&lt;/a&gt; for more information on how to obtain this key.
         */
        public Builder secretKey(String secretKey) {
            Utils.checkNotNull(secretKey, "secretKey");
            this.secretKey = secretKey;
            return this;
        }

        /**
         * UTC date and time in the format 2021-01-25T00:00:00Z. Any data before this date will not be replicated.
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceAmplitude build() {
            if (dataRegion == null) {
                dataRegion = _SINGLETON_VALUE_DataRegion.value();
            }
            if (requestTimeRange == null) {
                requestTimeRange = _SINGLETON_VALUE_RequestTimeRange.value();
            }
            return new SourceAmplitude(
                apiKey,
                dataRegion,
                requestTimeRange,
                secretKey,
                startDate);
        }

        private static final LazySingletonValue<Optional<? extends DataRegion>> _SINGLETON_VALUE_DataRegion =
                new LazySingletonValue<>(
                        "data_region",
                        "\"Standard Server\"",
                        new TypeReference<Optional<? extends DataRegion>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_RequestTimeRange =
                new LazySingletonValue<>(
                        "request_time_range",
                        "24",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Amplitude> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"amplitude\"",
                        new TypeReference<Amplitude>() {});
    }
}


/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

public class SourceSenseforce {

    /**
     * Your API access token. See &lt;a href="https://manual.senseforce.io/manual/sf-platform/public-api/get-your-access-token/"&gt;here&lt;/a&gt;. The toke is case sensitive.
     */
    @JsonProperty("access_token")
    private String accessToken;

    /**
     * Your Senseforce API backend URL. This is the URL shown during the Login screen. See &lt;a href="https://manual.senseforce.io/manual/sf-platform/public-api/get-your-access-token/"&gt;here&lt;/a&gt; for more details. (Note: Most Senseforce backend APIs have the term 'galaxy' in their ULR)
     */
    @JsonProperty("backend_url")
    private String backendUrl;

    /**
     * The ID of the dataset you want to synchronize. The ID can be found in the URL when opening the dataset. See &lt;a href="https://manual.senseforce.io/manual/sf-platform/public-api/get-your-access-token/"&gt;here&lt;/a&gt; for more details. (Note: As the Senseforce API only allows to synchronize a specific dataset, each dataset you  want to synchronize needs to be implemented as a separate airbyte source).
     */
    @JsonProperty("dataset_id")
    private String datasetId;

    @JsonProperty("sourceType")
    private Senseforce sourceType;

    /**
     * UTC date and time in the format 2017-01-25. Only data with "Timestamp" after this date will be replicated. Important note: This start date must be set to the first day of where your dataset provides data.  If your dataset has data from 2020-10-10 10:21:10, set the start_date to 2020-10-10 or later
     */
    @JsonProperty("start_date")
    private LocalDate startDate;

    @JsonCreator
    public SourceSenseforce(
            @JsonProperty("access_token") String accessToken,
            @JsonProperty("backend_url") String backendUrl,
            @JsonProperty("dataset_id") String datasetId,
            @JsonProperty("start_date") LocalDate startDate) {
        Utils.checkNotNull(accessToken, "accessToken");
        Utils.checkNotNull(backendUrl, "backendUrl");
        Utils.checkNotNull(datasetId, "datasetId");
        Utils.checkNotNull(startDate, "startDate");
        this.accessToken = accessToken;
        this.backendUrl = backendUrl;
        this.datasetId = datasetId;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }

    /**
     * Your API access token. See &lt;a href="https://manual.senseforce.io/manual/sf-platform/public-api/get-your-access-token/"&gt;here&lt;/a&gt;. The toke is case sensitive.
     */
    @JsonIgnore
    public String accessToken() {
        return accessToken;
    }

    /**
     * Your Senseforce API backend URL. This is the URL shown during the Login screen. See &lt;a href="https://manual.senseforce.io/manual/sf-platform/public-api/get-your-access-token/"&gt;here&lt;/a&gt; for more details. (Note: Most Senseforce backend APIs have the term 'galaxy' in their ULR)
     */
    @JsonIgnore
    public String backendUrl() {
        return backendUrl;
    }

    /**
     * The ID of the dataset you want to synchronize. The ID can be found in the URL when opening the dataset. See &lt;a href="https://manual.senseforce.io/manual/sf-platform/public-api/get-your-access-token/"&gt;here&lt;/a&gt; for more details. (Note: As the Senseforce API only allows to synchronize a specific dataset, each dataset you  want to synchronize needs to be implemented as a separate airbyte source).
     */
    @JsonIgnore
    public String datasetId() {
        return datasetId;
    }

    @JsonIgnore
    public Senseforce sourceType() {
        return sourceType;
    }

    /**
     * UTC date and time in the format 2017-01-25. Only data with "Timestamp" after this date will be replicated. Important note: This start date must be set to the first day of where your dataset provides data.  If your dataset has data from 2020-10-10 10:21:10, set the start_date to 2020-10-10 or later
     */
    @JsonIgnore
    public LocalDate startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Your API access token. See &lt;a href="https://manual.senseforce.io/manual/sf-platform/public-api/get-your-access-token/"&gt;here&lt;/a&gt;. The toke is case sensitive.
     */
    public SourceSenseforce withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Your Senseforce API backend URL. This is the URL shown during the Login screen. See &lt;a href="https://manual.senseforce.io/manual/sf-platform/public-api/get-your-access-token/"&gt;here&lt;/a&gt; for more details. (Note: Most Senseforce backend APIs have the term 'galaxy' in their ULR)
     */
    public SourceSenseforce withBackendUrl(String backendUrl) {
        Utils.checkNotNull(backendUrl, "backendUrl");
        this.backendUrl = backendUrl;
        return this;
    }

    /**
     * The ID of the dataset you want to synchronize. The ID can be found in the URL when opening the dataset. See &lt;a href="https://manual.senseforce.io/manual/sf-platform/public-api/get-your-access-token/"&gt;here&lt;/a&gt; for more details. (Note: As the Senseforce API only allows to synchronize a specific dataset, each dataset you  want to synchronize needs to be implemented as a separate airbyte source).
     */
    public SourceSenseforce withDatasetId(String datasetId) {
        Utils.checkNotNull(datasetId, "datasetId");
        this.datasetId = datasetId;
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25. Only data with "Timestamp" after this date will be replicated. Important note: This start date must be set to the first day of where your dataset provides data.  If your dataset has data from 2020-10-10 10:21:10, set the start_date to 2020-10-10 or later
     */
    public SourceSenseforce withStartDate(LocalDate startDate) {
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
        SourceSenseforce other = (SourceSenseforce) o;
        return 
            java.util.Objects.deepEquals(this.accessToken, other.accessToken) &&
            java.util.Objects.deepEquals(this.backendUrl, other.backendUrl) &&
            java.util.Objects.deepEquals(this.datasetId, other.datasetId) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accessToken,
            backendUrl,
            datasetId,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSenseforce.class,
                "accessToken", accessToken,
                "backendUrl", backendUrl,
                "datasetId", datasetId,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String accessToken;
 
        private String backendUrl;
 
        private String datasetId;
 
        private LocalDate startDate;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Your API access token. See &lt;a href="https://manual.senseforce.io/manual/sf-platform/public-api/get-your-access-token/"&gt;here&lt;/a&gt;. The toke is case sensitive.
         */
        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }

        /**
         * Your Senseforce API backend URL. This is the URL shown during the Login screen. See &lt;a href="https://manual.senseforce.io/manual/sf-platform/public-api/get-your-access-token/"&gt;here&lt;/a&gt; for more details. (Note: Most Senseforce backend APIs have the term 'galaxy' in their ULR)
         */
        public Builder backendUrl(String backendUrl) {
            Utils.checkNotNull(backendUrl, "backendUrl");
            this.backendUrl = backendUrl;
            return this;
        }

        /**
         * The ID of the dataset you want to synchronize. The ID can be found in the URL when opening the dataset. See &lt;a href="https://manual.senseforce.io/manual/sf-platform/public-api/get-your-access-token/"&gt;here&lt;/a&gt; for more details. (Note: As the Senseforce API only allows to synchronize a specific dataset, each dataset you  want to synchronize needs to be implemented as a separate airbyte source).
         */
        public Builder datasetId(String datasetId) {
            Utils.checkNotNull(datasetId, "datasetId");
            this.datasetId = datasetId;
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25. Only data with "Timestamp" after this date will be replicated. Important note: This start date must be set to the first day of where your dataset provides data.  If your dataset has data from 2020-10-10 10:21:10, set the start_date to 2020-10-10 or later
         */
        public Builder startDate(LocalDate startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceSenseforce build() {
            return new SourceSenseforce(
                accessToken,
                backendUrl,
                datasetId,
                startDate);
        }

        private static final LazySingletonValue<Senseforce> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"senseforce\"",
                        new TypeReference<Senseforce>() {});
    }
}


/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 * SourceSenseforce - The values required to configure the source.
 */

public class SourceSenseforce {
    /**
     * Your API access token. See &lt;a href="https://manual.senseforce.io/manual/sf-platform/public-api/get-your-access-token/"&gt;here&lt;/a&gt;. The toke is case sensitive.
     */
    @JsonProperty("access_token")
    public String accessToken;

    public SourceSenseforce withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    /**
     * Your Senseforce API backend URL. This is the URL shown during the Login screen. See &lt;a href="https://manual.senseforce.io/manual/sf-platform/public-api/get-your-access-token/"&gt;here&lt;/a&gt; for more details. (Note: Most Senseforce backend APIs have the term 'galaxy' in their ULR)
     */
    @JsonProperty("backend_url")
    public String backendUrl;

    public SourceSenseforce withBackendUrl(String backendUrl) {
        this.backendUrl = backendUrl;
        return this;
    }
    
    /**
     * The ID of the dataset you want to synchronize. The ID can be found in the URL when opening the dataset. See &lt;a href="https://manual.senseforce.io/manual/sf-platform/public-api/get-your-access-token/"&gt;here&lt;/a&gt; for more details. (Note: As the Senseforce API only allows to synchronize a specific dataset, each dataset you  want to synchronize needs to be implemented as a separate airbyte source).
     */
    @JsonProperty("dataset_id")
    public String datasetId;

    public SourceSenseforce withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    
    /**
     * The time increment used by the connector when requesting data from the Senseforce API. The bigger the value is, the less requests will be made and faster the sync will be. On the other hand, the more seldom the state is persisted and the more likely one could run into rate limites.  Furthermore, consider that large chunks of time might take a long time for the Senseforce query to return data - meaning it could take in effect longer than with more smaller time slices. If there are a lot of data per day, set this setting to 1. If there is only very little data per day, you might change the setting to 10 or more.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("slice_range")
    public Long sliceRange;

    public SourceSenseforce withSliceRange(Long sliceRange) {
        this.sliceRange = sliceRange;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceSenseforceSenseforce sourceType;

    public SourceSenseforce withSourceType(SourceSenseforceSenseforce sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * UTC date and time in the format 2017-01-25. Only data with "Timestamp" after this date will be replicated. Important note: This start date must be set to the first day of where your dataset provides data.  If your dataset has data from 2020-10-10 10:21:10, set the start_date to 2020-10-10 or later
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;

    public SourceSenseforce withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
    public SourceSenseforce(@JsonProperty("access_token") String accessToken, @JsonProperty("backend_url") String backendUrl, @JsonProperty("dataset_id") String datasetId, @JsonProperty("sourceType") SourceSenseforceSenseforce sourceType, @JsonProperty("start_date") LocalDate startDate) {
        this.accessToken = accessToken;
        this.backendUrl = backendUrl;
        this.datasetId = datasetId;
        this.sourceType = sourceType;
        this.startDate = startDate;
  }
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceApifyDataset - The values required to configure the source.
 */

public class SourceApifyDataset {
    /**
     * If set to true, only clean items will be downloaded from the dataset. See description of what clean means in &lt;a href="https://docs.apify.com/api/v2#/reference/datasets/item-collection/get-items"&gt;Apify API docs&lt;/a&gt;. If not sure, set clean to false.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("clean")
    public Boolean clean;

    public SourceApifyDataset withClean(Boolean clean) {
        this.clean = clean;
        return this;
    }
    
    /**
     * ID of the dataset you would like to load to Airbyte.
     */
    @JsonProperty("datasetId")
    public String datasetId;

    public SourceApifyDataset withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceApifyDatasetApifyDataset sourceType;

    public SourceApifyDataset withSourceType(SourceApifyDatasetApifyDataset sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    public SourceApifyDataset(@JsonProperty("datasetId") String datasetId, @JsonProperty("sourceType") SourceApifyDatasetApifyDataset sourceType) {
        this.datasetId = datasetId;
        this.sourceType = sourceType;
  }
}

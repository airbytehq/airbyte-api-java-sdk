/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceWebflow - The values required to configure the source.
 */

public class SourceWebflow {
    /**
     * The API token for authenticating to Webflow. See https://university.webflow.com/lesson/intro-to-the-webflow-api
     */
    @JsonProperty("api_key")
    public String apiKey;

    public SourceWebflow withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * The id of the Webflow site you are requesting data from. See https://developers.webflow.com/#sites
     */
    @JsonProperty("site_id")
    public String siteId;

    public SourceWebflow withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceWebflowWebflow sourceType;

    public SourceWebflow withSourceType(SourceWebflowWebflow sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    public SourceWebflow(@JsonProperty("api_key") String apiKey, @JsonProperty("site_id") String siteId, @JsonProperty("sourceType") SourceWebflowWebflow sourceType) {
        this.apiKey = apiKey;
        this.siteId = siteId;
        this.sourceType = sourceType;
  }
}

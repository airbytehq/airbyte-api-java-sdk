/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceRss - The values required to configure the source.
 */
public class SourceRss {
    @JsonProperty("sourceType")
    public SourceRssRssEnum sourceType;
    public SourceRss withSourceType(SourceRssRssEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * RSS Feed URL
     */
    @JsonProperty("url")
    public String url;
    public SourceRss withUrl(String url) {
        this.url = url;
        return this;
    }
    
}

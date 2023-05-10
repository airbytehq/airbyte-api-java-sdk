/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceTheGuardianApi - The values required to configure the source.
 */
public class SourceTheGuardianApi {
    /**
     * Your API Key. See &lt;a href="https://open-platform.theguardian.com/access/"&gt;here&lt;/a&gt;. The key is case sensitive.
     */
    @JsonProperty("api_key")
    public String apiKey;

    public SourceTheGuardianApi withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * (Optional) Use this to set the maximum date (YYYY-MM-DD) of the results. Results newer than the end_date will not be shown. Default is set to the current date (today) for incremental syncs.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    public String endDate;

    public SourceTheGuardianApi withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    
    /**
     * (Optional) The query (q) parameter filters the results to only those that include that search term. The q parameter supports AND, OR and NOT operators.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("query")
    public String query;

    public SourceTheGuardianApi withQuery(String query) {
        this.query = query;
        return this;
    }
    
    /**
     * (Optional) Use this to filter the results by a particular section. See &lt;a href="https://content.guardianapis.com/sections?api-key=test"&gt;here&lt;/a&gt; for a list of all sections, and &lt;a href="https://open-platform.theguardian.com/documentation/section"&gt;here&lt;/a&gt; for the sections endpoint documentation.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("section")
    public String section;

    public SourceTheGuardianApi withSection(String section) {
        this.section = section;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceTheGuardianApiTheGuardianApiEnum sourceType;

    public SourceTheGuardianApi withSourceType(SourceTheGuardianApiTheGuardianApiEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * Use this to set the minimum date (YYYY-MM-DD) of the results. Results older than the start_date will not be shown.
     */
    @JsonProperty("start_date")
    public String startDate;

    public SourceTheGuardianApi withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    /**
     * (Optional) A tag is a piece of data that is used by The Guardian to categorise content. Use this parameter to filter results by showing only the ones matching the entered tag. See &lt;a href="https://content.guardianapis.com/tags?api-key=test"&gt;here&lt;/a&gt; for a list of all tags, and &lt;a href="https://open-platform.theguardian.com/documentation/tag"&gt;here&lt;/a&gt; for the tags endpoint documentation.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tag")
    public String tag;

    public SourceTheGuardianApi withTag(String tag) {
        this.tag = tag;
        return this;
    }
    
    public SourceTheGuardianApi(@JsonProperty("api_key") String apiKey, @JsonProperty("sourceType") SourceTheGuardianApiTheGuardianApiEnum sourceType, @JsonProperty("start_date") String startDate) {
        this.apiKey = apiKey;
        this.sourceType = sourceType;
        this.startDate = startDate;
  }
}

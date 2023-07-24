/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMailjetSms - The values required to configure the source.
 */

public class SourceMailjetSms {
    /**
     * Retrieve SMS messages created before the specified timestamp. Required format - Unix timestamp.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    public Long endDate;

    public SourceMailjetSms withEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceMailjetSmsMailjetSms sourceType;

    public SourceMailjetSms withSourceType(SourceMailjetSmsMailjetSms sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * Retrieve SMS messages created after the specified timestamp. Required format - Unix timestamp.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    public Long startDate;

    public SourceMailjetSms withStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    
    /**
     * Your access token. See &lt;a href="https://dev.mailjet.com/sms/reference/overview/authentication"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("token")
    public String token;

    public SourceMailjetSms withToken(String token) {
        this.token = token;
        return this;
    }
    
    public SourceMailjetSms(@JsonProperty("sourceType") SourceMailjetSmsMailjetSms sourceType, @JsonProperty("token") String token) {
        this.sourceType = sourceType;
        this.token = token;
  }
}

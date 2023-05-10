/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * SourceSmartsheets - The values required to configure the source.
 */
public class SourceSmartsheets {
    @JsonProperty("credentials")
    public Object credentials;

    public SourceSmartsheets withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceSmartsheetsSmartsheetsEnum sourceType;

    public SourceSmartsheets withSourceType(SourceSmartsheetsSmartsheetsEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * The spreadsheet ID. Find it by opening the spreadsheet then navigating to File &gt; Properties
     */
    @JsonProperty("spreadsheet_id")
    public String spreadsheetId;

    public SourceSmartsheets withSpreadsheetId(String spreadsheetId) {
        this.spreadsheetId = spreadsheetId;
        return this;
    }
    
    /**
     * Only rows modified after this date/time will be replicated. This should be an ISO 8601 string, for instance: `2000-01-01T13:00:00`
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_datetime")
    public OffsetDateTime startDatetime;

    public SourceSmartsheets withStartDatetime(OffsetDateTime startDatetime) {
        this.startDatetime = startDatetime;
        return this;
    }
    
    public SourceSmartsheets(@JsonProperty("credentials") Object credentials, @JsonProperty("sourceType") SourceSmartsheetsSmartsheetsEnum sourceType, @JsonProperty("spreadsheet_id") String spreadsheetId) {
        this.credentials = credentials;
        this.sourceType = sourceType;
        this.spreadsheetId = spreadsheetId;
  }
}

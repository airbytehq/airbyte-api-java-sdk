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
 * SourceQuickbooks - The values required to configure the source.
 */

public class SourceQuickbooks {
    @JsonProperty("credentials")
    public Object credentials;

    public SourceQuickbooks withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    /**
     * Determines whether to use the sandbox or production environment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sandbox")
    public Boolean sandbox;

    public SourceQuickbooks withSandbox(Boolean sandbox) {
        this.sandbox = sandbox;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceQuickbooksQuickbooks sourceType;

    public SourceQuickbooks withSourceType(SourceQuickbooksQuickbooks sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * The default value to use if no bookmark exists for an endpoint (rfc3339 date string). E.g, 2021-03-20T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;

    public SourceQuickbooks withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
    public SourceQuickbooks(@JsonProperty("credentials") Object credentials, @JsonProperty("sourceType") SourceQuickbooksQuickbooks sourceType, @JsonProperty("start_date") OffsetDateTime startDate) {
        this.credentials = credentials;
        this.sourceType = sourceType;
        this.startDate = startDate;
  }
}

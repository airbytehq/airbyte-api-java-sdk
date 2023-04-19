/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMicrosoftTeams - The values required to configure the source.
 */
public class SourceMicrosoftTeams {
    /**
     * Choose how to authenticate to Microsoft
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourceMicrosoftTeams withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    /**
     * Specifies the length of time over which the Team Device Report stream is aggregated. The supported values are: D7, D30, D90, and D180.
     */
    @JsonProperty("period")
    public String period;
    public SourceMicrosoftTeams withPeriod(String period) {
        this.period = period;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceMicrosoftTeamsMicrosoftTeamsEnum sourceType;
    public SourceMicrosoftTeams withSourceType(SourceMicrosoftTeamsMicrosoftTeamsEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
}

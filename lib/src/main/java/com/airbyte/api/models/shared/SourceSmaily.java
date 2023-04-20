/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSmaily - The values required to configure the source.
 */
public class SourceSmaily {
    /**
     * API user password. See https://smaily.com/help/api/general/create-api-user/
     */
    @JsonProperty("api_password")
    public String apiPassword;
    public SourceSmaily withApiPassword(String apiPassword) {
        this.apiPassword = apiPassword;
        return this;
    }
    
    /**
     * API Subdomain. See https://smaily.com/help/api/general/create-api-user/
     */
    @JsonProperty("api_subdomain")
    public String apiSubdomain;
    public SourceSmaily withApiSubdomain(String apiSubdomain) {
        this.apiSubdomain = apiSubdomain;
        return this;
    }
    
    /**
     * API user username. See https://smaily.com/help/api/general/create-api-user/
     */
    @JsonProperty("api_username")
    public String apiUsername;
    public SourceSmaily withApiUsername(String apiUsername) {
        this.apiUsername = apiUsername;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceSmailySmailyEnum sourceType;
    public SourceSmaily withSourceType(SourceSmailySmailyEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
}
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
 * SourceZohoCrm - The values required to configure the source.
 */

public class SourceZohoCrm {
    /**
     * OAuth2.0 Client ID
     */
    @JsonProperty("client_id")
    public String clientId;

    public SourceZohoCrm withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * OAuth2.0 Client Secret
     */
    @JsonProperty("client_secret")
    public String clientSecret;

    public SourceZohoCrm withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * Please choose the region of your Data Center location. More info by this &lt;a href="https://www.zoho.com/crm/developer/docs/api/v2/multi-dc.html"&gt;Link&lt;/a&gt;
     */
    @JsonProperty("dc_region")
    public SourceZohoCrmDataCenterLocation dcRegion;

    public SourceZohoCrm withDcRegion(SourceZohoCrmDataCenterLocation dcRegion) {
        this.dcRegion = dcRegion;
        return this;
    }
    
    /**
     * Choose your Edition of Zoho CRM to determine API Concurrency Limits
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("edition")
    public SourceZohoCRMZohoCRMEdition edition;

    public SourceZohoCrm withEdition(SourceZohoCRMZohoCRMEdition edition) {
        this.edition = edition;
        return this;
    }
    
    /**
     * Please choose the environment
     */
    @JsonProperty("environment")
    public SourceZohoCrmEnvironment environment;

    public SourceZohoCrm withEnvironment(SourceZohoCrmEnvironment environment) {
        this.environment = environment;
        return this;
    }
    
    /**
     * OAuth2.0 Refresh Token
     */
    @JsonProperty("refresh_token")
    public String refreshToken;

    public SourceZohoCrm withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceZohoCrmZohoCrm sourceType;

    public SourceZohoCrm withSourceType(SourceZohoCrmZohoCrm sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * ISO 8601, for instance: `YYYY-MM-DD`, `YYYY-MM-DD HH:MM:SS+HH:MM`
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_datetime")
    public OffsetDateTime startDatetime;

    public SourceZohoCrm withStartDatetime(OffsetDateTime startDatetime) {
        this.startDatetime = startDatetime;
        return this;
    }
    
    public SourceZohoCrm(@JsonProperty("client_id") String clientId, @JsonProperty("client_secret") String clientSecret, @JsonProperty("dc_region") SourceZohoCrmDataCenterLocation dcRegion, @JsonProperty("environment") SourceZohoCrmEnvironment environment, @JsonProperty("refresh_token") String refreshToken, @JsonProperty("sourceType") SourceZohoCrmZohoCrm sourceType) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.dcRegion = dcRegion;
        this.environment = environment;
        this.refreshToken = refreshToken;
        this.sourceType = sourceType;
  }
}

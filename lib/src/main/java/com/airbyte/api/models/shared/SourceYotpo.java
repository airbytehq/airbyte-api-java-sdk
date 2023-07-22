/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * SourceYotpo - The values required to configure the source.
 */

public class SourceYotpo {
    /**
     * Access token recieved as a result of API call to https://api.yotpo.com/oauth/token (Ref- https://apidocs.yotpo.com/reference/yotpo-authentication)
     */
    @JsonProperty("access_token")
    public String accessToken;

    public SourceYotpo withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    /**
     * App key found at settings (Ref- https://settings.yotpo.com/#/general_settings)
     */
    @JsonProperty("app_key")
    public String appKey;

    public SourceYotpo withAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    
    /**
     * Email address registered with yotpo.
     */
    @JsonProperty("email")
    public String email;

    public SourceYotpo withEmail(String email) {
        this.email = email;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceYotpoYotpo sourceType;

    public SourceYotpo withSourceType(SourceYotpoYotpo sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * Date time filter for incremental filter, Specify which date to extract from.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;

    public SourceYotpo withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
    public SourceYotpo(@JsonProperty("access_token") String accessToken, @JsonProperty("app_key") String appKey, @JsonProperty("email") String email, @JsonProperty("sourceType") SourceYotpoYotpo sourceType, @JsonProperty("start_date") OffsetDateTime startDate) {
        this.accessToken = accessToken;
        this.appKey = appKey;
        this.email = email;
        this.sourceType = sourceType;
        this.startDate = startDate;
  }
}

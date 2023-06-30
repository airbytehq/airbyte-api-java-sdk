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


public class AirtableCredentials {
    /**
     * Access Token for making authenticated requests.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_token")
    public String accessToken;

    public AirtableCredentials withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    /**
     * The client ID of the Airtable developer application.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")
    public String clientId;

    public AirtableCredentials withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The client secret the Airtable developer application.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    public String clientSecret;

    public AirtableCredentials withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * The key to refresh the expired access token.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refresh_token")
    public String refreshToken;

    public AirtableCredentials withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    /**
     * The date-time when the access token should be refreshed.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("token_expiry_date")
    public OffsetDateTime tokenExpiryDate;

    public AirtableCredentials withTokenExpiryDate(OffsetDateTime tokenExpiryDate) {
        this.tokenExpiryDate = tokenExpiryDate;
        return this;
    }
    
    public AirtableCredentials(){}
}

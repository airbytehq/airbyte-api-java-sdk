/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 * SourceGoogleAds - The values required to configure the source.
 */

public class SourceGoogleAds {
    /**
     * A conversion window is the period of time after an ad interaction (such as an ad click or video view) during which a conversion, such as a purchase, is recorded in Google Ads. For more information, see Google's &lt;a href="https://support.google.com/google-ads/answer/3123169?hl=en"&gt;documentation&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("conversion_window_days")
    public Long conversionWindowDays;

    public SourceGoogleAds withConversionWindowDays(Long conversionWindowDays) {
        this.conversionWindowDays = conversionWindowDays;
        return this;
    }
    
    @JsonProperty("credentials")
    public SourceGoogleAdsGoogleCredentials credentials;

    public SourceGoogleAds withCredentials(SourceGoogleAdsGoogleCredentials credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_queries")
    public SourceGoogleAdsCustomQueries[] customQueries;

    public SourceGoogleAds withCustomQueries(SourceGoogleAdsCustomQueries[] customQueries) {
        this.customQueries = customQueries;
        return this;
    }
    
    /**
     * Comma separated list of (client) customer IDs. Each customer ID must be specified as a 10-digit number without dashes. More instruction on how to find this value in our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;docs&lt;/a&gt;. Metrics streams like AdGroupAdReport cannot be requested for a manager account.
     */
    @JsonProperty("customer_id")
    public String customerId;

    public SourceGoogleAds withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    
    /**
     * UTC date and time in the format 2017-01-25. Any data after this date will not be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("end_date")
    public LocalDate endDate;

    public SourceGoogleAds withEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }
    
    /**
     * If your access to the customer account is through a manager account, this field is required and must be set to the customer ID of the manager account (10-digit number without dashes). More information about this field you can see &lt;a href="https://developers.google.com/google-ads/api/docs/concepts/call-structure#cid"&gt;here&lt;/a&gt;
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("login_customer_id")
    public String loginCustomerId;

    public SourceGoogleAds withLoginCustomerId(String loginCustomerId) {
        this.loginCustomerId = loginCustomerId;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceGoogleAdsGoogleAds sourceType;

    public SourceGoogleAds withSourceType(SourceGoogleAdsGoogleAds sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * UTC date and time in the format 2017-01-25. Any data before this date will not be replicated.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;

    public SourceGoogleAds withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
    public SourceGoogleAds(@JsonProperty("credentials") SourceGoogleAdsGoogleCredentials credentials, @JsonProperty("customer_id") String customerId, @JsonProperty("sourceType") SourceGoogleAdsGoogleAds sourceType, @JsonProperty("start_date") LocalDate startDate) {
        this.credentials = credentials;
        this.customerId = customerId;
        this.sourceType = sourceType;
        this.startDate = startDate;
  }
}

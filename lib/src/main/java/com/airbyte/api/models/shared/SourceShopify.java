/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceShopify - The values required to configure the source.
 */
public class SourceShopify {
    /**
     * The authorization method to use to retrieve data from Shopify
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourceShopify withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    /**
     * The name of your Shopify store found in the URL. For example, if your URL was https://NAME.myshopify.com, then the name would be 'NAME'.
     */
    @JsonProperty("shop")
    public String shop;
    public SourceShopify withShop(String shop) {
        this.shop = shop;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceShopifyShopifyEnum sourceType;
    public SourceShopify withSourceType(SourceShopifyShopifyEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * The date you would like to replicate data from. Format: YYYY-MM-DD. Any data before this date will not be replicated.
     */
    @JsonProperty("start_date")
    public String startDate;
    public SourceShopify withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
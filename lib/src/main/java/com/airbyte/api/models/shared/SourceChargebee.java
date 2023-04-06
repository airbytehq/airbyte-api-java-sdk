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
 * SourceChargebee - The values required to configure the source.
 */
public class SourceChargebee {
    /**
     * Product Catalog version of your Chargebee site. Instructions on how to find your version you may find &lt;a href="https://apidocs.chargebee.com/docs/api?prod_cat_ver=2"&gt;here&lt;/a&gt; under `API Version` section.
     */
    @JsonProperty("product_catalog")
    public SourceChargebeeProductCatalogEnum productCatalog;
    public SourceChargebee withProductCatalog(SourceChargebeeProductCatalogEnum productCatalog) {
        this.productCatalog = productCatalog;
        return this;
    }
    
    /**
     * The site prefix for your Chargebee instance.
     */
    @JsonProperty("site")
    public String site;
    public SourceChargebee withSite(String site) {
        this.site = site;
        return this;
    }
    
    /**
     * Chargebee API Key. See the &lt;a href="https://docs.airbyte.com/integrations/sources/chargebee"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    @JsonProperty("site_api_key")
    public String siteApiKey;
    public SourceChargebee withSiteApiKey(String siteApiKey) {
        this.siteApiKey = siteApiKey;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceChargebeeChargebeeEnum sourceType;
    public SourceChargebee withSourceType(SourceChargebeeChargebeeEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * UTC date and time in the format 2021-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceChargebee withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
}

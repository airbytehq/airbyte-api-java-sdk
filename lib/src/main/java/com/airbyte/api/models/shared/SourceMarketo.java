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
 * SourceMarketo - The values required to configure the source.
 */

public class SourceMarketo {
    /**
     * The Client ID of your Marketo developer application. See &lt;a href="https://docs.airbyte.com/integrations/sources/marketo"&gt; the docs &lt;/a&gt; for info on how to obtain this.
     */
    @JsonProperty("client_id")
    public String clientId;

    public SourceMarketo withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The Client Secret of your Marketo developer application. See &lt;a href="https://docs.airbyte.com/integrations/sources/marketo"&gt; the docs &lt;/a&gt; for info on how to obtain this.
     */
    @JsonProperty("client_secret")
    public String clientSecret;

    public SourceMarketo withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * Your Marketo Base URL. See &lt;a href="https://docs.airbyte.com/integrations/sources/marketo"&gt; the docs &lt;/a&gt; for info on how to obtain this.
     */
    @JsonProperty("domain_url")
    public String domainUrl;

    public SourceMarketo withDomainUrl(String domainUrl) {
        this.domainUrl = domainUrl;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceMarketoMarketo sourceType;

    public SourceMarketo withSourceType(SourceMarketoMarketo sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;

    public SourceMarketo withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
    public SourceMarketo(@JsonProperty("client_id") String clientId, @JsonProperty("client_secret") String clientSecret, @JsonProperty("domain_url") String domainUrl, @JsonProperty("sourceType") SourceMarketoMarketo sourceType, @JsonProperty("start_date") OffsetDateTime startDate) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.domainUrl = domainUrl;
        this.sourceType = sourceType;
        this.startDate = startDate;
  }
}

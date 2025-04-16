/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

public class SourceEzofficeinventory {

    /**
     * Your EZOfficeInventory Access Token. API Access is disabled by default. Enable API Access in Settings &gt; Integrations &gt; API Integration and click on Update to generate a new access token
     */
    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("sourceType")
    private Ezofficeinventory sourceType;

    /**
     * Earliest date you want to sync historical streams (inventory_histories, asset_histories, asset_stock_histories) from
     */
    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    /**
     * The company name used in signup, also visible in the URL when logged in.
     */
    @JsonProperty("subdomain")
    private String subdomain;

    @JsonCreator
    public SourceEzofficeinventory(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("start_date") OffsetDateTime startDate,
            @JsonProperty("subdomain") String subdomain) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(subdomain, "subdomain");
        this.apiKey = apiKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.subdomain = subdomain;
    }

    /**
     * Your EZOfficeInventory Access Token. API Access is disabled by default. Enable API Access in Settings &gt; Integrations &gt; API Integration and click on Update to generate a new access token
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public Ezofficeinventory sourceType() {
        return sourceType;
    }

    /**
     * Earliest date you want to sync historical streams (inventory_histories, asset_histories, asset_stock_histories) from
     */
    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    /**
     * The company name used in signup, also visible in the URL when logged in.
     */
    @JsonIgnore
    public String subdomain() {
        return subdomain;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Your EZOfficeInventory Access Token. API Access is disabled by default. Enable API Access in Settings &gt; Integrations &gt; API Integration and click on Update to generate a new access token
     */
    public SourceEzofficeinventory withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Earliest date you want to sync historical streams (inventory_histories, asset_histories, asset_stock_histories) from
     */
    public SourceEzofficeinventory withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * The company name used in signup, also visible in the URL when logged in.
     */
    public SourceEzofficeinventory withSubdomain(String subdomain) {
        Utils.checkNotNull(subdomain, "subdomain");
        this.subdomain = subdomain;
        return this;
    }

    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SourceEzofficeinventory other = (SourceEzofficeinventory) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.subdomain, other.subdomain);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            sourceType,
            startDate,
            subdomain);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceEzofficeinventory.class,
                "apiKey", apiKey,
                "sourceType", sourceType,
                "startDate", startDate,
                "subdomain", subdomain);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private OffsetDateTime startDate;
 
        private String subdomain;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Your EZOfficeInventory Access Token. API Access is disabled by default. Enable API Access in Settings &gt; Integrations &gt; API Integration and click on Update to generate a new access token
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Earliest date you want to sync historical streams (inventory_histories, asset_histories, asset_stock_histories) from
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * The company name used in signup, also visible in the URL when logged in.
         */
        public Builder subdomain(String subdomain) {
            Utils.checkNotNull(subdomain, "subdomain");
            this.subdomain = subdomain;
            return this;
        }
        
        public SourceEzofficeinventory build() {
            return new SourceEzofficeinventory(
                apiKey,
                startDate,
                subdomain);
        }

        private static final LazySingletonValue<Ezofficeinventory> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"ezofficeinventory\"",
                        new TypeReference<Ezofficeinventory>() {});
    }
}

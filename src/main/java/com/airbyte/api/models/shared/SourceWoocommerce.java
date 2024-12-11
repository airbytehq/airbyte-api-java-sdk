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
import java.time.LocalDate;
import java.util.Objects;


public class SourceWoocommerce {

    /**
     * Customer Key for API in WooCommerce shop
     */
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * Customer Secret for API in WooCommerce shop
     */
    @JsonProperty("api_secret")
    private String apiSecret;

    /**
     * The name of the store. For https://EXAMPLE.com, the shop name is 'EXAMPLE.com'.
     */
    @JsonProperty("shop")
    private String shop;

    @JsonProperty("sourceType")
    private Woocommerce sourceType;

    /**
     * The date you would like to replicate data from. Format: YYYY-MM-DD
     */
    @JsonProperty("start_date")
    private LocalDate startDate;

    @JsonCreator
    public SourceWoocommerce(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("api_secret") String apiSecret,
            @JsonProperty("shop") String shop,
            @JsonProperty("start_date") LocalDate startDate) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(apiSecret, "apiSecret");
        Utils.checkNotNull(shop, "shop");
        Utils.checkNotNull(startDate, "startDate");
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        this.shop = shop;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }

    /**
     * Customer Key for API in WooCommerce shop
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * Customer Secret for API in WooCommerce shop
     */
    @JsonIgnore
    public String apiSecret() {
        return apiSecret;
    }

    /**
     * The name of the store. For https://EXAMPLE.com, the shop name is 'EXAMPLE.com'.
     */
    @JsonIgnore
    public String shop() {
        return shop;
    }

    @JsonIgnore
    public Woocommerce sourceType() {
        return sourceType;
    }

    /**
     * The date you would like to replicate data from. Format: YYYY-MM-DD
     */
    @JsonIgnore
    public LocalDate startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Customer Key for API in WooCommerce shop
     */
    public SourceWoocommerce withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Customer Secret for API in WooCommerce shop
     */
    public SourceWoocommerce withApiSecret(String apiSecret) {
        Utils.checkNotNull(apiSecret, "apiSecret");
        this.apiSecret = apiSecret;
        return this;
    }

    /**
     * The name of the store. For https://EXAMPLE.com, the shop name is 'EXAMPLE.com'.
     */
    public SourceWoocommerce withShop(String shop) {
        Utils.checkNotNull(shop, "shop");
        this.shop = shop;
        return this;
    }

    /**
     * The date you would like to replicate data from. Format: YYYY-MM-DD
     */
    public SourceWoocommerce withStartDate(LocalDate startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
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
        SourceWoocommerce other = (SourceWoocommerce) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.apiSecret, other.apiSecret) &&
            Objects.deepEquals(this.shop, other.shop) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            apiSecret,
            shop,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceWoocommerce.class,
                "apiKey", apiKey,
                "apiSecret", apiSecret,
                "shop", shop,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private String apiSecret;
 
        private String shop;
 
        private LocalDate startDate;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Customer Key for API in WooCommerce shop
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Customer Secret for API in WooCommerce shop
         */
        public Builder apiSecret(String apiSecret) {
            Utils.checkNotNull(apiSecret, "apiSecret");
            this.apiSecret = apiSecret;
            return this;
        }

        /**
         * The name of the store. For https://EXAMPLE.com, the shop name is 'EXAMPLE.com'.
         */
        public Builder shop(String shop) {
            Utils.checkNotNull(shop, "shop");
            this.shop = shop;
            return this;
        }

        /**
         * The date you would like to replicate data from. Format: YYYY-MM-DD
         */
        public Builder startDate(LocalDate startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceWoocommerce build() {
            return new SourceWoocommerce(
                apiKey,
                apiSecret,
                shop,
                startDate);
        }

        private static final LazySingletonValue<Woocommerce> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"woocommerce\"",
                        new TypeReference<Woocommerce>() {});
    }
}


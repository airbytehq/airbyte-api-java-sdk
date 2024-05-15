/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class SourceDremio {

    /**
     * API Key that is generated when you authenticate to Dremio API
     */
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * URL of your Dremio instance
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("base_url")
    private Optional<? extends String> baseUrl;

    @JsonProperty("sourceType")
    private Dremio sourceType;

    @JsonCreator
    public SourceDremio(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("base_url") Optional<? extends String> baseUrl) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(baseUrl, "baseUrl");
        this.apiKey = apiKey;
        this.baseUrl = baseUrl;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }
    
    public SourceDremio(
            String apiKey) {
        this(apiKey, Optional.empty());
    }

    /**
     * API Key that is generated when you authenticate to Dremio API
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * URL of your Dremio instance
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> baseUrl() {
        return (Optional<String>) baseUrl;
    }

    @JsonIgnore
    public Dremio sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API Key that is generated when you authenticate to Dremio API
     */
    public SourceDremio withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * URL of your Dremio instance
     */
    public SourceDremio withBaseUrl(String baseUrl) {
        Utils.checkNotNull(baseUrl, "baseUrl");
        this.baseUrl = Optional.ofNullable(baseUrl);
        return this;
    }

    /**
     * URL of your Dremio instance
     */
    public SourceDremio withBaseUrl(Optional<? extends String> baseUrl) {
        Utils.checkNotNull(baseUrl, "baseUrl");
        this.baseUrl = baseUrl;
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
        SourceDremio other = (SourceDremio) o;
        return 
            java.util.Objects.deepEquals(this.apiKey, other.apiKey) &&
            java.util.Objects.deepEquals(this.baseUrl, other.baseUrl) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKey,
            baseUrl,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceDremio.class,
                "apiKey", apiKey,
                "baseUrl", baseUrl,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<? extends String> baseUrl;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API Key that is generated when you authenticate to Dremio API
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * URL of your Dremio instance
         */
        public Builder baseUrl(String baseUrl) {
            Utils.checkNotNull(baseUrl, "baseUrl");
            this.baseUrl = Optional.ofNullable(baseUrl);
            return this;
        }

        /**
         * URL of your Dremio instance
         */
        public Builder baseUrl(Optional<? extends String> baseUrl) {
            Utils.checkNotNull(baseUrl, "baseUrl");
            this.baseUrl = baseUrl;
            return this;
        }
        
        public SourceDremio build() {
            if (baseUrl == null) {
                baseUrl = _SINGLETON_VALUE_BaseUrl.value();
            }
            return new SourceDremio(
                apiKey,
                baseUrl);
        }

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_BaseUrl =
                new LazySingletonValue<>(
                        "base_url",
                        "\"https://app.dremio.cloud\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<Dremio> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"dremio\"",
                        new TypeReference<Dremio>() {});
    }
}

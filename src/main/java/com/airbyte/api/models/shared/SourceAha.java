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
import java.util.Objects;


public class SourceAha {

    /**
     * API Key
     */
    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("sourceType")
    private Aha sourceType;

    /**
     * URL
     */
    @JsonProperty("url")
    private String url;

    @JsonCreator
    public SourceAha(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("url") String url) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(url, "url");
        this.apiKey = apiKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.url = url;
    }

    /**
     * API Key
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public Aha sourceType() {
        return sourceType;
    }

    /**
     * URL
     */
    @JsonIgnore
    public String url() {
        return url;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API Key
     */
    public SourceAha withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * URL
     */
    public SourceAha withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
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
        SourceAha other = (SourceAha) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.url, other.url);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            sourceType,
            url);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceAha.class,
                "apiKey", apiKey,
                "sourceType", sourceType,
                "url", url);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private String url;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API Key
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * URL
         */
        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }
        
        public SourceAha build() {
            return new SourceAha(
                apiKey,
                url);
        }

        private static final LazySingletonValue<Aha> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"aha\"",
                        new TypeReference<Aha>() {});
    }
}


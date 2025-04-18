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

public class SourceThinkific {

    /**
     * Your Thinkific API key for authentication.
     */
    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("sourceType")
    private Thinkific sourceType;

    /**
     * The subdomain of your Thinkific URL (e.g., if your URL is example.thinkific.com, your subdomain is "example".
     */
    @JsonProperty("subdomain")
    private String subdomain;

    @JsonCreator
    public SourceThinkific(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("subdomain") String subdomain) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(subdomain, "subdomain");
        this.apiKey = apiKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.subdomain = subdomain;
    }

    /**
     * Your Thinkific API key for authentication.
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public Thinkific sourceType() {
        return sourceType;
    }

    /**
     * The subdomain of your Thinkific URL (e.g., if your URL is example.thinkific.com, your subdomain is "example".
     */
    @JsonIgnore
    public String subdomain() {
        return subdomain;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Your Thinkific API key for authentication.
     */
    public SourceThinkific withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * The subdomain of your Thinkific URL (e.g., if your URL is example.thinkific.com, your subdomain is "example".
     */
    public SourceThinkific withSubdomain(String subdomain) {
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
        SourceThinkific other = (SourceThinkific) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.subdomain, other.subdomain);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            sourceType,
            subdomain);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceThinkific.class,
                "apiKey", apiKey,
                "sourceType", sourceType,
                "subdomain", subdomain);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private String subdomain;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Your Thinkific API key for authentication.
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * The subdomain of your Thinkific URL (e.g., if your URL is example.thinkific.com, your subdomain is "example".
         */
        public Builder subdomain(String subdomain) {
            Utils.checkNotNull(subdomain, "subdomain");
            this.subdomain = subdomain;
            return this;
        }
        
        public SourceThinkific build() {
            return new SourceThinkific(
                apiKey,
                subdomain);
        }

        private static final LazySingletonValue<Thinkific> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"thinkific\"",
                        new TypeReference<Thinkific>() {});
    }
}

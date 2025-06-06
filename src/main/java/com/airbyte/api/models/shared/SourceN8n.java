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

public class SourceN8n {

    /**
     * Your API KEY. See &lt;a href="https://docs.n8n.io/api/authentication"&gt;here&lt;/a&gt;
     */
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * Hostname of the n8n instance
     */
    @JsonProperty("host")
    private String host;

    @JsonProperty("sourceType")
    private N8n sourceType;

    @JsonCreator
    public SourceN8n(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("host") String host) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(host, "host");
        this.apiKey = apiKey;
        this.host = host;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * Your API KEY. See &lt;a href="https://docs.n8n.io/api/authentication"&gt;here&lt;/a&gt;
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * Hostname of the n8n instance
     */
    @JsonIgnore
    public String host() {
        return host;
    }

    @JsonIgnore
    public N8n sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Your API KEY. See &lt;a href="https://docs.n8n.io/api/authentication"&gt;here&lt;/a&gt;
     */
    public SourceN8n withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Hostname of the n8n instance
     */
    public SourceN8n withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
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
        SourceN8n other = (SourceN8n) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.host, other.host) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            host,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceN8n.class,
                "apiKey", apiKey,
                "host", host,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private String host;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Your API KEY. See &lt;a href="https://docs.n8n.io/api/authentication"&gt;here&lt;/a&gt;
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Hostname of the n8n instance
         */
        public Builder host(String host) {
            Utils.checkNotNull(host, "host");
            this.host = host;
            return this;
        }
        
        public SourceN8n build() {
            return new SourceN8n(
                apiKey,
                host);
        }

        private static final LazySingletonValue<N8n> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"n8n\"",
                        new TypeReference<N8n>() {});
    }
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;


public class SourceDelighted {

    /**
     * A Delighted API key.
     */
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * The date from which you'd like to replicate the data
     */
    @JsonProperty("since")
    private OffsetDateTime since;

    @JsonProperty("sourceType")
    private Delighted sourceType;

    public SourceDelighted(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("since") OffsetDateTime since) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(since, "since");
        this.apiKey = apiKey;
        this.since = since;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * A Delighted API key.
     */
    public String apiKey() {
        return apiKey;
    }

    /**
     * The date from which you'd like to replicate the data
     */
    public OffsetDateTime since() {
        return since;
    }

    public Delighted sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A Delighted API key.
     */
    public SourceDelighted withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * The date from which you'd like to replicate the data
     */
    public SourceDelighted withSince(OffsetDateTime since) {
        Utils.checkNotNull(since, "since");
        this.since = since;
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
        SourceDelighted other = (SourceDelighted) o;
        return 
            java.util.Objects.deepEquals(this.apiKey, other.apiKey) &&
            java.util.Objects.deepEquals(this.since, other.since) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKey,
            since,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceDelighted.class,
                "apiKey", apiKey,
                "since", since,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private OffsetDateTime since;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A Delighted API key.
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * The date from which you'd like to replicate the data
         */
        public Builder since(OffsetDateTime since) {
            Utils.checkNotNull(since, "since");
            this.since = since;
            return this;
        }
        
        public SourceDelighted build() {
            return new SourceDelighted(
                apiKey,
                since);
        }

        private static final LazySingletonValue<Delighted> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"delighted\"",
                        new TypeReference<Delighted>() {});
    }
}


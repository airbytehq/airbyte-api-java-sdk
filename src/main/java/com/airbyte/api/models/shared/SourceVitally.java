/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class SourceVitally {

    /**
     * The API Token for a Vitally account.
     */
    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("sourceType")
    private Vitally sourceType;

    /**
     * Status of the Vitally accounts. One of the following values; active, churned, activeOrChurned.
     */
    @JsonProperty("status")
    private SourceVitallyStatus status;

    @JsonCreator
    public SourceVitally(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("status") SourceVitallyStatus status) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(status, "status");
        this.apiKey = apiKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.status = status;
    }

    /**
     * The API Token for a Vitally account.
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public Vitally sourceType() {
        return sourceType;
    }

    /**
     * Status of the Vitally accounts. One of the following values; active, churned, activeOrChurned.
     */
    @JsonIgnore
    public SourceVitallyStatus status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The API Token for a Vitally account.
     */
    public SourceVitally withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Status of the Vitally accounts. One of the following values; active, churned, activeOrChurned.
     */
    public SourceVitally withStatus(SourceVitallyStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        SourceVitally other = (SourceVitally) o;
        return 
            java.util.Objects.deepEquals(this.apiKey, other.apiKey) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKey,
            sourceType,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceVitally.class,
                "apiKey", apiKey,
                "sourceType", sourceType,
                "status", status);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private SourceVitallyStatus status;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The API Token for a Vitally account.
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Status of the Vitally accounts. One of the following values; active, churned, activeOrChurned.
         */
        public Builder status(SourceVitallyStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public SourceVitally build() {
            return new SourceVitally(
                apiKey,
                status);
        }

        private static final LazySingletonValue<Vitally> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"vitally\"",
                        new TypeReference<Vitally>() {});
    }
}


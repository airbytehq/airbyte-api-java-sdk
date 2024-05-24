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

public class SourceHubplanner {

    /**
     * Hubplanner API key. See https://github.com/hubplanner/API#authentication for more details.
     */
    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("sourceType")
    private Hubplanner sourceType;

    @JsonCreator
    public SourceHubplanner(
            @JsonProperty("api_key") String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * Hubplanner API key. See https://github.com/hubplanner/API#authentication for more details.
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public Hubplanner sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Hubplanner API key. See https://github.com/hubplanner/API#authentication for more details.
     */
    public SourceHubplanner withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
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
        SourceHubplanner other = (SourceHubplanner) o;
        return 
            java.util.Objects.deepEquals(this.apiKey, other.apiKey) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKey,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceHubplanner.class,
                "apiKey", apiKey,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiKey;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Hubplanner API key. See https://github.com/hubplanner/API#authentication for more details.
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }
        
        public SourceHubplanner build() {
            return new SourceHubplanner(
                apiKey);
        }

        private static final LazySingletonValue<Hubplanner> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"hubplanner\"",
                        new TypeReference<Hubplanner>() {});
    }
}


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

public class SourceTickettailor {

    /**
     * API key to use. Find it at https://www.getdrip.com/user/edit
     */
    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("sourceType")
    private Tickettailor sourceType;

    @JsonCreator
    public SourceTickettailor(
            @JsonProperty("api_key") String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * API key to use. Find it at https://www.getdrip.com/user/edit
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public Tickettailor sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * API key to use. Find it at https://www.getdrip.com/user/edit
     */
    public SourceTickettailor withApiKey(String apiKey) {
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
        SourceTickettailor other = (SourceTickettailor) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceTickettailor.class,
                "apiKey", apiKey,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiKey;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API key to use. Find it at https://www.getdrip.com/user/edit
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }
        
        public SourceTickettailor build() {
            return new SourceTickettailor(
                apiKey);
        }

        private static final LazySingletonValue<Tickettailor> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"tickettailor\"",
                        new TypeReference<Tickettailor>() {});
    }
}

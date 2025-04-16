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

public class SourceInvoiced {

    /**
     * API key to use. Find it at https://invoiced.com/account
     */
    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("sourceType")
    private Invoiced sourceType;

    @JsonCreator
    public SourceInvoiced(
            @JsonProperty("api_key") String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * API key to use. Find it at https://invoiced.com/account
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public Invoiced sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * API key to use. Find it at https://invoiced.com/account
     */
    public SourceInvoiced withApiKey(String apiKey) {
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
        SourceInvoiced other = (SourceInvoiced) o;
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
        return Utils.toString(SourceInvoiced.class,
                "apiKey", apiKey,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiKey;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API key to use. Find it at https://invoiced.com/account
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }
        
        public SourceInvoiced build() {
            return new SourceInvoiced(
                apiKey);
        }

        private static final LazySingletonValue<Invoiced> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"invoiced\"",
                        new TypeReference<Invoiced>() {});
    }
}

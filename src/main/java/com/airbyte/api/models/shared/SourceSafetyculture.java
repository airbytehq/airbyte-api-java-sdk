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


public class SourceSafetyculture {

    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("sourceType")
    private Safetyculture sourceType;

    @JsonCreator
    public SourceSafetyculture(
            @JsonProperty("api_key") String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public Safetyculture sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceSafetyculture withApiKey(String apiKey) {
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
        SourceSafetyculture other = (SourceSafetyculture) o;
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
        return Utils.toString(SourceSafetyculture.class,
                "apiKey", apiKey,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiKey;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }
        
        public SourceSafetyculture build() {
            return new SourceSafetyculture(
                apiKey);
        }

        private static final LazySingletonValue<Safetyculture> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"safetyculture\"",
                        new TypeReference<Safetyculture>() {});
    }
}


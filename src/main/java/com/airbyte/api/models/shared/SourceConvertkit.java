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

public class SourceConvertkit {

    /**
     * API Secret
     */
    @JsonProperty("api_secret")
    private String apiSecret;

    @JsonProperty("sourceType")
    private Convertkit sourceType;

    @JsonCreator
    public SourceConvertkit(
            @JsonProperty("api_secret") String apiSecret) {
        Utils.checkNotNull(apiSecret, "apiSecret");
        this.apiSecret = apiSecret;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * API Secret
     */
    @JsonIgnore
    public String apiSecret() {
        return apiSecret;
    }

    @JsonIgnore
    public Convertkit sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * API Secret
     */
    public SourceConvertkit withApiSecret(String apiSecret) {
        Utils.checkNotNull(apiSecret, "apiSecret");
        this.apiSecret = apiSecret;
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
        SourceConvertkit other = (SourceConvertkit) o;
        return 
            Objects.deepEquals(this.apiSecret, other.apiSecret) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiSecret,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceConvertkit.class,
                "apiSecret", apiSecret,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiSecret;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API Secret
         */
        public Builder apiSecret(String apiSecret) {
            Utils.checkNotNull(apiSecret, "apiSecret");
            this.apiSecret = apiSecret;
            return this;
        }
        
        public SourceConvertkit build() {
            return new SourceConvertkit(
                apiSecret);
        }

        private static final LazySingletonValue<Convertkit> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"convertkit\"",
                        new TypeReference<Convertkit>() {});
    }
}

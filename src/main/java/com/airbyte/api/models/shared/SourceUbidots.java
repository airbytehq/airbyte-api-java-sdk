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


public class SourceUbidots {

    /**
     * API token to use for authentication. Obtain it from your Ubidots account.
     */
    @JsonProperty("api_token")
    private String apiToken;

    @JsonProperty("sourceType")
    private Ubidots sourceType;

    @JsonCreator
    public SourceUbidots(
            @JsonProperty("api_token") String apiToken) {
        Utils.checkNotNull(apiToken, "apiToken");
        this.apiToken = apiToken;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * API token to use for authentication. Obtain it from your Ubidots account.
     */
    @JsonIgnore
    public String apiToken() {
        return apiToken;
    }

    @JsonIgnore
    public Ubidots sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API token to use for authentication. Obtain it from your Ubidots account.
     */
    public SourceUbidots withApiToken(String apiToken) {
        Utils.checkNotNull(apiToken, "apiToken");
        this.apiToken = apiToken;
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
        SourceUbidots other = (SourceUbidots) o;
        return 
            Objects.deepEquals(this.apiToken, other.apiToken) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiToken,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceUbidots.class,
                "apiToken", apiToken,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiToken;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API token to use for authentication. Obtain it from your Ubidots account.
         */
        public Builder apiToken(String apiToken) {
            Utils.checkNotNull(apiToken, "apiToken");
            this.apiToken = apiToken;
            return this;
        }
        
        public SourceUbidots build() {
            return new SourceUbidots(
                apiToken);
        }

        private static final LazySingletonValue<Ubidots> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"ubidots\"",
                        new TypeReference<Ubidots>() {});
    }
}


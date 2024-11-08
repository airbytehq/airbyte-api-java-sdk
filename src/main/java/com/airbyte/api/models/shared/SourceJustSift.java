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

public class SourceJustSift {

    /**
     * API token to use for accessing the Sift API. Obtain this token from your Sift account administrator.
     */
    @JsonProperty("api_token")
    private String apiToken;

    @JsonProperty("sourceType")
    private JustSift sourceType;

    @JsonCreator
    public SourceJustSift(
            @JsonProperty("api_token") String apiToken) {
        Utils.checkNotNull(apiToken, "apiToken");
        this.apiToken = apiToken;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * API token to use for accessing the Sift API. Obtain this token from your Sift account administrator.
     */
    @JsonIgnore
    public String apiToken() {
        return apiToken;
    }

    @JsonIgnore
    public JustSift sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API token to use for accessing the Sift API. Obtain this token from your Sift account administrator.
     */
    public SourceJustSift withApiToken(String apiToken) {
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
        SourceJustSift other = (SourceJustSift) o;
        return 
            java.util.Objects.deepEquals(this.apiToken, other.apiToken) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiToken,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceJustSift.class,
                "apiToken", apiToken,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiToken;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API token to use for accessing the Sift API. Obtain this token from your Sift account administrator.
         */
        public Builder apiToken(String apiToken) {
            Utils.checkNotNull(apiToken, "apiToken");
            this.apiToken = apiToken;
            return this;
        }
        
        public SourceJustSift build() {
            return new SourceJustSift(
                apiToken);
        }

        private static final LazySingletonValue<JustSift> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"just-sift\"",
                        new TypeReference<JustSift>() {});
    }
}


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

public class SourceEmailoctopus {

    /**
     * EmailOctopus API Key. See the &lt;a href="https://help.emailoctopus.com/article/165-how-to-create-and-delete-api-keys"&gt;docs&lt;/a&gt; for information on how to generate this key.
     */
    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("sourceType")
    private Emailoctopus sourceType;

    @JsonCreator
    public SourceEmailoctopus(
            @JsonProperty("api_key") String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * EmailOctopus API Key. See the &lt;a href="https://help.emailoctopus.com/article/165-how-to-create-and-delete-api-keys"&gt;docs&lt;/a&gt; for information on how to generate this key.
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public Emailoctopus sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * EmailOctopus API Key. See the &lt;a href="https://help.emailoctopus.com/article/165-how-to-create-and-delete-api-keys"&gt;docs&lt;/a&gt; for information on how to generate this key.
     */
    public SourceEmailoctopus withApiKey(String apiKey) {
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
        SourceEmailoctopus other = (SourceEmailoctopus) o;
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
        return Utils.toString(SourceEmailoctopus.class,
                "apiKey", apiKey,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiKey;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * EmailOctopus API Key. See the &lt;a href="https://help.emailoctopus.com/article/165-how-to-create-and-delete-api-keys"&gt;docs&lt;/a&gt; for information on how to generate this key.
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }
        
        public SourceEmailoctopus build() {
            return new SourceEmailoctopus(
                apiKey);
        }

        private static final LazySingletonValue<Emailoctopus> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"emailoctopus\"",
                        new TypeReference<Emailoctopus>() {});
    }
}


/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class SourceAppfollow {

    /**
     * API Key provided by Appfollow
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("api_secret")
    private Optional<? extends String> apiSecret;

    @JsonProperty("sourceType")
    private Appfollow sourceType;

    @JsonCreator
    public SourceAppfollow(
            @JsonProperty("api_secret") Optional<? extends String> apiSecret) {
        Utils.checkNotNull(apiSecret, "apiSecret");
        this.apiSecret = apiSecret;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }
    
    public SourceAppfollow() {
        this(Optional.empty());
    }

    /**
     * API Key provided by Appfollow
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> apiSecret() {
        return (Optional<String>) apiSecret;
    }

    @JsonIgnore
    public Appfollow sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API Key provided by Appfollow
     */
    public SourceAppfollow withApiSecret(String apiSecret) {
        Utils.checkNotNull(apiSecret, "apiSecret");
        this.apiSecret = Optional.ofNullable(apiSecret);
        return this;
    }

    /**
     * API Key provided by Appfollow
     */
    public SourceAppfollow withApiSecret(Optional<? extends String> apiSecret) {
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
        SourceAppfollow other = (SourceAppfollow) o;
        return 
            java.util.Objects.deepEquals(this.apiSecret, other.apiSecret) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiSecret,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceAppfollow.class,
                "apiSecret", apiSecret,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> apiSecret = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API Key provided by Appfollow
         */
        public Builder apiSecret(String apiSecret) {
            Utils.checkNotNull(apiSecret, "apiSecret");
            this.apiSecret = Optional.ofNullable(apiSecret);
            return this;
        }

        /**
         * API Key provided by Appfollow
         */
        public Builder apiSecret(Optional<? extends String> apiSecret) {
            Utils.checkNotNull(apiSecret, "apiSecret");
            this.apiSecret = apiSecret;
            return this;
        }
        
        public SourceAppfollow build() {
            return new SourceAppfollow(
                apiSecret);
        }

        private static final LazySingletonValue<Appfollow> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"appfollow\"",
                        new TypeReference<Appfollow>() {});
    }
}


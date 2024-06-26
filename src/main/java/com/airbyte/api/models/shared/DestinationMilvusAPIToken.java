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
/**
 * DestinationMilvusAPIToken - Authenticate using an API token (suitable for Zilliz Cloud)
 */

public class DestinationMilvusAPIToken {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends DestinationMilvusSchemasIndexingMode> mode;

    /**
     * API Token for the Milvus instance
     */
    @JsonProperty("token")
    private String token;

    @JsonCreator
    public DestinationMilvusAPIToken(
            @JsonProperty("token") String token) {
        Utils.checkNotNull(token, "token");
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
        this.token = token;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationMilvusSchemasIndexingMode> mode() {
        return (Optional<DestinationMilvusSchemasIndexingMode>) mode;
    }

    /**
     * API Token for the Milvus instance
     */
    @JsonIgnore
    public String token() {
        return token;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API Token for the Milvus instance
     */
    public DestinationMilvusAPIToken withToken(String token) {
        Utils.checkNotNull(token, "token");
        this.token = token;
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
        DestinationMilvusAPIToken other = (DestinationMilvusAPIToken) o;
        return 
            java.util.Objects.deepEquals(this.mode, other.mode) &&
            java.util.Objects.deepEquals(this.token, other.token);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            mode,
            token);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationMilvusAPIToken.class,
                "mode", mode,
                "token", token);
    }
    
    public final static class Builder {
 
        private String token;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API Token for the Milvus instance
         */
        public Builder token(String token) {
            Utils.checkNotNull(token, "token");
            this.token = token;
            return this;
        }
        
        public DestinationMilvusAPIToken build() {
            return new DestinationMilvusAPIToken(
                token);
        }

        private static final LazySingletonValue<Optional<? extends DestinationMilvusSchemasIndexingMode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"token\"",
                        new TypeReference<Optional<? extends DestinationMilvusSchemasIndexingMode>>() {});
    }
}


/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class SourceZoom {

    /**
     * JWT Token
     */
    @JsonProperty("jwt_token")
    private String jwtToken;

    @JsonProperty("sourceType")
    private Zoom sourceType;

    public SourceZoom(
            @JsonProperty("jwt_token") String jwtToken) {
        Utils.checkNotNull(jwtToken, "jwtToken");
        this.jwtToken = jwtToken;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * JWT Token
     */
    public String jwtToken() {
        return jwtToken;
    }

    public Zoom sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * JWT Token
     */
    public SourceZoom withJwtToken(String jwtToken) {
        Utils.checkNotNull(jwtToken, "jwtToken");
        this.jwtToken = jwtToken;
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
        SourceZoom other = (SourceZoom) o;
        return 
            java.util.Objects.deepEquals(this.jwtToken, other.jwtToken) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            jwtToken,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceZoom.class,
                "jwtToken", jwtToken,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String jwtToken;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * JWT Token
         */
        public Builder jwtToken(String jwtToken) {
            Utils.checkNotNull(jwtToken, "jwtToken");
            this.jwtToken = jwtToken;
            return this;
        }
        
        public SourceZoom build() {
            return new SourceZoom(
                jwtToken);
        }

        private static final LazySingletonValue<Zoom> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"zoom\"",
                        new TypeReference<Zoom>() {});
    }
}


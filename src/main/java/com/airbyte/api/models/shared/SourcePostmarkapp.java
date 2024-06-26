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

public class SourcePostmarkapp {

    /**
     * API Key for account
     */
    @JsonProperty("X-Postmark-Account-Token")
    private String xPostmarkAccountToken;

    /**
     * API Key for server
     */
    @JsonProperty("X-Postmark-Server-Token")
    private String xPostmarkServerToken;

    @JsonProperty("sourceType")
    private Postmarkapp sourceType;

    @JsonCreator
    public SourcePostmarkapp(
            @JsonProperty("X-Postmark-Account-Token") String xPostmarkAccountToken,
            @JsonProperty("X-Postmark-Server-Token") String xPostmarkServerToken) {
        Utils.checkNotNull(xPostmarkAccountToken, "xPostmarkAccountToken");
        Utils.checkNotNull(xPostmarkServerToken, "xPostmarkServerToken");
        this.xPostmarkAccountToken = xPostmarkAccountToken;
        this.xPostmarkServerToken = xPostmarkServerToken;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * API Key for account
     */
    @JsonIgnore
    public String xPostmarkAccountToken() {
        return xPostmarkAccountToken;
    }

    /**
     * API Key for server
     */
    @JsonIgnore
    public String xPostmarkServerToken() {
        return xPostmarkServerToken;
    }

    @JsonIgnore
    public Postmarkapp sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API Key for account
     */
    public SourcePostmarkapp withXPostmarkAccountToken(String xPostmarkAccountToken) {
        Utils.checkNotNull(xPostmarkAccountToken, "xPostmarkAccountToken");
        this.xPostmarkAccountToken = xPostmarkAccountToken;
        return this;
    }

    /**
     * API Key for server
     */
    public SourcePostmarkapp withXPostmarkServerToken(String xPostmarkServerToken) {
        Utils.checkNotNull(xPostmarkServerToken, "xPostmarkServerToken");
        this.xPostmarkServerToken = xPostmarkServerToken;
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
        SourcePostmarkapp other = (SourcePostmarkapp) o;
        return 
            java.util.Objects.deepEquals(this.xPostmarkAccountToken, other.xPostmarkAccountToken) &&
            java.util.Objects.deepEquals(this.xPostmarkServerToken, other.xPostmarkServerToken) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            xPostmarkAccountToken,
            xPostmarkServerToken,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourcePostmarkapp.class,
                "xPostmarkAccountToken", xPostmarkAccountToken,
                "xPostmarkServerToken", xPostmarkServerToken,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String xPostmarkAccountToken;
 
        private String xPostmarkServerToken;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API Key for account
         */
        public Builder xPostmarkAccountToken(String xPostmarkAccountToken) {
            Utils.checkNotNull(xPostmarkAccountToken, "xPostmarkAccountToken");
            this.xPostmarkAccountToken = xPostmarkAccountToken;
            return this;
        }

        /**
         * API Key for server
         */
        public Builder xPostmarkServerToken(String xPostmarkServerToken) {
            Utils.checkNotNull(xPostmarkServerToken, "xPostmarkServerToken");
            this.xPostmarkServerToken = xPostmarkServerToken;
            return this;
        }
        
        public SourcePostmarkapp build() {
            return new SourcePostmarkapp(
                xPostmarkAccountToken,
                xPostmarkServerToken);
        }

        private static final LazySingletonValue<Postmarkapp> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"postmarkapp\"",
                        new TypeReference<Postmarkapp>() {});
    }
}


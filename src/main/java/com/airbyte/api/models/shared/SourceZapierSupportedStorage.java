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

public class SourceZapierSupportedStorage {

    /**
     * Secret key supplied by zapier
     */
    @JsonProperty("secret")
    private String secret;

    @JsonProperty("sourceType")
    private ZapierSupportedStorage sourceType;

    @JsonCreator
    public SourceZapierSupportedStorage(
            @JsonProperty("secret") String secret) {
        Utils.checkNotNull(secret, "secret");
        this.secret = secret;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * Secret key supplied by zapier
     */
    @JsonIgnore
    public String secret() {
        return secret;
    }

    @JsonIgnore
    public ZapierSupportedStorage sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Secret key supplied by zapier
     */
    public SourceZapierSupportedStorage withSecret(String secret) {
        Utils.checkNotNull(secret, "secret");
        this.secret = secret;
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
        SourceZapierSupportedStorage other = (SourceZapierSupportedStorage) o;
        return 
            Objects.deepEquals(this.secret, other.secret) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            secret,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceZapierSupportedStorage.class,
                "secret", secret,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String secret;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Secret key supplied by zapier
         */
        public Builder secret(String secret) {
            Utils.checkNotNull(secret, "secret");
            this.secret = secret;
            return this;
        }
        
        public SourceZapierSupportedStorage build() {
            return new SourceZapierSupportedStorage(
                secret);
        }

        private static final LazySingletonValue<ZapierSupportedStorage> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"zapier-supported-storage\"",
                        new TypeReference<ZapierSupportedStorage>() {});
    }
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class DestinationS3GlueGZIP {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_type")
    private Optional<? extends DestinationS3GlueSchemasCompressionType> compressionType;

    public DestinationS3GlueGZIP(
            @JsonProperty("compression_type") Optional<? extends DestinationS3GlueSchemasCompressionType> compressionType) {
        Utils.checkNotNull(compressionType, "compressionType");
        this.compressionType = compressionType;
    }

    public Optional<? extends DestinationS3GlueSchemasCompressionType> compressionType() {
        return compressionType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DestinationS3GlueGZIP withCompressionType(DestinationS3GlueSchemasCompressionType compressionType) {
        Utils.checkNotNull(compressionType, "compressionType");
        this.compressionType = Optional.ofNullable(compressionType);
        return this;
    }

    public DestinationS3GlueGZIP withCompressionType(Optional<? extends DestinationS3GlueSchemasCompressionType> compressionType) {
        Utils.checkNotNull(compressionType, "compressionType");
        this.compressionType = compressionType;
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
        DestinationS3GlueGZIP other = (DestinationS3GlueGZIP) o;
        return 
            java.util.Objects.deepEquals(this.compressionType, other.compressionType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            compressionType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationS3GlueGZIP.class,
                "compressionType", compressionType);
    }
    
    public final static class Builder {
 
        private Optional<? extends DestinationS3GlueSchemasCompressionType> compressionType;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder compressionType(DestinationS3GlueSchemasCompressionType compressionType) {
            Utils.checkNotNull(compressionType, "compressionType");
            this.compressionType = Optional.ofNullable(compressionType);
            return this;
        }

        public Builder compressionType(Optional<? extends DestinationS3GlueSchemasCompressionType> compressionType) {
            Utils.checkNotNull(compressionType, "compressionType");
            this.compressionType = compressionType;
            return this;
        }
        
        public DestinationS3GlueGZIP build() {
            if (compressionType == null) {
                compressionType = _SINGLETON_VALUE_CompressionType.value();
            }
            return new DestinationS3GlueGZIP(
                compressionType);
        }

        private static final LazySingletonValue<Optional<? extends DestinationS3GlueSchemasCompressionType>> _SINGLETON_VALUE_CompressionType =
                new LazySingletonValue<>(
                        "compression_type",
                        "\"GZIP\"",
                        new TypeReference<Optional<? extends DestinationS3GlueSchemasCompressionType>>() {});
    }
}


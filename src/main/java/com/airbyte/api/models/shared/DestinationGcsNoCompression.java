/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;


import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class DestinationGcsNoCompression {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_type")
    private Optional<? extends CompressionType> compressionType;

    @JsonCreator
    public DestinationGcsNoCompression(
            @JsonProperty("compression_type") Optional<? extends CompressionType> compressionType) {
        Utils.checkNotNull(compressionType, "compressionType");
        this.compressionType = compressionType;
    }
    
    public DestinationGcsNoCompression() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CompressionType> compressionType() {
        return (Optional<CompressionType>) compressionType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DestinationGcsNoCompression withCompressionType(CompressionType compressionType) {
        Utils.checkNotNull(compressionType, "compressionType");
        this.compressionType = Optional.ofNullable(compressionType);
        return this;
    }

    public DestinationGcsNoCompression withCompressionType(Optional<? extends CompressionType> compressionType) {
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
        DestinationGcsNoCompression other = (DestinationGcsNoCompression) o;
        return 
            Objects.deepEquals(this.compressionType, other.compressionType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            compressionType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationGcsNoCompression.class,
                "compressionType", compressionType);
    }
    
    public final static class Builder {
 
        private Optional<? extends CompressionType> compressionType;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder compressionType(CompressionType compressionType) {
            Utils.checkNotNull(compressionType, "compressionType");
            this.compressionType = Optional.ofNullable(compressionType);
            return this;
        }

        public Builder compressionType(Optional<? extends CompressionType> compressionType) {
            Utils.checkNotNull(compressionType, "compressionType");
            this.compressionType = compressionType;
            return this;
        }
        
        public DestinationGcsNoCompression build() {
            if (compressionType == null) {
                compressionType = _SINGLETON_VALUE_CompressionType.value();
            }            return new DestinationGcsNoCompression(
                compressionType);
        }

        private static final LazySingletonValue<Optional<? extends CompressionType>> _SINGLETON_VALUE_CompressionType =
                new LazySingletonValue<>(
                        "compression_type",
                        "\"No Compression\"",
                        new TypeReference<Optional<? extends CompressionType>>() {});
    }
}


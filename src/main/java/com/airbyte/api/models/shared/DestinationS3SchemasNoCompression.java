/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class DestinationS3SchemasNoCompression {

    @JsonIgnore
    private Map<String, Object> additionalProperties;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_type")
    private Optional<? extends DestinationS3SchemasFormatCompressionType> compressionType;

    @JsonCreator
    public DestinationS3SchemasNoCompression(
            @JsonProperty("compression_type") Optional<? extends DestinationS3SchemasFormatCompressionType> compressionType) {
        Utils.checkNotNull(compressionType, "compressionType");
        this.additionalProperties = new HashMap<>();
        this.compressionType = compressionType;
    }
    
    public DestinationS3SchemasNoCompression() {
        this(Optional.empty());
    }

    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return additionalProperties;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationS3SchemasFormatCompressionType> compressionType() {
        return (Optional<DestinationS3SchemasFormatCompressionType>) compressionType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    @JsonAnySetter
    public DestinationS3SchemasNoCompression withAdditionalProperty(String key, Object value) {
        // note that value can be null because of the way JsonAnySetter works
        Utils.checkNotNull(key, "key");
        additionalProperties.put(key, value); 
        return this;
    }    

    public DestinationS3SchemasNoCompression withAdditionalProperties(Map<String, Object> additionalProperties) {
        Utils.checkNotNull(additionalProperties, "additionalProperties");
        this.additionalProperties = additionalProperties;
        return this;
    }

    public DestinationS3SchemasNoCompression withCompressionType(DestinationS3SchemasFormatCompressionType compressionType) {
        Utils.checkNotNull(compressionType, "compressionType");
        this.compressionType = Optional.ofNullable(compressionType);
        return this;
    }

    public DestinationS3SchemasNoCompression withCompressionType(Optional<? extends DestinationS3SchemasFormatCompressionType> compressionType) {
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
        DestinationS3SchemasNoCompression other = (DestinationS3SchemasNoCompression) o;
        return 
            Objects.deepEquals(this.additionalProperties, other.additionalProperties) &&
            Objects.deepEquals(this.compressionType, other.compressionType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            additionalProperties,
            compressionType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationS3SchemasNoCompression.class,
                "additionalProperties", additionalProperties,
                "compressionType", compressionType);
    }
    
    public final static class Builder {
 
        private Map<String, Object> additionalProperties = new HashMap<>();
 
        private Optional<? extends DestinationS3SchemasFormatCompressionType> compressionType;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder additionalProperty(String key, Object value) {
            Utils.checkNotNull(key, "key");
            // we could be strict about null values (force the user
            // to pass `JsonNullable.of(null)`) but likely to be a bit 
            // annoying for additional properties building so we'll 
            // relax preconditions.
            this.additionalProperties.put(key, value);
            return this;
        }

        public Builder additionalProperties(Map<String, Object> additionalProperties) {
            Utils.checkNotNull(additionalProperties, "additionalProperties");
            this.additionalProperties = additionalProperties;
            return this;
        }

        public Builder compressionType(DestinationS3SchemasFormatCompressionType compressionType) {
            Utils.checkNotNull(compressionType, "compressionType");
            this.compressionType = Optional.ofNullable(compressionType);
            return this;
        }

        public Builder compressionType(Optional<? extends DestinationS3SchemasFormatCompressionType> compressionType) {
            Utils.checkNotNull(compressionType, "compressionType");
            this.compressionType = compressionType;
            return this;
        }
        
        public DestinationS3SchemasNoCompression build() {
            if (compressionType == null) {
                compressionType = _SINGLETON_VALUE_CompressionType.value();
            }
            return new DestinationS3SchemasNoCompression(
                compressionType)
                .withAdditionalProperties(additionalProperties);
        }

        private static final LazySingletonValue<Optional<? extends DestinationS3SchemasFormatCompressionType>> _SINGLETON_VALUE_CompressionType =
                new LazySingletonValue<>(
                        "compression_type",
                        "\"No Compression\"",
                        new TypeReference<Optional<? extends DestinationS3SchemasFormatCompressionType>>() {});
    }
}

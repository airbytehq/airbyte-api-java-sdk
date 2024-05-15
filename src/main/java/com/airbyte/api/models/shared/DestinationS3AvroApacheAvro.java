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


public class DestinationS3AvroApacheAvro {

    /**
     * The compression algorithm used to compress data. Default to no compression.
     */
    @JsonProperty("compression_codec")
    private DestinationS3CompressionCodec compressionCodec;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("format_type")
    private Optional<? extends DestinationS3SchemasFormatFormatType> formatType;

    @JsonCreator
    public DestinationS3AvroApacheAvro(
            @JsonProperty("compression_codec") DestinationS3CompressionCodec compressionCodec,
            @JsonProperty("format_type") Optional<? extends DestinationS3SchemasFormatFormatType> formatType) {
        Utils.checkNotNull(compressionCodec, "compressionCodec");
        Utils.checkNotNull(formatType, "formatType");
        this.compressionCodec = compressionCodec;
        this.formatType = formatType;
    }
    
    public DestinationS3AvroApacheAvro(
            DestinationS3CompressionCodec compressionCodec) {
        this(compressionCodec, Optional.empty());
    }

    /**
     * The compression algorithm used to compress data. Default to no compression.
     */
    @JsonIgnore
    public DestinationS3CompressionCodec compressionCodec() {
        return compressionCodec;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationS3SchemasFormatFormatType> formatType() {
        return (Optional<DestinationS3SchemasFormatFormatType>) formatType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The compression algorithm used to compress data. Default to no compression.
     */
    public DestinationS3AvroApacheAvro withCompressionCodec(DestinationS3CompressionCodec compressionCodec) {
        Utils.checkNotNull(compressionCodec, "compressionCodec");
        this.compressionCodec = compressionCodec;
        return this;
    }

    public DestinationS3AvroApacheAvro withFormatType(DestinationS3SchemasFormatFormatType formatType) {
        Utils.checkNotNull(formatType, "formatType");
        this.formatType = Optional.ofNullable(formatType);
        return this;
    }

    public DestinationS3AvroApacheAvro withFormatType(Optional<? extends DestinationS3SchemasFormatFormatType> formatType) {
        Utils.checkNotNull(formatType, "formatType");
        this.formatType = formatType;
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
        DestinationS3AvroApacheAvro other = (DestinationS3AvroApacheAvro) o;
        return 
            java.util.Objects.deepEquals(this.compressionCodec, other.compressionCodec) &&
            java.util.Objects.deepEquals(this.formatType, other.formatType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            compressionCodec,
            formatType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationS3AvroApacheAvro.class,
                "compressionCodec", compressionCodec,
                "formatType", formatType);
    }
    
    public final static class Builder {
 
        private DestinationS3CompressionCodec compressionCodec;
 
        private Optional<? extends DestinationS3SchemasFormatFormatType> formatType;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The compression algorithm used to compress data. Default to no compression.
         */
        public Builder compressionCodec(DestinationS3CompressionCodec compressionCodec) {
            Utils.checkNotNull(compressionCodec, "compressionCodec");
            this.compressionCodec = compressionCodec;
            return this;
        }

        public Builder formatType(DestinationS3SchemasFormatFormatType formatType) {
            Utils.checkNotNull(formatType, "formatType");
            this.formatType = Optional.ofNullable(formatType);
            return this;
        }

        public Builder formatType(Optional<? extends DestinationS3SchemasFormatFormatType> formatType) {
            Utils.checkNotNull(formatType, "formatType");
            this.formatType = formatType;
            return this;
        }
        
        public DestinationS3AvroApacheAvro build() {
            if (formatType == null) {
                formatType = _SINGLETON_VALUE_FormatType.value();
            }
            return new DestinationS3AvroApacheAvro(
                compressionCodec,
                formatType);
        }

        private static final LazySingletonValue<Optional<? extends DestinationS3SchemasFormatFormatType>> _SINGLETON_VALUE_FormatType =
                new LazySingletonValue<>(
                        "format_type",
                        "\"Avro\"",
                        new TypeReference<Optional<? extends DestinationS3SchemasFormatFormatType>>() {});
    }
}


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


public class ParquetColumnarStorage {

    /**
     * The compression algorithm used to compress data.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_codec")
    private Optional<? extends DestinationAwsDatalakeCompressionCodecOptional> compressionCodec;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("format_type")
    private Optional<? extends DestinationAwsDatalakeFormatTypeWildcard> formatType;

    @JsonCreator
    public ParquetColumnarStorage(
            @JsonProperty("compression_codec") Optional<? extends DestinationAwsDatalakeCompressionCodecOptional> compressionCodec,
            @JsonProperty("format_type") Optional<? extends DestinationAwsDatalakeFormatTypeWildcard> formatType) {
        Utils.checkNotNull(compressionCodec, "compressionCodec");
        Utils.checkNotNull(formatType, "formatType");
        this.compressionCodec = compressionCodec;
        this.formatType = formatType;
    }
    
    public ParquetColumnarStorage() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * The compression algorithm used to compress data.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationAwsDatalakeCompressionCodecOptional> compressionCodec() {
        return (Optional<DestinationAwsDatalakeCompressionCodecOptional>) compressionCodec;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationAwsDatalakeFormatTypeWildcard> formatType() {
        return (Optional<DestinationAwsDatalakeFormatTypeWildcard>) formatType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The compression algorithm used to compress data.
     */
    public ParquetColumnarStorage withCompressionCodec(DestinationAwsDatalakeCompressionCodecOptional compressionCodec) {
        Utils.checkNotNull(compressionCodec, "compressionCodec");
        this.compressionCodec = Optional.ofNullable(compressionCodec);
        return this;
    }

    /**
     * The compression algorithm used to compress data.
     */
    public ParquetColumnarStorage withCompressionCodec(Optional<? extends DestinationAwsDatalakeCompressionCodecOptional> compressionCodec) {
        Utils.checkNotNull(compressionCodec, "compressionCodec");
        this.compressionCodec = compressionCodec;
        return this;
    }

    public ParquetColumnarStorage withFormatType(DestinationAwsDatalakeFormatTypeWildcard formatType) {
        Utils.checkNotNull(formatType, "formatType");
        this.formatType = Optional.ofNullable(formatType);
        return this;
    }

    public ParquetColumnarStorage withFormatType(Optional<? extends DestinationAwsDatalakeFormatTypeWildcard> formatType) {
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
        ParquetColumnarStorage other = (ParquetColumnarStorage) o;
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
        return Utils.toString(ParquetColumnarStorage.class,
                "compressionCodec", compressionCodec,
                "formatType", formatType);
    }
    
    public final static class Builder {
 
        private Optional<? extends DestinationAwsDatalakeCompressionCodecOptional> compressionCodec;
 
        private Optional<? extends DestinationAwsDatalakeFormatTypeWildcard> formatType;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The compression algorithm used to compress data.
         */
        public Builder compressionCodec(DestinationAwsDatalakeCompressionCodecOptional compressionCodec) {
            Utils.checkNotNull(compressionCodec, "compressionCodec");
            this.compressionCodec = Optional.ofNullable(compressionCodec);
            return this;
        }

        /**
         * The compression algorithm used to compress data.
         */
        public Builder compressionCodec(Optional<? extends DestinationAwsDatalakeCompressionCodecOptional> compressionCodec) {
            Utils.checkNotNull(compressionCodec, "compressionCodec");
            this.compressionCodec = compressionCodec;
            return this;
        }

        public Builder formatType(DestinationAwsDatalakeFormatTypeWildcard formatType) {
            Utils.checkNotNull(formatType, "formatType");
            this.formatType = Optional.ofNullable(formatType);
            return this;
        }

        public Builder formatType(Optional<? extends DestinationAwsDatalakeFormatTypeWildcard> formatType) {
            Utils.checkNotNull(formatType, "formatType");
            this.formatType = formatType;
            return this;
        }
        
        public ParquetColumnarStorage build() {
            if (compressionCodec == null) {
                compressionCodec = _SINGLETON_VALUE_CompressionCodec.value();
            }
            if (formatType == null) {
                formatType = _SINGLETON_VALUE_FormatType.value();
            }
            return new ParquetColumnarStorage(
                compressionCodec,
                formatType);
        }

        private static final LazySingletonValue<Optional<? extends DestinationAwsDatalakeCompressionCodecOptional>> _SINGLETON_VALUE_CompressionCodec =
                new LazySingletonValue<>(
                        "compression_codec",
                        "\"SNAPPY\"",
                        new TypeReference<Optional<? extends DestinationAwsDatalakeCompressionCodecOptional>>() {});

        private static final LazySingletonValue<Optional<? extends DestinationAwsDatalakeFormatTypeWildcard>> _SINGLETON_VALUE_FormatType =
                new LazySingletonValue<>(
                        "format_type",
                        "\"Parquet\"",
                        new TypeReference<Optional<? extends DestinationAwsDatalakeFormatTypeWildcard>>() {});
    }
}


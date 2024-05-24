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

public class DestinationS3CSVCommaSeparatedValues {

    /**
     * Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".csv.gz").
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression")
    private Optional<? extends DestinationS3Compression> compression;

    /**
     * Whether the input json data should be normalized (flattened) in the output CSV. Please refer to docs for details.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flattening")
    private Optional<? extends DestinationS3Flattening> flattening;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("format_type")
    private Optional<? extends DestinationS3FormatType> formatType;

    @JsonCreator
    public DestinationS3CSVCommaSeparatedValues(
            @JsonProperty("compression") Optional<? extends DestinationS3Compression> compression,
            @JsonProperty("flattening") Optional<? extends DestinationS3Flattening> flattening,
            @JsonProperty("format_type") Optional<? extends DestinationS3FormatType> formatType) {
        Utils.checkNotNull(compression, "compression");
        Utils.checkNotNull(flattening, "flattening");
        Utils.checkNotNull(formatType, "formatType");
        this.compression = compression;
        this.flattening = flattening;
        this.formatType = formatType;
    }
    
    public DestinationS3CSVCommaSeparatedValues() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".csv.gz").
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationS3Compression> compression() {
        return (Optional<DestinationS3Compression>) compression;
    }

    /**
     * Whether the input json data should be normalized (flattened) in the output CSV. Please refer to docs for details.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationS3Flattening> flattening() {
        return (Optional<DestinationS3Flattening>) flattening;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationS3FormatType> formatType() {
        return (Optional<DestinationS3FormatType>) formatType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".csv.gz").
     */
    public DestinationS3CSVCommaSeparatedValues withCompression(DestinationS3Compression compression) {
        Utils.checkNotNull(compression, "compression");
        this.compression = Optional.ofNullable(compression);
        return this;
    }

    /**
     * Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".csv.gz").
     */
    public DestinationS3CSVCommaSeparatedValues withCompression(Optional<? extends DestinationS3Compression> compression) {
        Utils.checkNotNull(compression, "compression");
        this.compression = compression;
        return this;
    }

    /**
     * Whether the input json data should be normalized (flattened) in the output CSV. Please refer to docs for details.
     */
    public DestinationS3CSVCommaSeparatedValues withFlattening(DestinationS3Flattening flattening) {
        Utils.checkNotNull(flattening, "flattening");
        this.flattening = Optional.ofNullable(flattening);
        return this;
    }

    /**
     * Whether the input json data should be normalized (flattened) in the output CSV. Please refer to docs for details.
     */
    public DestinationS3CSVCommaSeparatedValues withFlattening(Optional<? extends DestinationS3Flattening> flattening) {
        Utils.checkNotNull(flattening, "flattening");
        this.flattening = flattening;
        return this;
    }

    public DestinationS3CSVCommaSeparatedValues withFormatType(DestinationS3FormatType formatType) {
        Utils.checkNotNull(formatType, "formatType");
        this.formatType = Optional.ofNullable(formatType);
        return this;
    }

    public DestinationS3CSVCommaSeparatedValues withFormatType(Optional<? extends DestinationS3FormatType> formatType) {
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
        DestinationS3CSVCommaSeparatedValues other = (DestinationS3CSVCommaSeparatedValues) o;
        return 
            java.util.Objects.deepEquals(this.compression, other.compression) &&
            java.util.Objects.deepEquals(this.flattening, other.flattening) &&
            java.util.Objects.deepEquals(this.formatType, other.formatType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            compression,
            flattening,
            formatType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationS3CSVCommaSeparatedValues.class,
                "compression", compression,
                "flattening", flattening,
                "formatType", formatType);
    }
    
    public final static class Builder {
 
        private Optional<? extends DestinationS3Compression> compression = Optional.empty();
 
        private Optional<? extends DestinationS3Flattening> flattening;
 
        private Optional<? extends DestinationS3FormatType> formatType;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".csv.gz").
         */
        public Builder compression(DestinationS3Compression compression) {
            Utils.checkNotNull(compression, "compression");
            this.compression = Optional.ofNullable(compression);
            return this;
        }

        /**
         * Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".csv.gz").
         */
        public Builder compression(Optional<? extends DestinationS3Compression> compression) {
            Utils.checkNotNull(compression, "compression");
            this.compression = compression;
            return this;
        }

        /**
         * Whether the input json data should be normalized (flattened) in the output CSV. Please refer to docs for details.
         */
        public Builder flattening(DestinationS3Flattening flattening) {
            Utils.checkNotNull(flattening, "flattening");
            this.flattening = Optional.ofNullable(flattening);
            return this;
        }

        /**
         * Whether the input json data should be normalized (flattened) in the output CSV. Please refer to docs for details.
         */
        public Builder flattening(Optional<? extends DestinationS3Flattening> flattening) {
            Utils.checkNotNull(flattening, "flattening");
            this.flattening = flattening;
            return this;
        }

        public Builder formatType(DestinationS3FormatType formatType) {
            Utils.checkNotNull(formatType, "formatType");
            this.formatType = Optional.ofNullable(formatType);
            return this;
        }

        public Builder formatType(Optional<? extends DestinationS3FormatType> formatType) {
            Utils.checkNotNull(formatType, "formatType");
            this.formatType = formatType;
            return this;
        }
        
        public DestinationS3CSVCommaSeparatedValues build() {
            if (flattening == null) {
                flattening = _SINGLETON_VALUE_Flattening.value();
            }
            if (formatType == null) {
                formatType = _SINGLETON_VALUE_FormatType.value();
            }
            return new DestinationS3CSVCommaSeparatedValues(
                compression,
                flattening,
                formatType);
        }

        private static final LazySingletonValue<Optional<? extends DestinationS3Flattening>> _SINGLETON_VALUE_Flattening =
                new LazySingletonValue<>(
                        "flattening",
                        "\"No flattening\"",
                        new TypeReference<Optional<? extends DestinationS3Flattening>>() {});

        private static final LazySingletonValue<Optional<? extends DestinationS3FormatType>> _SINGLETON_VALUE_FormatType =
                new LazySingletonValue<>(
                        "format_type",
                        "\"CSV\"",
                        new TypeReference<Optional<? extends DestinationS3FormatType>>() {});
    }
}


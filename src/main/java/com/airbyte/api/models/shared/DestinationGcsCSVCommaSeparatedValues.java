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


public class DestinationGcsCSVCommaSeparatedValues {

    /**
     * Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".csv.gz").
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression")
    private Optional<? extends Compression> compression;

    /**
     * Whether the input JSON data should be normalized (flattened) in the output CSV. Please refer to docs for details.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flattening")
    private Optional<? extends Normalization> flattening;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("format_type")
    private Optional<? extends DestinationGcsSchemasFormatType> formatType;

    @JsonCreator
    public DestinationGcsCSVCommaSeparatedValues(
            @JsonProperty("compression") Optional<? extends Compression> compression,
            @JsonProperty("flattening") Optional<? extends Normalization> flattening,
            @JsonProperty("format_type") Optional<? extends DestinationGcsSchemasFormatType> formatType) {
        Utils.checkNotNull(compression, "compression");
        Utils.checkNotNull(flattening, "flattening");
        Utils.checkNotNull(formatType, "formatType");
        this.compression = compression;
        this.flattening = flattening;
        this.formatType = formatType;
    }
    
    public DestinationGcsCSVCommaSeparatedValues() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".csv.gz").
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Compression> compression() {
        return (Optional<Compression>) compression;
    }

    /**
     * Whether the input JSON data should be normalized (flattened) in the output CSV. Please refer to docs for details.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Normalization> flattening() {
        return (Optional<Normalization>) flattening;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationGcsSchemasFormatType> formatType() {
        return (Optional<DestinationGcsSchemasFormatType>) formatType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".csv.gz").
     */
    public DestinationGcsCSVCommaSeparatedValues withCompression(Compression compression) {
        Utils.checkNotNull(compression, "compression");
        this.compression = Optional.ofNullable(compression);
        return this;
    }

    /**
     * Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".csv.gz").
     */
    public DestinationGcsCSVCommaSeparatedValues withCompression(Optional<? extends Compression> compression) {
        Utils.checkNotNull(compression, "compression");
        this.compression = compression;
        return this;
    }

    /**
     * Whether the input JSON data should be normalized (flattened) in the output CSV. Please refer to docs for details.
     */
    public DestinationGcsCSVCommaSeparatedValues withFlattening(Normalization flattening) {
        Utils.checkNotNull(flattening, "flattening");
        this.flattening = Optional.ofNullable(flattening);
        return this;
    }

    /**
     * Whether the input JSON data should be normalized (flattened) in the output CSV. Please refer to docs for details.
     */
    public DestinationGcsCSVCommaSeparatedValues withFlattening(Optional<? extends Normalization> flattening) {
        Utils.checkNotNull(flattening, "flattening");
        this.flattening = flattening;
        return this;
    }

    public DestinationGcsCSVCommaSeparatedValues withFormatType(DestinationGcsSchemasFormatType formatType) {
        Utils.checkNotNull(formatType, "formatType");
        this.formatType = Optional.ofNullable(formatType);
        return this;
    }

    public DestinationGcsCSVCommaSeparatedValues withFormatType(Optional<? extends DestinationGcsSchemasFormatType> formatType) {
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
        DestinationGcsCSVCommaSeparatedValues other = (DestinationGcsCSVCommaSeparatedValues) o;
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
        return Utils.toString(DestinationGcsCSVCommaSeparatedValues.class,
                "compression", compression,
                "flattening", flattening,
                "formatType", formatType);
    }
    
    public final static class Builder {
 
        private Optional<? extends Compression> compression = Optional.empty();
 
        private Optional<? extends Normalization> flattening;
 
        private Optional<? extends DestinationGcsSchemasFormatType> formatType;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".csv.gz").
         */
        public Builder compression(Compression compression) {
            Utils.checkNotNull(compression, "compression");
            this.compression = Optional.ofNullable(compression);
            return this;
        }

        /**
         * Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".csv.gz").
         */
        public Builder compression(Optional<? extends Compression> compression) {
            Utils.checkNotNull(compression, "compression");
            this.compression = compression;
            return this;
        }

        /**
         * Whether the input JSON data should be normalized (flattened) in the output CSV. Please refer to docs for details.
         */
        public Builder flattening(Normalization flattening) {
            Utils.checkNotNull(flattening, "flattening");
            this.flattening = Optional.ofNullable(flattening);
            return this;
        }

        /**
         * Whether the input JSON data should be normalized (flattened) in the output CSV. Please refer to docs for details.
         */
        public Builder flattening(Optional<? extends Normalization> flattening) {
            Utils.checkNotNull(flattening, "flattening");
            this.flattening = flattening;
            return this;
        }

        public Builder formatType(DestinationGcsSchemasFormatType formatType) {
            Utils.checkNotNull(formatType, "formatType");
            this.formatType = Optional.ofNullable(formatType);
            return this;
        }

        public Builder formatType(Optional<? extends DestinationGcsSchemasFormatType> formatType) {
            Utils.checkNotNull(formatType, "formatType");
            this.formatType = formatType;
            return this;
        }
        
        public DestinationGcsCSVCommaSeparatedValues build() {
            if (flattening == null) {
                flattening = _SINGLETON_VALUE_Flattening.value();
            }
            if (formatType == null) {
                formatType = _SINGLETON_VALUE_FormatType.value();
            }
            return new DestinationGcsCSVCommaSeparatedValues(
                compression,
                flattening,
                formatType);
        }

        private static final LazySingletonValue<Optional<? extends Normalization>> _SINGLETON_VALUE_Flattening =
                new LazySingletonValue<>(
                        "flattening",
                        "\"No flattening\"",
                        new TypeReference<Optional<? extends Normalization>>() {});

        private static final LazySingletonValue<Optional<? extends DestinationGcsSchemasFormatType>> _SINGLETON_VALUE_FormatType =
                new LazySingletonValue<>(
                        "format_type",
                        "\"CSV\"",
                        new TypeReference<Optional<? extends DestinationGcsSchemasFormatType>>() {});
    }
}


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

public class JSONLinesNewlineDelimitedJSON {

    /**
     * The compression algorithm used to compress data.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_codec")
    private Optional<? extends CompressionCodecOptional> compressionCodec;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("format_type")
    private Optional<? extends FormatTypeWildcard> formatType;

    @JsonCreator
    public JSONLinesNewlineDelimitedJSON(
            @JsonProperty("compression_codec") Optional<? extends CompressionCodecOptional> compressionCodec,
            @JsonProperty("format_type") Optional<? extends FormatTypeWildcard> formatType) {
        Utils.checkNotNull(compressionCodec, "compressionCodec");
        Utils.checkNotNull(formatType, "formatType");
        this.compressionCodec = compressionCodec;
        this.formatType = formatType;
    }
    
    public JSONLinesNewlineDelimitedJSON() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * The compression algorithm used to compress data.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CompressionCodecOptional> compressionCodec() {
        return (Optional<CompressionCodecOptional>) compressionCodec;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<FormatTypeWildcard> formatType() {
        return (Optional<FormatTypeWildcard>) formatType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The compression algorithm used to compress data.
     */
    public JSONLinesNewlineDelimitedJSON withCompressionCodec(CompressionCodecOptional compressionCodec) {
        Utils.checkNotNull(compressionCodec, "compressionCodec");
        this.compressionCodec = Optional.ofNullable(compressionCodec);
        return this;
    }

    /**
     * The compression algorithm used to compress data.
     */
    public JSONLinesNewlineDelimitedJSON withCompressionCodec(Optional<? extends CompressionCodecOptional> compressionCodec) {
        Utils.checkNotNull(compressionCodec, "compressionCodec");
        this.compressionCodec = compressionCodec;
        return this;
    }

    public JSONLinesNewlineDelimitedJSON withFormatType(FormatTypeWildcard formatType) {
        Utils.checkNotNull(formatType, "formatType");
        this.formatType = Optional.ofNullable(formatType);
        return this;
    }

    public JSONLinesNewlineDelimitedJSON withFormatType(Optional<? extends FormatTypeWildcard> formatType) {
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
        JSONLinesNewlineDelimitedJSON other = (JSONLinesNewlineDelimitedJSON) o;
        return 
            Objects.deepEquals(this.compressionCodec, other.compressionCodec) &&
            Objects.deepEquals(this.formatType, other.formatType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            compressionCodec,
            formatType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(JSONLinesNewlineDelimitedJSON.class,
                "compressionCodec", compressionCodec,
                "formatType", formatType);
    }
    
    public final static class Builder {
 
        private Optional<? extends CompressionCodecOptional> compressionCodec;
 
        private Optional<? extends FormatTypeWildcard> formatType;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The compression algorithm used to compress data.
         */
        public Builder compressionCodec(CompressionCodecOptional compressionCodec) {
            Utils.checkNotNull(compressionCodec, "compressionCodec");
            this.compressionCodec = Optional.ofNullable(compressionCodec);
            return this;
        }

        /**
         * The compression algorithm used to compress data.
         */
        public Builder compressionCodec(Optional<? extends CompressionCodecOptional> compressionCodec) {
            Utils.checkNotNull(compressionCodec, "compressionCodec");
            this.compressionCodec = compressionCodec;
            return this;
        }

        public Builder formatType(FormatTypeWildcard formatType) {
            Utils.checkNotNull(formatType, "formatType");
            this.formatType = Optional.ofNullable(formatType);
            return this;
        }

        public Builder formatType(Optional<? extends FormatTypeWildcard> formatType) {
            Utils.checkNotNull(formatType, "formatType");
            this.formatType = formatType;
            return this;
        }
        
        public JSONLinesNewlineDelimitedJSON build() {
            if (compressionCodec == null) {
                compressionCodec = _SINGLETON_VALUE_CompressionCodec.value();
            }
            if (formatType == null) {
                formatType = _SINGLETON_VALUE_FormatType.value();
            }
            return new JSONLinesNewlineDelimitedJSON(
                compressionCodec,
                formatType);
        }

        private static final LazySingletonValue<Optional<? extends CompressionCodecOptional>> _SINGLETON_VALUE_CompressionCodec =
                new LazySingletonValue<>(
                        "compression_codec",
                        "\"UNCOMPRESSED\"",
                        new TypeReference<Optional<? extends CompressionCodecOptional>>() {});

        private static final LazySingletonValue<Optional<? extends FormatTypeWildcard>> _SINGLETON_VALUE_FormatType =
                new LazySingletonValue<>(
                        "format_type",
                        "\"JSONL\"",
                        new TypeReference<Optional<? extends FormatTypeWildcard>>() {});
    }
}

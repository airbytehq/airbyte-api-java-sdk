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


public class DestinationS3Zstandard {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("codec")
    private Optional<? extends DestinationS3SchemasFormatOutputFormat3Codec> codec;

    /**
     * Negative levels are 'fast' modes akin to lz4 or snappy, levels above 9 are generally for archival purposes, and levels above 18 use a lot of memory.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_level")
    private Optional<? extends Long> compressionLevel;

    /**
     * If true, include a checksum with each data block.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("include_checksum")
    private Optional<? extends Boolean> includeChecksum;

    @JsonCreator
    public DestinationS3Zstandard(
            @JsonProperty("codec") Optional<? extends DestinationS3SchemasFormatOutputFormat3Codec> codec,
            @JsonProperty("compression_level") Optional<? extends Long> compressionLevel,
            @JsonProperty("include_checksum") Optional<? extends Boolean> includeChecksum) {
        Utils.checkNotNull(codec, "codec");
        Utils.checkNotNull(compressionLevel, "compressionLevel");
        Utils.checkNotNull(includeChecksum, "includeChecksum");
        this.codec = codec;
        this.compressionLevel = compressionLevel;
        this.includeChecksum = includeChecksum;
    }
    
    public DestinationS3Zstandard() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationS3SchemasFormatOutputFormat3Codec> codec() {
        return (Optional<DestinationS3SchemasFormatOutputFormat3Codec>) codec;
    }

    /**
     * Negative levels are 'fast' modes akin to lz4 or snappy, levels above 9 are generally for archival purposes, and levels above 18 use a lot of memory.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> compressionLevel() {
        return (Optional<Long>) compressionLevel;
    }

    /**
     * If true, include a checksum with each data block.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> includeChecksum() {
        return (Optional<Boolean>) includeChecksum;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DestinationS3Zstandard withCodec(DestinationS3SchemasFormatOutputFormat3Codec codec) {
        Utils.checkNotNull(codec, "codec");
        this.codec = Optional.ofNullable(codec);
        return this;
    }

    public DestinationS3Zstandard withCodec(Optional<? extends DestinationS3SchemasFormatOutputFormat3Codec> codec) {
        Utils.checkNotNull(codec, "codec");
        this.codec = codec;
        return this;
    }

    /**
     * Negative levels are 'fast' modes akin to lz4 or snappy, levels above 9 are generally for archival purposes, and levels above 18 use a lot of memory.
     */
    public DestinationS3Zstandard withCompressionLevel(long compressionLevel) {
        Utils.checkNotNull(compressionLevel, "compressionLevel");
        this.compressionLevel = Optional.ofNullable(compressionLevel);
        return this;
    }

    /**
     * Negative levels are 'fast' modes akin to lz4 or snappy, levels above 9 are generally for archival purposes, and levels above 18 use a lot of memory.
     */
    public DestinationS3Zstandard withCompressionLevel(Optional<? extends Long> compressionLevel) {
        Utils.checkNotNull(compressionLevel, "compressionLevel");
        this.compressionLevel = compressionLevel;
        return this;
    }

    /**
     * If true, include a checksum with each data block.
     */
    public DestinationS3Zstandard withIncludeChecksum(boolean includeChecksum) {
        Utils.checkNotNull(includeChecksum, "includeChecksum");
        this.includeChecksum = Optional.ofNullable(includeChecksum);
        return this;
    }

    /**
     * If true, include a checksum with each data block.
     */
    public DestinationS3Zstandard withIncludeChecksum(Optional<? extends Boolean> includeChecksum) {
        Utils.checkNotNull(includeChecksum, "includeChecksum");
        this.includeChecksum = includeChecksum;
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
        DestinationS3Zstandard other = (DestinationS3Zstandard) o;
        return 
            java.util.Objects.deepEquals(this.codec, other.codec) &&
            java.util.Objects.deepEquals(this.compressionLevel, other.compressionLevel) &&
            java.util.Objects.deepEquals(this.includeChecksum, other.includeChecksum);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            codec,
            compressionLevel,
            includeChecksum);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationS3Zstandard.class,
                "codec", codec,
                "compressionLevel", compressionLevel,
                "includeChecksum", includeChecksum);
    }
    
    public final static class Builder {
 
        private Optional<? extends DestinationS3SchemasFormatOutputFormat3Codec> codec;
 
        private Optional<? extends Long> compressionLevel;
 
        private Optional<? extends Boolean> includeChecksum;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder codec(DestinationS3SchemasFormatOutputFormat3Codec codec) {
            Utils.checkNotNull(codec, "codec");
            this.codec = Optional.ofNullable(codec);
            return this;
        }

        public Builder codec(Optional<? extends DestinationS3SchemasFormatOutputFormat3Codec> codec) {
            Utils.checkNotNull(codec, "codec");
            this.codec = codec;
            return this;
        }

        /**
         * Negative levels are 'fast' modes akin to lz4 or snappy, levels above 9 are generally for archival purposes, and levels above 18 use a lot of memory.
         */
        public Builder compressionLevel(long compressionLevel) {
            Utils.checkNotNull(compressionLevel, "compressionLevel");
            this.compressionLevel = Optional.ofNullable(compressionLevel);
            return this;
        }

        /**
         * Negative levels are 'fast' modes akin to lz4 or snappy, levels above 9 are generally for archival purposes, and levels above 18 use a lot of memory.
         */
        public Builder compressionLevel(Optional<? extends Long> compressionLevel) {
            Utils.checkNotNull(compressionLevel, "compressionLevel");
            this.compressionLevel = compressionLevel;
            return this;
        }

        /**
         * If true, include a checksum with each data block.
         */
        public Builder includeChecksum(boolean includeChecksum) {
            Utils.checkNotNull(includeChecksum, "includeChecksum");
            this.includeChecksum = Optional.ofNullable(includeChecksum);
            return this;
        }

        /**
         * If true, include a checksum with each data block.
         */
        public Builder includeChecksum(Optional<? extends Boolean> includeChecksum) {
            Utils.checkNotNull(includeChecksum, "includeChecksum");
            this.includeChecksum = includeChecksum;
            return this;
        }
        
        public DestinationS3Zstandard build() {
            if (codec == null) {
                codec = _SINGLETON_VALUE_Codec.value();
            }
            if (compressionLevel == null) {
                compressionLevel = _SINGLETON_VALUE_CompressionLevel.value();
            }
            if (includeChecksum == null) {
                includeChecksum = _SINGLETON_VALUE_IncludeChecksum.value();
            }
            return new DestinationS3Zstandard(
                codec,
                compressionLevel,
                includeChecksum);
        }

        private static final LazySingletonValue<Optional<? extends DestinationS3SchemasFormatOutputFormat3Codec>> _SINGLETON_VALUE_Codec =
                new LazySingletonValue<>(
                        "codec",
                        "\"zstandard\"",
                        new TypeReference<Optional<? extends DestinationS3SchemasFormatOutputFormat3Codec>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_CompressionLevel =
                new LazySingletonValue<>(
                        "compression_level",
                        "3",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_IncludeChecksum =
                new LazySingletonValue<>(
                        "include_checksum",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});
    }
}


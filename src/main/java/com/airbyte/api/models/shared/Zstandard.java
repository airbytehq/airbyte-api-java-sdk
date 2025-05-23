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
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class Zstandard {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("codec")
    private Optional<? extends DestinationGcsSchemasFormatOutputFormatCodec> codec;

    /**
     * Negative levels are 'fast' modes akin to lz4 or snappy, levels above 9 are generally for archival purposes, and levels above 18 use a lot of memory.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_level")
    private Optional<Long> compressionLevel;

    /**
     * If true, include a checksum with each data block.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("include_checksum")
    private Optional<Boolean> includeChecksum;

    @JsonCreator
    public Zstandard(
            @JsonProperty("codec") Optional<? extends DestinationGcsSchemasFormatOutputFormatCodec> codec,
            @JsonProperty("compression_level") Optional<Long> compressionLevel,
            @JsonProperty("include_checksum") Optional<Boolean> includeChecksum) {
        Utils.checkNotNull(codec, "codec");
        Utils.checkNotNull(compressionLevel, "compressionLevel");
        Utils.checkNotNull(includeChecksum, "includeChecksum");
        this.codec = codec;
        this.compressionLevel = compressionLevel;
        this.includeChecksum = includeChecksum;
    }
    
    public Zstandard() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationGcsSchemasFormatOutputFormatCodec> codec() {
        return (Optional<DestinationGcsSchemasFormatOutputFormatCodec>) codec;
    }

    /**
     * Negative levels are 'fast' modes akin to lz4 or snappy, levels above 9 are generally for archival purposes, and levels above 18 use a lot of memory.
     */
    @JsonIgnore
    public Optional<Long> compressionLevel() {
        return compressionLevel;
    }

    /**
     * If true, include a checksum with each data block.
     */
    @JsonIgnore
    public Optional<Boolean> includeChecksum() {
        return includeChecksum;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public Zstandard withCodec(DestinationGcsSchemasFormatOutputFormatCodec codec) {
        Utils.checkNotNull(codec, "codec");
        this.codec = Optional.ofNullable(codec);
        return this;
    }

    public Zstandard withCodec(Optional<? extends DestinationGcsSchemasFormatOutputFormatCodec> codec) {
        Utils.checkNotNull(codec, "codec");
        this.codec = codec;
        return this;
    }

    /**
     * Negative levels are 'fast' modes akin to lz4 or snappy, levels above 9 are generally for archival purposes, and levels above 18 use a lot of memory.
     */
    public Zstandard withCompressionLevel(long compressionLevel) {
        Utils.checkNotNull(compressionLevel, "compressionLevel");
        this.compressionLevel = Optional.ofNullable(compressionLevel);
        return this;
    }

    /**
     * Negative levels are 'fast' modes akin to lz4 or snappy, levels above 9 are generally for archival purposes, and levels above 18 use a lot of memory.
     */
    public Zstandard withCompressionLevel(Optional<Long> compressionLevel) {
        Utils.checkNotNull(compressionLevel, "compressionLevel");
        this.compressionLevel = compressionLevel;
        return this;
    }

    /**
     * If true, include a checksum with each data block.
     */
    public Zstandard withIncludeChecksum(boolean includeChecksum) {
        Utils.checkNotNull(includeChecksum, "includeChecksum");
        this.includeChecksum = Optional.ofNullable(includeChecksum);
        return this;
    }

    /**
     * If true, include a checksum with each data block.
     */
    public Zstandard withIncludeChecksum(Optional<Boolean> includeChecksum) {
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
        Zstandard other = (Zstandard) o;
        return 
            Objects.deepEquals(this.codec, other.codec) &&
            Objects.deepEquals(this.compressionLevel, other.compressionLevel) &&
            Objects.deepEquals(this.includeChecksum, other.includeChecksum);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            codec,
            compressionLevel,
            includeChecksum);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Zstandard.class,
                "codec", codec,
                "compressionLevel", compressionLevel,
                "includeChecksum", includeChecksum);
    }
    
    public final static class Builder {
 
        private Optional<? extends DestinationGcsSchemasFormatOutputFormatCodec> codec;
 
        private Optional<Long> compressionLevel;
 
        private Optional<Boolean> includeChecksum;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder codec(DestinationGcsSchemasFormatOutputFormatCodec codec) {
            Utils.checkNotNull(codec, "codec");
            this.codec = Optional.ofNullable(codec);
            return this;
        }

        public Builder codec(Optional<? extends DestinationGcsSchemasFormatOutputFormatCodec> codec) {
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
        public Builder compressionLevel(Optional<Long> compressionLevel) {
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
        public Builder includeChecksum(Optional<Boolean> includeChecksum) {
            Utils.checkNotNull(includeChecksum, "includeChecksum");
            this.includeChecksum = includeChecksum;
            return this;
        }
        
        public Zstandard build() {
            if (codec == null) {
                codec = _SINGLETON_VALUE_Codec.value();
            }
            if (compressionLevel == null) {
                compressionLevel = _SINGLETON_VALUE_CompressionLevel.value();
            }
            if (includeChecksum == null) {
                includeChecksum = _SINGLETON_VALUE_IncludeChecksum.value();
            }
            return new Zstandard(
                codec,
                compressionLevel,
                includeChecksum);
        }

        private static final LazySingletonValue<Optional<? extends DestinationGcsSchemasFormatOutputFormatCodec>> _SINGLETON_VALUE_Codec =
                new LazySingletonValue<>(
                        "codec",
                        "\"zstandard\"",
                        new TypeReference<Optional<? extends DestinationGcsSchemasFormatOutputFormatCodec>>() {});

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_CompressionLevel =
                new LazySingletonValue<>(
                        "compression_level",
                        "3",
                        new TypeReference<Optional<Long>>() {});

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_IncludeChecksum =
                new LazySingletonValue<>(
                        "include_checksum",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});
    }
}

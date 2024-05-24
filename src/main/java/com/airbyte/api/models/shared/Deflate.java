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

public class Deflate {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("codec")
    private Optional<? extends DestinationGcsCodec> codec;

    /**
     * 0: no compression &amp; fastest, 9: best compression &amp; slowest.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_level")
    private Optional<? extends Long> compressionLevel;

    @JsonCreator
    public Deflate(
            @JsonProperty("codec") Optional<? extends DestinationGcsCodec> codec,
            @JsonProperty("compression_level") Optional<? extends Long> compressionLevel) {
        Utils.checkNotNull(codec, "codec");
        Utils.checkNotNull(compressionLevel, "compressionLevel");
        this.codec = codec;
        this.compressionLevel = compressionLevel;
    }
    
    public Deflate() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationGcsCodec> codec() {
        return (Optional<DestinationGcsCodec>) codec;
    }

    /**
     * 0: no compression &amp; fastest, 9: best compression &amp; slowest.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> compressionLevel() {
        return (Optional<Long>) compressionLevel;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Deflate withCodec(DestinationGcsCodec codec) {
        Utils.checkNotNull(codec, "codec");
        this.codec = Optional.ofNullable(codec);
        return this;
    }

    public Deflate withCodec(Optional<? extends DestinationGcsCodec> codec) {
        Utils.checkNotNull(codec, "codec");
        this.codec = codec;
        return this;
    }

    /**
     * 0: no compression &amp; fastest, 9: best compression &amp; slowest.
     */
    public Deflate withCompressionLevel(long compressionLevel) {
        Utils.checkNotNull(compressionLevel, "compressionLevel");
        this.compressionLevel = Optional.ofNullable(compressionLevel);
        return this;
    }

    /**
     * 0: no compression &amp; fastest, 9: best compression &amp; slowest.
     */
    public Deflate withCompressionLevel(Optional<? extends Long> compressionLevel) {
        Utils.checkNotNull(compressionLevel, "compressionLevel");
        this.compressionLevel = compressionLevel;
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
        Deflate other = (Deflate) o;
        return 
            java.util.Objects.deepEquals(this.codec, other.codec) &&
            java.util.Objects.deepEquals(this.compressionLevel, other.compressionLevel);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            codec,
            compressionLevel);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Deflate.class,
                "codec", codec,
                "compressionLevel", compressionLevel);
    }
    
    public final static class Builder {
 
        private Optional<? extends DestinationGcsCodec> codec;
 
        private Optional<? extends Long> compressionLevel;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder codec(DestinationGcsCodec codec) {
            Utils.checkNotNull(codec, "codec");
            this.codec = Optional.ofNullable(codec);
            return this;
        }

        public Builder codec(Optional<? extends DestinationGcsCodec> codec) {
            Utils.checkNotNull(codec, "codec");
            this.codec = codec;
            return this;
        }

        /**
         * 0: no compression &amp; fastest, 9: best compression &amp; slowest.
         */
        public Builder compressionLevel(long compressionLevel) {
            Utils.checkNotNull(compressionLevel, "compressionLevel");
            this.compressionLevel = Optional.ofNullable(compressionLevel);
            return this;
        }

        /**
         * 0: no compression &amp; fastest, 9: best compression &amp; slowest.
         */
        public Builder compressionLevel(Optional<? extends Long> compressionLevel) {
            Utils.checkNotNull(compressionLevel, "compressionLevel");
            this.compressionLevel = compressionLevel;
            return this;
        }
        
        public Deflate build() {
            if (codec == null) {
                codec = _SINGLETON_VALUE_Codec.value();
            }
            if (compressionLevel == null) {
                compressionLevel = _SINGLETON_VALUE_CompressionLevel.value();
            }
            return new Deflate(
                codec,
                compressionLevel);
        }

        private static final LazySingletonValue<Optional<? extends DestinationGcsCodec>> _SINGLETON_VALUE_Codec =
                new LazySingletonValue<>(
                        "codec",
                        "\"Deflate\"",
                        new TypeReference<Optional<? extends DestinationGcsCodec>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_CompressionLevel =
                new LazySingletonValue<>(
                        "compression_level",
                        "0",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}


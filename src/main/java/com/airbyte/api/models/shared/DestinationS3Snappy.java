/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class DestinationS3Snappy {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("codec")
    private Optional<? extends DestinationS3SchemasFormatOutputFormat3CompressionCodecCodec> codec;

    public DestinationS3Snappy(
            @JsonProperty("codec") Optional<? extends DestinationS3SchemasFormatOutputFormat3CompressionCodecCodec> codec) {
        Utils.checkNotNull(codec, "codec");
        this.codec = codec;
    }

    public Optional<? extends DestinationS3SchemasFormatOutputFormat3CompressionCodecCodec> codec() {
        return codec;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DestinationS3Snappy withCodec(DestinationS3SchemasFormatOutputFormat3CompressionCodecCodec codec) {
        Utils.checkNotNull(codec, "codec");
        this.codec = Optional.ofNullable(codec);
        return this;
    }

    public DestinationS3Snappy withCodec(Optional<? extends DestinationS3SchemasFormatOutputFormat3CompressionCodecCodec> codec) {
        Utils.checkNotNull(codec, "codec");
        this.codec = codec;
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
        DestinationS3Snappy other = (DestinationS3Snappy) o;
        return 
            java.util.Objects.deepEquals(this.codec, other.codec);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            codec);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationS3Snappy.class,
                "codec", codec);
    }
    
    public final static class Builder {
 
        private Optional<? extends DestinationS3SchemasFormatOutputFormat3CompressionCodecCodec> codec;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder codec(DestinationS3SchemasFormatOutputFormat3CompressionCodecCodec codec) {
            Utils.checkNotNull(codec, "codec");
            this.codec = Optional.ofNullable(codec);
            return this;
        }

        public Builder codec(Optional<? extends DestinationS3SchemasFormatOutputFormat3CompressionCodecCodec> codec) {
            Utils.checkNotNull(codec, "codec");
            this.codec = codec;
            return this;
        }
        
        public DestinationS3Snappy build() {
            if (codec == null) {
                codec = _SINGLETON_VALUE_Codec.value();
            }
            return new DestinationS3Snappy(
                codec);
        }

        private static final LazySingletonValue<Optional<? extends DestinationS3SchemasFormatOutputFormat3CompressionCodecCodec>> _SINGLETON_VALUE_Codec =
                new LazySingletonValue<>(
                        "codec",
                        "\"snappy\"",
                        new TypeReference<Optional<? extends DestinationS3SchemasFormatOutputFormat3CompressionCodecCodec>>() {});
    }
}


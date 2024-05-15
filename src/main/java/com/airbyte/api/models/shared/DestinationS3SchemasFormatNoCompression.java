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


public class DestinationS3SchemasFormatNoCompression {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("codec")
    private Optional<? extends DestinationS3Codec> codec;

    @JsonCreator
    public DestinationS3SchemasFormatNoCompression(
            @JsonProperty("codec") Optional<? extends DestinationS3Codec> codec) {
        Utils.checkNotNull(codec, "codec");
        this.codec = codec;
    }
    
    public DestinationS3SchemasFormatNoCompression() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationS3Codec> codec() {
        return (Optional<DestinationS3Codec>) codec;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DestinationS3SchemasFormatNoCompression withCodec(DestinationS3Codec codec) {
        Utils.checkNotNull(codec, "codec");
        this.codec = Optional.ofNullable(codec);
        return this;
    }

    public DestinationS3SchemasFormatNoCompression withCodec(Optional<? extends DestinationS3Codec> codec) {
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
        DestinationS3SchemasFormatNoCompression other = (DestinationS3SchemasFormatNoCompression) o;
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
        return Utils.toString(DestinationS3SchemasFormatNoCompression.class,
                "codec", codec);
    }
    
    public final static class Builder {
 
        private Optional<? extends DestinationS3Codec> codec;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder codec(DestinationS3Codec codec) {
            Utils.checkNotNull(codec, "codec");
            this.codec = Optional.ofNullable(codec);
            return this;
        }

        public Builder codec(Optional<? extends DestinationS3Codec> codec) {
            Utils.checkNotNull(codec, "codec");
            this.codec = codec;
            return this;
        }
        
        public DestinationS3SchemasFormatNoCompression build() {
            if (codec == null) {
                codec = _SINGLETON_VALUE_Codec.value();
            }
            return new DestinationS3SchemasFormatNoCompression(
                codec);
        }

        private static final LazySingletonValue<Optional<? extends DestinationS3Codec>> _SINGLETON_VALUE_Codec =
                new LazySingletonValue<>(
                        "codec",
                        "\"no compression\"",
                        new TypeReference<Optional<? extends DestinationS3Codec>>() {});
    }
}


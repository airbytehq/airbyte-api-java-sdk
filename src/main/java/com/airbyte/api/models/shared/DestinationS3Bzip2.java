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


public class DestinationS3Bzip2 {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("codec")
    private Optional<? extends DestinationS3SchemasFormatCodec> codec;

    @JsonCreator
    public DestinationS3Bzip2(
            @JsonProperty("codec") Optional<? extends DestinationS3SchemasFormatCodec> codec) {
        Utils.checkNotNull(codec, "codec");
        this.codec = codec;
    }
    
    public DestinationS3Bzip2() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationS3SchemasFormatCodec> codec() {
        return (Optional<DestinationS3SchemasFormatCodec>) codec;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DestinationS3Bzip2 withCodec(DestinationS3SchemasFormatCodec codec) {
        Utils.checkNotNull(codec, "codec");
        this.codec = Optional.ofNullable(codec);
        return this;
    }

    public DestinationS3Bzip2 withCodec(Optional<? extends DestinationS3SchemasFormatCodec> codec) {
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
        DestinationS3Bzip2 other = (DestinationS3Bzip2) o;
        return 
            Objects.deepEquals(this.codec, other.codec);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            codec);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationS3Bzip2.class,
                "codec", codec);
    }
    
    public final static class Builder {
 
        private Optional<? extends DestinationS3SchemasFormatCodec> codec;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder codec(DestinationS3SchemasFormatCodec codec) {
            Utils.checkNotNull(codec, "codec");
            this.codec = Optional.ofNullable(codec);
            return this;
        }

        public Builder codec(Optional<? extends DestinationS3SchemasFormatCodec> codec) {
            Utils.checkNotNull(codec, "codec");
            this.codec = codec;
            return this;
        }
        
        public DestinationS3Bzip2 build() {
            if (codec == null) {
                codec = _SINGLETON_VALUE_Codec.value();
            }            return new DestinationS3Bzip2(
                codec);
        }

        private static final LazySingletonValue<Optional<? extends DestinationS3SchemasFormatCodec>> _SINGLETON_VALUE_Codec =
                new LazySingletonValue<>(
                        "codec",
                        "\"bzip2\"",
                        new TypeReference<Optional<? extends DestinationS3SchemasFormatCodec>>() {});
    }
}


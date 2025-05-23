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

public class NoCompression {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("codec")
    private Optional<? extends Codec> codec;

    @JsonCreator
    public NoCompression(
            @JsonProperty("codec") Optional<? extends Codec> codec) {
        Utils.checkNotNull(codec, "codec");
        this.codec = codec;
    }
    
    public NoCompression() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Codec> codec() {
        return (Optional<Codec>) codec;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public NoCompression withCodec(Codec codec) {
        Utils.checkNotNull(codec, "codec");
        this.codec = Optional.ofNullable(codec);
        return this;
    }

    public NoCompression withCodec(Optional<? extends Codec> codec) {
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
        NoCompression other = (NoCompression) o;
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
        return Utils.toString(NoCompression.class,
                "codec", codec);
    }
    
    public final static class Builder {
 
        private Optional<? extends Codec> codec;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder codec(Codec codec) {
            Utils.checkNotNull(codec, "codec");
            this.codec = Optional.ofNullable(codec);
            return this;
        }

        public Builder codec(Optional<? extends Codec> codec) {
            Utils.checkNotNull(codec, "codec");
            this.codec = codec;
            return this;
        }
        
        public NoCompression build() {
            if (codec == null) {
                codec = _SINGLETON_VALUE_Codec.value();
            }
            return new NoCompression(
                codec);
        }

        private static final LazySingletonValue<Optional<? extends Codec>> _SINGLETON_VALUE_Codec =
                new LazySingletonValue<>(
                        "codec",
                        "\"no compression\"",
                        new TypeReference<Optional<? extends Codec>>() {});
    }
}

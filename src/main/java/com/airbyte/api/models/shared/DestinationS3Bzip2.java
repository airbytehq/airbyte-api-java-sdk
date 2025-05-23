/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class DestinationS3Bzip2 {

    @JsonIgnore
    private Map<String, Object> additionalProperties;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("codec")
    private Optional<? extends DestinationS3SchemasFormatCodec> codec;

    @JsonCreator
    public DestinationS3Bzip2(
            @JsonProperty("codec") Optional<? extends DestinationS3SchemasFormatCodec> codec) {
        Utils.checkNotNull(codec, "codec");
        this.additionalProperties = new HashMap<>();
        this.codec = codec;
    }
    
    public DestinationS3Bzip2() {
        this(Optional.empty());
    }

    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return additionalProperties;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationS3SchemasFormatCodec> codec() {
        return (Optional<DestinationS3SchemasFormatCodec>) codec;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    @JsonAnySetter
    public DestinationS3Bzip2 withAdditionalProperty(String key, Object value) {
        // note that value can be null because of the way JsonAnySetter works
        Utils.checkNotNull(key, "key");
        additionalProperties.put(key, value); 
        return this;
    }    

    public DestinationS3Bzip2 withAdditionalProperties(Map<String, Object> additionalProperties) {
        Utils.checkNotNull(additionalProperties, "additionalProperties");
        this.additionalProperties = additionalProperties;
        return this;
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
            Objects.deepEquals(this.additionalProperties, other.additionalProperties) &&
            Objects.deepEquals(this.codec, other.codec);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            additionalProperties,
            codec);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationS3Bzip2.class,
                "additionalProperties", additionalProperties,
                "codec", codec);
    }
    
    public final static class Builder {
 
        private Map<String, Object> additionalProperties = new HashMap<>();
 
        private Optional<? extends DestinationS3SchemasFormatCodec> codec;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder additionalProperty(String key, Object value) {
            Utils.checkNotNull(key, "key");
            // we could be strict about null values (force the user
            // to pass `JsonNullable.of(null)`) but likely to be a bit 
            // annoying for additional properties building so we'll 
            // relax preconditions.
            this.additionalProperties.put(key, value);
            return this;
        }

        public Builder additionalProperties(Map<String, Object> additionalProperties) {
            Utils.checkNotNull(additionalProperties, "additionalProperties");
            this.additionalProperties = additionalProperties;
            return this;
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
            }
            return new DestinationS3Bzip2(
                codec)
                .withAdditionalProperties(additionalProperties);
        }

        private static final LazySingletonValue<Optional<? extends DestinationS3SchemasFormatCodec>> _SINGLETON_VALUE_Codec =
                new LazySingletonValue<>(
                        "codec",
                        "\"bzip2\"",
                        new TypeReference<Optional<? extends DestinationS3SchemasFormatCodec>>() {});
    }
}

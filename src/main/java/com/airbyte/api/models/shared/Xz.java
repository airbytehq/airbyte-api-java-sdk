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

public class Xz {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("codec")
    private Optional<? extends DestinationGcsSchemasFormatCodec> codec;

    /**
     * The presets 0-3 are fast presets with medium compression. The presets 4-6 are fairly slow presets with high compression. The default preset is 6. The presets 7-9 are like the preset 6 but use bigger dictionaries and have higher compressor and decompressor memory requirements. Unless the uncompressed size of the file exceeds 8 MiB, 16 MiB, or 32 MiB, it is waste of memory to use the presets 7, 8, or 9, respectively. Read more &lt;a href="https://commons.apache.org/proper/commons-compress/apidocs/org/apache/commons/compress/compressors/xz/XZCompressorOutputStream.html#XZCompressorOutputStream-java.io.OutputStream-int-"&gt;here&lt;/a&gt; for details.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_level")
    private Optional<? extends Long> compressionLevel;

    @JsonCreator
    public Xz(
            @JsonProperty("codec") Optional<? extends DestinationGcsSchemasFormatCodec> codec,
            @JsonProperty("compression_level") Optional<? extends Long> compressionLevel) {
        Utils.checkNotNull(codec, "codec");
        Utils.checkNotNull(compressionLevel, "compressionLevel");
        this.codec = codec;
        this.compressionLevel = compressionLevel;
    }
    
    public Xz() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationGcsSchemasFormatCodec> codec() {
        return (Optional<DestinationGcsSchemasFormatCodec>) codec;
    }

    /**
     * The presets 0-3 are fast presets with medium compression. The presets 4-6 are fairly slow presets with high compression. The default preset is 6. The presets 7-9 are like the preset 6 but use bigger dictionaries and have higher compressor and decompressor memory requirements. Unless the uncompressed size of the file exceeds 8 MiB, 16 MiB, or 32 MiB, it is waste of memory to use the presets 7, 8, or 9, respectively. Read more &lt;a href="https://commons.apache.org/proper/commons-compress/apidocs/org/apache/commons/compress/compressors/xz/XZCompressorOutputStream.html#XZCompressorOutputStream-java.io.OutputStream-int-"&gt;here&lt;/a&gt; for details.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> compressionLevel() {
        return (Optional<Long>) compressionLevel;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Xz withCodec(DestinationGcsSchemasFormatCodec codec) {
        Utils.checkNotNull(codec, "codec");
        this.codec = Optional.ofNullable(codec);
        return this;
    }

    public Xz withCodec(Optional<? extends DestinationGcsSchemasFormatCodec> codec) {
        Utils.checkNotNull(codec, "codec");
        this.codec = codec;
        return this;
    }

    /**
     * The presets 0-3 are fast presets with medium compression. The presets 4-6 are fairly slow presets with high compression. The default preset is 6. The presets 7-9 are like the preset 6 but use bigger dictionaries and have higher compressor and decompressor memory requirements. Unless the uncompressed size of the file exceeds 8 MiB, 16 MiB, or 32 MiB, it is waste of memory to use the presets 7, 8, or 9, respectively. Read more &lt;a href="https://commons.apache.org/proper/commons-compress/apidocs/org/apache/commons/compress/compressors/xz/XZCompressorOutputStream.html#XZCompressorOutputStream-java.io.OutputStream-int-"&gt;here&lt;/a&gt; for details.
     */
    public Xz withCompressionLevel(long compressionLevel) {
        Utils.checkNotNull(compressionLevel, "compressionLevel");
        this.compressionLevel = Optional.ofNullable(compressionLevel);
        return this;
    }

    /**
     * The presets 0-3 are fast presets with medium compression. The presets 4-6 are fairly slow presets with high compression. The default preset is 6. The presets 7-9 are like the preset 6 but use bigger dictionaries and have higher compressor and decompressor memory requirements. Unless the uncompressed size of the file exceeds 8 MiB, 16 MiB, or 32 MiB, it is waste of memory to use the presets 7, 8, or 9, respectively. Read more &lt;a href="https://commons.apache.org/proper/commons-compress/apidocs/org/apache/commons/compress/compressors/xz/XZCompressorOutputStream.html#XZCompressorOutputStream-java.io.OutputStream-int-"&gt;here&lt;/a&gt; for details.
     */
    public Xz withCompressionLevel(Optional<? extends Long> compressionLevel) {
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
        Xz other = (Xz) o;
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
        return Utils.toString(Xz.class,
                "codec", codec,
                "compressionLevel", compressionLevel);
    }
    
    public final static class Builder {
 
        private Optional<? extends DestinationGcsSchemasFormatCodec> codec;
 
        private Optional<? extends Long> compressionLevel;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder codec(DestinationGcsSchemasFormatCodec codec) {
            Utils.checkNotNull(codec, "codec");
            this.codec = Optional.ofNullable(codec);
            return this;
        }

        public Builder codec(Optional<? extends DestinationGcsSchemasFormatCodec> codec) {
            Utils.checkNotNull(codec, "codec");
            this.codec = codec;
            return this;
        }

        /**
         * The presets 0-3 are fast presets with medium compression. The presets 4-6 are fairly slow presets with high compression. The default preset is 6. The presets 7-9 are like the preset 6 but use bigger dictionaries and have higher compressor and decompressor memory requirements. Unless the uncompressed size of the file exceeds 8 MiB, 16 MiB, or 32 MiB, it is waste of memory to use the presets 7, 8, or 9, respectively. Read more &lt;a href="https://commons.apache.org/proper/commons-compress/apidocs/org/apache/commons/compress/compressors/xz/XZCompressorOutputStream.html#XZCompressorOutputStream-java.io.OutputStream-int-"&gt;here&lt;/a&gt; for details.
         */
        public Builder compressionLevel(long compressionLevel) {
            Utils.checkNotNull(compressionLevel, "compressionLevel");
            this.compressionLevel = Optional.ofNullable(compressionLevel);
            return this;
        }

        /**
         * The presets 0-3 are fast presets with medium compression. The presets 4-6 are fairly slow presets with high compression. The default preset is 6. The presets 7-9 are like the preset 6 but use bigger dictionaries and have higher compressor and decompressor memory requirements. Unless the uncompressed size of the file exceeds 8 MiB, 16 MiB, or 32 MiB, it is waste of memory to use the presets 7, 8, or 9, respectively. Read more &lt;a href="https://commons.apache.org/proper/commons-compress/apidocs/org/apache/commons/compress/compressors/xz/XZCompressorOutputStream.html#XZCompressorOutputStream-java.io.OutputStream-int-"&gt;here&lt;/a&gt; for details.
         */
        public Builder compressionLevel(Optional<? extends Long> compressionLevel) {
            Utils.checkNotNull(compressionLevel, "compressionLevel");
            this.compressionLevel = compressionLevel;
            return this;
        }
        
        public Xz build() {
            if (codec == null) {
                codec = _SINGLETON_VALUE_Codec.value();
            }
            if (compressionLevel == null) {
                compressionLevel = _SINGLETON_VALUE_CompressionLevel.value();
            }
            return new Xz(
                codec,
                compressionLevel);
        }

        private static final LazySingletonValue<Optional<? extends DestinationGcsSchemasFormatCodec>> _SINGLETON_VALUE_Codec =
                new LazySingletonValue<>(
                        "codec",
                        "\"xz\"",
                        new TypeReference<Optional<? extends DestinationGcsSchemasFormatCodec>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_CompressionLevel =
                new LazySingletonValue<>(
                        "compression_level",
                        "6",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}


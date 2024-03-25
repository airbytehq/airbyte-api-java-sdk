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


public class DestinationS3ParquetColumnarStorage {

    /**
     * This is the size of a row group being buffered in memory. It limits the memory usage when writing. Larger values will improve the IO when reading, but consume more memory when writing. Default: 128 MB.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("block_size_mb")
    private Optional<? extends Long> blockSizeMb;

    /**
     * The compression algorithm used to compress data pages.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_codec")
    private Optional<? extends DestinationS3SchemasCompressionCodec> compressionCodec;

    /**
     * Default: true.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dictionary_encoding")
    private Optional<? extends Boolean> dictionaryEncoding;

    /**
     * There is one dictionary page per column per row group when dictionary encoding is used. The dictionary page size works like the page size but for dictionary. Default: 1024 KB.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dictionary_page_size_kb")
    private Optional<? extends Long> dictionaryPageSizeKb;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("format_type")
    private Optional<? extends DestinationS3SchemasFormatOutputFormatFormatType> formatType;

    /**
     * Maximum size allowed as padding to align row groups. This is also the minimum size of a row group. Default: 8 MB.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_padding_size_mb")
    private Optional<? extends Long> maxPaddingSizeMb;

    /**
     * The page size is for compression. A block is composed of pages. A page is the smallest unit that must be read fully to access a single record. If this value is too small, the compression will deteriorate. Default: 1024 KB.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("page_size_kb")
    private Optional<? extends Long> pageSizeKb;

    public DestinationS3ParquetColumnarStorage(
            @JsonProperty("block_size_mb") Optional<? extends Long> blockSizeMb,
            @JsonProperty("compression_codec") Optional<? extends DestinationS3SchemasCompressionCodec> compressionCodec,
            @JsonProperty("dictionary_encoding") Optional<? extends Boolean> dictionaryEncoding,
            @JsonProperty("dictionary_page_size_kb") Optional<? extends Long> dictionaryPageSizeKb,
            @JsonProperty("format_type") Optional<? extends DestinationS3SchemasFormatOutputFormatFormatType> formatType,
            @JsonProperty("max_padding_size_mb") Optional<? extends Long> maxPaddingSizeMb,
            @JsonProperty("page_size_kb") Optional<? extends Long> pageSizeKb) {
        Utils.checkNotNull(blockSizeMb, "blockSizeMb");
        Utils.checkNotNull(compressionCodec, "compressionCodec");
        Utils.checkNotNull(dictionaryEncoding, "dictionaryEncoding");
        Utils.checkNotNull(dictionaryPageSizeKb, "dictionaryPageSizeKb");
        Utils.checkNotNull(formatType, "formatType");
        Utils.checkNotNull(maxPaddingSizeMb, "maxPaddingSizeMb");
        Utils.checkNotNull(pageSizeKb, "pageSizeKb");
        this.blockSizeMb = blockSizeMb;
        this.compressionCodec = compressionCodec;
        this.dictionaryEncoding = dictionaryEncoding;
        this.dictionaryPageSizeKb = dictionaryPageSizeKb;
        this.formatType = formatType;
        this.maxPaddingSizeMb = maxPaddingSizeMb;
        this.pageSizeKb = pageSizeKb;
    }

    /**
     * This is the size of a row group being buffered in memory. It limits the memory usage when writing. Larger values will improve the IO when reading, but consume more memory when writing. Default: 128 MB.
     */
    public Optional<? extends Long> blockSizeMb() {
        return blockSizeMb;
    }

    /**
     * The compression algorithm used to compress data pages.
     */
    public Optional<? extends DestinationS3SchemasCompressionCodec> compressionCodec() {
        return compressionCodec;
    }

    /**
     * Default: true.
     */
    public Optional<? extends Boolean> dictionaryEncoding() {
        return dictionaryEncoding;
    }

    /**
     * There is one dictionary page per column per row group when dictionary encoding is used. The dictionary page size works like the page size but for dictionary. Default: 1024 KB.
     */
    public Optional<? extends Long> dictionaryPageSizeKb() {
        return dictionaryPageSizeKb;
    }

    public Optional<? extends DestinationS3SchemasFormatOutputFormatFormatType> formatType() {
        return formatType;
    }

    /**
     * Maximum size allowed as padding to align row groups. This is also the minimum size of a row group. Default: 8 MB.
     */
    public Optional<? extends Long> maxPaddingSizeMb() {
        return maxPaddingSizeMb;
    }

    /**
     * The page size is for compression. A block is composed of pages. A page is the smallest unit that must be read fully to access a single record. If this value is too small, the compression will deteriorate. Default: 1024 KB.
     */
    public Optional<? extends Long> pageSizeKb() {
        return pageSizeKb;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * This is the size of a row group being buffered in memory. It limits the memory usage when writing. Larger values will improve the IO when reading, but consume more memory when writing. Default: 128 MB.
     */
    public DestinationS3ParquetColumnarStorage withBlockSizeMb(long blockSizeMb) {
        Utils.checkNotNull(blockSizeMb, "blockSizeMb");
        this.blockSizeMb = Optional.ofNullable(blockSizeMb);
        return this;
    }

    /**
     * This is the size of a row group being buffered in memory. It limits the memory usage when writing. Larger values will improve the IO when reading, but consume more memory when writing. Default: 128 MB.
     */
    public DestinationS3ParquetColumnarStorage withBlockSizeMb(Optional<? extends Long> blockSizeMb) {
        Utils.checkNotNull(blockSizeMb, "blockSizeMb");
        this.blockSizeMb = blockSizeMb;
        return this;
    }

    /**
     * The compression algorithm used to compress data pages.
     */
    public DestinationS3ParquetColumnarStorage withCompressionCodec(DestinationS3SchemasCompressionCodec compressionCodec) {
        Utils.checkNotNull(compressionCodec, "compressionCodec");
        this.compressionCodec = Optional.ofNullable(compressionCodec);
        return this;
    }

    /**
     * The compression algorithm used to compress data pages.
     */
    public DestinationS3ParquetColumnarStorage withCompressionCodec(Optional<? extends DestinationS3SchemasCompressionCodec> compressionCodec) {
        Utils.checkNotNull(compressionCodec, "compressionCodec");
        this.compressionCodec = compressionCodec;
        return this;
    }

    /**
     * Default: true.
     */
    public DestinationS3ParquetColumnarStorage withDictionaryEncoding(boolean dictionaryEncoding) {
        Utils.checkNotNull(dictionaryEncoding, "dictionaryEncoding");
        this.dictionaryEncoding = Optional.ofNullable(dictionaryEncoding);
        return this;
    }

    /**
     * Default: true.
     */
    public DestinationS3ParquetColumnarStorage withDictionaryEncoding(Optional<? extends Boolean> dictionaryEncoding) {
        Utils.checkNotNull(dictionaryEncoding, "dictionaryEncoding");
        this.dictionaryEncoding = dictionaryEncoding;
        return this;
    }

    /**
     * There is one dictionary page per column per row group when dictionary encoding is used. The dictionary page size works like the page size but for dictionary. Default: 1024 KB.
     */
    public DestinationS3ParquetColumnarStorage withDictionaryPageSizeKb(long dictionaryPageSizeKb) {
        Utils.checkNotNull(dictionaryPageSizeKb, "dictionaryPageSizeKb");
        this.dictionaryPageSizeKb = Optional.ofNullable(dictionaryPageSizeKb);
        return this;
    }

    /**
     * There is one dictionary page per column per row group when dictionary encoding is used. The dictionary page size works like the page size but for dictionary. Default: 1024 KB.
     */
    public DestinationS3ParquetColumnarStorage withDictionaryPageSizeKb(Optional<? extends Long> dictionaryPageSizeKb) {
        Utils.checkNotNull(dictionaryPageSizeKb, "dictionaryPageSizeKb");
        this.dictionaryPageSizeKb = dictionaryPageSizeKb;
        return this;
    }

    public DestinationS3ParquetColumnarStorage withFormatType(DestinationS3SchemasFormatOutputFormatFormatType formatType) {
        Utils.checkNotNull(formatType, "formatType");
        this.formatType = Optional.ofNullable(formatType);
        return this;
    }

    public DestinationS3ParquetColumnarStorage withFormatType(Optional<? extends DestinationS3SchemasFormatOutputFormatFormatType> formatType) {
        Utils.checkNotNull(formatType, "formatType");
        this.formatType = formatType;
        return this;
    }

    /**
     * Maximum size allowed as padding to align row groups. This is also the minimum size of a row group. Default: 8 MB.
     */
    public DestinationS3ParquetColumnarStorage withMaxPaddingSizeMb(long maxPaddingSizeMb) {
        Utils.checkNotNull(maxPaddingSizeMb, "maxPaddingSizeMb");
        this.maxPaddingSizeMb = Optional.ofNullable(maxPaddingSizeMb);
        return this;
    }

    /**
     * Maximum size allowed as padding to align row groups. This is also the minimum size of a row group. Default: 8 MB.
     */
    public DestinationS3ParquetColumnarStorage withMaxPaddingSizeMb(Optional<? extends Long> maxPaddingSizeMb) {
        Utils.checkNotNull(maxPaddingSizeMb, "maxPaddingSizeMb");
        this.maxPaddingSizeMb = maxPaddingSizeMb;
        return this;
    }

    /**
     * The page size is for compression. A block is composed of pages. A page is the smallest unit that must be read fully to access a single record. If this value is too small, the compression will deteriorate. Default: 1024 KB.
     */
    public DestinationS3ParquetColumnarStorage withPageSizeKb(long pageSizeKb) {
        Utils.checkNotNull(pageSizeKb, "pageSizeKb");
        this.pageSizeKb = Optional.ofNullable(pageSizeKb);
        return this;
    }

    /**
     * The page size is for compression. A block is composed of pages. A page is the smallest unit that must be read fully to access a single record. If this value is too small, the compression will deteriorate. Default: 1024 KB.
     */
    public DestinationS3ParquetColumnarStorage withPageSizeKb(Optional<? extends Long> pageSizeKb) {
        Utils.checkNotNull(pageSizeKb, "pageSizeKb");
        this.pageSizeKb = pageSizeKb;
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
        DestinationS3ParquetColumnarStorage other = (DestinationS3ParquetColumnarStorage) o;
        return 
            java.util.Objects.deepEquals(this.blockSizeMb, other.blockSizeMb) &&
            java.util.Objects.deepEquals(this.compressionCodec, other.compressionCodec) &&
            java.util.Objects.deepEquals(this.dictionaryEncoding, other.dictionaryEncoding) &&
            java.util.Objects.deepEquals(this.dictionaryPageSizeKb, other.dictionaryPageSizeKb) &&
            java.util.Objects.deepEquals(this.formatType, other.formatType) &&
            java.util.Objects.deepEquals(this.maxPaddingSizeMb, other.maxPaddingSizeMb) &&
            java.util.Objects.deepEquals(this.pageSizeKb, other.pageSizeKb);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            blockSizeMb,
            compressionCodec,
            dictionaryEncoding,
            dictionaryPageSizeKb,
            formatType,
            maxPaddingSizeMb,
            pageSizeKb);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationS3ParquetColumnarStorage.class,
                "blockSizeMb", blockSizeMb,
                "compressionCodec", compressionCodec,
                "dictionaryEncoding", dictionaryEncoding,
                "dictionaryPageSizeKb", dictionaryPageSizeKb,
                "formatType", formatType,
                "maxPaddingSizeMb", maxPaddingSizeMb,
                "pageSizeKb", pageSizeKb);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> blockSizeMb;
 
        private Optional<? extends DestinationS3SchemasCompressionCodec> compressionCodec;
 
        private Optional<? extends Boolean> dictionaryEncoding;
 
        private Optional<? extends Long> dictionaryPageSizeKb;
 
        private Optional<? extends DestinationS3SchemasFormatOutputFormatFormatType> formatType;
 
        private Optional<? extends Long> maxPaddingSizeMb;
 
        private Optional<? extends Long> pageSizeKb;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * This is the size of a row group being buffered in memory. It limits the memory usage when writing. Larger values will improve the IO when reading, but consume more memory when writing. Default: 128 MB.
         */
        public Builder blockSizeMb(long blockSizeMb) {
            Utils.checkNotNull(blockSizeMb, "blockSizeMb");
            this.blockSizeMb = Optional.ofNullable(blockSizeMb);
            return this;
        }

        /**
         * This is the size of a row group being buffered in memory. It limits the memory usage when writing. Larger values will improve the IO when reading, but consume more memory when writing. Default: 128 MB.
         */
        public Builder blockSizeMb(Optional<? extends Long> blockSizeMb) {
            Utils.checkNotNull(blockSizeMb, "blockSizeMb");
            this.blockSizeMb = blockSizeMb;
            return this;
        }

        /**
         * The compression algorithm used to compress data pages.
         */
        public Builder compressionCodec(DestinationS3SchemasCompressionCodec compressionCodec) {
            Utils.checkNotNull(compressionCodec, "compressionCodec");
            this.compressionCodec = Optional.ofNullable(compressionCodec);
            return this;
        }

        /**
         * The compression algorithm used to compress data pages.
         */
        public Builder compressionCodec(Optional<? extends DestinationS3SchemasCompressionCodec> compressionCodec) {
            Utils.checkNotNull(compressionCodec, "compressionCodec");
            this.compressionCodec = compressionCodec;
            return this;
        }

        /**
         * Default: true.
         */
        public Builder dictionaryEncoding(boolean dictionaryEncoding) {
            Utils.checkNotNull(dictionaryEncoding, "dictionaryEncoding");
            this.dictionaryEncoding = Optional.ofNullable(dictionaryEncoding);
            return this;
        }

        /**
         * Default: true.
         */
        public Builder dictionaryEncoding(Optional<? extends Boolean> dictionaryEncoding) {
            Utils.checkNotNull(dictionaryEncoding, "dictionaryEncoding");
            this.dictionaryEncoding = dictionaryEncoding;
            return this;
        }

        /**
         * There is one dictionary page per column per row group when dictionary encoding is used. The dictionary page size works like the page size but for dictionary. Default: 1024 KB.
         */
        public Builder dictionaryPageSizeKb(long dictionaryPageSizeKb) {
            Utils.checkNotNull(dictionaryPageSizeKb, "dictionaryPageSizeKb");
            this.dictionaryPageSizeKb = Optional.ofNullable(dictionaryPageSizeKb);
            return this;
        }

        /**
         * There is one dictionary page per column per row group when dictionary encoding is used. The dictionary page size works like the page size but for dictionary. Default: 1024 KB.
         */
        public Builder dictionaryPageSizeKb(Optional<? extends Long> dictionaryPageSizeKb) {
            Utils.checkNotNull(dictionaryPageSizeKb, "dictionaryPageSizeKb");
            this.dictionaryPageSizeKb = dictionaryPageSizeKb;
            return this;
        }

        public Builder formatType(DestinationS3SchemasFormatOutputFormatFormatType formatType) {
            Utils.checkNotNull(formatType, "formatType");
            this.formatType = Optional.ofNullable(formatType);
            return this;
        }

        public Builder formatType(Optional<? extends DestinationS3SchemasFormatOutputFormatFormatType> formatType) {
            Utils.checkNotNull(formatType, "formatType");
            this.formatType = formatType;
            return this;
        }

        /**
         * Maximum size allowed as padding to align row groups. This is also the minimum size of a row group. Default: 8 MB.
         */
        public Builder maxPaddingSizeMb(long maxPaddingSizeMb) {
            Utils.checkNotNull(maxPaddingSizeMb, "maxPaddingSizeMb");
            this.maxPaddingSizeMb = Optional.ofNullable(maxPaddingSizeMb);
            return this;
        }

        /**
         * Maximum size allowed as padding to align row groups. This is also the minimum size of a row group. Default: 8 MB.
         */
        public Builder maxPaddingSizeMb(Optional<? extends Long> maxPaddingSizeMb) {
            Utils.checkNotNull(maxPaddingSizeMb, "maxPaddingSizeMb");
            this.maxPaddingSizeMb = maxPaddingSizeMb;
            return this;
        }

        /**
         * The page size is for compression. A block is composed of pages. A page is the smallest unit that must be read fully to access a single record. If this value is too small, the compression will deteriorate. Default: 1024 KB.
         */
        public Builder pageSizeKb(long pageSizeKb) {
            Utils.checkNotNull(pageSizeKb, "pageSizeKb");
            this.pageSizeKb = Optional.ofNullable(pageSizeKb);
            return this;
        }

        /**
         * The page size is for compression. A block is composed of pages. A page is the smallest unit that must be read fully to access a single record. If this value is too small, the compression will deteriorate. Default: 1024 KB.
         */
        public Builder pageSizeKb(Optional<? extends Long> pageSizeKb) {
            Utils.checkNotNull(pageSizeKb, "pageSizeKb");
            this.pageSizeKb = pageSizeKb;
            return this;
        }
        
        public DestinationS3ParquetColumnarStorage build() {
            if (blockSizeMb == null) {
                blockSizeMb = _SINGLETON_VALUE_BlockSizeMb.value();
            }
            if (compressionCodec == null) {
                compressionCodec = _SINGLETON_VALUE_CompressionCodec.value();
            }
            if (dictionaryEncoding == null) {
                dictionaryEncoding = _SINGLETON_VALUE_DictionaryEncoding.value();
            }
            if (dictionaryPageSizeKb == null) {
                dictionaryPageSizeKb = _SINGLETON_VALUE_DictionaryPageSizeKb.value();
            }
            if (formatType == null) {
                formatType = _SINGLETON_VALUE_FormatType.value();
            }
            if (maxPaddingSizeMb == null) {
                maxPaddingSizeMb = _SINGLETON_VALUE_MaxPaddingSizeMb.value();
            }
            if (pageSizeKb == null) {
                pageSizeKb = _SINGLETON_VALUE_PageSizeKb.value();
            }
            return new DestinationS3ParquetColumnarStorage(
                blockSizeMb,
                compressionCodec,
                dictionaryEncoding,
                dictionaryPageSizeKb,
                formatType,
                maxPaddingSizeMb,
                pageSizeKb);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_BlockSizeMb =
                new LazySingletonValue<>(
                        "block_size_mb",
                        "128",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends DestinationS3SchemasCompressionCodec>> _SINGLETON_VALUE_CompressionCodec =
                new LazySingletonValue<>(
                        "compression_codec",
                        "\"UNCOMPRESSED\"",
                        new TypeReference<Optional<? extends DestinationS3SchemasCompressionCodec>>() {});

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_DictionaryEncoding =
                new LazySingletonValue<>(
                        "dictionary_encoding",
                        "true",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_DictionaryPageSizeKb =
                new LazySingletonValue<>(
                        "dictionary_page_size_kb",
                        "1024",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends DestinationS3SchemasFormatOutputFormatFormatType>> _SINGLETON_VALUE_FormatType =
                new LazySingletonValue<>(
                        "format_type",
                        "\"Parquet\"",
                        new TypeReference<Optional<? extends DestinationS3SchemasFormatOutputFormatFormatType>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_MaxPaddingSizeMb =
                new LazySingletonValue<>(
                        "max_padding_size_mb",
                        "8",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_PageSizeKb =
                new LazySingletonValue<>(
                        "page_size_kb",
                        "1024",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}


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

public class DestinationGcsParquetColumnarStorage {

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
    private Optional<? extends DestinationGcsCompressionCodec> compressionCodec;

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
    private Optional<? extends DestinationGcsSchemasFormatOutputFormatFormatType> formatType;

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

    @JsonCreator
    public DestinationGcsParquetColumnarStorage(
            @JsonProperty("block_size_mb") Optional<? extends Long> blockSizeMb,
            @JsonProperty("compression_codec") Optional<? extends DestinationGcsCompressionCodec> compressionCodec,
            @JsonProperty("dictionary_encoding") Optional<? extends Boolean> dictionaryEncoding,
            @JsonProperty("dictionary_page_size_kb") Optional<? extends Long> dictionaryPageSizeKb,
            @JsonProperty("format_type") Optional<? extends DestinationGcsSchemasFormatOutputFormatFormatType> formatType,
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
    
    public DestinationGcsParquetColumnarStorage() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * This is the size of a row group being buffered in memory. It limits the memory usage when writing. Larger values will improve the IO when reading, but consume more memory when writing. Default: 128 MB.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> blockSizeMb() {
        return (Optional<Long>) blockSizeMb;
    }

    /**
     * The compression algorithm used to compress data pages.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationGcsCompressionCodec> compressionCodec() {
        return (Optional<DestinationGcsCompressionCodec>) compressionCodec;
    }

    /**
     * Default: true.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> dictionaryEncoding() {
        return (Optional<Boolean>) dictionaryEncoding;
    }

    /**
     * There is one dictionary page per column per row group when dictionary encoding is used. The dictionary page size works like the page size but for dictionary. Default: 1024 KB.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> dictionaryPageSizeKb() {
        return (Optional<Long>) dictionaryPageSizeKb;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationGcsSchemasFormatOutputFormatFormatType> formatType() {
        return (Optional<DestinationGcsSchemasFormatOutputFormatFormatType>) formatType;
    }

    /**
     * Maximum size allowed as padding to align row groups. This is also the minimum size of a row group. Default: 8 MB.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> maxPaddingSizeMb() {
        return (Optional<Long>) maxPaddingSizeMb;
    }

    /**
     * The page size is for compression. A block is composed of pages. A page is the smallest unit that must be read fully to access a single record. If this value is too small, the compression will deteriorate. Default: 1024 KB.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> pageSizeKb() {
        return (Optional<Long>) pageSizeKb;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * This is the size of a row group being buffered in memory. It limits the memory usage when writing. Larger values will improve the IO when reading, but consume more memory when writing. Default: 128 MB.
     */
    public DestinationGcsParquetColumnarStorage withBlockSizeMb(long blockSizeMb) {
        Utils.checkNotNull(blockSizeMb, "blockSizeMb");
        this.blockSizeMb = Optional.ofNullable(blockSizeMb);
        return this;
    }

    /**
     * This is the size of a row group being buffered in memory. It limits the memory usage when writing. Larger values will improve the IO when reading, but consume more memory when writing. Default: 128 MB.
     */
    public DestinationGcsParquetColumnarStorage withBlockSizeMb(Optional<? extends Long> blockSizeMb) {
        Utils.checkNotNull(blockSizeMb, "blockSizeMb");
        this.blockSizeMb = blockSizeMb;
        return this;
    }

    /**
     * The compression algorithm used to compress data pages.
     */
    public DestinationGcsParquetColumnarStorage withCompressionCodec(DestinationGcsCompressionCodec compressionCodec) {
        Utils.checkNotNull(compressionCodec, "compressionCodec");
        this.compressionCodec = Optional.ofNullable(compressionCodec);
        return this;
    }

    /**
     * The compression algorithm used to compress data pages.
     */
    public DestinationGcsParquetColumnarStorage withCompressionCodec(Optional<? extends DestinationGcsCompressionCodec> compressionCodec) {
        Utils.checkNotNull(compressionCodec, "compressionCodec");
        this.compressionCodec = compressionCodec;
        return this;
    }

    /**
     * Default: true.
     */
    public DestinationGcsParquetColumnarStorage withDictionaryEncoding(boolean dictionaryEncoding) {
        Utils.checkNotNull(dictionaryEncoding, "dictionaryEncoding");
        this.dictionaryEncoding = Optional.ofNullable(dictionaryEncoding);
        return this;
    }

    /**
     * Default: true.
     */
    public DestinationGcsParquetColumnarStorage withDictionaryEncoding(Optional<? extends Boolean> dictionaryEncoding) {
        Utils.checkNotNull(dictionaryEncoding, "dictionaryEncoding");
        this.dictionaryEncoding = dictionaryEncoding;
        return this;
    }

    /**
     * There is one dictionary page per column per row group when dictionary encoding is used. The dictionary page size works like the page size but for dictionary. Default: 1024 KB.
     */
    public DestinationGcsParquetColumnarStorage withDictionaryPageSizeKb(long dictionaryPageSizeKb) {
        Utils.checkNotNull(dictionaryPageSizeKb, "dictionaryPageSizeKb");
        this.dictionaryPageSizeKb = Optional.ofNullable(dictionaryPageSizeKb);
        return this;
    }

    /**
     * There is one dictionary page per column per row group when dictionary encoding is used. The dictionary page size works like the page size but for dictionary. Default: 1024 KB.
     */
    public DestinationGcsParquetColumnarStorage withDictionaryPageSizeKb(Optional<? extends Long> dictionaryPageSizeKb) {
        Utils.checkNotNull(dictionaryPageSizeKb, "dictionaryPageSizeKb");
        this.dictionaryPageSizeKb = dictionaryPageSizeKb;
        return this;
    }

    public DestinationGcsParquetColumnarStorage withFormatType(DestinationGcsSchemasFormatOutputFormatFormatType formatType) {
        Utils.checkNotNull(formatType, "formatType");
        this.formatType = Optional.ofNullable(formatType);
        return this;
    }

    public DestinationGcsParquetColumnarStorage withFormatType(Optional<? extends DestinationGcsSchemasFormatOutputFormatFormatType> formatType) {
        Utils.checkNotNull(formatType, "formatType");
        this.formatType = formatType;
        return this;
    }

    /**
     * Maximum size allowed as padding to align row groups. This is also the minimum size of a row group. Default: 8 MB.
     */
    public DestinationGcsParquetColumnarStorage withMaxPaddingSizeMb(long maxPaddingSizeMb) {
        Utils.checkNotNull(maxPaddingSizeMb, "maxPaddingSizeMb");
        this.maxPaddingSizeMb = Optional.ofNullable(maxPaddingSizeMb);
        return this;
    }

    /**
     * Maximum size allowed as padding to align row groups. This is also the minimum size of a row group. Default: 8 MB.
     */
    public DestinationGcsParquetColumnarStorage withMaxPaddingSizeMb(Optional<? extends Long> maxPaddingSizeMb) {
        Utils.checkNotNull(maxPaddingSizeMb, "maxPaddingSizeMb");
        this.maxPaddingSizeMb = maxPaddingSizeMb;
        return this;
    }

    /**
     * The page size is for compression. A block is composed of pages. A page is the smallest unit that must be read fully to access a single record. If this value is too small, the compression will deteriorate. Default: 1024 KB.
     */
    public DestinationGcsParquetColumnarStorage withPageSizeKb(long pageSizeKb) {
        Utils.checkNotNull(pageSizeKb, "pageSizeKb");
        this.pageSizeKb = Optional.ofNullable(pageSizeKb);
        return this;
    }

    /**
     * The page size is for compression. A block is composed of pages. A page is the smallest unit that must be read fully to access a single record. If this value is too small, the compression will deteriorate. Default: 1024 KB.
     */
    public DestinationGcsParquetColumnarStorage withPageSizeKb(Optional<? extends Long> pageSizeKb) {
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
        DestinationGcsParquetColumnarStorage other = (DestinationGcsParquetColumnarStorage) o;
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
        return Utils.toString(DestinationGcsParquetColumnarStorage.class,
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
 
        private Optional<? extends DestinationGcsCompressionCodec> compressionCodec;
 
        private Optional<? extends Boolean> dictionaryEncoding;
 
        private Optional<? extends Long> dictionaryPageSizeKb;
 
        private Optional<? extends DestinationGcsSchemasFormatOutputFormatFormatType> formatType;
 
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
        public Builder compressionCodec(DestinationGcsCompressionCodec compressionCodec) {
            Utils.checkNotNull(compressionCodec, "compressionCodec");
            this.compressionCodec = Optional.ofNullable(compressionCodec);
            return this;
        }

        /**
         * The compression algorithm used to compress data pages.
         */
        public Builder compressionCodec(Optional<? extends DestinationGcsCompressionCodec> compressionCodec) {
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

        public Builder formatType(DestinationGcsSchemasFormatOutputFormatFormatType formatType) {
            Utils.checkNotNull(formatType, "formatType");
            this.formatType = Optional.ofNullable(formatType);
            return this;
        }

        public Builder formatType(Optional<? extends DestinationGcsSchemasFormatOutputFormatFormatType> formatType) {
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
        
        public DestinationGcsParquetColumnarStorage build() {
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
            return new DestinationGcsParquetColumnarStorage(
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

        private static final LazySingletonValue<Optional<? extends DestinationGcsCompressionCodec>> _SINGLETON_VALUE_CompressionCodec =
                new LazySingletonValue<>(
                        "compression_codec",
                        "\"UNCOMPRESSED\"",
                        new TypeReference<Optional<? extends DestinationGcsCompressionCodec>>() {});

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

        private static final LazySingletonValue<Optional<? extends DestinationGcsSchemasFormatOutputFormatFormatType>> _SINGLETON_VALUE_FormatType =
                new LazySingletonValue<>(
                        "format_type",
                        "\"Parquet\"",
                        new TypeReference<Optional<? extends DestinationGcsSchemasFormatOutputFormatFormatType>>() {});

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


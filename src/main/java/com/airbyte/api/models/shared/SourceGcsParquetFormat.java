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

public class SourceGcsParquetFormat {

    /**
     * Whether to convert decimal fields to floats. There is a loss of precision when converting decimals to floats, so this is not recommended.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("decimal_as_float")
    private Optional<? extends Boolean> decimalAsFloat;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filetype")
    private Optional<? extends SourceGcsSchemasStreamsFormatFiletype> filetype;

    @JsonCreator
    public SourceGcsParquetFormat(
            @JsonProperty("decimal_as_float") Optional<? extends Boolean> decimalAsFloat) {
        Utils.checkNotNull(decimalAsFloat, "decimalAsFloat");
        this.decimalAsFloat = decimalAsFloat;
        this.filetype = Builder._SINGLETON_VALUE_Filetype.value();
    }
    
    public SourceGcsParquetFormat() {
        this(Optional.empty());
    }

    /**
     * Whether to convert decimal fields to floats. There is a loss of precision when converting decimals to floats, so this is not recommended.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> decimalAsFloat() {
        return (Optional<Boolean>) decimalAsFloat;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceGcsSchemasStreamsFormatFiletype> filetype() {
        return (Optional<SourceGcsSchemasStreamsFormatFiletype>) filetype;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Whether to convert decimal fields to floats. There is a loss of precision when converting decimals to floats, so this is not recommended.
     */
    public SourceGcsParquetFormat withDecimalAsFloat(boolean decimalAsFloat) {
        Utils.checkNotNull(decimalAsFloat, "decimalAsFloat");
        this.decimalAsFloat = Optional.ofNullable(decimalAsFloat);
        return this;
    }

    /**
     * Whether to convert decimal fields to floats. There is a loss of precision when converting decimals to floats, so this is not recommended.
     */
    public SourceGcsParquetFormat withDecimalAsFloat(Optional<? extends Boolean> decimalAsFloat) {
        Utils.checkNotNull(decimalAsFloat, "decimalAsFloat");
        this.decimalAsFloat = decimalAsFloat;
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
        SourceGcsParquetFormat other = (SourceGcsParquetFormat) o;
        return 
            java.util.Objects.deepEquals(this.decimalAsFloat, other.decimalAsFloat) &&
            java.util.Objects.deepEquals(this.filetype, other.filetype);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            decimalAsFloat,
            filetype);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGcsParquetFormat.class,
                "decimalAsFloat", decimalAsFloat,
                "filetype", filetype);
    }
    
    public final static class Builder {
 
        private Optional<? extends Boolean> decimalAsFloat;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Whether to convert decimal fields to floats. There is a loss of precision when converting decimals to floats, so this is not recommended.
         */
        public Builder decimalAsFloat(boolean decimalAsFloat) {
            Utils.checkNotNull(decimalAsFloat, "decimalAsFloat");
            this.decimalAsFloat = Optional.ofNullable(decimalAsFloat);
            return this;
        }

        /**
         * Whether to convert decimal fields to floats. There is a loss of precision when converting decimals to floats, so this is not recommended.
         */
        public Builder decimalAsFloat(Optional<? extends Boolean> decimalAsFloat) {
            Utils.checkNotNull(decimalAsFloat, "decimalAsFloat");
            this.decimalAsFloat = decimalAsFloat;
            return this;
        }
        
        public SourceGcsParquetFormat build() {
            if (decimalAsFloat == null) {
                decimalAsFloat = _SINGLETON_VALUE_DecimalAsFloat.value();
            }
            return new SourceGcsParquetFormat(
                decimalAsFloat);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_DecimalAsFloat =
                new LazySingletonValue<>(
                        "decimal_as_float",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<Optional<? extends SourceGcsSchemasStreamsFormatFiletype>> _SINGLETON_VALUE_Filetype =
                new LazySingletonValue<>(
                        "filetype",
                        "\"parquet\"",
                        new TypeReference<Optional<? extends SourceGcsSchemasStreamsFormatFiletype>>() {});
    }
}

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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class SourceSftpBulkParquetFormat {

    /**
     * Whether to convert decimal fields to floats. There is a loss of precision when converting decimals to floats, so this is not recommended.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("decimal_as_float")
    private Optional<Boolean> decimalAsFloat;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filetype")
    private Optional<? extends SourceSftpBulkSchemasStreamsFormatFiletype> filetype;

    @JsonCreator
    public SourceSftpBulkParquetFormat(
            @JsonProperty("decimal_as_float") Optional<Boolean> decimalAsFloat) {
        Utils.checkNotNull(decimalAsFloat, "decimalAsFloat");
        this.decimalAsFloat = decimalAsFloat;
        this.filetype = Builder._SINGLETON_VALUE_Filetype.value();
    }
    
    public SourceSftpBulkParquetFormat() {
        this(Optional.empty());
    }

    /**
     * Whether to convert decimal fields to floats. There is a loss of precision when converting decimals to floats, so this is not recommended.
     */
    @JsonIgnore
    public Optional<Boolean> decimalAsFloat() {
        return decimalAsFloat;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceSftpBulkSchemasStreamsFormatFiletype> filetype() {
        return (Optional<SourceSftpBulkSchemasStreamsFormatFiletype>) filetype;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Whether to convert decimal fields to floats. There is a loss of precision when converting decimals to floats, so this is not recommended.
     */
    public SourceSftpBulkParquetFormat withDecimalAsFloat(boolean decimalAsFloat) {
        Utils.checkNotNull(decimalAsFloat, "decimalAsFloat");
        this.decimalAsFloat = Optional.ofNullable(decimalAsFloat);
        return this;
    }

    /**
     * Whether to convert decimal fields to floats. There is a loss of precision when converting decimals to floats, so this is not recommended.
     */
    public SourceSftpBulkParquetFormat withDecimalAsFloat(Optional<Boolean> decimalAsFloat) {
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
        SourceSftpBulkParquetFormat other = (SourceSftpBulkParquetFormat) o;
        return 
            Objects.deepEquals(this.decimalAsFloat, other.decimalAsFloat) &&
            Objects.deepEquals(this.filetype, other.filetype);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            decimalAsFloat,
            filetype);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSftpBulkParquetFormat.class,
                "decimalAsFloat", decimalAsFloat,
                "filetype", filetype);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> decimalAsFloat;
        
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
        public Builder decimalAsFloat(Optional<Boolean> decimalAsFloat) {
            Utils.checkNotNull(decimalAsFloat, "decimalAsFloat");
            this.decimalAsFloat = decimalAsFloat;
            return this;
        }
        
        public SourceSftpBulkParquetFormat build() {
            if (decimalAsFloat == null) {
                decimalAsFloat = _SINGLETON_VALUE_DecimalAsFloat.value();
            }
            return new SourceSftpBulkParquetFormat(
                decimalAsFloat);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_DecimalAsFloat =
                new LazySingletonValue<>(
                        "decimal_as_float",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});

        private static final LazySingletonValue<Optional<? extends SourceSftpBulkSchemasStreamsFormatFiletype>> _SINGLETON_VALUE_Filetype =
                new LazySingletonValue<>(
                        "filetype",
                        "\"parquet\"",
                        new TypeReference<Optional<? extends SourceSftpBulkSchemasStreamsFormatFiletype>>() {});
    }
}

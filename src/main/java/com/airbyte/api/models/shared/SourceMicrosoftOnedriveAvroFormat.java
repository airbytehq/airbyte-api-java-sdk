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


public class SourceMicrosoftOnedriveAvroFormat {

    /**
     * Whether to convert double fields to strings. This is recommended if you have decimal numbers with a high degree of precision because there can be a loss precision when handling floating point numbers.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("double_as_string")
    private Optional<? extends Boolean> doubleAsString;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filetype")
    private Optional<? extends SourceMicrosoftOnedriveFiletype> filetype;

    @JsonCreator
    public SourceMicrosoftOnedriveAvroFormat(
            @JsonProperty("double_as_string") Optional<? extends Boolean> doubleAsString) {
        Utils.checkNotNull(doubleAsString, "doubleAsString");
        this.doubleAsString = doubleAsString;
        this.filetype = Builder._SINGLETON_VALUE_Filetype.value();
    }
    
    public SourceMicrosoftOnedriveAvroFormat() {
        this(Optional.empty());
    }

    /**
     * Whether to convert double fields to strings. This is recommended if you have decimal numbers with a high degree of precision because there can be a loss precision when handling floating point numbers.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> doubleAsString() {
        return (Optional<Boolean>) doubleAsString;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceMicrosoftOnedriveFiletype> filetype() {
        return (Optional<SourceMicrosoftOnedriveFiletype>) filetype;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Whether to convert double fields to strings. This is recommended if you have decimal numbers with a high degree of precision because there can be a loss precision when handling floating point numbers.
     */
    public SourceMicrosoftOnedriveAvroFormat withDoubleAsString(boolean doubleAsString) {
        Utils.checkNotNull(doubleAsString, "doubleAsString");
        this.doubleAsString = Optional.ofNullable(doubleAsString);
        return this;
    }

    /**
     * Whether to convert double fields to strings. This is recommended if you have decimal numbers with a high degree of precision because there can be a loss precision when handling floating point numbers.
     */
    public SourceMicrosoftOnedriveAvroFormat withDoubleAsString(Optional<? extends Boolean> doubleAsString) {
        Utils.checkNotNull(doubleAsString, "doubleAsString");
        this.doubleAsString = doubleAsString;
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
        SourceMicrosoftOnedriveAvroFormat other = (SourceMicrosoftOnedriveAvroFormat) o;
        return 
            java.util.Objects.deepEquals(this.doubleAsString, other.doubleAsString) &&
            java.util.Objects.deepEquals(this.filetype, other.filetype);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            doubleAsString,
            filetype);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMicrosoftOnedriveAvroFormat.class,
                "doubleAsString", doubleAsString,
                "filetype", filetype);
    }
    
    public final static class Builder {
 
        private Optional<? extends Boolean> doubleAsString;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Whether to convert double fields to strings. This is recommended if you have decimal numbers with a high degree of precision because there can be a loss precision when handling floating point numbers.
         */
        public Builder doubleAsString(boolean doubleAsString) {
            Utils.checkNotNull(doubleAsString, "doubleAsString");
            this.doubleAsString = Optional.ofNullable(doubleAsString);
            return this;
        }

        /**
         * Whether to convert double fields to strings. This is recommended if you have decimal numbers with a high degree of precision because there can be a loss precision when handling floating point numbers.
         */
        public Builder doubleAsString(Optional<? extends Boolean> doubleAsString) {
            Utils.checkNotNull(doubleAsString, "doubleAsString");
            this.doubleAsString = doubleAsString;
            return this;
        }
        
        public SourceMicrosoftOnedriveAvroFormat build() {
            if (doubleAsString == null) {
                doubleAsString = _SINGLETON_VALUE_DoubleAsString.value();
            }
            return new SourceMicrosoftOnedriveAvroFormat(
                doubleAsString);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_DoubleAsString =
                new LazySingletonValue<>(
                        "double_as_string",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<Optional<? extends SourceMicrosoftOnedriveFiletype>> _SINGLETON_VALUE_Filetype =
                new LazySingletonValue<>(
                        "filetype",
                        "\"avro\"",
                        new TypeReference<Optional<? extends SourceMicrosoftOnedriveFiletype>>() {});
    }
}


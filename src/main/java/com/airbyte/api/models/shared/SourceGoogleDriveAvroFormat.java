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

public class SourceGoogleDriveAvroFormat {

    /**
     * Whether to convert double fields to strings. This is recommended if you have decimal numbers with a high degree of precision because there can be a loss precision when handling floating point numbers.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("double_as_string")
    private Optional<Boolean> doubleAsString;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filetype")
    private Optional<? extends SourceGoogleDriveFiletype> filetype;

    @JsonCreator
    public SourceGoogleDriveAvroFormat(
            @JsonProperty("double_as_string") Optional<Boolean> doubleAsString) {
        Utils.checkNotNull(doubleAsString, "doubleAsString");
        this.doubleAsString = doubleAsString;
        this.filetype = Builder._SINGLETON_VALUE_Filetype.value();
    }
    
    public SourceGoogleDriveAvroFormat() {
        this(Optional.empty());
    }

    /**
     * Whether to convert double fields to strings. This is recommended if you have decimal numbers with a high degree of precision because there can be a loss precision when handling floating point numbers.
     */
    @JsonIgnore
    public Optional<Boolean> doubleAsString() {
        return doubleAsString;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceGoogleDriveFiletype> filetype() {
        return (Optional<SourceGoogleDriveFiletype>) filetype;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Whether to convert double fields to strings. This is recommended if you have decimal numbers with a high degree of precision because there can be a loss precision when handling floating point numbers.
     */
    public SourceGoogleDriveAvroFormat withDoubleAsString(boolean doubleAsString) {
        Utils.checkNotNull(doubleAsString, "doubleAsString");
        this.doubleAsString = Optional.ofNullable(doubleAsString);
        return this;
    }

    /**
     * Whether to convert double fields to strings. This is recommended if you have decimal numbers with a high degree of precision because there can be a loss precision when handling floating point numbers.
     */
    public SourceGoogleDriveAvroFormat withDoubleAsString(Optional<Boolean> doubleAsString) {
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
        SourceGoogleDriveAvroFormat other = (SourceGoogleDriveAvroFormat) o;
        return 
            Objects.deepEquals(this.doubleAsString, other.doubleAsString) &&
            Objects.deepEquals(this.filetype, other.filetype);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            doubleAsString,
            filetype);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleDriveAvroFormat.class,
                "doubleAsString", doubleAsString,
                "filetype", filetype);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> doubleAsString;
        
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
        public Builder doubleAsString(Optional<Boolean> doubleAsString) {
            Utils.checkNotNull(doubleAsString, "doubleAsString");
            this.doubleAsString = doubleAsString;
            return this;
        }
        
        public SourceGoogleDriveAvroFormat build() {
            if (doubleAsString == null) {
                doubleAsString = _SINGLETON_VALUE_DoubleAsString.value();
            }
            return new SourceGoogleDriveAvroFormat(
                doubleAsString);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_DoubleAsString =
                new LazySingletonValue<>(
                        "double_as_string",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});

        private static final LazySingletonValue<Optional<? extends SourceGoogleDriveFiletype>> _SINGLETON_VALUE_Filetype =
                new LazySingletonValue<>(
                        "filetype",
                        "\"avro\"",
                        new TypeReference<Optional<? extends SourceGoogleDriveFiletype>>() {});
    }
}

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


public class Enabled {

    /**
     * Name of the "deleted at" column.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("column")
    private Optional<? extends String> column;

    @JsonProperty("deletion_mode")
    private SourceFaunaSchemasDeletionMode deletionMode;

    public Enabled(
            @JsonProperty("column") Optional<? extends String> column) {
        Utils.checkNotNull(column, "column");
        this.column = column;
        this.deletionMode = Builder._SINGLETON_VALUE_DeletionMode.value();
    }

    /**
     * Name of the "deleted at" column.
     */
    public Optional<? extends String> column() {
        return column;
    }

    public SourceFaunaSchemasDeletionMode deletionMode() {
        return deletionMode;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Name of the "deleted at" column.
     */
    public Enabled withColumn(String column) {
        Utils.checkNotNull(column, "column");
        this.column = Optional.ofNullable(column);
        return this;
    }

    /**
     * Name of the "deleted at" column.
     */
    public Enabled withColumn(Optional<? extends String> column) {
        Utils.checkNotNull(column, "column");
        this.column = column;
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
        Enabled other = (Enabled) o;
        return 
            java.util.Objects.deepEquals(this.column, other.column) &&
            java.util.Objects.deepEquals(this.deletionMode, other.deletionMode);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            column,
            deletionMode);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Enabled.class,
                "column", column,
                "deletionMode", deletionMode);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> column;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Name of the "deleted at" column.
         */
        public Builder column(String column) {
            Utils.checkNotNull(column, "column");
            this.column = Optional.ofNullable(column);
            return this;
        }

        /**
         * Name of the "deleted at" column.
         */
        public Builder column(Optional<? extends String> column) {
            Utils.checkNotNull(column, "column");
            this.column = column;
            return this;
        }
        
        public Enabled build() {
            if (column == null) {
                column = _SINGLETON_VALUE_Column.value();
            }
            return new Enabled(
                column);
        }

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_Column =
                new LazySingletonValue<>(
                        "column",
                        "\"deleted_at\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<SourceFaunaSchemasDeletionMode> _SINGLETON_VALUE_DeletionMode =
                new LazySingletonValue<>(
                        "deletion_mode",
                        "\"deleted_field\"",
                        new TypeReference<SourceFaunaSchemasDeletionMode>() {});
    }
}


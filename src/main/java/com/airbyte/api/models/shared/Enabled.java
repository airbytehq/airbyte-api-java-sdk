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
import java.util.Objects;
import java.util.Optional;


public class Enabled {

    /**
     * Name of the "deleted at" column.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("column")
    private Optional<String> column;

    @JsonProperty("deletion_mode")
    private SourceFaunaSchemasDeletionMode deletionMode;

    @JsonCreator
    public Enabled(
            @JsonProperty("column") Optional<String> column) {
        Utils.checkNotNull(column, "column");
        this.column = column;
        this.deletionMode = Builder._SINGLETON_VALUE_DeletionMode.value();
    }
    
    public Enabled() {
        this(Optional.empty());
    }

    /**
     * Name of the "deleted at" column.
     */
    @JsonIgnore
    public Optional<String> column() {
        return column;
    }

    @JsonIgnore
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
    public Enabled withColumn(Optional<String> column) {
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
            Objects.deepEquals(this.column, other.column) &&
            Objects.deepEquals(this.deletionMode, other.deletionMode);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Optional<String> column;  
        
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
        public Builder column(Optional<String> column) {
            Utils.checkNotNull(column, "column");
            this.column = column;
            return this;
        }
        
        public Enabled build() {
            if (column == null) {
                column = _SINGLETON_VALUE_Column.value();
            }            return new Enabled(
                column);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_Column =
                new LazySingletonValue<>(
                        "column",
                        "\"deleted_at\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<SourceFaunaSchemasDeletionMode> _SINGLETON_VALUE_DeletionMode =
                new LazySingletonValue<>(
                        "deletion_mode",
                        "\"deleted_field\"",
                        new TypeReference<SourceFaunaSchemasDeletionMode>() {});
    }
}


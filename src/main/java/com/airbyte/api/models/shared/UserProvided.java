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
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class UserProvided {

    /**
     * The column names that will be used while emitting the CSV records
     */
    @JsonProperty("column_names")
    private List<String> columnNames;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("header_definition_type")
    private Optional<? extends SourceAzureBlobStorageSchemasHeaderDefinitionType> headerDefinitionType;

    @JsonCreator
    public UserProvided(
            @JsonProperty("column_names") List<String> columnNames) {
        Utils.checkNotNull(columnNames, "columnNames");
        this.columnNames = columnNames;
        this.headerDefinitionType = Builder._SINGLETON_VALUE_HeaderDefinitionType.value();
    }

    /**
     * The column names that will be used while emitting the CSV records
     */
    @JsonIgnore
    public List<String> columnNames() {
        return columnNames;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceAzureBlobStorageSchemasHeaderDefinitionType> headerDefinitionType() {
        return (Optional<SourceAzureBlobStorageSchemasHeaderDefinitionType>) headerDefinitionType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The column names that will be used while emitting the CSV records
     */
    public UserProvided withColumnNames(List<String> columnNames) {
        Utils.checkNotNull(columnNames, "columnNames");
        this.columnNames = columnNames;
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
        UserProvided other = (UserProvided) o;
        return 
            Objects.deepEquals(this.columnNames, other.columnNames) &&
            Objects.deepEquals(this.headerDefinitionType, other.headerDefinitionType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            columnNames,
            headerDefinitionType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UserProvided.class,
                "columnNames", columnNames,
                "headerDefinitionType", headerDefinitionType);
    }
    
    public final static class Builder {
 
        private List<String> columnNames;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The column names that will be used while emitting the CSV records
         */
        public Builder columnNames(List<String> columnNames) {
            Utils.checkNotNull(columnNames, "columnNames");
            this.columnNames = columnNames;
            return this;
        }
        
        public UserProvided build() {
            return new UserProvided(
                columnNames);
        }

        private static final LazySingletonValue<Optional<? extends SourceAzureBlobStorageSchemasHeaderDefinitionType>> _SINGLETON_VALUE_HeaderDefinitionType =
                new LazySingletonValue<>(
                        "header_definition_type",
                        "\"User Provided\"",
                        new TypeReference<Optional<? extends SourceAzureBlobStorageSchemasHeaderDefinitionType>>() {});
    }
}


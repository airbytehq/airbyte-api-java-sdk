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
import java.util.Objects;
import java.util.Optional;


public class SourceSftpBulkAutogenerated {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("header_definition_type")
    private Optional<? extends SourceSftpBulkSchemasHeaderDefinitionType> headerDefinitionType;

    @JsonCreator
    public SourceSftpBulkAutogenerated() {
        
        this.headerDefinitionType = Builder._SINGLETON_VALUE_HeaderDefinitionType.value();
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceSftpBulkSchemasHeaderDefinitionType> headerDefinitionType() {
        return (Optional<SourceSftpBulkSchemasHeaderDefinitionType>) headerDefinitionType;
    }

    public final static Builder builder() {
        return new Builder();
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SourceSftpBulkAutogenerated other = (SourceSftpBulkAutogenerated) o;
        return 
            Objects.deepEquals(this.headerDefinitionType, other.headerDefinitionType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            headerDefinitionType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSftpBulkAutogenerated.class,
                "headerDefinitionType", headerDefinitionType);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public SourceSftpBulkAutogenerated build() {
            return new SourceSftpBulkAutogenerated(
                );
        }

        private static final LazySingletonValue<Optional<? extends SourceSftpBulkSchemasHeaderDefinitionType>> _SINGLETON_VALUE_HeaderDefinitionType =
                new LazySingletonValue<>(
                        "header_definition_type",
                        "\"Autogenerated\"",
                        new TypeReference<Optional<? extends SourceSftpBulkSchemasHeaderDefinitionType>>() {});
    }
}


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


public class SourceMicrosoftSharepointAutogenerated {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("header_definition_type")
    private Optional<? extends SourceMicrosoftSharepointSchemasHeaderDefinitionType> headerDefinitionType;

    @JsonCreator
    public SourceMicrosoftSharepointAutogenerated() {
        
        this.headerDefinitionType = Builder._SINGLETON_VALUE_HeaderDefinitionType.value();
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceMicrosoftSharepointSchemasHeaderDefinitionType> headerDefinitionType() {
        return (Optional<SourceMicrosoftSharepointSchemasHeaderDefinitionType>) headerDefinitionType;
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
        SourceMicrosoftSharepointAutogenerated other = (SourceMicrosoftSharepointAutogenerated) o;
        return 
            java.util.Objects.deepEquals(this.headerDefinitionType, other.headerDefinitionType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            headerDefinitionType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMicrosoftSharepointAutogenerated.class,
                "headerDefinitionType", headerDefinitionType);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public SourceMicrosoftSharepointAutogenerated build() {
            return new SourceMicrosoftSharepointAutogenerated(
                );
        }

        private static final LazySingletonValue<Optional<? extends SourceMicrosoftSharepointSchemasHeaderDefinitionType>> _SINGLETON_VALUE_HeaderDefinitionType =
                new LazySingletonValue<>(
                        "header_definition_type",
                        "\"Autogenerated\"",
                        new TypeReference<Optional<? extends SourceMicrosoftSharepointSchemasHeaderDefinitionType>>() {});
    }
}


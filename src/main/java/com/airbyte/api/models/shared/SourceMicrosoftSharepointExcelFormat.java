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

public class SourceMicrosoftSharepointExcelFormat {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filetype")
    private Optional<? extends SourceMicrosoftSharepointSchemasStreamsFormatFormat6Filetype> filetype;

    @JsonCreator
    public SourceMicrosoftSharepointExcelFormat() {
        
        this.filetype = Builder._SINGLETON_VALUE_Filetype.value();
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceMicrosoftSharepointSchemasStreamsFormatFormat6Filetype> filetype() {
        return (Optional<SourceMicrosoftSharepointSchemasStreamsFormatFormat6Filetype>) filetype;
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
        SourceMicrosoftSharepointExcelFormat other = (SourceMicrosoftSharepointExcelFormat) o;
        return 
            Objects.deepEquals(this.filetype, other.filetype);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            filetype);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMicrosoftSharepointExcelFormat.class,
                "filetype", filetype);
    }
    
    public final static class Builder {
        
        private Builder() {
          // force use of static builder() method
        }
        
        public SourceMicrosoftSharepointExcelFormat build() {
            return new SourceMicrosoftSharepointExcelFormat(
                );
        }

        private static final LazySingletonValue<Optional<? extends SourceMicrosoftSharepointSchemasStreamsFormatFormat6Filetype>> _SINGLETON_VALUE_Filetype =
                new LazySingletonValue<>(
                        "filetype",
                        "\"excel\"",
                        new TypeReference<Optional<? extends SourceMicrosoftSharepointSchemasStreamsFormatFormat6Filetype>>() {});
    }
}

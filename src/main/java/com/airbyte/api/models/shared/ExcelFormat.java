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

public class ExcelFormat {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filetype")
    private Optional<? extends SourceGcsSchemasStreamsFormatFormat6Filetype> filetype;

    @JsonCreator
    public ExcelFormat() {
        
        this.filetype = Builder._SINGLETON_VALUE_Filetype.value();
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceGcsSchemasStreamsFormatFormat6Filetype> filetype() {
        return (Optional<SourceGcsSchemasStreamsFormatFormat6Filetype>) filetype;
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
        ExcelFormat other = (ExcelFormat) o;
        return 
            java.util.Objects.deepEquals(this.filetype, other.filetype);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            filetype);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ExcelFormat.class,
                "filetype", filetype);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public ExcelFormat build() {
            return new ExcelFormat(
                );
        }

        private static final LazySingletonValue<Optional<? extends SourceGcsSchemasStreamsFormatFormat6Filetype>> _SINGLETON_VALUE_Filetype =
                new LazySingletonValue<>(
                        "filetype",
                        "\"excel\"",
                        new TypeReference<Optional<? extends SourceGcsSchemasStreamsFormatFormat6Filetype>>() {});
    }
}

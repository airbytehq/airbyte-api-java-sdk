/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class DestinationAzureBlobStorageJSONLinesNewlineDelimitedJSON {

    @JsonProperty("format_type")
    private DestinationAzureBlobStorageFormatType formatType;

    @JsonCreator
    public DestinationAzureBlobStorageJSONLinesNewlineDelimitedJSON() {
        
        this.formatType = Builder._SINGLETON_VALUE_FormatType.value();
    }

    @JsonIgnore
    public DestinationAzureBlobStorageFormatType formatType() {
        return formatType;
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
        DestinationAzureBlobStorageJSONLinesNewlineDelimitedJSON other = (DestinationAzureBlobStorageJSONLinesNewlineDelimitedJSON) o;
        return 
            java.util.Objects.deepEquals(this.formatType, other.formatType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            formatType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationAzureBlobStorageJSONLinesNewlineDelimitedJSON.class,
                "formatType", formatType);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public DestinationAzureBlobStorageJSONLinesNewlineDelimitedJSON build() {
            return new DestinationAzureBlobStorageJSONLinesNewlineDelimitedJSON(
                );
        }

        private static final LazySingletonValue<DestinationAzureBlobStorageFormatType> _SINGLETON_VALUE_FormatType =
                new LazySingletonValue<>(
                        "format_type",
                        "\"JSONL\"",
                        new TypeReference<DestinationAzureBlobStorageFormatType>() {});
    }
}


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

/**
 * SourceGoogleDriveLocal - Process files locally, supporting `fast` and `ocr` modes. This is the default option.
 */

public class SourceGoogleDriveLocal {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends SourceGoogleDriveMode> mode;

    public SourceGoogleDriveLocal() {
        
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
    }

    public Optional<? extends SourceGoogleDriveMode> mode() {
        return mode;
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
        SourceGoogleDriveLocal other = (SourceGoogleDriveLocal) o;
        return 
            java.util.Objects.deepEquals(this.mode, other.mode);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            mode);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleDriveLocal.class,
                "mode", mode);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public SourceGoogleDriveLocal build() {
            if (mode == null) {
                mode = _SINGLETON_VALUE_Mode.value();
            }
            return new SourceGoogleDriveLocal(
                );
        }

        private static final LazySingletonValue<Optional<? extends SourceGoogleDriveMode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"local\"",
                        new TypeReference<Optional<? extends SourceGoogleDriveMode>>() {});
    }
}


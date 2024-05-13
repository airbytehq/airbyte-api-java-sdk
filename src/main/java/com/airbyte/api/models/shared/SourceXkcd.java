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


public class SourceXkcd {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceType")
    private Optional<? extends Xkcd> sourceType;

    @JsonCreator
    public SourceXkcd() {
        
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Xkcd> sourceType() {
        return (Optional<Xkcd>) sourceType;
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
        SourceXkcd other = (SourceXkcd) o;
        return 
            java.util.Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceXkcd.class,
                "sourceType", sourceType);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public SourceXkcd build() {
            return new SourceXkcd(
                );
        }

        private static final LazySingletonValue<Optional<? extends Xkcd>> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"xkcd\"",
                        new TypeReference<Optional<? extends Xkcd>>() {});
    }
}


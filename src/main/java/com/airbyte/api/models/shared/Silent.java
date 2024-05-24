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

public class Silent {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("test_destination_type")
    private Optional<? extends TestDestinationType> testDestinationType;

    @JsonCreator
    public Silent() {
        
        this.testDestinationType = Builder._SINGLETON_VALUE_TestDestinationType.value();
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TestDestinationType> testDestinationType() {
        return (Optional<TestDestinationType>) testDestinationType;
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
        Silent other = (Silent) o;
        return 
            java.util.Objects.deepEquals(this.testDestinationType, other.testDestinationType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            testDestinationType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Silent.class,
                "testDestinationType", testDestinationType);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public Silent build() {
            return new Silent(
                );
        }

        private static final LazySingletonValue<Optional<? extends TestDestinationType>> _SINGLETON_VALUE_TestDestinationType =
                new LazySingletonValue<>(
                        "test_destination_type",
                        "\"SILENT\"",
                        new TypeReference<Optional<? extends TestDestinationType>>() {});
    }
}


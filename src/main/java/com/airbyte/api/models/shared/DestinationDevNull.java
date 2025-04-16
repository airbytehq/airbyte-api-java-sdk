/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class DestinationDevNull {

    @JsonProperty("destinationType")
    private DevNull destinationType;

    /**
     * The type of destination to be used
     */
    @JsonProperty("test_destination")
    private TestDestination testDestination;

    @JsonCreator
    public DestinationDevNull(
            @JsonProperty("test_destination") TestDestination testDestination) {
        Utils.checkNotNull(testDestination, "testDestination");
        this.destinationType = Builder._SINGLETON_VALUE_DestinationType.value();
        this.testDestination = testDestination;
    }

    @JsonIgnore
    public DevNull destinationType() {
        return destinationType;
    }

    /**
     * The type of destination to be used
     */
    @JsonIgnore
    public TestDestination testDestination() {
        return testDestination;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The type of destination to be used
     */
    public DestinationDevNull withTestDestination(TestDestination testDestination) {
        Utils.checkNotNull(testDestination, "testDestination");
        this.testDestination = testDestination;
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
        DestinationDevNull other = (DestinationDevNull) o;
        return 
            Objects.deepEquals(this.destinationType, other.destinationType) &&
            Objects.deepEquals(this.testDestination, other.testDestination);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            destinationType,
            testDestination);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationDevNull.class,
                "destinationType", destinationType,
                "testDestination", testDestination);
    }
    
    public final static class Builder {
 
        private TestDestination testDestination;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The type of destination to be used
         */
        public Builder testDestination(TestDestination testDestination) {
            Utils.checkNotNull(testDestination, "testDestination");
            this.testDestination = testDestination;
            return this;
        }
        
        public DestinationDevNull build() {
            return new DestinationDevNull(
                testDestination);
        }

        private static final LazySingletonValue<DevNull> _SINGLETON_VALUE_DestinationType =
                new LazySingletonValue<>(
                        "destinationType",
                        "\"dev-null\"",
                        new TypeReference<DevNull>() {});
    }
}

/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

public class Not implements RowFilteringOperation {

    /**
     * Conditions to evaluate with the NOT operator.
     */
    @JsonProperty("conditions")
    private List<RowFilteringOperation> conditions;

    @JsonProperty("type")
    private RowFilteringOperationType type;

    @JsonCreator
    public Not(
            @JsonProperty("conditions") List<RowFilteringOperation> conditions,
            @JsonProperty("type") RowFilteringOperationType type) {
        Utils.checkNotNull(conditions, "conditions");
        Utils.checkNotNull(type, "type");
        this.conditions = conditions;
        this.type = type;
    }

    /**
     * Conditions to evaluate with the NOT operator.
     */
    @JsonIgnore
    public List<RowFilteringOperation> conditions() {
        return conditions;
    }

    @JsonIgnore
    @Override
    public String type() {
        return Utils.discriminatorToString(type);
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Conditions to evaluate with the NOT operator.
     */
    public Not withConditions(List<RowFilteringOperation> conditions) {
        Utils.checkNotNull(conditions, "conditions");
        this.conditions = conditions;
        return this;
    }

    public Not withType(RowFilteringOperationType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        Not other = (Not) o;
        return 
            Objects.deepEquals(this.conditions, other.conditions) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            conditions,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Not.class,
                "conditions", conditions,
                "type", type);
    }
    
    public final static class Builder {
 
        private List<RowFilteringOperation> conditions;
 
        private RowFilteringOperationType type;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Conditions to evaluate with the NOT operator.
         */
        public Builder conditions(List<RowFilteringOperation> conditions) {
            Utils.checkNotNull(conditions, "conditions");
            this.conditions = conditions;
            return this;
        }

        public Builder type(RowFilteringOperationType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public Not build() {
            return new Not(
                conditions,
                type);
        }
    }
}

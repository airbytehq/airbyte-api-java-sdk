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

/**
 * SourcePostgresScanChangesWithUserDefinedCursor
 * 
 * <p>Incrementally detects new inserts and updates using the &lt;a href="https://docs.airbyte.com/understanding-airbyte/connections/incremental-append/#user-defined-cursor"&gt;cursor column&lt;/a&gt; chosen when configuring a connection (e.g. created_at, updated_at).
 */
public class SourcePostgresScanChangesWithUserDefinedCursor {

    @JsonProperty("method")
    private SourcePostgresSchemasReplicationMethodMethod method;

    @JsonCreator
    public SourcePostgresScanChangesWithUserDefinedCursor() {
        
        this.method = Builder._SINGLETON_VALUE_Method.value();
    }

    @JsonIgnore
    public SourcePostgresSchemasReplicationMethodMethod method() {
        return method;
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
        SourcePostgresScanChangesWithUserDefinedCursor other = (SourcePostgresScanChangesWithUserDefinedCursor) o;
        return 
            Objects.deepEquals(this.method, other.method);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            method);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourcePostgresScanChangesWithUserDefinedCursor.class,
                "method", method);
    }
    
    public final static class Builder {
        
        private Builder() {
          // force use of static builder() method
        }
        
        public SourcePostgresScanChangesWithUserDefinedCursor build() {
            return new SourcePostgresScanChangesWithUserDefinedCursor(
                );
        }

        private static final LazySingletonValue<SourcePostgresSchemasReplicationMethodMethod> _SINGLETON_VALUE_Method =
                new LazySingletonValue<>(
                        "method",
                        "\"Standard\"",
                        new TypeReference<SourcePostgresSchemasReplicationMethodMethod>() {});
    }
}

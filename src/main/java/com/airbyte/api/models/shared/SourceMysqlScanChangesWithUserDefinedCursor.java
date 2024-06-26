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
/**
 * SourceMysqlScanChangesWithUserDefinedCursor - Incrementally detects new inserts and updates using the &lt;a href="https://docs.airbyte.com/understanding-airbyte/connections/incremental-append/#user-defined-cursor"&gt;cursor column&lt;/a&gt; chosen when configuring a connection (e.g. created_at, updated_at).
 */

public class SourceMysqlScanChangesWithUserDefinedCursor {

    @JsonProperty("method")
    private SourceMysqlSchemasMethod method;

    @JsonCreator
    public SourceMysqlScanChangesWithUserDefinedCursor() {
        
        this.method = Builder._SINGLETON_VALUE_Method.value();
    }

    @JsonIgnore
    public SourceMysqlSchemasMethod method() {
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
        SourceMysqlScanChangesWithUserDefinedCursor other = (SourceMysqlScanChangesWithUserDefinedCursor) o;
        return 
            java.util.Objects.deepEquals(this.method, other.method);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            method);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMysqlScanChangesWithUserDefinedCursor.class,
                "method", method);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public SourceMysqlScanChangesWithUserDefinedCursor build() {
            return new SourceMysqlScanChangesWithUserDefinedCursor(
                );
        }

        private static final LazySingletonValue<SourceMysqlSchemasMethod> _SINGLETON_VALUE_Method =
                new LazySingletonValue<>(
                        "method",
                        "\"STANDARD\"",
                        new TypeReference<SourceMysqlSchemasMethod>() {});
    }
}


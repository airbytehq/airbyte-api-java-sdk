/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;


import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SourcePostgresAllow - Enables encryption only when required by the source database.
 */

public class SourcePostgresAllow {

    @JsonIgnore
    private Map<String, Object> additionalProperties;

    @JsonProperty("mode")
    private SourcePostgresSchemasMode mode;

    @JsonCreator
    public SourcePostgresAllow() {
        
        this.additionalProperties = new HashMap<>();
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
    }

    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return additionalProperties;
    }

    @JsonIgnore
    public SourcePostgresSchemasMode mode() {
        return mode;
    }

    public final static Builder builder() {
        return new Builder();
    }

    @JsonAnySetter
    public SourcePostgresAllow withAdditionalProperty(String key, Object value) {
        // note that value can be null because of the way JsonAnySetter works
        Utils.checkNotNull(key, "key");
        additionalProperties.put(key, value); 
        return this;
    }
    
    public SourcePostgresAllow withAdditionalProperties(Map<String, Object> additionalProperties) {
        Utils.checkNotNull(additionalProperties, "additionalProperties");
        this.additionalProperties = additionalProperties;
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
        SourcePostgresAllow other = (SourcePostgresAllow) o;
        return 
            Objects.deepEquals(this.additionalProperties, other.additionalProperties) &&
            Objects.deepEquals(this.mode, other.mode);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            additionalProperties,
            mode);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourcePostgresAllow.class,
                "additionalProperties", additionalProperties,
                "mode", mode);
    }
    
    public final static class Builder {
 
        private Map<String, Object> additionalProperties = new HashMap<>();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder additionalProperty(String key, Object value) {
            Utils.checkNotNull(key, "key");
            // we could be strict about null values (force the user
            // to pass `JsonNullable.of(null)`) but likely to be a bit 
            // annoying for additional properties building so we'll 
            // relax preconditions.
            this.additionalProperties.put(key, value);
            return this;
        }

        public Builder additionalProperties(Map<String, Object> additionalProperties) {
            Utils.checkNotNull(additionalProperties, "additionalProperties");
            this.additionalProperties = additionalProperties;
            return this;
        }
        
        public SourcePostgresAllow build() {
            return new SourcePostgresAllow(
                )
                .withAdditionalProperties(additionalProperties);
        }

        private static final LazySingletonValue<SourcePostgresSchemasMode> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"allow\"",
                        new TypeReference<SourcePostgresSchemasMode>() {});
    }
}


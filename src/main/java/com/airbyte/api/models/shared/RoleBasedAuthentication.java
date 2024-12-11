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
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


public class RoleBasedAuthentication {

    @JsonIgnore
    private Map<String, Object> additionalProperties;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends SourceDynamodbSchemasAuthType> authType;

    @JsonCreator
    public RoleBasedAuthentication() {
        
        this.additionalProperties = new HashMap<>();
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
    }

    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return additionalProperties;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceDynamodbSchemasAuthType> authType() {
        return (Optional<SourceDynamodbSchemasAuthType>) authType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    @JsonAnySetter
    public RoleBasedAuthentication withAdditionalProperty(String key, Object value) {
        // note that value can be null because of the way JsonAnySetter works
        Utils.checkNotNull(key, "key");
        additionalProperties.put(key, value); 
        return this;
    }
    
    public RoleBasedAuthentication withAdditionalProperties(Map<String, Object> additionalProperties) {
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
        RoleBasedAuthentication other = (RoleBasedAuthentication) o;
        return 
            Objects.deepEquals(this.additionalProperties, other.additionalProperties) &&
            Objects.deepEquals(this.authType, other.authType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            additionalProperties,
            authType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RoleBasedAuthentication.class,
                "additionalProperties", additionalProperties,
                "authType", authType);
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
        
        public RoleBasedAuthentication build() {
            return new RoleBasedAuthentication(
                )
                .withAdditionalProperties(additionalProperties);
        }

        private static final LazySingletonValue<Optional<? extends SourceDynamodbSchemasAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"Role\"",
                        new TypeReference<Optional<? extends SourceDynamodbSchemasAuthType>>() {});
    }
}


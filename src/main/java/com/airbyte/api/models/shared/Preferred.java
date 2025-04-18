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

/**
 * Preferred
 * 
 * <p>To allow unencrypted communication only when the source doesn't support encryption.
 */
public class Preferred {

    @JsonIgnore
    private Map<String, Object> additionalProperties;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends SourceMysqlMode> mode;

    @JsonCreator
    public Preferred(
            @JsonProperty("mode") Optional<? extends SourceMysqlMode> mode) {
        Utils.checkNotNull(mode, "mode");
        this.additionalProperties = new HashMap<>();
        this.mode = mode;
    }
    
    public Preferred() {
        this(Optional.empty());
    }

    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return additionalProperties;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceMysqlMode> mode() {
        return (Optional<SourceMysqlMode>) mode;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    @JsonAnySetter
    public Preferred withAdditionalProperty(String key, Object value) {
        // note that value can be null because of the way JsonAnySetter works
        Utils.checkNotNull(key, "key");
        additionalProperties.put(key, value); 
        return this;
    }    

    public Preferred withAdditionalProperties(Map<String, Object> additionalProperties) {
        Utils.checkNotNull(additionalProperties, "additionalProperties");
        this.additionalProperties = additionalProperties;
        return this;
    }

    public Preferred withMode(SourceMysqlMode mode) {
        Utils.checkNotNull(mode, "mode");
        this.mode = Optional.ofNullable(mode);
        return this;
    }

    public Preferred withMode(Optional<? extends SourceMysqlMode> mode) {
        Utils.checkNotNull(mode, "mode");
        this.mode = mode;
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
        Preferred other = (Preferred) o;
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
        return Utils.toString(Preferred.class,
                "additionalProperties", additionalProperties,
                "mode", mode);
    }
    
    public final static class Builder {
 
        private Map<String, Object> additionalProperties = new HashMap<>();
 
        private Optional<? extends SourceMysqlMode> mode;
        
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

        public Builder mode(SourceMysqlMode mode) {
            Utils.checkNotNull(mode, "mode");
            this.mode = Optional.ofNullable(mode);
            return this;
        }

        public Builder mode(Optional<? extends SourceMysqlMode> mode) {
            Utils.checkNotNull(mode, "mode");
            this.mode = mode;
            return this;
        }
        
        public Preferred build() {
            if (mode == null) {
                mode = _SINGLETON_VALUE_Mode.value();
            }
            return new Preferred(
                mode)
                .withAdditionalProperties(additionalProperties);
        }

        private static final LazySingletonValue<Optional<? extends SourceMysqlMode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"preferred\"",
                        new TypeReference<Optional<? extends SourceMysqlMode>>() {});
    }
}

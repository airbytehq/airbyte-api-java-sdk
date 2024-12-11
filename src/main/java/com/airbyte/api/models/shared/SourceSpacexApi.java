/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;


import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class SourceSpacexApi {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    private Optional<String> options;

    @JsonProperty("sourceType")
    private SpacexApi sourceType;

    @JsonCreator
    public SourceSpacexApi(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("options") Optional<String> options) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(options, "options");
        this.id = id;
        this.options = options;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }
    
    public SourceSpacexApi() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> options() {
        return options;
    }

    @JsonIgnore
    public SpacexApi sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceSpacexApi withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public SourceSpacexApi withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public SourceSpacexApi withOptions(String options) {
        Utils.checkNotNull(options, "options");
        this.options = Optional.ofNullable(options);
        return this;
    }

    public SourceSpacexApi withOptions(Optional<String> options) {
        Utils.checkNotNull(options, "options");
        this.options = options;
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
        SourceSpacexApi other = (SourceSpacexApi) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.options, other.options) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            options,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSpacexApi.class,
                "id", id,
                "options", options,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> options = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder options(String options) {
            Utils.checkNotNull(options, "options");
            this.options = Optional.ofNullable(options);
            return this;
        }

        public Builder options(Optional<String> options) {
            Utils.checkNotNull(options, "options");
            this.options = options;
            return this;
        }
        
        public SourceSpacexApi build() {
            return new SourceSpacexApi(
                id,
                options);
        }

        private static final LazySingletonValue<SpacexApi> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"spacex-api\"",
                        new TypeReference<SpacexApi>() {});
    }
}


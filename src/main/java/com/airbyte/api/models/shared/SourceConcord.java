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


public class SourceConcord {

    @JsonProperty("api_key")
    private String apiKey;

    /**
     * The environment from where you want to access the API.
     */
    @JsonProperty("env")
    private SourceConcordEnvironment env;

    @JsonProperty("sourceType")
    private Concord sourceType;

    @JsonCreator
    public SourceConcord(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("env") SourceConcordEnvironment env) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(env, "env");
        this.apiKey = apiKey;
        this.env = env;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * The environment from where you want to access the API.
     */
    @JsonIgnore
    public SourceConcordEnvironment env() {
        return env;
    }

    @JsonIgnore
    public Concord sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceConcord withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * The environment from where you want to access the API.
     */
    public SourceConcord withEnv(SourceConcordEnvironment env) {
        Utils.checkNotNull(env, "env");
        this.env = env;
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
        SourceConcord other = (SourceConcord) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.env, other.env) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            env,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceConcord.class,
                "apiKey", apiKey,
                "env", env,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private SourceConcordEnvironment env;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * The environment from where you want to access the API.
         */
        public Builder env(SourceConcordEnvironment env) {
            Utils.checkNotNull(env, "env");
            this.env = env;
            return this;
        }
        
        public SourceConcord build() {
            return new SourceConcord(
                apiKey,
                env);
        }

        private static final LazySingletonValue<Concord> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"concord\"",
                        new TypeReference<Concord>() {});
    }
}

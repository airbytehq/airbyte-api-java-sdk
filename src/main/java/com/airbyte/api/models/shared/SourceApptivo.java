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


public class SourceApptivo {

    @JsonProperty("access_key")
    private String accessKey;

    /**
     * API key to use. Find it in your Apptivo account under Business Settings -&gt; API Access.
     */
    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("sourceType")
    private Apptivo sourceType;

    @JsonCreator
    public SourceApptivo(
            @JsonProperty("access_key") String accessKey,
            @JsonProperty("api_key") String apiKey) {
        Utils.checkNotNull(accessKey, "accessKey");
        Utils.checkNotNull(apiKey, "apiKey");
        this.accessKey = accessKey;
        this.apiKey = apiKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    @JsonIgnore
    public String accessKey() {
        return accessKey;
    }

    /**
     * API key to use. Find it in your Apptivo account under Business Settings -&gt; API Access.
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public Apptivo sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceApptivo withAccessKey(String accessKey) {
        Utils.checkNotNull(accessKey, "accessKey");
        this.accessKey = accessKey;
        return this;
    }

    /**
     * API key to use. Find it in your Apptivo account under Business Settings -&gt; API Access.
     */
    public SourceApptivo withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
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
        SourceApptivo other = (SourceApptivo) o;
        return 
            Objects.deepEquals(this.accessKey, other.accessKey) &&
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accessKey,
            apiKey,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceApptivo.class,
                "accessKey", accessKey,
                "apiKey", apiKey,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String accessKey;
 
        private String apiKey;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accessKey(String accessKey) {
            Utils.checkNotNull(accessKey, "accessKey");
            this.accessKey = accessKey;
            return this;
        }

        /**
         * API key to use. Find it in your Apptivo account under Business Settings -&gt; API Access.
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }
        
        public SourceApptivo build() {
            return new SourceApptivo(
                accessKey,
                apiKey);
        }

        private static final LazySingletonValue<Apptivo> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"apptivo\"",
                        new TypeReference<Apptivo>() {});
    }
}

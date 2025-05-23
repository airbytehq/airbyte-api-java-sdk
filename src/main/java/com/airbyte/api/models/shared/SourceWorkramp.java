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

public class SourceWorkramp {

    /**
     * The id of the Academy
     */
    @JsonProperty("academy_id")
    private String academyId;

    /**
     * The API Token for Workramp
     */
    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("sourceType")
    private Workramp sourceType;

    @JsonCreator
    public SourceWorkramp(
            @JsonProperty("academy_id") String academyId,
            @JsonProperty("api_key") String apiKey) {
        Utils.checkNotNull(academyId, "academyId");
        Utils.checkNotNull(apiKey, "apiKey");
        this.academyId = academyId;
        this.apiKey = apiKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * The id of the Academy
     */
    @JsonIgnore
    public String academyId() {
        return academyId;
    }

    /**
     * The API Token for Workramp
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public Workramp sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The id of the Academy
     */
    public SourceWorkramp withAcademyId(String academyId) {
        Utils.checkNotNull(academyId, "academyId");
        this.academyId = academyId;
        return this;
    }

    /**
     * The API Token for Workramp
     */
    public SourceWorkramp withApiKey(String apiKey) {
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
        SourceWorkramp other = (SourceWorkramp) o;
        return 
            Objects.deepEquals(this.academyId, other.academyId) &&
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            academyId,
            apiKey,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceWorkramp.class,
                "academyId", academyId,
                "apiKey", apiKey,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String academyId;
 
        private String apiKey;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The id of the Academy
         */
        public Builder academyId(String academyId) {
            Utils.checkNotNull(academyId, "academyId");
            this.academyId = academyId;
            return this;
        }

        /**
         * The API Token for Workramp
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }
        
        public SourceWorkramp build() {
            return new SourceWorkramp(
                academyId,
                apiKey);
        }

        private static final LazySingletonValue<Workramp> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"workramp\"",
                        new TypeReference<Workramp>() {});
    }
}

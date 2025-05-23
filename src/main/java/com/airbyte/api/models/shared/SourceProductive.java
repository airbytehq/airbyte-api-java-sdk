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

public class SourceProductive {

    @JsonProperty("api_key")
    private String apiKey;

    /**
     * The organization ID which could be seen from `https://app.productive.io/xxxx-xxxx/settings/api-integrations` page
     */
    @JsonProperty("organization_id")
    private String organizationId;

    @JsonProperty("sourceType")
    private Productive sourceType;

    @JsonCreator
    public SourceProductive(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("organization_id") String organizationId) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(organizationId, "organizationId");
        this.apiKey = apiKey;
        this.organizationId = organizationId;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * The organization ID which could be seen from `https://app.productive.io/xxxx-xxxx/settings/api-integrations` page
     */
    @JsonIgnore
    public String organizationId() {
        return organizationId;
    }

    @JsonIgnore
    public Productive sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SourceProductive withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * The organization ID which could be seen from `https://app.productive.io/xxxx-xxxx/settings/api-integrations` page
     */
    public SourceProductive withOrganizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
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
        SourceProductive other = (SourceProductive) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.organizationId, other.organizationId) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            organizationId,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceProductive.class,
                "apiKey", apiKey,
                "organizationId", organizationId,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private String organizationId;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * The organization ID which could be seen from `https://app.productive.io/xxxx-xxxx/settings/api-integrations` page
         */
        public Builder organizationId(String organizationId) {
            Utils.checkNotNull(organizationId, "organizationId");
            this.organizationId = organizationId;
            return this;
        }
        
        public SourceProductive build() {
            return new SourceProductive(
                apiKey,
                organizationId);
        }

        private static final LazySingletonValue<Productive> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"productive\"",
                        new TypeReference<Productive>() {});
    }
}

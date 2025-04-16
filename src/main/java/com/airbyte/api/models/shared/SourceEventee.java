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

public class SourceEventee {

    /**
     * API token to use. Generate it at https://admin.eventee.co/ in 'Settings -&gt; Features'.
     */
    @JsonProperty("api_token")
    private String apiToken;

    @JsonProperty("sourceType")
    private Eventee sourceType;

    @JsonCreator
    public SourceEventee(
            @JsonProperty("api_token") String apiToken) {
        Utils.checkNotNull(apiToken, "apiToken");
        this.apiToken = apiToken;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * API token to use. Generate it at https://admin.eventee.co/ in 'Settings -&gt; Features'.
     */
    @JsonIgnore
    public String apiToken() {
        return apiToken;
    }

    @JsonIgnore
    public Eventee sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * API token to use. Generate it at https://admin.eventee.co/ in 'Settings -&gt; Features'.
     */
    public SourceEventee withApiToken(String apiToken) {
        Utils.checkNotNull(apiToken, "apiToken");
        this.apiToken = apiToken;
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
        SourceEventee other = (SourceEventee) o;
        return 
            Objects.deepEquals(this.apiToken, other.apiToken) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiToken,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceEventee.class,
                "apiToken", apiToken,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiToken;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API token to use. Generate it at https://admin.eventee.co/ in 'Settings -&gt; Features'.
         */
        public Builder apiToken(String apiToken) {
            Utils.checkNotNull(apiToken, "apiToken");
            this.apiToken = apiToken;
            return this;
        }
        
        public SourceEventee build() {
            return new SourceEventee(
                apiToken);
        }

        private static final LazySingletonValue<Eventee> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"eventee\"",
                        new TypeReference<Eventee>() {});
    }
}

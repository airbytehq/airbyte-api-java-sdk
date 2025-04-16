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

public class SourceCoda {

    /**
     * Bearer token
     */
    @JsonProperty("auth_token")
    private String authToken;

    @JsonProperty("sourceType")
    private Coda sourceType;

    @JsonCreator
    public SourceCoda(
            @JsonProperty("auth_token") String authToken) {
        Utils.checkNotNull(authToken, "authToken");
        this.authToken = authToken;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * Bearer token
     */
    @JsonIgnore
    public String authToken() {
        return authToken;
    }

    @JsonIgnore
    public Coda sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Bearer token
     */
    public SourceCoda withAuthToken(String authToken) {
        Utils.checkNotNull(authToken, "authToken");
        this.authToken = authToken;
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
        SourceCoda other = (SourceCoda) o;
        return 
            Objects.deepEquals(this.authToken, other.authToken) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            authToken,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceCoda.class,
                "authToken", authToken,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String authToken;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Bearer token
         */
        public Builder authToken(String authToken) {
            Utils.checkNotNull(authToken, "authToken");
            this.authToken = authToken;
            return this;
        }
        
        public SourceCoda build() {
            return new SourceCoda(
                authToken);
        }

        private static final LazySingletonValue<Coda> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"coda\"",
                        new TypeReference<Coda>() {});
    }
}

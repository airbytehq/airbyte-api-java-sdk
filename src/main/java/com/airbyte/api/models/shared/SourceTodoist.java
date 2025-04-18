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

public class SourceTodoist {

    @JsonProperty("sourceType")
    private Todoist sourceType;

    /**
     * API authorization bearer token for authenticating the API
     */
    @JsonProperty("token")
    private String token;

    @JsonCreator
    public SourceTodoist(
            @JsonProperty("token") String token) {
        Utils.checkNotNull(token, "token");
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.token = token;
    }

    @JsonIgnore
    public Todoist sourceType() {
        return sourceType;
    }

    /**
     * API authorization bearer token for authenticating the API
     */
    @JsonIgnore
    public String token() {
        return token;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * API authorization bearer token for authenticating the API
     */
    public SourceTodoist withToken(String token) {
        Utils.checkNotNull(token, "token");
        this.token = token;
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
        SourceTodoist other = (SourceTodoist) o;
        return 
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.token, other.token);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            sourceType,
            token);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceTodoist.class,
                "sourceType", sourceType,
                "token", token);
    }
    
    public final static class Builder {
 
        private String token;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API authorization bearer token for authenticating the API
         */
        public Builder token(String token) {
            Utils.checkNotNull(token, "token");
            this.token = token;
            return this;
        }
        
        public SourceTodoist build() {
            return new SourceTodoist(
                token);
        }

        private static final LazySingletonValue<Todoist> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"todoist\"",
                        new TypeReference<Todoist>() {});
    }
}

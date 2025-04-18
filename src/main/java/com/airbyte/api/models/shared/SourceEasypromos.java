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

public class SourceEasypromos {

    @JsonProperty("bearer_token")
    private String bearerToken;

    @JsonProperty("sourceType")
    private Easypromos sourceType;

    @JsonCreator
    public SourceEasypromos(
            @JsonProperty("bearer_token") String bearerToken) {
        Utils.checkNotNull(bearerToken, "bearerToken");
        this.bearerToken = bearerToken;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    @JsonIgnore
    public String bearerToken() {
        return bearerToken;
    }

    @JsonIgnore
    public Easypromos sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SourceEasypromos withBearerToken(String bearerToken) {
        Utils.checkNotNull(bearerToken, "bearerToken");
        this.bearerToken = bearerToken;
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
        SourceEasypromos other = (SourceEasypromos) o;
        return 
            Objects.deepEquals(this.bearerToken, other.bearerToken) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            bearerToken,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceEasypromos.class,
                "bearerToken", bearerToken,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String bearerToken;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder bearerToken(String bearerToken) {
            Utils.checkNotNull(bearerToken, "bearerToken");
            this.bearerToken = bearerToken;
            return this;
        }
        
        public SourceEasypromos build() {
            return new SourceEasypromos(
                bearerToken);
        }

        private static final LazySingletonValue<Easypromos> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"easypromos\"",
                        new TypeReference<Easypromos>() {});
    }
}

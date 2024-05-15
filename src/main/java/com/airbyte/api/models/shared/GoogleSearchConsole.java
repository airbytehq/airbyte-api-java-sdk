/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class GoogleSearchConsole {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("authorization")
    private Optional<? extends Authorization> authorization;

    @JsonCreator
    public GoogleSearchConsole(
            @JsonProperty("authorization") Optional<? extends Authorization> authorization) {
        Utils.checkNotNull(authorization, "authorization");
        this.authorization = authorization;
    }
    
    public GoogleSearchConsole() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Authorization> authorization() {
        return (Optional<Authorization>) authorization;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GoogleSearchConsole withAuthorization(Authorization authorization) {
        Utils.checkNotNull(authorization, "authorization");
        this.authorization = Optional.ofNullable(authorization);
        return this;
    }

    public GoogleSearchConsole withAuthorization(Optional<? extends Authorization> authorization) {
        Utils.checkNotNull(authorization, "authorization");
        this.authorization = authorization;
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
        GoogleSearchConsole other = (GoogleSearchConsole) o;
        return 
            java.util.Objects.deepEquals(this.authorization, other.authorization);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            authorization);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GoogleSearchConsole.class,
                "authorization", authorization);
    }
    
    public final static class Builder {
 
        private Optional<? extends Authorization> authorization = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder authorization(Authorization authorization) {
            Utils.checkNotNull(authorization, "authorization");
            this.authorization = Optional.ofNullable(authorization);
            return this;
        }

        public Builder authorization(Optional<? extends Authorization> authorization) {
            Utils.checkNotNull(authorization, "authorization");
            this.authorization = authorization;
            return this;
        }
        
        public GoogleSearchConsole build() {
            return new GoogleSearchConsole(
                authorization);
        }
    }
}

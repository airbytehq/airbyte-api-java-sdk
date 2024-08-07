/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
/**
 * UsersResponse - List/Array of multiple users in an organization
 */

public class UsersResponse {

    @JsonProperty("data")
    private java.util.List<UserResponse> data;

    @JsonCreator
    public UsersResponse(
            @JsonProperty("data") java.util.List<UserResponse> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public java.util.List<UserResponse> data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UsersResponse withData(java.util.List<UserResponse> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
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
        UsersResponse other = (UsersResponse) o;
        return 
            java.util.Objects.deepEquals(this.data, other.data);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            data);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UsersResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private java.util.List<UserResponse> data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(java.util.List<UserResponse> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public UsersResponse build() {
            return new UsersResponse(
                data);
        }
    }
}


/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * UsersResponse
 * 
 * <p>List/Array of multiple users in an organization
 */
public class UsersResponse {

    @JsonProperty("data")
    private List<UserResponse> data;

    @JsonCreator
    public UsersResponse(
            @JsonProperty("data") List<UserResponse> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public List<UserResponse> data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public UsersResponse withData(List<UserResponse> data) {
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
            Objects.deepEquals(this.data, other.data);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            data);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UsersResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private List<UserResponse> data;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(List<UserResponse> data) {
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

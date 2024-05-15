/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import com.airbyte.api.utils.SpeakeasyMetadata;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class ListPermissionsRequest {

    /**
     * User Id in permission.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=userId")
    private Optional<? extends String> userId;

    @JsonCreator
    public ListPermissionsRequest(
            Optional<? extends String> userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
    }
    
    public ListPermissionsRequest() {
        this(Optional.empty());
    }

    /**
     * User Id in permission.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> userId() {
        return (Optional<String>) userId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * User Id in permission.
     */
    public ListPermissionsRequest withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = Optional.ofNullable(userId);
        return this;
    }

    /**
     * User Id in permission.
     */
    public ListPermissionsRequest withUserId(Optional<? extends String> userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
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
        ListPermissionsRequest other = (ListPermissionsRequest) o;
        return 
            java.util.Objects.deepEquals(this.userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            userId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListPermissionsRequest.class,
                "userId", userId);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> userId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * User Id in permission.
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = Optional.ofNullable(userId);
            return this;
        }

        /**
         * User Id in permission.
         */
        public Builder userId(Optional<? extends String> userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }
        
        public ListPermissionsRequest build() {
            return new ListPermissionsRequest(
                userId);
        }
    }
}

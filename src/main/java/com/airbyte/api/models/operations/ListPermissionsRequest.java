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
     * This is required if you want to read someone else's permissions, and you should have organization admin or a higher role.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=organizationId")
    private Optional<? extends String> organizationId;

    /**
     * User Id in permission.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=userId")
    private Optional<? extends String> userId;

    @JsonCreator
    public ListPermissionsRequest(
            Optional<? extends String> organizationId,
            Optional<? extends String> userId) {
        Utils.checkNotNull(organizationId, "organizationId");
        Utils.checkNotNull(userId, "userId");
        this.organizationId = organizationId;
        this.userId = userId;
    }
    
    public ListPermissionsRequest() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * This is required if you want to read someone else's permissions, and you should have organization admin or a higher role.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> organizationId() {
        return (Optional<String>) organizationId;
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
     * This is required if you want to read someone else's permissions, and you should have organization admin or a higher role.
     */
    public ListPermissionsRequest withOrganizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = Optional.ofNullable(organizationId);
        return this;
    }

    /**
     * This is required if you want to read someone else's permissions, and you should have organization admin or a higher role.
     */
    public ListPermissionsRequest withOrganizationId(Optional<? extends String> organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
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
            java.util.Objects.deepEquals(this.organizationId, other.organizationId) &&
            java.util.Objects.deepEquals(this.userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            organizationId,
            userId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListPermissionsRequest.class,
                "organizationId", organizationId,
                "userId", userId);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> organizationId = Optional.empty();
 
        private Optional<? extends String> userId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * This is required if you want to read someone else's permissions, and you should have organization admin or a higher role.
         */
        public Builder organizationId(String organizationId) {
            Utils.checkNotNull(organizationId, "organizationId");
            this.organizationId = Optional.ofNullable(organizationId);
            return this;
        }

        /**
         * This is required if you want to read someone else's permissions, and you should have organization admin or a higher role.
         */
        public Builder organizationId(Optional<? extends String> organizationId) {
            Utils.checkNotNull(organizationId, "organizationId");
            this.organizationId = organizationId;
            return this;
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
                organizationId,
                userId);
        }
    }
}


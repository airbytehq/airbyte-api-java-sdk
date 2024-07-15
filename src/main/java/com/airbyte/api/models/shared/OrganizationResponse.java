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
 * OrganizationResponse - Provides details of a single organization for a user.
 */

public class OrganizationResponse {

    @JsonProperty("email")
    private String email;

    @JsonProperty("organizationId")
    private String organizationId;

    @JsonProperty("organizationName")
    private String organizationName;

    @JsonCreator
    public OrganizationResponse(
            @JsonProperty("email") String email,
            @JsonProperty("organizationId") String organizationId,
            @JsonProperty("organizationName") String organizationName) {
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(organizationId, "organizationId");
        Utils.checkNotNull(organizationName, "organizationName");
        this.email = email;
        this.organizationId = organizationId;
        this.organizationName = organizationName;
    }

    @JsonIgnore
    public String email() {
        return email;
    }

    @JsonIgnore
    public String organizationId() {
        return organizationId;
    }

    @JsonIgnore
    public String organizationName() {
        return organizationName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OrganizationResponse withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public OrganizationResponse withOrganizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    public OrganizationResponse withOrganizationName(String organizationName) {
        Utils.checkNotNull(organizationName, "organizationName");
        this.organizationName = organizationName;
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
        OrganizationResponse other = (OrganizationResponse) o;
        return 
            java.util.Objects.deepEquals(this.email, other.email) &&
            java.util.Objects.deepEquals(this.organizationId, other.organizationId) &&
            java.util.Objects.deepEquals(this.organizationName, other.organizationName);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            email,
            organizationId,
            organizationName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OrganizationResponse.class,
                "email", email,
                "organizationId", organizationId,
                "organizationName", organizationName);
    }
    
    public final static class Builder {
 
        private String email;
 
        private String organizationId;
 
        private String organizationName;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        public Builder organizationId(String organizationId) {
            Utils.checkNotNull(organizationId, "organizationId");
            this.organizationId = organizationId;
            return this;
        }

        public Builder organizationName(String organizationName) {
            Utils.checkNotNull(organizationName, "organizationName");
            this.organizationName = organizationName;
            return this;
        }
        
        public OrganizationResponse build() {
            return new OrganizationResponse(
                email,
                organizationId,
                organizationName);
        }
    }
}


/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
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

public class SourceLinkedinPages {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    private Optional<? extends SourceLinkedinPagesAuthentication> credentials;

    /**
     * Specify the Organization ID
     */
    @JsonProperty("org_id")
    private String orgId;

    @JsonProperty("sourceType")
    private LinkedinPages sourceType;

    @JsonCreator
    public SourceLinkedinPages(
            @JsonProperty("credentials") Optional<? extends SourceLinkedinPagesAuthentication> credentials,
            @JsonProperty("org_id") String orgId) {
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(orgId, "orgId");
        this.credentials = credentials;
        this.orgId = orgId;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }
    
    public SourceLinkedinPages(
            String orgId) {
        this(Optional.empty(), orgId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceLinkedinPagesAuthentication> credentials() {
        return (Optional<SourceLinkedinPagesAuthentication>) credentials;
    }

    /**
     * Specify the Organization ID
     */
    @JsonIgnore
    public String orgId() {
        return orgId;
    }

    @JsonIgnore
    public LinkedinPages sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceLinkedinPages withCredentials(SourceLinkedinPagesAuthentication credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = Optional.ofNullable(credentials);
        return this;
    }

    public SourceLinkedinPages withCredentials(Optional<? extends SourceLinkedinPagesAuthentication> credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * Specify the Organization ID
     */
    public SourceLinkedinPages withOrgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
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
        SourceLinkedinPages other = (SourceLinkedinPages) o;
        return 
            java.util.Objects.deepEquals(this.credentials, other.credentials) &&
            java.util.Objects.deepEquals(this.orgId, other.orgId) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            credentials,
            orgId,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceLinkedinPages.class,
                "credentials", credentials,
                "orgId", orgId,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private Optional<? extends SourceLinkedinPagesAuthentication> credentials = Optional.empty();
 
        private String orgId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder credentials(SourceLinkedinPagesAuthentication credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = Optional.ofNullable(credentials);
            return this;
        }

        public Builder credentials(Optional<? extends SourceLinkedinPagesAuthentication> credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * Specify the Organization ID
         */
        public Builder orgId(String orgId) {
            Utils.checkNotNull(orgId, "orgId");
            this.orgId = orgId;
            return this;
        }
        
        public SourceLinkedinPages build() {
            return new SourceLinkedinPages(
                credentials,
                orgId);
        }

        private static final LazySingletonValue<LinkedinPages> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"linkedin-pages\"",
                        new TypeReference<LinkedinPages>() {});
    }
}


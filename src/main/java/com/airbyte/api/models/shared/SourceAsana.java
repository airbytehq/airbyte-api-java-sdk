/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;


import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class SourceAsana {

    /**
     * Choose how to authenticate to Github
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    private Optional<? extends AuthenticationMechanism> credentials;

    /**
     * Globally unique identifiers for the organization exports
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("organization_export_ids")
    private Optional<? extends List<Object>> organizationExportIds;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceType")
    private Optional<? extends SourceAsanaAsana> sourceType;

    @JsonCreator
    public SourceAsana(
            @JsonProperty("credentials") Optional<? extends AuthenticationMechanism> credentials,
            @JsonProperty("organization_export_ids") Optional<? extends List<Object>> organizationExportIds) {
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(organizationExportIds, "organizationExportIds");
        this.credentials = credentials;
        this.organizationExportIds = organizationExportIds;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }
    
    public SourceAsana() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * Choose how to authenticate to Github
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AuthenticationMechanism> credentials() {
        return (Optional<AuthenticationMechanism>) credentials;
    }

    /**
     * Globally unique identifiers for the organization exports
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Object>> organizationExportIds() {
        return (Optional<List<Object>>) organizationExportIds;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceAsanaAsana> sourceType() {
        return (Optional<SourceAsanaAsana>) sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Choose how to authenticate to Github
     */
    public SourceAsana withCredentials(AuthenticationMechanism credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = Optional.ofNullable(credentials);
        return this;
    }

    /**
     * Choose how to authenticate to Github
     */
    public SourceAsana withCredentials(Optional<? extends AuthenticationMechanism> credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * Globally unique identifiers for the organization exports
     */
    public SourceAsana withOrganizationExportIds(List<Object> organizationExportIds) {
        Utils.checkNotNull(organizationExportIds, "organizationExportIds");
        this.organizationExportIds = Optional.ofNullable(organizationExportIds);
        return this;
    }

    /**
     * Globally unique identifiers for the organization exports
     */
    public SourceAsana withOrganizationExportIds(Optional<? extends List<Object>> organizationExportIds) {
        Utils.checkNotNull(organizationExportIds, "organizationExportIds");
        this.organizationExportIds = organizationExportIds;
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
        SourceAsana other = (SourceAsana) o;
        return 
            Objects.deepEquals(this.credentials, other.credentials) &&
            Objects.deepEquals(this.organizationExportIds, other.organizationExportIds) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            credentials,
            organizationExportIds,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceAsana.class,
                "credentials", credentials,
                "organizationExportIds", organizationExportIds,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private Optional<? extends AuthenticationMechanism> credentials = Optional.empty();
 
        private Optional<? extends List<Object>> organizationExportIds = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Choose how to authenticate to Github
         */
        public Builder credentials(AuthenticationMechanism credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = Optional.ofNullable(credentials);
            return this;
        }

        /**
         * Choose how to authenticate to Github
         */
        public Builder credentials(Optional<? extends AuthenticationMechanism> credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * Globally unique identifiers for the organization exports
         */
        public Builder organizationExportIds(List<Object> organizationExportIds) {
            Utils.checkNotNull(organizationExportIds, "organizationExportIds");
            this.organizationExportIds = Optional.ofNullable(organizationExportIds);
            return this;
        }

        /**
         * Globally unique identifiers for the organization exports
         */
        public Builder organizationExportIds(Optional<? extends List<Object>> organizationExportIds) {
            Utils.checkNotNull(organizationExportIds, "organizationExportIds");
            this.organizationExportIds = organizationExportIds;
            return this;
        }
        
        public SourceAsana build() {
            return new SourceAsana(
                credentials,
                organizationExportIds);
        }

        private static final LazySingletonValue<Optional<? extends SourceAsanaAsana>> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"asana\"",
                        new TypeReference<Optional<? extends SourceAsanaAsana>>() {});
    }
}


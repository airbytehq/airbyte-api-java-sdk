/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.operations;

import com.airbyte.api.utils.SpeakeasyMetadata;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ListUsersWithinAnOrganizationRequest {

    /**
     * List of user emails to filter by
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=emails")
    private Optional<? extends List<String>> emails;

    /**
     * List of user IDs to filter by
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=ids")
    private Optional<? extends List<String>> ids;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=organizationId")
    private String organizationId;

    @JsonCreator
    public ListUsersWithinAnOrganizationRequest(
            Optional<? extends List<String>> emails,
            Optional<? extends List<String>> ids,
            String organizationId) {
        Utils.checkNotNull(emails, "emails");
        Utils.checkNotNull(ids, "ids");
        Utils.checkNotNull(organizationId, "organizationId");
        this.emails = emails;
        this.ids = ids;
        this.organizationId = organizationId;
    }
    
    public ListUsersWithinAnOrganizationRequest(
            String organizationId) {
        this(Optional.empty(), Optional.empty(), organizationId);
    }

    /**
     * List of user emails to filter by
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> emails() {
        return (Optional<List<String>>) emails;
    }

    /**
     * List of user IDs to filter by
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> ids() {
        return (Optional<List<String>>) ids;
    }

    @JsonIgnore
    public String organizationId() {
        return organizationId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * List of user emails to filter by
     */
    public ListUsersWithinAnOrganizationRequest withEmails(List<String> emails) {
        Utils.checkNotNull(emails, "emails");
        this.emails = Optional.ofNullable(emails);
        return this;
    }

    /**
     * List of user emails to filter by
     */
    public ListUsersWithinAnOrganizationRequest withEmails(Optional<? extends List<String>> emails) {
        Utils.checkNotNull(emails, "emails");
        this.emails = emails;
        return this;
    }

    /**
     * List of user IDs to filter by
     */
    public ListUsersWithinAnOrganizationRequest withIds(List<String> ids) {
        Utils.checkNotNull(ids, "ids");
        this.ids = Optional.ofNullable(ids);
        return this;
    }

    /**
     * List of user IDs to filter by
     */
    public ListUsersWithinAnOrganizationRequest withIds(Optional<? extends List<String>> ids) {
        Utils.checkNotNull(ids, "ids");
        this.ids = ids;
        return this;
    }

    public ListUsersWithinAnOrganizationRequest withOrganizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
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
        ListUsersWithinAnOrganizationRequest other = (ListUsersWithinAnOrganizationRequest) o;
        return 
            Objects.deepEquals(this.emails, other.emails) &&
            Objects.deepEquals(this.ids, other.ids) &&
            Objects.deepEquals(this.organizationId, other.organizationId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            emails,
            ids,
            organizationId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListUsersWithinAnOrganizationRequest.class,
                "emails", emails,
                "ids", ids,
                "organizationId", organizationId);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<String>> emails = Optional.empty();
 
        private Optional<? extends List<String>> ids = Optional.empty();
 
        private String organizationId;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * List of user emails to filter by
         */
        public Builder emails(List<String> emails) {
            Utils.checkNotNull(emails, "emails");
            this.emails = Optional.ofNullable(emails);
            return this;
        }

        /**
         * List of user emails to filter by
         */
        public Builder emails(Optional<? extends List<String>> emails) {
            Utils.checkNotNull(emails, "emails");
            this.emails = emails;
            return this;
        }

        /**
         * List of user IDs to filter by
         */
        public Builder ids(List<String> ids) {
            Utils.checkNotNull(ids, "ids");
            this.ids = Optional.ofNullable(ids);
            return this;
        }

        /**
         * List of user IDs to filter by
         */
        public Builder ids(Optional<? extends List<String>> ids) {
            Utils.checkNotNull(ids, "ids");
            this.ids = ids;
            return this;
        }

        public Builder organizationId(String organizationId) {
            Utils.checkNotNull(organizationId, "organizationId");
            this.organizationId = organizationId;
            return this;
        }
        
        public ListUsersWithinAnOrganizationRequest build() {
            return new ListUsersWithinAnOrganizationRequest(
                emails,
                ids,
                organizationId);
        }
    }
}

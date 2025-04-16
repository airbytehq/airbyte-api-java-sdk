/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class WorkspaceUpdateRequest {

    /**
     * Name of the workspace
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    /**
     * Configures workspace notifications.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("notifications")
    private Optional<? extends NotificationsConfig> notifications;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("regionId")
    private Optional<String> regionId;

    @JsonCreator
    public WorkspaceUpdateRequest(
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("notifications") Optional<? extends NotificationsConfig> notifications,
            @JsonProperty("regionId") Optional<String> regionId) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(notifications, "notifications");
        Utils.checkNotNull(regionId, "regionId");
        this.name = name;
        this.notifications = notifications;
        this.regionId = regionId;
    }
    
    public WorkspaceUpdateRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Name of the workspace
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    /**
     * Configures workspace notifications.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<NotificationsConfig> notifications() {
        return (Optional<NotificationsConfig>) notifications;
    }

    @JsonIgnore
    public Optional<String> regionId() {
        return regionId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Name of the workspace
     */
    public WorkspaceUpdateRequest withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Name of the workspace
     */
    public WorkspaceUpdateRequest withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Configures workspace notifications.
     */
    public WorkspaceUpdateRequest withNotifications(NotificationsConfig notifications) {
        Utils.checkNotNull(notifications, "notifications");
        this.notifications = Optional.ofNullable(notifications);
        return this;
    }

    /**
     * Configures workspace notifications.
     */
    public WorkspaceUpdateRequest withNotifications(Optional<? extends NotificationsConfig> notifications) {
        Utils.checkNotNull(notifications, "notifications");
        this.notifications = notifications;
        return this;
    }

    public WorkspaceUpdateRequest withRegionId(String regionId) {
        Utils.checkNotNull(regionId, "regionId");
        this.regionId = Optional.ofNullable(regionId);
        return this;
    }

    public WorkspaceUpdateRequest withRegionId(Optional<String> regionId) {
        Utils.checkNotNull(regionId, "regionId");
        this.regionId = regionId;
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
        WorkspaceUpdateRequest other = (WorkspaceUpdateRequest) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.notifications, other.notifications) &&
            Objects.deepEquals(this.regionId, other.regionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            notifications,
            regionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WorkspaceUpdateRequest.class,
                "name", name,
                "notifications", notifications,
                "regionId", regionId);
    }
    
    public final static class Builder {
 
        private Optional<String> name = Optional.empty();
 
        private Optional<? extends NotificationsConfig> notifications = Optional.empty();
 
        private Optional<String> regionId = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Name of the workspace
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * Name of the workspace
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Configures workspace notifications.
         */
        public Builder notifications(NotificationsConfig notifications) {
            Utils.checkNotNull(notifications, "notifications");
            this.notifications = Optional.ofNullable(notifications);
            return this;
        }

        /**
         * Configures workspace notifications.
         */
        public Builder notifications(Optional<? extends NotificationsConfig> notifications) {
            Utils.checkNotNull(notifications, "notifications");
            this.notifications = notifications;
            return this;
        }

        public Builder regionId(String regionId) {
            Utils.checkNotNull(regionId, "regionId");
            this.regionId = Optional.ofNullable(regionId);
            return this;
        }

        public Builder regionId(Optional<String> regionId) {
            Utils.checkNotNull(regionId, "regionId");
            this.regionId = regionId;
            return this;
        }
        
        public WorkspaceUpdateRequest build() {
            return new WorkspaceUpdateRequest(
                name,
                notifications,
                regionId);
        }
    }
}

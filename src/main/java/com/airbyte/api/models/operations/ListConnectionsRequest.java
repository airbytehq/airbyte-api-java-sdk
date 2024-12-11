/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;


import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.SpeakeasyMetadata;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class ListConnectionsRequest {

    /**
     * Include deleted connections in the returned results.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=includeDeleted")
    private Optional<Boolean> includeDeleted;

    /**
     * Set the limit on the number of Connections returned. The default is 20.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    private Optional<Integer> limit;

    /**
     * Set the offset to start at when returning Connections. The default is 0
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    private Optional<Integer> offset;

    /**
     * The UUIDs of the workspaces you wish to list connections for. Empty list will retrieve all allowed workspaces.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=workspaceIds")
    private Optional<? extends List<String>> workspaceIds;

    @JsonCreator
    public ListConnectionsRequest(
            Optional<Boolean> includeDeleted,
            Optional<Integer> limit,
            Optional<Integer> offset,
            Optional<? extends List<String>> workspaceIds) {
        Utils.checkNotNull(includeDeleted, "includeDeleted");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(offset, "offset");
        Utils.checkNotNull(workspaceIds, "workspaceIds");
        this.includeDeleted = includeDeleted;
        this.limit = limit;
        this.offset = offset;
        this.workspaceIds = workspaceIds;
    }
    
    public ListConnectionsRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Include deleted connections in the returned results.
     */
    @JsonIgnore
    public Optional<Boolean> includeDeleted() {
        return includeDeleted;
    }

    /**
     * Set the limit on the number of Connections returned. The default is 20.
     */
    @JsonIgnore
    public Optional<Integer> limit() {
        return limit;
    }

    /**
     * Set the offset to start at when returning Connections. The default is 0
     */
    @JsonIgnore
    public Optional<Integer> offset() {
        return offset;
    }

    /**
     * The UUIDs of the workspaces you wish to list connections for. Empty list will retrieve all allowed workspaces.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> workspaceIds() {
        return (Optional<List<String>>) workspaceIds;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Include deleted connections in the returned results.
     */
    public ListConnectionsRequest withIncludeDeleted(boolean includeDeleted) {
        Utils.checkNotNull(includeDeleted, "includeDeleted");
        this.includeDeleted = Optional.ofNullable(includeDeleted);
        return this;
    }

    /**
     * Include deleted connections in the returned results.
     */
    public ListConnectionsRequest withIncludeDeleted(Optional<Boolean> includeDeleted) {
        Utils.checkNotNull(includeDeleted, "includeDeleted");
        this.includeDeleted = includeDeleted;
        return this;
    }

    /**
     * Set the limit on the number of Connections returned. The default is 20.
     */
    public ListConnectionsRequest withLimit(int limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    /**
     * Set the limit on the number of Connections returned. The default is 20.
     */
    public ListConnectionsRequest withLimit(Optional<Integer> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    /**
     * Set the offset to start at when returning Connections. The default is 0
     */
    public ListConnectionsRequest withOffset(int offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = Optional.ofNullable(offset);
        return this;
    }

    /**
     * Set the offset to start at when returning Connections. The default is 0
     */
    public ListConnectionsRequest withOffset(Optional<Integer> offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
        return this;
    }

    /**
     * The UUIDs of the workspaces you wish to list connections for. Empty list will retrieve all allowed workspaces.
     */
    public ListConnectionsRequest withWorkspaceIds(List<String> workspaceIds) {
        Utils.checkNotNull(workspaceIds, "workspaceIds");
        this.workspaceIds = Optional.ofNullable(workspaceIds);
        return this;
    }

    /**
     * The UUIDs of the workspaces you wish to list connections for. Empty list will retrieve all allowed workspaces.
     */
    public ListConnectionsRequest withWorkspaceIds(Optional<? extends List<String>> workspaceIds) {
        Utils.checkNotNull(workspaceIds, "workspaceIds");
        this.workspaceIds = workspaceIds;
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
        ListConnectionsRequest other = (ListConnectionsRequest) o;
        return 
            Objects.deepEquals(this.includeDeleted, other.includeDeleted) &&
            Objects.deepEquals(this.limit, other.limit) &&
            Objects.deepEquals(this.offset, other.offset) &&
            Objects.deepEquals(this.workspaceIds, other.workspaceIds);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            includeDeleted,
            limit,
            offset,
            workspaceIds);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListConnectionsRequest.class,
                "includeDeleted", includeDeleted,
                "limit", limit,
                "offset", offset,
                "workspaceIds", workspaceIds);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> includeDeleted;
 
        private Optional<Integer> limit;
 
        private Optional<Integer> offset;
 
        private Optional<? extends List<String>> workspaceIds = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Include deleted connections in the returned results.
         */
        public Builder includeDeleted(boolean includeDeleted) {
            Utils.checkNotNull(includeDeleted, "includeDeleted");
            this.includeDeleted = Optional.ofNullable(includeDeleted);
            return this;
        }

        /**
         * Include deleted connections in the returned results.
         */
        public Builder includeDeleted(Optional<Boolean> includeDeleted) {
            Utils.checkNotNull(includeDeleted, "includeDeleted");
            this.includeDeleted = includeDeleted;
            return this;
        }

        /**
         * Set the limit on the number of Connections returned. The default is 20.
         */
        public Builder limit(int limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        /**
         * Set the limit on the number of Connections returned. The default is 20.
         */
        public Builder limit(Optional<Integer> limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }

        /**
         * Set the offset to start at when returning Connections. The default is 0
         */
        public Builder offset(int offset) {
            Utils.checkNotNull(offset, "offset");
            this.offset = Optional.ofNullable(offset);
            return this;
        }

        /**
         * Set the offset to start at when returning Connections. The default is 0
         */
        public Builder offset(Optional<Integer> offset) {
            Utils.checkNotNull(offset, "offset");
            this.offset = offset;
            return this;
        }

        /**
         * The UUIDs of the workspaces you wish to list connections for. Empty list will retrieve all allowed workspaces.
         */
        public Builder workspaceIds(List<String> workspaceIds) {
            Utils.checkNotNull(workspaceIds, "workspaceIds");
            this.workspaceIds = Optional.ofNullable(workspaceIds);
            return this;
        }

        /**
         * The UUIDs of the workspaces you wish to list connections for. Empty list will retrieve all allowed workspaces.
         */
        public Builder workspaceIds(Optional<? extends List<String>> workspaceIds) {
            Utils.checkNotNull(workspaceIds, "workspaceIds");
            this.workspaceIds = workspaceIds;
            return this;
        }
        
        public ListConnectionsRequest build() {
            if (includeDeleted == null) {
                includeDeleted = _SINGLETON_VALUE_IncludeDeleted.value();
            }
            if (limit == null) {
                limit = _SINGLETON_VALUE_Limit.value();
            }
            if (offset == null) {
                offset = _SINGLETON_VALUE_Offset.value();
            }            return new ListConnectionsRequest(
                includeDeleted,
                limit,
                offset,
                workspaceIds);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_IncludeDeleted =
                new LazySingletonValue<>(
                        "includeDeleted",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});

        private static final LazySingletonValue<Optional<Integer>> _SINGLETON_VALUE_Limit =
                new LazySingletonValue<>(
                        "limit",
                        "20",
                        new TypeReference<Optional<Integer>>() {});

        private static final LazySingletonValue<Optional<Integer>> _SINGLETON_VALUE_Offset =
                new LazySingletonValue<>(
                        "offset",
                        "0",
                        new TypeReference<Optional<Integer>>() {});
    }
}


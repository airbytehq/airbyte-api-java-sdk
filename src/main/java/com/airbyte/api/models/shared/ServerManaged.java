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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * ServerManaged - Server-managed object storage
 */

public class ServerManaged {

    /**
     * The name of the managed warehouse
     */
    @JsonProperty("managed_warehouse_name")
    private String managedWarehouseName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("storage_type")
    private Optional<? extends DestinationIcebergStorageType> storageType;

    @JsonCreator
    public ServerManaged(
            @JsonProperty("managed_warehouse_name") String managedWarehouseName,
            @JsonProperty("storage_type") Optional<? extends DestinationIcebergStorageType> storageType) {
        Utils.checkNotNull(managedWarehouseName, "managedWarehouseName");
        Utils.checkNotNull(storageType, "storageType");
        this.managedWarehouseName = managedWarehouseName;
        this.storageType = storageType;
    }
    
    public ServerManaged(
            String managedWarehouseName) {
        this(managedWarehouseName, Optional.empty());
    }

    /**
     * The name of the managed warehouse
     */
    @JsonIgnore
    public String managedWarehouseName() {
        return managedWarehouseName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationIcebergStorageType> storageType() {
        return (Optional<DestinationIcebergStorageType>) storageType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the managed warehouse
     */
    public ServerManaged withManagedWarehouseName(String managedWarehouseName) {
        Utils.checkNotNull(managedWarehouseName, "managedWarehouseName");
        this.managedWarehouseName = managedWarehouseName;
        return this;
    }

    public ServerManaged withStorageType(DestinationIcebergStorageType storageType) {
        Utils.checkNotNull(storageType, "storageType");
        this.storageType = Optional.ofNullable(storageType);
        return this;
    }

    public ServerManaged withStorageType(Optional<? extends DestinationIcebergStorageType> storageType) {
        Utils.checkNotNull(storageType, "storageType");
        this.storageType = storageType;
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
        ServerManaged other = (ServerManaged) o;
        return 
            Objects.deepEquals(this.managedWarehouseName, other.managedWarehouseName) &&
            Objects.deepEquals(this.storageType, other.storageType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            managedWarehouseName,
            storageType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ServerManaged.class,
                "managedWarehouseName", managedWarehouseName,
                "storageType", storageType);
    }
    
    public final static class Builder {
 
        private String managedWarehouseName;
 
        private Optional<? extends DestinationIcebergStorageType> storageType;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The name of the managed warehouse
         */
        public Builder managedWarehouseName(String managedWarehouseName) {
            Utils.checkNotNull(managedWarehouseName, "managedWarehouseName");
            this.managedWarehouseName = managedWarehouseName;
            return this;
        }

        public Builder storageType(DestinationIcebergStorageType storageType) {
            Utils.checkNotNull(storageType, "storageType");
            this.storageType = Optional.ofNullable(storageType);
            return this;
        }

        public Builder storageType(Optional<? extends DestinationIcebergStorageType> storageType) {
            Utils.checkNotNull(storageType, "storageType");
            this.storageType = storageType;
            return this;
        }
        
        public ServerManaged build() {
            if (storageType == null) {
                storageType = _SINGLETON_VALUE_StorageType.value();
            }            return new ServerManaged(
                managedWarehouseName,
                storageType);
        }

        private static final LazySingletonValue<Optional<? extends DestinationIcebergStorageType>> _SINGLETON_VALUE_StorageType =
                new LazySingletonValue<>(
                        "storage_type",
                        "\"MANAGED\"",
                        new TypeReference<Optional<? extends DestinationIcebergStorageType>>() {});
    }
}


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
 * HadoopCatalogUseHierarchicalFileSystemsAsSameAsStorageConfig - A Hadoop catalog doesn’t need to connect to a Hive MetaStore, but can only be used with HDFS or similar file systems that support atomic rename.
 */

public class HadoopCatalogUseHierarchicalFileSystemsAsSameAsStorageConfig {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("catalog_type")
    private Optional<? extends DestinationIcebergCatalogType> catalogType;

    /**
     * The default database tables are written to if the source does not specify a namespace. The usual value for this field is "default".
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("database")
    private Optional<String> database;

    @JsonCreator
    public HadoopCatalogUseHierarchicalFileSystemsAsSameAsStorageConfig(
            @JsonProperty("catalog_type") Optional<? extends DestinationIcebergCatalogType> catalogType,
            @JsonProperty("database") Optional<String> database) {
        Utils.checkNotNull(catalogType, "catalogType");
        Utils.checkNotNull(database, "database");
        this.catalogType = catalogType;
        this.database = database;
    }
    
    public HadoopCatalogUseHierarchicalFileSystemsAsSameAsStorageConfig() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationIcebergCatalogType> catalogType() {
        return (Optional<DestinationIcebergCatalogType>) catalogType;
    }

    /**
     * The default database tables are written to if the source does not specify a namespace. The usual value for this field is "default".
     */
    @JsonIgnore
    public Optional<String> database() {
        return database;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public HadoopCatalogUseHierarchicalFileSystemsAsSameAsStorageConfig withCatalogType(DestinationIcebergCatalogType catalogType) {
        Utils.checkNotNull(catalogType, "catalogType");
        this.catalogType = Optional.ofNullable(catalogType);
        return this;
    }

    public HadoopCatalogUseHierarchicalFileSystemsAsSameAsStorageConfig withCatalogType(Optional<? extends DestinationIcebergCatalogType> catalogType) {
        Utils.checkNotNull(catalogType, "catalogType");
        this.catalogType = catalogType;
        return this;
    }

    /**
     * The default database tables are written to if the source does not specify a namespace. The usual value for this field is "default".
     */
    public HadoopCatalogUseHierarchicalFileSystemsAsSameAsStorageConfig withDatabase(String database) {
        Utils.checkNotNull(database, "database");
        this.database = Optional.ofNullable(database);
        return this;
    }

    /**
     * The default database tables are written to if the source does not specify a namespace. The usual value for this field is "default".
     */
    public HadoopCatalogUseHierarchicalFileSystemsAsSameAsStorageConfig withDatabase(Optional<String> database) {
        Utils.checkNotNull(database, "database");
        this.database = database;
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
        HadoopCatalogUseHierarchicalFileSystemsAsSameAsStorageConfig other = (HadoopCatalogUseHierarchicalFileSystemsAsSameAsStorageConfig) o;
        return 
            Objects.deepEquals(this.catalogType, other.catalogType) &&
            Objects.deepEquals(this.database, other.database);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            catalogType,
            database);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HadoopCatalogUseHierarchicalFileSystemsAsSameAsStorageConfig.class,
                "catalogType", catalogType,
                "database", database);
    }
    
    public final static class Builder {
 
        private Optional<? extends DestinationIcebergCatalogType> catalogType;
 
        private Optional<String> database;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder catalogType(DestinationIcebergCatalogType catalogType) {
            Utils.checkNotNull(catalogType, "catalogType");
            this.catalogType = Optional.ofNullable(catalogType);
            return this;
        }

        public Builder catalogType(Optional<? extends DestinationIcebergCatalogType> catalogType) {
            Utils.checkNotNull(catalogType, "catalogType");
            this.catalogType = catalogType;
            return this;
        }

        /**
         * The default database tables are written to if the source does not specify a namespace. The usual value for this field is "default".
         */
        public Builder database(String database) {
            Utils.checkNotNull(database, "database");
            this.database = Optional.ofNullable(database);
            return this;
        }

        /**
         * The default database tables are written to if the source does not specify a namespace. The usual value for this field is "default".
         */
        public Builder database(Optional<String> database) {
            Utils.checkNotNull(database, "database");
            this.database = database;
            return this;
        }
        
        public HadoopCatalogUseHierarchicalFileSystemsAsSameAsStorageConfig build() {
            if (catalogType == null) {
                catalogType = _SINGLETON_VALUE_CatalogType.value();
            }
            if (database == null) {
                database = _SINGLETON_VALUE_Database.value();
            }            return new HadoopCatalogUseHierarchicalFileSystemsAsSameAsStorageConfig(
                catalogType,
                database);
        }

        private static final LazySingletonValue<Optional<? extends DestinationIcebergCatalogType>> _SINGLETON_VALUE_CatalogType =
                new LazySingletonValue<>(
                        "catalog_type",
                        "\"Hadoop\"",
                        new TypeReference<Optional<? extends DestinationIcebergCatalogType>>() {});

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_Database =
                new LazySingletonValue<>(
                        "database",
                        "\"default\"",
                        new TypeReference<Optional<String>>() {});
    }
}


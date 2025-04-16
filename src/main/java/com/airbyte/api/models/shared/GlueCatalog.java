/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * GlueCatalog
 * 
 * <p>Configuration details for connecting to an AWS Glue-based Iceberg catalog.
 */
public class GlueCatalog {

    @JsonIgnore
    private Map<String, Object> additionalProperties;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("catalog_type")
    private Optional<? extends DestinationS3DataLakeCatalogType> catalogType;

    /**
     * The Glue database name. This will ONLY be used if the `Destination Namespace` setting for the connection is set to `Destination-defined` or `Source-defined`
     */
    @JsonProperty("database_name")
    private String databaseName;

    /**
     * The AWS Account ID associated with the Glue service used by the Iceberg catalog.
     */
    @JsonProperty("glue_id")
    private String glueId;

    /**
     * The ARN of the AWS role to assume. Only usable in Airbyte Cloud.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("role_arn")
    private Optional<String> roleArn;

    @JsonCreator
    public GlueCatalog(
            @JsonProperty("catalog_type") Optional<? extends DestinationS3DataLakeCatalogType> catalogType,
            @JsonProperty("database_name") String databaseName,
            @JsonProperty("glue_id") String glueId,
            @JsonProperty("role_arn") Optional<String> roleArn) {
        Utils.checkNotNull(catalogType, "catalogType");
        Utils.checkNotNull(databaseName, "databaseName");
        Utils.checkNotNull(glueId, "glueId");
        Utils.checkNotNull(roleArn, "roleArn");
        this.additionalProperties = new HashMap<>();
        this.catalogType = catalogType;
        this.databaseName = databaseName;
        this.glueId = glueId;
        this.roleArn = roleArn;
    }
    
    public GlueCatalog(
            String databaseName,
            String glueId) {
        this(Optional.empty(), databaseName, glueId, Optional.empty());
    }

    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return additionalProperties;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationS3DataLakeCatalogType> catalogType() {
        return (Optional<DestinationS3DataLakeCatalogType>) catalogType;
    }

    /**
     * The Glue database name. This will ONLY be used if the `Destination Namespace` setting for the connection is set to `Destination-defined` or `Source-defined`
     */
    @JsonIgnore
    public String databaseName() {
        return databaseName;
    }

    /**
     * The AWS Account ID associated with the Glue service used by the Iceberg catalog.
     */
    @JsonIgnore
    public String glueId() {
        return glueId;
    }

    /**
     * The ARN of the AWS role to assume. Only usable in Airbyte Cloud.
     */
    @JsonIgnore
    public Optional<String> roleArn() {
        return roleArn;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    @JsonAnySetter
    public GlueCatalog withAdditionalProperty(String key, Object value) {
        // note that value can be null because of the way JsonAnySetter works
        Utils.checkNotNull(key, "key");
        additionalProperties.put(key, value); 
        return this;
    }    

    public GlueCatalog withAdditionalProperties(Map<String, Object> additionalProperties) {
        Utils.checkNotNull(additionalProperties, "additionalProperties");
        this.additionalProperties = additionalProperties;
        return this;
    }

    public GlueCatalog withCatalogType(DestinationS3DataLakeCatalogType catalogType) {
        Utils.checkNotNull(catalogType, "catalogType");
        this.catalogType = Optional.ofNullable(catalogType);
        return this;
    }

    public GlueCatalog withCatalogType(Optional<? extends DestinationS3DataLakeCatalogType> catalogType) {
        Utils.checkNotNull(catalogType, "catalogType");
        this.catalogType = catalogType;
        return this;
    }

    /**
     * The Glue database name. This will ONLY be used if the `Destination Namespace` setting for the connection is set to `Destination-defined` or `Source-defined`
     */
    public GlueCatalog withDatabaseName(String databaseName) {
        Utils.checkNotNull(databaseName, "databaseName");
        this.databaseName = databaseName;
        return this;
    }

    /**
     * The AWS Account ID associated with the Glue service used by the Iceberg catalog.
     */
    public GlueCatalog withGlueId(String glueId) {
        Utils.checkNotNull(glueId, "glueId");
        this.glueId = glueId;
        return this;
    }

    /**
     * The ARN of the AWS role to assume. Only usable in Airbyte Cloud.
     */
    public GlueCatalog withRoleArn(String roleArn) {
        Utils.checkNotNull(roleArn, "roleArn");
        this.roleArn = Optional.ofNullable(roleArn);
        return this;
    }

    /**
     * The ARN of the AWS role to assume. Only usable in Airbyte Cloud.
     */
    public GlueCatalog withRoleArn(Optional<String> roleArn) {
        Utils.checkNotNull(roleArn, "roleArn");
        this.roleArn = roleArn;
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
        GlueCatalog other = (GlueCatalog) o;
        return 
            Objects.deepEquals(this.additionalProperties, other.additionalProperties) &&
            Objects.deepEquals(this.catalogType, other.catalogType) &&
            Objects.deepEquals(this.databaseName, other.databaseName) &&
            Objects.deepEquals(this.glueId, other.glueId) &&
            Objects.deepEquals(this.roleArn, other.roleArn);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            additionalProperties,
            catalogType,
            databaseName,
            glueId,
            roleArn);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GlueCatalog.class,
                "additionalProperties", additionalProperties,
                "catalogType", catalogType,
                "databaseName", databaseName,
                "glueId", glueId,
                "roleArn", roleArn);
    }
    
    public final static class Builder {
 
        private Map<String, Object> additionalProperties = new HashMap<>();
 
        private Optional<? extends DestinationS3DataLakeCatalogType> catalogType;
 
        private String databaseName;
 
        private String glueId;
 
        private Optional<String> roleArn = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder additionalProperty(String key, Object value) {
            Utils.checkNotNull(key, "key");
            // we could be strict about null values (force the user
            // to pass `JsonNullable.of(null)`) but likely to be a bit 
            // annoying for additional properties building so we'll 
            // relax preconditions.
            this.additionalProperties.put(key, value);
            return this;
        }

        public Builder additionalProperties(Map<String, Object> additionalProperties) {
            Utils.checkNotNull(additionalProperties, "additionalProperties");
            this.additionalProperties = additionalProperties;
            return this;
        }

        public Builder catalogType(DestinationS3DataLakeCatalogType catalogType) {
            Utils.checkNotNull(catalogType, "catalogType");
            this.catalogType = Optional.ofNullable(catalogType);
            return this;
        }

        public Builder catalogType(Optional<? extends DestinationS3DataLakeCatalogType> catalogType) {
            Utils.checkNotNull(catalogType, "catalogType");
            this.catalogType = catalogType;
            return this;
        }

        /**
         * The Glue database name. This will ONLY be used if the `Destination Namespace` setting for the connection is set to `Destination-defined` or `Source-defined`
         */
        public Builder databaseName(String databaseName) {
            Utils.checkNotNull(databaseName, "databaseName");
            this.databaseName = databaseName;
            return this;
        }

        /**
         * The AWS Account ID associated with the Glue service used by the Iceberg catalog.
         */
        public Builder glueId(String glueId) {
            Utils.checkNotNull(glueId, "glueId");
            this.glueId = glueId;
            return this;
        }

        /**
         * The ARN of the AWS role to assume. Only usable in Airbyte Cloud.
         */
        public Builder roleArn(String roleArn) {
            Utils.checkNotNull(roleArn, "roleArn");
            this.roleArn = Optional.ofNullable(roleArn);
            return this;
        }

        /**
         * The ARN of the AWS role to assume. Only usable in Airbyte Cloud.
         */
        public Builder roleArn(Optional<String> roleArn) {
            Utils.checkNotNull(roleArn, "roleArn");
            this.roleArn = roleArn;
            return this;
        }
        
        public GlueCatalog build() {
            if (catalogType == null) {
                catalogType = _SINGLETON_VALUE_CatalogType.value();
            }
            return new GlueCatalog(
                catalogType,
                databaseName,
                glueId,
                roleArn)
                .withAdditionalProperties(additionalProperties);
        }

        private static final LazySingletonValue<Optional<? extends DestinationS3DataLakeCatalogType>> _SINGLETON_VALUE_CatalogType =
                new LazySingletonValue<>(
                        "catalog_type",
                        "\"GLUE\"",
                        new TypeReference<Optional<? extends DestinationS3DataLakeCatalogType>>() {});
    }
}

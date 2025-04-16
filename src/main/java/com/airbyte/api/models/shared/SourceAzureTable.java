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
import java.util.Objects;
import java.util.Optional;

public class SourceAzureTable {

    @JsonProperty("sourceType")
    private AzureTable sourceType;

    /**
     * Azure Table Storage Access Key. See the &lt;a href="https://docs.airbyte.com/integrations/sources/azure-table"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    @JsonProperty("storage_access_key")
    private String storageAccessKey;

    /**
     * The name of your storage account.
     */
    @JsonProperty("storage_account_name")
    private String storageAccountName;

    /**
     * Azure Table Storage service account URL suffix. See the &lt;a href="https://docs.airbyte.com/integrations/sources/azure-table"&gt;docs&lt;/a&gt; for more information on how to obtain endpoint suffix
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("storage_endpoint_suffix")
    private Optional<String> storageEndpointSuffix;

    @JsonCreator
    public SourceAzureTable(
            @JsonProperty("storage_access_key") String storageAccessKey,
            @JsonProperty("storage_account_name") String storageAccountName,
            @JsonProperty("storage_endpoint_suffix") Optional<String> storageEndpointSuffix) {
        Utils.checkNotNull(storageAccessKey, "storageAccessKey");
        Utils.checkNotNull(storageAccountName, "storageAccountName");
        Utils.checkNotNull(storageEndpointSuffix, "storageEndpointSuffix");
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.storageAccessKey = storageAccessKey;
        this.storageAccountName = storageAccountName;
        this.storageEndpointSuffix = storageEndpointSuffix;
    }
    
    public SourceAzureTable(
            String storageAccessKey,
            String storageAccountName) {
        this(storageAccessKey, storageAccountName, Optional.empty());
    }

    @JsonIgnore
    public AzureTable sourceType() {
        return sourceType;
    }

    /**
     * Azure Table Storage Access Key. See the &lt;a href="https://docs.airbyte.com/integrations/sources/azure-table"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    @JsonIgnore
    public String storageAccessKey() {
        return storageAccessKey;
    }

    /**
     * The name of your storage account.
     */
    @JsonIgnore
    public String storageAccountName() {
        return storageAccountName;
    }

    /**
     * Azure Table Storage service account URL suffix. See the &lt;a href="https://docs.airbyte.com/integrations/sources/azure-table"&gt;docs&lt;/a&gt; for more information on how to obtain endpoint suffix
     */
    @JsonIgnore
    public Optional<String> storageEndpointSuffix() {
        return storageEndpointSuffix;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Azure Table Storage Access Key. See the &lt;a href="https://docs.airbyte.com/integrations/sources/azure-table"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    public SourceAzureTable withStorageAccessKey(String storageAccessKey) {
        Utils.checkNotNull(storageAccessKey, "storageAccessKey");
        this.storageAccessKey = storageAccessKey;
        return this;
    }

    /**
     * The name of your storage account.
     */
    public SourceAzureTable withStorageAccountName(String storageAccountName) {
        Utils.checkNotNull(storageAccountName, "storageAccountName");
        this.storageAccountName = storageAccountName;
        return this;
    }

    /**
     * Azure Table Storage service account URL suffix. See the &lt;a href="https://docs.airbyte.com/integrations/sources/azure-table"&gt;docs&lt;/a&gt; for more information on how to obtain endpoint suffix
     */
    public SourceAzureTable withStorageEndpointSuffix(String storageEndpointSuffix) {
        Utils.checkNotNull(storageEndpointSuffix, "storageEndpointSuffix");
        this.storageEndpointSuffix = Optional.ofNullable(storageEndpointSuffix);
        return this;
    }

    /**
     * Azure Table Storage service account URL suffix. See the &lt;a href="https://docs.airbyte.com/integrations/sources/azure-table"&gt;docs&lt;/a&gt; for more information on how to obtain endpoint suffix
     */
    public SourceAzureTable withStorageEndpointSuffix(Optional<String> storageEndpointSuffix) {
        Utils.checkNotNull(storageEndpointSuffix, "storageEndpointSuffix");
        this.storageEndpointSuffix = storageEndpointSuffix;
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
        SourceAzureTable other = (SourceAzureTable) o;
        return 
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.storageAccessKey, other.storageAccessKey) &&
            Objects.deepEquals(this.storageAccountName, other.storageAccountName) &&
            Objects.deepEquals(this.storageEndpointSuffix, other.storageEndpointSuffix);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            sourceType,
            storageAccessKey,
            storageAccountName,
            storageEndpointSuffix);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceAzureTable.class,
                "sourceType", sourceType,
                "storageAccessKey", storageAccessKey,
                "storageAccountName", storageAccountName,
                "storageEndpointSuffix", storageEndpointSuffix);
    }
    
    public final static class Builder {
 
        private String storageAccessKey;
 
        private String storageAccountName;
 
        private Optional<String> storageEndpointSuffix;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Azure Table Storage Access Key. See the &lt;a href="https://docs.airbyte.com/integrations/sources/azure-table"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
         */
        public Builder storageAccessKey(String storageAccessKey) {
            Utils.checkNotNull(storageAccessKey, "storageAccessKey");
            this.storageAccessKey = storageAccessKey;
            return this;
        }

        /**
         * The name of your storage account.
         */
        public Builder storageAccountName(String storageAccountName) {
            Utils.checkNotNull(storageAccountName, "storageAccountName");
            this.storageAccountName = storageAccountName;
            return this;
        }

        /**
         * Azure Table Storage service account URL suffix. See the &lt;a href="https://docs.airbyte.com/integrations/sources/azure-table"&gt;docs&lt;/a&gt; for more information on how to obtain endpoint suffix
         */
        public Builder storageEndpointSuffix(String storageEndpointSuffix) {
            Utils.checkNotNull(storageEndpointSuffix, "storageEndpointSuffix");
            this.storageEndpointSuffix = Optional.ofNullable(storageEndpointSuffix);
            return this;
        }

        /**
         * Azure Table Storage service account URL suffix. See the &lt;a href="https://docs.airbyte.com/integrations/sources/azure-table"&gt;docs&lt;/a&gt; for more information on how to obtain endpoint suffix
         */
        public Builder storageEndpointSuffix(Optional<String> storageEndpointSuffix) {
            Utils.checkNotNull(storageEndpointSuffix, "storageEndpointSuffix");
            this.storageEndpointSuffix = storageEndpointSuffix;
            return this;
        }
        
        public SourceAzureTable build() {
            if (storageEndpointSuffix == null) {
                storageEndpointSuffix = _SINGLETON_VALUE_StorageEndpointSuffix.value();
            }
            return new SourceAzureTable(
                storageAccessKey,
                storageAccountName,
                storageEndpointSuffix);
        }

        private static final LazySingletonValue<AzureTable> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"azure-table\"",
                        new TypeReference<AzureTable>() {});

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_StorageEndpointSuffix =
                new LazySingletonValue<>(
                        "storage_endpoint_suffix",
                        "\"core.windows.net\"",
                        new TypeReference<Optional<String>>() {});
    }
}

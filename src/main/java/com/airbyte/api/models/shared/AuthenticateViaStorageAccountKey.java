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


public class AuthenticateViaStorageAccountKey {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends SourceAzureBlobStorageSchemasAuthType> authType;

    /**
     * The Azure blob storage account key.
     */
    @JsonProperty("azure_blob_storage_account_key")
    private String azureBlobStorageAccountKey;

    @JsonCreator
    public AuthenticateViaStorageAccountKey(
            @JsonProperty("azure_blob_storage_account_key") String azureBlobStorageAccountKey) {
        Utils.checkNotNull(azureBlobStorageAccountKey, "azureBlobStorageAccountKey");
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.azureBlobStorageAccountKey = azureBlobStorageAccountKey;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceAzureBlobStorageSchemasAuthType> authType() {
        return (Optional<SourceAzureBlobStorageSchemasAuthType>) authType;
    }

    /**
     * The Azure blob storage account key.
     */
    @JsonIgnore
    public String azureBlobStorageAccountKey() {
        return azureBlobStorageAccountKey;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Azure blob storage account key.
     */
    public AuthenticateViaStorageAccountKey withAzureBlobStorageAccountKey(String azureBlobStorageAccountKey) {
        Utils.checkNotNull(azureBlobStorageAccountKey, "azureBlobStorageAccountKey");
        this.azureBlobStorageAccountKey = azureBlobStorageAccountKey;
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
        AuthenticateViaStorageAccountKey other = (AuthenticateViaStorageAccountKey) o;
        return 
            java.util.Objects.deepEquals(this.authType, other.authType) &&
            java.util.Objects.deepEquals(this.azureBlobStorageAccountKey, other.azureBlobStorageAccountKey);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            authType,
            azureBlobStorageAccountKey);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AuthenticateViaStorageAccountKey.class,
                "authType", authType,
                "azureBlobStorageAccountKey", azureBlobStorageAccountKey);
    }
    
    public final static class Builder {
 
        private String azureBlobStorageAccountKey;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Azure blob storage account key.
         */
        public Builder azureBlobStorageAccountKey(String azureBlobStorageAccountKey) {
            Utils.checkNotNull(azureBlobStorageAccountKey, "azureBlobStorageAccountKey");
            this.azureBlobStorageAccountKey = azureBlobStorageAccountKey;
            return this;
        }
        
        public AuthenticateViaStorageAccountKey build() {
            return new AuthenticateViaStorageAccountKey(
                azureBlobStorageAccountKey);
        }

        private static final LazySingletonValue<Optional<? extends SourceAzureBlobStorageSchemasAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"storage_account_key\"",
                        new TypeReference<Optional<? extends SourceAzureBlobStorageSchemasAuthType>>() {});
    }
}

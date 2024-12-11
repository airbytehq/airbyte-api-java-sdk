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


public class ServiceAccountAuthentication {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends SourceGcsSchemasAuthType> authType;

    /**
     * Enter your Google Cloud &lt;a href="https://cloud.google.com/iam/docs/creating-managing-service-account-keys#creating_service_account_keys"&gt;service account key&lt;/a&gt; in JSON format
     */
    @JsonProperty("service_account")
    private String serviceAccount;

    @JsonCreator
    public ServiceAccountAuthentication(
            @JsonProperty("service_account") String serviceAccount) {
        Utils.checkNotNull(serviceAccount, "serviceAccount");
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.serviceAccount = serviceAccount;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceGcsSchemasAuthType> authType() {
        return (Optional<SourceGcsSchemasAuthType>) authType;
    }

    /**
     * Enter your Google Cloud &lt;a href="https://cloud.google.com/iam/docs/creating-managing-service-account-keys#creating_service_account_keys"&gt;service account key&lt;/a&gt; in JSON format
     */
    @JsonIgnore
    public String serviceAccount() {
        return serviceAccount;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Enter your Google Cloud &lt;a href="https://cloud.google.com/iam/docs/creating-managing-service-account-keys#creating_service_account_keys"&gt;service account key&lt;/a&gt; in JSON format
     */
    public ServiceAccountAuthentication withServiceAccount(String serviceAccount) {
        Utils.checkNotNull(serviceAccount, "serviceAccount");
        this.serviceAccount = serviceAccount;
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
        ServiceAccountAuthentication other = (ServiceAccountAuthentication) o;
        return 
            Objects.deepEquals(this.authType, other.authType) &&
            Objects.deepEquals(this.serviceAccount, other.serviceAccount);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            authType,
            serviceAccount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ServiceAccountAuthentication.class,
                "authType", authType,
                "serviceAccount", serviceAccount);
    }
    
    public final static class Builder {
 
        private String serviceAccount;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Enter your Google Cloud &lt;a href="https://cloud.google.com/iam/docs/creating-managing-service-account-keys#creating_service_account_keys"&gt;service account key&lt;/a&gt; in JSON format
         */
        public Builder serviceAccount(String serviceAccount) {
            Utils.checkNotNull(serviceAccount, "serviceAccount");
            this.serviceAccount = serviceAccount;
            return this;
        }
        
        public ServiceAccountAuthentication build() {
            return new ServiceAccountAuthentication(
                serviceAccount);
        }

        private static final LazySingletonValue<Optional<? extends SourceGcsSchemasAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"Service\"",
                        new TypeReference<Optional<? extends SourceGcsSchemasAuthType>>() {});
    }
}


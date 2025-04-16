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

public class ServiceAccountKeyAuthentication {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends DestinationGoogleSheetsSchemasAuthType> authType;

    /**
     * Enter your service account key in JSON format. See the &lt;a href='https://docs.airbyte.com/integrations/destinations/google-sheets#service-account'&gt;docs&lt;/a&gt; for more information on how to generate this key.
     */
    @JsonProperty("service_account_info")
    private String serviceAccountInfo;

    @JsonCreator
    public ServiceAccountKeyAuthentication(
            @JsonProperty("service_account_info") String serviceAccountInfo) {
        Utils.checkNotNull(serviceAccountInfo, "serviceAccountInfo");
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.serviceAccountInfo = serviceAccountInfo;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationGoogleSheetsSchemasAuthType> authType() {
        return (Optional<DestinationGoogleSheetsSchemasAuthType>) authType;
    }

    /**
     * Enter your service account key in JSON format. See the &lt;a href='https://docs.airbyte.com/integrations/destinations/google-sheets#service-account'&gt;docs&lt;/a&gt; for more information on how to generate this key.
     */
    @JsonIgnore
    public String serviceAccountInfo() {
        return serviceAccountInfo;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Enter your service account key in JSON format. See the &lt;a href='https://docs.airbyte.com/integrations/destinations/google-sheets#service-account'&gt;docs&lt;/a&gt; for more information on how to generate this key.
     */
    public ServiceAccountKeyAuthentication withServiceAccountInfo(String serviceAccountInfo) {
        Utils.checkNotNull(serviceAccountInfo, "serviceAccountInfo");
        this.serviceAccountInfo = serviceAccountInfo;
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
        ServiceAccountKeyAuthentication other = (ServiceAccountKeyAuthentication) o;
        return 
            Objects.deepEquals(this.authType, other.authType) &&
            Objects.deepEquals(this.serviceAccountInfo, other.serviceAccountInfo);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            authType,
            serviceAccountInfo);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ServiceAccountKeyAuthentication.class,
                "authType", authType,
                "serviceAccountInfo", serviceAccountInfo);
    }
    
    public final static class Builder {
 
        private String serviceAccountInfo;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Enter your service account key in JSON format. See the &lt;a href='https://docs.airbyte.com/integrations/destinations/google-sheets#service-account'&gt;docs&lt;/a&gt; for more information on how to generate this key.
         */
        public Builder serviceAccountInfo(String serviceAccountInfo) {
            Utils.checkNotNull(serviceAccountInfo, "serviceAccountInfo");
            this.serviceAccountInfo = serviceAccountInfo;
            return this;
        }
        
        public ServiceAccountKeyAuthentication build() {
            return new ServiceAccountKeyAuthentication(
                serviceAccountInfo);
        }

        private static final LazySingletonValue<Optional<? extends DestinationGoogleSheetsSchemasAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"service\"",
                        new TypeReference<Optional<? extends DestinationGoogleSheetsSchemasAuthType>>() {});
    }
}

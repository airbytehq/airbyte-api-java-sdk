/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class SourceGoogleSheetsServiceAccountKeyAuthentication {

    @JsonProperty("auth_type")
    private SourceGoogleSheetsSchemasAuthType authType;

    /**
     * The JSON key of the service account to use for authorization. Read more &lt;a href="https://cloud.google.com/iam/docs/creating-managing-service-account-keys#creating_service_account_keys"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("service_account_info")
    private String serviceAccountInfo;

    @JsonCreator
    public SourceGoogleSheetsServiceAccountKeyAuthentication(
            @JsonProperty("service_account_info") String serviceAccountInfo) {
        Utils.checkNotNull(serviceAccountInfo, "serviceAccountInfo");
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.serviceAccountInfo = serviceAccountInfo;
    }

    @JsonIgnore
    public SourceGoogleSheetsSchemasAuthType authType() {
        return authType;
    }

    /**
     * The JSON key of the service account to use for authorization. Read more &lt;a href="https://cloud.google.com/iam/docs/creating-managing-service-account-keys#creating_service_account_keys"&gt;here&lt;/a&gt;.
     */
    @JsonIgnore
    public String serviceAccountInfo() {
        return serviceAccountInfo;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The JSON key of the service account to use for authorization. Read more &lt;a href="https://cloud.google.com/iam/docs/creating-managing-service-account-keys#creating_service_account_keys"&gt;here&lt;/a&gt;.
     */
    public SourceGoogleSheetsServiceAccountKeyAuthentication withServiceAccountInfo(String serviceAccountInfo) {
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
        SourceGoogleSheetsServiceAccountKeyAuthentication other = (SourceGoogleSheetsServiceAccountKeyAuthentication) o;
        return 
            java.util.Objects.deepEquals(this.authType, other.authType) &&
            java.util.Objects.deepEquals(this.serviceAccountInfo, other.serviceAccountInfo);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            authType,
            serviceAccountInfo);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleSheetsServiceAccountKeyAuthentication.class,
                "authType", authType,
                "serviceAccountInfo", serviceAccountInfo);
    }
    
    public final static class Builder {
 
        private String serviceAccountInfo;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The JSON key of the service account to use for authorization. Read more &lt;a href="https://cloud.google.com/iam/docs/creating-managing-service-account-keys#creating_service_account_keys"&gt;here&lt;/a&gt;.
         */
        public Builder serviceAccountInfo(String serviceAccountInfo) {
            Utils.checkNotNull(serviceAccountInfo, "serviceAccountInfo");
            this.serviceAccountInfo = serviceAccountInfo;
            return this;
        }
        
        public SourceGoogleSheetsServiceAccountKeyAuthentication build() {
            return new SourceGoogleSheetsServiceAccountKeyAuthentication(
                serviceAccountInfo);
        }

        private static final LazySingletonValue<SourceGoogleSheetsSchemasAuthType> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"Service\"",
                        new TypeReference<SourceGoogleSheetsSchemasAuthType>() {});
    }
}


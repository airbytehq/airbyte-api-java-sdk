/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class SourceGoogleSearchConsoleServiceAccountKeyAuthentication {

    @JsonProperty("auth_type")
    private SourceGoogleSearchConsoleSchemasAuthType authType;

    /**
     * The email of the user which has permissions to access the Google Workspace Admin APIs.
     */
    @JsonProperty("email")
    private String email;

    /**
     * The JSON key of the service account to use for authorization. Read more &lt;a href="https://cloud.google.com/iam/docs/creating-managing-service-account-keys"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("service_account_info")
    private String serviceAccountInfo;

    @JsonCreator
    public SourceGoogleSearchConsoleServiceAccountKeyAuthentication(
            @JsonProperty("email") String email,
            @JsonProperty("service_account_info") String serviceAccountInfo) {
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(serviceAccountInfo, "serviceAccountInfo");
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.email = email;
        this.serviceAccountInfo = serviceAccountInfo;
    }

    @JsonIgnore
    public SourceGoogleSearchConsoleSchemasAuthType authType() {
        return authType;
    }

    /**
     * The email of the user which has permissions to access the Google Workspace Admin APIs.
     */
    @JsonIgnore
    public String email() {
        return email;
    }

    /**
     * The JSON key of the service account to use for authorization. Read more &lt;a href="https://cloud.google.com/iam/docs/creating-managing-service-account-keys"&gt;here&lt;/a&gt;.
     */
    @JsonIgnore
    public String serviceAccountInfo() {
        return serviceAccountInfo;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The email of the user which has permissions to access the Google Workspace Admin APIs.
     */
    public SourceGoogleSearchConsoleServiceAccountKeyAuthentication withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    /**
     * The JSON key of the service account to use for authorization. Read more &lt;a href="https://cloud.google.com/iam/docs/creating-managing-service-account-keys"&gt;here&lt;/a&gt;.
     */
    public SourceGoogleSearchConsoleServiceAccountKeyAuthentication withServiceAccountInfo(String serviceAccountInfo) {
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
        SourceGoogleSearchConsoleServiceAccountKeyAuthentication other = (SourceGoogleSearchConsoleServiceAccountKeyAuthentication) o;
        return 
            Objects.deepEquals(this.authType, other.authType) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.serviceAccountInfo, other.serviceAccountInfo);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            authType,
            email,
            serviceAccountInfo);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleSearchConsoleServiceAccountKeyAuthentication.class,
                "authType", authType,
                "email", email,
                "serviceAccountInfo", serviceAccountInfo);
    }
    
    public final static class Builder {
 
        private String email;
 
        private String serviceAccountInfo;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The email of the user which has permissions to access the Google Workspace Admin APIs.
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        /**
         * The JSON key of the service account to use for authorization. Read more &lt;a href="https://cloud.google.com/iam/docs/creating-managing-service-account-keys"&gt;here&lt;/a&gt;.
         */
        public Builder serviceAccountInfo(String serviceAccountInfo) {
            Utils.checkNotNull(serviceAccountInfo, "serviceAccountInfo");
            this.serviceAccountInfo = serviceAccountInfo;
            return this;
        }
        
        public SourceGoogleSearchConsoleServiceAccountKeyAuthentication build() {
            return new SourceGoogleSearchConsoleServiceAccountKeyAuthentication(
                email,
                serviceAccountInfo);
        }

        private static final LazySingletonValue<SourceGoogleSearchConsoleSchemasAuthType> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"Service\"",
                        new TypeReference<SourceGoogleSearchConsoleSchemasAuthType>() {});
    }
}

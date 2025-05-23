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

public class SourceGoogleAnalyticsDataApiServiceAccountKeyAuthentication {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends SourceGoogleAnalyticsDataApiSchemasAuthType> authType;

    /**
     * The JSON key linked to the service account used for authorization. For steps on obtaining this key, refer to &lt;a href="https://docs.airbyte.com/integrations/sources/google-analytics-data-api/#setup-guide"&gt;the setup guide&lt;/a&gt;.
     */
    @JsonProperty("credentials_json")
    private String credentialsJson;

    @JsonCreator
    public SourceGoogleAnalyticsDataApiServiceAccountKeyAuthentication(
            @JsonProperty("credentials_json") String credentialsJson) {
        Utils.checkNotNull(credentialsJson, "credentialsJson");
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.credentialsJson = credentialsJson;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceGoogleAnalyticsDataApiSchemasAuthType> authType() {
        return (Optional<SourceGoogleAnalyticsDataApiSchemasAuthType>) authType;
    }

    /**
     * The JSON key linked to the service account used for authorization. For steps on obtaining this key, refer to &lt;a href="https://docs.airbyte.com/integrations/sources/google-analytics-data-api/#setup-guide"&gt;the setup guide&lt;/a&gt;.
     */
    @JsonIgnore
    public String credentialsJson() {
        return credentialsJson;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The JSON key linked to the service account used for authorization. For steps on obtaining this key, refer to &lt;a href="https://docs.airbyte.com/integrations/sources/google-analytics-data-api/#setup-guide"&gt;the setup guide&lt;/a&gt;.
     */
    public SourceGoogleAnalyticsDataApiServiceAccountKeyAuthentication withCredentialsJson(String credentialsJson) {
        Utils.checkNotNull(credentialsJson, "credentialsJson");
        this.credentialsJson = credentialsJson;
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
        SourceGoogleAnalyticsDataApiServiceAccountKeyAuthentication other = (SourceGoogleAnalyticsDataApiServiceAccountKeyAuthentication) o;
        return 
            Objects.deepEquals(this.authType, other.authType) &&
            Objects.deepEquals(this.credentialsJson, other.credentialsJson);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            authType,
            credentialsJson);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleAnalyticsDataApiServiceAccountKeyAuthentication.class,
                "authType", authType,
                "credentialsJson", credentialsJson);
    }
    
    public final static class Builder {
 
        private String credentialsJson;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The JSON key linked to the service account used for authorization. For steps on obtaining this key, refer to &lt;a href="https://docs.airbyte.com/integrations/sources/google-analytics-data-api/#setup-guide"&gt;the setup guide&lt;/a&gt;.
         */
        public Builder credentialsJson(String credentialsJson) {
            Utils.checkNotNull(credentialsJson, "credentialsJson");
            this.credentialsJson = credentialsJson;
            return this;
        }
        
        public SourceGoogleAnalyticsDataApiServiceAccountKeyAuthentication build() {
            return new SourceGoogleAnalyticsDataApiServiceAccountKeyAuthentication(
                credentialsJson);
        }

        private static final LazySingletonValue<Optional<? extends SourceGoogleAnalyticsDataApiSchemasAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"Service\"",
                        new TypeReference<Optional<? extends SourceGoogleAnalyticsDataApiSchemasAuthType>>() {});
    }
}

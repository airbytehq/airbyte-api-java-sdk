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

public class SourceRingcentral {

    /**
     * Could be seen at response to basic api call to an endpoint with ~ operator.  Example- (https://platform.devtest.ringcentral.com/restapi/v1.0/account/~/extension/~/business-hours)
     */
    @JsonProperty("account_id")
    private String accountId;

    /**
     * Token could be recieved by following instructions at https://developers.ringcentral.com/api-reference/authentication
     */
    @JsonProperty("auth_token")
    private String authToken;

    /**
     * Could be seen at response to basic api call to an endpoint with ~ operator.  Example- (https://platform.devtest.ringcentral.com/restapi/v1.0/account/~/extension/~/business-hours)
     */
    @JsonProperty("extension_id")
    private String extensionId;

    @JsonProperty("sourceType")
    private Ringcentral sourceType;

    @JsonCreator
    public SourceRingcentral(
            @JsonProperty("account_id") String accountId,
            @JsonProperty("auth_token") String authToken,
            @JsonProperty("extension_id") String extensionId) {
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(authToken, "authToken");
        Utils.checkNotNull(extensionId, "extensionId");
        this.accountId = accountId;
        this.authToken = authToken;
        this.extensionId = extensionId;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * Could be seen at response to basic api call to an endpoint with ~ operator.  Example- (https://platform.devtest.ringcentral.com/restapi/v1.0/account/~/extension/~/business-hours)
     */
    @JsonIgnore
    public String accountId() {
        return accountId;
    }

    /**
     * Token could be recieved by following instructions at https://developers.ringcentral.com/api-reference/authentication
     */
    @JsonIgnore
    public String authToken() {
        return authToken;
    }

    /**
     * Could be seen at response to basic api call to an endpoint with ~ operator.  Example- (https://platform.devtest.ringcentral.com/restapi/v1.0/account/~/extension/~/business-hours)
     */
    @JsonIgnore
    public String extensionId() {
        return extensionId;
    }

    @JsonIgnore
    public Ringcentral sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Could be seen at response to basic api call to an endpoint with ~ operator.  Example- (https://platform.devtest.ringcentral.com/restapi/v1.0/account/~/extension/~/business-hours)
     */
    public SourceRingcentral withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    /**
     * Token could be recieved by following instructions at https://developers.ringcentral.com/api-reference/authentication
     */
    public SourceRingcentral withAuthToken(String authToken) {
        Utils.checkNotNull(authToken, "authToken");
        this.authToken = authToken;
        return this;
    }

    /**
     * Could be seen at response to basic api call to an endpoint with ~ operator.  Example- (https://platform.devtest.ringcentral.com/restapi/v1.0/account/~/extension/~/business-hours)
     */
    public SourceRingcentral withExtensionId(String extensionId) {
        Utils.checkNotNull(extensionId, "extensionId");
        this.extensionId = extensionId;
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
        SourceRingcentral other = (SourceRingcentral) o;
        return 
            Objects.deepEquals(this.accountId, other.accountId) &&
            Objects.deepEquals(this.authToken, other.authToken) &&
            Objects.deepEquals(this.extensionId, other.extensionId) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountId,
            authToken,
            extensionId,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceRingcentral.class,
                "accountId", accountId,
                "authToken", authToken,
                "extensionId", extensionId,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String accountId;
 
        private String authToken;
 
        private String extensionId;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Could be seen at response to basic api call to an endpoint with ~ operator.  Example- (https://platform.devtest.ringcentral.com/restapi/v1.0/account/~/extension/~/business-hours)
         */
        public Builder accountId(String accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = accountId;
            return this;
        }

        /**
         * Token could be recieved by following instructions at https://developers.ringcentral.com/api-reference/authentication
         */
        public Builder authToken(String authToken) {
            Utils.checkNotNull(authToken, "authToken");
            this.authToken = authToken;
            return this;
        }

        /**
         * Could be seen at response to basic api call to an endpoint with ~ operator.  Example- (https://platform.devtest.ringcentral.com/restapi/v1.0/account/~/extension/~/business-hours)
         */
        public Builder extensionId(String extensionId) {
            Utils.checkNotNull(extensionId, "extensionId");
            this.extensionId = extensionId;
            return this;
        }
        
        public SourceRingcentral build() {
            return new SourceRingcentral(
                accountId,
                authToken,
                extensionId);
        }

        private static final LazySingletonValue<Ringcentral> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"ringcentral\"",
                        new TypeReference<Ringcentral>() {});
    }
}

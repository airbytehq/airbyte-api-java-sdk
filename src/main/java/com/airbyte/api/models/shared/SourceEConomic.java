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


public class SourceEConomic {

    /**
     * Token that identifies the grant issued by an agreement, allowing your app to access data. Obtain it from your e-conomic account settings.
     */
    @JsonProperty("agreement_grant_token")
    private String agreementGrantToken;

    /**
     * Your private token that identifies your app. Find it in your e-conomic account settings.
     */
    @JsonProperty("app_secret_token")
    private String appSecretToken;

    @JsonProperty("sourceType")
    private EConomic sourceType;

    @JsonCreator
    public SourceEConomic(
            @JsonProperty("agreement_grant_token") String agreementGrantToken,
            @JsonProperty("app_secret_token") String appSecretToken) {
        Utils.checkNotNull(agreementGrantToken, "agreementGrantToken");
        Utils.checkNotNull(appSecretToken, "appSecretToken");
        this.agreementGrantToken = agreementGrantToken;
        this.appSecretToken = appSecretToken;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * Token that identifies the grant issued by an agreement, allowing your app to access data. Obtain it from your e-conomic account settings.
     */
    @JsonIgnore
    public String agreementGrantToken() {
        return agreementGrantToken;
    }

    /**
     * Your private token that identifies your app. Find it in your e-conomic account settings.
     */
    @JsonIgnore
    public String appSecretToken() {
        return appSecretToken;
    }

    @JsonIgnore
    public EConomic sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Token that identifies the grant issued by an agreement, allowing your app to access data. Obtain it from your e-conomic account settings.
     */
    public SourceEConomic withAgreementGrantToken(String agreementGrantToken) {
        Utils.checkNotNull(agreementGrantToken, "agreementGrantToken");
        this.agreementGrantToken = agreementGrantToken;
        return this;
    }

    /**
     * Your private token that identifies your app. Find it in your e-conomic account settings.
     */
    public SourceEConomic withAppSecretToken(String appSecretToken) {
        Utils.checkNotNull(appSecretToken, "appSecretToken");
        this.appSecretToken = appSecretToken;
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
        SourceEConomic other = (SourceEConomic) o;
        return 
            Objects.deepEquals(this.agreementGrantToken, other.agreementGrantToken) &&
            Objects.deepEquals(this.appSecretToken, other.appSecretToken) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            agreementGrantToken,
            appSecretToken,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceEConomic.class,
                "agreementGrantToken", agreementGrantToken,
                "appSecretToken", appSecretToken,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String agreementGrantToken;
 
        private String appSecretToken;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Token that identifies the grant issued by an agreement, allowing your app to access data. Obtain it from your e-conomic account settings.
         */
        public Builder agreementGrantToken(String agreementGrantToken) {
            Utils.checkNotNull(agreementGrantToken, "agreementGrantToken");
            this.agreementGrantToken = agreementGrantToken;
            return this;
        }

        /**
         * Your private token that identifies your app. Find it in your e-conomic account settings.
         */
        public Builder appSecretToken(String appSecretToken) {
            Utils.checkNotNull(appSecretToken, "appSecretToken");
            this.appSecretToken = appSecretToken;
            return this;
        }
        
        public SourceEConomic build() {
            return new SourceEConomic(
                agreementGrantToken,
                appSecretToken);
        }

        private static final LazySingletonValue<EConomic> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"e-conomic\"",
                        new TypeReference<EConomic>() {});
    }
}

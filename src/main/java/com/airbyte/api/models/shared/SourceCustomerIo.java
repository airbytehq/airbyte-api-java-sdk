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

public class SourceCustomerIo {

    @JsonProperty("app_api_key")
    private String appApiKey;

    @JsonProperty("sourceType")
    private CustomerIo sourceType;

    @JsonCreator
    public SourceCustomerIo(
            @JsonProperty("app_api_key") String appApiKey) {
        Utils.checkNotNull(appApiKey, "appApiKey");
        this.appApiKey = appApiKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    @JsonIgnore
    public String appApiKey() {
        return appApiKey;
    }

    @JsonIgnore
    public CustomerIo sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SourceCustomerIo withAppApiKey(String appApiKey) {
        Utils.checkNotNull(appApiKey, "appApiKey");
        this.appApiKey = appApiKey;
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
        SourceCustomerIo other = (SourceCustomerIo) o;
        return 
            Objects.deepEquals(this.appApiKey, other.appApiKey) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            appApiKey,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceCustomerIo.class,
                "appApiKey", appApiKey,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String appApiKey;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder appApiKey(String appApiKey) {
            Utils.checkNotNull(appApiKey, "appApiKey");
            this.appApiKey = appApiKey;
            return this;
        }
        
        public SourceCustomerIo build() {
            return new SourceCustomerIo(
                appApiKey);
        }

        private static final LazySingletonValue<CustomerIo> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"customer-io\"",
                        new TypeReference<CustomerIo>() {});
    }
}

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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

public class SourceGoogleForms {

    @JsonProperty("client_id")
    private String clientId;

    @JsonProperty("client_refresh_token")
    private String clientRefreshToken;

    @JsonProperty("client_secret")
    private String clientSecret;

    @JsonProperty("form_id")
    private List<Object> formId;

    @JsonProperty("sourceType")
    private GoogleForms sourceType;

    @JsonCreator
    public SourceGoogleForms(
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_refresh_token") String clientRefreshToken,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("form_id") List<Object> formId) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientRefreshToken, "clientRefreshToken");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(formId, "formId");
        this.clientId = clientId;
        this.clientRefreshToken = clientRefreshToken;
        this.clientSecret = clientSecret;
        this.formId = formId;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    @JsonIgnore
    public String clientRefreshToken() {
        return clientRefreshToken;
    }

    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    @JsonIgnore
    public List<Object> formId() {
        return formId;
    }

    @JsonIgnore
    public GoogleForms sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SourceGoogleForms withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    public SourceGoogleForms withClientRefreshToken(String clientRefreshToken) {
        Utils.checkNotNull(clientRefreshToken, "clientRefreshToken");
        this.clientRefreshToken = clientRefreshToken;
        return this;
    }

    public SourceGoogleForms withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    public SourceGoogleForms withFormId(List<Object> formId) {
        Utils.checkNotNull(formId, "formId");
        this.formId = formId;
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
        SourceGoogleForms other = (SourceGoogleForms) o;
        return 
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.clientRefreshToken, other.clientRefreshToken) &&
            Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            Objects.deepEquals(this.formId, other.formId) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            clientId,
            clientRefreshToken,
            clientSecret,
            formId,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleForms.class,
                "clientId", clientId,
                "clientRefreshToken", clientRefreshToken,
                "clientSecret", clientSecret,
                "formId", formId,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String clientId;
 
        private String clientRefreshToken;
 
        private String clientSecret;
 
        private List<Object> formId;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        public Builder clientRefreshToken(String clientRefreshToken) {
            Utils.checkNotNull(clientRefreshToken, "clientRefreshToken");
            this.clientRefreshToken = clientRefreshToken;
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder formId(List<Object> formId) {
            Utils.checkNotNull(formId, "formId");
            this.formId = formId;
            return this;
        }
        
        public SourceGoogleForms build() {
            return new SourceGoogleForms(
                clientId,
                clientRefreshToken,
                clientSecret,
                formId);
        }

        private static final LazySingletonValue<GoogleForms> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"google-forms\"",
                        new TypeReference<GoogleForms>() {});
    }
}

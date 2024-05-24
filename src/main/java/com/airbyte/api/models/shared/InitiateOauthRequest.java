/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

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
/**
 * InitiateOauthRequest - POST body for initiating OAuth via the public API
 */

public class InitiateOauthRequest {

    /**
     * The values required to configure OAuth flows. The schema for this must match the `OAuthConfigSpecification.oauthUserInputFromConnectorConfigSpecification` schema.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("oAuthInputConfiguration")
    private Optional<? extends java.lang.Object> oAuthInputConfiguration;

    /**
     * The URL to redirect the user to with the OAuth secret stored in the secret_id query string parameter after authentication is complete.
     */
    @JsonProperty("redirectUrl")
    private String redirectUrl;

    @JsonProperty("sourceType")
    private OAuthActorNames sourceType;

    /**
     * The workspace to create the secret and eventually the full source.
     */
    @JsonProperty("workspaceId")
    private String workspaceId;

    @JsonCreator
    public InitiateOauthRequest(
            @JsonProperty("oAuthInputConfiguration") Optional<? extends java.lang.Object> oAuthInputConfiguration,
            @JsonProperty("redirectUrl") String redirectUrl,
            @JsonProperty("sourceType") OAuthActorNames sourceType,
            @JsonProperty("workspaceId") String workspaceId) {
        Utils.checkNotNull(oAuthInputConfiguration, "oAuthInputConfiguration");
        Utils.checkNotNull(redirectUrl, "redirectUrl");
        Utils.checkNotNull(sourceType, "sourceType");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.oAuthInputConfiguration = oAuthInputConfiguration;
        this.redirectUrl = redirectUrl;
        this.sourceType = sourceType;
        this.workspaceId = workspaceId;
    }
    
    public InitiateOauthRequest(
            String redirectUrl,
            OAuthActorNames sourceType,
            String workspaceId) {
        this(Optional.empty(), redirectUrl, sourceType, workspaceId);
    }

    /**
     * The values required to configure OAuth flows. The schema for this must match the `OAuthConfigSpecification.oauthUserInputFromConnectorConfigSpecification` schema.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.lang.Object> oAuthInputConfiguration() {
        return (Optional<java.lang.Object>) oAuthInputConfiguration;
    }

    /**
     * The URL to redirect the user to with the OAuth secret stored in the secret_id query string parameter after authentication is complete.
     */
    @JsonIgnore
    public String redirectUrl() {
        return redirectUrl;
    }

    @JsonIgnore
    public OAuthActorNames sourceType() {
        return sourceType;
    }

    /**
     * The workspace to create the secret and eventually the full source.
     */
    @JsonIgnore
    public String workspaceId() {
        return workspaceId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The values required to configure OAuth flows. The schema for this must match the `OAuthConfigSpecification.oauthUserInputFromConnectorConfigSpecification` schema.
     */
    public InitiateOauthRequest withOAuthInputConfiguration(java.lang.Object oAuthInputConfiguration) {
        Utils.checkNotNull(oAuthInputConfiguration, "oAuthInputConfiguration");
        this.oAuthInputConfiguration = Optional.ofNullable(oAuthInputConfiguration);
        return this;
    }

    /**
     * The values required to configure OAuth flows. The schema for this must match the `OAuthConfigSpecification.oauthUserInputFromConnectorConfigSpecification` schema.
     */
    public InitiateOauthRequest withOAuthInputConfiguration(Optional<? extends java.lang.Object> oAuthInputConfiguration) {
        Utils.checkNotNull(oAuthInputConfiguration, "oAuthInputConfiguration");
        this.oAuthInputConfiguration = oAuthInputConfiguration;
        return this;
    }

    /**
     * The URL to redirect the user to with the OAuth secret stored in the secret_id query string parameter after authentication is complete.
     */
    public InitiateOauthRequest withRedirectUrl(String redirectUrl) {
        Utils.checkNotNull(redirectUrl, "redirectUrl");
        this.redirectUrl = redirectUrl;
        return this;
    }

    public InitiateOauthRequest withSourceType(OAuthActorNames sourceType) {
        Utils.checkNotNull(sourceType, "sourceType");
        this.sourceType = sourceType;
        return this;
    }

    /**
     * The workspace to create the secret and eventually the full source.
     */
    public InitiateOauthRequest withWorkspaceId(String workspaceId) {
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.workspaceId = workspaceId;
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
        InitiateOauthRequest other = (InitiateOauthRequest) o;
        return 
            java.util.Objects.deepEquals(this.oAuthInputConfiguration, other.oAuthInputConfiguration) &&
            java.util.Objects.deepEquals(this.redirectUrl, other.redirectUrl) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            oAuthInputConfiguration,
            redirectUrl,
            sourceType,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InitiateOauthRequest.class,
                "oAuthInputConfiguration", oAuthInputConfiguration,
                "redirectUrl", redirectUrl,
                "sourceType", sourceType,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.lang.Object> oAuthInputConfiguration = Optional.empty();
 
        private String redirectUrl;
 
        private OAuthActorNames sourceType;
 
        private String workspaceId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The values required to configure OAuth flows. The schema for this must match the `OAuthConfigSpecification.oauthUserInputFromConnectorConfigSpecification` schema.
         */
        public Builder oAuthInputConfiguration(java.lang.Object oAuthInputConfiguration) {
            Utils.checkNotNull(oAuthInputConfiguration, "oAuthInputConfiguration");
            this.oAuthInputConfiguration = Optional.ofNullable(oAuthInputConfiguration);
            return this;
        }

        /**
         * The values required to configure OAuth flows. The schema for this must match the `OAuthConfigSpecification.oauthUserInputFromConnectorConfigSpecification` schema.
         */
        public Builder oAuthInputConfiguration(Optional<? extends java.lang.Object> oAuthInputConfiguration) {
            Utils.checkNotNull(oAuthInputConfiguration, "oAuthInputConfiguration");
            this.oAuthInputConfiguration = oAuthInputConfiguration;
            return this;
        }

        /**
         * The URL to redirect the user to with the OAuth secret stored in the secret_id query string parameter after authentication is complete.
         */
        public Builder redirectUrl(String redirectUrl) {
            Utils.checkNotNull(redirectUrl, "redirectUrl");
            this.redirectUrl = redirectUrl;
            return this;
        }

        public Builder sourceType(OAuthActorNames sourceType) {
            Utils.checkNotNull(sourceType, "sourceType");
            this.sourceType = sourceType;
            return this;
        }

        /**
         * The workspace to create the secret and eventually the full source.
         */
        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }
        
        public InitiateOauthRequest build() {
            return new InitiateOauthRequest(
                oAuthInputConfiguration,
                redirectUrl,
                sourceType,
                workspaceId);
        }
    }
}


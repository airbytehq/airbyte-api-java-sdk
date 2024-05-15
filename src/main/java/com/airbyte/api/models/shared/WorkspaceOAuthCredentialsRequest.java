/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

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

/**
 * WorkspaceOAuthCredentialsRequest - POST body for creating/updating workspace level OAuth credentials
 */

public class WorkspaceOAuthCredentialsRequest {

    /**
     * Whether you're setting this override for a source or destination
     */
    @JsonProperty("actorType")
    private ActorTypeEnum actorType;

    /**
     * The values required to configure the source.
     */
    @JsonProperty("configuration")
    private OAuthCredentialsConfiguration configuration;

    @JsonProperty("name")
    private OAuthActorNames name;

    @JsonCreator
    public WorkspaceOAuthCredentialsRequest(
            @JsonProperty("actorType") ActorTypeEnum actorType,
            @JsonProperty("configuration") OAuthCredentialsConfiguration configuration,
            @JsonProperty("name") OAuthActorNames name) {
        Utils.checkNotNull(actorType, "actorType");
        Utils.checkNotNull(configuration, "configuration");
        Utils.checkNotNull(name, "name");
        this.actorType = actorType;
        this.configuration = configuration;
        this.name = name;
    }

    /**
     * Whether you're setting this override for a source or destination
     */
    @JsonIgnore
    public ActorTypeEnum actorType() {
        return actorType;
    }

    /**
     * The values required to configure the source.
     */
    @JsonIgnore
    public OAuthCredentialsConfiguration configuration() {
        return configuration;
    }

    @JsonIgnore
    public OAuthActorNames name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Whether you're setting this override for a source or destination
     */
    public WorkspaceOAuthCredentialsRequest withActorType(ActorTypeEnum actorType) {
        Utils.checkNotNull(actorType, "actorType");
        this.actorType = actorType;
        return this;
    }

    /**
     * The values required to configure the source.
     */
    public WorkspaceOAuthCredentialsRequest withConfiguration(OAuthCredentialsConfiguration configuration) {
        Utils.checkNotNull(configuration, "configuration");
        this.configuration = configuration;
        return this;
    }

    public WorkspaceOAuthCredentialsRequest withName(OAuthActorNames name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        WorkspaceOAuthCredentialsRequest other = (WorkspaceOAuthCredentialsRequest) o;
        return 
            java.util.Objects.deepEquals(this.actorType, other.actorType) &&
            java.util.Objects.deepEquals(this.configuration, other.configuration) &&
            java.util.Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            actorType,
            configuration,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WorkspaceOAuthCredentialsRequest.class,
                "actorType", actorType,
                "configuration", configuration,
                "name", name);
    }
    
    public final static class Builder {
 
        private ActorTypeEnum actorType;
 
        private OAuthCredentialsConfiguration configuration;
 
        private OAuthActorNames name;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Whether you're setting this override for a source or destination
         */
        public Builder actorType(ActorTypeEnum actorType) {
            Utils.checkNotNull(actorType, "actorType");
            this.actorType = actorType;
            return this;
        }

        /**
         * The values required to configure the source.
         */
        public Builder configuration(OAuthCredentialsConfiguration configuration) {
            Utils.checkNotNull(configuration, "configuration");
            this.configuration = configuration;
            return this;
        }

        public Builder name(OAuthActorNames name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public WorkspaceOAuthCredentialsRequest build() {
            return new WorkspaceOAuthCredentialsRequest(
                actorType,
                configuration,
                name);
        }
    }
}


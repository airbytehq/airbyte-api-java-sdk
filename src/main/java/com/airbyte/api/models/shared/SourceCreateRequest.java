/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;


import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class SourceCreateRequest {

    /**
     * The values required to configure the source.
     */
    @JsonProperty("configuration")
    private SourceConfiguration configuration;

    /**
     * The UUID of the connector definition. One of configuration.sourceType or definitionId must be provided.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("definitionId")
    private Optional<String> definitionId;

    /**
     * Name of the source e.g. dev-mysql-instance.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Optional secretID obtained through the  OAuth redirect flow.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("secretId")
    private Optional<String> secretId;

    @JsonProperty("workspaceId")
    private String workspaceId;

    @JsonCreator
    public SourceCreateRequest(
            @JsonProperty("configuration") SourceConfiguration configuration,
            @JsonProperty("definitionId") Optional<String> definitionId,
            @JsonProperty("name") String name,
            @JsonProperty("secretId") Optional<String> secretId,
            @JsonProperty("workspaceId") String workspaceId) {
        Utils.checkNotNull(configuration, "configuration");
        Utils.checkNotNull(definitionId, "definitionId");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(secretId, "secretId");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.configuration = configuration;
        this.definitionId = definitionId;
        this.name = name;
        this.secretId = secretId;
        this.workspaceId = workspaceId;
    }
    
    public SourceCreateRequest(
            SourceConfiguration configuration,
            String name,
            String workspaceId) {
        this(configuration, Optional.empty(), name, Optional.empty(), workspaceId);
    }

    /**
     * The values required to configure the source.
     */
    @JsonIgnore
    public SourceConfiguration configuration() {
        return configuration;
    }

    /**
     * The UUID of the connector definition. One of configuration.sourceType or definitionId must be provided.
     */
    @JsonIgnore
    public Optional<String> definitionId() {
        return definitionId;
    }

    /**
     * Name of the source e.g. dev-mysql-instance.
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * Optional secretID obtained through the  OAuth redirect flow.
     */
    @JsonIgnore
    public Optional<String> secretId() {
        return secretId;
    }

    @JsonIgnore
    public String workspaceId() {
        return workspaceId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The values required to configure the source.
     */
    public SourceCreateRequest withConfiguration(SourceConfiguration configuration) {
        Utils.checkNotNull(configuration, "configuration");
        this.configuration = configuration;
        return this;
    }

    /**
     * The UUID of the connector definition. One of configuration.sourceType or definitionId must be provided.
     */
    public SourceCreateRequest withDefinitionId(String definitionId) {
        Utils.checkNotNull(definitionId, "definitionId");
        this.definitionId = Optional.ofNullable(definitionId);
        return this;
    }

    /**
     * The UUID of the connector definition. One of configuration.sourceType or definitionId must be provided.
     */
    public SourceCreateRequest withDefinitionId(Optional<String> definitionId) {
        Utils.checkNotNull(definitionId, "definitionId");
        this.definitionId = definitionId;
        return this;
    }

    /**
     * Name of the source e.g. dev-mysql-instance.
     */
    public SourceCreateRequest withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Optional secretID obtained through the  OAuth redirect flow.
     */
    public SourceCreateRequest withSecretId(String secretId) {
        Utils.checkNotNull(secretId, "secretId");
        this.secretId = Optional.ofNullable(secretId);
        return this;
    }

    /**
     * Optional secretID obtained through the  OAuth redirect flow.
     */
    public SourceCreateRequest withSecretId(Optional<String> secretId) {
        Utils.checkNotNull(secretId, "secretId");
        this.secretId = secretId;
        return this;
    }

    public SourceCreateRequest withWorkspaceId(String workspaceId) {
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
        SourceCreateRequest other = (SourceCreateRequest) o;
        return 
            Objects.deepEquals(this.configuration, other.configuration) &&
            Objects.deepEquals(this.definitionId, other.definitionId) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.secretId, other.secretId) &&
            Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            configuration,
            definitionId,
            name,
            secretId,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceCreateRequest.class,
                "configuration", configuration,
                "definitionId", definitionId,
                "name", name,
                "secretId", secretId,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private SourceConfiguration configuration;
 
        private Optional<String> definitionId = Optional.empty();
 
        private String name;
 
        private Optional<String> secretId = Optional.empty();
 
        private String workspaceId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The values required to configure the source.
         */
        public Builder configuration(SourceConfiguration configuration) {
            Utils.checkNotNull(configuration, "configuration");
            this.configuration = configuration;
            return this;
        }

        /**
         * The UUID of the connector definition. One of configuration.sourceType or definitionId must be provided.
         */
        public Builder definitionId(String definitionId) {
            Utils.checkNotNull(definitionId, "definitionId");
            this.definitionId = Optional.ofNullable(definitionId);
            return this;
        }

        /**
         * The UUID of the connector definition. One of configuration.sourceType or definitionId must be provided.
         */
        public Builder definitionId(Optional<String> definitionId) {
            Utils.checkNotNull(definitionId, "definitionId");
            this.definitionId = definitionId;
            return this;
        }

        /**
         * Name of the source e.g. dev-mysql-instance.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Optional secretID obtained through the  OAuth redirect flow.
         */
        public Builder secretId(String secretId) {
            Utils.checkNotNull(secretId, "secretId");
            this.secretId = Optional.ofNullable(secretId);
            return this;
        }

        /**
         * Optional secretID obtained through the  OAuth redirect flow.
         */
        public Builder secretId(Optional<String> secretId) {
            Utils.checkNotNull(secretId, "secretId");
            this.secretId = secretId;
            return this;
        }

        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }
        
        public SourceCreateRequest build() {
            return new SourceCreateRequest(
                configuration,
                definitionId,
                name,
                secretId,
                workspaceId);
        }
    }
}


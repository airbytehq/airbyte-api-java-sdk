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


public class SourceMode {

    /**
     * API secret to use as the password for Basic Authentication.
     */
    @JsonProperty("api_secret")
    private String apiSecret;

    /**
     * API token to use as the username for Basic Authentication.
     */
    @JsonProperty("api_token")
    private String apiToken;

    @JsonProperty("sourceType")
    private Mode sourceType;

    @JsonProperty("workspace")
    private String workspace;

    @JsonCreator
    public SourceMode(
            @JsonProperty("api_secret") String apiSecret,
            @JsonProperty("api_token") String apiToken,
            @JsonProperty("workspace") String workspace) {
        Utils.checkNotNull(apiSecret, "apiSecret");
        Utils.checkNotNull(apiToken, "apiToken");
        Utils.checkNotNull(workspace, "workspace");
        this.apiSecret = apiSecret;
        this.apiToken = apiToken;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.workspace = workspace;
    }

    /**
     * API secret to use as the password for Basic Authentication.
     */
    @JsonIgnore
    public String apiSecret() {
        return apiSecret;
    }

    /**
     * API token to use as the username for Basic Authentication.
     */
    @JsonIgnore
    public String apiToken() {
        return apiToken;
    }

    @JsonIgnore
    public Mode sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public String workspace() {
        return workspace;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API secret to use as the password for Basic Authentication.
     */
    public SourceMode withApiSecret(String apiSecret) {
        Utils.checkNotNull(apiSecret, "apiSecret");
        this.apiSecret = apiSecret;
        return this;
    }

    /**
     * API token to use as the username for Basic Authentication.
     */
    public SourceMode withApiToken(String apiToken) {
        Utils.checkNotNull(apiToken, "apiToken");
        this.apiToken = apiToken;
        return this;
    }

    public SourceMode withWorkspace(String workspace) {
        Utils.checkNotNull(workspace, "workspace");
        this.workspace = workspace;
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
        SourceMode other = (SourceMode) o;
        return 
            Objects.deepEquals(this.apiSecret, other.apiSecret) &&
            Objects.deepEquals(this.apiToken, other.apiToken) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.workspace, other.workspace);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiSecret,
            apiToken,
            sourceType,
            workspace);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMode.class,
                "apiSecret", apiSecret,
                "apiToken", apiToken,
                "sourceType", sourceType,
                "workspace", workspace);
    }
    
    public final static class Builder {
 
        private String apiSecret;
 
        private String apiToken;
 
        private String workspace;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API secret to use as the password for Basic Authentication.
         */
        public Builder apiSecret(String apiSecret) {
            Utils.checkNotNull(apiSecret, "apiSecret");
            this.apiSecret = apiSecret;
            return this;
        }

        /**
         * API token to use as the username for Basic Authentication.
         */
        public Builder apiToken(String apiToken) {
            Utils.checkNotNull(apiToken, "apiToken");
            this.apiToken = apiToken;
            return this;
        }

        public Builder workspace(String workspace) {
            Utils.checkNotNull(workspace, "workspace");
            this.workspace = workspace;
            return this;
        }
        
        public SourceMode build() {
            return new SourceMode(
                apiSecret,
                apiToken,
                workspace);
        }

        private static final LazySingletonValue<Mode> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"mode\"",
                        new TypeReference<Mode>() {});
    }
}


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


public class SourceConvex {

    /**
     * API access key used to retrieve data from Convex.
     */
    @JsonProperty("access_key")
    private String accessKey;

    @JsonProperty("deployment_url")
    private String deploymentUrl;

    @JsonProperty("sourceType")
    private SourceConvexConvex sourceType;

    @JsonCreator
    public SourceConvex(
            @JsonProperty("access_key") String accessKey,
            @JsonProperty("deployment_url") String deploymentUrl) {
        Utils.checkNotNull(accessKey, "accessKey");
        Utils.checkNotNull(deploymentUrl, "deploymentUrl");
        this.accessKey = accessKey;
        this.deploymentUrl = deploymentUrl;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * API access key used to retrieve data from Convex.
     */
    @JsonIgnore
    public String accessKey() {
        return accessKey;
    }

    @JsonIgnore
    public String deploymentUrl() {
        return deploymentUrl;
    }

    @JsonIgnore
    public SourceConvexConvex sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API access key used to retrieve data from Convex.
     */
    public SourceConvex withAccessKey(String accessKey) {
        Utils.checkNotNull(accessKey, "accessKey");
        this.accessKey = accessKey;
        return this;
    }

    public SourceConvex withDeploymentUrl(String deploymentUrl) {
        Utils.checkNotNull(deploymentUrl, "deploymentUrl");
        this.deploymentUrl = deploymentUrl;
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
        SourceConvex other = (SourceConvex) o;
        return 
            Objects.deepEquals(this.accessKey, other.accessKey) &&
            Objects.deepEquals(this.deploymentUrl, other.deploymentUrl) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accessKey,
            deploymentUrl,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceConvex.class,
                "accessKey", accessKey,
                "deploymentUrl", deploymentUrl,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String accessKey;
 
        private String deploymentUrl;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API access key used to retrieve data from Convex.
         */
        public Builder accessKey(String accessKey) {
            Utils.checkNotNull(accessKey, "accessKey");
            this.accessKey = accessKey;
            return this;
        }

        public Builder deploymentUrl(String deploymentUrl) {
            Utils.checkNotNull(deploymentUrl, "deploymentUrl");
            this.deploymentUrl = deploymentUrl;
            return this;
        }
        
        public SourceConvex build() {
            return new SourceConvex(
                accessKey,
                deploymentUrl);
        }

        private static final LazySingletonValue<SourceConvexConvex> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"convex\"",
                        new TypeReference<SourceConvexConvex>() {});
    }
}


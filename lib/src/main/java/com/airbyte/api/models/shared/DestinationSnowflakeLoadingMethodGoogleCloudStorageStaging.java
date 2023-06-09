/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationSnowflakeLoadingMethodGoogleCloudStorageStaging - Recommended for large production workloads for better speed and scalability.
 */

public class DestinationSnowflakeLoadingMethodGoogleCloudStorageStaging {
    /**
     * Enter the &lt;a href="https://cloud.google.com/storage/docs/creating-buckets"&gt;Cloud Storage bucket name&lt;/a&gt;
     */
    @JsonProperty("bucket_name")
    public String bucketName;

    public DestinationSnowflakeLoadingMethodGoogleCloudStorageStaging withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    
    /**
     * Enter your &lt;a href="https://cloud.google.com/iam/docs/creating-managing-service-account-keys#creating_service_account_keys"&gt;Google Cloud service account key&lt;/a&gt; in the JSON format with read/write access to your Cloud Storage staging bucket
     */
    @JsonProperty("credentials_json")
    public String credentialsJson;

    public DestinationSnowflakeLoadingMethodGoogleCloudStorageStaging withCredentialsJson(String credentialsJson) {
        this.credentialsJson = credentialsJson;
        return this;
    }
    
    @JsonProperty("method")
    public DestinationSnowflakeLoadingMethodGoogleCloudStorageStagingMethod method;

    public DestinationSnowflakeLoadingMethodGoogleCloudStorageStaging withMethod(DestinationSnowflakeLoadingMethodGoogleCloudStorageStagingMethod method) {
        this.method = method;
        return this;
    }
    
    /**
     * Enter the &lt;a href="https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects"&gt;Google Cloud project ID&lt;/a&gt;
     */
    @JsonProperty("project_id")
    public String projectId;

    public DestinationSnowflakeLoadingMethodGoogleCloudStorageStaging withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    
    public DestinationSnowflakeLoadingMethodGoogleCloudStorageStaging(@JsonProperty("bucket_name") String bucketName, @JsonProperty("credentials_json") String credentialsJson, @JsonProperty("method") DestinationSnowflakeLoadingMethodGoogleCloudStorageStagingMethod method, @JsonProperty("project_id") String projectId) {
        this.bucketName = bucketName;
        this.credentialsJson = credentialsJson;
        this.method = method;
        this.projectId = projectId;
  }
}

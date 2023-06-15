# DestinationSnowflakeLoadingMethodGoogleCloudStorageStaging

Recommended for large production workloads for better speed and scalability.


## Fields

| Field                                                                                                                                                                                                                                           | Type                                                                                                                                                                                                                                            | Required                                                                                                                                                                                                                                        | Description                                                                                                                                                                                                                                     | Example                                                                                                                                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `bucketName`                                                                                                                                                                                                                                    | *String*                                                                                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                                                                                              | Enter the <a href="https://cloud.google.com/storage/docs/creating-buckets">Cloud Storage bucket name</a>                                                                                                                                        | airbyte-staging                                                                                                                                                                                                                                 |
| `credentialsJson`                                                                                                                                                                                                                               | *String*                                                                                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                                                                                              | Enter your <a href="https://cloud.google.com/iam/docs/creating-managing-service-account-keys#creating_service_account_keys">Google Cloud service account key</a> in the JSON format with read/write access to your Cloud Storage staging bucket |                                                                                                                                                                                                                                                 |
| `method`                                                                                                                                                                                                                                        | [DestinationSnowflakeLoadingMethodGoogleCloudStorageStagingMethod](../../models/shared/DestinationSnowflakeLoadingMethodGoogleCloudStorageStagingMethod.md)                                                                                     | :heavy_check_mark:                                                                                                                                                                                                                              | N/A                                                                                                                                                                                                                                             |                                                                                                                                                                                                                                                 |
| `projectId`                                                                                                                                                                                                                                     | *String*                                                                                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                                                                                              | Enter the <a href="https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects">Google Cloud project ID</a>                                                                                                  | my-project                                                                                                                                                                                                                                      |
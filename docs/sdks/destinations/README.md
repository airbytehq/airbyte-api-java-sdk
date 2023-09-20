# Destinations

### Available Operations

* [createDestination](#createdestination) - Create a destination
* [deleteDestination](#deletedestination) - Delete a Destination
* [getDestination](#getdestination) - Get Destination details
* [listDestinations](#listdestinations) - List destinations
* [patchDestination](#patchdestination) - Update a Destination
* [putDestination](#putdestination) - Update a Destination and fully overwrite it

## createDestination

Creates a destination given a name, workspace id, and a json blob containing the configuration for the source.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateDestinationResponse;
import com.airbyte.api.models.shared.DestinationAwsDatalake;
import com.airbyte.api.models.shared.DestinationAwsDatalakeAwsDatalake;
import com.airbyte.api.models.shared.DestinationAwsDatalakeChooseHowToPartitionData;
import com.airbyte.api.models.shared.DestinationAwsDatalakeCredentialsIAMRole;
import com.airbyte.api.models.shared.DestinationAwsDatalakeCredentialsIAMRoleCredentialsTitle;
import com.airbyte.api.models.shared.DestinationAwsDatalakeCredentialsIAMUser;
import com.airbyte.api.models.shared.DestinationAwsDatalakeCredentialsIAMUserCredentialsTitle;
import com.airbyte.api.models.shared.DestinationAwsDatalakeS3BucketRegion;
import com.airbyte.api.models.shared.DestinationAzureBlobStorage;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageAzureBlobStorage;
import com.airbyte.api.models.shared.DestinationBigquery;
import com.airbyte.api.models.shared.DestinationBigqueryBigquery;
import com.airbyte.api.models.shared.DestinationBigqueryDatasetLocation;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalized;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedBigqueryDenormalized;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedDatasetLocation;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedGCSStaging;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedGCSStagingGCSTmpFilesAfterwardProcessing;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedGCSStagingMethod;
import com.airbyte.api.models.shared.DestinationBigqueryTransformationQueryRunType;
import com.airbyte.api.models.shared.DestinationClickhouse;
import com.airbyte.api.models.shared.DestinationClickhouseClickhouse;
import com.airbyte.api.models.shared.DestinationConvex;
import com.airbyte.api.models.shared.DestinationConvexConvex;
import com.airbyte.api.models.shared.DestinationCreateRequest;
import com.airbyte.api.models.shared.DestinationCumulio;
import com.airbyte.api.models.shared.DestinationCumulioCumulio;
import com.airbyte.api.models.shared.DestinationDatabend;
import com.airbyte.api.models.shared.DestinationDatabendDatabend;
import com.airbyte.api.models.shared.DestinationDatabricks;
import com.airbyte.api.models.shared.DestinationDatabricksDatabricks;
import com.airbyte.api.models.shared.DestinationDevNull;
import com.airbyte.api.models.shared.DestinationDevNullDevNull;
import com.airbyte.api.models.shared.DestinationDynamodb;
import com.airbyte.api.models.shared.DestinationDynamodbDynamoDBRegion;
import com.airbyte.api.models.shared.DestinationDynamodbDynamodb;
import com.airbyte.api.models.shared.DestinationElasticsearch;
import com.airbyte.api.models.shared.DestinationElasticsearchElasticsearch;
import com.airbyte.api.models.shared.DestinationFirebolt;
import com.airbyte.api.models.shared.DestinationFireboltFirebolt;
import com.airbyte.api.models.shared.DestinationFirestore;
import com.airbyte.api.models.shared.DestinationFirestoreFirestore;
import com.airbyte.api.models.shared.DestinationGCSGCSBucketRegion;
import com.airbyte.api.models.shared.DestinationGcs;
import com.airbyte.api.models.shared.DestinationGcsGcs;
import com.airbyte.api.models.shared.DestinationGoogleSheets;
import com.airbyte.api.models.shared.DestinationGoogleSheetsAuthenticationViaGoogleOAuth;
import com.airbyte.api.models.shared.DestinationGoogleSheetsGoogleSheets;
import com.airbyte.api.models.shared.DestinationKeen;
import com.airbyte.api.models.shared.DestinationKeenKeen;
import com.airbyte.api.models.shared.DestinationKinesis;
import com.airbyte.api.models.shared.DestinationKinesisKinesis;
import com.airbyte.api.models.shared.DestinationLangchain;
import com.airbyte.api.models.shared.DestinationLangchainEmbeddingFake;
import com.airbyte.api.models.shared.DestinationLangchainEmbeddingFakeMode;
import com.airbyte.api.models.shared.DestinationLangchainEmbeddingOpenAI;
import com.airbyte.api.models.shared.DestinationLangchainEmbeddingOpenAIMode;
import com.airbyte.api.models.shared.DestinationLangchainIndexingChromaLocalPersistance;
import com.airbyte.api.models.shared.DestinationLangchainIndexingChromaLocalPersistanceMode;
import com.airbyte.api.models.shared.DestinationLangchainIndexingDocArrayHnswSearch;
import com.airbyte.api.models.shared.DestinationLangchainIndexingDocArrayHnswSearchMode;
import com.airbyte.api.models.shared.DestinationLangchainIndexingPinecone;
import com.airbyte.api.models.shared.DestinationLangchainIndexingPineconeMode;
import com.airbyte.api.models.shared.DestinationLangchainLangchain;
import com.airbyte.api.models.shared.DestinationLangchainProcessingConfigModel;
import com.airbyte.api.models.shared.DestinationMilvus;
import com.airbyte.api.models.shared.DestinationMilvusEmbeddingCohere;
import com.airbyte.api.models.shared.DestinationMilvusEmbeddingCohereMode;
import com.airbyte.api.models.shared.DestinationMilvusEmbeddingFake;
import com.airbyte.api.models.shared.DestinationMilvusEmbeddingFakeMode;
import com.airbyte.api.models.shared.DestinationMilvusEmbeddingFromField;
import com.airbyte.api.models.shared.DestinationMilvusEmbeddingFromFieldMode;
import com.airbyte.api.models.shared.DestinationMilvusEmbeddingOpenAI;
import com.airbyte.api.models.shared.DestinationMilvusEmbeddingOpenAIMode;
import com.airbyte.api.models.shared.DestinationMilvusIndexing;
import com.airbyte.api.models.shared.DestinationMilvusIndexingAuthAPIToken;
import com.airbyte.api.models.shared.DestinationMilvusIndexingAuthAPITokenMode;
import com.airbyte.api.models.shared.DestinationMilvusIndexingAuthNoAuth;
import com.airbyte.api.models.shared.DestinationMilvusIndexingAuthNoAuthMode;
import com.airbyte.api.models.shared.DestinationMilvusIndexingAuthUsernamePassword;
import com.airbyte.api.models.shared.DestinationMilvusIndexingAuthUsernamePasswordMode;
import com.airbyte.api.models.shared.DestinationMilvusMilvus;
import com.airbyte.api.models.shared.DestinationMilvusProcessingConfigModel;
import com.airbyte.api.models.shared.DestinationMongodb;
import com.airbyte.api.models.shared.DestinationMongodbAuthTypeLoginPassword;
import com.airbyte.api.models.shared.DestinationMongodbAuthTypeLoginPasswordAuthorization;
import com.airbyte.api.models.shared.DestinationMongodbAuthTypeNone;
import com.airbyte.api.models.shared.DestinationMongodbAuthTypeNoneAuthorization;
import com.airbyte.api.models.shared.DestinationMongodbMongodb;
import com.airbyte.api.models.shared.DestinationMssql;
import com.airbyte.api.models.shared.DestinationMssqlMssql;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedTrustServerCertificate;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedTrustServerCertificateSslMethod;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedVerifyCertificate;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedVerifyCertificateSslMethod;
import com.airbyte.api.models.shared.DestinationMysql;
import com.airbyte.api.models.shared.DestinationMysqlMysql;
import com.airbyte.api.models.shared.DestinationOracle;
import com.airbyte.api.models.shared.DestinationOracleOracle;
import com.airbyte.api.models.shared.DestinationPinecone;
import com.airbyte.api.models.shared.DestinationPineconeEmbeddingCohere;
import com.airbyte.api.models.shared.DestinationPineconeEmbeddingCohereMode;
import com.airbyte.api.models.shared.DestinationPineconeEmbeddingFake;
import com.airbyte.api.models.shared.DestinationPineconeEmbeddingFakeMode;
import com.airbyte.api.models.shared.DestinationPineconeEmbeddingOpenAI;
import com.airbyte.api.models.shared.DestinationPineconeEmbeddingOpenAIMode;
import com.airbyte.api.models.shared.DestinationPineconeIndexing;
import com.airbyte.api.models.shared.DestinationPineconePinecone;
import com.airbyte.api.models.shared.DestinationPineconeProcessingConfigModel;
import com.airbyte.api.models.shared.DestinationPostgres;
import com.airbyte.api.models.shared.DestinationPostgresPostgres;
import com.airbyte.api.models.shared.DestinationPubsub;
import com.airbyte.api.models.shared.DestinationPubsubPubsub;
import com.airbyte.api.models.shared.DestinationRedis;
import com.airbyte.api.models.shared.DestinationRedisCacheType;
import com.airbyte.api.models.shared.DestinationRedisRedis;
import com.airbyte.api.models.shared.DestinationRedshift;
import com.airbyte.api.models.shared.DestinationRedshiftRedshift;
import com.airbyte.api.models.shared.DestinationS3;
import com.airbyte.api.models.shared.DestinationS3Glue;
import com.airbyte.api.models.shared.DestinationS3GlueS3BucketRegion;
import com.airbyte.api.models.shared.DestinationS3GlueS3Glue;
import com.airbyte.api.models.shared.DestinationS3GlueSerializationLibrary;
import com.airbyte.api.models.shared.DestinationS3S3;
import com.airbyte.api.models.shared.DestinationS3S3BucketRegion;
import com.airbyte.api.models.shared.DestinationSftpJson;
import com.airbyte.api.models.shared.DestinationSftpJsonSftpJson;
import com.airbyte.api.models.shared.DestinationSnowflake;
import com.airbyte.api.models.shared.DestinationSnowflakeCredentialsKeyPairAuthentication;
import com.airbyte.api.models.shared.DestinationSnowflakeCredentialsKeyPairAuthenticationAuthType;
import com.airbyte.api.models.shared.DestinationSnowflakeCredentialsOAuth20;
import com.airbyte.api.models.shared.DestinationSnowflakeCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.DestinationSnowflakeCredentialsUsernameAndPassword;
import com.airbyte.api.models.shared.DestinationSnowflakeCredentialsUsernameAndPasswordAuthType;
import com.airbyte.api.models.shared.DestinationSnowflakeSnowflake;
import com.airbyte.api.models.shared.DestinationTimeplus;
import com.airbyte.api.models.shared.DestinationTimeplusTimeplus;
import com.airbyte.api.models.shared.DestinationTypesense;
import com.airbyte.api.models.shared.DestinationTypesenseTypesense;
import com.airbyte.api.models.shared.DestinationVertica;
import com.airbyte.api.models.shared.DestinationVerticaVertica;
import com.airbyte.api.models.shared.DestinationXata;
import com.airbyte.api.models.shared.DestinationXataXata;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security() {{
                    basicAuth = new SchemeBasicAuth("quidem", "provident") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            com.airbyte.api.models.shared.DestinationCreateRequest req = new DestinationCreateRequest(                new DestinationPubsub("nisi", DestinationPubsubPubsub.PUBSUB, "vel", "natus") {{
                                batchingDelayThreshold = 659669L;
                                batchingElementCountThreshold = 501324L;
                                batchingEnabled = false;
                                batchingRequestBytesThreshold = 533206L;
                                credentialsJson = "sapiente";
                                destinationType = DestinationPubsubPubsub.PUBSUB;
                                orderingEnabled = false;
                                projectId = "amet";
                                topicId = "deserunt";
                            }}, "omnis", "7074ba44-69b6-4e21-8195-9890afa563e2");            

            CreateDestinationResponse res = sdk.destinations.createDestination(req);

            if (res.destinationResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [com.airbyte.api.models.shared.DestinationCreateRequest](../../models/shared/DestinationCreateRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[com.airbyte.api.models.operations.CreateDestinationResponse](../../models/operations/CreateDestinationResponse.md)**


## deleteDestination

Delete a Destination

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.DeleteDestinationRequest;
import com.airbyte.api.models.operations.DeleteDestinationResponse;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security() {{
                    basicAuth = new SchemeBasicAuth("nemo", "quasi") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            DeleteDestinationRequest req = new DeleteDestinationRequest("iure");            

            DeleteDestinationResponse res = sdk.destinations.deleteDestination(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [com.airbyte.api.models.operations.DeleteDestinationRequest](../../models/operations/DeleteDestinationRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[com.airbyte.api.models.operations.DeleteDestinationResponse](../../models/operations/DeleteDestinationResponse.md)**


## getDestination

Get Destination details

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.GetDestinationRequest;
import com.airbyte.api.models.operations.GetDestinationResponse;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security() {{
                    basicAuth = new SchemeBasicAuth("doloribus", "debitis") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            GetDestinationRequest req = new GetDestinationRequest("eius");            

            GetDestinationResponse res = sdk.destinations.getDestination(req);

            if (res.destinationResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [com.airbyte.api.models.operations.GetDestinationRequest](../../models/operations/GetDestinationRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[com.airbyte.api.models.operations.GetDestinationResponse](../../models/operations/GetDestinationResponse.md)**


## listDestinations

List destinations

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.ListDestinationsRequest;
import com.airbyte.api.models.operations.ListDestinationsResponse;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security() {{
                    basicAuth = new SchemeBasicAuth("maxime", "deleniti") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            ListDestinationsRequest req = new ListDestinationsRequest() {{
                includeDeleted = false;
                limit = 703889;
                offset = 447926;
                workspaceIds = new String[]{{
                    add("11e5b7fd-2ed0-4289-a1cd-dc692601fb57"),
                }};
            }};            

            ListDestinationsResponse res = sdk.destinations.listDestinations(req);

            if (res.destinationsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [com.airbyte.api.models.operations.ListDestinationsRequest](../../models/operations/ListDestinationsRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[com.airbyte.api.models.operations.ListDestinationsResponse](../../models/operations/ListDestinationsResponse.md)**


## patchDestination

Update a Destination

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.PatchDestinationRequest;
import com.airbyte.api.models.operations.PatchDestinationResponse;
import com.airbyte.api.models.shared.DestinationAwsDatalake;
import com.airbyte.api.models.shared.DestinationAwsDatalakeAwsDatalake;
import com.airbyte.api.models.shared.DestinationAwsDatalakeChooseHowToPartitionData;
import com.airbyte.api.models.shared.DestinationAwsDatalakeCredentialsIAMRole;
import com.airbyte.api.models.shared.DestinationAwsDatalakeCredentialsIAMRoleCredentialsTitle;
import com.airbyte.api.models.shared.DestinationAwsDatalakeCredentialsIAMUser;
import com.airbyte.api.models.shared.DestinationAwsDatalakeCredentialsIAMUserCredentialsTitle;
import com.airbyte.api.models.shared.DestinationAwsDatalakeS3BucketRegion;
import com.airbyte.api.models.shared.DestinationAzureBlobStorage;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageAzureBlobStorage;
import com.airbyte.api.models.shared.DestinationBigquery;
import com.airbyte.api.models.shared.DestinationBigqueryBigquery;
import com.airbyte.api.models.shared.DestinationBigqueryDatasetLocation;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalized;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedBigqueryDenormalized;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedDatasetLocation;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedGCSStaging;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedGCSStagingGCSTmpFilesAfterwardProcessing;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedGCSStagingMethod;
import com.airbyte.api.models.shared.DestinationBigqueryTransformationQueryRunType;
import com.airbyte.api.models.shared.DestinationClickhouse;
import com.airbyte.api.models.shared.DestinationClickhouseClickhouse;
import com.airbyte.api.models.shared.DestinationConvex;
import com.airbyte.api.models.shared.DestinationConvexConvex;
import com.airbyte.api.models.shared.DestinationCumulio;
import com.airbyte.api.models.shared.DestinationCumulioCumulio;
import com.airbyte.api.models.shared.DestinationDatabend;
import com.airbyte.api.models.shared.DestinationDatabendDatabend;
import com.airbyte.api.models.shared.DestinationDatabricks;
import com.airbyte.api.models.shared.DestinationDatabricksDatabricks;
import com.airbyte.api.models.shared.DestinationDevNull;
import com.airbyte.api.models.shared.DestinationDevNullDevNull;
import com.airbyte.api.models.shared.DestinationDynamodb;
import com.airbyte.api.models.shared.DestinationDynamodbDynamoDBRegion;
import com.airbyte.api.models.shared.DestinationDynamodbDynamodb;
import com.airbyte.api.models.shared.DestinationElasticsearch;
import com.airbyte.api.models.shared.DestinationElasticsearchElasticsearch;
import com.airbyte.api.models.shared.DestinationFirebolt;
import com.airbyte.api.models.shared.DestinationFireboltFirebolt;
import com.airbyte.api.models.shared.DestinationFirestore;
import com.airbyte.api.models.shared.DestinationFirestoreFirestore;
import com.airbyte.api.models.shared.DestinationGCSGCSBucketRegion;
import com.airbyte.api.models.shared.DestinationGcs;
import com.airbyte.api.models.shared.DestinationGcsGcs;
import com.airbyte.api.models.shared.DestinationGoogleSheets;
import com.airbyte.api.models.shared.DestinationGoogleSheetsAuthenticationViaGoogleOAuth;
import com.airbyte.api.models.shared.DestinationGoogleSheetsGoogleSheets;
import com.airbyte.api.models.shared.DestinationKeen;
import com.airbyte.api.models.shared.DestinationKeenKeen;
import com.airbyte.api.models.shared.DestinationKinesis;
import com.airbyte.api.models.shared.DestinationKinesisKinesis;
import com.airbyte.api.models.shared.DestinationLangchain;
import com.airbyte.api.models.shared.DestinationLangchainEmbeddingFake;
import com.airbyte.api.models.shared.DestinationLangchainEmbeddingFakeMode;
import com.airbyte.api.models.shared.DestinationLangchainEmbeddingOpenAI;
import com.airbyte.api.models.shared.DestinationLangchainEmbeddingOpenAIMode;
import com.airbyte.api.models.shared.DestinationLangchainIndexingChromaLocalPersistance;
import com.airbyte.api.models.shared.DestinationLangchainIndexingChromaLocalPersistanceMode;
import com.airbyte.api.models.shared.DestinationLangchainIndexingDocArrayHnswSearch;
import com.airbyte.api.models.shared.DestinationLangchainIndexingDocArrayHnswSearchMode;
import com.airbyte.api.models.shared.DestinationLangchainIndexingPinecone;
import com.airbyte.api.models.shared.DestinationLangchainIndexingPineconeMode;
import com.airbyte.api.models.shared.DestinationLangchainLangchain;
import com.airbyte.api.models.shared.DestinationLangchainProcessingConfigModel;
import com.airbyte.api.models.shared.DestinationMilvus;
import com.airbyte.api.models.shared.DestinationMilvusEmbeddingCohere;
import com.airbyte.api.models.shared.DestinationMilvusEmbeddingCohereMode;
import com.airbyte.api.models.shared.DestinationMilvusEmbeddingFake;
import com.airbyte.api.models.shared.DestinationMilvusEmbeddingFakeMode;
import com.airbyte.api.models.shared.DestinationMilvusEmbeddingFromField;
import com.airbyte.api.models.shared.DestinationMilvusEmbeddingFromFieldMode;
import com.airbyte.api.models.shared.DestinationMilvusEmbeddingOpenAI;
import com.airbyte.api.models.shared.DestinationMilvusEmbeddingOpenAIMode;
import com.airbyte.api.models.shared.DestinationMilvusIndexing;
import com.airbyte.api.models.shared.DestinationMilvusIndexingAuthAPIToken;
import com.airbyte.api.models.shared.DestinationMilvusIndexingAuthAPITokenMode;
import com.airbyte.api.models.shared.DestinationMilvusIndexingAuthNoAuth;
import com.airbyte.api.models.shared.DestinationMilvusIndexingAuthNoAuthMode;
import com.airbyte.api.models.shared.DestinationMilvusIndexingAuthUsernamePassword;
import com.airbyte.api.models.shared.DestinationMilvusIndexingAuthUsernamePasswordMode;
import com.airbyte.api.models.shared.DestinationMilvusMilvus;
import com.airbyte.api.models.shared.DestinationMilvusProcessingConfigModel;
import com.airbyte.api.models.shared.DestinationMongodb;
import com.airbyte.api.models.shared.DestinationMongodbAuthTypeLoginPassword;
import com.airbyte.api.models.shared.DestinationMongodbAuthTypeLoginPasswordAuthorization;
import com.airbyte.api.models.shared.DestinationMongodbAuthTypeNone;
import com.airbyte.api.models.shared.DestinationMongodbAuthTypeNoneAuthorization;
import com.airbyte.api.models.shared.DestinationMongodbMongodb;
import com.airbyte.api.models.shared.DestinationMssql;
import com.airbyte.api.models.shared.DestinationMssqlMssql;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedTrustServerCertificate;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedTrustServerCertificateSslMethod;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedVerifyCertificate;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedVerifyCertificateSslMethod;
import com.airbyte.api.models.shared.DestinationMysql;
import com.airbyte.api.models.shared.DestinationMysqlMysql;
import com.airbyte.api.models.shared.DestinationOracle;
import com.airbyte.api.models.shared.DestinationOracleOracle;
import com.airbyte.api.models.shared.DestinationPatchRequest;
import com.airbyte.api.models.shared.DestinationPinecone;
import com.airbyte.api.models.shared.DestinationPineconeEmbeddingCohere;
import com.airbyte.api.models.shared.DestinationPineconeEmbeddingCohereMode;
import com.airbyte.api.models.shared.DestinationPineconeEmbeddingFake;
import com.airbyte.api.models.shared.DestinationPineconeEmbeddingFakeMode;
import com.airbyte.api.models.shared.DestinationPineconeEmbeddingOpenAI;
import com.airbyte.api.models.shared.DestinationPineconeEmbeddingOpenAIMode;
import com.airbyte.api.models.shared.DestinationPineconeIndexing;
import com.airbyte.api.models.shared.DestinationPineconePinecone;
import com.airbyte.api.models.shared.DestinationPineconeProcessingConfigModel;
import com.airbyte.api.models.shared.DestinationPostgres;
import com.airbyte.api.models.shared.DestinationPostgresPostgres;
import com.airbyte.api.models.shared.DestinationPubsub;
import com.airbyte.api.models.shared.DestinationPubsubPubsub;
import com.airbyte.api.models.shared.DestinationRedis;
import com.airbyte.api.models.shared.DestinationRedisCacheType;
import com.airbyte.api.models.shared.DestinationRedisRedis;
import com.airbyte.api.models.shared.DestinationRedshift;
import com.airbyte.api.models.shared.DestinationRedshiftRedshift;
import com.airbyte.api.models.shared.DestinationS3;
import com.airbyte.api.models.shared.DestinationS3Glue;
import com.airbyte.api.models.shared.DestinationS3GlueS3BucketRegion;
import com.airbyte.api.models.shared.DestinationS3GlueS3Glue;
import com.airbyte.api.models.shared.DestinationS3GlueSerializationLibrary;
import com.airbyte.api.models.shared.DestinationS3S3;
import com.airbyte.api.models.shared.DestinationS3S3BucketRegion;
import com.airbyte.api.models.shared.DestinationSftpJson;
import com.airbyte.api.models.shared.DestinationSftpJsonSftpJson;
import com.airbyte.api.models.shared.DestinationSnowflake;
import com.airbyte.api.models.shared.DestinationSnowflakeCredentialsKeyPairAuthentication;
import com.airbyte.api.models.shared.DestinationSnowflakeCredentialsKeyPairAuthenticationAuthType;
import com.airbyte.api.models.shared.DestinationSnowflakeCredentialsOAuth20;
import com.airbyte.api.models.shared.DestinationSnowflakeCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.DestinationSnowflakeCredentialsUsernameAndPassword;
import com.airbyte.api.models.shared.DestinationSnowflakeCredentialsUsernameAndPasswordAuthType;
import com.airbyte.api.models.shared.DestinationSnowflakeSnowflake;
import com.airbyte.api.models.shared.DestinationTimeplus;
import com.airbyte.api.models.shared.DestinationTimeplusTimeplus;
import com.airbyte.api.models.shared.DestinationTypesense;
import com.airbyte.api.models.shared.DestinationTypesenseTypesense;
import com.airbyte.api.models.shared.DestinationVertica;
import com.airbyte.api.models.shared.DestinationVerticaVertica;
import com.airbyte.api.models.shared.DestinationXata;
import com.airbyte.api.models.shared.DestinationXataXata;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security() {{
                    basicAuth = new SchemeBasicAuth("autem", "nam") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            PatchDestinationRequest req = new PatchDestinationRequest("eaque") {{
                destinationPatchRequest = new DestinationPatchRequest() {{
                    configuration = new DestinationSnowflake("AIRBYTE_DATABASE", DestinationSnowflakeSnowflake.SNOWFLAKE, "accountname.us-east-2.aws.snowflakecomputing.com", "AIRBYTE_ROLE", "AIRBYTE_SCHEMA", "AIRBYTE_USER", "AIRBYTE_WAREHOUSE") {{
                        credentials = new DestinationSnowflakeCredentialsUsernameAndPassword("perferendis") {{
                            authType = DestinationSnowflakeCredentialsUsernameAndPasswordAuthType.USERNAME_AND_PASSWORD;
                        }};;
                        jdbcUrlParams = "fugiat";
                        rawDataSchema = "amet";
                    }};;
                    name = "Erma Hessel";
                }};;
            }};            

            PatchDestinationResponse res = sdk.destinations.patchDestination(req);

            if (res.destinationResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [com.airbyte.api.models.operations.PatchDestinationRequest](../../models/operations/PatchDestinationRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[com.airbyte.api.models.operations.PatchDestinationResponse](../../models/operations/PatchDestinationResponse.md)**


## putDestination

Update a Destination and fully overwrite it

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.PutDestinationRequest;
import com.airbyte.api.models.operations.PutDestinationResponse;
import com.airbyte.api.models.shared.DestinationAwsDatalake;
import com.airbyte.api.models.shared.DestinationAwsDatalakeAwsDatalake;
import com.airbyte.api.models.shared.DestinationAwsDatalakeChooseHowToPartitionData;
import com.airbyte.api.models.shared.DestinationAwsDatalakeCredentialsIAMRole;
import com.airbyte.api.models.shared.DestinationAwsDatalakeCredentialsIAMRoleCredentialsTitle;
import com.airbyte.api.models.shared.DestinationAwsDatalakeCredentialsIAMUser;
import com.airbyte.api.models.shared.DestinationAwsDatalakeCredentialsIAMUserCredentialsTitle;
import com.airbyte.api.models.shared.DestinationAwsDatalakeS3BucketRegion;
import com.airbyte.api.models.shared.DestinationAzureBlobStorage;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageAzureBlobStorage;
import com.airbyte.api.models.shared.DestinationBigquery;
import com.airbyte.api.models.shared.DestinationBigqueryBigquery;
import com.airbyte.api.models.shared.DestinationBigqueryDatasetLocation;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalized;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedBigqueryDenormalized;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedDatasetLocation;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedGCSStaging;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedGCSStagingGCSTmpFilesAfterwardProcessing;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedGCSStagingMethod;
import com.airbyte.api.models.shared.DestinationBigqueryTransformationQueryRunType;
import com.airbyte.api.models.shared.DestinationClickhouse;
import com.airbyte.api.models.shared.DestinationClickhouseClickhouse;
import com.airbyte.api.models.shared.DestinationConvex;
import com.airbyte.api.models.shared.DestinationConvexConvex;
import com.airbyte.api.models.shared.DestinationCumulio;
import com.airbyte.api.models.shared.DestinationCumulioCumulio;
import com.airbyte.api.models.shared.DestinationDatabend;
import com.airbyte.api.models.shared.DestinationDatabendDatabend;
import com.airbyte.api.models.shared.DestinationDatabricks;
import com.airbyte.api.models.shared.DestinationDatabricksDatabricks;
import com.airbyte.api.models.shared.DestinationDevNull;
import com.airbyte.api.models.shared.DestinationDevNullDevNull;
import com.airbyte.api.models.shared.DestinationDynamodb;
import com.airbyte.api.models.shared.DestinationDynamodbDynamoDBRegion;
import com.airbyte.api.models.shared.DestinationDynamodbDynamodb;
import com.airbyte.api.models.shared.DestinationElasticsearch;
import com.airbyte.api.models.shared.DestinationElasticsearchElasticsearch;
import com.airbyte.api.models.shared.DestinationFirebolt;
import com.airbyte.api.models.shared.DestinationFireboltFirebolt;
import com.airbyte.api.models.shared.DestinationFirestore;
import com.airbyte.api.models.shared.DestinationFirestoreFirestore;
import com.airbyte.api.models.shared.DestinationGCSGCSBucketRegion;
import com.airbyte.api.models.shared.DestinationGcs;
import com.airbyte.api.models.shared.DestinationGcsGcs;
import com.airbyte.api.models.shared.DestinationGoogleSheets;
import com.airbyte.api.models.shared.DestinationGoogleSheetsAuthenticationViaGoogleOAuth;
import com.airbyte.api.models.shared.DestinationGoogleSheetsGoogleSheets;
import com.airbyte.api.models.shared.DestinationKeen;
import com.airbyte.api.models.shared.DestinationKeenKeen;
import com.airbyte.api.models.shared.DestinationKinesis;
import com.airbyte.api.models.shared.DestinationKinesisKinesis;
import com.airbyte.api.models.shared.DestinationLangchain;
import com.airbyte.api.models.shared.DestinationLangchainEmbeddingFake;
import com.airbyte.api.models.shared.DestinationLangchainEmbeddingFakeMode;
import com.airbyte.api.models.shared.DestinationLangchainEmbeddingOpenAI;
import com.airbyte.api.models.shared.DestinationLangchainEmbeddingOpenAIMode;
import com.airbyte.api.models.shared.DestinationLangchainIndexingChromaLocalPersistance;
import com.airbyte.api.models.shared.DestinationLangchainIndexingChromaLocalPersistanceMode;
import com.airbyte.api.models.shared.DestinationLangchainIndexingDocArrayHnswSearch;
import com.airbyte.api.models.shared.DestinationLangchainIndexingDocArrayHnswSearchMode;
import com.airbyte.api.models.shared.DestinationLangchainIndexingPinecone;
import com.airbyte.api.models.shared.DestinationLangchainIndexingPineconeMode;
import com.airbyte.api.models.shared.DestinationLangchainLangchain;
import com.airbyte.api.models.shared.DestinationLangchainProcessingConfigModel;
import com.airbyte.api.models.shared.DestinationMilvus;
import com.airbyte.api.models.shared.DestinationMilvusEmbeddingCohere;
import com.airbyte.api.models.shared.DestinationMilvusEmbeddingCohereMode;
import com.airbyte.api.models.shared.DestinationMilvusEmbeddingFake;
import com.airbyte.api.models.shared.DestinationMilvusEmbeddingFakeMode;
import com.airbyte.api.models.shared.DestinationMilvusEmbeddingFromField;
import com.airbyte.api.models.shared.DestinationMilvusEmbeddingFromFieldMode;
import com.airbyte.api.models.shared.DestinationMilvusEmbeddingOpenAI;
import com.airbyte.api.models.shared.DestinationMilvusEmbeddingOpenAIMode;
import com.airbyte.api.models.shared.DestinationMilvusIndexing;
import com.airbyte.api.models.shared.DestinationMilvusIndexingAuthAPIToken;
import com.airbyte.api.models.shared.DestinationMilvusIndexingAuthAPITokenMode;
import com.airbyte.api.models.shared.DestinationMilvusIndexingAuthNoAuth;
import com.airbyte.api.models.shared.DestinationMilvusIndexingAuthNoAuthMode;
import com.airbyte.api.models.shared.DestinationMilvusIndexingAuthUsernamePassword;
import com.airbyte.api.models.shared.DestinationMilvusIndexingAuthUsernamePasswordMode;
import com.airbyte.api.models.shared.DestinationMilvusMilvus;
import com.airbyte.api.models.shared.DestinationMilvusProcessingConfigModel;
import com.airbyte.api.models.shared.DestinationMongodb;
import com.airbyte.api.models.shared.DestinationMongodbAuthTypeLoginPassword;
import com.airbyte.api.models.shared.DestinationMongodbAuthTypeLoginPasswordAuthorization;
import com.airbyte.api.models.shared.DestinationMongodbAuthTypeNone;
import com.airbyte.api.models.shared.DestinationMongodbAuthTypeNoneAuthorization;
import com.airbyte.api.models.shared.DestinationMongodbMongodb;
import com.airbyte.api.models.shared.DestinationMssql;
import com.airbyte.api.models.shared.DestinationMssqlMssql;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedTrustServerCertificate;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedTrustServerCertificateSslMethod;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedVerifyCertificate;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedVerifyCertificateSslMethod;
import com.airbyte.api.models.shared.DestinationMysql;
import com.airbyte.api.models.shared.DestinationMysqlMysql;
import com.airbyte.api.models.shared.DestinationOracle;
import com.airbyte.api.models.shared.DestinationOracleOracle;
import com.airbyte.api.models.shared.DestinationPinecone;
import com.airbyte.api.models.shared.DestinationPineconeEmbeddingCohere;
import com.airbyte.api.models.shared.DestinationPineconeEmbeddingCohereMode;
import com.airbyte.api.models.shared.DestinationPineconeEmbeddingFake;
import com.airbyte.api.models.shared.DestinationPineconeEmbeddingFakeMode;
import com.airbyte.api.models.shared.DestinationPineconeEmbeddingOpenAI;
import com.airbyte.api.models.shared.DestinationPineconeEmbeddingOpenAIMode;
import com.airbyte.api.models.shared.DestinationPineconeIndexing;
import com.airbyte.api.models.shared.DestinationPineconePinecone;
import com.airbyte.api.models.shared.DestinationPineconeProcessingConfigModel;
import com.airbyte.api.models.shared.DestinationPostgres;
import com.airbyte.api.models.shared.DestinationPostgresPostgres;
import com.airbyte.api.models.shared.DestinationPubsub;
import com.airbyte.api.models.shared.DestinationPubsubPubsub;
import com.airbyte.api.models.shared.DestinationPutRequest;
import com.airbyte.api.models.shared.DestinationRedis;
import com.airbyte.api.models.shared.DestinationRedisCacheType;
import com.airbyte.api.models.shared.DestinationRedisRedis;
import com.airbyte.api.models.shared.DestinationRedshift;
import com.airbyte.api.models.shared.DestinationRedshiftRedshift;
import com.airbyte.api.models.shared.DestinationS3;
import com.airbyte.api.models.shared.DestinationS3Glue;
import com.airbyte.api.models.shared.DestinationS3GlueS3BucketRegion;
import com.airbyte.api.models.shared.DestinationS3GlueS3Glue;
import com.airbyte.api.models.shared.DestinationS3GlueSerializationLibrary;
import com.airbyte.api.models.shared.DestinationS3S3;
import com.airbyte.api.models.shared.DestinationS3S3BucketRegion;
import com.airbyte.api.models.shared.DestinationSftpJson;
import com.airbyte.api.models.shared.DestinationSftpJsonSftpJson;
import com.airbyte.api.models.shared.DestinationSnowflake;
import com.airbyte.api.models.shared.DestinationSnowflakeCredentialsKeyPairAuthentication;
import com.airbyte.api.models.shared.DestinationSnowflakeCredentialsKeyPairAuthenticationAuthType;
import com.airbyte.api.models.shared.DestinationSnowflakeCredentialsOAuth20;
import com.airbyte.api.models.shared.DestinationSnowflakeCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.DestinationSnowflakeCredentialsUsernameAndPassword;
import com.airbyte.api.models.shared.DestinationSnowflakeCredentialsUsernameAndPasswordAuthType;
import com.airbyte.api.models.shared.DestinationSnowflakeSnowflake;
import com.airbyte.api.models.shared.DestinationTimeplus;
import com.airbyte.api.models.shared.DestinationTimeplusTimeplus;
import com.airbyte.api.models.shared.DestinationTypesense;
import com.airbyte.api.models.shared.DestinationTypesenseTypesense;
import com.airbyte.api.models.shared.DestinationVertica;
import com.airbyte.api.models.shared.DestinationVerticaVertica;
import com.airbyte.api.models.shared.DestinationXata;
import com.airbyte.api.models.shared.DestinationXataXata;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security() {{
                    basicAuth = new SchemeBasicAuth("nobis", "dolores") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            PutDestinationRequest req = new PutDestinationRequest("quis") {{
                destinationPutRequest = new DestinationPutRequest(                new DestinationMilvus(DestinationMilvusMilvus.MILVUS,                 new DestinationMilvusEmbeddingFromField(384L, "vector") {{
                                                    dimensions = 1536L;
                                                    fieldName = "vector";
                                                    mode = DestinationMilvusEmbeddingFromFieldMode.FROM_FIELD;
                                                }},                 new DestinationMilvusIndexing(                new DestinationMilvusIndexingAuthNoAuth() {{
                                                                    mode = DestinationMilvusIndexingAuthNoAuthMode.NO_AUTH;
                                                                }}, "provident", "tcp://my-local-milvus:19530") {{
                                                    db = "libero";
                                                    textField = "delectus";
                                                    vectorField = "quaerat";
                                                }};,                 new DestinationMilvusProcessingConfigModel(554242L) {{
                                                    chunkOverlap = 398221L;
                                                    metadataFields = new String[]{{
                                                        add("dolorem"),
                                                    }};
                                                    textFields = new String[]{{
                                                        add("dolorem"),
                                                    }};
                                                }};) {{
                                    destinationType = DestinationMilvusMilvus.MILVUS;
                                    embedding = new DestinationMilvusEmbeddingCohere("quis") {{
                                        cohereKey = "eaque";
                                        mode = DestinationMilvusEmbeddingCohereMode.COHERE;
                                    }};
                                    indexing = new DestinationMilvusIndexing(                new DestinationMilvusIndexingAuthUsernamePassword("porro", "consequuntur") {{
                                                        mode = DestinationMilvusIndexingAuthUsernamePasswordMode.USERNAME_PASSWORD;
                                                        password = "hic";
                                                        username = "Timothy_Mohr3";
                                                    }}, "blanditiis", "tcp://host.docker.internal:19530") {{
                                        auth = new DestinationMilvusIndexingAuthAPIToken("perferendis") {{
                                            mode = DestinationMilvusIndexingAuthAPITokenMode.TOKEN;
                                            token = "eos";
                                        }};
                                        collection = "dolores";
                                        db = "minus";
                                        host = "tcp://host.docker.internal:19530";
                                        textField = "dolor";
                                        vectorField = "vero";
                                    }};
                                    processing = new DestinationMilvusProcessingConfigModel(992397L) {{
                                        chunkOverlap = 50370L;
                                        chunkSize = 577229L;
                                        metadataFields = new String[]{{
                                            add("rerum"),
                                        }};
                                        textFields = new String[]{{
                                            add("adipisci"),
                                        }};
                                    }};
                                }}, "dolor");;
            }};            

            PutDestinationResponse res = sdk.destinations.putDestination(req);

            if (res.destinationResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [com.airbyte.api.models.operations.PutDestinationRequest](../../models/operations/PutDestinationRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[com.airbyte.api.models.operations.PutDestinationResponse](../../models/operations/PutDestinationResponse.md)**


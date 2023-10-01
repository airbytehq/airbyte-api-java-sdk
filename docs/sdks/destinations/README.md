# Destinations
(*destinations*)

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
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatJSONLinesNewlineDelimitedJSONCompressionCodecOptional;
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatJSONLinesNewlineDelimitedJSONFormatTypeWildcard;
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatParquetColumnarStorage;
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatParquetColumnarStorageCompressionCodecOptional;
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatParquetColumnarStorageFormatTypeWildcard;
import com.airbyte.api.models.shared.DestinationAwsDatalakeS3BucketRegion;
import com.airbyte.api.models.shared.DestinationAzureBlobStorage;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageAzureBlobStorage;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageFormatCSVCommaSeparatedValues;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesFormatType;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesNormalizationFlattening;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageFormatJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageFormatJSONLinesNewlineDelimitedJSONFormatType;
import com.airbyte.api.models.shared.DestinationBigquery;
import com.airbyte.api.models.shared.DestinationBigqueryBigquery;
import com.airbyte.api.models.shared.DestinationBigqueryDatasetLocation;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalized;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedBigqueryDenormalized;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedDatasetLocation;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodGCSStaging;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodGCSStagingCredentialHMACKey;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodGCSStagingCredentialHMACKeyCredentialType;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodGCSStagingGCSTmpFilesAfterwardProcessing;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodGCSStagingMethod;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodStandardInserts;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodStandardInsertsMethod;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodGCSStaging;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodGCSStagingCredentialHMACKey;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodGCSStagingCredentialHMACKeyCredentialType;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodGCSStagingGCSTmpFilesAfterwardProcessing;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodGCSStagingMethod;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodStandardInserts;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodStandardInsertsMethod;
import com.airbyte.api.models.shared.DestinationBigqueryTransformationQueryRunType;
import com.airbyte.api.models.shared.DestinationClickhouse;
import com.airbyte.api.models.shared.DestinationClickhouseClickhouse;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationConvex;
import com.airbyte.api.models.shared.DestinationConvexConvex;
import com.airbyte.api.models.shared.DestinationCreateRequest;
import com.airbyte.api.models.shared.DestinationCumulio;
import com.airbyte.api.models.shared.DestinationCumulioCumulio;
import com.airbyte.api.models.shared.DestinationDatabend;
import com.airbyte.api.models.shared.DestinationDatabendDatabend;
import com.airbyte.api.models.shared.DestinationDatabricks;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceAmazonS3;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceAmazonS3DataSourceType;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceAmazonS3S3BucketRegion;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceAzureBlobStorage;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceAzureBlobStorageDataSourceType;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceRecommendedManagedTables;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceRecommendedManagedTablesDataSourceType;
import com.airbyte.api.models.shared.DestinationDatabricksDatabricks;
import com.airbyte.api.models.shared.DestinationDevNull;
import com.airbyte.api.models.shared.DestinationDevNullDevNull;
import com.airbyte.api.models.shared.DestinationDevNullTestDestinationSilent;
import com.airbyte.api.models.shared.DestinationDevNullTestDestinationSilentTestDestinationType;
import com.airbyte.api.models.shared.DestinationDynamodb;
import com.airbyte.api.models.shared.DestinationDynamodbDynamoDBRegion;
import com.airbyte.api.models.shared.DestinationDynamodbDynamodb;
import com.airbyte.api.models.shared.DestinationElasticsearch;
import com.airbyte.api.models.shared.DestinationElasticsearchAuthenticationMethodApiKeySecret;
import com.airbyte.api.models.shared.DestinationElasticsearchAuthenticationMethodApiKeySecretMethod;
import com.airbyte.api.models.shared.DestinationElasticsearchAuthenticationMethodUsernamePassword;
import com.airbyte.api.models.shared.DestinationElasticsearchAuthenticationMethodUsernamePasswordMethod;
import com.airbyte.api.models.shared.DestinationElasticsearchElasticsearch;
import com.airbyte.api.models.shared.DestinationFirebolt;
import com.airbyte.api.models.shared.DestinationFireboltFirebolt;
import com.airbyte.api.models.shared.DestinationFireboltLoadingMethodExternalTableViaS3;
import com.airbyte.api.models.shared.DestinationFireboltLoadingMethodExternalTableViaS3Method;
import com.airbyte.api.models.shared.DestinationFireboltLoadingMethodSQLInserts;
import com.airbyte.api.models.shared.DestinationFireboltLoadingMethodSQLInsertsMethod;
import com.airbyte.api.models.shared.DestinationFirestore;
import com.airbyte.api.models.shared.DestinationFirestoreFirestore;
import com.airbyte.api.models.shared.DestinationGCSGCSBucketRegion;
import com.airbyte.api.models.shared.DestinationGcs;
import com.airbyte.api.models.shared.DestinationGcsCredentialHMACKey;
import com.airbyte.api.models.shared.DestinationGcsCredentialHMACKeyCredentialType;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvro;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecBzip2;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecBzip2Codec;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecDeflate;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecDeflateCodec;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecNoCompression;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecNoCompressionCodec;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecSnappy;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecSnappyCodec;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecXz;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecXzCodec;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecZstandard;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecZstandardCodec;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroFormatType;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValues;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValuesCompressionGZIP;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValuesCompressionGZIPCompressionType;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValuesCompressionNoCompression;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValuesCompressionNoCompressionCompressionType;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValuesFormatType;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValuesNormalization;
import com.airbyte.api.models.shared.DestinationGcsFormatJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionGZIP;
import com.airbyte.api.models.shared.DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionGZIPCompressionType;
import com.airbyte.api.models.shared.DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionNoCompression;
import com.airbyte.api.models.shared.DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionNoCompressionCompressionType;
import com.airbyte.api.models.shared.DestinationGcsFormatJSONLinesNewlineDelimitedJSONFormatType;
import com.airbyte.api.models.shared.DestinationGcsFormatParquetColumnarStorage;
import com.airbyte.api.models.shared.DestinationGcsFormatParquetColumnarStorageCompressionCodec;
import com.airbyte.api.models.shared.DestinationGcsFormatParquetColumnarStorageFormatType;
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
import com.airbyte.api.models.shared.DestinationMongodbInstanceTypeMongoDBAtlas;
import com.airbyte.api.models.shared.DestinationMongodbInstanceTypeMongoDBAtlasInstance;
import com.airbyte.api.models.shared.DestinationMongodbInstanceTypeReplicaSet;
import com.airbyte.api.models.shared.DestinationMongodbInstanceTypeReplicaSetInstance;
import com.airbyte.api.models.shared.DestinationMongodbInstanceTypeStandaloneMongoDbInstance;
import com.airbyte.api.models.shared.DestinationMongodbInstanceTypeStandaloneMongoDbInstanceInstance;
import com.airbyte.api.models.shared.DestinationMongodbMongodb;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationMssql;
import com.airbyte.api.models.shared.DestinationMssqlMssql;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedTrustServerCertificate;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedTrustServerCertificateSslMethod;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedVerifyCertificate;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedVerifyCertificateSslMethod;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationMysql;
import com.airbyte.api.models.shared.DestinationMysqlMysql;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationOracle;
import com.airbyte.api.models.shared.DestinationOracleOracle;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethodSSHKeyAuthenticationTunnelMethod;
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
import com.airbyte.api.models.shared.DestinationPostgresSslModeAllow;
import com.airbyte.api.models.shared.DestinationPostgresSslModeAllowMode;
import com.airbyte.api.models.shared.DestinationPostgresSslModeDisable;
import com.airbyte.api.models.shared.DestinationPostgresSslModeDisableMode;
import com.airbyte.api.models.shared.DestinationPostgresSslModePrefer;
import com.airbyte.api.models.shared.DestinationPostgresSslModePreferMode;
import com.airbyte.api.models.shared.DestinationPostgresSslModeRequire;
import com.airbyte.api.models.shared.DestinationPostgresSslModeRequireMode;
import com.airbyte.api.models.shared.DestinationPostgresSslModeVerifyCa;
import com.airbyte.api.models.shared.DestinationPostgresSslModeVerifyCaMode;
import com.airbyte.api.models.shared.DestinationPostgresSslModeVerifyFull;
import com.airbyte.api.models.shared.DestinationPostgresSslModeVerifyFullMode;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationPubsub;
import com.airbyte.api.models.shared.DestinationPubsubPubsub;
import com.airbyte.api.models.shared.DestinationRedis;
import com.airbyte.api.models.shared.DestinationRedisCacheType;
import com.airbyte.api.models.shared.DestinationRedisRedis;
import com.airbyte.api.models.shared.DestinationRedisSslModeDisable;
import com.airbyte.api.models.shared.DestinationRedisSslModeDisableMode;
import com.airbyte.api.models.shared.DestinationRedisSslModeVerifyFull;
import com.airbyte.api.models.shared.DestinationRedisSslModeVerifyFullMode;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedshift;
import com.airbyte.api.models.shared.DestinationRedshiftRedshift;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3Staging;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3StagingEncryptionAESCBCEnvelopeEncryption;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3StagingEncryptionAESCBCEnvelopeEncryptionEncryptionType;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3StagingEncryptionNoEncryption;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3StagingEncryptionNoEncryptionEncryptionType;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3StagingMethod;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3StagingS3BucketRegion;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodStandard;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodStandardMethod;
import com.airbyte.api.models.shared.DestinationS3;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvro;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecBzip2;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecBzip2Codec;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecDeflate;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecDeflateCodec;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecNoCompression;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecNoCompressionCodec;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecSnappy;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecSnappyCodec;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecXz;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecXzCodec;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecZstandard;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecZstandardCodec;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroFormatType;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValues;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValuesCompressionGZIP;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValuesCompressionGZIPCompressionType;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValuesCompressionNoCompression;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValuesCompressionNoCompressionCompressionType;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValuesFlattening;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValuesFormatType;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSONCompressionGZIP;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSONCompressionGZIPCompressionType;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSONCompressionNoCompression;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSONCompressionNoCompressionCompressionType;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSONFlattening;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSONFormatType;
import com.airbyte.api.models.shared.DestinationS3FormatParquetColumnarStorage;
import com.airbyte.api.models.shared.DestinationS3FormatParquetColumnarStorageCompressionCodec;
import com.airbyte.api.models.shared.DestinationS3FormatParquetColumnarStorageFormatType;
import com.airbyte.api.models.shared.DestinationS3Glue;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONCompressionGZIP;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONCompressionGZIPCompressionType;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONCompressionNoCompression;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONCompressionNoCompressionCompressionType;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONFlattening;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONFormatType;
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
import com.airbyte.api.models.shared.DestinationVerticaTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationVerticaTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationVerticaTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationVerticaTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationVerticaTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationVerticaTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationVerticaVertica;
import com.airbyte.api.models.shared.DestinationXata;
import com.airbyte.api.models.shared.DestinationXataXata;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security() {{
                    basicAuth = new SchemeBasicAuth("override", "Dollar") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            com.airbyte.api.models.shared.DestinationCreateRequest req = new DestinationCreateRequest(                new DestinationGoogleSheets(                new DestinationGoogleSheetsAuthenticationViaGoogleOAuth("Concrete", "Cisgender", "serial");, DestinationGoogleSheetsGoogleSheets.GOOGLE_SHEETS, "https://docs.google.com/spreadsheets/d/1hLd9Qqti3UyLXZB2aFfUWDT7BG/edit") {{
                                credentials = new DestinationGoogleSheetsAuthenticationViaGoogleOAuth("Reactive", "Brand", "wearily") {{
                                    clientId = "Assistant";
                                    clientSecret = "Loan";
                                    refreshToken = "Account Chilean capacitor";
                                }};
                                destinationType = DestinationGoogleSheetsGoogleSheets.GOOGLE_SHEETS;
                                spreadsheetId = "https://docs.google.com/spreadsheets/d/1hLd9Qqti3UyLXZB2aFfUWDT7BG/edit";
                            }}, "University", "ef565b03-0c73-4d4d-bc9a-ec3c930d228b");            

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
                    basicAuth = new SchemeBasicAuth("virtual", "Plastic") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            DeleteDestinationRequest req = new DeleteDestinationRequest("male");            

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
                    basicAuth = new SchemeBasicAuth("alarm", "Brakus") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            GetDestinationRequest req = new GetDestinationRequest("Bike ubiquitous");            

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
                    basicAuth = new SchemeBasicAuth("Bicycle", "up") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            ListDestinationsRequest req = new ListDestinationsRequest() {{
                includeDeleted = false;
                limit = 566557;
                offset = 673433;
                workspaceIds = new String[]{{
                    add("83172024-45cd-426f-b445-5227f2f090ad"),
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
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatJSONLinesNewlineDelimitedJSONCompressionCodecOptional;
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatJSONLinesNewlineDelimitedJSONFormatTypeWildcard;
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatParquetColumnarStorage;
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatParquetColumnarStorageCompressionCodecOptional;
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatParquetColumnarStorageFormatTypeWildcard;
import com.airbyte.api.models.shared.DestinationAwsDatalakeS3BucketRegion;
import com.airbyte.api.models.shared.DestinationAzureBlobStorage;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageAzureBlobStorage;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageFormatCSVCommaSeparatedValues;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesFormatType;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesNormalizationFlattening;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageFormatJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageFormatJSONLinesNewlineDelimitedJSONFormatType;
import com.airbyte.api.models.shared.DestinationBigquery;
import com.airbyte.api.models.shared.DestinationBigqueryBigquery;
import com.airbyte.api.models.shared.DestinationBigqueryDatasetLocation;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalized;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedBigqueryDenormalized;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedDatasetLocation;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodGCSStaging;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodGCSStagingCredentialHMACKey;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodGCSStagingCredentialHMACKeyCredentialType;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodGCSStagingGCSTmpFilesAfterwardProcessing;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodGCSStagingMethod;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodStandardInserts;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodStandardInsertsMethod;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodGCSStaging;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodGCSStagingCredentialHMACKey;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodGCSStagingCredentialHMACKeyCredentialType;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodGCSStagingGCSTmpFilesAfterwardProcessing;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodGCSStagingMethod;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodStandardInserts;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodStandardInsertsMethod;
import com.airbyte.api.models.shared.DestinationBigqueryTransformationQueryRunType;
import com.airbyte.api.models.shared.DestinationClickhouse;
import com.airbyte.api.models.shared.DestinationClickhouseClickhouse;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationConvex;
import com.airbyte.api.models.shared.DestinationConvexConvex;
import com.airbyte.api.models.shared.DestinationCumulio;
import com.airbyte.api.models.shared.DestinationCumulioCumulio;
import com.airbyte.api.models.shared.DestinationDatabend;
import com.airbyte.api.models.shared.DestinationDatabendDatabend;
import com.airbyte.api.models.shared.DestinationDatabricks;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceAmazonS3;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceAmazonS3DataSourceType;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceAmazonS3S3BucketRegion;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceAzureBlobStorage;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceAzureBlobStorageDataSourceType;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceRecommendedManagedTables;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceRecommendedManagedTablesDataSourceType;
import com.airbyte.api.models.shared.DestinationDatabricksDatabricks;
import com.airbyte.api.models.shared.DestinationDevNull;
import com.airbyte.api.models.shared.DestinationDevNullDevNull;
import com.airbyte.api.models.shared.DestinationDevNullTestDestinationSilent;
import com.airbyte.api.models.shared.DestinationDevNullTestDestinationSilentTestDestinationType;
import com.airbyte.api.models.shared.DestinationDynamodb;
import com.airbyte.api.models.shared.DestinationDynamodbDynamoDBRegion;
import com.airbyte.api.models.shared.DestinationDynamodbDynamodb;
import com.airbyte.api.models.shared.DestinationElasticsearch;
import com.airbyte.api.models.shared.DestinationElasticsearchAuthenticationMethodApiKeySecret;
import com.airbyte.api.models.shared.DestinationElasticsearchAuthenticationMethodApiKeySecretMethod;
import com.airbyte.api.models.shared.DestinationElasticsearchAuthenticationMethodUsernamePassword;
import com.airbyte.api.models.shared.DestinationElasticsearchAuthenticationMethodUsernamePasswordMethod;
import com.airbyte.api.models.shared.DestinationElasticsearchElasticsearch;
import com.airbyte.api.models.shared.DestinationFirebolt;
import com.airbyte.api.models.shared.DestinationFireboltFirebolt;
import com.airbyte.api.models.shared.DestinationFireboltLoadingMethodExternalTableViaS3;
import com.airbyte.api.models.shared.DestinationFireboltLoadingMethodExternalTableViaS3Method;
import com.airbyte.api.models.shared.DestinationFireboltLoadingMethodSQLInserts;
import com.airbyte.api.models.shared.DestinationFireboltLoadingMethodSQLInsertsMethod;
import com.airbyte.api.models.shared.DestinationFirestore;
import com.airbyte.api.models.shared.DestinationFirestoreFirestore;
import com.airbyte.api.models.shared.DestinationGCSGCSBucketRegion;
import com.airbyte.api.models.shared.DestinationGcs;
import com.airbyte.api.models.shared.DestinationGcsCredentialHMACKey;
import com.airbyte.api.models.shared.DestinationGcsCredentialHMACKeyCredentialType;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvro;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecBzip2;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecBzip2Codec;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecDeflate;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecDeflateCodec;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecNoCompression;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecNoCompressionCodec;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecSnappy;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecSnappyCodec;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecXz;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecXzCodec;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecZstandard;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecZstandardCodec;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroFormatType;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValues;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValuesCompressionGZIP;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValuesCompressionGZIPCompressionType;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValuesCompressionNoCompression;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValuesCompressionNoCompressionCompressionType;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValuesFormatType;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValuesNormalization;
import com.airbyte.api.models.shared.DestinationGcsFormatJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionGZIP;
import com.airbyte.api.models.shared.DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionGZIPCompressionType;
import com.airbyte.api.models.shared.DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionNoCompression;
import com.airbyte.api.models.shared.DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionNoCompressionCompressionType;
import com.airbyte.api.models.shared.DestinationGcsFormatJSONLinesNewlineDelimitedJSONFormatType;
import com.airbyte.api.models.shared.DestinationGcsFormatParquetColumnarStorage;
import com.airbyte.api.models.shared.DestinationGcsFormatParquetColumnarStorageCompressionCodec;
import com.airbyte.api.models.shared.DestinationGcsFormatParquetColumnarStorageFormatType;
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
import com.airbyte.api.models.shared.DestinationMongodbInstanceTypeMongoDBAtlas;
import com.airbyte.api.models.shared.DestinationMongodbInstanceTypeMongoDBAtlasInstance;
import com.airbyte.api.models.shared.DestinationMongodbInstanceTypeReplicaSet;
import com.airbyte.api.models.shared.DestinationMongodbInstanceTypeReplicaSetInstance;
import com.airbyte.api.models.shared.DestinationMongodbInstanceTypeStandaloneMongoDbInstance;
import com.airbyte.api.models.shared.DestinationMongodbInstanceTypeStandaloneMongoDbInstanceInstance;
import com.airbyte.api.models.shared.DestinationMongodbMongodb;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationMssql;
import com.airbyte.api.models.shared.DestinationMssqlMssql;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedTrustServerCertificate;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedTrustServerCertificateSslMethod;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedVerifyCertificate;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedVerifyCertificateSslMethod;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationMysql;
import com.airbyte.api.models.shared.DestinationMysqlMysql;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationOracle;
import com.airbyte.api.models.shared.DestinationOracleOracle;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethodSSHKeyAuthenticationTunnelMethod;
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
import com.airbyte.api.models.shared.DestinationPostgresSslModeAllow;
import com.airbyte.api.models.shared.DestinationPostgresSslModeAllowMode;
import com.airbyte.api.models.shared.DestinationPostgresSslModeDisable;
import com.airbyte.api.models.shared.DestinationPostgresSslModeDisableMode;
import com.airbyte.api.models.shared.DestinationPostgresSslModePrefer;
import com.airbyte.api.models.shared.DestinationPostgresSslModePreferMode;
import com.airbyte.api.models.shared.DestinationPostgresSslModeRequire;
import com.airbyte.api.models.shared.DestinationPostgresSslModeRequireMode;
import com.airbyte.api.models.shared.DestinationPostgresSslModeVerifyCa;
import com.airbyte.api.models.shared.DestinationPostgresSslModeVerifyCaMode;
import com.airbyte.api.models.shared.DestinationPostgresSslModeVerifyFull;
import com.airbyte.api.models.shared.DestinationPostgresSslModeVerifyFullMode;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationPubsub;
import com.airbyte.api.models.shared.DestinationPubsubPubsub;
import com.airbyte.api.models.shared.DestinationRedis;
import com.airbyte.api.models.shared.DestinationRedisCacheType;
import com.airbyte.api.models.shared.DestinationRedisRedis;
import com.airbyte.api.models.shared.DestinationRedisSslModeDisable;
import com.airbyte.api.models.shared.DestinationRedisSslModeDisableMode;
import com.airbyte.api.models.shared.DestinationRedisSslModeVerifyFull;
import com.airbyte.api.models.shared.DestinationRedisSslModeVerifyFullMode;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedshift;
import com.airbyte.api.models.shared.DestinationRedshiftRedshift;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3Staging;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3StagingEncryptionAESCBCEnvelopeEncryption;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3StagingEncryptionAESCBCEnvelopeEncryptionEncryptionType;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3StagingEncryptionNoEncryption;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3StagingEncryptionNoEncryptionEncryptionType;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3StagingMethod;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3StagingS3BucketRegion;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodStandard;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodStandardMethod;
import com.airbyte.api.models.shared.DestinationS3;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvro;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecBzip2;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecBzip2Codec;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecDeflate;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecDeflateCodec;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecNoCompression;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecNoCompressionCodec;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecSnappy;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecSnappyCodec;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecXz;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecXzCodec;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecZstandard;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecZstandardCodec;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroFormatType;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValues;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValuesCompressionGZIP;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValuesCompressionGZIPCompressionType;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValuesCompressionNoCompression;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValuesCompressionNoCompressionCompressionType;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValuesFlattening;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValuesFormatType;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSONCompressionGZIP;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSONCompressionGZIPCompressionType;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSONCompressionNoCompression;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSONCompressionNoCompressionCompressionType;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSONFlattening;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSONFormatType;
import com.airbyte.api.models.shared.DestinationS3FormatParquetColumnarStorage;
import com.airbyte.api.models.shared.DestinationS3FormatParquetColumnarStorageCompressionCodec;
import com.airbyte.api.models.shared.DestinationS3FormatParquetColumnarStorageFormatType;
import com.airbyte.api.models.shared.DestinationS3Glue;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONCompressionGZIP;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONCompressionGZIPCompressionType;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONCompressionNoCompression;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONCompressionNoCompressionCompressionType;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONFlattening;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONFormatType;
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
import com.airbyte.api.models.shared.DestinationVerticaTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationVerticaTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationVerticaTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationVerticaTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationVerticaTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationVerticaTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationVerticaVertica;
import com.airbyte.api.models.shared.DestinationXata;
import com.airbyte.api.models.shared.DestinationXataXata;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security() {{
                    basicAuth = new SchemeBasicAuth("Refined", "SUV") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            PatchDestinationRequest req = new PatchDestinationRequest("Verde pixel male") {{
                destinationPatchRequest = new DestinationPatchRequest() {{
                    configuration = new DestinationTimeplus("Principal", DestinationTimeplusTimeplus.TIMEPLUS) {{
                        endpoint = "https://us.timeplus.cloud/workspace_id";
                    }};;
                    name = "morph quantifying Mouse";
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
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatJSONLinesNewlineDelimitedJSONCompressionCodecOptional;
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatJSONLinesNewlineDelimitedJSONFormatTypeWildcard;
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatParquetColumnarStorage;
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatParquetColumnarStorageCompressionCodecOptional;
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatParquetColumnarStorageFormatTypeWildcard;
import com.airbyte.api.models.shared.DestinationAwsDatalakeS3BucketRegion;
import com.airbyte.api.models.shared.DestinationAzureBlobStorage;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageAzureBlobStorage;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageFormatCSVCommaSeparatedValues;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesFormatType;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesNormalizationFlattening;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageFormatJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageFormatJSONLinesNewlineDelimitedJSONFormatType;
import com.airbyte.api.models.shared.DestinationBigquery;
import com.airbyte.api.models.shared.DestinationBigqueryBigquery;
import com.airbyte.api.models.shared.DestinationBigqueryDatasetLocation;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalized;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedBigqueryDenormalized;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedDatasetLocation;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodGCSStaging;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodGCSStagingCredentialHMACKey;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodGCSStagingCredentialHMACKeyCredentialType;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodGCSStagingGCSTmpFilesAfterwardProcessing;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodGCSStagingMethod;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodStandardInserts;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodStandardInsertsMethod;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodGCSStaging;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodGCSStagingCredentialHMACKey;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodGCSStagingCredentialHMACKeyCredentialType;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodGCSStagingGCSTmpFilesAfterwardProcessing;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodGCSStagingMethod;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodStandardInserts;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodStandardInsertsMethod;
import com.airbyte.api.models.shared.DestinationBigqueryTransformationQueryRunType;
import com.airbyte.api.models.shared.DestinationClickhouse;
import com.airbyte.api.models.shared.DestinationClickhouseClickhouse;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationConvex;
import com.airbyte.api.models.shared.DestinationConvexConvex;
import com.airbyte.api.models.shared.DestinationCumulio;
import com.airbyte.api.models.shared.DestinationCumulioCumulio;
import com.airbyte.api.models.shared.DestinationDatabend;
import com.airbyte.api.models.shared.DestinationDatabendDatabend;
import com.airbyte.api.models.shared.DestinationDatabricks;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceAmazonS3;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceAmazonS3DataSourceType;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceAmazonS3S3BucketRegion;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceAzureBlobStorage;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceAzureBlobStorageDataSourceType;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceRecommendedManagedTables;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceRecommendedManagedTablesDataSourceType;
import com.airbyte.api.models.shared.DestinationDatabricksDatabricks;
import com.airbyte.api.models.shared.DestinationDevNull;
import com.airbyte.api.models.shared.DestinationDevNullDevNull;
import com.airbyte.api.models.shared.DestinationDevNullTestDestinationSilent;
import com.airbyte.api.models.shared.DestinationDevNullTestDestinationSilentTestDestinationType;
import com.airbyte.api.models.shared.DestinationDynamodb;
import com.airbyte.api.models.shared.DestinationDynamodbDynamoDBRegion;
import com.airbyte.api.models.shared.DestinationDynamodbDynamodb;
import com.airbyte.api.models.shared.DestinationElasticsearch;
import com.airbyte.api.models.shared.DestinationElasticsearchAuthenticationMethodApiKeySecret;
import com.airbyte.api.models.shared.DestinationElasticsearchAuthenticationMethodApiKeySecretMethod;
import com.airbyte.api.models.shared.DestinationElasticsearchAuthenticationMethodUsernamePassword;
import com.airbyte.api.models.shared.DestinationElasticsearchAuthenticationMethodUsernamePasswordMethod;
import com.airbyte.api.models.shared.DestinationElasticsearchElasticsearch;
import com.airbyte.api.models.shared.DestinationFirebolt;
import com.airbyte.api.models.shared.DestinationFireboltFirebolt;
import com.airbyte.api.models.shared.DestinationFireboltLoadingMethodExternalTableViaS3;
import com.airbyte.api.models.shared.DestinationFireboltLoadingMethodExternalTableViaS3Method;
import com.airbyte.api.models.shared.DestinationFireboltLoadingMethodSQLInserts;
import com.airbyte.api.models.shared.DestinationFireboltLoadingMethodSQLInsertsMethod;
import com.airbyte.api.models.shared.DestinationFirestore;
import com.airbyte.api.models.shared.DestinationFirestoreFirestore;
import com.airbyte.api.models.shared.DestinationGCSGCSBucketRegion;
import com.airbyte.api.models.shared.DestinationGcs;
import com.airbyte.api.models.shared.DestinationGcsCredentialHMACKey;
import com.airbyte.api.models.shared.DestinationGcsCredentialHMACKeyCredentialType;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvro;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecBzip2;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecBzip2Codec;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecDeflate;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecDeflateCodec;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecNoCompression;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecNoCompressionCodec;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecSnappy;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecSnappyCodec;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecXz;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecXzCodec;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecZstandard;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecZstandardCodec;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroFormatType;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValues;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValuesCompressionGZIP;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValuesCompressionGZIPCompressionType;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValuesCompressionNoCompression;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValuesCompressionNoCompressionCompressionType;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValuesFormatType;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValuesNormalization;
import com.airbyte.api.models.shared.DestinationGcsFormatJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionGZIP;
import com.airbyte.api.models.shared.DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionGZIPCompressionType;
import com.airbyte.api.models.shared.DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionNoCompression;
import com.airbyte.api.models.shared.DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionNoCompressionCompressionType;
import com.airbyte.api.models.shared.DestinationGcsFormatJSONLinesNewlineDelimitedJSONFormatType;
import com.airbyte.api.models.shared.DestinationGcsFormatParquetColumnarStorage;
import com.airbyte.api.models.shared.DestinationGcsFormatParquetColumnarStorageCompressionCodec;
import com.airbyte.api.models.shared.DestinationGcsFormatParquetColumnarStorageFormatType;
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
import com.airbyte.api.models.shared.DestinationMongodbInstanceTypeMongoDBAtlas;
import com.airbyte.api.models.shared.DestinationMongodbInstanceTypeMongoDBAtlasInstance;
import com.airbyte.api.models.shared.DestinationMongodbInstanceTypeReplicaSet;
import com.airbyte.api.models.shared.DestinationMongodbInstanceTypeReplicaSetInstance;
import com.airbyte.api.models.shared.DestinationMongodbInstanceTypeStandaloneMongoDbInstance;
import com.airbyte.api.models.shared.DestinationMongodbInstanceTypeStandaloneMongoDbInstanceInstance;
import com.airbyte.api.models.shared.DestinationMongodbMongodb;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationMssql;
import com.airbyte.api.models.shared.DestinationMssqlMssql;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedTrustServerCertificate;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedTrustServerCertificateSslMethod;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedVerifyCertificate;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedVerifyCertificateSslMethod;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationMysql;
import com.airbyte.api.models.shared.DestinationMysqlMysql;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationOracle;
import com.airbyte.api.models.shared.DestinationOracleOracle;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethodSSHKeyAuthenticationTunnelMethod;
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
import com.airbyte.api.models.shared.DestinationPostgresSslModeAllow;
import com.airbyte.api.models.shared.DestinationPostgresSslModeAllowMode;
import com.airbyte.api.models.shared.DestinationPostgresSslModeDisable;
import com.airbyte.api.models.shared.DestinationPostgresSslModeDisableMode;
import com.airbyte.api.models.shared.DestinationPostgresSslModePrefer;
import com.airbyte.api.models.shared.DestinationPostgresSslModePreferMode;
import com.airbyte.api.models.shared.DestinationPostgresSslModeRequire;
import com.airbyte.api.models.shared.DestinationPostgresSslModeRequireMode;
import com.airbyte.api.models.shared.DestinationPostgresSslModeVerifyCa;
import com.airbyte.api.models.shared.DestinationPostgresSslModeVerifyCaMode;
import com.airbyte.api.models.shared.DestinationPostgresSslModeVerifyFull;
import com.airbyte.api.models.shared.DestinationPostgresSslModeVerifyFullMode;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationPubsub;
import com.airbyte.api.models.shared.DestinationPubsubPubsub;
import com.airbyte.api.models.shared.DestinationPutRequest;
import com.airbyte.api.models.shared.DestinationRedis;
import com.airbyte.api.models.shared.DestinationRedisCacheType;
import com.airbyte.api.models.shared.DestinationRedisRedis;
import com.airbyte.api.models.shared.DestinationRedisSslModeDisable;
import com.airbyte.api.models.shared.DestinationRedisSslModeDisableMode;
import com.airbyte.api.models.shared.DestinationRedisSslModeVerifyFull;
import com.airbyte.api.models.shared.DestinationRedisSslModeVerifyFullMode;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedshift;
import com.airbyte.api.models.shared.DestinationRedshiftRedshift;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3Staging;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3StagingEncryptionAESCBCEnvelopeEncryption;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3StagingEncryptionAESCBCEnvelopeEncryptionEncryptionType;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3StagingEncryptionNoEncryption;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3StagingEncryptionNoEncryptionEncryptionType;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3StagingMethod;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3StagingS3BucketRegion;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodStandard;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodStandardMethod;
import com.airbyte.api.models.shared.DestinationS3;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvro;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecBzip2;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecBzip2Codec;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecDeflate;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecDeflateCodec;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecNoCompression;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecNoCompressionCodec;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecSnappy;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecSnappyCodec;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecXz;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecXzCodec;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecZstandard;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecZstandardCodec;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroFormatType;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValues;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValuesCompressionGZIP;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValuesCompressionGZIPCompressionType;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValuesCompressionNoCompression;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValuesCompressionNoCompressionCompressionType;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValuesFlattening;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValuesFormatType;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSONCompressionGZIP;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSONCompressionGZIPCompressionType;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSONCompressionNoCompression;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSONCompressionNoCompressionCompressionType;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSONFlattening;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSONFormatType;
import com.airbyte.api.models.shared.DestinationS3FormatParquetColumnarStorage;
import com.airbyte.api.models.shared.DestinationS3FormatParquetColumnarStorageCompressionCodec;
import com.airbyte.api.models.shared.DestinationS3FormatParquetColumnarStorageFormatType;
import com.airbyte.api.models.shared.DestinationS3Glue;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONCompressionGZIP;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONCompressionGZIPCompressionType;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONCompressionNoCompression;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONCompressionNoCompressionCompressionType;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONFlattening;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONFormatType;
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
import com.airbyte.api.models.shared.DestinationVerticaTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationVerticaTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.DestinationVerticaTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationVerticaTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationVerticaTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationVerticaTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.DestinationVerticaVertica;
import com.airbyte.api.models.shared.DestinationXata;
import com.airbyte.api.models.shared.DestinationXataXata;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security() {{
                    basicAuth = new SchemeBasicAuth("Heights", "Wagon") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            PutDestinationRequest req = new PutDestinationRequest("navigate female") {{
                destinationPutRequest = new DestinationPutRequest(                new DestinationSnowflake("AIRBYTE_DATABASE", DestinationSnowflakeSnowflake.SNOWFLAKE, "accountname.snowflakecomputing.com", "AIRBYTE_ROLE", "AIRBYTE_SCHEMA", "AIRBYTE_USER", "AIRBYTE_WAREHOUSE") {{
                                    credentials = new DestinationSnowflakeCredentialsUsernameAndPassword("Handcrafted") {{
                                        authType = DestinationSnowflakeCredentialsUsernameAndPasswordAuthType.USERNAME_AND_PASSWORD;
                                        password = "OHIzBYOaVH3d9Uv";
                                    }};
                                    database = "AIRBYTE_DATABASE";
                                    destinationType = DestinationSnowflakeSnowflake.SNOWFLAKE;
                                    host = "accountname.us-east-2.aws.snowflakecomputing.com";
                                    jdbcUrlParams = "Buckinghamshire iterate";
                                    rawDataSchema = "constant global";
                                    role = "AIRBYTE_ROLE";
                                    schema = "AIRBYTE_SCHEMA";
                                    username = "AIRBYTE_USER";
                                    warehouse = "AIRBYTE_WAREHOUSE";
                                }}, "morph");;
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


# destinations

### Available Operations

* [createDestination](#createdestination) - Create a destination
* [deleteDestination](#deletedestination) - Delete a Destination
* [getDestination](#getdestination) - Get Destination details
* [listDestinations](#listdestinations) - List destinations

## createDestination

Creates a destination given a name, workspace id, and a json blob containing the configuration for the source.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateDestinationResponse;
import com.airbyte.api.models.shared.DestinationAmazonSqs;
import com.airbyte.api.models.shared.DestinationAmazonSqsAWSRegionEnum;
import com.airbyte.api.models.shared.DestinationAmazonSqsAmazonSqsEnum;
import com.airbyte.api.models.shared.DestinationAwsDatalake;
import com.airbyte.api.models.shared.DestinationAwsDatalakeAwsDatalakeEnum;
import com.airbyte.api.models.shared.DestinationAwsDatalakeChooseHowToPartitionDataEnum;
import com.airbyte.api.models.shared.DestinationAwsDatalakeCredentialsIAMRole;
import com.airbyte.api.models.shared.DestinationAwsDatalakeCredentialsIAMRoleCredentialsTitleEnum;
import com.airbyte.api.models.shared.DestinationAwsDatalakeCredentialsIAMUser;
import com.airbyte.api.models.shared.DestinationAwsDatalakeCredentialsIAMUserCredentialsTitleEnum;
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatJSONLinesNewlineDelimitedJSONCompressionCodecOptionalEnum;
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatJSONLinesNewlineDelimitedJSONFormatTypeWildcardEnum;
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatParquetColumnarStorage;
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatParquetColumnarStorageCompressionCodecOptionalEnum;
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatParquetColumnarStorageFormatTypeWildcardEnum;
import com.airbyte.api.models.shared.DestinationAwsDatalakeS3BucketRegionEnum;
import com.airbyte.api.models.shared.DestinationAzureBlobStorage;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageAzureBlobStorageEnum;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageFormatCSVCommaSeparatedValues;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesFormatTypeEnum;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesNormalizationFlatteningEnum;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageFormatJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum;
import com.airbyte.api.models.shared.DestinationBigquery;
import com.airbyte.api.models.shared.DestinationBigqueryBigqueryEnum;
import com.airbyte.api.models.shared.DestinationBigqueryDatasetLocationEnum;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalized;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedBigqueryDenormalizedEnum;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedDatasetLocationEnum;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodGCSStaging;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodGCSStagingCredentialHMACKey;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodGCSStagingCredentialHMACKeyCredentialTypeEnum;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodGCSStagingGCSTmpFilesAfterwardProcessingEnum;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodGCSStagingMethodEnum;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodStandardInserts;
import com.airbyte.api.models.shared.DestinationBigqueryDenormalizedLoadingMethodStandardInsertsMethodEnum;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodGCSStaging;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodGCSStagingCredentialHMACKey;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodGCSStagingCredentialHMACKeyCredentialTypeEnum;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodGCSStagingGCSTmpFilesAfterwardProcessingEnum;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodGCSStagingMethodEnum;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodStandardInserts;
import com.airbyte.api.models.shared.DestinationBigqueryLoadingMethodStandardInsertsMethodEnum;
import com.airbyte.api.models.shared.DestinationBigqueryTransformationQueryRunTypeEnum;
import com.airbyte.api.models.shared.DestinationCassandra;
import com.airbyte.api.models.shared.DestinationCassandraCassandraEnum;
import com.airbyte.api.models.shared.DestinationClickhouse;
import com.airbyte.api.models.shared.DestinationClickhouseClickhouseEnum;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethodNoTunnelTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethodPasswordAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethodSSHKeyAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationConvex;
import com.airbyte.api.models.shared.DestinationConvexConvexEnum;
import com.airbyte.api.models.shared.DestinationCreateRequest;
import com.airbyte.api.models.shared.DestinationDatabend;
import com.airbyte.api.models.shared.DestinationDatabendDatabendEnum;
import com.airbyte.api.models.shared.DestinationDatabricks;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceAmazonS3;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceAmazonS3DataSourceTypeEnum;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceAmazonS3S3BucketRegionEnum;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceAzureBlobStorage;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceAzureBlobStorageDataSourceTypeEnum;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceRecommendedManagedTables;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceRecommendedManagedTablesDataSourceTypeEnum;
import com.airbyte.api.models.shared.DestinationDatabricksDatabricksEnum;
import com.airbyte.api.models.shared.DestinationDynamodb;
import com.airbyte.api.models.shared.DestinationDynamodbDynamoDBRegionEnum;
import com.airbyte.api.models.shared.DestinationDynamodbDynamodbEnum;
import com.airbyte.api.models.shared.DestinationElasticsearch;
import com.airbyte.api.models.shared.DestinationElasticsearchAuthenticationMethodApiKeySecret;
import com.airbyte.api.models.shared.DestinationElasticsearchAuthenticationMethodApiKeySecretMethodEnum;
import com.airbyte.api.models.shared.DestinationElasticsearchAuthenticationMethodUsernamePassword;
import com.airbyte.api.models.shared.DestinationElasticsearchAuthenticationMethodUsernamePasswordMethodEnum;
import com.airbyte.api.models.shared.DestinationElasticsearchElasticsearchEnum;
import com.airbyte.api.models.shared.DestinationFirebolt;
import com.airbyte.api.models.shared.DestinationFireboltFireboltEnum;
import com.airbyte.api.models.shared.DestinationFireboltLoadingMethodExternalTableViaS3;
import com.airbyte.api.models.shared.DestinationFireboltLoadingMethodExternalTableViaS3MethodEnum;
import com.airbyte.api.models.shared.DestinationFireboltLoadingMethodSQLInserts;
import com.airbyte.api.models.shared.DestinationFireboltLoadingMethodSQLInsertsMethodEnum;
import com.airbyte.api.models.shared.DestinationFirestore;
import com.airbyte.api.models.shared.DestinationFirestoreFirestoreEnum;
import com.airbyte.api.models.shared.DestinationGCSGCSBucketRegionEnum;
import com.airbyte.api.models.shared.DestinationGcs;
import com.airbyte.api.models.shared.DestinationGcsCredentialHMACKey;
import com.airbyte.api.models.shared.DestinationGcsCredentialHMACKeyCredentialTypeEnum;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvro;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecBzip2;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecBzip2CodecEnum;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecDeflate;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecDeflateCodecEnum;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecNoCompression;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecNoCompressionCodecEnum;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecSnappy;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecSnappyCodecEnum;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecXz;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecXzCodecEnum;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecZstandard;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroCompressionCodecZstandardCodecEnum;
import com.airbyte.api.models.shared.DestinationGcsFormatAvroApacheAvroFormatTypeEnum;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValues;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValuesCompressionGZIP;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValuesCompressionGZIPCompressionTypeEnum;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValuesCompressionNoCompression;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValuesCompressionNoCompressionCompressionTypeEnum;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValuesFormatTypeEnum;
import com.airbyte.api.models.shared.DestinationGcsFormatCSVCommaSeparatedValuesNormalizationEnum;
import com.airbyte.api.models.shared.DestinationGcsFormatJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionGZIP;
import com.airbyte.api.models.shared.DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionGZIPCompressionTypeEnum;
import com.airbyte.api.models.shared.DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionNoCompression;
import com.airbyte.api.models.shared.DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionNoCompressionCompressionTypeEnum;
import com.airbyte.api.models.shared.DestinationGcsFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum;
import com.airbyte.api.models.shared.DestinationGcsFormatParquetColumnarStorage;
import com.airbyte.api.models.shared.DestinationGcsFormatParquetColumnarStorageCompressionCodecEnum;
import com.airbyte.api.models.shared.DestinationGcsFormatParquetColumnarStorageFormatTypeEnum;
import com.airbyte.api.models.shared.DestinationGcsGcsEnum;
import com.airbyte.api.models.shared.DestinationGoogleSheets;
import com.airbyte.api.models.shared.DestinationGoogleSheetsAuthenticationViaGoogleOAuth;
import com.airbyte.api.models.shared.DestinationGoogleSheetsGoogleSheetsEnum;
import com.airbyte.api.models.shared.DestinationKeen;
import com.airbyte.api.models.shared.DestinationKeenKeenEnum;
import com.airbyte.api.models.shared.DestinationKinesis;
import com.airbyte.api.models.shared.DestinationKinesisKinesisEnum;
import com.airbyte.api.models.shared.DestinationMariadbColumnstore;
import com.airbyte.api.models.shared.DestinationMariadbColumnstoreMariadbColumnstoreEnum;
import com.airbyte.api.models.shared.DestinationMariadbColumnstoreTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationMariadbColumnstoreTunnelMethodNoTunnelTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationMariadbColumnstoreTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationMariadbColumnstoreTunnelMethodPasswordAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationMariadbColumnstoreTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationMariadbColumnstoreTunnelMethodSSHKeyAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationMeilisearch;
import com.airbyte.api.models.shared.DestinationMeilisearchMeilisearchEnum;
import com.airbyte.api.models.shared.DestinationMongodb;
import com.airbyte.api.models.shared.DestinationMongodbAuthTypeLoginPassword;
import com.airbyte.api.models.shared.DestinationMongodbAuthTypeLoginPasswordAuthorizationEnum;
import com.airbyte.api.models.shared.DestinationMongodbAuthTypeNone;
import com.airbyte.api.models.shared.DestinationMongodbAuthTypeNoneAuthorizationEnum;
import com.airbyte.api.models.shared.DestinationMongodbInstanceTypeMongoDBAtlas;
import com.airbyte.api.models.shared.DestinationMongodbInstanceTypeMongoDBAtlasInstanceEnum;
import com.airbyte.api.models.shared.DestinationMongodbInstanceTypeReplicaSet;
import com.airbyte.api.models.shared.DestinationMongodbInstanceTypeReplicaSetInstanceEnum;
import com.airbyte.api.models.shared.DestinationMongodbInstanceTypeStandaloneMongoDbInstance;
import com.airbyte.api.models.shared.DestinationMongodbInstanceTypeStandaloneMongoDbInstanceInstanceEnum;
import com.airbyte.api.models.shared.DestinationMongodbMongodbEnum;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethodNoTunnelTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethodPasswordAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethodSSHKeyAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationMssql;
import com.airbyte.api.models.shared.DestinationMssqlMssqlEnum;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedTrustServerCertificate;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedTrustServerCertificateSslMethodEnum;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedVerifyCertificate;
import com.airbyte.api.models.shared.DestinationMssqlSslMethodEncryptedVerifyCertificateSslMethodEnum;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethodNoTunnelTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethodPasswordAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethodSSHKeyAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationMysql;
import com.airbyte.api.models.shared.DestinationMysqlMysqlEnum;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethodNoTunnelTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethodPasswordAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethodSSHKeyAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationOracle;
import com.airbyte.api.models.shared.DestinationOracleOracleEnum;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethodNoTunnelTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethodPasswordAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethodSSHKeyAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationPostgres;
import com.airbyte.api.models.shared.DestinationPostgresPostgresEnum;
import com.airbyte.api.models.shared.DestinationPostgresSslModeAllow;
import com.airbyte.api.models.shared.DestinationPostgresSslModeAllowModeEnum;
import com.airbyte.api.models.shared.DestinationPostgresSslModeDisable;
import com.airbyte.api.models.shared.DestinationPostgresSslModeDisableModeEnum;
import com.airbyte.api.models.shared.DestinationPostgresSslModePrefer;
import com.airbyte.api.models.shared.DestinationPostgresSslModePreferModeEnum;
import com.airbyte.api.models.shared.DestinationPostgresSslModeRequire;
import com.airbyte.api.models.shared.DestinationPostgresSslModeRequireModeEnum;
import com.airbyte.api.models.shared.DestinationPostgresSslModeVerifyCa;
import com.airbyte.api.models.shared.DestinationPostgresSslModeVerifyCaModeEnum;
import com.airbyte.api.models.shared.DestinationPostgresSslModeVerifyFull;
import com.airbyte.api.models.shared.DestinationPostgresSslModeVerifyFullModeEnum;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethodNoTunnelTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethodPasswordAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethodSSHKeyAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationPubsub;
import com.airbyte.api.models.shared.DestinationPubsubPubsubEnum;
import com.airbyte.api.models.shared.DestinationPulsar;
import com.airbyte.api.models.shared.DestinationPulsarCompressionTypeEnum;
import com.airbyte.api.models.shared.DestinationPulsarPulsarEnum;
import com.airbyte.api.models.shared.DestinationPulsarTopicTypeEnum;
import com.airbyte.api.models.shared.DestinationRabbitmq;
import com.airbyte.api.models.shared.DestinationRabbitmqRabbitmqEnum;
import com.airbyte.api.models.shared.DestinationRedis;
import com.airbyte.api.models.shared.DestinationRedisCacheTypeEnum;
import com.airbyte.api.models.shared.DestinationRedisRedisEnum;
import com.airbyte.api.models.shared.DestinationRedisSslModeDisable;
import com.airbyte.api.models.shared.DestinationRedisSslModeDisableModeEnum;
import com.airbyte.api.models.shared.DestinationRedisSslModeVerifyFull;
import com.airbyte.api.models.shared.DestinationRedisSslModeVerifyFullModeEnum;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethodNoTunnelTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethodPasswordAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethodSSHKeyAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationRedshift;
import com.airbyte.api.models.shared.DestinationRedshiftRedshiftEnum;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethodNoTunnelTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethodPasswordAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethodSSHKeyAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3Staging;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3StagingEncryptionAESCBCEnvelopeEncryption;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3StagingEncryptionAESCBCEnvelopeEncryptionEncryptionTypeEnum;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3StagingEncryptionNoEncryption;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3StagingEncryptionNoEncryptionEncryptionTypeEnum;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3StagingMethodEnum;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodS3StagingS3BucketRegionEnum;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodStandard;
import com.airbyte.api.models.shared.DestinationRedshiftUploadingMethodStandardMethodEnum;
import com.airbyte.api.models.shared.DestinationRockset;
import com.airbyte.api.models.shared.DestinationRocksetRocksetEnum;
import com.airbyte.api.models.shared.DestinationS3;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvro;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecBzip2;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecBzip2CodecEnum;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecDeflate;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecDeflateCodecEnum;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecNoCompression;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecNoCompressionCodecEnum;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecSnappy;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecSnappyCodecEnum;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecXz;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecXzCodecEnum;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecZstandard;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroCompressionCodecZstandardCodecEnum;
import com.airbyte.api.models.shared.DestinationS3FormatAvroApacheAvroFormatTypeEnum;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValues;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValuesCompressionGZIP;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValuesCompressionGZIPCompressionTypeEnum;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValuesCompressionNoCompression;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValuesCompressionNoCompressionCompressionTypeEnum;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValuesFlatteningEnum;
import com.airbyte.api.models.shared.DestinationS3FormatCSVCommaSeparatedValuesFormatTypeEnum;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSONCompressionGZIP;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSONCompressionGZIPCompressionTypeEnum;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSONCompressionNoCompression;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSONCompressionNoCompressionCompressionTypeEnum;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSONFlatteningEnum;
import com.airbyte.api.models.shared.DestinationS3FormatJSONLinesNewlineDelimitedJSONFormatTypeEnum;
import com.airbyte.api.models.shared.DestinationS3FormatParquetColumnarStorage;
import com.airbyte.api.models.shared.DestinationS3FormatParquetColumnarStorageCompressionCodecEnum;
import com.airbyte.api.models.shared.DestinationS3FormatParquetColumnarStorageFormatTypeEnum;
import com.airbyte.api.models.shared.DestinationS3Glue;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONCompressionGZIP;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONCompressionGZIPCompressionTypeEnum;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONCompressionNoCompression;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONCompressionNoCompressionCompressionTypeEnum;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONFlatteningEnum;
import com.airbyte.api.models.shared.DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum;
import com.airbyte.api.models.shared.DestinationS3GlueS3BucketRegionEnum;
import com.airbyte.api.models.shared.DestinationS3GlueS3GlueEnum;
import com.airbyte.api.models.shared.DestinationS3GlueSerializationLibraryEnum;
import com.airbyte.api.models.shared.DestinationS3S3BucketRegionEnum;
import com.airbyte.api.models.shared.DestinationS3S3Enum;
import com.airbyte.api.models.shared.DestinationScylla;
import com.airbyte.api.models.shared.DestinationScyllaScyllaEnum;
import com.airbyte.api.models.shared.DestinationSftpJson;
import com.airbyte.api.models.shared.DestinationSftpJsonSftpJsonEnum;
import com.airbyte.api.models.shared.DestinationSnowflake;
import com.airbyte.api.models.shared.DestinationSnowflakeCredentialsKeyPairAuthentication;
import com.airbyte.api.models.shared.DestinationSnowflakeCredentialsKeyPairAuthenticationAuthTypeEnum;
import com.airbyte.api.models.shared.DestinationSnowflakeCredentialsOAuth20;
import com.airbyte.api.models.shared.DestinationSnowflakeCredentialsOAuth20AuthTypeEnum;
import com.airbyte.api.models.shared.DestinationSnowflakeCredentialsUsernameAndPassword;
import com.airbyte.api.models.shared.DestinationSnowflakeCredentialsUsernameAndPasswordAuthTypeEnum;
import com.airbyte.api.models.shared.DestinationSnowflakeLoadingMethodAWSS3Staging;
import com.airbyte.api.models.shared.DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionAESCBCEnvelopeEncryption;
import com.airbyte.api.models.shared.DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionAESCBCEnvelopeEncryptionEncryptionTypeEnum;
import com.airbyte.api.models.shared.DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionNoEncryption;
import com.airbyte.api.models.shared.DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionNoEncryptionEncryptionTypeEnum;
import com.airbyte.api.models.shared.DestinationSnowflakeLoadingMethodAWSS3StagingMethodEnum;
import com.airbyte.api.models.shared.DestinationSnowflakeLoadingMethodAWSS3StagingS3BucketRegionEnum;
import com.airbyte.api.models.shared.DestinationSnowflakeLoadingMethodAzureBlobStorageStaging;
import com.airbyte.api.models.shared.DestinationSnowflakeLoadingMethodAzureBlobStorageStagingMethodEnum;
import com.airbyte.api.models.shared.DestinationSnowflakeLoadingMethodGoogleCloudStorageStaging;
import com.airbyte.api.models.shared.DestinationSnowflakeLoadingMethodGoogleCloudStorageStagingMethodEnum;
import com.airbyte.api.models.shared.DestinationSnowflakeLoadingMethodRecommendedInternalStaging;
import com.airbyte.api.models.shared.DestinationSnowflakeLoadingMethodRecommendedInternalStagingMethodEnum;
import com.airbyte.api.models.shared.DestinationSnowflakeLoadingMethodSelectAnotherOption;
import com.airbyte.api.models.shared.DestinationSnowflakeLoadingMethodSelectAnotherOptionMethodEnum;
import com.airbyte.api.models.shared.DestinationSnowflakeSnowflakeEnum;
import com.airbyte.api.models.shared.DestinationTypesense;
import com.airbyte.api.models.shared.DestinationTypesenseTypesenseEnum;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security("architecto") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            com.airbyte.api.models.shared.DestinationCreateRequest req = new DestinationCreateRequest(                new DestinationBigquery("excepturi", DestinationBigqueryDatasetLocationEnum.ASIA_NORTHEAST2, DestinationBigqueryBigqueryEnum.BIGQUERY, "ea") {{
                                bigQueryClientBufferSizeMb = 919483L;
                                credentialsJson = "ullam";
                                datasetId = "expedita";
                                datasetLocation = DestinationBigqueryDatasetLocationEnum.EUROPE_WEST2;
                                destinationType = DestinationBigqueryBigqueryEnum.BIGQUERY;
                                loadingMethod = new DestinationBigqueryLoadingMethodGCSStaging(                new DestinationBigqueryLoadingMethodGCSStagingCredentialHMACKey(DestinationBigqueryLoadingMethodGCSStagingCredentialHMACKeyCredentialTypeEnum.HMAC_KEY, "sunt", "quo") {{
                                                    credentialType = DestinationBigqueryLoadingMethodGCSStagingCredentialHMACKeyCredentialTypeEnum.HMAC_KEY;
                                                    hmacKeyAccessId = "natus";
                                                    hmacKeySecret = "magni";
                                                }}, "illum", "pariatur", DestinationBigqueryLoadingMethodGCSStagingMethodEnum.GCS_STAGING) {{
                                    credential = new DestinationBigqueryLoadingMethodGCSStagingCredentialHMACKey(DestinationBigqueryLoadingMethodGCSStagingCredentialHMACKeyCredentialTypeEnum.HMAC_KEY, "saepe", "pariatur") {{
                                        credentialType = DestinationBigqueryLoadingMethodGCSStagingCredentialHMACKeyCredentialTypeEnum.HMAC_KEY;
                                        hmacKeyAccessId = "quibusdam";
                                        hmacKeySecret = "sed";
                                    }};
                                    gcsBucketName = "accusantium";
                                    gcsBucketPath = "consequuntur";
                                    keepFilesInGcsBucket = DestinationBigqueryLoadingMethodGCSStagingGCSTmpFilesAfterwardProcessingEnum.KEEP_ALL_TMP_FILES_IN_GCS;
                                    method = DestinationBigqueryLoadingMethodGCSStagingMethodEnum.GCS_STAGING;
                                }};
                                projectId = "maxime";
                                transformationPriority = DestinationBigqueryTransformationQueryRunTypeEnum.INTERACTIVE;
                            }}, "accusantium", "1fb576b0-d5f0-4d30-85fb-b2587053202c");            

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
                .setSecurity(new Security("quam") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            DeleteDestinationRequest req = new DeleteDestinationRequest("dolor");            

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
                .setSecurity(new Security("vero") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            GetDestinationRequest req = new GetDestinationRequest("nostrum");            

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
                .setSecurity(new Security("hic") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            ListDestinationsRequest req = new ListDestinationsRequest() {{
                includeDeleted = false;
                limit = 928082;
                offset = 608253;
                workspaceIds = new String[]{{
                    add("90c28909-b3fe-449a-8d9c-bf48633323f9"),
                    add("b77f3a41-0067-44eb-b692-80d1ba77a89e"),
                    add("bf737ae4-203c-4e5e-aa95-d8a0d446ce2a"),
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

# Destinations
(*destinations()*)

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

import com.airbyte.api.airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.operations.CreateDestinationResponse;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.AESCBCEnvelopeEncryption;
import com.airbyte.api.models.shared.AWSS3Staging;
import com.airbyte.api.models.shared.Allow;
import com.airbyte.api.models.shared.AmazonS3;
import com.airbyte.api.models.shared.ApiKeyAuth;
import com.airbyte.api.models.shared.ApiKeySecret;
import com.airbyte.api.models.shared.Astra;
import com.airbyte.api.models.shared.AuthenticationViaGoogleOAuth;
import com.airbyte.api.models.shared.AvroApacheAvro;
import com.airbyte.api.models.shared.AwsDatalake;
import com.airbyte.api.models.shared.AzureBlobStorage;
import com.airbyte.api.models.shared.AzureOpenAI;
import com.airbyte.api.models.shared.Bigquery;
import com.airbyte.api.models.shared.ByMarkdownHeader;
import com.airbyte.api.models.shared.ByProgrammingLanguage;
import com.airbyte.api.models.shared.BySeparator;
import com.airbyte.api.models.shared.Bzip2;
import com.airbyte.api.models.shared.CSVCommaSeparatedValues;
import com.airbyte.api.models.shared.CacheType;
import com.airbyte.api.models.shared.ChooseHowToPartitionData;
import com.airbyte.api.models.shared.ChromaLocalPersistance;
import com.airbyte.api.models.shared.Clickhouse;
import com.airbyte.api.models.shared.Codec;
import com.airbyte.api.models.shared.Cohere;
import com.airbyte.api.models.shared.CompressionCodecOptional;
import com.airbyte.api.models.shared.CompressionType;
import com.airbyte.api.models.shared.Convex;
import com.airbyte.api.models.shared.CredentialType;
import com.airbyte.api.models.shared.CredentialsTitle;
import com.airbyte.api.models.shared.Cumulio;
import com.airbyte.api.models.shared.DataSourceType;
import com.airbyte.api.models.shared.Databend;
import com.airbyte.api.models.shared.Databricks;
import com.airbyte.api.models.shared.DatasetLocation;
import com.airbyte.api.models.shared.DefaultVectorizer;
import com.airbyte.api.models.shared.Deflate;
import com.airbyte.api.models.shared.DestinationAstra;
import com.airbyte.api.models.shared.DestinationAstraLanguage;
import com.airbyte.api.models.shared.DestinationAstraMode;
import com.airbyte.api.models.shared.DestinationAstraSchemasEmbeddingEmbedding1Mode;
import com.airbyte.api.models.shared.DestinationAstraSchemasEmbeddingEmbeddingMode;
import com.airbyte.api.models.shared.DestinationAstraSchemasEmbeddingMode;
import com.airbyte.api.models.shared.DestinationAstraSchemasMode;
import com.airbyte.api.models.shared.DestinationAstraSchemasProcessingMode;
import com.airbyte.api.models.shared.DestinationAstraSchemasProcessingTextSplitterMode;
import com.airbyte.api.models.shared.DestinationAstraSchemasProcessingTextSplitterTextSplitterMode;
import com.airbyte.api.models.shared.DestinationAwsDatalake;
import com.airbyte.api.models.shared.DestinationAwsDatalakeCompressionCodecOptional;
import com.airbyte.api.models.shared.DestinationAwsDatalakeCredentialsTitle;
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatTypeWildcard;
import com.airbyte.api.models.shared.DestinationAzureBlobStorage;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageFormatType;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationBigquery;
import com.airbyte.api.models.shared.DestinationBigqueryCredentialType;
import com.airbyte.api.models.shared.DestinationBigqueryHMACKey;
import com.airbyte.api.models.shared.DestinationBigqueryMethod;
import com.airbyte.api.models.shared.DestinationClickhouse;
import com.airbyte.api.models.shared.DestinationClickhouseSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethod;
import com.airbyte.api.models.shared.DestinationConvex;
import com.airbyte.api.models.shared.DestinationCreateRequest;
import com.airbyte.api.models.shared.DestinationCumulio;
import com.airbyte.api.models.shared.DestinationDatabend;
import com.airbyte.api.models.shared.DestinationDatabricks;
import com.airbyte.api.models.shared.DestinationDatabricksAzureBlobStorage;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceType;
import com.airbyte.api.models.shared.DestinationDatabricksS3BucketRegion;
import com.airbyte.api.models.shared.DestinationDatabricksSchemasDataSourceType;
import com.airbyte.api.models.shared.DestinationDevNull;
import com.airbyte.api.models.shared.DestinationDuckdb;
import com.airbyte.api.models.shared.DestinationDynamodb;
import com.airbyte.api.models.shared.DestinationElasticsearch;
import com.airbyte.api.models.shared.DestinationElasticsearchMethod;
import com.airbyte.api.models.shared.DestinationElasticsearchSchemasMethod;
import com.airbyte.api.models.shared.DestinationFirebolt;
import com.airbyte.api.models.shared.DestinationFireboltMethod;
import com.airbyte.api.models.shared.DestinationFireboltSchemasMethod;
import com.airbyte.api.models.shared.DestinationFirestore;
import com.airbyte.api.models.shared.DestinationGcs;
import com.airbyte.api.models.shared.DestinationGcsCSVCommaSeparatedValues;
import com.airbyte.api.models.shared.DestinationGcsCodec;
import com.airbyte.api.models.shared.DestinationGcsCompressionCodec;
import com.airbyte.api.models.shared.DestinationGcsCompressionType;
import com.airbyte.api.models.shared.DestinationGcsFormatType;
import com.airbyte.api.models.shared.DestinationGcsGZIP;
import com.airbyte.api.models.shared.DestinationGcsJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationGcsNoCompression;
import com.airbyte.api.models.shared.DestinationGcsParquetColumnarStorage;
import com.airbyte.api.models.shared.DestinationGcsSchemasCodec;
import com.airbyte.api.models.shared.DestinationGcsSchemasCompressionType;
import com.airbyte.api.models.shared.DestinationGcsSchemasFormatCodec;
import com.airbyte.api.models.shared.DestinationGcsSchemasFormatCompressionType;
import com.airbyte.api.models.shared.DestinationGcsSchemasFormatFormatType;
import com.airbyte.api.models.shared.DestinationGcsSchemasFormatOutputFormat1Codec;
import com.airbyte.api.models.shared.DestinationGcsSchemasFormatOutputFormatCodec;
import com.airbyte.api.models.shared.DestinationGcsSchemasFormatOutputFormatFormatType;
import com.airbyte.api.models.shared.DestinationGcsSchemasFormatType;
import com.airbyte.api.models.shared.DestinationGcsSchemasNoCompression;
import com.airbyte.api.models.shared.DestinationGoogleSheets;
import com.airbyte.api.models.shared.DestinationGoogleSheetsGoogleSheets;
import com.airbyte.api.models.shared.DestinationKeen;
import com.airbyte.api.models.shared.DestinationKinesis;
import com.airbyte.api.models.shared.DestinationLangchain;
import com.airbyte.api.models.shared.DestinationLangchainFake;
import com.airbyte.api.models.shared.DestinationLangchainMode;
import com.airbyte.api.models.shared.DestinationLangchainOpenAI;
import com.airbyte.api.models.shared.DestinationLangchainPinecone;
import com.airbyte.api.models.shared.DestinationLangchainProcessingConfigModel;
import com.airbyte.api.models.shared.DestinationLangchainSchemasIndexingIndexing3Mode;
import com.airbyte.api.models.shared.DestinationLangchainSchemasIndexingIndexingMode;
import com.airbyte.api.models.shared.DestinationLangchainSchemasIndexingMode;
import com.airbyte.api.models.shared.DestinationLangchainSchemasMode;
import com.airbyte.api.models.shared.DestinationMilvus;
import com.airbyte.api.models.shared.DestinationMilvusAPIToken;
import com.airbyte.api.models.shared.DestinationMilvusAzureOpenAI;
import com.airbyte.api.models.shared.DestinationMilvusByMarkdownHeader;
import com.airbyte.api.models.shared.DestinationMilvusByProgrammingLanguage;
import com.airbyte.api.models.shared.DestinationMilvusBySeparator;
import com.airbyte.api.models.shared.DestinationMilvusCohere;
import com.airbyte.api.models.shared.DestinationMilvusFake;
import com.airbyte.api.models.shared.DestinationMilvusFieldNameMappingConfigModel;
import com.airbyte.api.models.shared.DestinationMilvusIndexing;
import com.airbyte.api.models.shared.DestinationMilvusLanguage;
import com.airbyte.api.models.shared.DestinationMilvusMode;
import com.airbyte.api.models.shared.DestinationMilvusOpenAI;
import com.airbyte.api.models.shared.DestinationMilvusOpenAICompatible;
import com.airbyte.api.models.shared.DestinationMilvusProcessingConfigModel;
import com.airbyte.api.models.shared.DestinationMilvusSchemasEmbeddingEmbedding5Mode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasEmbeddingEmbeddingMode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasEmbeddingMode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasIndexingAuthAuthenticationMode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasIndexingAuthMode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasIndexingMode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasMode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasProcessingMode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasProcessingTextSplitterMode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasProcessingTextSplitterTextSplitterMode;
import com.airbyte.api.models.shared.DestinationMilvusUsernamePassword;
import com.airbyte.api.models.shared.DestinationMongodb;
import com.airbyte.api.models.shared.DestinationMongodbAuthorization;
import com.airbyte.api.models.shared.DestinationMongodbInstance;
import com.airbyte.api.models.shared.DestinationMongodbNoTunnel;
import com.airbyte.api.models.shared.DestinationMongodbPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationMongodbSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationMongodbSchemasAuthorization;
import com.airbyte.api.models.shared.DestinationMongodbSchemasInstance;
import com.airbyte.api.models.shared.DestinationMongodbSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationMongodbSchemasTunnelMethodTunnelMethod;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethod;
import com.airbyte.api.models.shared.DestinationMssql;
import com.airbyte.api.models.shared.DestinationMssqlNoTunnel;
import com.airbyte.api.models.shared.DestinationMssqlPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationMssqlSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationMssqlSchemasSslMethod;
import com.airbyte.api.models.shared.DestinationMssqlSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationMssqlSchemasTunnelMethodTunnelMethod;
import com.airbyte.api.models.shared.DestinationMssqlSslMethod;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethod;
import com.airbyte.api.models.shared.DestinationMysql;
import com.airbyte.api.models.shared.DestinationMysqlNoTunnel;
import com.airbyte.api.models.shared.DestinationMysqlPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationMysqlSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationMysqlSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationMysqlSchemasTunnelMethodTunnelMethod;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethod;
import com.airbyte.api.models.shared.DestinationOracle;
import com.airbyte.api.models.shared.DestinationOracleNoTunnel;
import com.airbyte.api.models.shared.DestinationOraclePasswordAuthentication;
import com.airbyte.api.models.shared.DestinationOracleSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationOracleSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationOracleSchemasTunnelMethodTunnelMethod;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethod;
import com.airbyte.api.models.shared.DestinationPinecone;
import com.airbyte.api.models.shared.DestinationPineconeAzureOpenAI;
import com.airbyte.api.models.shared.DestinationPineconeByMarkdownHeader;
import com.airbyte.api.models.shared.DestinationPineconeByProgrammingLanguage;
import com.airbyte.api.models.shared.DestinationPineconeBySeparator;
import com.airbyte.api.models.shared.DestinationPineconeCohere;
import com.airbyte.api.models.shared.DestinationPineconeFake;
import com.airbyte.api.models.shared.DestinationPineconeFieldNameMappingConfigModel;
import com.airbyte.api.models.shared.DestinationPineconeIndexing;
import com.airbyte.api.models.shared.DestinationPineconeLanguage;
import com.airbyte.api.models.shared.DestinationPineconeMode;
import com.airbyte.api.models.shared.DestinationPineconeOpenAI;
import com.airbyte.api.models.shared.DestinationPineconeOpenAICompatible;
import com.airbyte.api.models.shared.DestinationPineconeProcessingConfigModel;
import com.airbyte.api.models.shared.DestinationPineconeSchemasEmbeddingEmbedding5Mode;
import com.airbyte.api.models.shared.DestinationPineconeSchemasEmbeddingEmbeddingMode;
import com.airbyte.api.models.shared.DestinationPineconeSchemasEmbeddingMode;
import com.airbyte.api.models.shared.DestinationPineconeSchemasMode;
import com.airbyte.api.models.shared.DestinationPineconeSchemasProcessingMode;
import com.airbyte.api.models.shared.DestinationPineconeSchemasProcessingTextSplitterMode;
import com.airbyte.api.models.shared.DestinationPineconeSchemasProcessingTextSplitterTextSplitterMode;
import com.airbyte.api.models.shared.DestinationPostgres;
import com.airbyte.api.models.shared.DestinationPostgresMode;
import com.airbyte.api.models.shared.DestinationPostgresNoTunnel;
import com.airbyte.api.models.shared.DestinationPostgresPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationPostgresSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationPostgresSchemasMode;
import com.airbyte.api.models.shared.DestinationPostgresSchemasSSLModeSSLModes6Mode;
import com.airbyte.api.models.shared.DestinationPostgresSchemasSSLModeSSLModesMode;
import com.airbyte.api.models.shared.DestinationPostgresSchemasSslModeMode;
import com.airbyte.api.models.shared.DestinationPostgresSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationPostgresSchemasTunnelMethodTunnelMethod;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethod;
import com.airbyte.api.models.shared.DestinationPubsub;
import com.airbyte.api.models.shared.DestinationQdrant;
import com.airbyte.api.models.shared.DestinationQdrantAzureOpenAI;
import com.airbyte.api.models.shared.DestinationQdrantByMarkdownHeader;
import com.airbyte.api.models.shared.DestinationQdrantByProgrammingLanguage;
import com.airbyte.api.models.shared.DestinationQdrantBySeparator;
import com.airbyte.api.models.shared.DestinationQdrantCohere;
import com.airbyte.api.models.shared.DestinationQdrantFake;
import com.airbyte.api.models.shared.DestinationQdrantFieldNameMappingConfigModel;
import com.airbyte.api.models.shared.DestinationQdrantIndexing;
import com.airbyte.api.models.shared.DestinationQdrantLanguage;
import com.airbyte.api.models.shared.DestinationQdrantMode;
import com.airbyte.api.models.shared.DestinationQdrantNoAuth;
import com.airbyte.api.models.shared.DestinationQdrantOpenAI;
import com.airbyte.api.models.shared.DestinationQdrantOpenAICompatible;
import com.airbyte.api.models.shared.DestinationQdrantProcessingConfigModel;
import com.airbyte.api.models.shared.DestinationQdrantSchemasEmbeddingEmbedding5Mode;
import com.airbyte.api.models.shared.DestinationQdrantSchemasEmbeddingEmbeddingMode;
import com.airbyte.api.models.shared.DestinationQdrantSchemasEmbeddingMode;
import com.airbyte.api.models.shared.DestinationQdrantSchemasIndexingAuthMethodMode;
import com.airbyte.api.models.shared.DestinationQdrantSchemasIndexingMode;
import com.airbyte.api.models.shared.DestinationQdrantSchemasMode;
import com.airbyte.api.models.shared.DestinationQdrantSchemasProcessingMode;
import com.airbyte.api.models.shared.DestinationQdrantSchemasProcessingTextSplitterMode;
import com.airbyte.api.models.shared.DestinationQdrantSchemasProcessingTextSplitterTextSplitterMode;
import com.airbyte.api.models.shared.DestinationRedis;
import com.airbyte.api.models.shared.DestinationRedisDisable;
import com.airbyte.api.models.shared.DestinationRedisMode;
import com.airbyte.api.models.shared.DestinationRedisNoTunnel;
import com.airbyte.api.models.shared.DestinationRedisPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationRedisSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationRedisSchemasMode;
import com.airbyte.api.models.shared.DestinationRedisSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedisSchemasTunnelMethodTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedisVerifyFull;
import com.airbyte.api.models.shared.DestinationRedshift;
import com.airbyte.api.models.shared.DestinationRedshiftEncryptionType;
import com.airbyte.api.models.shared.DestinationRedshiftMethod;
import com.airbyte.api.models.shared.DestinationRedshiftNoTunnel;
import com.airbyte.api.models.shared.DestinationRedshiftPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationRedshiftS3BucketRegion;
import com.airbyte.api.models.shared.DestinationRedshiftSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationRedshiftSchemasMethod;
import com.airbyte.api.models.shared.DestinationRedshiftSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedshiftSchemasTunnelMethodTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethod;
import com.airbyte.api.models.shared.DestinationS3;
import com.airbyte.api.models.shared.DestinationS3AvroApacheAvro;
import com.airbyte.api.models.shared.DestinationS3Bzip2;
import com.airbyte.api.models.shared.DestinationS3CSVCommaSeparatedValues;
import com.airbyte.api.models.shared.DestinationS3Codec;
import com.airbyte.api.models.shared.DestinationS3CompressionType;
import com.airbyte.api.models.shared.DestinationS3Deflate;
import com.airbyte.api.models.shared.DestinationS3Flattening;
import com.airbyte.api.models.shared.DestinationS3FormatType;
import com.airbyte.api.models.shared.DestinationS3GZIP;
import com.airbyte.api.models.shared.DestinationS3Glue;
import com.airbyte.api.models.shared.DestinationS3GlueCompressionType;
import com.airbyte.api.models.shared.DestinationS3GlueFormatType;
import com.airbyte.api.models.shared.DestinationS3GlueGZIP;
import com.airbyte.api.models.shared.DestinationS3GlueJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationS3GlueNoCompression;
import com.airbyte.api.models.shared.DestinationS3GlueS3BucketRegion;
import com.airbyte.api.models.shared.DestinationS3GlueSchemasCompressionType;
import com.airbyte.api.models.shared.DestinationS3JSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationS3NoCompression;
import com.airbyte.api.models.shared.DestinationS3ParquetColumnarStorage;
import com.airbyte.api.models.shared.DestinationS3S3BucketRegion;
import com.airbyte.api.models.shared.DestinationS3SchemasCodec;
import com.airbyte.api.models.shared.DestinationS3SchemasCompressionCodec;
import com.airbyte.api.models.shared.DestinationS3SchemasCompressionType;
import com.airbyte.api.models.shared.DestinationS3SchemasFlattening;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatCodec;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatCompressionType;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatFormatType;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatNoCompression;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatOutputFormat3Codec;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatOutputFormat3CompressionCodecCodec;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatOutputFormatCodec;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatOutputFormatCompressionType;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatOutputFormatFormatType;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatType;
import com.airbyte.api.models.shared.DestinationS3SchemasGZIP;
import com.airbyte.api.models.shared.DestinationS3SchemasNoCompression;
import com.airbyte.api.models.shared.DestinationS3Snappy;
import com.airbyte.api.models.shared.DestinationS3Xz;
import com.airbyte.api.models.shared.DestinationS3Zstandard;
import com.airbyte.api.models.shared.DestinationSftpJson;
import com.airbyte.api.models.shared.DestinationSnowflake;
import com.airbyte.api.models.shared.DestinationSnowflakeAuthType;
import com.airbyte.api.models.shared.DestinationSnowflakeOAuth20;
import com.airbyte.api.models.shared.DestinationSnowflakeSchemasAuthType;
import com.airbyte.api.models.shared.DestinationSnowflakeSchemasCredentialsAuthType;
import com.airbyte.api.models.shared.DestinationSnowflakeSnowflake;
import com.airbyte.api.models.shared.DestinationTeradata;
import com.airbyte.api.models.shared.DestinationTeradataAllow;
import com.airbyte.api.models.shared.DestinationTeradataDisable;
import com.airbyte.api.models.shared.DestinationTeradataMode;
import com.airbyte.api.models.shared.DestinationTeradataPrefer;
import com.airbyte.api.models.shared.DestinationTeradataRequire;
import com.airbyte.api.models.shared.DestinationTeradataSchemasMode;
import com.airbyte.api.models.shared.DestinationTeradataSchemasSSLModeSSLModes5Mode;
import com.airbyte.api.models.shared.DestinationTeradataSchemasSSLModeSSLModes6Mode;
import com.airbyte.api.models.shared.DestinationTeradataSchemasSSLModeSSLModesMode;
import com.airbyte.api.models.shared.DestinationTeradataSchemasSslModeMode;
import com.airbyte.api.models.shared.DestinationTeradataVerifyCa;
import com.airbyte.api.models.shared.DestinationTeradataVerifyFull;
import com.airbyte.api.models.shared.DestinationTimeplus;
import com.airbyte.api.models.shared.DestinationTypesense;
import com.airbyte.api.models.shared.DestinationVectara;
import com.airbyte.api.models.shared.DestinationVertica;
import com.airbyte.api.models.shared.DestinationVerticaNoTunnel;
import com.airbyte.api.models.shared.DestinationVerticaPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationVerticaSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationVerticaSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationVerticaSchemasTunnelMethodTunnelMethod;
import com.airbyte.api.models.shared.DestinationVerticaTunnelMethod;
import com.airbyte.api.models.shared.DestinationWeaviate;
import com.airbyte.api.models.shared.DestinationWeaviateAPIToken;
import com.airbyte.api.models.shared.DestinationWeaviateAzureOpenAI;
import com.airbyte.api.models.shared.DestinationWeaviateByMarkdownHeader;
import com.airbyte.api.models.shared.DestinationWeaviateByProgrammingLanguage;
import com.airbyte.api.models.shared.DestinationWeaviateBySeparator;
import com.airbyte.api.models.shared.DestinationWeaviateCohere;
import com.airbyte.api.models.shared.DestinationWeaviateFake;
import com.airbyte.api.models.shared.DestinationWeaviateFieldNameMappingConfigModel;
import com.airbyte.api.models.shared.DestinationWeaviateIndexing;
import com.airbyte.api.models.shared.DestinationWeaviateLanguage;
import com.airbyte.api.models.shared.DestinationWeaviateMode;
import com.airbyte.api.models.shared.DestinationWeaviateOpenAI;
import com.airbyte.api.models.shared.DestinationWeaviateOpenAICompatible;
import com.airbyte.api.models.shared.DestinationWeaviateProcessingConfigModel;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasEmbeddingEmbedding5Mode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasEmbeddingEmbedding6Mode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasEmbeddingEmbedding7Mode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasEmbeddingEmbeddingMode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasEmbeddingMode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasIndexingAuthAuthenticationMode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasIndexingAuthMode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasIndexingMode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasMode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasProcessingMode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasProcessingTextSplitterMode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasProcessingTextSplitterTextSplitterMode;
import com.airbyte.api.models.shared.DestinationWeaviateUsernamePassword;
import com.airbyte.api.models.shared.DestinationXata;
import com.airbyte.api.models.shared.DevNull;
import com.airbyte.api.models.shared.Disable;
import com.airbyte.api.models.shared.DistanceMetric;
import com.airbyte.api.models.shared.DocArrayHnswSearch;
import com.airbyte.api.models.shared.Duckdb;
import com.airbyte.api.models.shared.DynamoDBRegion;
import com.airbyte.api.models.shared.Dynamodb;
import com.airbyte.api.models.shared.Elasticsearch;
import com.airbyte.api.models.shared.EncryptedTrustServerCertificate;
import com.airbyte.api.models.shared.EncryptedVerifyCertificate;
import com.airbyte.api.models.shared.EncryptionType;
import com.airbyte.api.models.shared.ExternalTableViaS3;
import com.airbyte.api.models.shared.Fake;
import com.airbyte.api.models.shared.FieldNameMappingConfigModel;
import com.airbyte.api.models.shared.Firebolt;
import com.airbyte.api.models.shared.Firestore;
import com.airbyte.api.models.shared.Flattening;
import com.airbyte.api.models.shared.FormatType;
import com.airbyte.api.models.shared.FormatTypeWildcard;
import com.airbyte.api.models.shared.FromField;
import com.airbyte.api.models.shared.GCSBucketRegion;
import com.airbyte.api.models.shared.GCSStaging;
import com.airbyte.api.models.shared.GCSTmpFilesAfterwardProcessing;
import com.airbyte.api.models.shared.Gcs;
import com.airbyte.api.models.shared.Gzip;
import com.airbyte.api.models.shared.HMACKey;
import com.airbyte.api.models.shared.Header;
import com.airbyte.api.models.shared.IAMRole;
import com.airbyte.api.models.shared.IAMUser;
import com.airbyte.api.models.shared.Indexing;
import com.airbyte.api.models.shared.Instance;
import com.airbyte.api.models.shared.JSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.Keen;
import com.airbyte.api.models.shared.KeyPairAuthentication;
import com.airbyte.api.models.shared.Kinesis;
import com.airbyte.api.models.shared.Langchain;
import com.airbyte.api.models.shared.LoginPassword;
import com.airbyte.api.models.shared.Method;
import com.airbyte.api.models.shared.Milvus;
import com.airbyte.api.models.shared.Mode;
import com.airbyte.api.models.shared.MongoDBAtlas;
import com.airbyte.api.models.shared.Mongodb;
import com.airbyte.api.models.shared.Mssql;
import com.airbyte.api.models.shared.Mysql;
import com.airbyte.api.models.shared.NoAuth;
import com.airbyte.api.models.shared.NoAuthentication;
import com.airbyte.api.models.shared.NoCompression;
import com.airbyte.api.models.shared.NoEncryption;
import com.airbyte.api.models.shared.NoExternalEmbedding;
import com.airbyte.api.models.shared.NoTunnel;
import com.airbyte.api.models.shared.None;
import com.airbyte.api.models.shared.Normalization;
import com.airbyte.api.models.shared.NormalizationFlattening;
import com.airbyte.api.models.shared.OAuth20Credentials;
import com.airbyte.api.models.shared.OpenAI;
import com.airbyte.api.models.shared.OpenAICompatible;
import com.airbyte.api.models.shared.Oracle;
import com.airbyte.api.models.shared.ParquetColumnarStorage;
import com.airbyte.api.models.shared.PasswordAuthentication;
import com.airbyte.api.models.shared.Pinecone;
import com.airbyte.api.models.shared.Postgres;
import com.airbyte.api.models.shared.Prefer;
import com.airbyte.api.models.shared.ProcessingConfigModel;
import com.airbyte.api.models.shared.Pubsub;
import com.airbyte.api.models.shared.Qdrant;
import com.airbyte.api.models.shared.RecommendedManagedTables;
import com.airbyte.api.models.shared.Redis;
import com.airbyte.api.models.shared.Redshift;
import com.airbyte.api.models.shared.ReplicaSet;
import com.airbyte.api.models.shared.Require;
import com.airbyte.api.models.shared.S3;
import com.airbyte.api.models.shared.S3BucketRegion;
import com.airbyte.api.models.shared.S3Glue;
import com.airbyte.api.models.shared.SQLInserts;
import com.airbyte.api.models.shared.SSHKeyAuthentication;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.models.shared.SerializationLibrary;
import com.airbyte.api.models.shared.SftpJson;
import com.airbyte.api.models.shared.Silent;
import com.airbyte.api.models.shared.Snappy;
import com.airbyte.api.models.shared.StandaloneMongoDbInstance;
import com.airbyte.api.models.shared.Standard;
import com.airbyte.api.models.shared.StandardInserts;
import com.airbyte.api.models.shared.Teradata;
import com.airbyte.api.models.shared.TestDestinationType;
import com.airbyte.api.models.shared.Timeplus;
import com.airbyte.api.models.shared.TransformationQueryRunType;
import com.airbyte.api.models.shared.TunnelMethod;
import com.airbyte.api.models.shared.Typesense;
import com.airbyte.api.models.shared.UsernameAndPassword;
import com.airbyte.api.models.shared.UsernamePassword;
import com.airbyte.api.models.shared.Vectara;
import com.airbyte.api.models.shared.VerifyCa;
import com.airbyte.api.models.shared.VerifyFull;
import com.airbyte.api.models.shared.Vertica;
import com.airbyte.api.models.shared.Weaviate;
import com.airbyte.api.models.shared.Xata;
import com.airbyte.api.models.shared.Xz;
import com.airbyte.api.models.shared.Zstandard;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .security(Security.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .password("")
                        .username("")
                        .build())
                    .build())
                .build();

            DestinationCreateRequest req = DestinationCreateRequest.builder()
                .configuration(DestinationConfiguration.of(DestinationGoogleSheets.builder()
                            .credentials(AuthenticationViaGoogleOAuth.builder()
                                    .clientId("<value>")
                                    .clientSecret("<value>")
                                    .refreshToken("<value>")
                                    .build())
                            .spreadsheetId("https://docs.google.com/spreadsheets/d/1hLd9Qqti3UyLXZB2aFfUWDT7BG/edit")
                            .build()))
                .name("<value>")
                .workspaceId("8360860a-d46e-48e6-af62-08e5ba5019ef")
                .definitionId("3492fc0e-ef56-45b0-b0c7-3d4dfc9aec3c")
                .build();

            CreateDestinationResponse res = sdk.destinations().createDestination()
                .request(req)
                .call();

            if (res.destinationResponse().isPresent()) {
                // handle response
            }
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
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

**[Optional<? extends com.airbyte.api.models.operations.CreateDestinationResponse>](../../models/operations/CreateDestinationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteDestination

Delete a Destination

### Example Usage

```java
package hello.world;

import com.airbyte.api.airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.operations.DeleteDestinationRequest;
import com.airbyte.api.models.operations.DeleteDestinationResponse;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .security(Security.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .password("")
                        .username("")
                        .build())
                    .build())
                .build();

            DeleteDestinationRequest req = DeleteDestinationRequest.builder()
                .destinationId("<value>")
                .build();

            DeleteDestinationResponse res = sdk.destinations().deleteDestination()
                .request(req)
                .call();

            // handle response
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
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

**[Optional<? extends com.airbyte.api.models.operations.DeleteDestinationResponse>](../../models/operations/DeleteDestinationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDestination

Get Destination details

### Example Usage

```java
package hello.world;

import com.airbyte.api.airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.operations.GetDestinationRequest;
import com.airbyte.api.models.operations.GetDestinationResponse;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .security(Security.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .password("")
                        .username("")
                        .build())
                    .build())
                .build();

            GetDestinationRequest req = GetDestinationRequest.builder()
                .destinationId("<value>")
                .build();

            GetDestinationResponse res = sdk.destinations().getDestination()
                .request(req)
                .call();

            if (res.destinationResponse().isPresent()) {
                // handle response
            }
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
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

**[Optional<? extends com.airbyte.api.models.operations.GetDestinationResponse>](../../models/operations/GetDestinationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listDestinations

List destinations

### Example Usage

```java
package hello.world;

import com.airbyte.api.airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.operations.ListDestinationsRequest;
import com.airbyte.api.models.operations.ListDestinationsResponse;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .security(Security.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .password("")
                        .username("")
                        .build())
                    .build())
                .build();

            ListDestinationsRequest req = ListDestinationsRequest.builder()
                .includeDeleted(false)
                .limit(772794)
                .offset(125999)
                .workspaceIds(java.util.List.of(
                    "980b9a83-1720-4244-9cd2-6fb4455227f2"))
                .build();

            ListDestinationsResponse res = sdk.destinations().listDestinations()
                .request(req)
                .call();

            if (res.destinationsResponse().isPresent()) {
                // handle response
            }
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
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

**[Optional<? extends com.airbyte.api.models.operations.ListDestinationsResponse>](../../models/operations/ListDestinationsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## patchDestination

Update a Destination

### Example Usage

```java
package hello.world;

import com.airbyte.api.airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.operations.PatchDestinationRequest;
import com.airbyte.api.models.operations.PatchDestinationResponse;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.AESCBCEnvelopeEncryption;
import com.airbyte.api.models.shared.AWSS3Staging;
import com.airbyte.api.models.shared.Allow;
import com.airbyte.api.models.shared.AmazonS3;
import com.airbyte.api.models.shared.ApiKeyAuth;
import com.airbyte.api.models.shared.ApiKeySecret;
import com.airbyte.api.models.shared.Astra;
import com.airbyte.api.models.shared.AuthenticationViaGoogleOAuth;
import com.airbyte.api.models.shared.AvroApacheAvro;
import com.airbyte.api.models.shared.AwsDatalake;
import com.airbyte.api.models.shared.AzureBlobStorage;
import com.airbyte.api.models.shared.AzureOpenAI;
import com.airbyte.api.models.shared.Bigquery;
import com.airbyte.api.models.shared.ByMarkdownHeader;
import com.airbyte.api.models.shared.ByProgrammingLanguage;
import com.airbyte.api.models.shared.BySeparator;
import com.airbyte.api.models.shared.Bzip2;
import com.airbyte.api.models.shared.CSVCommaSeparatedValues;
import com.airbyte.api.models.shared.CacheType;
import com.airbyte.api.models.shared.ChooseHowToPartitionData;
import com.airbyte.api.models.shared.ChromaLocalPersistance;
import com.airbyte.api.models.shared.Clickhouse;
import com.airbyte.api.models.shared.Codec;
import com.airbyte.api.models.shared.Cohere;
import com.airbyte.api.models.shared.CompressionCodecOptional;
import com.airbyte.api.models.shared.CompressionType;
import com.airbyte.api.models.shared.Convex;
import com.airbyte.api.models.shared.CredentialType;
import com.airbyte.api.models.shared.CredentialsTitle;
import com.airbyte.api.models.shared.Cumulio;
import com.airbyte.api.models.shared.DataSourceType;
import com.airbyte.api.models.shared.Databend;
import com.airbyte.api.models.shared.Databricks;
import com.airbyte.api.models.shared.DatasetLocation;
import com.airbyte.api.models.shared.DefaultVectorizer;
import com.airbyte.api.models.shared.Deflate;
import com.airbyte.api.models.shared.DestinationAstra;
import com.airbyte.api.models.shared.DestinationAstraLanguage;
import com.airbyte.api.models.shared.DestinationAstraMode;
import com.airbyte.api.models.shared.DestinationAstraSchemasEmbeddingEmbedding1Mode;
import com.airbyte.api.models.shared.DestinationAstraSchemasEmbeddingEmbeddingMode;
import com.airbyte.api.models.shared.DestinationAstraSchemasEmbeddingMode;
import com.airbyte.api.models.shared.DestinationAstraSchemasMode;
import com.airbyte.api.models.shared.DestinationAstraSchemasProcessingMode;
import com.airbyte.api.models.shared.DestinationAstraSchemasProcessingTextSplitterMode;
import com.airbyte.api.models.shared.DestinationAstraSchemasProcessingTextSplitterTextSplitterMode;
import com.airbyte.api.models.shared.DestinationAwsDatalake;
import com.airbyte.api.models.shared.DestinationAwsDatalakeCompressionCodecOptional;
import com.airbyte.api.models.shared.DestinationAwsDatalakeCredentialsTitle;
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatTypeWildcard;
import com.airbyte.api.models.shared.DestinationAzureBlobStorage;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageFormatType;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationBigquery;
import com.airbyte.api.models.shared.DestinationBigqueryCredentialType;
import com.airbyte.api.models.shared.DestinationBigqueryHMACKey;
import com.airbyte.api.models.shared.DestinationBigqueryMethod;
import com.airbyte.api.models.shared.DestinationClickhouse;
import com.airbyte.api.models.shared.DestinationClickhouseSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethod;
import com.airbyte.api.models.shared.DestinationConvex;
import com.airbyte.api.models.shared.DestinationCumulio;
import com.airbyte.api.models.shared.DestinationDatabend;
import com.airbyte.api.models.shared.DestinationDatabricks;
import com.airbyte.api.models.shared.DestinationDatabricksAzureBlobStorage;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceType;
import com.airbyte.api.models.shared.DestinationDatabricksS3BucketRegion;
import com.airbyte.api.models.shared.DestinationDatabricksSchemasDataSourceType;
import com.airbyte.api.models.shared.DestinationDevNull;
import com.airbyte.api.models.shared.DestinationDuckdb;
import com.airbyte.api.models.shared.DestinationDynamodb;
import com.airbyte.api.models.shared.DestinationElasticsearch;
import com.airbyte.api.models.shared.DestinationElasticsearchMethod;
import com.airbyte.api.models.shared.DestinationElasticsearchSchemasMethod;
import com.airbyte.api.models.shared.DestinationFirebolt;
import com.airbyte.api.models.shared.DestinationFireboltMethod;
import com.airbyte.api.models.shared.DestinationFireboltSchemasMethod;
import com.airbyte.api.models.shared.DestinationFirestore;
import com.airbyte.api.models.shared.DestinationGcs;
import com.airbyte.api.models.shared.DestinationGcsCSVCommaSeparatedValues;
import com.airbyte.api.models.shared.DestinationGcsCodec;
import com.airbyte.api.models.shared.DestinationGcsCompressionCodec;
import com.airbyte.api.models.shared.DestinationGcsCompressionType;
import com.airbyte.api.models.shared.DestinationGcsFormatType;
import com.airbyte.api.models.shared.DestinationGcsGZIP;
import com.airbyte.api.models.shared.DestinationGcsJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationGcsNoCompression;
import com.airbyte.api.models.shared.DestinationGcsParquetColumnarStorage;
import com.airbyte.api.models.shared.DestinationGcsSchemasCodec;
import com.airbyte.api.models.shared.DestinationGcsSchemasCompressionType;
import com.airbyte.api.models.shared.DestinationGcsSchemasFormatCodec;
import com.airbyte.api.models.shared.DestinationGcsSchemasFormatCompressionType;
import com.airbyte.api.models.shared.DestinationGcsSchemasFormatFormatType;
import com.airbyte.api.models.shared.DestinationGcsSchemasFormatOutputFormat1Codec;
import com.airbyte.api.models.shared.DestinationGcsSchemasFormatOutputFormatCodec;
import com.airbyte.api.models.shared.DestinationGcsSchemasFormatOutputFormatFormatType;
import com.airbyte.api.models.shared.DestinationGcsSchemasFormatType;
import com.airbyte.api.models.shared.DestinationGcsSchemasNoCompression;
import com.airbyte.api.models.shared.DestinationGoogleSheets;
import com.airbyte.api.models.shared.DestinationGoogleSheetsGoogleSheets;
import com.airbyte.api.models.shared.DestinationKeen;
import com.airbyte.api.models.shared.DestinationKinesis;
import com.airbyte.api.models.shared.DestinationLangchain;
import com.airbyte.api.models.shared.DestinationLangchainFake;
import com.airbyte.api.models.shared.DestinationLangchainMode;
import com.airbyte.api.models.shared.DestinationLangchainOpenAI;
import com.airbyte.api.models.shared.DestinationLangchainPinecone;
import com.airbyte.api.models.shared.DestinationLangchainProcessingConfigModel;
import com.airbyte.api.models.shared.DestinationLangchainSchemasIndexingIndexing3Mode;
import com.airbyte.api.models.shared.DestinationLangchainSchemasIndexingIndexingMode;
import com.airbyte.api.models.shared.DestinationLangchainSchemasIndexingMode;
import com.airbyte.api.models.shared.DestinationLangchainSchemasMode;
import com.airbyte.api.models.shared.DestinationMilvus;
import com.airbyte.api.models.shared.DestinationMilvusAPIToken;
import com.airbyte.api.models.shared.DestinationMilvusAzureOpenAI;
import com.airbyte.api.models.shared.DestinationMilvusByMarkdownHeader;
import com.airbyte.api.models.shared.DestinationMilvusByProgrammingLanguage;
import com.airbyte.api.models.shared.DestinationMilvusBySeparator;
import com.airbyte.api.models.shared.DestinationMilvusCohere;
import com.airbyte.api.models.shared.DestinationMilvusFake;
import com.airbyte.api.models.shared.DestinationMilvusFieldNameMappingConfigModel;
import com.airbyte.api.models.shared.DestinationMilvusIndexing;
import com.airbyte.api.models.shared.DestinationMilvusLanguage;
import com.airbyte.api.models.shared.DestinationMilvusMode;
import com.airbyte.api.models.shared.DestinationMilvusOpenAI;
import com.airbyte.api.models.shared.DestinationMilvusOpenAICompatible;
import com.airbyte.api.models.shared.DestinationMilvusProcessingConfigModel;
import com.airbyte.api.models.shared.DestinationMilvusSchemasEmbeddingEmbedding5Mode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasEmbeddingEmbeddingMode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasEmbeddingMode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasIndexingAuthAuthenticationMode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasIndexingAuthMode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasIndexingMode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasMode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasProcessingMode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasProcessingTextSplitterMode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasProcessingTextSplitterTextSplitterMode;
import com.airbyte.api.models.shared.DestinationMilvusUsernamePassword;
import com.airbyte.api.models.shared.DestinationMongodb;
import com.airbyte.api.models.shared.DestinationMongodbAuthorization;
import com.airbyte.api.models.shared.DestinationMongodbInstance;
import com.airbyte.api.models.shared.DestinationMongodbNoTunnel;
import com.airbyte.api.models.shared.DestinationMongodbPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationMongodbSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationMongodbSchemasAuthorization;
import com.airbyte.api.models.shared.DestinationMongodbSchemasInstance;
import com.airbyte.api.models.shared.DestinationMongodbSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationMongodbSchemasTunnelMethodTunnelMethod;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethod;
import com.airbyte.api.models.shared.DestinationMssql;
import com.airbyte.api.models.shared.DestinationMssqlNoTunnel;
import com.airbyte.api.models.shared.DestinationMssqlPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationMssqlSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationMssqlSchemasSslMethod;
import com.airbyte.api.models.shared.DestinationMssqlSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationMssqlSchemasTunnelMethodTunnelMethod;
import com.airbyte.api.models.shared.DestinationMssqlSslMethod;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethod;
import com.airbyte.api.models.shared.DestinationMysql;
import com.airbyte.api.models.shared.DestinationMysqlNoTunnel;
import com.airbyte.api.models.shared.DestinationMysqlPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationMysqlSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationMysqlSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationMysqlSchemasTunnelMethodTunnelMethod;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethod;
import com.airbyte.api.models.shared.DestinationOracle;
import com.airbyte.api.models.shared.DestinationOracleNoTunnel;
import com.airbyte.api.models.shared.DestinationOraclePasswordAuthentication;
import com.airbyte.api.models.shared.DestinationOracleSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationOracleSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationOracleSchemasTunnelMethodTunnelMethod;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethod;
import com.airbyte.api.models.shared.DestinationPatchRequest;
import com.airbyte.api.models.shared.DestinationPinecone;
import com.airbyte.api.models.shared.DestinationPineconeAzureOpenAI;
import com.airbyte.api.models.shared.DestinationPineconeByMarkdownHeader;
import com.airbyte.api.models.shared.DestinationPineconeByProgrammingLanguage;
import com.airbyte.api.models.shared.DestinationPineconeBySeparator;
import com.airbyte.api.models.shared.DestinationPineconeCohere;
import com.airbyte.api.models.shared.DestinationPineconeFake;
import com.airbyte.api.models.shared.DestinationPineconeFieldNameMappingConfigModel;
import com.airbyte.api.models.shared.DestinationPineconeIndexing;
import com.airbyte.api.models.shared.DestinationPineconeLanguage;
import com.airbyte.api.models.shared.DestinationPineconeMode;
import com.airbyte.api.models.shared.DestinationPineconeOpenAI;
import com.airbyte.api.models.shared.DestinationPineconeOpenAICompatible;
import com.airbyte.api.models.shared.DestinationPineconeProcessingConfigModel;
import com.airbyte.api.models.shared.DestinationPineconeSchemasEmbeddingEmbedding5Mode;
import com.airbyte.api.models.shared.DestinationPineconeSchemasEmbeddingEmbeddingMode;
import com.airbyte.api.models.shared.DestinationPineconeSchemasEmbeddingMode;
import com.airbyte.api.models.shared.DestinationPineconeSchemasMode;
import com.airbyte.api.models.shared.DestinationPineconeSchemasProcessingMode;
import com.airbyte.api.models.shared.DestinationPineconeSchemasProcessingTextSplitterMode;
import com.airbyte.api.models.shared.DestinationPineconeSchemasProcessingTextSplitterTextSplitterMode;
import com.airbyte.api.models.shared.DestinationPostgres;
import com.airbyte.api.models.shared.DestinationPostgresMode;
import com.airbyte.api.models.shared.DestinationPostgresNoTunnel;
import com.airbyte.api.models.shared.DestinationPostgresPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationPostgresSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationPostgresSchemasMode;
import com.airbyte.api.models.shared.DestinationPostgresSchemasSSLModeSSLModes6Mode;
import com.airbyte.api.models.shared.DestinationPostgresSchemasSSLModeSSLModesMode;
import com.airbyte.api.models.shared.DestinationPostgresSchemasSslModeMode;
import com.airbyte.api.models.shared.DestinationPostgresSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationPostgresSchemasTunnelMethodTunnelMethod;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethod;
import com.airbyte.api.models.shared.DestinationPubsub;
import com.airbyte.api.models.shared.DestinationQdrant;
import com.airbyte.api.models.shared.DestinationQdrantAzureOpenAI;
import com.airbyte.api.models.shared.DestinationQdrantByMarkdownHeader;
import com.airbyte.api.models.shared.DestinationQdrantByProgrammingLanguage;
import com.airbyte.api.models.shared.DestinationQdrantBySeparator;
import com.airbyte.api.models.shared.DestinationQdrantCohere;
import com.airbyte.api.models.shared.DestinationQdrantFake;
import com.airbyte.api.models.shared.DestinationQdrantFieldNameMappingConfigModel;
import com.airbyte.api.models.shared.DestinationQdrantIndexing;
import com.airbyte.api.models.shared.DestinationQdrantLanguage;
import com.airbyte.api.models.shared.DestinationQdrantMode;
import com.airbyte.api.models.shared.DestinationQdrantNoAuth;
import com.airbyte.api.models.shared.DestinationQdrantOpenAI;
import com.airbyte.api.models.shared.DestinationQdrantOpenAICompatible;
import com.airbyte.api.models.shared.DestinationQdrantProcessingConfigModel;
import com.airbyte.api.models.shared.DestinationQdrantSchemasEmbeddingEmbedding5Mode;
import com.airbyte.api.models.shared.DestinationQdrantSchemasEmbeddingEmbeddingMode;
import com.airbyte.api.models.shared.DestinationQdrantSchemasEmbeddingMode;
import com.airbyte.api.models.shared.DestinationQdrantSchemasIndexingAuthMethodMode;
import com.airbyte.api.models.shared.DestinationQdrantSchemasIndexingMode;
import com.airbyte.api.models.shared.DestinationQdrantSchemasMode;
import com.airbyte.api.models.shared.DestinationQdrantSchemasProcessingMode;
import com.airbyte.api.models.shared.DestinationQdrantSchemasProcessingTextSplitterMode;
import com.airbyte.api.models.shared.DestinationQdrantSchemasProcessingTextSplitterTextSplitterMode;
import com.airbyte.api.models.shared.DestinationRedis;
import com.airbyte.api.models.shared.DestinationRedisDisable;
import com.airbyte.api.models.shared.DestinationRedisMode;
import com.airbyte.api.models.shared.DestinationRedisNoTunnel;
import com.airbyte.api.models.shared.DestinationRedisPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationRedisSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationRedisSchemasMode;
import com.airbyte.api.models.shared.DestinationRedisSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedisSchemasTunnelMethodTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedisVerifyFull;
import com.airbyte.api.models.shared.DestinationRedshift;
import com.airbyte.api.models.shared.DestinationRedshiftEncryptionType;
import com.airbyte.api.models.shared.DestinationRedshiftMethod;
import com.airbyte.api.models.shared.DestinationRedshiftNoTunnel;
import com.airbyte.api.models.shared.DestinationRedshiftPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationRedshiftS3BucketRegion;
import com.airbyte.api.models.shared.DestinationRedshiftSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationRedshiftSchemasMethod;
import com.airbyte.api.models.shared.DestinationRedshiftSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedshiftSchemasTunnelMethodTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethod;
import com.airbyte.api.models.shared.DestinationS3;
import com.airbyte.api.models.shared.DestinationS3AvroApacheAvro;
import com.airbyte.api.models.shared.DestinationS3Bzip2;
import com.airbyte.api.models.shared.DestinationS3CSVCommaSeparatedValues;
import com.airbyte.api.models.shared.DestinationS3Codec;
import com.airbyte.api.models.shared.DestinationS3CompressionType;
import com.airbyte.api.models.shared.DestinationS3Deflate;
import com.airbyte.api.models.shared.DestinationS3Flattening;
import com.airbyte.api.models.shared.DestinationS3FormatType;
import com.airbyte.api.models.shared.DestinationS3GZIP;
import com.airbyte.api.models.shared.DestinationS3Glue;
import com.airbyte.api.models.shared.DestinationS3GlueCompressionType;
import com.airbyte.api.models.shared.DestinationS3GlueFormatType;
import com.airbyte.api.models.shared.DestinationS3GlueGZIP;
import com.airbyte.api.models.shared.DestinationS3GlueJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationS3GlueNoCompression;
import com.airbyte.api.models.shared.DestinationS3GlueS3BucketRegion;
import com.airbyte.api.models.shared.DestinationS3GlueSchemasCompressionType;
import com.airbyte.api.models.shared.DestinationS3JSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationS3NoCompression;
import com.airbyte.api.models.shared.DestinationS3ParquetColumnarStorage;
import com.airbyte.api.models.shared.DestinationS3S3BucketRegion;
import com.airbyte.api.models.shared.DestinationS3SchemasCodec;
import com.airbyte.api.models.shared.DestinationS3SchemasCompressionCodec;
import com.airbyte.api.models.shared.DestinationS3SchemasCompressionType;
import com.airbyte.api.models.shared.DestinationS3SchemasFlattening;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatCodec;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatCompressionType;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatFormatType;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatNoCompression;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatOutputFormat3Codec;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatOutputFormat3CompressionCodecCodec;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatOutputFormatCodec;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatOutputFormatCompressionType;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatOutputFormatFormatType;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatType;
import com.airbyte.api.models.shared.DestinationS3SchemasGZIP;
import com.airbyte.api.models.shared.DestinationS3SchemasNoCompression;
import com.airbyte.api.models.shared.DestinationS3Snappy;
import com.airbyte.api.models.shared.DestinationS3Xz;
import com.airbyte.api.models.shared.DestinationS3Zstandard;
import com.airbyte.api.models.shared.DestinationSftpJson;
import com.airbyte.api.models.shared.DestinationSnowflake;
import com.airbyte.api.models.shared.DestinationSnowflakeAuthType;
import com.airbyte.api.models.shared.DestinationSnowflakeOAuth20;
import com.airbyte.api.models.shared.DestinationSnowflakeSchemasAuthType;
import com.airbyte.api.models.shared.DestinationSnowflakeSchemasCredentialsAuthType;
import com.airbyte.api.models.shared.DestinationSnowflakeSnowflake;
import com.airbyte.api.models.shared.DestinationTeradata;
import com.airbyte.api.models.shared.DestinationTeradataAllow;
import com.airbyte.api.models.shared.DestinationTeradataDisable;
import com.airbyte.api.models.shared.DestinationTeradataMode;
import com.airbyte.api.models.shared.DestinationTeradataPrefer;
import com.airbyte.api.models.shared.DestinationTeradataRequire;
import com.airbyte.api.models.shared.DestinationTeradataSchemasMode;
import com.airbyte.api.models.shared.DestinationTeradataSchemasSSLModeSSLModes5Mode;
import com.airbyte.api.models.shared.DestinationTeradataSchemasSSLModeSSLModes6Mode;
import com.airbyte.api.models.shared.DestinationTeradataSchemasSSLModeSSLModesMode;
import com.airbyte.api.models.shared.DestinationTeradataSchemasSslModeMode;
import com.airbyte.api.models.shared.DestinationTeradataVerifyCa;
import com.airbyte.api.models.shared.DestinationTeradataVerifyFull;
import com.airbyte.api.models.shared.DestinationTimeplus;
import com.airbyte.api.models.shared.DestinationTypesense;
import com.airbyte.api.models.shared.DestinationVectara;
import com.airbyte.api.models.shared.DestinationVertica;
import com.airbyte.api.models.shared.DestinationVerticaNoTunnel;
import com.airbyte.api.models.shared.DestinationVerticaPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationVerticaSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationVerticaSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationVerticaSchemasTunnelMethodTunnelMethod;
import com.airbyte.api.models.shared.DestinationVerticaTunnelMethod;
import com.airbyte.api.models.shared.DestinationWeaviate;
import com.airbyte.api.models.shared.DestinationWeaviateAPIToken;
import com.airbyte.api.models.shared.DestinationWeaviateAzureOpenAI;
import com.airbyte.api.models.shared.DestinationWeaviateByMarkdownHeader;
import com.airbyte.api.models.shared.DestinationWeaviateByProgrammingLanguage;
import com.airbyte.api.models.shared.DestinationWeaviateBySeparator;
import com.airbyte.api.models.shared.DestinationWeaviateCohere;
import com.airbyte.api.models.shared.DestinationWeaviateFake;
import com.airbyte.api.models.shared.DestinationWeaviateFieldNameMappingConfigModel;
import com.airbyte.api.models.shared.DestinationWeaviateIndexing;
import com.airbyte.api.models.shared.DestinationWeaviateLanguage;
import com.airbyte.api.models.shared.DestinationWeaviateMode;
import com.airbyte.api.models.shared.DestinationWeaviateOpenAI;
import com.airbyte.api.models.shared.DestinationWeaviateOpenAICompatible;
import com.airbyte.api.models.shared.DestinationWeaviateProcessingConfigModel;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasEmbeddingEmbedding5Mode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasEmbeddingEmbedding6Mode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasEmbeddingEmbedding7Mode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasEmbeddingEmbeddingMode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasEmbeddingMode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasIndexingAuthAuthenticationMode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasIndexingAuthMode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasIndexingMode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasMode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasProcessingMode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasProcessingTextSplitterMode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasProcessingTextSplitterTextSplitterMode;
import com.airbyte.api.models.shared.DestinationWeaviateUsernamePassword;
import com.airbyte.api.models.shared.DestinationXata;
import com.airbyte.api.models.shared.DevNull;
import com.airbyte.api.models.shared.Disable;
import com.airbyte.api.models.shared.DistanceMetric;
import com.airbyte.api.models.shared.DocArrayHnswSearch;
import com.airbyte.api.models.shared.Duckdb;
import com.airbyte.api.models.shared.DynamoDBRegion;
import com.airbyte.api.models.shared.Dynamodb;
import com.airbyte.api.models.shared.Elasticsearch;
import com.airbyte.api.models.shared.EncryptedTrustServerCertificate;
import com.airbyte.api.models.shared.EncryptedVerifyCertificate;
import com.airbyte.api.models.shared.EncryptionType;
import com.airbyte.api.models.shared.ExternalTableViaS3;
import com.airbyte.api.models.shared.Fake;
import com.airbyte.api.models.shared.FieldNameMappingConfigModel;
import com.airbyte.api.models.shared.Firebolt;
import com.airbyte.api.models.shared.Firestore;
import com.airbyte.api.models.shared.Flattening;
import com.airbyte.api.models.shared.FormatType;
import com.airbyte.api.models.shared.FormatTypeWildcard;
import com.airbyte.api.models.shared.FromField;
import com.airbyte.api.models.shared.GCSBucketRegion;
import com.airbyte.api.models.shared.GCSStaging;
import com.airbyte.api.models.shared.GCSTmpFilesAfterwardProcessing;
import com.airbyte.api.models.shared.Gcs;
import com.airbyte.api.models.shared.Gzip;
import com.airbyte.api.models.shared.HMACKey;
import com.airbyte.api.models.shared.Header;
import com.airbyte.api.models.shared.IAMRole;
import com.airbyte.api.models.shared.IAMUser;
import com.airbyte.api.models.shared.Indexing;
import com.airbyte.api.models.shared.Instance;
import com.airbyte.api.models.shared.JSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.Keen;
import com.airbyte.api.models.shared.KeyPairAuthentication;
import com.airbyte.api.models.shared.Kinesis;
import com.airbyte.api.models.shared.Langchain;
import com.airbyte.api.models.shared.LoginPassword;
import com.airbyte.api.models.shared.Method;
import com.airbyte.api.models.shared.Milvus;
import com.airbyte.api.models.shared.Mode;
import com.airbyte.api.models.shared.MongoDBAtlas;
import com.airbyte.api.models.shared.Mongodb;
import com.airbyte.api.models.shared.Mssql;
import com.airbyte.api.models.shared.Mysql;
import com.airbyte.api.models.shared.NoAuth;
import com.airbyte.api.models.shared.NoAuthentication;
import com.airbyte.api.models.shared.NoCompression;
import com.airbyte.api.models.shared.NoEncryption;
import com.airbyte.api.models.shared.NoExternalEmbedding;
import com.airbyte.api.models.shared.NoTunnel;
import com.airbyte.api.models.shared.None;
import com.airbyte.api.models.shared.Normalization;
import com.airbyte.api.models.shared.NormalizationFlattening;
import com.airbyte.api.models.shared.OAuth20Credentials;
import com.airbyte.api.models.shared.OpenAI;
import com.airbyte.api.models.shared.OpenAICompatible;
import com.airbyte.api.models.shared.Oracle;
import com.airbyte.api.models.shared.ParquetColumnarStorage;
import com.airbyte.api.models.shared.PasswordAuthentication;
import com.airbyte.api.models.shared.Pinecone;
import com.airbyte.api.models.shared.Postgres;
import com.airbyte.api.models.shared.Prefer;
import com.airbyte.api.models.shared.ProcessingConfigModel;
import com.airbyte.api.models.shared.Pubsub;
import com.airbyte.api.models.shared.Qdrant;
import com.airbyte.api.models.shared.RecommendedManagedTables;
import com.airbyte.api.models.shared.Redis;
import com.airbyte.api.models.shared.Redshift;
import com.airbyte.api.models.shared.ReplicaSet;
import com.airbyte.api.models.shared.Require;
import com.airbyte.api.models.shared.S3;
import com.airbyte.api.models.shared.S3BucketRegion;
import com.airbyte.api.models.shared.S3Glue;
import com.airbyte.api.models.shared.SQLInserts;
import com.airbyte.api.models.shared.SSHKeyAuthentication;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.models.shared.SerializationLibrary;
import com.airbyte.api.models.shared.SftpJson;
import com.airbyte.api.models.shared.Silent;
import com.airbyte.api.models.shared.Snappy;
import com.airbyte.api.models.shared.StandaloneMongoDbInstance;
import com.airbyte.api.models.shared.Standard;
import com.airbyte.api.models.shared.StandardInserts;
import com.airbyte.api.models.shared.Teradata;
import com.airbyte.api.models.shared.TestDestinationType;
import com.airbyte.api.models.shared.Timeplus;
import com.airbyte.api.models.shared.TransformationQueryRunType;
import com.airbyte.api.models.shared.TunnelMethod;
import com.airbyte.api.models.shared.Typesense;
import com.airbyte.api.models.shared.UsernameAndPassword;
import com.airbyte.api.models.shared.UsernamePassword;
import com.airbyte.api.models.shared.Vectara;
import com.airbyte.api.models.shared.VerifyCa;
import com.airbyte.api.models.shared.VerifyFull;
import com.airbyte.api.models.shared.Vertica;
import com.airbyte.api.models.shared.Weaviate;
import com.airbyte.api.models.shared.Xata;
import com.airbyte.api.models.shared.Xz;
import com.airbyte.api.models.shared.Zstandard;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .security(Security.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .password("")
                        .username("")
                        .build())
                    .build())
                .build();

            PatchDestinationRequest req = PatchDestinationRequest.builder()
                .destinationId("<value>")
                .destinationPatchRequest(DestinationPatchRequest.builder()
                    DestinationConfiguration.of(DestinationGoogleSheets.builder()
                                .credentials(AuthenticationViaGoogleOAuth.builder()
                                        .clientId("<value>")
                                        .clientSecret("<value>")
                                        .refreshToken("<value>")
                                        .build())
                                .spreadsheetId("https://docs.google.com/spreadsheets/d/1hLd9Qqti3UyLXZB2aFfUWDT7BG/edit")
                                .build()))
                    .name("<value>")
                    .build())
                .build();

            PatchDestinationResponse res = sdk.destinations().patchDestination()
                .request(req)
                .call();

            if (res.destinationResponse().isPresent()) {
                // handle response
            }
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
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

**[Optional<? extends com.airbyte.api.models.operations.PatchDestinationResponse>](../../models/operations/PatchDestinationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## putDestination

Update a Destination and fully overwrite it

### Example Usage

```java
package hello.world;

import com.airbyte.api.airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.operations.PutDestinationRequest;
import com.airbyte.api.models.operations.PutDestinationResponse;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.AESCBCEnvelopeEncryption;
import com.airbyte.api.models.shared.AWSS3Staging;
import com.airbyte.api.models.shared.Allow;
import com.airbyte.api.models.shared.AmazonS3;
import com.airbyte.api.models.shared.ApiKeyAuth;
import com.airbyte.api.models.shared.ApiKeySecret;
import com.airbyte.api.models.shared.Astra;
import com.airbyte.api.models.shared.AuthenticationViaGoogleOAuth;
import com.airbyte.api.models.shared.AvroApacheAvro;
import com.airbyte.api.models.shared.AwsDatalake;
import com.airbyte.api.models.shared.AzureBlobStorage;
import com.airbyte.api.models.shared.AzureOpenAI;
import com.airbyte.api.models.shared.Bigquery;
import com.airbyte.api.models.shared.ByMarkdownHeader;
import com.airbyte.api.models.shared.ByProgrammingLanguage;
import com.airbyte.api.models.shared.BySeparator;
import com.airbyte.api.models.shared.Bzip2;
import com.airbyte.api.models.shared.CSVCommaSeparatedValues;
import com.airbyte.api.models.shared.CacheType;
import com.airbyte.api.models.shared.ChooseHowToPartitionData;
import com.airbyte.api.models.shared.ChromaLocalPersistance;
import com.airbyte.api.models.shared.Clickhouse;
import com.airbyte.api.models.shared.Codec;
import com.airbyte.api.models.shared.Cohere;
import com.airbyte.api.models.shared.CompressionCodecOptional;
import com.airbyte.api.models.shared.CompressionType;
import com.airbyte.api.models.shared.Convex;
import com.airbyte.api.models.shared.CredentialType;
import com.airbyte.api.models.shared.CredentialsTitle;
import com.airbyte.api.models.shared.Cumulio;
import com.airbyte.api.models.shared.DataSourceType;
import com.airbyte.api.models.shared.Databend;
import com.airbyte.api.models.shared.Databricks;
import com.airbyte.api.models.shared.DatasetLocation;
import com.airbyte.api.models.shared.DefaultVectorizer;
import com.airbyte.api.models.shared.Deflate;
import com.airbyte.api.models.shared.DestinationAstra;
import com.airbyte.api.models.shared.DestinationAstraLanguage;
import com.airbyte.api.models.shared.DestinationAstraMode;
import com.airbyte.api.models.shared.DestinationAstraSchemasEmbeddingEmbedding1Mode;
import com.airbyte.api.models.shared.DestinationAstraSchemasEmbeddingEmbeddingMode;
import com.airbyte.api.models.shared.DestinationAstraSchemasEmbeddingMode;
import com.airbyte.api.models.shared.DestinationAstraSchemasMode;
import com.airbyte.api.models.shared.DestinationAstraSchemasProcessingMode;
import com.airbyte.api.models.shared.DestinationAstraSchemasProcessingTextSplitterMode;
import com.airbyte.api.models.shared.DestinationAstraSchemasProcessingTextSplitterTextSplitterMode;
import com.airbyte.api.models.shared.DestinationAwsDatalake;
import com.airbyte.api.models.shared.DestinationAwsDatalakeCompressionCodecOptional;
import com.airbyte.api.models.shared.DestinationAwsDatalakeCredentialsTitle;
import com.airbyte.api.models.shared.DestinationAwsDatalakeFormatTypeWildcard;
import com.airbyte.api.models.shared.DestinationAzureBlobStorage;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageFormatType;
import com.airbyte.api.models.shared.DestinationAzureBlobStorageJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationBigquery;
import com.airbyte.api.models.shared.DestinationBigqueryCredentialType;
import com.airbyte.api.models.shared.DestinationBigqueryHMACKey;
import com.airbyte.api.models.shared.DestinationBigqueryMethod;
import com.airbyte.api.models.shared.DestinationClickhouse;
import com.airbyte.api.models.shared.DestinationClickhouseSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationClickhouseTunnelMethod;
import com.airbyte.api.models.shared.DestinationConvex;
import com.airbyte.api.models.shared.DestinationCumulio;
import com.airbyte.api.models.shared.DestinationDatabend;
import com.airbyte.api.models.shared.DestinationDatabricks;
import com.airbyte.api.models.shared.DestinationDatabricksAzureBlobStorage;
import com.airbyte.api.models.shared.DestinationDatabricksDataSourceType;
import com.airbyte.api.models.shared.DestinationDatabricksS3BucketRegion;
import com.airbyte.api.models.shared.DestinationDatabricksSchemasDataSourceType;
import com.airbyte.api.models.shared.DestinationDevNull;
import com.airbyte.api.models.shared.DestinationDuckdb;
import com.airbyte.api.models.shared.DestinationDynamodb;
import com.airbyte.api.models.shared.DestinationElasticsearch;
import com.airbyte.api.models.shared.DestinationElasticsearchMethod;
import com.airbyte.api.models.shared.DestinationElasticsearchSchemasMethod;
import com.airbyte.api.models.shared.DestinationFirebolt;
import com.airbyte.api.models.shared.DestinationFireboltMethod;
import com.airbyte.api.models.shared.DestinationFireboltSchemasMethod;
import com.airbyte.api.models.shared.DestinationFirestore;
import com.airbyte.api.models.shared.DestinationGcs;
import com.airbyte.api.models.shared.DestinationGcsCSVCommaSeparatedValues;
import com.airbyte.api.models.shared.DestinationGcsCodec;
import com.airbyte.api.models.shared.DestinationGcsCompressionCodec;
import com.airbyte.api.models.shared.DestinationGcsCompressionType;
import com.airbyte.api.models.shared.DestinationGcsFormatType;
import com.airbyte.api.models.shared.DestinationGcsGZIP;
import com.airbyte.api.models.shared.DestinationGcsJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationGcsNoCompression;
import com.airbyte.api.models.shared.DestinationGcsParquetColumnarStorage;
import com.airbyte.api.models.shared.DestinationGcsSchemasCodec;
import com.airbyte.api.models.shared.DestinationGcsSchemasCompressionType;
import com.airbyte.api.models.shared.DestinationGcsSchemasFormatCodec;
import com.airbyte.api.models.shared.DestinationGcsSchemasFormatCompressionType;
import com.airbyte.api.models.shared.DestinationGcsSchemasFormatFormatType;
import com.airbyte.api.models.shared.DestinationGcsSchemasFormatOutputFormat1Codec;
import com.airbyte.api.models.shared.DestinationGcsSchemasFormatOutputFormatCodec;
import com.airbyte.api.models.shared.DestinationGcsSchemasFormatOutputFormatFormatType;
import com.airbyte.api.models.shared.DestinationGcsSchemasFormatType;
import com.airbyte.api.models.shared.DestinationGcsSchemasNoCompression;
import com.airbyte.api.models.shared.DestinationGoogleSheets;
import com.airbyte.api.models.shared.DestinationGoogleSheetsGoogleSheets;
import com.airbyte.api.models.shared.DestinationKeen;
import com.airbyte.api.models.shared.DestinationKinesis;
import com.airbyte.api.models.shared.DestinationLangchain;
import com.airbyte.api.models.shared.DestinationLangchainFake;
import com.airbyte.api.models.shared.DestinationLangchainMode;
import com.airbyte.api.models.shared.DestinationLangchainOpenAI;
import com.airbyte.api.models.shared.DestinationLangchainPinecone;
import com.airbyte.api.models.shared.DestinationLangchainProcessingConfigModel;
import com.airbyte.api.models.shared.DestinationLangchainSchemasIndexingIndexing3Mode;
import com.airbyte.api.models.shared.DestinationLangchainSchemasIndexingIndexingMode;
import com.airbyte.api.models.shared.DestinationLangchainSchemasIndexingMode;
import com.airbyte.api.models.shared.DestinationLangchainSchemasMode;
import com.airbyte.api.models.shared.DestinationMilvus;
import com.airbyte.api.models.shared.DestinationMilvusAPIToken;
import com.airbyte.api.models.shared.DestinationMilvusAzureOpenAI;
import com.airbyte.api.models.shared.DestinationMilvusByMarkdownHeader;
import com.airbyte.api.models.shared.DestinationMilvusByProgrammingLanguage;
import com.airbyte.api.models.shared.DestinationMilvusBySeparator;
import com.airbyte.api.models.shared.DestinationMilvusCohere;
import com.airbyte.api.models.shared.DestinationMilvusFake;
import com.airbyte.api.models.shared.DestinationMilvusFieldNameMappingConfigModel;
import com.airbyte.api.models.shared.DestinationMilvusIndexing;
import com.airbyte.api.models.shared.DestinationMilvusLanguage;
import com.airbyte.api.models.shared.DestinationMilvusMode;
import com.airbyte.api.models.shared.DestinationMilvusOpenAI;
import com.airbyte.api.models.shared.DestinationMilvusOpenAICompatible;
import com.airbyte.api.models.shared.DestinationMilvusProcessingConfigModel;
import com.airbyte.api.models.shared.DestinationMilvusSchemasEmbeddingEmbedding5Mode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasEmbeddingEmbeddingMode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasEmbeddingMode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasIndexingAuthAuthenticationMode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasIndexingAuthMode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasIndexingMode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasMode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasProcessingMode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasProcessingTextSplitterMode;
import com.airbyte.api.models.shared.DestinationMilvusSchemasProcessingTextSplitterTextSplitterMode;
import com.airbyte.api.models.shared.DestinationMilvusUsernamePassword;
import com.airbyte.api.models.shared.DestinationMongodb;
import com.airbyte.api.models.shared.DestinationMongodbAuthorization;
import com.airbyte.api.models.shared.DestinationMongodbInstance;
import com.airbyte.api.models.shared.DestinationMongodbNoTunnel;
import com.airbyte.api.models.shared.DestinationMongodbPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationMongodbSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationMongodbSchemasAuthorization;
import com.airbyte.api.models.shared.DestinationMongodbSchemasInstance;
import com.airbyte.api.models.shared.DestinationMongodbSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationMongodbSchemasTunnelMethodTunnelMethod;
import com.airbyte.api.models.shared.DestinationMongodbTunnelMethod;
import com.airbyte.api.models.shared.DestinationMssql;
import com.airbyte.api.models.shared.DestinationMssqlNoTunnel;
import com.airbyte.api.models.shared.DestinationMssqlPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationMssqlSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationMssqlSchemasSslMethod;
import com.airbyte.api.models.shared.DestinationMssqlSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationMssqlSchemasTunnelMethodTunnelMethod;
import com.airbyte.api.models.shared.DestinationMssqlSslMethod;
import com.airbyte.api.models.shared.DestinationMssqlTunnelMethod;
import com.airbyte.api.models.shared.DestinationMysql;
import com.airbyte.api.models.shared.DestinationMysqlNoTunnel;
import com.airbyte.api.models.shared.DestinationMysqlPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationMysqlSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationMysqlSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationMysqlSchemasTunnelMethodTunnelMethod;
import com.airbyte.api.models.shared.DestinationMysqlTunnelMethod;
import com.airbyte.api.models.shared.DestinationOracle;
import com.airbyte.api.models.shared.DestinationOracleNoTunnel;
import com.airbyte.api.models.shared.DestinationOraclePasswordAuthentication;
import com.airbyte.api.models.shared.DestinationOracleSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationOracleSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationOracleSchemasTunnelMethodTunnelMethod;
import com.airbyte.api.models.shared.DestinationOracleTunnelMethod;
import com.airbyte.api.models.shared.DestinationPinecone;
import com.airbyte.api.models.shared.DestinationPineconeAzureOpenAI;
import com.airbyte.api.models.shared.DestinationPineconeByMarkdownHeader;
import com.airbyte.api.models.shared.DestinationPineconeByProgrammingLanguage;
import com.airbyte.api.models.shared.DestinationPineconeBySeparator;
import com.airbyte.api.models.shared.DestinationPineconeCohere;
import com.airbyte.api.models.shared.DestinationPineconeFake;
import com.airbyte.api.models.shared.DestinationPineconeFieldNameMappingConfigModel;
import com.airbyte.api.models.shared.DestinationPineconeIndexing;
import com.airbyte.api.models.shared.DestinationPineconeLanguage;
import com.airbyte.api.models.shared.DestinationPineconeMode;
import com.airbyte.api.models.shared.DestinationPineconeOpenAI;
import com.airbyte.api.models.shared.DestinationPineconeOpenAICompatible;
import com.airbyte.api.models.shared.DestinationPineconeProcessingConfigModel;
import com.airbyte.api.models.shared.DestinationPineconeSchemasEmbeddingEmbedding5Mode;
import com.airbyte.api.models.shared.DestinationPineconeSchemasEmbeddingEmbeddingMode;
import com.airbyte.api.models.shared.DestinationPineconeSchemasEmbeddingMode;
import com.airbyte.api.models.shared.DestinationPineconeSchemasMode;
import com.airbyte.api.models.shared.DestinationPineconeSchemasProcessingMode;
import com.airbyte.api.models.shared.DestinationPineconeSchemasProcessingTextSplitterMode;
import com.airbyte.api.models.shared.DestinationPineconeSchemasProcessingTextSplitterTextSplitterMode;
import com.airbyte.api.models.shared.DestinationPostgres;
import com.airbyte.api.models.shared.DestinationPostgresMode;
import com.airbyte.api.models.shared.DestinationPostgresNoTunnel;
import com.airbyte.api.models.shared.DestinationPostgresPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationPostgresSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationPostgresSchemasMode;
import com.airbyte.api.models.shared.DestinationPostgresSchemasSSLModeSSLModes6Mode;
import com.airbyte.api.models.shared.DestinationPostgresSchemasSSLModeSSLModesMode;
import com.airbyte.api.models.shared.DestinationPostgresSchemasSslModeMode;
import com.airbyte.api.models.shared.DestinationPostgresSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationPostgresSchemasTunnelMethodTunnelMethod;
import com.airbyte.api.models.shared.DestinationPostgresTunnelMethod;
import com.airbyte.api.models.shared.DestinationPubsub;
import com.airbyte.api.models.shared.DestinationPutRequest;
import com.airbyte.api.models.shared.DestinationQdrant;
import com.airbyte.api.models.shared.DestinationQdrantAzureOpenAI;
import com.airbyte.api.models.shared.DestinationQdrantByMarkdownHeader;
import com.airbyte.api.models.shared.DestinationQdrantByProgrammingLanguage;
import com.airbyte.api.models.shared.DestinationQdrantBySeparator;
import com.airbyte.api.models.shared.DestinationQdrantCohere;
import com.airbyte.api.models.shared.DestinationQdrantFake;
import com.airbyte.api.models.shared.DestinationQdrantFieldNameMappingConfigModel;
import com.airbyte.api.models.shared.DestinationQdrantIndexing;
import com.airbyte.api.models.shared.DestinationQdrantLanguage;
import com.airbyte.api.models.shared.DestinationQdrantMode;
import com.airbyte.api.models.shared.DestinationQdrantNoAuth;
import com.airbyte.api.models.shared.DestinationQdrantOpenAI;
import com.airbyte.api.models.shared.DestinationQdrantOpenAICompatible;
import com.airbyte.api.models.shared.DestinationQdrantProcessingConfigModel;
import com.airbyte.api.models.shared.DestinationQdrantSchemasEmbeddingEmbedding5Mode;
import com.airbyte.api.models.shared.DestinationQdrantSchemasEmbeddingEmbeddingMode;
import com.airbyte.api.models.shared.DestinationQdrantSchemasEmbeddingMode;
import com.airbyte.api.models.shared.DestinationQdrantSchemasIndexingAuthMethodMode;
import com.airbyte.api.models.shared.DestinationQdrantSchemasIndexingMode;
import com.airbyte.api.models.shared.DestinationQdrantSchemasMode;
import com.airbyte.api.models.shared.DestinationQdrantSchemasProcessingMode;
import com.airbyte.api.models.shared.DestinationQdrantSchemasProcessingTextSplitterMode;
import com.airbyte.api.models.shared.DestinationQdrantSchemasProcessingTextSplitterTextSplitterMode;
import com.airbyte.api.models.shared.DestinationRedis;
import com.airbyte.api.models.shared.DestinationRedisDisable;
import com.airbyte.api.models.shared.DestinationRedisMode;
import com.airbyte.api.models.shared.DestinationRedisNoTunnel;
import com.airbyte.api.models.shared.DestinationRedisPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationRedisSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationRedisSchemasMode;
import com.airbyte.api.models.shared.DestinationRedisSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedisSchemasTunnelMethodTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedisTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedisVerifyFull;
import com.airbyte.api.models.shared.DestinationRedshift;
import com.airbyte.api.models.shared.DestinationRedshiftEncryptionType;
import com.airbyte.api.models.shared.DestinationRedshiftMethod;
import com.airbyte.api.models.shared.DestinationRedshiftNoTunnel;
import com.airbyte.api.models.shared.DestinationRedshiftPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationRedshiftS3BucketRegion;
import com.airbyte.api.models.shared.DestinationRedshiftSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationRedshiftSchemasMethod;
import com.airbyte.api.models.shared.DestinationRedshiftSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedshiftSchemasTunnelMethodTunnelMethod;
import com.airbyte.api.models.shared.DestinationRedshiftTunnelMethod;
import com.airbyte.api.models.shared.DestinationS3;
import com.airbyte.api.models.shared.DestinationS3AvroApacheAvro;
import com.airbyte.api.models.shared.DestinationS3Bzip2;
import com.airbyte.api.models.shared.DestinationS3CSVCommaSeparatedValues;
import com.airbyte.api.models.shared.DestinationS3Codec;
import com.airbyte.api.models.shared.DestinationS3CompressionType;
import com.airbyte.api.models.shared.DestinationS3Deflate;
import com.airbyte.api.models.shared.DestinationS3Flattening;
import com.airbyte.api.models.shared.DestinationS3FormatType;
import com.airbyte.api.models.shared.DestinationS3GZIP;
import com.airbyte.api.models.shared.DestinationS3Glue;
import com.airbyte.api.models.shared.DestinationS3GlueCompressionType;
import com.airbyte.api.models.shared.DestinationS3GlueFormatType;
import com.airbyte.api.models.shared.DestinationS3GlueGZIP;
import com.airbyte.api.models.shared.DestinationS3GlueJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationS3GlueNoCompression;
import com.airbyte.api.models.shared.DestinationS3GlueS3BucketRegion;
import com.airbyte.api.models.shared.DestinationS3GlueSchemasCompressionType;
import com.airbyte.api.models.shared.DestinationS3JSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.DestinationS3NoCompression;
import com.airbyte.api.models.shared.DestinationS3ParquetColumnarStorage;
import com.airbyte.api.models.shared.DestinationS3S3BucketRegion;
import com.airbyte.api.models.shared.DestinationS3SchemasCodec;
import com.airbyte.api.models.shared.DestinationS3SchemasCompressionCodec;
import com.airbyte.api.models.shared.DestinationS3SchemasCompressionType;
import com.airbyte.api.models.shared.DestinationS3SchemasFlattening;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatCodec;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatCompressionType;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatFormatType;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatNoCompression;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatOutputFormat3Codec;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatOutputFormat3CompressionCodecCodec;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatOutputFormatCodec;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatOutputFormatCompressionType;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatOutputFormatFormatType;
import com.airbyte.api.models.shared.DestinationS3SchemasFormatType;
import com.airbyte.api.models.shared.DestinationS3SchemasGZIP;
import com.airbyte.api.models.shared.DestinationS3SchemasNoCompression;
import com.airbyte.api.models.shared.DestinationS3Snappy;
import com.airbyte.api.models.shared.DestinationS3Xz;
import com.airbyte.api.models.shared.DestinationS3Zstandard;
import com.airbyte.api.models.shared.DestinationSftpJson;
import com.airbyte.api.models.shared.DestinationSnowflake;
import com.airbyte.api.models.shared.DestinationSnowflakeAuthType;
import com.airbyte.api.models.shared.DestinationSnowflakeOAuth20;
import com.airbyte.api.models.shared.DestinationSnowflakeSchemasAuthType;
import com.airbyte.api.models.shared.DestinationSnowflakeSchemasCredentialsAuthType;
import com.airbyte.api.models.shared.DestinationSnowflakeSnowflake;
import com.airbyte.api.models.shared.DestinationTeradata;
import com.airbyte.api.models.shared.DestinationTeradataAllow;
import com.airbyte.api.models.shared.DestinationTeradataDisable;
import com.airbyte.api.models.shared.DestinationTeradataMode;
import com.airbyte.api.models.shared.DestinationTeradataPrefer;
import com.airbyte.api.models.shared.DestinationTeradataRequire;
import com.airbyte.api.models.shared.DestinationTeradataSchemasMode;
import com.airbyte.api.models.shared.DestinationTeradataSchemasSSLModeSSLModes5Mode;
import com.airbyte.api.models.shared.DestinationTeradataSchemasSSLModeSSLModes6Mode;
import com.airbyte.api.models.shared.DestinationTeradataSchemasSSLModeSSLModesMode;
import com.airbyte.api.models.shared.DestinationTeradataSchemasSslModeMode;
import com.airbyte.api.models.shared.DestinationTeradataVerifyCa;
import com.airbyte.api.models.shared.DestinationTeradataVerifyFull;
import com.airbyte.api.models.shared.DestinationTimeplus;
import com.airbyte.api.models.shared.DestinationTypesense;
import com.airbyte.api.models.shared.DestinationVectara;
import com.airbyte.api.models.shared.DestinationVertica;
import com.airbyte.api.models.shared.DestinationVerticaNoTunnel;
import com.airbyte.api.models.shared.DestinationVerticaPasswordAuthentication;
import com.airbyte.api.models.shared.DestinationVerticaSSHKeyAuthentication;
import com.airbyte.api.models.shared.DestinationVerticaSchemasTunnelMethod;
import com.airbyte.api.models.shared.DestinationVerticaSchemasTunnelMethodTunnelMethod;
import com.airbyte.api.models.shared.DestinationVerticaTunnelMethod;
import com.airbyte.api.models.shared.DestinationWeaviate;
import com.airbyte.api.models.shared.DestinationWeaviateAPIToken;
import com.airbyte.api.models.shared.DestinationWeaviateAzureOpenAI;
import com.airbyte.api.models.shared.DestinationWeaviateByMarkdownHeader;
import com.airbyte.api.models.shared.DestinationWeaviateByProgrammingLanguage;
import com.airbyte.api.models.shared.DestinationWeaviateBySeparator;
import com.airbyte.api.models.shared.DestinationWeaviateCohere;
import com.airbyte.api.models.shared.DestinationWeaviateFake;
import com.airbyte.api.models.shared.DestinationWeaviateFieldNameMappingConfigModel;
import com.airbyte.api.models.shared.DestinationWeaviateIndexing;
import com.airbyte.api.models.shared.DestinationWeaviateLanguage;
import com.airbyte.api.models.shared.DestinationWeaviateMode;
import com.airbyte.api.models.shared.DestinationWeaviateOpenAI;
import com.airbyte.api.models.shared.DestinationWeaviateOpenAICompatible;
import com.airbyte.api.models.shared.DestinationWeaviateProcessingConfigModel;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasEmbeddingEmbedding5Mode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasEmbeddingEmbedding6Mode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasEmbeddingEmbedding7Mode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasEmbeddingEmbeddingMode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasEmbeddingMode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasIndexingAuthAuthenticationMode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasIndexingAuthMode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasIndexingMode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasMode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasProcessingMode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasProcessingTextSplitterMode;
import com.airbyte.api.models.shared.DestinationWeaviateSchemasProcessingTextSplitterTextSplitterMode;
import com.airbyte.api.models.shared.DestinationWeaviateUsernamePassword;
import com.airbyte.api.models.shared.DestinationXata;
import com.airbyte.api.models.shared.DevNull;
import com.airbyte.api.models.shared.Disable;
import com.airbyte.api.models.shared.DistanceMetric;
import com.airbyte.api.models.shared.DocArrayHnswSearch;
import com.airbyte.api.models.shared.Duckdb;
import com.airbyte.api.models.shared.DynamoDBRegion;
import com.airbyte.api.models.shared.Dynamodb;
import com.airbyte.api.models.shared.Elasticsearch;
import com.airbyte.api.models.shared.EncryptedTrustServerCertificate;
import com.airbyte.api.models.shared.EncryptedVerifyCertificate;
import com.airbyte.api.models.shared.EncryptionType;
import com.airbyte.api.models.shared.ExternalTableViaS3;
import com.airbyte.api.models.shared.Fake;
import com.airbyte.api.models.shared.FieldNameMappingConfigModel;
import com.airbyte.api.models.shared.Firebolt;
import com.airbyte.api.models.shared.Firestore;
import com.airbyte.api.models.shared.Flattening;
import com.airbyte.api.models.shared.FormatType;
import com.airbyte.api.models.shared.FormatTypeWildcard;
import com.airbyte.api.models.shared.FromField;
import com.airbyte.api.models.shared.GCSBucketRegion;
import com.airbyte.api.models.shared.GCSStaging;
import com.airbyte.api.models.shared.GCSTmpFilesAfterwardProcessing;
import com.airbyte.api.models.shared.Gcs;
import com.airbyte.api.models.shared.Gzip;
import com.airbyte.api.models.shared.HMACKey;
import com.airbyte.api.models.shared.Header;
import com.airbyte.api.models.shared.IAMRole;
import com.airbyte.api.models.shared.IAMUser;
import com.airbyte.api.models.shared.Indexing;
import com.airbyte.api.models.shared.Instance;
import com.airbyte.api.models.shared.JSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.Keen;
import com.airbyte.api.models.shared.KeyPairAuthentication;
import com.airbyte.api.models.shared.Kinesis;
import com.airbyte.api.models.shared.Langchain;
import com.airbyte.api.models.shared.LoginPassword;
import com.airbyte.api.models.shared.Method;
import com.airbyte.api.models.shared.Milvus;
import com.airbyte.api.models.shared.Mode;
import com.airbyte.api.models.shared.MongoDBAtlas;
import com.airbyte.api.models.shared.Mongodb;
import com.airbyte.api.models.shared.Mssql;
import com.airbyte.api.models.shared.Mysql;
import com.airbyte.api.models.shared.NoAuth;
import com.airbyte.api.models.shared.NoAuthentication;
import com.airbyte.api.models.shared.NoCompression;
import com.airbyte.api.models.shared.NoEncryption;
import com.airbyte.api.models.shared.NoExternalEmbedding;
import com.airbyte.api.models.shared.NoTunnel;
import com.airbyte.api.models.shared.None;
import com.airbyte.api.models.shared.Normalization;
import com.airbyte.api.models.shared.NormalizationFlattening;
import com.airbyte.api.models.shared.OAuth20Credentials;
import com.airbyte.api.models.shared.OpenAI;
import com.airbyte.api.models.shared.OpenAICompatible;
import com.airbyte.api.models.shared.Oracle;
import com.airbyte.api.models.shared.ParquetColumnarStorage;
import com.airbyte.api.models.shared.PasswordAuthentication;
import com.airbyte.api.models.shared.Pinecone;
import com.airbyte.api.models.shared.Postgres;
import com.airbyte.api.models.shared.Prefer;
import com.airbyte.api.models.shared.ProcessingConfigModel;
import com.airbyte.api.models.shared.Pubsub;
import com.airbyte.api.models.shared.Qdrant;
import com.airbyte.api.models.shared.RecommendedManagedTables;
import com.airbyte.api.models.shared.Redis;
import com.airbyte.api.models.shared.Redshift;
import com.airbyte.api.models.shared.ReplicaSet;
import com.airbyte.api.models.shared.Require;
import com.airbyte.api.models.shared.S3;
import com.airbyte.api.models.shared.S3BucketRegion;
import com.airbyte.api.models.shared.S3Glue;
import com.airbyte.api.models.shared.SQLInserts;
import com.airbyte.api.models.shared.SSHKeyAuthentication;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.models.shared.SerializationLibrary;
import com.airbyte.api.models.shared.SftpJson;
import com.airbyte.api.models.shared.Silent;
import com.airbyte.api.models.shared.Snappy;
import com.airbyte.api.models.shared.StandaloneMongoDbInstance;
import com.airbyte.api.models.shared.Standard;
import com.airbyte.api.models.shared.StandardInserts;
import com.airbyte.api.models.shared.Teradata;
import com.airbyte.api.models.shared.TestDestinationType;
import com.airbyte.api.models.shared.Timeplus;
import com.airbyte.api.models.shared.TransformationQueryRunType;
import com.airbyte.api.models.shared.TunnelMethod;
import com.airbyte.api.models.shared.Typesense;
import com.airbyte.api.models.shared.UsernameAndPassword;
import com.airbyte.api.models.shared.UsernamePassword;
import com.airbyte.api.models.shared.Vectara;
import com.airbyte.api.models.shared.VerifyCa;
import com.airbyte.api.models.shared.VerifyFull;
import com.airbyte.api.models.shared.Vertica;
import com.airbyte.api.models.shared.Weaviate;
import com.airbyte.api.models.shared.Xata;
import com.airbyte.api.models.shared.Xz;
import com.airbyte.api.models.shared.Zstandard;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .security(Security.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .password("")
                        .username("")
                        .build())
                    .build())
                .build();

            PutDestinationRequest req = PutDestinationRequest.builder()
                .destinationId("<value>")
                .destinationPutRequest(DestinationPutRequest.builder()
                    .configuration(DestinationConfiguration.of(DestinationGoogleSheets.builder()
                                .credentials(AuthenticationViaGoogleOAuth.builder()
                                        .clientId("<value>")
                                        .clientSecret("<value>")
                                        .refreshToken("<value>")
                                        .build())
                                .spreadsheetId("https://docs.google.com/spreadsheets/d/1hLd9Qqti3UyLXZB2aFfUWDT7BG/edit")
                                .build()))
                    .name("<value>")
                    .build())
                .build();

            PutDestinationResponse res = sdk.destinations().putDestination()
                .request(req)
                .call();

            if (res.destinationResponse().isPresent()) {
                // handle response
            }
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
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

**[Optional<? extends com.airbyte.api.models.operations.PutDestinationResponse>](../../models/operations/PutDestinationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

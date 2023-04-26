# sources

### Available Operations

* [createSource](#createsource) - Create a source
* [deleteSource](#deletesource) - Delete a Source
* [getSource](#getsource) - Get Source details
* [initiateOAuth](#initiateoauth) - Initiate OAuth for a source
* [listSources](#listsources) - List sources

## createSource

Creates a source given a name, workspace id, and a json blob containing the configuration for the source.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateSourceResponse;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.models.shared.SourceAirtable;
import com.airbyte.api.models.shared.SourceAirtableAirtableEnum;
import com.airbyte.api.models.shared.SourceAirtableCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceAirtableCredentialsOAuth20AuthMethodEnum;
import com.airbyte.api.models.shared.SourceAirtableCredentialsPersonalAccessToken;
import com.airbyte.api.models.shared.SourceAirtableCredentialsPersonalAccessTokenAuthMethodEnum;
import com.airbyte.api.models.shared.SourceAlloydb;
import com.airbyte.api.models.shared.SourceAlloydbAlloydbEnum;
import com.airbyte.api.models.shared.SourceAlloydbReplicationMethodStandard;
import com.airbyte.api.models.shared.SourceAlloydbReplicationMethodStandardMethodEnum;
import com.airbyte.api.models.shared.SourceAlloydbTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.SourceAlloydbTunnelMethodNoTunnelTunnelMethodEnum;
import com.airbyte.api.models.shared.SourceAlloydbTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.SourceAlloydbTunnelMethodPasswordAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.SourceAlloydbTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourceAlloydbTunnelMethodSSHKeyAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.SourceAmazonAds;
import com.airbyte.api.models.shared.SourceAmazonAdsAmazonAdsEnum;
import com.airbyte.api.models.shared.SourceAmazonAdsAuthTypeEnum;
import com.airbyte.api.models.shared.SourceAmazonAdsRegionEnum;
import com.airbyte.api.models.shared.SourceAmazonAdsReportRecordTypesEnum;
import com.airbyte.api.models.shared.SourceAmazonAdsStateFilterEnum;
import com.airbyte.api.models.shared.SourceAmazonSellerPartner;
import com.airbyte.api.models.shared.SourceAmazonSellerPartnerAWSEnvironmentEnum;
import com.airbyte.api.models.shared.SourceAmazonSellerPartnerAWSRegionEnum;
import com.airbyte.api.models.shared.SourceAmazonSellerPartnerAmazonSellerPartnerEnum;
import com.airbyte.api.models.shared.SourceAmazonSellerPartnerAuthTypeEnum;
import com.airbyte.api.models.shared.SourceAmazonSqs;
import com.airbyte.api.models.shared.SourceAmazonSqsAWSRegionEnum;
import com.airbyte.api.models.shared.SourceAmazonSqsAmazonSqsEnum;
import com.airbyte.api.models.shared.SourceAmplitude;
import com.airbyte.api.models.shared.SourceAmplitudeAmplitudeEnum;
import com.airbyte.api.models.shared.SourceAmplitudeDataRegionEnum;
import com.airbyte.api.models.shared.SourceApifyDataset;
import com.airbyte.api.models.shared.SourceApifyDatasetApifyDatasetEnum;
import com.airbyte.api.models.shared.SourceAsana;
import com.airbyte.api.models.shared.SourceAsanaAsanaEnum;
import com.airbyte.api.models.shared.SourceAsanaCredentialsAuthenticateViaAsanaOauth;
import com.airbyte.api.models.shared.SourceAsanaCredentialsAuthenticateViaAsanaOauthCredentialsTitleEnum;
import com.airbyte.api.models.shared.SourceAsanaCredentialsAuthenticateWithPersonalAccessToken;
import com.airbyte.api.models.shared.SourceAsanaCredentialsAuthenticateWithPersonalAccessTokenCredentialsTitleEnum;
import com.airbyte.api.models.shared.SourceAuth0;
import com.airbyte.api.models.shared.SourceAuth0Auth0Enum;
import com.airbyte.api.models.shared.SourceAuth0CredentialsOAuth2AccessToken;
import com.airbyte.api.models.shared.SourceAuth0CredentialsOAuth2AccessTokenAuthenticationMethodEnum;
import com.airbyte.api.models.shared.SourceAuth0CredentialsOAuth2ConfidentialApplication;
import com.airbyte.api.models.shared.SourceAuth0CredentialsOAuth2ConfidentialApplicationAuthenticationMethodEnum;
import com.airbyte.api.models.shared.SourceAwsCloudtrail;
import com.airbyte.api.models.shared.SourceAwsCloudtrailAwsCloudtrailEnum;
import com.airbyte.api.models.shared.SourceAzureBlobStorage;
import com.airbyte.api.models.shared.SourceAzureBlobStorageAzureBlobStorageEnum;
import com.airbyte.api.models.shared.SourceAzureBlobStorageFormatJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.SourceAzureBlobStorageFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum;
import com.airbyte.api.models.shared.SourceAzureTable;
import com.airbyte.api.models.shared.SourceAzureTableAzureTableEnum;
import com.airbyte.api.models.shared.SourceBambooHr;
import com.airbyte.api.models.shared.SourceBambooHrBambooHrEnum;
import com.airbyte.api.models.shared.SourceBigcommerce;
import com.airbyte.api.models.shared.SourceBigcommerceBigcommerceEnum;
import com.airbyte.api.models.shared.SourceBigquery;
import com.airbyte.api.models.shared.SourceBigqueryBigqueryEnum;
import com.airbyte.api.models.shared.SourceBingAds;
import com.airbyte.api.models.shared.SourceBingAdsAuthMethodEnum;
import com.airbyte.api.models.shared.SourceBingAdsBingAdsEnum;
import com.airbyte.api.models.shared.SourceBraintree;
import com.airbyte.api.models.shared.SourceBraintreeBraintreeEnum;
import com.airbyte.api.models.shared.SourceBraintreeEnvironmentEnum;
import com.airbyte.api.models.shared.SourceBraze;
import com.airbyte.api.models.shared.SourceBrazeBrazeEnum;
import com.airbyte.api.models.shared.SourceChargebee;
import com.airbyte.api.models.shared.SourceChargebeeChargebeeEnum;
import com.airbyte.api.models.shared.SourceChargebeeProductCatalogEnum;
import com.airbyte.api.models.shared.SourceChartmogul;
import com.airbyte.api.models.shared.SourceChartmogulChartmogulEnum;
import com.airbyte.api.models.shared.SourceChartmogulIntervalEnum;
import com.airbyte.api.models.shared.SourceClickhouse;
import com.airbyte.api.models.shared.SourceClickhouseClickhouseEnum;
import com.airbyte.api.models.shared.SourceClickhouseTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.SourceClickhouseTunnelMethodNoTunnelTunnelMethodEnum;
import com.airbyte.api.models.shared.SourceClickhouseTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.SourceClickhouseTunnelMethodPasswordAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.SourceClickhouseTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourceClickhouseTunnelMethodSSHKeyAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.SourceClickupApi;
import com.airbyte.api.models.shared.SourceClickupApiClickupApiEnum;
import com.airbyte.api.models.shared.SourceCloseCom;
import com.airbyte.api.models.shared.SourceCloseComCloseComEnum;
import com.airbyte.api.models.shared.SourceCoda;
import com.airbyte.api.models.shared.SourceCodaCodaEnum;
import com.airbyte.api.models.shared.SourceCoinApi;
import com.airbyte.api.models.shared.SourceCoinApiCoinApiEnum;
import com.airbyte.api.models.shared.SourceCoinApiEnvironmentEnum;
import com.airbyte.api.models.shared.SourceCoinmarketcap;
import com.airbyte.api.models.shared.SourceCoinmarketcapCoinmarketcapEnum;
import com.airbyte.api.models.shared.SourceCoinmarketcapDataTypeEnum;
import com.airbyte.api.models.shared.SourceConfigcat;
import com.airbyte.api.models.shared.SourceConfigcatConfigcatEnum;
import com.airbyte.api.models.shared.SourceConfluence;
import com.airbyte.api.models.shared.SourceConfluenceConfluenceEnum;
import com.airbyte.api.models.shared.SourceCreateRequest;
import com.airbyte.api.models.shared.SourceDatascope;
import com.airbyte.api.models.shared.SourceDatascopeDatascopeEnum;
import com.airbyte.api.models.shared.SourceDelighted;
import com.airbyte.api.models.shared.SourceDelightedDelightedEnum;
import com.airbyte.api.models.shared.SourceDixa;
import com.airbyte.api.models.shared.SourceDixaDixaEnum;
import com.airbyte.api.models.shared.SourceDockerhub;
import com.airbyte.api.models.shared.SourceDockerhubDockerhubEnum;
import com.airbyte.api.models.shared.SourceDremio;
import com.airbyte.api.models.shared.SourceDremioDremioEnum;
import com.airbyte.api.models.shared.SourceDynamodb;
import com.airbyte.api.models.shared.SourceDynamodbDynamodbEnum;
import com.airbyte.api.models.shared.SourceDynamodbDynamodbRegionEnum;
import com.airbyte.api.models.shared.SourceE2eTestCloud;
import com.airbyte.api.models.shared.SourceE2eTestCloudE2eTestCloudEnum;
import com.airbyte.api.models.shared.SourceE2eTestCloudMockCatalogMultiSchema;
import com.airbyte.api.models.shared.SourceE2eTestCloudMockCatalogMultiSchemaTypeEnum;
import com.airbyte.api.models.shared.SourceE2eTestCloudMockCatalogSingleSchema;
import com.airbyte.api.models.shared.SourceE2eTestCloudMockCatalogSingleSchemaTypeEnum;
import com.airbyte.api.models.shared.SourceE2eTestCloudTypeEnum;
import com.airbyte.api.models.shared.SourceEmailoctopus;
import com.airbyte.api.models.shared.SourceEmailoctopusEmailoctopusEnum;
import com.airbyte.api.models.shared.SourceExchangeRates;
import com.airbyte.api.models.shared.SourceExchangeRatesExchangeRatesEnum;
import com.airbyte.api.models.shared.SourceFacebookMarketing;
import com.airbyte.api.models.shared.SourceFacebookMarketingFacebookMarketingEnum;
import com.airbyte.api.models.shared.SourceFacebookMarketingInsightConfig;
import com.airbyte.api.models.shared.SourceFacebookMarketingInsightConfigLevelEnum;
import com.airbyte.api.models.shared.SourceFacebookMarketingInsightConfigValidActionBreakdownsEnum;
import com.airbyte.api.models.shared.SourceFacebookMarketingInsightConfigValidBreakdownsEnum;
import com.airbyte.api.models.shared.SourceFacebookMarketingInsightConfigValidEnumsEnum;
import com.airbyte.api.models.shared.SourceFacebookPages;
import com.airbyte.api.models.shared.SourceFacebookPagesFacebookPagesEnum;
import com.airbyte.api.models.shared.SourceFaker;
import com.airbyte.api.models.shared.SourceFakerFakerEnum;
import com.airbyte.api.models.shared.SourceFauna;
import com.airbyte.api.models.shared.SourceFaunaCollection;
import com.airbyte.api.models.shared.SourceFaunaCollectionDeletionsDisabled;
import com.airbyte.api.models.shared.SourceFaunaCollectionDeletionsDisabledDeletionModeEnum;
import com.airbyte.api.models.shared.SourceFaunaCollectionDeletionsEnabled;
import com.airbyte.api.models.shared.SourceFaunaCollectionDeletionsEnabledDeletionModeEnum;
import com.airbyte.api.models.shared.SourceFaunaFaunaEnum;
import com.airbyte.api.models.shared.SourceFileSecure;
import com.airbyte.api.models.shared.SourceFileSecureFileFormatEnum;
import com.airbyte.api.models.shared.SourceFileSecureFileSecureEnum;
import com.airbyte.api.models.shared.SourceFileSecureProviderAzBlobAzureBlobStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderAzBlobAzureBlobStorageStorageEnum;
import com.airbyte.api.models.shared.SourceFileSecureProviderGCSGoogleCloudStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderGCSGoogleCloudStorageStorageEnum;
import com.airbyte.api.models.shared.SourceFileSecureProviderHTTPSPublicWeb;
import com.airbyte.api.models.shared.SourceFileSecureProviderHTTPSPublicWebStorageEnum;
import com.airbyte.api.models.shared.SourceFileSecureProviderS3AmazonWebServices;
import com.airbyte.api.models.shared.SourceFileSecureProviderS3AmazonWebServicesStorageEnum;
import com.airbyte.api.models.shared.SourceFileSecureProviderSCPSecureCopyProtocol;
import com.airbyte.api.models.shared.SourceFileSecureProviderSCPSecureCopyProtocolStorageEnum;
import com.airbyte.api.models.shared.SourceFileSecureProviderSFTPSecureFileTransferProtocol;
import com.airbyte.api.models.shared.SourceFileSecureProviderSFTPSecureFileTransferProtocolStorageEnum;
import com.airbyte.api.models.shared.SourceFileSecureProviderSSHSecureShell;
import com.airbyte.api.models.shared.SourceFileSecureProviderSSHSecureShellStorageEnum;
import com.airbyte.api.models.shared.SourceFirebolt;
import com.airbyte.api.models.shared.SourceFireboltFireboltEnum;
import com.airbyte.api.models.shared.SourceFreshcaller;
import com.airbyte.api.models.shared.SourceFreshcallerFreshcallerEnum;
import com.airbyte.api.models.shared.SourceFreshdesk;
import com.airbyte.api.models.shared.SourceFreshdeskFreshdeskEnum;
import com.airbyte.api.models.shared.SourceFreshsales;
import com.airbyte.api.models.shared.SourceFreshsalesFreshsalesEnum;
import com.airbyte.api.models.shared.SourceGcs;
import com.airbyte.api.models.shared.SourceGcsGcsEnum;
import com.airbyte.api.models.shared.SourceGetlago;
import com.airbyte.api.models.shared.SourceGetlagoGetlagoEnum;
import com.airbyte.api.models.shared.SourceGithub;
import com.airbyte.api.models.shared.SourceGithubCredentialsOAuth;
import com.airbyte.api.models.shared.SourceGithubCredentialsOAuthOptionTitleEnum;
import com.airbyte.api.models.shared.SourceGithubCredentialsPersonalAccessToken;
import com.airbyte.api.models.shared.SourceGithubCredentialsPersonalAccessTokenOptionTitleEnum;
import com.airbyte.api.models.shared.SourceGithubGithubEnum;
import com.airbyte.api.models.shared.SourceGitlab;
import com.airbyte.api.models.shared.SourceGitlabCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceGitlabCredentialsOAuth20AuthTypeEnum;
import com.airbyte.api.models.shared.SourceGitlabCredentialsPrivateToken;
import com.airbyte.api.models.shared.SourceGitlabCredentialsPrivateTokenAuthTypeEnum;
import com.airbyte.api.models.shared.SourceGitlabGitlabEnum;
import com.airbyte.api.models.shared.SourceGlassfrog;
import com.airbyte.api.models.shared.SourceGlassfrogGlassfrogEnum;
import com.airbyte.api.models.shared.SourceGnews;
import com.airbyte.api.models.shared.SourceGnewsCountryEnum;
import com.airbyte.api.models.shared.SourceGnewsGnewsEnum;
import com.airbyte.api.models.shared.SourceGnewsInEnum;
import com.airbyte.api.models.shared.SourceGnewsLanguageEnum;
import com.airbyte.api.models.shared.SourceGnewsNullableEnum;
import com.airbyte.api.models.shared.SourceGnewsSortByEnum;
import com.airbyte.api.models.shared.SourceGnewsTopHeadlinesTopicEnum;
import com.airbyte.api.models.shared.SourceGoogleAds;
import com.airbyte.api.models.shared.SourceGoogleAdsCustomQueries;
import com.airbyte.api.models.shared.SourceGoogleAdsGoogleAdsEnum;
import com.airbyte.api.models.shared.SourceGoogleAdsGoogleCredentials;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApi;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiCredentialsAuthenticateViaGoogleOauth;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiCredentialsAuthenticateViaGoogleOauthAuthTypeEnum;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiCredentialsServiceAccountKeyAuthentication;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiCredentialsServiceAccountKeyAuthenticationAuthTypeEnum;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiGoogleAnalyticsDataApiEnum;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsV4;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauth;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauthAuthTypeEnum;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsV4CredentialsServiceAccountKeyAuthentication;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsV4CredentialsServiceAccountKeyAuthenticationAuthTypeEnum;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsV4GoogleAnalyticsV4Enum;
import com.airbyte.api.models.shared.SourceGoogleDirectory;
import com.airbyte.api.models.shared.SourceGoogleDirectoryGoogleDirectoryEnum;
import com.airbyte.api.models.shared.SourceGoogleSearchConsole;
import com.airbyte.api.models.shared.SourceGoogleSearchConsoleAuthorizationOAuth;
import com.airbyte.api.models.shared.SourceGoogleSearchConsoleAuthorizationOAuthAuthTypeEnum;
import com.airbyte.api.models.shared.SourceGoogleSearchConsoleAuthorizationServiceAccountKeyAuthentication;
import com.airbyte.api.models.shared.SourceGoogleSearchConsoleAuthorizationServiceAccountKeyAuthenticationAuthTypeEnum;
import com.airbyte.api.models.shared.SourceGoogleSearchConsoleGoogleSearchConsoleEnum;
import com.airbyte.api.models.shared.SourceGoogleSheets;
import com.airbyte.api.models.shared.SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuth;
import com.airbyte.api.models.shared.SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuthAuthTypeEnum;
import com.airbyte.api.models.shared.SourceGoogleSheetsCredentialsServiceAccountKeyAuthentication;
import com.airbyte.api.models.shared.SourceGoogleSheetsCredentialsServiceAccountKeyAuthenticationAuthTypeEnum;
import com.airbyte.api.models.shared.SourceGoogleSheetsGoogleSheetsEnum;
import com.airbyte.api.models.shared.SourceGoogleWebfonts;
import com.airbyte.api.models.shared.SourceGoogleWebfontsGoogleWebfontsEnum;
import com.airbyte.api.models.shared.SourceGoogleWorkspaceAdminReports;
import com.airbyte.api.models.shared.SourceGoogleWorkspaceAdminReportsGoogleWorkspaceAdminReportsEnum;
import com.airbyte.api.models.shared.SourceGreenhouse;
import com.airbyte.api.models.shared.SourceGreenhouseGreenhouseEnum;
import com.airbyte.api.models.shared.SourceGridly;
import com.airbyte.api.models.shared.SourceGridlyGridlyEnum;
import com.airbyte.api.models.shared.SourceHarvest;
import com.airbyte.api.models.shared.SourceHarvestHarvestEnum;
import com.airbyte.api.models.shared.SourceHubplanner;
import com.airbyte.api.models.shared.SourceHubplannerHubplannerEnum;
import com.airbyte.api.models.shared.SourceHubspot;
import com.airbyte.api.models.shared.SourceHubspotCredentialsOAuth;
import com.airbyte.api.models.shared.SourceHubspotCredentialsOAuthCredentialsEnum;
import com.airbyte.api.models.shared.SourceHubspotCredentialsPrivateApp;
import com.airbyte.api.models.shared.SourceHubspotCredentialsPrivateAppCredentialsEnum;
import com.airbyte.api.models.shared.SourceHubspotHubspotEnum;
import com.airbyte.api.models.shared.SourceInsightly;
import com.airbyte.api.models.shared.SourceInsightlyInsightlyEnum;
import com.airbyte.api.models.shared.SourceInstagram;
import com.airbyte.api.models.shared.SourceInstagramInstagramEnum;
import com.airbyte.api.models.shared.SourceInstatus;
import com.airbyte.api.models.shared.SourceInstatusInstatusEnum;
import com.airbyte.api.models.shared.SourceIntercom;
import com.airbyte.api.models.shared.SourceIntercomIntercomEnum;
import com.airbyte.api.models.shared.SourceIp2whois;
import com.airbyte.api.models.shared.SourceIp2whoisIp2whoisEnum;
import com.airbyte.api.models.shared.SourceIterable;
import com.airbyte.api.models.shared.SourceIterableIterableEnum;
import com.airbyte.api.models.shared.SourceJira;
import com.airbyte.api.models.shared.SourceJiraJiraEnum;
import com.airbyte.api.models.shared.SourceK6Cloud;
import com.airbyte.api.models.shared.SourceK6CloudK6CloudEnum;
import com.airbyte.api.models.shared.SourceKlarna;
import com.airbyte.api.models.shared.SourceKlarnaKlarnaEnum;
import com.airbyte.api.models.shared.SourceKlarnaRegionEnum;
import com.airbyte.api.models.shared.SourceKlaviyo;
import com.airbyte.api.models.shared.SourceKlaviyoKlaviyoEnum;
import com.airbyte.api.models.shared.SourceKustomerSinger;
import com.airbyte.api.models.shared.SourceKustomerSingerKustomerSingerEnum;
import com.airbyte.api.models.shared.SourceLaunchdarkly;
import com.airbyte.api.models.shared.SourceLaunchdarklyLaunchdarklyEnum;
import com.airbyte.api.models.shared.SourceLemlist;
import com.airbyte.api.models.shared.SourceLemlistLemlistEnum;
import com.airbyte.api.models.shared.SourceLinkedinAds;
import com.airbyte.api.models.shared.SourceLinkedinAdsCredentialsAccessToken;
import com.airbyte.api.models.shared.SourceLinkedinAdsCredentialsAccessTokenAuthMethodEnum;
import com.airbyte.api.models.shared.SourceLinkedinAdsCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceLinkedinAdsCredentialsOAuth20AuthMethodEnum;
import com.airbyte.api.models.shared.SourceLinkedinAdsLinkedinAdsEnum;
import com.airbyte.api.models.shared.SourceLinkedinPages;
import com.airbyte.api.models.shared.SourceLinkedinPagesCredentialsAccessToken;
import com.airbyte.api.models.shared.SourceLinkedinPagesCredentialsAccessTokenAuthMethodEnum;
import com.airbyte.api.models.shared.SourceLinkedinPagesCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceLinkedinPagesCredentialsOAuth20AuthMethodEnum;
import com.airbyte.api.models.shared.SourceLinkedinPagesLinkedinPagesEnum;
import com.airbyte.api.models.shared.SourceLinnworks;
import com.airbyte.api.models.shared.SourceLinnworksLinnworksEnum;
import com.airbyte.api.models.shared.SourceLokalise;
import com.airbyte.api.models.shared.SourceLokaliseLokaliseEnum;
import com.airbyte.api.models.shared.SourceMailchimp;
import com.airbyte.api.models.shared.SourceMailchimpCredentialsAPIKey;
import com.airbyte.api.models.shared.SourceMailchimpCredentialsAPIKeyAuthTypeEnum;
import com.airbyte.api.models.shared.SourceMailchimpCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceMailchimpCredentialsOAuth20AuthTypeEnum;
import com.airbyte.api.models.shared.SourceMailchimpMailchimpEnum;
import com.airbyte.api.models.shared.SourceMailgun;
import com.airbyte.api.models.shared.SourceMailgunMailgunEnum;
import com.airbyte.api.models.shared.SourceMailjetSms;
import com.airbyte.api.models.shared.SourceMailjetSmsMailjetSmsEnum;
import com.airbyte.api.models.shared.SourceMarketo;
import com.airbyte.api.models.shared.SourceMarketoMarketoEnum;
import com.airbyte.api.models.shared.SourceMetabase;
import com.airbyte.api.models.shared.SourceMetabaseMetabaseEnum;
import com.airbyte.api.models.shared.SourceMicrosoftTeams;
import com.airbyte.api.models.shared.SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoft;
import com.airbyte.api.models.shared.SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftAuthTypeEnum;
import com.airbyte.api.models.shared.SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftOAuth20;
import com.airbyte.api.models.shared.SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftOAuth20AuthTypeEnum;
import com.airbyte.api.models.shared.SourceMicrosoftTeamsMicrosoftTeamsEnum;
import com.airbyte.api.models.shared.SourceMixpanel;
import com.airbyte.api.models.shared.SourceMixpanelCredentialsProjectSecret;
import com.airbyte.api.models.shared.SourceMixpanelCredentialsProjectSecretOptionTitleEnum;
import com.airbyte.api.models.shared.SourceMixpanelCredentialsServiceAccount;
import com.airbyte.api.models.shared.SourceMixpanelCredentialsServiceAccountOptionTitleEnum;
import com.airbyte.api.models.shared.SourceMixpanelMixpanelEnum;
import com.airbyte.api.models.shared.SourceMixpanelRegionEnum;
import com.airbyte.api.models.shared.SourceMonday;
import com.airbyte.api.models.shared.SourceMondayCredentialsAPIToken;
import com.airbyte.api.models.shared.SourceMondayCredentialsAPITokenAuthTypeEnum;
import com.airbyte.api.models.shared.SourceMondayCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceMondayCredentialsOAuth20AuthTypeEnum;
import com.airbyte.api.models.shared.SourceMondayMondayEnum;
import com.airbyte.api.models.shared.SourceMongodb;
import com.airbyte.api.models.shared.SourceMongodbInstanceTypeMongoDBAtlas;
import com.airbyte.api.models.shared.SourceMongodbInstanceTypeMongoDBAtlasInstanceEnum;
import com.airbyte.api.models.shared.SourceMongodbInstanceTypeReplicaSet;
import com.airbyte.api.models.shared.SourceMongodbInstanceTypeReplicaSetInstanceEnum;
import com.airbyte.api.models.shared.SourceMongodbInstanceTypeStandaloneMongoDbInstance;
import com.airbyte.api.models.shared.SourceMongodbInstanceTypeStandaloneMongoDbInstanceInstanceEnum;
import com.airbyte.api.models.shared.SourceMongodbMongodbEnum;
import com.airbyte.api.models.shared.SourceMssql;
import com.airbyte.api.models.shared.SourceMssqlMssqlEnum;
import com.airbyte.api.models.shared.SourceMssqlReplicationMethodLogicalReplicationCDC;
import com.airbyte.api.models.shared.SourceMssqlReplicationMethodLogicalReplicationCDCDataToSyncEnum;
import com.airbyte.api.models.shared.SourceMssqlReplicationMethodLogicalReplicationCDCInitialSnapshotIsolationLevelEnum;
import com.airbyte.api.models.shared.SourceMssqlReplicationMethodLogicalReplicationCDCMethodEnum;
import com.airbyte.api.models.shared.SourceMssqlReplicationMethodStandard;
import com.airbyte.api.models.shared.SourceMssqlReplicationMethodStandardMethodEnum;
import com.airbyte.api.models.shared.SourceMssqlSslMethodEncryptedTrustServerCertificate;
import com.airbyte.api.models.shared.SourceMssqlSslMethodEncryptedTrustServerCertificateSslMethodEnum;
import com.airbyte.api.models.shared.SourceMssqlSslMethodEncryptedVerifyCertificate;
import com.airbyte.api.models.shared.SourceMssqlSslMethodEncryptedVerifyCertificateSslMethodEnum;
import com.airbyte.api.models.shared.SourceMssqlTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.SourceMssqlTunnelMethodNoTunnelTunnelMethodEnum;
import com.airbyte.api.models.shared.SourceMssqlTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.SourceMssqlTunnelMethodPasswordAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.SourceMssqlTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourceMssqlTunnelMethodSSHKeyAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.SourceMyHours;
import com.airbyte.api.models.shared.SourceMyHoursMyHoursEnum;
import com.airbyte.api.models.shared.SourceMysql;
import com.airbyte.api.models.shared.SourceMysqlMysqlEnum;
import com.airbyte.api.models.shared.SourceMysqlReplicationMethodLogicalReplicationCDC;
import com.airbyte.api.models.shared.SourceMysqlReplicationMethodLogicalReplicationCDCMethodEnum;
import com.airbyte.api.models.shared.SourceMysqlReplicationMethodStandard;
import com.airbyte.api.models.shared.SourceMysqlReplicationMethodStandardMethodEnum;
import com.airbyte.api.models.shared.SourceMysqlSslModePreferred;
import com.airbyte.api.models.shared.SourceMysqlSslModePreferredModeEnum;
import com.airbyte.api.models.shared.SourceMysqlSslModeRequired;
import com.airbyte.api.models.shared.SourceMysqlSslModeRequiredModeEnum;
import com.airbyte.api.models.shared.SourceMysqlSslModeVerifyCA;
import com.airbyte.api.models.shared.SourceMysqlSslModeVerifyCAModeEnum;
import com.airbyte.api.models.shared.SourceMysqlSslModeVerifyIdentity;
import com.airbyte.api.models.shared.SourceMysqlSslModeVerifyIdentityModeEnum;
import com.airbyte.api.models.shared.SourceMysqlTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.SourceMysqlTunnelMethodNoTunnelTunnelMethodEnum;
import com.airbyte.api.models.shared.SourceMysqlTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.SourceMysqlTunnelMethodPasswordAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.SourceMysqlTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourceMysqlTunnelMethodSSHKeyAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.SourceNetsuite;
import com.airbyte.api.models.shared.SourceNetsuiteNetsuiteEnum;
import com.airbyte.api.models.shared.SourceNotion;
import com.airbyte.api.models.shared.SourceNotionCredentialsAccessToken;
import com.airbyte.api.models.shared.SourceNotionCredentialsAccessTokenAuthTypeEnum;
import com.airbyte.api.models.shared.SourceNotionCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceNotionCredentialsOAuth20AuthTypeEnum;
import com.airbyte.api.models.shared.SourceNotionNotionEnum;
import com.airbyte.api.models.shared.SourceNytimes;
import com.airbyte.api.models.shared.SourceNytimesNytimesEnum;
import com.airbyte.api.models.shared.SourceNytimesPeriodUsedForMostPopularStreamsEnum;
import com.airbyte.api.models.shared.SourceNytimesShareTypeUsedForMostPopularSharedStreamEnum;
import com.airbyte.api.models.shared.SourceOkta;
import com.airbyte.api.models.shared.SourceOktaCredentialsAPIToken;
import com.airbyte.api.models.shared.SourceOktaCredentialsAPITokenAuthTypeEnum;
import com.airbyte.api.models.shared.SourceOktaCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceOktaCredentialsOAuth20AuthTypeEnum;
import com.airbyte.api.models.shared.SourceOktaOktaEnum;
import com.airbyte.api.models.shared.SourceOmnisend;
import com.airbyte.api.models.shared.SourceOmnisendOmnisendEnum;
import com.airbyte.api.models.shared.SourceOnesignal;
import com.airbyte.api.models.shared.SourceOnesignalApplications;
import com.airbyte.api.models.shared.SourceOnesignalOnesignalEnum;
import com.airbyte.api.models.shared.SourceOpenweather;
import com.airbyte.api.models.shared.SourceOpenweatherLanguageEnum;
import com.airbyte.api.models.shared.SourceOpenweatherOpenweatherEnum;
import com.airbyte.api.models.shared.SourceOpenweatherUnitsEnum;
import com.airbyte.api.models.shared.SourceOracle;
import com.airbyte.api.models.shared.SourceOracleConnectionDataServiceName;
import com.airbyte.api.models.shared.SourceOracleConnectionDataServiceNameConnectionTypeEnum;
import com.airbyte.api.models.shared.SourceOracleConnectionDataSystemIDSID;
import com.airbyte.api.models.shared.SourceOracleConnectionDataSystemIDSIDConnectionTypeEnum;
import com.airbyte.api.models.shared.SourceOracleEncryptionNativeNetworkEncryptionNNE;
import com.airbyte.api.models.shared.SourceOracleEncryptionNativeNetworkEncryptionNNEEncryptionAlgorithmEnum;
import com.airbyte.api.models.shared.SourceOracleEncryptionNativeNetworkEncryptionNNEEncryptionMethodEnum;
import com.airbyte.api.models.shared.SourceOracleEncryptionTLSEncryptedVerifyCertificate;
import com.airbyte.api.models.shared.SourceOracleEncryptionTLSEncryptedVerifyCertificateEncryptionMethodEnum;
import com.airbyte.api.models.shared.SourceOracleOracleEnum;
import com.airbyte.api.models.shared.SourceOracleTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.SourceOracleTunnelMethodNoTunnelTunnelMethodEnum;
import com.airbyte.api.models.shared.SourceOracleTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.SourceOracleTunnelMethodPasswordAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.SourceOracleTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourceOracleTunnelMethodSSHKeyAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.SourceOrb;
import com.airbyte.api.models.shared.SourceOrbOrbEnum;
import com.airbyte.api.models.shared.SourceOrbit;
import com.airbyte.api.models.shared.SourceOrbitOrbitEnum;
import com.airbyte.api.models.shared.SourceOutreach;
import com.airbyte.api.models.shared.SourceOutreachOutreachEnum;
import com.airbyte.api.models.shared.SourcePaypalTransaction;
import com.airbyte.api.models.shared.SourcePaypalTransactionPaypalTransactionEnum;
import com.airbyte.api.models.shared.SourcePaystack;
import com.airbyte.api.models.shared.SourcePaystackPaystackEnum;
import com.airbyte.api.models.shared.SourcePendo;
import com.airbyte.api.models.shared.SourcePendoPendoEnum;
import com.airbyte.api.models.shared.SourcePersistiq;
import com.airbyte.api.models.shared.SourcePersistiqPersistiqEnum;
import com.airbyte.api.models.shared.SourcePexelsApi;
import com.airbyte.api.models.shared.SourcePexelsApiPexelsApiEnum;
import com.airbyte.api.models.shared.SourcePinterest;
import com.airbyte.api.models.shared.SourcePinterestCredentialsAccessToken;
import com.airbyte.api.models.shared.SourcePinterestCredentialsAccessTokenAuthMethodEnum;
import com.airbyte.api.models.shared.SourcePinterestCredentialsOAuth20;
import com.airbyte.api.models.shared.SourcePinterestCredentialsOAuth20AuthMethodEnum;
import com.airbyte.api.models.shared.SourcePinterestPinterestEnum;
import com.airbyte.api.models.shared.SourcePinterestStatusEnum;
import com.airbyte.api.models.shared.SourcePipedrive;
import com.airbyte.api.models.shared.SourcePipedriveAPIKeyAuthentication;
import com.airbyte.api.models.shared.SourcePipedriveAPIKeyAuthenticationAuthTypeEnum;
import com.airbyte.api.models.shared.SourcePipedrivePipedriveEnum;
import com.airbyte.api.models.shared.SourcePocket;
import com.airbyte.api.models.shared.SourcePocketContentTypeEnum;
import com.airbyte.api.models.shared.SourcePocketDetailTypeEnum;
import com.airbyte.api.models.shared.SourcePocketPocketEnum;
import com.airbyte.api.models.shared.SourcePocketSortByEnum;
import com.airbyte.api.models.shared.SourcePocketStateEnum;
import com.airbyte.api.models.shared.SourcePokeapi;
import com.airbyte.api.models.shared.SourcePokeapiPokeapiEnum;
import com.airbyte.api.models.shared.SourcePolygonStockApi;
import com.airbyte.api.models.shared.SourcePolygonStockApiPolygonStockApiEnum;
import com.airbyte.api.models.shared.SourcePostgres;
import com.airbyte.api.models.shared.SourcePostgresPostgresEnum;
import com.airbyte.api.models.shared.SourcePostgresReplicationMethodStandard;
import com.airbyte.api.models.shared.SourcePostgresReplicationMethodStandardMethodEnum;
import com.airbyte.api.models.shared.SourcePostgresTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.SourcePostgresTunnelMethodNoTunnelTunnelMethodEnum;
import com.airbyte.api.models.shared.SourcePostgresTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.SourcePostgresTunnelMethodPasswordAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.SourcePostgresTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourcePostgresTunnelMethodSSHKeyAuthenticationTunnelMethodEnum;
import com.airbyte.api.models.shared.SourcePosthog;
import com.airbyte.api.models.shared.SourcePosthogPosthogEnum;
import com.airbyte.api.models.shared.SourcePostmarkapp;
import com.airbyte.api.models.shared.SourcePostmarkappPostmarkappEnum;
import com.airbyte.api.models.shared.SourcePrestashop;
import com.airbyte.api.models.shared.SourcePrestashopPrestashopEnum;
import com.airbyte.api.models.shared.SourcePublicApis;
import com.airbyte.api.models.shared.SourcePublicApisPublicApisEnum;
import com.airbyte.api.models.shared.SourcePunkApi;
import com.airbyte.api.models.shared.SourcePunkApiPunkApiEnum;
import com.airbyte.api.models.shared.SourcePypi;
import com.airbyte.api.models.shared.SourcePypiPypiEnum;
import com.airbyte.api.models.shared.SourceQualaroo;
import com.airbyte.api.models.shared.SourceQualarooQualarooEnum;
import com.airbyte.api.models.shared.SourceQuickbooks;
import com.airbyte.api.models.shared.SourceQuickbooksCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceQuickbooksCredentialsOAuth20AuthTypeEnum;
import com.airbyte.api.models.shared.SourceQuickbooksQuickbooksEnum;
import com.airbyte.api.models.shared.SourceRailz;
import com.airbyte.api.models.shared.SourceRailzRailzEnum;
import com.airbyte.api.models.shared.SourceRecharge;
import com.airbyte.api.models.shared.SourceRechargeRechargeEnum;
import com.airbyte.api.models.shared.SourceRecreation;
import com.airbyte.api.models.shared.SourceRecreationRecreationEnum;
import com.airbyte.api.models.shared.SourceRecruitee;
import com.airbyte.api.models.shared.SourceRecruiteeRecruiteeEnum;
import com.airbyte.api.models.shared.SourceRecurly;
import com.airbyte.api.models.shared.SourceRecurlyRecurlyEnum;
import com.airbyte.api.models.shared.SourceRedshift;
import com.airbyte.api.models.shared.SourceRedshiftRedshiftEnum;
import com.airbyte.api.models.shared.SourceRetently;
import com.airbyte.api.models.shared.SourceRetentlyRetentlyEnum;
import com.airbyte.api.models.shared.SourceRkiCovid;
import com.airbyte.api.models.shared.SourceRkiCovidRkiCovidEnum;
import com.airbyte.api.models.shared.SourceRss;
import com.airbyte.api.models.shared.SourceRssRssEnum;
import com.airbyte.api.models.shared.SourceS3;
import com.airbyte.api.models.shared.SourceS3FormatAvro;
import com.airbyte.api.models.shared.SourceS3FormatAvroFiletypeEnum;
import com.airbyte.api.models.shared.SourceS3FormatCSV;
import com.airbyte.api.models.shared.SourceS3FormatCSVFiletypeEnum;
import com.airbyte.api.models.shared.SourceS3FormatJsonl;
import com.airbyte.api.models.shared.SourceS3FormatJsonlFiletypeEnum;
import com.airbyte.api.models.shared.SourceS3FormatJsonlUnexpectedFieldBehaviorEnum;
import com.airbyte.api.models.shared.SourceS3FormatParquet;
import com.airbyte.api.models.shared.SourceS3FormatParquetFiletypeEnum;
import com.airbyte.api.models.shared.SourceS3S3AmazonWebServices;
import com.airbyte.api.models.shared.SourceS3S3Enum;
import com.airbyte.api.models.shared.SourceSalesforce;
import com.airbyte.api.models.shared.SourceSalesforceAuthTypeEnum;
import com.airbyte.api.models.shared.SourceSalesforceSalesforceEnum;
import com.airbyte.api.models.shared.SourceSalesforceSinger;
import com.airbyte.api.models.shared.SourceSalesforceSingerApiTypeEnum;
import com.airbyte.api.models.shared.SourceSalesforceSingerSalesforceSingerEnum;
import com.airbyte.api.models.shared.SourceSalesforceStreamsCriteria;
import com.airbyte.api.models.shared.SourceSalesforceStreamsCriteriaSearchCriteriaEnum;
import com.airbyte.api.models.shared.SourceSalesloft;
import com.airbyte.api.models.shared.SourceSalesloftCredentialsAuthenticateViaAPIKey;
import com.airbyte.api.models.shared.SourceSalesloftCredentialsAuthenticateViaAPIKeyAuthTypeEnum;
import com.airbyte.api.models.shared.SourceSalesloftCredentialsAuthenticateViaOAuth;
import com.airbyte.api.models.shared.SourceSalesloftCredentialsAuthenticateViaOAuthAuthTypeEnum;
import com.airbyte.api.models.shared.SourceSalesloftSalesloftEnum;
import com.airbyte.api.models.shared.SourceSapFieldglass;
import com.airbyte.api.models.shared.SourceSapFieldglassSapFieldglassEnum;
import com.airbyte.api.models.shared.SourceSecoda;
import com.airbyte.api.models.shared.SourceSecodaSecodaEnum;
import com.airbyte.api.models.shared.SourceSendgrid;
import com.airbyte.api.models.shared.SourceSendgridSendgridEnum;
import com.airbyte.api.models.shared.SourceSendinblue;
import com.airbyte.api.models.shared.SourceSendinblueSendinblueEnum;
import com.airbyte.api.models.shared.SourceSenseforce;
import com.airbyte.api.models.shared.SourceSenseforceSenseforceEnum;
import com.airbyte.api.models.shared.SourceSentry;
import com.airbyte.api.models.shared.SourceSentrySentryEnum;
import com.airbyte.api.models.shared.SourceSftp;
import com.airbyte.api.models.shared.SourceSftpBulk;
import com.airbyte.api.models.shared.SourceSftpBulkFileTypeEnum;
import com.airbyte.api.models.shared.SourceSftpBulkSftpBulkEnum;
import com.airbyte.api.models.shared.SourceSftpCredentialsPasswordAuthentication;
import com.airbyte.api.models.shared.SourceSftpCredentialsPasswordAuthenticationAuthMethodEnum;
import com.airbyte.api.models.shared.SourceSftpCredentialsSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourceSftpCredentialsSSHKeyAuthenticationAuthMethodEnum;
import com.airbyte.api.models.shared.SourceSftpSftpEnum;
import com.airbyte.api.models.shared.SourceShopify;
import com.airbyte.api.models.shared.SourceShopifyCredentialsAPIPassword;
import com.airbyte.api.models.shared.SourceShopifyCredentialsAPIPasswordAuthMethodEnum;
import com.airbyte.api.models.shared.SourceShopifyCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceShopifyCredentialsOAuth20AuthMethodEnum;
import com.airbyte.api.models.shared.SourceShopifyShopifyEnum;
import com.airbyte.api.models.shared.SourceShortio;
import com.airbyte.api.models.shared.SourceShortioShortioEnum;
import com.airbyte.api.models.shared.SourceSlack;
import com.airbyte.api.models.shared.SourceSlackCredentialsAPIToken;
import com.airbyte.api.models.shared.SourceSlackCredentialsAPITokenOptionTitleEnum;
import com.airbyte.api.models.shared.SourceSlackCredentialsSignInViaSlackOAuth;
import com.airbyte.api.models.shared.SourceSlackCredentialsSignInViaSlackOAuthOptionTitleEnum;
import com.airbyte.api.models.shared.SourceSlackSlackEnum;
import com.airbyte.api.models.shared.SourceSmaily;
import com.airbyte.api.models.shared.SourceSmailySmailyEnum;
import com.airbyte.api.models.shared.SourceSmartengage;
import com.airbyte.api.models.shared.SourceSmartengageSmartengageEnum;
import com.airbyte.api.models.shared.SourceSmartsheets;
import com.airbyte.api.models.shared.SourceSmartsheetsCredentialsAPIAccessToken;
import com.airbyte.api.models.shared.SourceSmartsheetsCredentialsAPIAccessTokenAuthTypeEnum;
import com.airbyte.api.models.shared.SourceSmartsheetsCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceSmartsheetsCredentialsOAuth20AuthTypeEnum;
import com.airbyte.api.models.shared.SourceSmartsheetsSmartsheetsEnum;
import com.airbyte.api.models.shared.SourceSnapchatMarketing;
import com.airbyte.api.models.shared.SourceSnapchatMarketingSnapchatMarketingEnum;
import com.airbyte.api.models.shared.SourceSnowflake;
import com.airbyte.api.models.shared.SourceSnowflakeCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceSnowflakeCredentialsOAuth20AuthTypeEnum;
import com.airbyte.api.models.shared.SourceSnowflakeCredentialsUsernameAndPassword;
import com.airbyte.api.models.shared.SourceSnowflakeCredentialsUsernameAndPasswordAuthTypeEnum;
import com.airbyte.api.models.shared.SourceSnowflakeSnowflakeEnum;
import com.airbyte.api.models.shared.SourceSonarCloud;
import com.airbyte.api.models.shared.SourceSonarCloudSonarCloudEnum;
import com.airbyte.api.models.shared.SourceSpacexApi;
import com.airbyte.api.models.shared.SourceSpacexApiSpacexApiEnum;
import com.airbyte.api.models.shared.SourceSquare;
import com.airbyte.api.models.shared.SourceSquareCredentialsAPIKey;
import com.airbyte.api.models.shared.SourceSquareCredentialsAPIKeyCredentialsTitleEnum;
import com.airbyte.api.models.shared.SourceSquareCredentialsOauthAuthentication;
import com.airbyte.api.models.shared.SourceSquareCredentialsOauthAuthenticationCredentialsTitleEnum;
import com.airbyte.api.models.shared.SourceSquareSquareEnum;
import com.airbyte.api.models.shared.SourceStrava;
import com.airbyte.api.models.shared.SourceStravaAuthTypeEnum;
import com.airbyte.api.models.shared.SourceStravaStravaEnum;
import com.airbyte.api.models.shared.SourceStripe;
import com.airbyte.api.models.shared.SourceStripeStripeEnum;
import com.airbyte.api.models.shared.SourceSurveySparrow;
import com.airbyte.api.models.shared.SourceSurveySparrowRegionEUBasedAccount;
import com.airbyte.api.models.shared.SourceSurveySparrowRegionEUBasedAccountUrlBaseEnum;
import com.airbyte.api.models.shared.SourceSurveySparrowRegionGlobalAccount;
import com.airbyte.api.models.shared.SourceSurveySparrowRegionGlobalAccountUrlBaseEnum;
import com.airbyte.api.models.shared.SourceSurveySparrowSurveySparrowEnum;
import com.airbyte.api.models.shared.SourceSurveymonkey;
import com.airbyte.api.models.shared.SourceSurveymonkeyOriginDatacenterOfTheSurveyMonkeyAccountEnum;
import com.airbyte.api.models.shared.SourceSurveymonkeySurveyMonkeyAuthorizationMethod;
import com.airbyte.api.models.shared.SourceSurveymonkeySurveyMonkeyAuthorizationMethodAuthMethodEnum;
import com.airbyte.api.models.shared.SourceSurveymonkeySurveymonkeyEnum;
import com.airbyte.api.models.shared.SourceTempo;
import com.airbyte.api.models.shared.SourceTempoTempoEnum;
import com.airbyte.api.models.shared.SourceTheGuardianApi;
import com.airbyte.api.models.shared.SourceTheGuardianApiTheGuardianApiEnum;
import com.airbyte.api.models.shared.SourceTiktokMarketing;
import com.airbyte.api.models.shared.SourceTiktokMarketingCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceTiktokMarketingCredentialsOAuth20AuthTypeEnum;
import com.airbyte.api.models.shared.SourceTiktokMarketingCredentialsSandboxAccessToken;
import com.airbyte.api.models.shared.SourceTiktokMarketingCredentialsSandboxAccessTokenAuthTypeEnum;
import com.airbyte.api.models.shared.SourceTiktokMarketingTiktokMarketingEnum;
import com.airbyte.api.models.shared.SourceTodoist;
import com.airbyte.api.models.shared.SourceTodoistTodoistEnum;
import com.airbyte.api.models.shared.SourceTrello;
import com.airbyte.api.models.shared.SourceTrelloTrelloEnum;
import com.airbyte.api.models.shared.SourceTrustpilot;
import com.airbyte.api.models.shared.SourceTrustpilotCredentialsAPIKey;
import com.airbyte.api.models.shared.SourceTrustpilotCredentialsAPIKeyAuthTypeEnum;
import com.airbyte.api.models.shared.SourceTrustpilotCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceTrustpilotCredentialsOAuth20AuthTypeEnum;
import com.airbyte.api.models.shared.SourceTrustpilotTrustpilotEnum;
import com.airbyte.api.models.shared.SourceTvmazeSchedule;
import com.airbyte.api.models.shared.SourceTvmazeScheduleTvmazeScheduleEnum;
import com.airbyte.api.models.shared.SourceTwilio;
import com.airbyte.api.models.shared.SourceTwilioTaskrouter;
import com.airbyte.api.models.shared.SourceTwilioTaskrouterTwilioTaskrouterEnum;
import com.airbyte.api.models.shared.SourceTwilioTwilioEnum;
import com.airbyte.api.models.shared.SourceTwitter;
import com.airbyte.api.models.shared.SourceTwitterTwitterEnum;
import com.airbyte.api.models.shared.SourceTypeform;
import com.airbyte.api.models.shared.SourceTypeformTypeformEnum;
import com.airbyte.api.models.shared.SourceUsCensus;
import com.airbyte.api.models.shared.SourceUsCensusUsCensusEnum;
import com.airbyte.api.models.shared.SourceVantage;
import com.airbyte.api.models.shared.SourceVantageVantageEnum;
import com.airbyte.api.models.shared.SourceWebflow;
import com.airbyte.api.models.shared.SourceWebflowWebflowEnum;
import com.airbyte.api.models.shared.SourceWhiskyHunter;
import com.airbyte.api.models.shared.SourceWhiskyHunterWhiskyHunterEnum;
import com.airbyte.api.models.shared.SourceWikipediaPageviews;
import com.airbyte.api.models.shared.SourceWikipediaPageviewsWikipediaPageviewsEnum;
import com.airbyte.api.models.shared.SourceWoocommerce;
import com.airbyte.api.models.shared.SourceWoocommerceWoocommerceEnum;
import com.airbyte.api.models.shared.SourceXero;
import com.airbyte.api.models.shared.SourceXeroAuthenticateViaXeroOAuth;
import com.airbyte.api.models.shared.SourceXeroXeroEnum;
import com.airbyte.api.models.shared.SourceXkcd;
import com.airbyte.api.models.shared.SourceXkcdXkcdEnum;
import com.airbyte.api.models.shared.SourceYandexMetrica;
import com.airbyte.api.models.shared.SourceYandexMetricaYandexMetricaEnum;
import com.airbyte.api.models.shared.SourceYounium;
import com.airbyte.api.models.shared.SourceYouniumYouniumEnum;
import com.airbyte.api.models.shared.SourceYoutubeAnalytics;
import com.airbyte.api.models.shared.SourceYoutubeAnalyticsYoutubeAnalyticsEnum;
import com.airbyte.api.models.shared.SourceZendeskChat;
import com.airbyte.api.models.shared.SourceZendeskChatCredentialsAccessToken;
import com.airbyte.api.models.shared.SourceZendeskChatCredentialsAccessTokenCredentialsEnum;
import com.airbyte.api.models.shared.SourceZendeskChatCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceZendeskChatCredentialsOAuth20CredentialsEnum;
import com.airbyte.api.models.shared.SourceZendeskChatZendeskChatEnum;
import com.airbyte.api.models.shared.SourceZendeskSunshine;
import com.airbyte.api.models.shared.SourceZendeskSunshineCredentialsAPIToken;
import com.airbyte.api.models.shared.SourceZendeskSunshineCredentialsAPITokenAuthMethodEnum;
import com.airbyte.api.models.shared.SourceZendeskSunshineCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceZendeskSunshineCredentialsOAuth20AuthMethodEnum;
import com.airbyte.api.models.shared.SourceZendeskSunshineZendeskSunshineEnum;
import com.airbyte.api.models.shared.SourceZendeskSupport;
import com.airbyte.api.models.shared.SourceZendeskSupportZendeskSupportEnum;
import com.airbyte.api.models.shared.SourceZendeskTalk;
import com.airbyte.api.models.shared.SourceZendeskTalkZendeskTalkEnum;
import com.airbyte.api.models.shared.SourceZenloop;
import com.airbyte.api.models.shared.SourceZenloopZenloopEnum;
import com.airbyte.api.models.shared.SourceZohoCRMZohoCRMEditionEnum;
import com.airbyte.api.models.shared.SourceZohoCrm;
import com.airbyte.api.models.shared.SourceZohoCrmDataCenterLocationEnum;
import com.airbyte.api.models.shared.SourceZohoCrmEnvironmentEnum;
import com.airbyte.api.models.shared.SourceZohoCrmZohoCrmEnum;
import com.airbyte.api.models.shared.SourceZoom;
import com.airbyte.api.models.shared.SourceZoomZoomEnum;
import com.airbyte.api.models.shared.SourceZuora;
import com.airbyte.api.models.shared.SourceZuoraZuoraEnum;
import java.time.LocalDate;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security("dolorem") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            com.airbyte.api.models.shared.SourceCreateRequest req = new SourceCreateRequest(                new SourceYoutubeAnalytics(                new java.util.HashMap<String, Object>() {{
                                                put("voluptas", "deserunt");
                                                put("quam", "ipsum");
                                                put("incidunt", "qui");
                                            }}, SourceYoutubeAnalyticsYoutubeAnalyticsEnum.YOUTUBE_ANALYTICS) {{
                                credentials = new java.util.HashMap<String, Object>() {{
                                    put("nihil", "sit");
                                    put("expedita", "neque");
                                    put("sed", "vel");
                                }};
                                sourceType = SourceYoutubeAnalyticsYoutubeAnalyticsEnum.YOUTUBE_ANALYTICS;
                            }}, "cupiditate", "cdb1a842-2bb6-479d-a322-715bf0cbb1e3") {{
                secretId = "veritatis";
            }};            

            CreateSourceResponse res = sdk.sources.createSource(req);

            if (res.sourceResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## deleteSource

Delete a Source

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.DeleteSourceRequest;
import com.airbyte.api.models.operations.DeleteSourceResponse;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security("nobis") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            DeleteSourceRequest req = new DeleteSourceRequest("quos");            

            DeleteSourceResponse res = sdk.sources.deleteSource(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getSource

Get Source details

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.GetSourceRequest;
import com.airbyte.api.models.operations.GetSourceResponse;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security("tempore") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            GetSourceRequest req = new GetSourceRequest("cupiditate");            

            GetSourceResponse res = sdk.sources.getSource(req);

            if (res.sourceResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## initiateOAuth

Given a source ID, workspace ID, and redirect URL, initiates OAuth for the source.

This returns a fully formed URL for performing user authentication against the relevant source identity provider (IdP). Once authentication has been completed, the IdP will redirect to an Airbyte endpoint which will save the access and refresh tokens off as a secret and return the secret ID to the redirect URL specified in the `secret_id` query string parameter.

That secret ID can be used to create a source with credentials in place of actual tokens.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.InitiateOAuthResponse;
import com.airbyte.api.models.shared.InitiateOauthRequest;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security("aperiam") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            com.airbyte.api.models.shared.InitiateOauthRequest req = new InitiateOauthRequest("delectus", "dolorem", "443a1108-e0ad-4cf4-b921-879fce953f73") {{
                oAuthInputConfiguration = new java.util.HashMap<String, Object>() {{
                    put("tenetur", "dignissimos");
                    put("hic", "distinctio");
                    put("quod", "odio");
                    put("similique", "facilis");
                }};
            }};            

            InitiateOAuthResponse res = sdk.sources.initiateOAuth(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## listSources

List sources

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.ListSourcesRequest;
import com.airbyte.api.models.operations.ListSourcesResponse;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security("vero") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            ListSourcesRequest req = new ListSourcesRequest() {{
                includeDeleted = false;
                limit = 498140;
                offset = 293020;
                workspaceIds = new String[]{{
                    add("d39c0f5d-2cff-47c7-8a45-626d436813f1"),
                    add("6d9f5fce-6c55-4614-ac3e-250fb008c42e"),
                    add("141aac36-6c8d-4d6b-9442-907474778a7b"),
                    add("d466d28c-10ab-43cd-8a42-51904e523c7e"),
                }};
            }};            

            ListSourcesResponse res = sdk.sources.listSources(req);

            if (res.sourcesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

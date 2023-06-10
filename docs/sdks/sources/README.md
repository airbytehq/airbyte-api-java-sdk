# sources

### Available Operations

* [createSource](#createsource) - Create a source
* [deleteSource](#deletesource) - Delete a Source
* [getSource](#getsource) - Get Source details
* [initiateOAuth](#initiateoauth) - Initiate OAuth for a source
* [listSources](#listsources) - List sources
* [patchSource](#patchsource) - Update a Source
* [putSource](#putsource) - Update a Source and fully overwrite it

## createSource

Creates a source given a name, workspace id, and a json blob containing the configuration for the source.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateSourceResponse;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.models.shared.SourceAircall;
import com.airbyte.api.models.shared.SourceAircallAircall;
import com.airbyte.api.models.shared.SourceAirtable;
import com.airbyte.api.models.shared.SourceAirtableAirtable;
import com.airbyte.api.models.shared.SourceAirtableCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceAirtableCredentialsOAuth20AuthMethod;
import com.airbyte.api.models.shared.SourceAirtableCredentialsPersonalAccessToken;
import com.airbyte.api.models.shared.SourceAirtableCredentialsPersonalAccessTokenAuthMethod;
import com.airbyte.api.models.shared.SourceAlloydb;
import com.airbyte.api.models.shared.SourceAlloydbAlloydb;
import com.airbyte.api.models.shared.SourceAlloydbReplicationMethodStandard;
import com.airbyte.api.models.shared.SourceAlloydbReplicationMethodStandardMethod;
import com.airbyte.api.models.shared.SourceAlloydbTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.SourceAlloydbTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.SourceAlloydbTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.SourceAlloydbTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceAlloydbTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourceAlloydbTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceAmazonAds;
import com.airbyte.api.models.shared.SourceAmazonAdsAmazonAds;
import com.airbyte.api.models.shared.SourceAmazonAdsAuthType;
import com.airbyte.api.models.shared.SourceAmazonAdsRegion;
import com.airbyte.api.models.shared.SourceAmazonAdsReportRecordTypes;
import com.airbyte.api.models.shared.SourceAmazonAdsStateFilter;
import com.airbyte.api.models.shared.SourceAmazonSqs;
import com.airbyte.api.models.shared.SourceAmazonSqsAWSRegion;
import com.airbyte.api.models.shared.SourceAmazonSqsAmazonSqs;
import com.airbyte.api.models.shared.SourceAmplitude;
import com.airbyte.api.models.shared.SourceAmplitudeAmplitude;
import com.airbyte.api.models.shared.SourceAmplitudeDataRegion;
import com.airbyte.api.models.shared.SourceApifyDataset;
import com.airbyte.api.models.shared.SourceApifyDatasetApifyDataset;
import com.airbyte.api.models.shared.SourceAsana;
import com.airbyte.api.models.shared.SourceAsanaAsana;
import com.airbyte.api.models.shared.SourceAsanaCredentialsAuthenticateViaAsanaOauth;
import com.airbyte.api.models.shared.SourceAsanaCredentialsAuthenticateViaAsanaOauthCredentialsTitle;
import com.airbyte.api.models.shared.SourceAsanaCredentialsAuthenticateWithPersonalAccessToken;
import com.airbyte.api.models.shared.SourceAsanaCredentialsAuthenticateWithPersonalAccessTokenCredentialsTitle;
import com.airbyte.api.models.shared.SourceAuth0;
import com.airbyte.api.models.shared.SourceAuth0Auth0;
import com.airbyte.api.models.shared.SourceAuth0CredentialsOAuth2AccessToken;
import com.airbyte.api.models.shared.SourceAuth0CredentialsOAuth2AccessTokenAuthenticationMethod;
import com.airbyte.api.models.shared.SourceAuth0CredentialsOAuth2ConfidentialApplication;
import com.airbyte.api.models.shared.SourceAuth0CredentialsOAuth2ConfidentialApplicationAuthenticationMethod;
import com.airbyte.api.models.shared.SourceAwsCloudtrail;
import com.airbyte.api.models.shared.SourceAwsCloudtrailAwsCloudtrail;
import com.airbyte.api.models.shared.SourceAzureBlobStorage;
import com.airbyte.api.models.shared.SourceAzureBlobStorageAzureBlobStorage;
import com.airbyte.api.models.shared.SourceAzureBlobStorageFormatJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.SourceAzureBlobStorageFormatJSONLinesNewlineDelimitedJSONFormatType;
import com.airbyte.api.models.shared.SourceAzureTable;
import com.airbyte.api.models.shared.SourceAzureTableAzureTable;
import com.airbyte.api.models.shared.SourceBambooHr;
import com.airbyte.api.models.shared.SourceBambooHrBambooHr;
import com.airbyte.api.models.shared.SourceBigcommerce;
import com.airbyte.api.models.shared.SourceBigcommerceBigcommerce;
import com.airbyte.api.models.shared.SourceBigquery;
import com.airbyte.api.models.shared.SourceBigqueryBigquery;
import com.airbyte.api.models.shared.SourceBingAds;
import com.airbyte.api.models.shared.SourceBingAdsAuthMethod;
import com.airbyte.api.models.shared.SourceBingAdsBingAds;
import com.airbyte.api.models.shared.SourceBraintree;
import com.airbyte.api.models.shared.SourceBraintreeBraintree;
import com.airbyte.api.models.shared.SourceBraintreeEnvironment;
import com.airbyte.api.models.shared.SourceBraze;
import com.airbyte.api.models.shared.SourceBrazeBraze;
import com.airbyte.api.models.shared.SourceChargebee;
import com.airbyte.api.models.shared.SourceChargebeeChargebee;
import com.airbyte.api.models.shared.SourceChargebeeProductCatalog;
import com.airbyte.api.models.shared.SourceChartmogul;
import com.airbyte.api.models.shared.SourceChartmogulChartmogul;
import com.airbyte.api.models.shared.SourceChartmogulInterval;
import com.airbyte.api.models.shared.SourceClickhouse;
import com.airbyte.api.models.shared.SourceClickhouseClickhouse;
import com.airbyte.api.models.shared.SourceClickhouseTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.SourceClickhouseTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.SourceClickhouseTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.SourceClickhouseTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceClickhouseTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourceClickhouseTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceClickupApi;
import com.airbyte.api.models.shared.SourceClickupApiClickupApi;
import com.airbyte.api.models.shared.SourceCloseCom;
import com.airbyte.api.models.shared.SourceCloseComCloseCom;
import com.airbyte.api.models.shared.SourceCoda;
import com.airbyte.api.models.shared.SourceCodaCoda;
import com.airbyte.api.models.shared.SourceCoinApi;
import com.airbyte.api.models.shared.SourceCoinApiCoinApi;
import com.airbyte.api.models.shared.SourceCoinApiEnvironment;
import com.airbyte.api.models.shared.SourceCoinmarketcap;
import com.airbyte.api.models.shared.SourceCoinmarketcapCoinmarketcap;
import com.airbyte.api.models.shared.SourceCoinmarketcapDataType;
import com.airbyte.api.models.shared.SourceConfigcat;
import com.airbyte.api.models.shared.SourceConfigcatConfigcat;
import com.airbyte.api.models.shared.SourceConfluence;
import com.airbyte.api.models.shared.SourceConfluenceConfluence;
import com.airbyte.api.models.shared.SourceCreateRequest;
import com.airbyte.api.models.shared.SourceDatascope;
import com.airbyte.api.models.shared.SourceDatascopeDatascope;
import com.airbyte.api.models.shared.SourceDelighted;
import com.airbyte.api.models.shared.SourceDelightedDelighted;
import com.airbyte.api.models.shared.SourceDixa;
import com.airbyte.api.models.shared.SourceDixaDixa;
import com.airbyte.api.models.shared.SourceDockerhub;
import com.airbyte.api.models.shared.SourceDockerhubDockerhub;
import com.airbyte.api.models.shared.SourceDremio;
import com.airbyte.api.models.shared.SourceDremioDremio;
import com.airbyte.api.models.shared.SourceDynamodb;
import com.airbyte.api.models.shared.SourceDynamodbDynamodb;
import com.airbyte.api.models.shared.SourceDynamodbDynamodbRegion;
import com.airbyte.api.models.shared.SourceE2eTestCloud;
import com.airbyte.api.models.shared.SourceE2eTestCloudE2eTestCloud;
import com.airbyte.api.models.shared.SourceE2eTestCloudMockCatalogMultiSchema;
import com.airbyte.api.models.shared.SourceE2eTestCloudMockCatalogMultiSchemaType;
import com.airbyte.api.models.shared.SourceE2eTestCloudMockCatalogSingleSchema;
import com.airbyte.api.models.shared.SourceE2eTestCloudMockCatalogSingleSchemaType;
import com.airbyte.api.models.shared.SourceE2eTestCloudType;
import com.airbyte.api.models.shared.SourceEmailoctopus;
import com.airbyte.api.models.shared.SourceEmailoctopusEmailoctopus;
import com.airbyte.api.models.shared.SourceExchangeRates;
import com.airbyte.api.models.shared.SourceExchangeRatesExchangeRates;
import com.airbyte.api.models.shared.SourceFacebookMarketing;
import com.airbyte.api.models.shared.SourceFacebookMarketingFacebookMarketing;
import com.airbyte.api.models.shared.SourceFacebookMarketingInsightConfig;
import com.airbyte.api.models.shared.SourceFacebookMarketingInsightConfigLevel;
import com.airbyte.api.models.shared.SourceFacebookMarketingInsightConfigValidActionBreakdowns;
import com.airbyte.api.models.shared.SourceFacebookMarketingInsightConfigValidBreakdowns;
import com.airbyte.api.models.shared.SourceFacebookMarketingInsightConfigValidEnums;
import com.airbyte.api.models.shared.SourceFacebookPages;
import com.airbyte.api.models.shared.SourceFacebookPagesFacebookPages;
import com.airbyte.api.models.shared.SourceFaker;
import com.airbyte.api.models.shared.SourceFakerFaker;
import com.airbyte.api.models.shared.SourceFauna;
import com.airbyte.api.models.shared.SourceFaunaCollection;
import com.airbyte.api.models.shared.SourceFaunaCollectionDeletionsDisabled;
import com.airbyte.api.models.shared.SourceFaunaCollectionDeletionsDisabledDeletionMode;
import com.airbyte.api.models.shared.SourceFaunaCollectionDeletionsEnabled;
import com.airbyte.api.models.shared.SourceFaunaCollectionDeletionsEnabledDeletionMode;
import com.airbyte.api.models.shared.SourceFaunaFauna;
import com.airbyte.api.models.shared.SourceFileSecure;
import com.airbyte.api.models.shared.SourceFileSecureFileFormat;
import com.airbyte.api.models.shared.SourceFileSecureFileSecure;
import com.airbyte.api.models.shared.SourceFileSecureProviderAzBlobAzureBlobStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderAzBlobAzureBlobStorageStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderGCSGoogleCloudStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderGCSGoogleCloudStorageStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderHTTPSPublicWeb;
import com.airbyte.api.models.shared.SourceFileSecureProviderHTTPSPublicWebStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderS3AmazonWebServices;
import com.airbyte.api.models.shared.SourceFileSecureProviderS3AmazonWebServicesStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderSCPSecureCopyProtocol;
import com.airbyte.api.models.shared.SourceFileSecureProviderSCPSecureCopyProtocolStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderSFTPSecureFileTransferProtocol;
import com.airbyte.api.models.shared.SourceFileSecureProviderSFTPSecureFileTransferProtocolStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderSSHSecureShell;
import com.airbyte.api.models.shared.SourceFileSecureProviderSSHSecureShellStorage;
import com.airbyte.api.models.shared.SourceFirebolt;
import com.airbyte.api.models.shared.SourceFireboltFirebolt;
import com.airbyte.api.models.shared.SourceFreshcaller;
import com.airbyte.api.models.shared.SourceFreshcallerFreshcaller;
import com.airbyte.api.models.shared.SourceFreshdesk;
import com.airbyte.api.models.shared.SourceFreshdeskFreshdesk;
import com.airbyte.api.models.shared.SourceFreshsales;
import com.airbyte.api.models.shared.SourceFreshsalesFreshsales;
import com.airbyte.api.models.shared.SourceFreshservice;
import com.airbyte.api.models.shared.SourceFreshserviceFreshservice;
import com.airbyte.api.models.shared.SourceGcs;
import com.airbyte.api.models.shared.SourceGcsGcs;
import com.airbyte.api.models.shared.SourceGetlago;
import com.airbyte.api.models.shared.SourceGetlagoGetlago;
import com.airbyte.api.models.shared.SourceGithub;
import com.airbyte.api.models.shared.SourceGithubCredentialsOAuth;
import com.airbyte.api.models.shared.SourceGithubCredentialsOAuthOptionTitle;
import com.airbyte.api.models.shared.SourceGithubCredentialsPersonalAccessToken;
import com.airbyte.api.models.shared.SourceGithubCredentialsPersonalAccessTokenOptionTitle;
import com.airbyte.api.models.shared.SourceGithubGithub;
import com.airbyte.api.models.shared.SourceGitlab;
import com.airbyte.api.models.shared.SourceGitlabCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceGitlabCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceGitlabCredentialsPrivateToken;
import com.airbyte.api.models.shared.SourceGitlabCredentialsPrivateTokenAuthType;
import com.airbyte.api.models.shared.SourceGitlabGitlab;
import com.airbyte.api.models.shared.SourceGlassfrog;
import com.airbyte.api.models.shared.SourceGlassfrogGlassfrog;
import com.airbyte.api.models.shared.SourceGnews;
import com.airbyte.api.models.shared.SourceGnewsCountry;
import com.airbyte.api.models.shared.SourceGnewsGnews;
import com.airbyte.api.models.shared.SourceGnewsIn;
import com.airbyte.api.models.shared.SourceGnewsLanguage;
import com.airbyte.api.models.shared.SourceGnewsNullable;
import com.airbyte.api.models.shared.SourceGnewsSortBy;
import com.airbyte.api.models.shared.SourceGnewsTopHeadlinesTopic;
import com.airbyte.api.models.shared.SourceGoogleAds;
import com.airbyte.api.models.shared.SourceGoogleAdsCustomQueries;
import com.airbyte.api.models.shared.SourceGoogleAdsGoogleAds;
import com.airbyte.api.models.shared.SourceGoogleAdsGoogleCredentials;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApi;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiCredentialsAuthenticateViaGoogleOauth;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiCredentialsAuthenticateViaGoogleOauthAuthType;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiCredentialsServiceAccountKeyAuthentication;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiCredentialsServiceAccountKeyAuthenticationAuthType;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiGoogleAnalyticsDataApi;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsV4;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauth;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauthAuthType;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsV4CredentialsServiceAccountKeyAuthentication;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsV4CredentialsServiceAccountKeyAuthenticationAuthType;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsV4GoogleAnalyticsV4;
import com.airbyte.api.models.shared.SourceGoogleDirectory;
import com.airbyte.api.models.shared.SourceGoogleDirectoryGoogleDirectory;
import com.airbyte.api.models.shared.SourceGooglePagespeedInsights;
import com.airbyte.api.models.shared.SourceGooglePagespeedInsightsCategories;
import com.airbyte.api.models.shared.SourceGooglePagespeedInsightsGooglePagespeedInsights;
import com.airbyte.api.models.shared.SourceGooglePagespeedInsightsStrategies;
import com.airbyte.api.models.shared.SourceGoogleSearchConsole;
import com.airbyte.api.models.shared.SourceGoogleSearchConsoleAuthorizationOAuth;
import com.airbyte.api.models.shared.SourceGoogleSearchConsoleAuthorizationOAuthAuthType;
import com.airbyte.api.models.shared.SourceGoogleSearchConsoleAuthorizationServiceAccountKeyAuthentication;
import com.airbyte.api.models.shared.SourceGoogleSearchConsoleAuthorizationServiceAccountKeyAuthenticationAuthType;
import com.airbyte.api.models.shared.SourceGoogleSearchConsoleDataState;
import com.airbyte.api.models.shared.SourceGoogleSearchConsoleGoogleSearchConsole;
import com.airbyte.api.models.shared.SourceGoogleSheets;
import com.airbyte.api.models.shared.SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuth;
import com.airbyte.api.models.shared.SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuthAuthType;
import com.airbyte.api.models.shared.SourceGoogleSheetsCredentialsServiceAccountKeyAuthentication;
import com.airbyte.api.models.shared.SourceGoogleSheetsCredentialsServiceAccountKeyAuthenticationAuthType;
import com.airbyte.api.models.shared.SourceGoogleSheetsGoogleSheets;
import com.airbyte.api.models.shared.SourceGoogleWebfonts;
import com.airbyte.api.models.shared.SourceGoogleWebfontsGoogleWebfonts;
import com.airbyte.api.models.shared.SourceGoogleWorkspaceAdminReports;
import com.airbyte.api.models.shared.SourceGoogleWorkspaceAdminReportsGoogleWorkspaceAdminReports;
import com.airbyte.api.models.shared.SourceGreenhouse;
import com.airbyte.api.models.shared.SourceGreenhouseGreenhouse;
import com.airbyte.api.models.shared.SourceGridly;
import com.airbyte.api.models.shared.SourceGridlyGridly;
import com.airbyte.api.models.shared.SourceHarvest;
import com.airbyte.api.models.shared.SourceHarvestHarvest;
import com.airbyte.api.models.shared.SourceHubplanner;
import com.airbyte.api.models.shared.SourceHubplannerHubplanner;
import com.airbyte.api.models.shared.SourceHubspot;
import com.airbyte.api.models.shared.SourceHubspotCredentialsOAuth;
import com.airbyte.api.models.shared.SourceHubspotCredentialsOAuthAuthType;
import com.airbyte.api.models.shared.SourceHubspotCredentialsPrivateApp;
import com.airbyte.api.models.shared.SourceHubspotCredentialsPrivateAppAuthType;
import com.airbyte.api.models.shared.SourceHubspotHubspot;
import com.airbyte.api.models.shared.SourceInsightly;
import com.airbyte.api.models.shared.SourceInsightlyInsightly;
import com.airbyte.api.models.shared.SourceInstagram;
import com.airbyte.api.models.shared.SourceInstagramInstagram;
import com.airbyte.api.models.shared.SourceInstatus;
import com.airbyte.api.models.shared.SourceInstatusInstatus;
import com.airbyte.api.models.shared.SourceIntercom;
import com.airbyte.api.models.shared.SourceIntercomIntercom;
import com.airbyte.api.models.shared.SourceIp2whois;
import com.airbyte.api.models.shared.SourceIp2whoisIp2whois;
import com.airbyte.api.models.shared.SourceIterable;
import com.airbyte.api.models.shared.SourceIterableIterable;
import com.airbyte.api.models.shared.SourceJira;
import com.airbyte.api.models.shared.SourceJiraJira;
import com.airbyte.api.models.shared.SourceK6Cloud;
import com.airbyte.api.models.shared.SourceK6CloudK6Cloud;
import com.airbyte.api.models.shared.SourceKlarna;
import com.airbyte.api.models.shared.SourceKlarnaKlarna;
import com.airbyte.api.models.shared.SourceKlarnaRegion;
import com.airbyte.api.models.shared.SourceKlaviyo;
import com.airbyte.api.models.shared.SourceKlaviyoKlaviyo;
import com.airbyte.api.models.shared.SourceKustomerSinger;
import com.airbyte.api.models.shared.SourceKustomerSingerKustomerSinger;
import com.airbyte.api.models.shared.SourceLaunchdarkly;
import com.airbyte.api.models.shared.SourceLaunchdarklyLaunchdarkly;
import com.airbyte.api.models.shared.SourceLemlist;
import com.airbyte.api.models.shared.SourceLemlistLemlist;
import com.airbyte.api.models.shared.SourceLinkedinAds;
import com.airbyte.api.models.shared.SourceLinkedinAdsCredentialsAccessToken;
import com.airbyte.api.models.shared.SourceLinkedinAdsCredentialsAccessTokenAuthMethod;
import com.airbyte.api.models.shared.SourceLinkedinAdsCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceLinkedinAdsCredentialsOAuth20AuthMethod;
import com.airbyte.api.models.shared.SourceLinkedinAdsLinkedinAds;
import com.airbyte.api.models.shared.SourceLinkedinPages;
import com.airbyte.api.models.shared.SourceLinkedinPagesCredentialsAccessToken;
import com.airbyte.api.models.shared.SourceLinkedinPagesCredentialsAccessTokenAuthMethod;
import com.airbyte.api.models.shared.SourceLinkedinPagesCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceLinkedinPagesCredentialsOAuth20AuthMethod;
import com.airbyte.api.models.shared.SourceLinkedinPagesLinkedinPages;
import com.airbyte.api.models.shared.SourceLinnworks;
import com.airbyte.api.models.shared.SourceLinnworksLinnworks;
import com.airbyte.api.models.shared.SourceLokalise;
import com.airbyte.api.models.shared.SourceLokaliseLokalise;
import com.airbyte.api.models.shared.SourceMailchimp;
import com.airbyte.api.models.shared.SourceMailchimpCredentialsAPIKey;
import com.airbyte.api.models.shared.SourceMailchimpCredentialsAPIKeyAuthType;
import com.airbyte.api.models.shared.SourceMailchimpCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceMailchimpCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceMailchimpMailchimp;
import com.airbyte.api.models.shared.SourceMailgun;
import com.airbyte.api.models.shared.SourceMailgunMailgun;
import com.airbyte.api.models.shared.SourceMailjetSms;
import com.airbyte.api.models.shared.SourceMailjetSmsMailjetSms;
import com.airbyte.api.models.shared.SourceMarketo;
import com.airbyte.api.models.shared.SourceMarketoMarketo;
import com.airbyte.api.models.shared.SourceMetabase;
import com.airbyte.api.models.shared.SourceMetabaseMetabase;
import com.airbyte.api.models.shared.SourceMicrosoftTeams;
import com.airbyte.api.models.shared.SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoft;
import com.airbyte.api.models.shared.SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftAuthType;
import com.airbyte.api.models.shared.SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftOAuth20;
import com.airbyte.api.models.shared.SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftOAuth20AuthType;
import com.airbyte.api.models.shared.SourceMicrosoftTeamsMicrosoftTeams;
import com.airbyte.api.models.shared.SourceMixpanel;
import com.airbyte.api.models.shared.SourceMixpanelCredentialsProjectSecret;
import com.airbyte.api.models.shared.SourceMixpanelCredentialsProjectSecretOptionTitle;
import com.airbyte.api.models.shared.SourceMixpanelCredentialsServiceAccount;
import com.airbyte.api.models.shared.SourceMixpanelCredentialsServiceAccountOptionTitle;
import com.airbyte.api.models.shared.SourceMixpanelMixpanel;
import com.airbyte.api.models.shared.SourceMixpanelRegion;
import com.airbyte.api.models.shared.SourceMonday;
import com.airbyte.api.models.shared.SourceMondayCredentialsAPIToken;
import com.airbyte.api.models.shared.SourceMondayCredentialsAPITokenAuthType;
import com.airbyte.api.models.shared.SourceMondayCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceMondayCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceMondayMonday;
import com.airbyte.api.models.shared.SourceMongodb;
import com.airbyte.api.models.shared.SourceMongodbInstanceTypeMongoDBAtlas;
import com.airbyte.api.models.shared.SourceMongodbInstanceTypeMongoDBAtlasInstance;
import com.airbyte.api.models.shared.SourceMongodbInstanceTypeReplicaSet;
import com.airbyte.api.models.shared.SourceMongodbInstanceTypeReplicaSetInstance;
import com.airbyte.api.models.shared.SourceMongodbInstanceTypeStandaloneMongoDbInstance;
import com.airbyte.api.models.shared.SourceMongodbInstanceTypeStandaloneMongoDbInstanceInstance;
import com.airbyte.api.models.shared.SourceMongodbMongodb;
import com.airbyte.api.models.shared.SourceMssql;
import com.airbyte.api.models.shared.SourceMssqlMssql;
import com.airbyte.api.models.shared.SourceMssqlReplicationMethodLogicalReplicationCDC;
import com.airbyte.api.models.shared.SourceMssqlReplicationMethodLogicalReplicationCDCDataToSync;
import com.airbyte.api.models.shared.SourceMssqlReplicationMethodLogicalReplicationCDCInitialSnapshotIsolationLevel;
import com.airbyte.api.models.shared.SourceMssqlReplicationMethodLogicalReplicationCDCMethod;
import com.airbyte.api.models.shared.SourceMssqlReplicationMethodStandard;
import com.airbyte.api.models.shared.SourceMssqlReplicationMethodStandardMethod;
import com.airbyte.api.models.shared.SourceMssqlSslMethodEncryptedTrustServerCertificate;
import com.airbyte.api.models.shared.SourceMssqlSslMethodEncryptedTrustServerCertificateSslMethod;
import com.airbyte.api.models.shared.SourceMssqlSslMethodEncryptedVerifyCertificate;
import com.airbyte.api.models.shared.SourceMssqlSslMethodEncryptedVerifyCertificateSslMethod;
import com.airbyte.api.models.shared.SourceMssqlTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.SourceMssqlTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.SourceMssqlTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.SourceMssqlTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceMssqlTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourceMssqlTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceMyHours;
import com.airbyte.api.models.shared.SourceMyHoursMyHours;
import com.airbyte.api.models.shared.SourceMysql;
import com.airbyte.api.models.shared.SourceMysqlMysql;
import com.airbyte.api.models.shared.SourceMysqlReplicationMethodLogicalReplicationCDC;
import com.airbyte.api.models.shared.SourceMysqlReplicationMethodLogicalReplicationCDCMethod;
import com.airbyte.api.models.shared.SourceMysqlReplicationMethodStandard;
import com.airbyte.api.models.shared.SourceMysqlReplicationMethodStandardMethod;
import com.airbyte.api.models.shared.SourceMysqlSslModePreferred;
import com.airbyte.api.models.shared.SourceMysqlSslModePreferredMode;
import com.airbyte.api.models.shared.SourceMysqlSslModeRequired;
import com.airbyte.api.models.shared.SourceMysqlSslModeRequiredMode;
import com.airbyte.api.models.shared.SourceMysqlSslModeVerifyCA;
import com.airbyte.api.models.shared.SourceMysqlSslModeVerifyCAMode;
import com.airbyte.api.models.shared.SourceMysqlSslModeVerifyIdentity;
import com.airbyte.api.models.shared.SourceMysqlSslModeVerifyIdentityMode;
import com.airbyte.api.models.shared.SourceMysqlTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.SourceMysqlTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.SourceMysqlTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.SourceMysqlTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceMysqlTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourceMysqlTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceNetsuite;
import com.airbyte.api.models.shared.SourceNetsuiteNetsuite;
import com.airbyte.api.models.shared.SourceNotion;
import com.airbyte.api.models.shared.SourceNotionCredentialsAccessToken;
import com.airbyte.api.models.shared.SourceNotionCredentialsAccessTokenAuthType;
import com.airbyte.api.models.shared.SourceNotionCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceNotionCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceNotionNotion;
import com.airbyte.api.models.shared.SourceNytimes;
import com.airbyte.api.models.shared.SourceNytimesNytimes;
import com.airbyte.api.models.shared.SourceNytimesPeriodUsedForMostPopularStreams;
import com.airbyte.api.models.shared.SourceNytimesShareTypeUsedForMostPopularSharedStream;
import com.airbyte.api.models.shared.SourceOkta;
import com.airbyte.api.models.shared.SourceOktaCredentialsAPIToken;
import com.airbyte.api.models.shared.SourceOktaCredentialsAPITokenAuthType;
import com.airbyte.api.models.shared.SourceOktaCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceOktaCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceOktaOkta;
import com.airbyte.api.models.shared.SourceOmnisend;
import com.airbyte.api.models.shared.SourceOmnisendOmnisend;
import com.airbyte.api.models.shared.SourceOnesignal;
import com.airbyte.api.models.shared.SourceOnesignalApplications;
import com.airbyte.api.models.shared.SourceOnesignalOnesignal;
import com.airbyte.api.models.shared.SourceOpenweather;
import com.airbyte.api.models.shared.SourceOpenweatherLanguage;
import com.airbyte.api.models.shared.SourceOpenweatherOpenweather;
import com.airbyte.api.models.shared.SourceOpenweatherUnits;
import com.airbyte.api.models.shared.SourceOracle;
import com.airbyte.api.models.shared.SourceOracleConnectionDataServiceName;
import com.airbyte.api.models.shared.SourceOracleConnectionDataServiceNameConnectionType;
import com.airbyte.api.models.shared.SourceOracleConnectionDataSystemIDSID;
import com.airbyte.api.models.shared.SourceOracleConnectionDataSystemIDSIDConnectionType;
import com.airbyte.api.models.shared.SourceOracleEncryptionNativeNetworkEncryptionNNE;
import com.airbyte.api.models.shared.SourceOracleEncryptionNativeNetworkEncryptionNNEEncryptionAlgorithm;
import com.airbyte.api.models.shared.SourceOracleEncryptionNativeNetworkEncryptionNNEEncryptionMethod;
import com.airbyte.api.models.shared.SourceOracleEncryptionTLSEncryptedVerifyCertificate;
import com.airbyte.api.models.shared.SourceOracleEncryptionTLSEncryptedVerifyCertificateEncryptionMethod;
import com.airbyte.api.models.shared.SourceOracleOracle;
import com.airbyte.api.models.shared.SourceOracleTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.SourceOracleTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.SourceOracleTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.SourceOracleTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceOracleTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourceOracleTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceOrb;
import com.airbyte.api.models.shared.SourceOrbOrb;
import com.airbyte.api.models.shared.SourceOrbit;
import com.airbyte.api.models.shared.SourceOrbitOrbit;
import com.airbyte.api.models.shared.SourceOutreach;
import com.airbyte.api.models.shared.SourceOutreachOutreach;
import com.airbyte.api.models.shared.SourcePaypalTransaction;
import com.airbyte.api.models.shared.SourcePaypalTransactionPaypalTransaction;
import com.airbyte.api.models.shared.SourcePaystack;
import com.airbyte.api.models.shared.SourcePaystackPaystack;
import com.airbyte.api.models.shared.SourcePendo;
import com.airbyte.api.models.shared.SourcePendoPendo;
import com.airbyte.api.models.shared.SourcePersistiq;
import com.airbyte.api.models.shared.SourcePersistiqPersistiq;
import com.airbyte.api.models.shared.SourcePexelsApi;
import com.airbyte.api.models.shared.SourcePexelsApiPexelsApi;
import com.airbyte.api.models.shared.SourcePinterest;
import com.airbyte.api.models.shared.SourcePinterestCredentialsAccessToken;
import com.airbyte.api.models.shared.SourcePinterestCredentialsAccessTokenAuthMethod;
import com.airbyte.api.models.shared.SourcePinterestCredentialsOAuth20;
import com.airbyte.api.models.shared.SourcePinterestCredentialsOAuth20AuthMethod;
import com.airbyte.api.models.shared.SourcePinterestPinterest;
import com.airbyte.api.models.shared.SourcePinterestStatus;
import com.airbyte.api.models.shared.SourcePipedrive;
import com.airbyte.api.models.shared.SourcePipedriveAPIKeyAuthentication;
import com.airbyte.api.models.shared.SourcePipedriveAPIKeyAuthenticationAuthType;
import com.airbyte.api.models.shared.SourcePipedrivePipedrive;
import com.airbyte.api.models.shared.SourcePocket;
import com.airbyte.api.models.shared.SourcePocketContentType;
import com.airbyte.api.models.shared.SourcePocketDetailType;
import com.airbyte.api.models.shared.SourcePocketPocket;
import com.airbyte.api.models.shared.SourcePocketSortBy;
import com.airbyte.api.models.shared.SourcePocketState;
import com.airbyte.api.models.shared.SourcePokeapi;
import com.airbyte.api.models.shared.SourcePokeapiPokeapi;
import com.airbyte.api.models.shared.SourcePolygonStockApi;
import com.airbyte.api.models.shared.SourcePolygonStockApiPolygonStockApi;
import com.airbyte.api.models.shared.SourcePostgres;
import com.airbyte.api.models.shared.SourcePostgresPostgres;
import com.airbyte.api.models.shared.SourcePostgresReplicationMethodStandard;
import com.airbyte.api.models.shared.SourcePostgresReplicationMethodStandardMethod;
import com.airbyte.api.models.shared.SourcePostgresTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.SourcePostgresTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.SourcePostgresTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.SourcePostgresTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourcePostgresTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourcePostgresTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourcePosthog;
import com.airbyte.api.models.shared.SourcePosthogPosthog;
import com.airbyte.api.models.shared.SourcePostmarkapp;
import com.airbyte.api.models.shared.SourcePostmarkappPostmarkapp;
import com.airbyte.api.models.shared.SourcePrestashop;
import com.airbyte.api.models.shared.SourcePrestashopPrestashop;
import com.airbyte.api.models.shared.SourcePublicApis;
import com.airbyte.api.models.shared.SourcePublicApisPublicApis;
import com.airbyte.api.models.shared.SourcePunkApi;
import com.airbyte.api.models.shared.SourcePunkApiPunkApi;
import com.airbyte.api.models.shared.SourcePypi;
import com.airbyte.api.models.shared.SourcePypiPypi;
import com.airbyte.api.models.shared.SourceQualaroo;
import com.airbyte.api.models.shared.SourceQualarooQualaroo;
import com.airbyte.api.models.shared.SourceQuickbooks;
import com.airbyte.api.models.shared.SourceQuickbooksCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceQuickbooksCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceQuickbooksQuickbooks;
import com.airbyte.api.models.shared.SourceRailz;
import com.airbyte.api.models.shared.SourceRailzRailz;
import com.airbyte.api.models.shared.SourceRecharge;
import com.airbyte.api.models.shared.SourceRechargeRecharge;
import com.airbyte.api.models.shared.SourceRecreation;
import com.airbyte.api.models.shared.SourceRecreationRecreation;
import com.airbyte.api.models.shared.SourceRecruitee;
import com.airbyte.api.models.shared.SourceRecruiteeRecruitee;
import com.airbyte.api.models.shared.SourceRecurly;
import com.airbyte.api.models.shared.SourceRecurlyRecurly;
import com.airbyte.api.models.shared.SourceRedshift;
import com.airbyte.api.models.shared.SourceRedshiftRedshift;
import com.airbyte.api.models.shared.SourceRetently;
import com.airbyte.api.models.shared.SourceRetentlyRetently;
import com.airbyte.api.models.shared.SourceRkiCovid;
import com.airbyte.api.models.shared.SourceRkiCovidRkiCovid;
import com.airbyte.api.models.shared.SourceRss;
import com.airbyte.api.models.shared.SourceRssRss;
import com.airbyte.api.models.shared.SourceS3;
import com.airbyte.api.models.shared.SourceS3FormatAvro;
import com.airbyte.api.models.shared.SourceS3FormatAvroFiletype;
import com.airbyte.api.models.shared.SourceS3FormatCSV;
import com.airbyte.api.models.shared.SourceS3FormatCSVFiletype;
import com.airbyte.api.models.shared.SourceS3FormatJsonl;
import com.airbyte.api.models.shared.SourceS3FormatJsonlFiletype;
import com.airbyte.api.models.shared.SourceS3FormatJsonlUnexpectedFieldBehavior;
import com.airbyte.api.models.shared.SourceS3FormatParquet;
import com.airbyte.api.models.shared.SourceS3FormatParquetFiletype;
import com.airbyte.api.models.shared.SourceS3S3;
import com.airbyte.api.models.shared.SourceS3S3AmazonWebServices;
import com.airbyte.api.models.shared.SourceSalesforce;
import com.airbyte.api.models.shared.SourceSalesforceAuthType;
import com.airbyte.api.models.shared.SourceSalesforceSalesforce;
import com.airbyte.api.models.shared.SourceSalesforceSinger;
import com.airbyte.api.models.shared.SourceSalesforceSingerApiType;
import com.airbyte.api.models.shared.SourceSalesforceSingerSalesforceSinger;
import com.airbyte.api.models.shared.SourceSalesforceStreamsCriteria;
import com.airbyte.api.models.shared.SourceSalesforceStreamsCriteriaSearchCriteria;
import com.airbyte.api.models.shared.SourceSalesloft;
import com.airbyte.api.models.shared.SourceSalesloftCredentialsAuthenticateViaAPIKey;
import com.airbyte.api.models.shared.SourceSalesloftCredentialsAuthenticateViaAPIKeyAuthType;
import com.airbyte.api.models.shared.SourceSalesloftCredentialsAuthenticateViaOAuth;
import com.airbyte.api.models.shared.SourceSalesloftCredentialsAuthenticateViaOAuthAuthType;
import com.airbyte.api.models.shared.SourceSalesloftSalesloft;
import com.airbyte.api.models.shared.SourceSapFieldglass;
import com.airbyte.api.models.shared.SourceSapFieldglassSapFieldglass;
import com.airbyte.api.models.shared.SourceSecoda;
import com.airbyte.api.models.shared.SourceSecodaSecoda;
import com.airbyte.api.models.shared.SourceSendgrid;
import com.airbyte.api.models.shared.SourceSendgridSendgrid;
import com.airbyte.api.models.shared.SourceSendinblue;
import com.airbyte.api.models.shared.SourceSendinblueSendinblue;
import com.airbyte.api.models.shared.SourceSenseforce;
import com.airbyte.api.models.shared.SourceSenseforceSenseforce;
import com.airbyte.api.models.shared.SourceSentry;
import com.airbyte.api.models.shared.SourceSentrySentry;
import com.airbyte.api.models.shared.SourceSftp;
import com.airbyte.api.models.shared.SourceSftpBulk;
import com.airbyte.api.models.shared.SourceSftpBulkFileType;
import com.airbyte.api.models.shared.SourceSftpBulkSftpBulk;
import com.airbyte.api.models.shared.SourceSftpCredentialsPasswordAuthentication;
import com.airbyte.api.models.shared.SourceSftpCredentialsPasswordAuthenticationAuthMethod;
import com.airbyte.api.models.shared.SourceSftpCredentialsSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourceSftpCredentialsSSHKeyAuthenticationAuthMethod;
import com.airbyte.api.models.shared.SourceSftpSftp;
import com.airbyte.api.models.shared.SourceShopify;
import com.airbyte.api.models.shared.SourceShopifyCredentialsAPIPassword;
import com.airbyte.api.models.shared.SourceShopifyCredentialsAPIPasswordAuthMethod;
import com.airbyte.api.models.shared.SourceShopifyCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceShopifyCredentialsOAuth20AuthMethod;
import com.airbyte.api.models.shared.SourceShopifyShopify;
import com.airbyte.api.models.shared.SourceShortio;
import com.airbyte.api.models.shared.SourceShortioShortio;
import com.airbyte.api.models.shared.SourceSlack;
import com.airbyte.api.models.shared.SourceSlackCredentialsAPIToken;
import com.airbyte.api.models.shared.SourceSlackCredentialsAPITokenOptionTitle;
import com.airbyte.api.models.shared.SourceSlackCredentialsSignInViaSlackOAuth;
import com.airbyte.api.models.shared.SourceSlackCredentialsSignInViaSlackOAuthOptionTitle;
import com.airbyte.api.models.shared.SourceSlackSlack;
import com.airbyte.api.models.shared.SourceSmaily;
import com.airbyte.api.models.shared.SourceSmailySmaily;
import com.airbyte.api.models.shared.SourceSmartengage;
import com.airbyte.api.models.shared.SourceSmartengageSmartengage;
import com.airbyte.api.models.shared.SourceSmartsheets;
import com.airbyte.api.models.shared.SourceSmartsheetsCredentialsAPIAccessToken;
import com.airbyte.api.models.shared.SourceSmartsheetsCredentialsAPIAccessTokenAuthType;
import com.airbyte.api.models.shared.SourceSmartsheetsCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceSmartsheetsCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceSmartsheetsSmartsheets;
import com.airbyte.api.models.shared.SourceSnapchatMarketing;
import com.airbyte.api.models.shared.SourceSnapchatMarketingSnapchatMarketing;
import com.airbyte.api.models.shared.SourceSnowflake;
import com.airbyte.api.models.shared.SourceSnowflakeCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceSnowflakeCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceSnowflakeCredentialsUsernameAndPassword;
import com.airbyte.api.models.shared.SourceSnowflakeCredentialsUsernameAndPasswordAuthType;
import com.airbyte.api.models.shared.SourceSnowflakeSnowflake;
import com.airbyte.api.models.shared.SourceSonarCloud;
import com.airbyte.api.models.shared.SourceSonarCloudSonarCloud;
import com.airbyte.api.models.shared.SourceSpacexApi;
import com.airbyte.api.models.shared.SourceSpacexApiSpacexApi;
import com.airbyte.api.models.shared.SourceSquare;
import com.airbyte.api.models.shared.SourceSquareCredentialsAPIKey;
import com.airbyte.api.models.shared.SourceSquareCredentialsAPIKeyAuthType;
import com.airbyte.api.models.shared.SourceSquareCredentialsOauthAuthentication;
import com.airbyte.api.models.shared.SourceSquareCredentialsOauthAuthenticationAuthType;
import com.airbyte.api.models.shared.SourceSquareSquare;
import com.airbyte.api.models.shared.SourceStrava;
import com.airbyte.api.models.shared.SourceStravaAuthType;
import com.airbyte.api.models.shared.SourceStravaStrava;
import com.airbyte.api.models.shared.SourceStripe;
import com.airbyte.api.models.shared.SourceStripeStripe;
import com.airbyte.api.models.shared.SourceSurveySparrow;
import com.airbyte.api.models.shared.SourceSurveySparrowRegionEUBasedAccount;
import com.airbyte.api.models.shared.SourceSurveySparrowRegionEUBasedAccountUrlBase;
import com.airbyte.api.models.shared.SourceSurveySparrowRegionGlobalAccount;
import com.airbyte.api.models.shared.SourceSurveySparrowRegionGlobalAccountUrlBase;
import com.airbyte.api.models.shared.SourceSurveySparrowSurveySparrow;
import com.airbyte.api.models.shared.SourceSurveymonkey;
import com.airbyte.api.models.shared.SourceSurveymonkeyOriginDatacenterOfTheSurveyMonkeyAccount;
import com.airbyte.api.models.shared.SourceSurveymonkeySurveyMonkeyAuthorizationMethod;
import com.airbyte.api.models.shared.SourceSurveymonkeySurveyMonkeyAuthorizationMethodAuthMethod;
import com.airbyte.api.models.shared.SourceSurveymonkeySurveymonkey;
import com.airbyte.api.models.shared.SourceTempo;
import com.airbyte.api.models.shared.SourceTempoTempo;
import com.airbyte.api.models.shared.SourceTheGuardianApi;
import com.airbyte.api.models.shared.SourceTheGuardianApiTheGuardianApi;
import com.airbyte.api.models.shared.SourceTiktokMarketing;
import com.airbyte.api.models.shared.SourceTiktokMarketingCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceTiktokMarketingCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceTiktokMarketingCredentialsSandboxAccessToken;
import com.airbyte.api.models.shared.SourceTiktokMarketingCredentialsSandboxAccessTokenAuthType;
import com.airbyte.api.models.shared.SourceTiktokMarketingTiktokMarketing;
import com.airbyte.api.models.shared.SourceTodoist;
import com.airbyte.api.models.shared.SourceTodoistTodoist;
import com.airbyte.api.models.shared.SourceTrello;
import com.airbyte.api.models.shared.SourceTrelloTrello;
import com.airbyte.api.models.shared.SourceTrustpilot;
import com.airbyte.api.models.shared.SourceTrustpilotCredentialsAPIKey;
import com.airbyte.api.models.shared.SourceTrustpilotCredentialsAPIKeyAuthType;
import com.airbyte.api.models.shared.SourceTrustpilotCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceTrustpilotCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceTrustpilotTrustpilot;
import com.airbyte.api.models.shared.SourceTvmazeSchedule;
import com.airbyte.api.models.shared.SourceTvmazeScheduleTvmazeSchedule;
import com.airbyte.api.models.shared.SourceTwilio;
import com.airbyte.api.models.shared.SourceTwilioTaskrouter;
import com.airbyte.api.models.shared.SourceTwilioTaskrouterTwilioTaskrouter;
import com.airbyte.api.models.shared.SourceTwilioTwilio;
import com.airbyte.api.models.shared.SourceTwitter;
import com.airbyte.api.models.shared.SourceTwitterTwitter;
import com.airbyte.api.models.shared.SourceTypeform;
import com.airbyte.api.models.shared.SourceTypeformTypeform;
import com.airbyte.api.models.shared.SourceUsCensus;
import com.airbyte.api.models.shared.SourceUsCensusUsCensus;
import com.airbyte.api.models.shared.SourceVantage;
import com.airbyte.api.models.shared.SourceVantageVantage;
import com.airbyte.api.models.shared.SourceWebflow;
import com.airbyte.api.models.shared.SourceWebflowWebflow;
import com.airbyte.api.models.shared.SourceWhiskyHunter;
import com.airbyte.api.models.shared.SourceWhiskyHunterWhiskyHunter;
import com.airbyte.api.models.shared.SourceWikipediaPageviews;
import com.airbyte.api.models.shared.SourceWikipediaPageviewsWikipediaPageviews;
import com.airbyte.api.models.shared.SourceWoocommerce;
import com.airbyte.api.models.shared.SourceWoocommerceWoocommerce;
import com.airbyte.api.models.shared.SourceXero;
import com.airbyte.api.models.shared.SourceXeroAuthenticateViaXeroOAuth;
import com.airbyte.api.models.shared.SourceXeroXero;
import com.airbyte.api.models.shared.SourceXkcd;
import com.airbyte.api.models.shared.SourceXkcdXkcd;
import com.airbyte.api.models.shared.SourceYandexMetrica;
import com.airbyte.api.models.shared.SourceYandexMetricaYandexMetrica;
import com.airbyte.api.models.shared.SourceYotpo;
import com.airbyte.api.models.shared.SourceYotpoYotpo;
import com.airbyte.api.models.shared.SourceYounium;
import com.airbyte.api.models.shared.SourceYouniumYounium;
import com.airbyte.api.models.shared.SourceYoutubeAnalytics;
import com.airbyte.api.models.shared.SourceYoutubeAnalyticsYoutubeAnalytics;
import com.airbyte.api.models.shared.SourceZendeskChat;
import com.airbyte.api.models.shared.SourceZendeskChatCredentialsAccessToken;
import com.airbyte.api.models.shared.SourceZendeskChatCredentialsAccessTokenCredentials;
import com.airbyte.api.models.shared.SourceZendeskChatCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceZendeskChatCredentialsOAuth20Credentials;
import com.airbyte.api.models.shared.SourceZendeskChatZendeskChat;
import com.airbyte.api.models.shared.SourceZendeskSunshine;
import com.airbyte.api.models.shared.SourceZendeskSunshineCredentialsAPIToken;
import com.airbyte.api.models.shared.SourceZendeskSunshineCredentialsAPITokenAuthMethod;
import com.airbyte.api.models.shared.SourceZendeskSunshineCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceZendeskSunshineCredentialsOAuth20AuthMethod;
import com.airbyte.api.models.shared.SourceZendeskSunshineZendeskSunshine;
import com.airbyte.api.models.shared.SourceZendeskSupport;
import com.airbyte.api.models.shared.SourceZendeskSupportZendeskSupport;
import com.airbyte.api.models.shared.SourceZendeskTalk;
import com.airbyte.api.models.shared.SourceZendeskTalkZendeskTalk;
import com.airbyte.api.models.shared.SourceZenloop;
import com.airbyte.api.models.shared.SourceZenloopZenloop;
import com.airbyte.api.models.shared.SourceZohoCRMZohoCRMEdition;
import com.airbyte.api.models.shared.SourceZohoCrm;
import com.airbyte.api.models.shared.SourceZohoCrmDataCenterLocation;
import com.airbyte.api.models.shared.SourceZohoCrmEnvironment;
import com.airbyte.api.models.shared.SourceZohoCrmZohoCrm;
import com.airbyte.api.models.shared.SourceZoom;
import com.airbyte.api.models.shared.SourceZoomZoom;
import com.airbyte.api.models.shared.SourceZuora;
import com.airbyte.api.models.shared.SourceZuoraDataQueryType;
import com.airbyte.api.models.shared.SourceZuoraTenantEndpointLocation;
import com.airbyte.api.models.shared.SourceZuoraZuora;
import java.time.LocalDate;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security("dignissimos") {{
                    bearerAuth = "";
                }})
                .build();

            com.airbyte.api.models.shared.SourceCreateRequest req = new SourceCreateRequest(                new SourceYandexMetrica("odio", "similique", SourceYandexMetricaYandexMetrica.YANDEX_METRICA, LocalDate.parse("2022-01-01")) {{
                                authToken = "distinctio";
                                counterId = "quod";
                                endDate = LocalDate.parse("2022-01-01");
                                sourceType = SourceYandexMetricaYandexMetrica.YANDEX_METRICA;
                                startDate = LocalDate.parse("2022-01-01");
                            }}, "facilis", "d74dd39c-0f5d-42cf-b7c7-0a45626d4368") {{
                secretId = "dicta";
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

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [com.airbyte.api.models.shared.SourceCreateRequest](../../models/shared/SourceCreateRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |


### Response

**[com.airbyte.api.models.operations.CreateSourceResponse](../../models/operations/CreateSourceResponse.md)**


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
                .setSecurity(new Security("dolor") {{
                    bearerAuth = "";
                }})
                .build();

            DeleteSourceRequest req = new DeleteSourceRequest("maiores");            

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

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [com.airbyte.api.models.operations.DeleteSourceRequest](../../models/operations/DeleteSourceRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |


### Response

**[com.airbyte.api.models.operations.DeleteSourceResponse](../../models/operations/DeleteSourceResponse.md)**


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
                .setSecurity(new Security("quasi") {{
                    bearerAuth = "";
                }})
                .build();

            GetSourceRequest req = new GetSourceRequest("ex");            

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

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [com.airbyte.api.models.operations.GetSourceRequest](../../models/operations/GetSourceRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[com.airbyte.api.models.operations.GetSourceResponse](../../models/operations/GetSourceResponse.md)**


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
import com.airbyte.api.models.shared.OAuthInputConfiguration;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security("nulla") {{
                    bearerAuth = "";
                }})
                .build();

            com.airbyte.api.models.shared.InitiateOauthRequest req = new InitiateOauthRequest("excepturi", "voluptatibus", "5fce6c55-6146-4c3e-a50f-b008c42e141a") {{
                oAuthInputConfiguration = new OAuthInputConfiguration();;
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

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [com.airbyte.api.models.shared.InitiateOauthRequest](../../models/shared/InitiateOauthRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[com.airbyte.api.models.operations.InitiateOAuthResponse](../../models/operations/InitiateOAuthResponse.md)**


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
                .setSecurity(new Security("laborum") {{
                    bearerAuth = "";
                }})
                .build();

            ListSourcesRequest req = new ListSourcesRequest() {{
                includeDeleted = false;
                limit = 810424;
                offset = 245367;
                workspaceIds = new String[]{{
                    add("6c8dd6b1-4429-4074-b477-8a7bd466d28c"),
                    add("10ab3cdc-a425-4190-8e52-3c7e0bc7178e"),
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

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [com.airbyte.api.models.operations.ListSourcesRequest](../../models/operations/ListSourcesRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |


### Response

**[com.airbyte.api.models.operations.ListSourcesResponse](../../models/operations/ListSourcesResponse.md)**


## patchSource

Update a Source

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.PatchSourceRequest;
import com.airbyte.api.models.operations.PatchSourceResponse;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.models.shared.SourceAircall;
import com.airbyte.api.models.shared.SourceAircallAircall;
import com.airbyte.api.models.shared.SourceAirtable;
import com.airbyte.api.models.shared.SourceAirtableAirtable;
import com.airbyte.api.models.shared.SourceAirtableCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceAirtableCredentialsOAuth20AuthMethod;
import com.airbyte.api.models.shared.SourceAirtableCredentialsPersonalAccessToken;
import com.airbyte.api.models.shared.SourceAirtableCredentialsPersonalAccessTokenAuthMethod;
import com.airbyte.api.models.shared.SourceAlloydb;
import com.airbyte.api.models.shared.SourceAlloydbAlloydb;
import com.airbyte.api.models.shared.SourceAlloydbReplicationMethodStandard;
import com.airbyte.api.models.shared.SourceAlloydbReplicationMethodStandardMethod;
import com.airbyte.api.models.shared.SourceAlloydbTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.SourceAlloydbTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.SourceAlloydbTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.SourceAlloydbTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceAlloydbTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourceAlloydbTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceAmazonAds;
import com.airbyte.api.models.shared.SourceAmazonAdsAmazonAds;
import com.airbyte.api.models.shared.SourceAmazonAdsAuthType;
import com.airbyte.api.models.shared.SourceAmazonAdsRegion;
import com.airbyte.api.models.shared.SourceAmazonAdsReportRecordTypes;
import com.airbyte.api.models.shared.SourceAmazonAdsStateFilter;
import com.airbyte.api.models.shared.SourceAmazonSqs;
import com.airbyte.api.models.shared.SourceAmazonSqsAWSRegion;
import com.airbyte.api.models.shared.SourceAmazonSqsAmazonSqs;
import com.airbyte.api.models.shared.SourceAmplitude;
import com.airbyte.api.models.shared.SourceAmplitudeAmplitude;
import com.airbyte.api.models.shared.SourceAmplitudeDataRegion;
import com.airbyte.api.models.shared.SourceApifyDataset;
import com.airbyte.api.models.shared.SourceApifyDatasetApifyDataset;
import com.airbyte.api.models.shared.SourceAsana;
import com.airbyte.api.models.shared.SourceAsanaAsana;
import com.airbyte.api.models.shared.SourceAsanaCredentialsAuthenticateViaAsanaOauth;
import com.airbyte.api.models.shared.SourceAsanaCredentialsAuthenticateViaAsanaOauthCredentialsTitle;
import com.airbyte.api.models.shared.SourceAsanaCredentialsAuthenticateWithPersonalAccessToken;
import com.airbyte.api.models.shared.SourceAsanaCredentialsAuthenticateWithPersonalAccessTokenCredentialsTitle;
import com.airbyte.api.models.shared.SourceAuth0;
import com.airbyte.api.models.shared.SourceAuth0Auth0;
import com.airbyte.api.models.shared.SourceAuth0CredentialsOAuth2AccessToken;
import com.airbyte.api.models.shared.SourceAuth0CredentialsOAuth2AccessTokenAuthenticationMethod;
import com.airbyte.api.models.shared.SourceAuth0CredentialsOAuth2ConfidentialApplication;
import com.airbyte.api.models.shared.SourceAuth0CredentialsOAuth2ConfidentialApplicationAuthenticationMethod;
import com.airbyte.api.models.shared.SourceAwsCloudtrail;
import com.airbyte.api.models.shared.SourceAwsCloudtrailAwsCloudtrail;
import com.airbyte.api.models.shared.SourceAzureBlobStorage;
import com.airbyte.api.models.shared.SourceAzureBlobStorageAzureBlobStorage;
import com.airbyte.api.models.shared.SourceAzureBlobStorageFormatJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.SourceAzureBlobStorageFormatJSONLinesNewlineDelimitedJSONFormatType;
import com.airbyte.api.models.shared.SourceAzureTable;
import com.airbyte.api.models.shared.SourceAzureTableAzureTable;
import com.airbyte.api.models.shared.SourceBambooHr;
import com.airbyte.api.models.shared.SourceBambooHrBambooHr;
import com.airbyte.api.models.shared.SourceBigcommerce;
import com.airbyte.api.models.shared.SourceBigcommerceBigcommerce;
import com.airbyte.api.models.shared.SourceBigquery;
import com.airbyte.api.models.shared.SourceBigqueryBigquery;
import com.airbyte.api.models.shared.SourceBingAds;
import com.airbyte.api.models.shared.SourceBingAdsAuthMethod;
import com.airbyte.api.models.shared.SourceBingAdsBingAds;
import com.airbyte.api.models.shared.SourceBraintree;
import com.airbyte.api.models.shared.SourceBraintreeBraintree;
import com.airbyte.api.models.shared.SourceBraintreeEnvironment;
import com.airbyte.api.models.shared.SourceBraze;
import com.airbyte.api.models.shared.SourceBrazeBraze;
import com.airbyte.api.models.shared.SourceChargebee;
import com.airbyte.api.models.shared.SourceChargebeeChargebee;
import com.airbyte.api.models.shared.SourceChargebeeProductCatalog;
import com.airbyte.api.models.shared.SourceChartmogul;
import com.airbyte.api.models.shared.SourceChartmogulChartmogul;
import com.airbyte.api.models.shared.SourceChartmogulInterval;
import com.airbyte.api.models.shared.SourceClickhouse;
import com.airbyte.api.models.shared.SourceClickhouseClickhouse;
import com.airbyte.api.models.shared.SourceClickhouseTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.SourceClickhouseTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.SourceClickhouseTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.SourceClickhouseTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceClickhouseTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourceClickhouseTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceClickupApi;
import com.airbyte.api.models.shared.SourceClickupApiClickupApi;
import com.airbyte.api.models.shared.SourceCloseCom;
import com.airbyte.api.models.shared.SourceCloseComCloseCom;
import com.airbyte.api.models.shared.SourceCoda;
import com.airbyte.api.models.shared.SourceCodaCoda;
import com.airbyte.api.models.shared.SourceCoinApi;
import com.airbyte.api.models.shared.SourceCoinApiCoinApi;
import com.airbyte.api.models.shared.SourceCoinApiEnvironment;
import com.airbyte.api.models.shared.SourceCoinmarketcap;
import com.airbyte.api.models.shared.SourceCoinmarketcapCoinmarketcap;
import com.airbyte.api.models.shared.SourceCoinmarketcapDataType;
import com.airbyte.api.models.shared.SourceConfigcat;
import com.airbyte.api.models.shared.SourceConfigcatConfigcat;
import com.airbyte.api.models.shared.SourceConfluence;
import com.airbyte.api.models.shared.SourceConfluenceConfluence;
import com.airbyte.api.models.shared.SourceDatascope;
import com.airbyte.api.models.shared.SourceDatascopeDatascope;
import com.airbyte.api.models.shared.SourceDelighted;
import com.airbyte.api.models.shared.SourceDelightedDelighted;
import com.airbyte.api.models.shared.SourceDixa;
import com.airbyte.api.models.shared.SourceDixaDixa;
import com.airbyte.api.models.shared.SourceDockerhub;
import com.airbyte.api.models.shared.SourceDockerhubDockerhub;
import com.airbyte.api.models.shared.SourceDremio;
import com.airbyte.api.models.shared.SourceDremioDremio;
import com.airbyte.api.models.shared.SourceDynamodb;
import com.airbyte.api.models.shared.SourceDynamodbDynamodb;
import com.airbyte.api.models.shared.SourceDynamodbDynamodbRegion;
import com.airbyte.api.models.shared.SourceE2eTestCloud;
import com.airbyte.api.models.shared.SourceE2eTestCloudE2eTestCloud;
import com.airbyte.api.models.shared.SourceE2eTestCloudMockCatalogMultiSchema;
import com.airbyte.api.models.shared.SourceE2eTestCloudMockCatalogMultiSchemaType;
import com.airbyte.api.models.shared.SourceE2eTestCloudMockCatalogSingleSchema;
import com.airbyte.api.models.shared.SourceE2eTestCloudMockCatalogSingleSchemaType;
import com.airbyte.api.models.shared.SourceE2eTestCloudType;
import com.airbyte.api.models.shared.SourceEmailoctopus;
import com.airbyte.api.models.shared.SourceEmailoctopusEmailoctopus;
import com.airbyte.api.models.shared.SourceExchangeRates;
import com.airbyte.api.models.shared.SourceExchangeRatesExchangeRates;
import com.airbyte.api.models.shared.SourceFacebookMarketing;
import com.airbyte.api.models.shared.SourceFacebookMarketingFacebookMarketing;
import com.airbyte.api.models.shared.SourceFacebookMarketingInsightConfig;
import com.airbyte.api.models.shared.SourceFacebookMarketingInsightConfigLevel;
import com.airbyte.api.models.shared.SourceFacebookMarketingInsightConfigValidActionBreakdowns;
import com.airbyte.api.models.shared.SourceFacebookMarketingInsightConfigValidBreakdowns;
import com.airbyte.api.models.shared.SourceFacebookMarketingInsightConfigValidEnums;
import com.airbyte.api.models.shared.SourceFacebookPages;
import com.airbyte.api.models.shared.SourceFacebookPagesFacebookPages;
import com.airbyte.api.models.shared.SourceFaker;
import com.airbyte.api.models.shared.SourceFakerFaker;
import com.airbyte.api.models.shared.SourceFauna;
import com.airbyte.api.models.shared.SourceFaunaCollection;
import com.airbyte.api.models.shared.SourceFaunaCollectionDeletionsDisabled;
import com.airbyte.api.models.shared.SourceFaunaCollectionDeletionsDisabledDeletionMode;
import com.airbyte.api.models.shared.SourceFaunaCollectionDeletionsEnabled;
import com.airbyte.api.models.shared.SourceFaunaCollectionDeletionsEnabledDeletionMode;
import com.airbyte.api.models.shared.SourceFaunaFauna;
import com.airbyte.api.models.shared.SourceFileSecure;
import com.airbyte.api.models.shared.SourceFileSecureFileFormat;
import com.airbyte.api.models.shared.SourceFileSecureFileSecure;
import com.airbyte.api.models.shared.SourceFileSecureProviderAzBlobAzureBlobStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderAzBlobAzureBlobStorageStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderGCSGoogleCloudStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderGCSGoogleCloudStorageStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderHTTPSPublicWeb;
import com.airbyte.api.models.shared.SourceFileSecureProviderHTTPSPublicWebStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderS3AmazonWebServices;
import com.airbyte.api.models.shared.SourceFileSecureProviderS3AmazonWebServicesStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderSCPSecureCopyProtocol;
import com.airbyte.api.models.shared.SourceFileSecureProviderSCPSecureCopyProtocolStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderSFTPSecureFileTransferProtocol;
import com.airbyte.api.models.shared.SourceFileSecureProviderSFTPSecureFileTransferProtocolStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderSSHSecureShell;
import com.airbyte.api.models.shared.SourceFileSecureProviderSSHSecureShellStorage;
import com.airbyte.api.models.shared.SourceFirebolt;
import com.airbyte.api.models.shared.SourceFireboltFirebolt;
import com.airbyte.api.models.shared.SourceFreshcaller;
import com.airbyte.api.models.shared.SourceFreshcallerFreshcaller;
import com.airbyte.api.models.shared.SourceFreshdesk;
import com.airbyte.api.models.shared.SourceFreshdeskFreshdesk;
import com.airbyte.api.models.shared.SourceFreshsales;
import com.airbyte.api.models.shared.SourceFreshsalesFreshsales;
import com.airbyte.api.models.shared.SourceFreshservice;
import com.airbyte.api.models.shared.SourceFreshserviceFreshservice;
import com.airbyte.api.models.shared.SourceGcs;
import com.airbyte.api.models.shared.SourceGcsGcs;
import com.airbyte.api.models.shared.SourceGetlago;
import com.airbyte.api.models.shared.SourceGetlagoGetlago;
import com.airbyte.api.models.shared.SourceGithub;
import com.airbyte.api.models.shared.SourceGithubCredentialsOAuth;
import com.airbyte.api.models.shared.SourceGithubCredentialsOAuthOptionTitle;
import com.airbyte.api.models.shared.SourceGithubCredentialsPersonalAccessToken;
import com.airbyte.api.models.shared.SourceGithubCredentialsPersonalAccessTokenOptionTitle;
import com.airbyte.api.models.shared.SourceGithubGithub;
import com.airbyte.api.models.shared.SourceGitlab;
import com.airbyte.api.models.shared.SourceGitlabCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceGitlabCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceGitlabCredentialsPrivateToken;
import com.airbyte.api.models.shared.SourceGitlabCredentialsPrivateTokenAuthType;
import com.airbyte.api.models.shared.SourceGitlabGitlab;
import com.airbyte.api.models.shared.SourceGlassfrog;
import com.airbyte.api.models.shared.SourceGlassfrogGlassfrog;
import com.airbyte.api.models.shared.SourceGnews;
import com.airbyte.api.models.shared.SourceGnewsCountry;
import com.airbyte.api.models.shared.SourceGnewsGnews;
import com.airbyte.api.models.shared.SourceGnewsIn;
import com.airbyte.api.models.shared.SourceGnewsLanguage;
import com.airbyte.api.models.shared.SourceGnewsNullable;
import com.airbyte.api.models.shared.SourceGnewsSortBy;
import com.airbyte.api.models.shared.SourceGnewsTopHeadlinesTopic;
import com.airbyte.api.models.shared.SourceGoogleAds;
import com.airbyte.api.models.shared.SourceGoogleAdsCustomQueries;
import com.airbyte.api.models.shared.SourceGoogleAdsGoogleAds;
import com.airbyte.api.models.shared.SourceGoogleAdsGoogleCredentials;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApi;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiCredentialsAuthenticateViaGoogleOauth;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiCredentialsAuthenticateViaGoogleOauthAuthType;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiCredentialsServiceAccountKeyAuthentication;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiCredentialsServiceAccountKeyAuthenticationAuthType;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiGoogleAnalyticsDataApi;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsV4;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauth;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauthAuthType;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsV4CredentialsServiceAccountKeyAuthentication;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsV4CredentialsServiceAccountKeyAuthenticationAuthType;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsV4GoogleAnalyticsV4;
import com.airbyte.api.models.shared.SourceGoogleDirectory;
import com.airbyte.api.models.shared.SourceGoogleDirectoryGoogleDirectory;
import com.airbyte.api.models.shared.SourceGooglePagespeedInsights;
import com.airbyte.api.models.shared.SourceGooglePagespeedInsightsCategories;
import com.airbyte.api.models.shared.SourceGooglePagespeedInsightsGooglePagespeedInsights;
import com.airbyte.api.models.shared.SourceGooglePagespeedInsightsStrategies;
import com.airbyte.api.models.shared.SourceGoogleSearchConsole;
import com.airbyte.api.models.shared.SourceGoogleSearchConsoleAuthorizationOAuth;
import com.airbyte.api.models.shared.SourceGoogleSearchConsoleAuthorizationOAuthAuthType;
import com.airbyte.api.models.shared.SourceGoogleSearchConsoleAuthorizationServiceAccountKeyAuthentication;
import com.airbyte.api.models.shared.SourceGoogleSearchConsoleAuthorizationServiceAccountKeyAuthenticationAuthType;
import com.airbyte.api.models.shared.SourceGoogleSearchConsoleDataState;
import com.airbyte.api.models.shared.SourceGoogleSearchConsoleGoogleSearchConsole;
import com.airbyte.api.models.shared.SourceGoogleSheets;
import com.airbyte.api.models.shared.SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuth;
import com.airbyte.api.models.shared.SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuthAuthType;
import com.airbyte.api.models.shared.SourceGoogleSheetsCredentialsServiceAccountKeyAuthentication;
import com.airbyte.api.models.shared.SourceGoogleSheetsCredentialsServiceAccountKeyAuthenticationAuthType;
import com.airbyte.api.models.shared.SourceGoogleSheetsGoogleSheets;
import com.airbyte.api.models.shared.SourceGoogleWebfonts;
import com.airbyte.api.models.shared.SourceGoogleWebfontsGoogleWebfonts;
import com.airbyte.api.models.shared.SourceGoogleWorkspaceAdminReports;
import com.airbyte.api.models.shared.SourceGoogleWorkspaceAdminReportsGoogleWorkspaceAdminReports;
import com.airbyte.api.models.shared.SourceGreenhouse;
import com.airbyte.api.models.shared.SourceGreenhouseGreenhouse;
import com.airbyte.api.models.shared.SourceGridly;
import com.airbyte.api.models.shared.SourceGridlyGridly;
import com.airbyte.api.models.shared.SourceHarvest;
import com.airbyte.api.models.shared.SourceHarvestHarvest;
import com.airbyte.api.models.shared.SourceHubplanner;
import com.airbyte.api.models.shared.SourceHubplannerHubplanner;
import com.airbyte.api.models.shared.SourceHubspot;
import com.airbyte.api.models.shared.SourceHubspotCredentialsOAuth;
import com.airbyte.api.models.shared.SourceHubspotCredentialsOAuthAuthType;
import com.airbyte.api.models.shared.SourceHubspotCredentialsPrivateApp;
import com.airbyte.api.models.shared.SourceHubspotCredentialsPrivateAppAuthType;
import com.airbyte.api.models.shared.SourceHubspotHubspot;
import com.airbyte.api.models.shared.SourceInsightly;
import com.airbyte.api.models.shared.SourceInsightlyInsightly;
import com.airbyte.api.models.shared.SourceInstagram;
import com.airbyte.api.models.shared.SourceInstagramInstagram;
import com.airbyte.api.models.shared.SourceInstatus;
import com.airbyte.api.models.shared.SourceInstatusInstatus;
import com.airbyte.api.models.shared.SourceIntercom;
import com.airbyte.api.models.shared.SourceIntercomIntercom;
import com.airbyte.api.models.shared.SourceIp2whois;
import com.airbyte.api.models.shared.SourceIp2whoisIp2whois;
import com.airbyte.api.models.shared.SourceIterable;
import com.airbyte.api.models.shared.SourceIterableIterable;
import com.airbyte.api.models.shared.SourceJira;
import com.airbyte.api.models.shared.SourceJiraJira;
import com.airbyte.api.models.shared.SourceK6Cloud;
import com.airbyte.api.models.shared.SourceK6CloudK6Cloud;
import com.airbyte.api.models.shared.SourceKlarna;
import com.airbyte.api.models.shared.SourceKlarnaKlarna;
import com.airbyte.api.models.shared.SourceKlarnaRegion;
import com.airbyte.api.models.shared.SourceKlaviyo;
import com.airbyte.api.models.shared.SourceKlaviyoKlaviyo;
import com.airbyte.api.models.shared.SourceKustomerSinger;
import com.airbyte.api.models.shared.SourceKustomerSingerKustomerSinger;
import com.airbyte.api.models.shared.SourceLaunchdarkly;
import com.airbyte.api.models.shared.SourceLaunchdarklyLaunchdarkly;
import com.airbyte.api.models.shared.SourceLemlist;
import com.airbyte.api.models.shared.SourceLemlistLemlist;
import com.airbyte.api.models.shared.SourceLinkedinAds;
import com.airbyte.api.models.shared.SourceLinkedinAdsCredentialsAccessToken;
import com.airbyte.api.models.shared.SourceLinkedinAdsCredentialsAccessTokenAuthMethod;
import com.airbyte.api.models.shared.SourceLinkedinAdsCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceLinkedinAdsCredentialsOAuth20AuthMethod;
import com.airbyte.api.models.shared.SourceLinkedinAdsLinkedinAds;
import com.airbyte.api.models.shared.SourceLinkedinPages;
import com.airbyte.api.models.shared.SourceLinkedinPagesCredentialsAccessToken;
import com.airbyte.api.models.shared.SourceLinkedinPagesCredentialsAccessTokenAuthMethod;
import com.airbyte.api.models.shared.SourceLinkedinPagesCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceLinkedinPagesCredentialsOAuth20AuthMethod;
import com.airbyte.api.models.shared.SourceLinkedinPagesLinkedinPages;
import com.airbyte.api.models.shared.SourceLinnworks;
import com.airbyte.api.models.shared.SourceLinnworksLinnworks;
import com.airbyte.api.models.shared.SourceLokalise;
import com.airbyte.api.models.shared.SourceLokaliseLokalise;
import com.airbyte.api.models.shared.SourceMailchimp;
import com.airbyte.api.models.shared.SourceMailchimpCredentialsAPIKey;
import com.airbyte.api.models.shared.SourceMailchimpCredentialsAPIKeyAuthType;
import com.airbyte.api.models.shared.SourceMailchimpCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceMailchimpCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceMailchimpMailchimp;
import com.airbyte.api.models.shared.SourceMailgun;
import com.airbyte.api.models.shared.SourceMailgunMailgun;
import com.airbyte.api.models.shared.SourceMailjetSms;
import com.airbyte.api.models.shared.SourceMailjetSmsMailjetSms;
import com.airbyte.api.models.shared.SourceMarketo;
import com.airbyte.api.models.shared.SourceMarketoMarketo;
import com.airbyte.api.models.shared.SourceMetabase;
import com.airbyte.api.models.shared.SourceMetabaseMetabase;
import com.airbyte.api.models.shared.SourceMicrosoftTeams;
import com.airbyte.api.models.shared.SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoft;
import com.airbyte.api.models.shared.SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftAuthType;
import com.airbyte.api.models.shared.SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftOAuth20;
import com.airbyte.api.models.shared.SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftOAuth20AuthType;
import com.airbyte.api.models.shared.SourceMicrosoftTeamsMicrosoftTeams;
import com.airbyte.api.models.shared.SourceMixpanel;
import com.airbyte.api.models.shared.SourceMixpanelCredentialsProjectSecret;
import com.airbyte.api.models.shared.SourceMixpanelCredentialsProjectSecretOptionTitle;
import com.airbyte.api.models.shared.SourceMixpanelCredentialsServiceAccount;
import com.airbyte.api.models.shared.SourceMixpanelCredentialsServiceAccountOptionTitle;
import com.airbyte.api.models.shared.SourceMixpanelMixpanel;
import com.airbyte.api.models.shared.SourceMixpanelRegion;
import com.airbyte.api.models.shared.SourceMonday;
import com.airbyte.api.models.shared.SourceMondayCredentialsAPIToken;
import com.airbyte.api.models.shared.SourceMondayCredentialsAPITokenAuthType;
import com.airbyte.api.models.shared.SourceMondayCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceMondayCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceMondayMonday;
import com.airbyte.api.models.shared.SourceMongodb;
import com.airbyte.api.models.shared.SourceMongodbInstanceTypeMongoDBAtlas;
import com.airbyte.api.models.shared.SourceMongodbInstanceTypeMongoDBAtlasInstance;
import com.airbyte.api.models.shared.SourceMongodbInstanceTypeReplicaSet;
import com.airbyte.api.models.shared.SourceMongodbInstanceTypeReplicaSetInstance;
import com.airbyte.api.models.shared.SourceMongodbInstanceTypeStandaloneMongoDbInstance;
import com.airbyte.api.models.shared.SourceMongodbInstanceTypeStandaloneMongoDbInstanceInstance;
import com.airbyte.api.models.shared.SourceMongodbMongodb;
import com.airbyte.api.models.shared.SourceMssql;
import com.airbyte.api.models.shared.SourceMssqlMssql;
import com.airbyte.api.models.shared.SourceMssqlReplicationMethodLogicalReplicationCDC;
import com.airbyte.api.models.shared.SourceMssqlReplicationMethodLogicalReplicationCDCDataToSync;
import com.airbyte.api.models.shared.SourceMssqlReplicationMethodLogicalReplicationCDCInitialSnapshotIsolationLevel;
import com.airbyte.api.models.shared.SourceMssqlReplicationMethodLogicalReplicationCDCMethod;
import com.airbyte.api.models.shared.SourceMssqlReplicationMethodStandard;
import com.airbyte.api.models.shared.SourceMssqlReplicationMethodStandardMethod;
import com.airbyte.api.models.shared.SourceMssqlSslMethodEncryptedTrustServerCertificate;
import com.airbyte.api.models.shared.SourceMssqlSslMethodEncryptedTrustServerCertificateSslMethod;
import com.airbyte.api.models.shared.SourceMssqlSslMethodEncryptedVerifyCertificate;
import com.airbyte.api.models.shared.SourceMssqlSslMethodEncryptedVerifyCertificateSslMethod;
import com.airbyte.api.models.shared.SourceMssqlTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.SourceMssqlTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.SourceMssqlTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.SourceMssqlTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceMssqlTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourceMssqlTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceMyHours;
import com.airbyte.api.models.shared.SourceMyHoursMyHours;
import com.airbyte.api.models.shared.SourceMysql;
import com.airbyte.api.models.shared.SourceMysqlMysql;
import com.airbyte.api.models.shared.SourceMysqlReplicationMethodLogicalReplicationCDC;
import com.airbyte.api.models.shared.SourceMysqlReplicationMethodLogicalReplicationCDCMethod;
import com.airbyte.api.models.shared.SourceMysqlReplicationMethodStandard;
import com.airbyte.api.models.shared.SourceMysqlReplicationMethodStandardMethod;
import com.airbyte.api.models.shared.SourceMysqlSslModePreferred;
import com.airbyte.api.models.shared.SourceMysqlSslModePreferredMode;
import com.airbyte.api.models.shared.SourceMysqlSslModeRequired;
import com.airbyte.api.models.shared.SourceMysqlSslModeRequiredMode;
import com.airbyte.api.models.shared.SourceMysqlSslModeVerifyCA;
import com.airbyte.api.models.shared.SourceMysqlSslModeVerifyCAMode;
import com.airbyte.api.models.shared.SourceMysqlSslModeVerifyIdentity;
import com.airbyte.api.models.shared.SourceMysqlSslModeVerifyIdentityMode;
import com.airbyte.api.models.shared.SourceMysqlTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.SourceMysqlTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.SourceMysqlTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.SourceMysqlTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceMysqlTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourceMysqlTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceNetsuite;
import com.airbyte.api.models.shared.SourceNetsuiteNetsuite;
import com.airbyte.api.models.shared.SourceNotion;
import com.airbyte.api.models.shared.SourceNotionCredentialsAccessToken;
import com.airbyte.api.models.shared.SourceNotionCredentialsAccessTokenAuthType;
import com.airbyte.api.models.shared.SourceNotionCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceNotionCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceNotionNotion;
import com.airbyte.api.models.shared.SourceNytimes;
import com.airbyte.api.models.shared.SourceNytimesNytimes;
import com.airbyte.api.models.shared.SourceNytimesPeriodUsedForMostPopularStreams;
import com.airbyte.api.models.shared.SourceNytimesShareTypeUsedForMostPopularSharedStream;
import com.airbyte.api.models.shared.SourceOkta;
import com.airbyte.api.models.shared.SourceOktaCredentialsAPIToken;
import com.airbyte.api.models.shared.SourceOktaCredentialsAPITokenAuthType;
import com.airbyte.api.models.shared.SourceOktaCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceOktaCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceOktaOkta;
import com.airbyte.api.models.shared.SourceOmnisend;
import com.airbyte.api.models.shared.SourceOmnisendOmnisend;
import com.airbyte.api.models.shared.SourceOnesignal;
import com.airbyte.api.models.shared.SourceOnesignalApplications;
import com.airbyte.api.models.shared.SourceOnesignalOnesignal;
import com.airbyte.api.models.shared.SourceOpenweather;
import com.airbyte.api.models.shared.SourceOpenweatherLanguage;
import com.airbyte.api.models.shared.SourceOpenweatherOpenweather;
import com.airbyte.api.models.shared.SourceOpenweatherUnits;
import com.airbyte.api.models.shared.SourceOracle;
import com.airbyte.api.models.shared.SourceOracleConnectionDataServiceName;
import com.airbyte.api.models.shared.SourceOracleConnectionDataServiceNameConnectionType;
import com.airbyte.api.models.shared.SourceOracleConnectionDataSystemIDSID;
import com.airbyte.api.models.shared.SourceOracleConnectionDataSystemIDSIDConnectionType;
import com.airbyte.api.models.shared.SourceOracleEncryptionNativeNetworkEncryptionNNE;
import com.airbyte.api.models.shared.SourceOracleEncryptionNativeNetworkEncryptionNNEEncryptionAlgorithm;
import com.airbyte.api.models.shared.SourceOracleEncryptionNativeNetworkEncryptionNNEEncryptionMethod;
import com.airbyte.api.models.shared.SourceOracleEncryptionTLSEncryptedVerifyCertificate;
import com.airbyte.api.models.shared.SourceOracleEncryptionTLSEncryptedVerifyCertificateEncryptionMethod;
import com.airbyte.api.models.shared.SourceOracleOracle;
import com.airbyte.api.models.shared.SourceOracleTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.SourceOracleTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.SourceOracleTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.SourceOracleTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceOracleTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourceOracleTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceOrb;
import com.airbyte.api.models.shared.SourceOrbOrb;
import com.airbyte.api.models.shared.SourceOrbit;
import com.airbyte.api.models.shared.SourceOrbitOrbit;
import com.airbyte.api.models.shared.SourceOutreach;
import com.airbyte.api.models.shared.SourceOutreachOutreach;
import com.airbyte.api.models.shared.SourcePatchRequest;
import com.airbyte.api.models.shared.SourcePaypalTransaction;
import com.airbyte.api.models.shared.SourcePaypalTransactionPaypalTransaction;
import com.airbyte.api.models.shared.SourcePaystack;
import com.airbyte.api.models.shared.SourcePaystackPaystack;
import com.airbyte.api.models.shared.SourcePendo;
import com.airbyte.api.models.shared.SourcePendoPendo;
import com.airbyte.api.models.shared.SourcePersistiq;
import com.airbyte.api.models.shared.SourcePersistiqPersistiq;
import com.airbyte.api.models.shared.SourcePexelsApi;
import com.airbyte.api.models.shared.SourcePexelsApiPexelsApi;
import com.airbyte.api.models.shared.SourcePinterest;
import com.airbyte.api.models.shared.SourcePinterestCredentialsAccessToken;
import com.airbyte.api.models.shared.SourcePinterestCredentialsAccessTokenAuthMethod;
import com.airbyte.api.models.shared.SourcePinterestCredentialsOAuth20;
import com.airbyte.api.models.shared.SourcePinterestCredentialsOAuth20AuthMethod;
import com.airbyte.api.models.shared.SourcePinterestPinterest;
import com.airbyte.api.models.shared.SourcePinterestStatus;
import com.airbyte.api.models.shared.SourcePipedrive;
import com.airbyte.api.models.shared.SourcePipedriveAPIKeyAuthentication;
import com.airbyte.api.models.shared.SourcePipedriveAPIKeyAuthenticationAuthType;
import com.airbyte.api.models.shared.SourcePipedrivePipedrive;
import com.airbyte.api.models.shared.SourcePocket;
import com.airbyte.api.models.shared.SourcePocketContentType;
import com.airbyte.api.models.shared.SourcePocketDetailType;
import com.airbyte.api.models.shared.SourcePocketPocket;
import com.airbyte.api.models.shared.SourcePocketSortBy;
import com.airbyte.api.models.shared.SourcePocketState;
import com.airbyte.api.models.shared.SourcePokeapi;
import com.airbyte.api.models.shared.SourcePokeapiPokeapi;
import com.airbyte.api.models.shared.SourcePolygonStockApi;
import com.airbyte.api.models.shared.SourcePolygonStockApiPolygonStockApi;
import com.airbyte.api.models.shared.SourcePostgres;
import com.airbyte.api.models.shared.SourcePostgresPostgres;
import com.airbyte.api.models.shared.SourcePostgresReplicationMethodStandard;
import com.airbyte.api.models.shared.SourcePostgresReplicationMethodStandardMethod;
import com.airbyte.api.models.shared.SourcePostgresTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.SourcePostgresTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.SourcePostgresTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.SourcePostgresTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourcePostgresTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourcePostgresTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourcePosthog;
import com.airbyte.api.models.shared.SourcePosthogPosthog;
import com.airbyte.api.models.shared.SourcePostmarkapp;
import com.airbyte.api.models.shared.SourcePostmarkappPostmarkapp;
import com.airbyte.api.models.shared.SourcePrestashop;
import com.airbyte.api.models.shared.SourcePrestashopPrestashop;
import com.airbyte.api.models.shared.SourcePublicApis;
import com.airbyte.api.models.shared.SourcePublicApisPublicApis;
import com.airbyte.api.models.shared.SourcePunkApi;
import com.airbyte.api.models.shared.SourcePunkApiPunkApi;
import com.airbyte.api.models.shared.SourcePypi;
import com.airbyte.api.models.shared.SourcePypiPypi;
import com.airbyte.api.models.shared.SourceQualaroo;
import com.airbyte.api.models.shared.SourceQualarooQualaroo;
import com.airbyte.api.models.shared.SourceQuickbooks;
import com.airbyte.api.models.shared.SourceQuickbooksCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceQuickbooksCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceQuickbooksQuickbooks;
import com.airbyte.api.models.shared.SourceRailz;
import com.airbyte.api.models.shared.SourceRailzRailz;
import com.airbyte.api.models.shared.SourceRecharge;
import com.airbyte.api.models.shared.SourceRechargeRecharge;
import com.airbyte.api.models.shared.SourceRecreation;
import com.airbyte.api.models.shared.SourceRecreationRecreation;
import com.airbyte.api.models.shared.SourceRecruitee;
import com.airbyte.api.models.shared.SourceRecruiteeRecruitee;
import com.airbyte.api.models.shared.SourceRecurly;
import com.airbyte.api.models.shared.SourceRecurlyRecurly;
import com.airbyte.api.models.shared.SourceRedshift;
import com.airbyte.api.models.shared.SourceRedshiftRedshift;
import com.airbyte.api.models.shared.SourceRetently;
import com.airbyte.api.models.shared.SourceRetentlyRetently;
import com.airbyte.api.models.shared.SourceRkiCovid;
import com.airbyte.api.models.shared.SourceRkiCovidRkiCovid;
import com.airbyte.api.models.shared.SourceRss;
import com.airbyte.api.models.shared.SourceRssRss;
import com.airbyte.api.models.shared.SourceS3;
import com.airbyte.api.models.shared.SourceS3FormatAvro;
import com.airbyte.api.models.shared.SourceS3FormatAvroFiletype;
import com.airbyte.api.models.shared.SourceS3FormatCSV;
import com.airbyte.api.models.shared.SourceS3FormatCSVFiletype;
import com.airbyte.api.models.shared.SourceS3FormatJsonl;
import com.airbyte.api.models.shared.SourceS3FormatJsonlFiletype;
import com.airbyte.api.models.shared.SourceS3FormatJsonlUnexpectedFieldBehavior;
import com.airbyte.api.models.shared.SourceS3FormatParquet;
import com.airbyte.api.models.shared.SourceS3FormatParquetFiletype;
import com.airbyte.api.models.shared.SourceS3S3;
import com.airbyte.api.models.shared.SourceS3S3AmazonWebServices;
import com.airbyte.api.models.shared.SourceSalesforce;
import com.airbyte.api.models.shared.SourceSalesforceAuthType;
import com.airbyte.api.models.shared.SourceSalesforceSalesforce;
import com.airbyte.api.models.shared.SourceSalesforceSinger;
import com.airbyte.api.models.shared.SourceSalesforceSingerApiType;
import com.airbyte.api.models.shared.SourceSalesforceSingerSalesforceSinger;
import com.airbyte.api.models.shared.SourceSalesforceStreamsCriteria;
import com.airbyte.api.models.shared.SourceSalesforceStreamsCriteriaSearchCriteria;
import com.airbyte.api.models.shared.SourceSalesloft;
import com.airbyte.api.models.shared.SourceSalesloftCredentialsAuthenticateViaAPIKey;
import com.airbyte.api.models.shared.SourceSalesloftCredentialsAuthenticateViaAPIKeyAuthType;
import com.airbyte.api.models.shared.SourceSalesloftCredentialsAuthenticateViaOAuth;
import com.airbyte.api.models.shared.SourceSalesloftCredentialsAuthenticateViaOAuthAuthType;
import com.airbyte.api.models.shared.SourceSalesloftSalesloft;
import com.airbyte.api.models.shared.SourceSapFieldglass;
import com.airbyte.api.models.shared.SourceSapFieldglassSapFieldglass;
import com.airbyte.api.models.shared.SourceSecoda;
import com.airbyte.api.models.shared.SourceSecodaSecoda;
import com.airbyte.api.models.shared.SourceSendgrid;
import com.airbyte.api.models.shared.SourceSendgridSendgrid;
import com.airbyte.api.models.shared.SourceSendinblue;
import com.airbyte.api.models.shared.SourceSendinblueSendinblue;
import com.airbyte.api.models.shared.SourceSenseforce;
import com.airbyte.api.models.shared.SourceSenseforceSenseforce;
import com.airbyte.api.models.shared.SourceSentry;
import com.airbyte.api.models.shared.SourceSentrySentry;
import com.airbyte.api.models.shared.SourceSftp;
import com.airbyte.api.models.shared.SourceSftpBulk;
import com.airbyte.api.models.shared.SourceSftpBulkFileType;
import com.airbyte.api.models.shared.SourceSftpBulkSftpBulk;
import com.airbyte.api.models.shared.SourceSftpCredentialsPasswordAuthentication;
import com.airbyte.api.models.shared.SourceSftpCredentialsPasswordAuthenticationAuthMethod;
import com.airbyte.api.models.shared.SourceSftpCredentialsSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourceSftpCredentialsSSHKeyAuthenticationAuthMethod;
import com.airbyte.api.models.shared.SourceSftpSftp;
import com.airbyte.api.models.shared.SourceShopify;
import com.airbyte.api.models.shared.SourceShopifyCredentialsAPIPassword;
import com.airbyte.api.models.shared.SourceShopifyCredentialsAPIPasswordAuthMethod;
import com.airbyte.api.models.shared.SourceShopifyCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceShopifyCredentialsOAuth20AuthMethod;
import com.airbyte.api.models.shared.SourceShopifyShopify;
import com.airbyte.api.models.shared.SourceShortio;
import com.airbyte.api.models.shared.SourceShortioShortio;
import com.airbyte.api.models.shared.SourceSlack;
import com.airbyte.api.models.shared.SourceSlackCredentialsAPIToken;
import com.airbyte.api.models.shared.SourceSlackCredentialsAPITokenOptionTitle;
import com.airbyte.api.models.shared.SourceSlackCredentialsSignInViaSlackOAuth;
import com.airbyte.api.models.shared.SourceSlackCredentialsSignInViaSlackOAuthOptionTitle;
import com.airbyte.api.models.shared.SourceSlackSlack;
import com.airbyte.api.models.shared.SourceSmaily;
import com.airbyte.api.models.shared.SourceSmailySmaily;
import com.airbyte.api.models.shared.SourceSmartengage;
import com.airbyte.api.models.shared.SourceSmartengageSmartengage;
import com.airbyte.api.models.shared.SourceSmartsheets;
import com.airbyte.api.models.shared.SourceSmartsheetsCredentialsAPIAccessToken;
import com.airbyte.api.models.shared.SourceSmartsheetsCredentialsAPIAccessTokenAuthType;
import com.airbyte.api.models.shared.SourceSmartsheetsCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceSmartsheetsCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceSmartsheetsSmartsheets;
import com.airbyte.api.models.shared.SourceSnapchatMarketing;
import com.airbyte.api.models.shared.SourceSnapchatMarketingSnapchatMarketing;
import com.airbyte.api.models.shared.SourceSnowflake;
import com.airbyte.api.models.shared.SourceSnowflakeCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceSnowflakeCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceSnowflakeCredentialsUsernameAndPassword;
import com.airbyte.api.models.shared.SourceSnowflakeCredentialsUsernameAndPasswordAuthType;
import com.airbyte.api.models.shared.SourceSnowflakeSnowflake;
import com.airbyte.api.models.shared.SourceSonarCloud;
import com.airbyte.api.models.shared.SourceSonarCloudSonarCloud;
import com.airbyte.api.models.shared.SourceSpacexApi;
import com.airbyte.api.models.shared.SourceSpacexApiSpacexApi;
import com.airbyte.api.models.shared.SourceSquare;
import com.airbyte.api.models.shared.SourceSquareCredentialsAPIKey;
import com.airbyte.api.models.shared.SourceSquareCredentialsAPIKeyAuthType;
import com.airbyte.api.models.shared.SourceSquareCredentialsOauthAuthentication;
import com.airbyte.api.models.shared.SourceSquareCredentialsOauthAuthenticationAuthType;
import com.airbyte.api.models.shared.SourceSquareSquare;
import com.airbyte.api.models.shared.SourceStrava;
import com.airbyte.api.models.shared.SourceStravaAuthType;
import com.airbyte.api.models.shared.SourceStravaStrava;
import com.airbyte.api.models.shared.SourceStripe;
import com.airbyte.api.models.shared.SourceStripeStripe;
import com.airbyte.api.models.shared.SourceSurveySparrow;
import com.airbyte.api.models.shared.SourceSurveySparrowRegionEUBasedAccount;
import com.airbyte.api.models.shared.SourceSurveySparrowRegionEUBasedAccountUrlBase;
import com.airbyte.api.models.shared.SourceSurveySparrowRegionGlobalAccount;
import com.airbyte.api.models.shared.SourceSurveySparrowRegionGlobalAccountUrlBase;
import com.airbyte.api.models.shared.SourceSurveySparrowSurveySparrow;
import com.airbyte.api.models.shared.SourceSurveymonkey;
import com.airbyte.api.models.shared.SourceSurveymonkeyOriginDatacenterOfTheSurveyMonkeyAccount;
import com.airbyte.api.models.shared.SourceSurveymonkeySurveyMonkeyAuthorizationMethod;
import com.airbyte.api.models.shared.SourceSurveymonkeySurveyMonkeyAuthorizationMethodAuthMethod;
import com.airbyte.api.models.shared.SourceSurveymonkeySurveymonkey;
import com.airbyte.api.models.shared.SourceTempo;
import com.airbyte.api.models.shared.SourceTempoTempo;
import com.airbyte.api.models.shared.SourceTheGuardianApi;
import com.airbyte.api.models.shared.SourceTheGuardianApiTheGuardianApi;
import com.airbyte.api.models.shared.SourceTiktokMarketing;
import com.airbyte.api.models.shared.SourceTiktokMarketingCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceTiktokMarketingCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceTiktokMarketingCredentialsSandboxAccessToken;
import com.airbyte.api.models.shared.SourceTiktokMarketingCredentialsSandboxAccessTokenAuthType;
import com.airbyte.api.models.shared.SourceTiktokMarketingTiktokMarketing;
import com.airbyte.api.models.shared.SourceTodoist;
import com.airbyte.api.models.shared.SourceTodoistTodoist;
import com.airbyte.api.models.shared.SourceTrello;
import com.airbyte.api.models.shared.SourceTrelloTrello;
import com.airbyte.api.models.shared.SourceTrustpilot;
import com.airbyte.api.models.shared.SourceTrustpilotCredentialsAPIKey;
import com.airbyte.api.models.shared.SourceTrustpilotCredentialsAPIKeyAuthType;
import com.airbyte.api.models.shared.SourceTrustpilotCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceTrustpilotCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceTrustpilotTrustpilot;
import com.airbyte.api.models.shared.SourceTvmazeSchedule;
import com.airbyte.api.models.shared.SourceTvmazeScheduleTvmazeSchedule;
import com.airbyte.api.models.shared.SourceTwilio;
import com.airbyte.api.models.shared.SourceTwilioTaskrouter;
import com.airbyte.api.models.shared.SourceTwilioTaskrouterTwilioTaskrouter;
import com.airbyte.api.models.shared.SourceTwilioTwilio;
import com.airbyte.api.models.shared.SourceTwitter;
import com.airbyte.api.models.shared.SourceTwitterTwitter;
import com.airbyte.api.models.shared.SourceTypeform;
import com.airbyte.api.models.shared.SourceTypeformTypeform;
import com.airbyte.api.models.shared.SourceUsCensus;
import com.airbyte.api.models.shared.SourceUsCensusUsCensus;
import com.airbyte.api.models.shared.SourceVantage;
import com.airbyte.api.models.shared.SourceVantageVantage;
import com.airbyte.api.models.shared.SourceWebflow;
import com.airbyte.api.models.shared.SourceWebflowWebflow;
import com.airbyte.api.models.shared.SourceWhiskyHunter;
import com.airbyte.api.models.shared.SourceWhiskyHunterWhiskyHunter;
import com.airbyte.api.models.shared.SourceWikipediaPageviews;
import com.airbyte.api.models.shared.SourceWikipediaPageviewsWikipediaPageviews;
import com.airbyte.api.models.shared.SourceWoocommerce;
import com.airbyte.api.models.shared.SourceWoocommerceWoocommerce;
import com.airbyte.api.models.shared.SourceXero;
import com.airbyte.api.models.shared.SourceXeroAuthenticateViaXeroOAuth;
import com.airbyte.api.models.shared.SourceXeroXero;
import com.airbyte.api.models.shared.SourceXkcd;
import com.airbyte.api.models.shared.SourceXkcdXkcd;
import com.airbyte.api.models.shared.SourceYandexMetrica;
import com.airbyte.api.models.shared.SourceYandexMetricaYandexMetrica;
import com.airbyte.api.models.shared.SourceYotpo;
import com.airbyte.api.models.shared.SourceYotpoYotpo;
import com.airbyte.api.models.shared.SourceYounium;
import com.airbyte.api.models.shared.SourceYouniumYounium;
import com.airbyte.api.models.shared.SourceYoutubeAnalytics;
import com.airbyte.api.models.shared.SourceYoutubeAnalyticsYoutubeAnalytics;
import com.airbyte.api.models.shared.SourceZendeskChat;
import com.airbyte.api.models.shared.SourceZendeskChatCredentialsAccessToken;
import com.airbyte.api.models.shared.SourceZendeskChatCredentialsAccessTokenCredentials;
import com.airbyte.api.models.shared.SourceZendeskChatCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceZendeskChatCredentialsOAuth20Credentials;
import com.airbyte.api.models.shared.SourceZendeskChatZendeskChat;
import com.airbyte.api.models.shared.SourceZendeskSunshine;
import com.airbyte.api.models.shared.SourceZendeskSunshineCredentialsAPIToken;
import com.airbyte.api.models.shared.SourceZendeskSunshineCredentialsAPITokenAuthMethod;
import com.airbyte.api.models.shared.SourceZendeskSunshineCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceZendeskSunshineCredentialsOAuth20AuthMethod;
import com.airbyte.api.models.shared.SourceZendeskSunshineZendeskSunshine;
import com.airbyte.api.models.shared.SourceZendeskSupport;
import com.airbyte.api.models.shared.SourceZendeskSupportZendeskSupport;
import com.airbyte.api.models.shared.SourceZendeskTalk;
import com.airbyte.api.models.shared.SourceZendeskTalkZendeskTalk;
import com.airbyte.api.models.shared.SourceZenloop;
import com.airbyte.api.models.shared.SourceZenloopZenloop;
import com.airbyte.api.models.shared.SourceZohoCRMZohoCRMEdition;
import com.airbyte.api.models.shared.SourceZohoCrm;
import com.airbyte.api.models.shared.SourceZohoCrmDataCenterLocation;
import com.airbyte.api.models.shared.SourceZohoCrmEnvironment;
import com.airbyte.api.models.shared.SourceZohoCrmZohoCrm;
import com.airbyte.api.models.shared.SourceZoom;
import com.airbyte.api.models.shared.SourceZoomZoom;
import com.airbyte.api.models.shared.SourceZuora;
import com.airbyte.api.models.shared.SourceZuoraDataQueryType;
import com.airbyte.api.models.shared.SourceZuoraTenantEndpointLocation;
import com.airbyte.api.models.shared.SourceZuoraZuora;
import java.time.LocalDate;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security("aliquam") {{
                    bearerAuth = "";
                }})
                .build();

            PatchSourceRequest req = new PatchSourceRequest("odio") {{
                sourcePatchRequest = new SourcePatchRequest() {{
                    configuration = new SourcePersistiq("commodi", SourcePersistiqPersistiq.PERSISTIQ);;
                    name = "My source";
                    secretId = "sapiente";
                    workspaceId = "2a70c688-282a-4a48-a562-f222e9817ee1";
                }};;
            }};            

            PatchSourceResponse res = sdk.sources.patchSource(req);

            if (res.sourceResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [com.airbyte.api.models.operations.PatchSourceRequest](../../models/operations/PatchSourceRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |


### Response

**[com.airbyte.api.models.operations.PatchSourceResponse](../../models/operations/PatchSourceResponse.md)**


## putSource

Update a Source and fully overwrite it

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.PutSourceRequest;
import com.airbyte.api.models.operations.PutSourceResponse;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.models.shared.SourceAircall;
import com.airbyte.api.models.shared.SourceAircallAircall;
import com.airbyte.api.models.shared.SourceAirtable;
import com.airbyte.api.models.shared.SourceAirtableAirtable;
import com.airbyte.api.models.shared.SourceAirtableCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceAirtableCredentialsOAuth20AuthMethod;
import com.airbyte.api.models.shared.SourceAirtableCredentialsPersonalAccessToken;
import com.airbyte.api.models.shared.SourceAirtableCredentialsPersonalAccessTokenAuthMethod;
import com.airbyte.api.models.shared.SourceAlloydb;
import com.airbyte.api.models.shared.SourceAlloydbAlloydb;
import com.airbyte.api.models.shared.SourceAlloydbReplicationMethodStandard;
import com.airbyte.api.models.shared.SourceAlloydbReplicationMethodStandardMethod;
import com.airbyte.api.models.shared.SourceAlloydbTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.SourceAlloydbTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.SourceAlloydbTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.SourceAlloydbTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceAlloydbTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourceAlloydbTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceAmazonAds;
import com.airbyte.api.models.shared.SourceAmazonAdsAmazonAds;
import com.airbyte.api.models.shared.SourceAmazonAdsAuthType;
import com.airbyte.api.models.shared.SourceAmazonAdsRegion;
import com.airbyte.api.models.shared.SourceAmazonAdsReportRecordTypes;
import com.airbyte.api.models.shared.SourceAmazonAdsStateFilter;
import com.airbyte.api.models.shared.SourceAmazonSqs;
import com.airbyte.api.models.shared.SourceAmazonSqsAWSRegion;
import com.airbyte.api.models.shared.SourceAmazonSqsAmazonSqs;
import com.airbyte.api.models.shared.SourceAmplitude;
import com.airbyte.api.models.shared.SourceAmplitudeAmplitude;
import com.airbyte.api.models.shared.SourceAmplitudeDataRegion;
import com.airbyte.api.models.shared.SourceApifyDataset;
import com.airbyte.api.models.shared.SourceApifyDatasetApifyDataset;
import com.airbyte.api.models.shared.SourceAsana;
import com.airbyte.api.models.shared.SourceAsanaAsana;
import com.airbyte.api.models.shared.SourceAsanaCredentialsAuthenticateViaAsanaOauth;
import com.airbyte.api.models.shared.SourceAsanaCredentialsAuthenticateViaAsanaOauthCredentialsTitle;
import com.airbyte.api.models.shared.SourceAsanaCredentialsAuthenticateWithPersonalAccessToken;
import com.airbyte.api.models.shared.SourceAsanaCredentialsAuthenticateWithPersonalAccessTokenCredentialsTitle;
import com.airbyte.api.models.shared.SourceAuth0;
import com.airbyte.api.models.shared.SourceAuth0Auth0;
import com.airbyte.api.models.shared.SourceAuth0CredentialsOAuth2AccessToken;
import com.airbyte.api.models.shared.SourceAuth0CredentialsOAuth2AccessTokenAuthenticationMethod;
import com.airbyte.api.models.shared.SourceAuth0CredentialsOAuth2ConfidentialApplication;
import com.airbyte.api.models.shared.SourceAuth0CredentialsOAuth2ConfidentialApplicationAuthenticationMethod;
import com.airbyte.api.models.shared.SourceAwsCloudtrail;
import com.airbyte.api.models.shared.SourceAwsCloudtrailAwsCloudtrail;
import com.airbyte.api.models.shared.SourceAzureBlobStorage;
import com.airbyte.api.models.shared.SourceAzureBlobStorageAzureBlobStorage;
import com.airbyte.api.models.shared.SourceAzureBlobStorageFormatJSONLinesNewlineDelimitedJSON;
import com.airbyte.api.models.shared.SourceAzureBlobStorageFormatJSONLinesNewlineDelimitedJSONFormatType;
import com.airbyte.api.models.shared.SourceAzureTable;
import com.airbyte.api.models.shared.SourceAzureTableAzureTable;
import com.airbyte.api.models.shared.SourceBambooHr;
import com.airbyte.api.models.shared.SourceBambooHrBambooHr;
import com.airbyte.api.models.shared.SourceBigcommerce;
import com.airbyte.api.models.shared.SourceBigcommerceBigcommerce;
import com.airbyte.api.models.shared.SourceBigquery;
import com.airbyte.api.models.shared.SourceBigqueryBigquery;
import com.airbyte.api.models.shared.SourceBingAds;
import com.airbyte.api.models.shared.SourceBingAdsAuthMethod;
import com.airbyte.api.models.shared.SourceBingAdsBingAds;
import com.airbyte.api.models.shared.SourceBraintree;
import com.airbyte.api.models.shared.SourceBraintreeBraintree;
import com.airbyte.api.models.shared.SourceBraintreeEnvironment;
import com.airbyte.api.models.shared.SourceBraze;
import com.airbyte.api.models.shared.SourceBrazeBraze;
import com.airbyte.api.models.shared.SourceChargebee;
import com.airbyte.api.models.shared.SourceChargebeeChargebee;
import com.airbyte.api.models.shared.SourceChargebeeProductCatalog;
import com.airbyte.api.models.shared.SourceChartmogul;
import com.airbyte.api.models.shared.SourceChartmogulChartmogul;
import com.airbyte.api.models.shared.SourceChartmogulInterval;
import com.airbyte.api.models.shared.SourceClickhouse;
import com.airbyte.api.models.shared.SourceClickhouseClickhouse;
import com.airbyte.api.models.shared.SourceClickhouseTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.SourceClickhouseTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.SourceClickhouseTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.SourceClickhouseTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceClickhouseTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourceClickhouseTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceClickupApi;
import com.airbyte.api.models.shared.SourceClickupApiClickupApi;
import com.airbyte.api.models.shared.SourceCloseCom;
import com.airbyte.api.models.shared.SourceCloseComCloseCom;
import com.airbyte.api.models.shared.SourceCoda;
import com.airbyte.api.models.shared.SourceCodaCoda;
import com.airbyte.api.models.shared.SourceCoinApi;
import com.airbyte.api.models.shared.SourceCoinApiCoinApi;
import com.airbyte.api.models.shared.SourceCoinApiEnvironment;
import com.airbyte.api.models.shared.SourceCoinmarketcap;
import com.airbyte.api.models.shared.SourceCoinmarketcapCoinmarketcap;
import com.airbyte.api.models.shared.SourceCoinmarketcapDataType;
import com.airbyte.api.models.shared.SourceConfigcat;
import com.airbyte.api.models.shared.SourceConfigcatConfigcat;
import com.airbyte.api.models.shared.SourceConfluence;
import com.airbyte.api.models.shared.SourceConfluenceConfluence;
import com.airbyte.api.models.shared.SourceDatascope;
import com.airbyte.api.models.shared.SourceDatascopeDatascope;
import com.airbyte.api.models.shared.SourceDelighted;
import com.airbyte.api.models.shared.SourceDelightedDelighted;
import com.airbyte.api.models.shared.SourceDixa;
import com.airbyte.api.models.shared.SourceDixaDixa;
import com.airbyte.api.models.shared.SourceDockerhub;
import com.airbyte.api.models.shared.SourceDockerhubDockerhub;
import com.airbyte.api.models.shared.SourceDremio;
import com.airbyte.api.models.shared.SourceDremioDremio;
import com.airbyte.api.models.shared.SourceDynamodb;
import com.airbyte.api.models.shared.SourceDynamodbDynamodb;
import com.airbyte.api.models.shared.SourceDynamodbDynamodbRegion;
import com.airbyte.api.models.shared.SourceE2eTestCloud;
import com.airbyte.api.models.shared.SourceE2eTestCloudE2eTestCloud;
import com.airbyte.api.models.shared.SourceE2eTestCloudMockCatalogMultiSchema;
import com.airbyte.api.models.shared.SourceE2eTestCloudMockCatalogMultiSchemaType;
import com.airbyte.api.models.shared.SourceE2eTestCloudMockCatalogSingleSchema;
import com.airbyte.api.models.shared.SourceE2eTestCloudMockCatalogSingleSchemaType;
import com.airbyte.api.models.shared.SourceE2eTestCloudType;
import com.airbyte.api.models.shared.SourceEmailoctopus;
import com.airbyte.api.models.shared.SourceEmailoctopusEmailoctopus;
import com.airbyte.api.models.shared.SourceExchangeRates;
import com.airbyte.api.models.shared.SourceExchangeRatesExchangeRates;
import com.airbyte.api.models.shared.SourceFacebookMarketing;
import com.airbyte.api.models.shared.SourceFacebookMarketingFacebookMarketing;
import com.airbyte.api.models.shared.SourceFacebookMarketingInsightConfig;
import com.airbyte.api.models.shared.SourceFacebookMarketingInsightConfigLevel;
import com.airbyte.api.models.shared.SourceFacebookMarketingInsightConfigValidActionBreakdowns;
import com.airbyte.api.models.shared.SourceFacebookMarketingInsightConfigValidBreakdowns;
import com.airbyte.api.models.shared.SourceFacebookMarketingInsightConfigValidEnums;
import com.airbyte.api.models.shared.SourceFacebookPages;
import com.airbyte.api.models.shared.SourceFacebookPagesFacebookPages;
import com.airbyte.api.models.shared.SourceFaker;
import com.airbyte.api.models.shared.SourceFakerFaker;
import com.airbyte.api.models.shared.SourceFauna;
import com.airbyte.api.models.shared.SourceFaunaCollection;
import com.airbyte.api.models.shared.SourceFaunaCollectionDeletionsDisabled;
import com.airbyte.api.models.shared.SourceFaunaCollectionDeletionsDisabledDeletionMode;
import com.airbyte.api.models.shared.SourceFaunaCollectionDeletionsEnabled;
import com.airbyte.api.models.shared.SourceFaunaCollectionDeletionsEnabledDeletionMode;
import com.airbyte.api.models.shared.SourceFaunaFauna;
import com.airbyte.api.models.shared.SourceFileSecure;
import com.airbyte.api.models.shared.SourceFileSecureFileFormat;
import com.airbyte.api.models.shared.SourceFileSecureFileSecure;
import com.airbyte.api.models.shared.SourceFileSecureProviderAzBlobAzureBlobStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderAzBlobAzureBlobStorageStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderGCSGoogleCloudStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderGCSGoogleCloudStorageStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderHTTPSPublicWeb;
import com.airbyte.api.models.shared.SourceFileSecureProviderHTTPSPublicWebStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderS3AmazonWebServices;
import com.airbyte.api.models.shared.SourceFileSecureProviderS3AmazonWebServicesStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderSCPSecureCopyProtocol;
import com.airbyte.api.models.shared.SourceFileSecureProviderSCPSecureCopyProtocolStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderSFTPSecureFileTransferProtocol;
import com.airbyte.api.models.shared.SourceFileSecureProviderSFTPSecureFileTransferProtocolStorage;
import com.airbyte.api.models.shared.SourceFileSecureProviderSSHSecureShell;
import com.airbyte.api.models.shared.SourceFileSecureProviderSSHSecureShellStorage;
import com.airbyte.api.models.shared.SourceFirebolt;
import com.airbyte.api.models.shared.SourceFireboltFirebolt;
import com.airbyte.api.models.shared.SourceFreshcaller;
import com.airbyte.api.models.shared.SourceFreshcallerFreshcaller;
import com.airbyte.api.models.shared.SourceFreshdesk;
import com.airbyte.api.models.shared.SourceFreshdeskFreshdesk;
import com.airbyte.api.models.shared.SourceFreshsales;
import com.airbyte.api.models.shared.SourceFreshsalesFreshsales;
import com.airbyte.api.models.shared.SourceFreshservice;
import com.airbyte.api.models.shared.SourceFreshserviceFreshservice;
import com.airbyte.api.models.shared.SourceGcs;
import com.airbyte.api.models.shared.SourceGcsGcs;
import com.airbyte.api.models.shared.SourceGetlago;
import com.airbyte.api.models.shared.SourceGetlagoGetlago;
import com.airbyte.api.models.shared.SourceGithub;
import com.airbyte.api.models.shared.SourceGithubCredentialsOAuth;
import com.airbyte.api.models.shared.SourceGithubCredentialsOAuthOptionTitle;
import com.airbyte.api.models.shared.SourceGithubCredentialsPersonalAccessToken;
import com.airbyte.api.models.shared.SourceGithubCredentialsPersonalAccessTokenOptionTitle;
import com.airbyte.api.models.shared.SourceGithubGithub;
import com.airbyte.api.models.shared.SourceGitlab;
import com.airbyte.api.models.shared.SourceGitlabCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceGitlabCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceGitlabCredentialsPrivateToken;
import com.airbyte.api.models.shared.SourceGitlabCredentialsPrivateTokenAuthType;
import com.airbyte.api.models.shared.SourceGitlabGitlab;
import com.airbyte.api.models.shared.SourceGlassfrog;
import com.airbyte.api.models.shared.SourceGlassfrogGlassfrog;
import com.airbyte.api.models.shared.SourceGnews;
import com.airbyte.api.models.shared.SourceGnewsCountry;
import com.airbyte.api.models.shared.SourceGnewsGnews;
import com.airbyte.api.models.shared.SourceGnewsIn;
import com.airbyte.api.models.shared.SourceGnewsLanguage;
import com.airbyte.api.models.shared.SourceGnewsNullable;
import com.airbyte.api.models.shared.SourceGnewsSortBy;
import com.airbyte.api.models.shared.SourceGnewsTopHeadlinesTopic;
import com.airbyte.api.models.shared.SourceGoogleAds;
import com.airbyte.api.models.shared.SourceGoogleAdsCustomQueries;
import com.airbyte.api.models.shared.SourceGoogleAdsGoogleAds;
import com.airbyte.api.models.shared.SourceGoogleAdsGoogleCredentials;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApi;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiCredentialsAuthenticateViaGoogleOauth;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiCredentialsAuthenticateViaGoogleOauthAuthType;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiCredentialsServiceAccountKeyAuthentication;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiCredentialsServiceAccountKeyAuthenticationAuthType;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiGoogleAnalyticsDataApi;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsV4;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauth;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauthAuthType;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsV4CredentialsServiceAccountKeyAuthentication;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsV4CredentialsServiceAccountKeyAuthenticationAuthType;
import com.airbyte.api.models.shared.SourceGoogleAnalyticsV4GoogleAnalyticsV4;
import com.airbyte.api.models.shared.SourceGoogleDirectory;
import com.airbyte.api.models.shared.SourceGoogleDirectoryGoogleDirectory;
import com.airbyte.api.models.shared.SourceGooglePagespeedInsights;
import com.airbyte.api.models.shared.SourceGooglePagespeedInsightsCategories;
import com.airbyte.api.models.shared.SourceGooglePagespeedInsightsGooglePagespeedInsights;
import com.airbyte.api.models.shared.SourceGooglePagespeedInsightsStrategies;
import com.airbyte.api.models.shared.SourceGoogleSearchConsole;
import com.airbyte.api.models.shared.SourceGoogleSearchConsoleAuthorizationOAuth;
import com.airbyte.api.models.shared.SourceGoogleSearchConsoleAuthorizationOAuthAuthType;
import com.airbyte.api.models.shared.SourceGoogleSearchConsoleAuthorizationServiceAccountKeyAuthentication;
import com.airbyte.api.models.shared.SourceGoogleSearchConsoleAuthorizationServiceAccountKeyAuthenticationAuthType;
import com.airbyte.api.models.shared.SourceGoogleSearchConsoleDataState;
import com.airbyte.api.models.shared.SourceGoogleSearchConsoleGoogleSearchConsole;
import com.airbyte.api.models.shared.SourceGoogleSheets;
import com.airbyte.api.models.shared.SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuth;
import com.airbyte.api.models.shared.SourceGoogleSheetsCredentialsAuthenticateViaGoogleOAuthAuthType;
import com.airbyte.api.models.shared.SourceGoogleSheetsCredentialsServiceAccountKeyAuthentication;
import com.airbyte.api.models.shared.SourceGoogleSheetsCredentialsServiceAccountKeyAuthenticationAuthType;
import com.airbyte.api.models.shared.SourceGoogleSheetsGoogleSheets;
import com.airbyte.api.models.shared.SourceGoogleWebfonts;
import com.airbyte.api.models.shared.SourceGoogleWebfontsGoogleWebfonts;
import com.airbyte.api.models.shared.SourceGoogleWorkspaceAdminReports;
import com.airbyte.api.models.shared.SourceGoogleWorkspaceAdminReportsGoogleWorkspaceAdminReports;
import com.airbyte.api.models.shared.SourceGreenhouse;
import com.airbyte.api.models.shared.SourceGreenhouseGreenhouse;
import com.airbyte.api.models.shared.SourceGridly;
import com.airbyte.api.models.shared.SourceGridlyGridly;
import com.airbyte.api.models.shared.SourceHarvest;
import com.airbyte.api.models.shared.SourceHarvestHarvest;
import com.airbyte.api.models.shared.SourceHubplanner;
import com.airbyte.api.models.shared.SourceHubplannerHubplanner;
import com.airbyte.api.models.shared.SourceHubspot;
import com.airbyte.api.models.shared.SourceHubspotCredentialsOAuth;
import com.airbyte.api.models.shared.SourceHubspotCredentialsOAuthAuthType;
import com.airbyte.api.models.shared.SourceHubspotCredentialsPrivateApp;
import com.airbyte.api.models.shared.SourceHubspotCredentialsPrivateAppAuthType;
import com.airbyte.api.models.shared.SourceHubspotHubspot;
import com.airbyte.api.models.shared.SourceInsightly;
import com.airbyte.api.models.shared.SourceInsightlyInsightly;
import com.airbyte.api.models.shared.SourceInstagram;
import com.airbyte.api.models.shared.SourceInstagramInstagram;
import com.airbyte.api.models.shared.SourceInstatus;
import com.airbyte.api.models.shared.SourceInstatusInstatus;
import com.airbyte.api.models.shared.SourceIntercom;
import com.airbyte.api.models.shared.SourceIntercomIntercom;
import com.airbyte.api.models.shared.SourceIp2whois;
import com.airbyte.api.models.shared.SourceIp2whoisIp2whois;
import com.airbyte.api.models.shared.SourceIterable;
import com.airbyte.api.models.shared.SourceIterableIterable;
import com.airbyte.api.models.shared.SourceJira;
import com.airbyte.api.models.shared.SourceJiraJira;
import com.airbyte.api.models.shared.SourceK6Cloud;
import com.airbyte.api.models.shared.SourceK6CloudK6Cloud;
import com.airbyte.api.models.shared.SourceKlarna;
import com.airbyte.api.models.shared.SourceKlarnaKlarna;
import com.airbyte.api.models.shared.SourceKlarnaRegion;
import com.airbyte.api.models.shared.SourceKlaviyo;
import com.airbyte.api.models.shared.SourceKlaviyoKlaviyo;
import com.airbyte.api.models.shared.SourceKustomerSinger;
import com.airbyte.api.models.shared.SourceKustomerSingerKustomerSinger;
import com.airbyte.api.models.shared.SourceLaunchdarkly;
import com.airbyte.api.models.shared.SourceLaunchdarklyLaunchdarkly;
import com.airbyte.api.models.shared.SourceLemlist;
import com.airbyte.api.models.shared.SourceLemlistLemlist;
import com.airbyte.api.models.shared.SourceLinkedinAds;
import com.airbyte.api.models.shared.SourceLinkedinAdsCredentialsAccessToken;
import com.airbyte.api.models.shared.SourceLinkedinAdsCredentialsAccessTokenAuthMethod;
import com.airbyte.api.models.shared.SourceLinkedinAdsCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceLinkedinAdsCredentialsOAuth20AuthMethod;
import com.airbyte.api.models.shared.SourceLinkedinAdsLinkedinAds;
import com.airbyte.api.models.shared.SourceLinkedinPages;
import com.airbyte.api.models.shared.SourceLinkedinPagesCredentialsAccessToken;
import com.airbyte.api.models.shared.SourceLinkedinPagesCredentialsAccessTokenAuthMethod;
import com.airbyte.api.models.shared.SourceLinkedinPagesCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceLinkedinPagesCredentialsOAuth20AuthMethod;
import com.airbyte.api.models.shared.SourceLinkedinPagesLinkedinPages;
import com.airbyte.api.models.shared.SourceLinnworks;
import com.airbyte.api.models.shared.SourceLinnworksLinnworks;
import com.airbyte.api.models.shared.SourceLokalise;
import com.airbyte.api.models.shared.SourceLokaliseLokalise;
import com.airbyte.api.models.shared.SourceMailchimp;
import com.airbyte.api.models.shared.SourceMailchimpCredentialsAPIKey;
import com.airbyte.api.models.shared.SourceMailchimpCredentialsAPIKeyAuthType;
import com.airbyte.api.models.shared.SourceMailchimpCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceMailchimpCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceMailchimpMailchimp;
import com.airbyte.api.models.shared.SourceMailgun;
import com.airbyte.api.models.shared.SourceMailgunMailgun;
import com.airbyte.api.models.shared.SourceMailjetSms;
import com.airbyte.api.models.shared.SourceMailjetSmsMailjetSms;
import com.airbyte.api.models.shared.SourceMarketo;
import com.airbyte.api.models.shared.SourceMarketoMarketo;
import com.airbyte.api.models.shared.SourceMetabase;
import com.airbyte.api.models.shared.SourceMetabaseMetabase;
import com.airbyte.api.models.shared.SourceMicrosoftTeams;
import com.airbyte.api.models.shared.SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoft;
import com.airbyte.api.models.shared.SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftAuthType;
import com.airbyte.api.models.shared.SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftOAuth20;
import com.airbyte.api.models.shared.SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftOAuth20AuthType;
import com.airbyte.api.models.shared.SourceMicrosoftTeamsMicrosoftTeams;
import com.airbyte.api.models.shared.SourceMixpanel;
import com.airbyte.api.models.shared.SourceMixpanelCredentialsProjectSecret;
import com.airbyte.api.models.shared.SourceMixpanelCredentialsProjectSecretOptionTitle;
import com.airbyte.api.models.shared.SourceMixpanelCredentialsServiceAccount;
import com.airbyte.api.models.shared.SourceMixpanelCredentialsServiceAccountOptionTitle;
import com.airbyte.api.models.shared.SourceMixpanelMixpanel;
import com.airbyte.api.models.shared.SourceMixpanelRegion;
import com.airbyte.api.models.shared.SourceMonday;
import com.airbyte.api.models.shared.SourceMondayCredentialsAPIToken;
import com.airbyte.api.models.shared.SourceMondayCredentialsAPITokenAuthType;
import com.airbyte.api.models.shared.SourceMondayCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceMondayCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceMondayMonday;
import com.airbyte.api.models.shared.SourceMongodb;
import com.airbyte.api.models.shared.SourceMongodbInstanceTypeMongoDBAtlas;
import com.airbyte.api.models.shared.SourceMongodbInstanceTypeMongoDBAtlasInstance;
import com.airbyte.api.models.shared.SourceMongodbInstanceTypeReplicaSet;
import com.airbyte.api.models.shared.SourceMongodbInstanceTypeReplicaSetInstance;
import com.airbyte.api.models.shared.SourceMongodbInstanceTypeStandaloneMongoDbInstance;
import com.airbyte.api.models.shared.SourceMongodbInstanceTypeStandaloneMongoDbInstanceInstance;
import com.airbyte.api.models.shared.SourceMongodbMongodb;
import com.airbyte.api.models.shared.SourceMssql;
import com.airbyte.api.models.shared.SourceMssqlMssql;
import com.airbyte.api.models.shared.SourceMssqlReplicationMethodLogicalReplicationCDC;
import com.airbyte.api.models.shared.SourceMssqlReplicationMethodLogicalReplicationCDCDataToSync;
import com.airbyte.api.models.shared.SourceMssqlReplicationMethodLogicalReplicationCDCInitialSnapshotIsolationLevel;
import com.airbyte.api.models.shared.SourceMssqlReplicationMethodLogicalReplicationCDCMethod;
import com.airbyte.api.models.shared.SourceMssqlReplicationMethodStandard;
import com.airbyte.api.models.shared.SourceMssqlReplicationMethodStandardMethod;
import com.airbyte.api.models.shared.SourceMssqlSslMethodEncryptedTrustServerCertificate;
import com.airbyte.api.models.shared.SourceMssqlSslMethodEncryptedTrustServerCertificateSslMethod;
import com.airbyte.api.models.shared.SourceMssqlSslMethodEncryptedVerifyCertificate;
import com.airbyte.api.models.shared.SourceMssqlSslMethodEncryptedVerifyCertificateSslMethod;
import com.airbyte.api.models.shared.SourceMssqlTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.SourceMssqlTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.SourceMssqlTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.SourceMssqlTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceMssqlTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourceMssqlTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceMyHours;
import com.airbyte.api.models.shared.SourceMyHoursMyHours;
import com.airbyte.api.models.shared.SourceMysql;
import com.airbyte.api.models.shared.SourceMysqlMysql;
import com.airbyte.api.models.shared.SourceMysqlReplicationMethodLogicalReplicationCDC;
import com.airbyte.api.models.shared.SourceMysqlReplicationMethodLogicalReplicationCDCMethod;
import com.airbyte.api.models.shared.SourceMysqlReplicationMethodStandard;
import com.airbyte.api.models.shared.SourceMysqlReplicationMethodStandardMethod;
import com.airbyte.api.models.shared.SourceMysqlSslModePreferred;
import com.airbyte.api.models.shared.SourceMysqlSslModePreferredMode;
import com.airbyte.api.models.shared.SourceMysqlSslModeRequired;
import com.airbyte.api.models.shared.SourceMysqlSslModeRequiredMode;
import com.airbyte.api.models.shared.SourceMysqlSslModeVerifyCA;
import com.airbyte.api.models.shared.SourceMysqlSslModeVerifyCAMode;
import com.airbyte.api.models.shared.SourceMysqlSslModeVerifyIdentity;
import com.airbyte.api.models.shared.SourceMysqlSslModeVerifyIdentityMode;
import com.airbyte.api.models.shared.SourceMysqlTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.SourceMysqlTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.SourceMysqlTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.SourceMysqlTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceMysqlTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourceMysqlTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceNetsuite;
import com.airbyte.api.models.shared.SourceNetsuiteNetsuite;
import com.airbyte.api.models.shared.SourceNotion;
import com.airbyte.api.models.shared.SourceNotionCredentialsAccessToken;
import com.airbyte.api.models.shared.SourceNotionCredentialsAccessTokenAuthType;
import com.airbyte.api.models.shared.SourceNotionCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceNotionCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceNotionNotion;
import com.airbyte.api.models.shared.SourceNytimes;
import com.airbyte.api.models.shared.SourceNytimesNytimes;
import com.airbyte.api.models.shared.SourceNytimesPeriodUsedForMostPopularStreams;
import com.airbyte.api.models.shared.SourceNytimesShareTypeUsedForMostPopularSharedStream;
import com.airbyte.api.models.shared.SourceOkta;
import com.airbyte.api.models.shared.SourceOktaCredentialsAPIToken;
import com.airbyte.api.models.shared.SourceOktaCredentialsAPITokenAuthType;
import com.airbyte.api.models.shared.SourceOktaCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceOktaCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceOktaOkta;
import com.airbyte.api.models.shared.SourceOmnisend;
import com.airbyte.api.models.shared.SourceOmnisendOmnisend;
import com.airbyte.api.models.shared.SourceOnesignal;
import com.airbyte.api.models.shared.SourceOnesignalApplications;
import com.airbyte.api.models.shared.SourceOnesignalOnesignal;
import com.airbyte.api.models.shared.SourceOpenweather;
import com.airbyte.api.models.shared.SourceOpenweatherLanguage;
import com.airbyte.api.models.shared.SourceOpenweatherOpenweather;
import com.airbyte.api.models.shared.SourceOpenweatherUnits;
import com.airbyte.api.models.shared.SourceOracle;
import com.airbyte.api.models.shared.SourceOracleConnectionDataServiceName;
import com.airbyte.api.models.shared.SourceOracleConnectionDataServiceNameConnectionType;
import com.airbyte.api.models.shared.SourceOracleConnectionDataSystemIDSID;
import com.airbyte.api.models.shared.SourceOracleConnectionDataSystemIDSIDConnectionType;
import com.airbyte.api.models.shared.SourceOracleEncryptionNativeNetworkEncryptionNNE;
import com.airbyte.api.models.shared.SourceOracleEncryptionNativeNetworkEncryptionNNEEncryptionAlgorithm;
import com.airbyte.api.models.shared.SourceOracleEncryptionNativeNetworkEncryptionNNEEncryptionMethod;
import com.airbyte.api.models.shared.SourceOracleEncryptionTLSEncryptedVerifyCertificate;
import com.airbyte.api.models.shared.SourceOracleEncryptionTLSEncryptedVerifyCertificateEncryptionMethod;
import com.airbyte.api.models.shared.SourceOracleOracle;
import com.airbyte.api.models.shared.SourceOracleTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.SourceOracleTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.SourceOracleTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.SourceOracleTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceOracleTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourceOracleTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourceOrb;
import com.airbyte.api.models.shared.SourceOrbOrb;
import com.airbyte.api.models.shared.SourceOrbit;
import com.airbyte.api.models.shared.SourceOrbitOrbit;
import com.airbyte.api.models.shared.SourceOutreach;
import com.airbyte.api.models.shared.SourceOutreachOutreach;
import com.airbyte.api.models.shared.SourcePaypalTransaction;
import com.airbyte.api.models.shared.SourcePaypalTransactionPaypalTransaction;
import com.airbyte.api.models.shared.SourcePaystack;
import com.airbyte.api.models.shared.SourcePaystackPaystack;
import com.airbyte.api.models.shared.SourcePendo;
import com.airbyte.api.models.shared.SourcePendoPendo;
import com.airbyte.api.models.shared.SourcePersistiq;
import com.airbyte.api.models.shared.SourcePersistiqPersistiq;
import com.airbyte.api.models.shared.SourcePexelsApi;
import com.airbyte.api.models.shared.SourcePexelsApiPexelsApi;
import com.airbyte.api.models.shared.SourcePinterest;
import com.airbyte.api.models.shared.SourcePinterestCredentialsAccessToken;
import com.airbyte.api.models.shared.SourcePinterestCredentialsAccessTokenAuthMethod;
import com.airbyte.api.models.shared.SourcePinterestCredentialsOAuth20;
import com.airbyte.api.models.shared.SourcePinterestCredentialsOAuth20AuthMethod;
import com.airbyte.api.models.shared.SourcePinterestPinterest;
import com.airbyte.api.models.shared.SourcePinterestStatus;
import com.airbyte.api.models.shared.SourcePipedrive;
import com.airbyte.api.models.shared.SourcePipedriveAPIKeyAuthentication;
import com.airbyte.api.models.shared.SourcePipedriveAPIKeyAuthenticationAuthType;
import com.airbyte.api.models.shared.SourcePipedrivePipedrive;
import com.airbyte.api.models.shared.SourcePocket;
import com.airbyte.api.models.shared.SourcePocketContentType;
import com.airbyte.api.models.shared.SourcePocketDetailType;
import com.airbyte.api.models.shared.SourcePocketPocket;
import com.airbyte.api.models.shared.SourcePocketSortBy;
import com.airbyte.api.models.shared.SourcePocketState;
import com.airbyte.api.models.shared.SourcePokeapi;
import com.airbyte.api.models.shared.SourcePokeapiPokeapi;
import com.airbyte.api.models.shared.SourcePolygonStockApi;
import com.airbyte.api.models.shared.SourcePolygonStockApiPolygonStockApi;
import com.airbyte.api.models.shared.SourcePostgres;
import com.airbyte.api.models.shared.SourcePostgresPostgres;
import com.airbyte.api.models.shared.SourcePostgresReplicationMethodStandard;
import com.airbyte.api.models.shared.SourcePostgresReplicationMethodStandardMethod;
import com.airbyte.api.models.shared.SourcePostgresTunnelMethodNoTunnel;
import com.airbyte.api.models.shared.SourcePostgresTunnelMethodNoTunnelTunnelMethod;
import com.airbyte.api.models.shared.SourcePostgresTunnelMethodPasswordAuthentication;
import com.airbyte.api.models.shared.SourcePostgresTunnelMethodPasswordAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourcePostgresTunnelMethodSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourcePostgresTunnelMethodSSHKeyAuthenticationTunnelMethod;
import com.airbyte.api.models.shared.SourcePosthog;
import com.airbyte.api.models.shared.SourcePosthogPosthog;
import com.airbyte.api.models.shared.SourcePostmarkapp;
import com.airbyte.api.models.shared.SourcePostmarkappPostmarkapp;
import com.airbyte.api.models.shared.SourcePrestashop;
import com.airbyte.api.models.shared.SourcePrestashopPrestashop;
import com.airbyte.api.models.shared.SourcePublicApis;
import com.airbyte.api.models.shared.SourcePublicApisPublicApis;
import com.airbyte.api.models.shared.SourcePunkApi;
import com.airbyte.api.models.shared.SourcePunkApiPunkApi;
import com.airbyte.api.models.shared.SourcePutRequest;
import com.airbyte.api.models.shared.SourcePypi;
import com.airbyte.api.models.shared.SourcePypiPypi;
import com.airbyte.api.models.shared.SourceQualaroo;
import com.airbyte.api.models.shared.SourceQualarooQualaroo;
import com.airbyte.api.models.shared.SourceQuickbooks;
import com.airbyte.api.models.shared.SourceQuickbooksCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceQuickbooksCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceQuickbooksQuickbooks;
import com.airbyte.api.models.shared.SourceRailz;
import com.airbyte.api.models.shared.SourceRailzRailz;
import com.airbyte.api.models.shared.SourceRecharge;
import com.airbyte.api.models.shared.SourceRechargeRecharge;
import com.airbyte.api.models.shared.SourceRecreation;
import com.airbyte.api.models.shared.SourceRecreationRecreation;
import com.airbyte.api.models.shared.SourceRecruitee;
import com.airbyte.api.models.shared.SourceRecruiteeRecruitee;
import com.airbyte.api.models.shared.SourceRecurly;
import com.airbyte.api.models.shared.SourceRecurlyRecurly;
import com.airbyte.api.models.shared.SourceRedshift;
import com.airbyte.api.models.shared.SourceRedshiftRedshift;
import com.airbyte.api.models.shared.SourceRetently;
import com.airbyte.api.models.shared.SourceRetentlyRetently;
import com.airbyte.api.models.shared.SourceRkiCovid;
import com.airbyte.api.models.shared.SourceRkiCovidRkiCovid;
import com.airbyte.api.models.shared.SourceRss;
import com.airbyte.api.models.shared.SourceRssRss;
import com.airbyte.api.models.shared.SourceS3;
import com.airbyte.api.models.shared.SourceS3FormatAvro;
import com.airbyte.api.models.shared.SourceS3FormatAvroFiletype;
import com.airbyte.api.models.shared.SourceS3FormatCSV;
import com.airbyte.api.models.shared.SourceS3FormatCSVFiletype;
import com.airbyte.api.models.shared.SourceS3FormatJsonl;
import com.airbyte.api.models.shared.SourceS3FormatJsonlFiletype;
import com.airbyte.api.models.shared.SourceS3FormatJsonlUnexpectedFieldBehavior;
import com.airbyte.api.models.shared.SourceS3FormatParquet;
import com.airbyte.api.models.shared.SourceS3FormatParquetFiletype;
import com.airbyte.api.models.shared.SourceS3S3;
import com.airbyte.api.models.shared.SourceS3S3AmazonWebServices;
import com.airbyte.api.models.shared.SourceSalesforce;
import com.airbyte.api.models.shared.SourceSalesforceAuthType;
import com.airbyte.api.models.shared.SourceSalesforceSalesforce;
import com.airbyte.api.models.shared.SourceSalesforceSinger;
import com.airbyte.api.models.shared.SourceSalesforceSingerApiType;
import com.airbyte.api.models.shared.SourceSalesforceSingerSalesforceSinger;
import com.airbyte.api.models.shared.SourceSalesforceStreamsCriteria;
import com.airbyte.api.models.shared.SourceSalesforceStreamsCriteriaSearchCriteria;
import com.airbyte.api.models.shared.SourceSalesloft;
import com.airbyte.api.models.shared.SourceSalesloftCredentialsAuthenticateViaAPIKey;
import com.airbyte.api.models.shared.SourceSalesloftCredentialsAuthenticateViaAPIKeyAuthType;
import com.airbyte.api.models.shared.SourceSalesloftCredentialsAuthenticateViaOAuth;
import com.airbyte.api.models.shared.SourceSalesloftCredentialsAuthenticateViaOAuthAuthType;
import com.airbyte.api.models.shared.SourceSalesloftSalesloft;
import com.airbyte.api.models.shared.SourceSapFieldglass;
import com.airbyte.api.models.shared.SourceSapFieldglassSapFieldglass;
import com.airbyte.api.models.shared.SourceSecoda;
import com.airbyte.api.models.shared.SourceSecodaSecoda;
import com.airbyte.api.models.shared.SourceSendgrid;
import com.airbyte.api.models.shared.SourceSendgridSendgrid;
import com.airbyte.api.models.shared.SourceSendinblue;
import com.airbyte.api.models.shared.SourceSendinblueSendinblue;
import com.airbyte.api.models.shared.SourceSenseforce;
import com.airbyte.api.models.shared.SourceSenseforceSenseforce;
import com.airbyte.api.models.shared.SourceSentry;
import com.airbyte.api.models.shared.SourceSentrySentry;
import com.airbyte.api.models.shared.SourceSftp;
import com.airbyte.api.models.shared.SourceSftpBulk;
import com.airbyte.api.models.shared.SourceSftpBulkFileType;
import com.airbyte.api.models.shared.SourceSftpBulkSftpBulk;
import com.airbyte.api.models.shared.SourceSftpCredentialsPasswordAuthentication;
import com.airbyte.api.models.shared.SourceSftpCredentialsPasswordAuthenticationAuthMethod;
import com.airbyte.api.models.shared.SourceSftpCredentialsSSHKeyAuthentication;
import com.airbyte.api.models.shared.SourceSftpCredentialsSSHKeyAuthenticationAuthMethod;
import com.airbyte.api.models.shared.SourceSftpSftp;
import com.airbyte.api.models.shared.SourceShopify;
import com.airbyte.api.models.shared.SourceShopifyCredentialsAPIPassword;
import com.airbyte.api.models.shared.SourceShopifyCredentialsAPIPasswordAuthMethod;
import com.airbyte.api.models.shared.SourceShopifyCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceShopifyCredentialsOAuth20AuthMethod;
import com.airbyte.api.models.shared.SourceShopifyShopify;
import com.airbyte.api.models.shared.SourceShortio;
import com.airbyte.api.models.shared.SourceShortioShortio;
import com.airbyte.api.models.shared.SourceSlack;
import com.airbyte.api.models.shared.SourceSlackCredentialsAPIToken;
import com.airbyte.api.models.shared.SourceSlackCredentialsAPITokenOptionTitle;
import com.airbyte.api.models.shared.SourceSlackCredentialsSignInViaSlackOAuth;
import com.airbyte.api.models.shared.SourceSlackCredentialsSignInViaSlackOAuthOptionTitle;
import com.airbyte.api.models.shared.SourceSlackSlack;
import com.airbyte.api.models.shared.SourceSmaily;
import com.airbyte.api.models.shared.SourceSmailySmaily;
import com.airbyte.api.models.shared.SourceSmartengage;
import com.airbyte.api.models.shared.SourceSmartengageSmartengage;
import com.airbyte.api.models.shared.SourceSmartsheets;
import com.airbyte.api.models.shared.SourceSmartsheetsCredentialsAPIAccessToken;
import com.airbyte.api.models.shared.SourceSmartsheetsCredentialsAPIAccessTokenAuthType;
import com.airbyte.api.models.shared.SourceSmartsheetsCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceSmartsheetsCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceSmartsheetsSmartsheets;
import com.airbyte.api.models.shared.SourceSnapchatMarketing;
import com.airbyte.api.models.shared.SourceSnapchatMarketingSnapchatMarketing;
import com.airbyte.api.models.shared.SourceSnowflake;
import com.airbyte.api.models.shared.SourceSnowflakeCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceSnowflakeCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceSnowflakeCredentialsUsernameAndPassword;
import com.airbyte.api.models.shared.SourceSnowflakeCredentialsUsernameAndPasswordAuthType;
import com.airbyte.api.models.shared.SourceSnowflakeSnowflake;
import com.airbyte.api.models.shared.SourceSonarCloud;
import com.airbyte.api.models.shared.SourceSonarCloudSonarCloud;
import com.airbyte.api.models.shared.SourceSpacexApi;
import com.airbyte.api.models.shared.SourceSpacexApiSpacexApi;
import com.airbyte.api.models.shared.SourceSquare;
import com.airbyte.api.models.shared.SourceSquareCredentialsAPIKey;
import com.airbyte.api.models.shared.SourceSquareCredentialsAPIKeyAuthType;
import com.airbyte.api.models.shared.SourceSquareCredentialsOauthAuthentication;
import com.airbyte.api.models.shared.SourceSquareCredentialsOauthAuthenticationAuthType;
import com.airbyte.api.models.shared.SourceSquareSquare;
import com.airbyte.api.models.shared.SourceStrava;
import com.airbyte.api.models.shared.SourceStravaAuthType;
import com.airbyte.api.models.shared.SourceStravaStrava;
import com.airbyte.api.models.shared.SourceStripe;
import com.airbyte.api.models.shared.SourceStripeStripe;
import com.airbyte.api.models.shared.SourceSurveySparrow;
import com.airbyte.api.models.shared.SourceSurveySparrowRegionEUBasedAccount;
import com.airbyte.api.models.shared.SourceSurveySparrowRegionEUBasedAccountUrlBase;
import com.airbyte.api.models.shared.SourceSurveySparrowRegionGlobalAccount;
import com.airbyte.api.models.shared.SourceSurveySparrowRegionGlobalAccountUrlBase;
import com.airbyte.api.models.shared.SourceSurveySparrowSurveySparrow;
import com.airbyte.api.models.shared.SourceSurveymonkey;
import com.airbyte.api.models.shared.SourceSurveymonkeyOriginDatacenterOfTheSurveyMonkeyAccount;
import com.airbyte.api.models.shared.SourceSurveymonkeySurveyMonkeyAuthorizationMethod;
import com.airbyte.api.models.shared.SourceSurveymonkeySurveyMonkeyAuthorizationMethodAuthMethod;
import com.airbyte.api.models.shared.SourceSurveymonkeySurveymonkey;
import com.airbyte.api.models.shared.SourceTempo;
import com.airbyte.api.models.shared.SourceTempoTempo;
import com.airbyte.api.models.shared.SourceTheGuardianApi;
import com.airbyte.api.models.shared.SourceTheGuardianApiTheGuardianApi;
import com.airbyte.api.models.shared.SourceTiktokMarketing;
import com.airbyte.api.models.shared.SourceTiktokMarketingCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceTiktokMarketingCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceTiktokMarketingCredentialsSandboxAccessToken;
import com.airbyte.api.models.shared.SourceTiktokMarketingCredentialsSandboxAccessTokenAuthType;
import com.airbyte.api.models.shared.SourceTiktokMarketingTiktokMarketing;
import com.airbyte.api.models.shared.SourceTodoist;
import com.airbyte.api.models.shared.SourceTodoistTodoist;
import com.airbyte.api.models.shared.SourceTrello;
import com.airbyte.api.models.shared.SourceTrelloTrello;
import com.airbyte.api.models.shared.SourceTrustpilot;
import com.airbyte.api.models.shared.SourceTrustpilotCredentialsAPIKey;
import com.airbyte.api.models.shared.SourceTrustpilotCredentialsAPIKeyAuthType;
import com.airbyte.api.models.shared.SourceTrustpilotCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceTrustpilotCredentialsOAuth20AuthType;
import com.airbyte.api.models.shared.SourceTrustpilotTrustpilot;
import com.airbyte.api.models.shared.SourceTvmazeSchedule;
import com.airbyte.api.models.shared.SourceTvmazeScheduleTvmazeSchedule;
import com.airbyte.api.models.shared.SourceTwilio;
import com.airbyte.api.models.shared.SourceTwilioTaskrouter;
import com.airbyte.api.models.shared.SourceTwilioTaskrouterTwilioTaskrouter;
import com.airbyte.api.models.shared.SourceTwilioTwilio;
import com.airbyte.api.models.shared.SourceTwitter;
import com.airbyte.api.models.shared.SourceTwitterTwitter;
import com.airbyte.api.models.shared.SourceTypeform;
import com.airbyte.api.models.shared.SourceTypeformTypeform;
import com.airbyte.api.models.shared.SourceUsCensus;
import com.airbyte.api.models.shared.SourceUsCensusUsCensus;
import com.airbyte.api.models.shared.SourceVantage;
import com.airbyte.api.models.shared.SourceVantageVantage;
import com.airbyte.api.models.shared.SourceWebflow;
import com.airbyte.api.models.shared.SourceWebflowWebflow;
import com.airbyte.api.models.shared.SourceWhiskyHunter;
import com.airbyte.api.models.shared.SourceWhiskyHunterWhiskyHunter;
import com.airbyte.api.models.shared.SourceWikipediaPageviews;
import com.airbyte.api.models.shared.SourceWikipediaPageviewsWikipediaPageviews;
import com.airbyte.api.models.shared.SourceWoocommerce;
import com.airbyte.api.models.shared.SourceWoocommerceWoocommerce;
import com.airbyte.api.models.shared.SourceXero;
import com.airbyte.api.models.shared.SourceXeroAuthenticateViaXeroOAuth;
import com.airbyte.api.models.shared.SourceXeroXero;
import com.airbyte.api.models.shared.SourceXkcd;
import com.airbyte.api.models.shared.SourceXkcdXkcd;
import com.airbyte.api.models.shared.SourceYandexMetrica;
import com.airbyte.api.models.shared.SourceYandexMetricaYandexMetrica;
import com.airbyte.api.models.shared.SourceYotpo;
import com.airbyte.api.models.shared.SourceYotpoYotpo;
import com.airbyte.api.models.shared.SourceYounium;
import com.airbyte.api.models.shared.SourceYouniumYounium;
import com.airbyte.api.models.shared.SourceYoutubeAnalytics;
import com.airbyte.api.models.shared.SourceYoutubeAnalyticsYoutubeAnalytics;
import com.airbyte.api.models.shared.SourceZendeskChat;
import com.airbyte.api.models.shared.SourceZendeskChatCredentialsAccessToken;
import com.airbyte.api.models.shared.SourceZendeskChatCredentialsAccessTokenCredentials;
import com.airbyte.api.models.shared.SourceZendeskChatCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceZendeskChatCredentialsOAuth20Credentials;
import com.airbyte.api.models.shared.SourceZendeskChatZendeskChat;
import com.airbyte.api.models.shared.SourceZendeskSunshine;
import com.airbyte.api.models.shared.SourceZendeskSunshineCredentialsAPIToken;
import com.airbyte.api.models.shared.SourceZendeskSunshineCredentialsAPITokenAuthMethod;
import com.airbyte.api.models.shared.SourceZendeskSunshineCredentialsOAuth20;
import com.airbyte.api.models.shared.SourceZendeskSunshineCredentialsOAuth20AuthMethod;
import com.airbyte.api.models.shared.SourceZendeskSunshineZendeskSunshine;
import com.airbyte.api.models.shared.SourceZendeskSupport;
import com.airbyte.api.models.shared.SourceZendeskSupportZendeskSupport;
import com.airbyte.api.models.shared.SourceZendeskTalk;
import com.airbyte.api.models.shared.SourceZendeskTalkZendeskTalk;
import com.airbyte.api.models.shared.SourceZenloop;
import com.airbyte.api.models.shared.SourceZenloopZenloop;
import com.airbyte.api.models.shared.SourceZohoCRMZohoCRMEdition;
import com.airbyte.api.models.shared.SourceZohoCrm;
import com.airbyte.api.models.shared.SourceZohoCrmDataCenterLocation;
import com.airbyte.api.models.shared.SourceZohoCrmEnvironment;
import com.airbyte.api.models.shared.SourceZohoCrmZohoCrm;
import com.airbyte.api.models.shared.SourceZoom;
import com.airbyte.api.models.shared.SourceZoomZoom;
import com.airbyte.api.models.shared.SourceZuora;
import com.airbyte.api.models.shared.SourceZuoraDataQueryType;
import com.airbyte.api.models.shared.SourceZuoraTenantEndpointLocation;
import com.airbyte.api.models.shared.SourceZuoraZuora;
import java.time.LocalDate;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security("esse") {{
                    bearerAuth = "";
                }})
                .build();

            PutSourceRequest req = new PutSourceRequest("quod") {{
                sourcePutRequest = new SourcePutRequest(                new SourceSapFieldglass("aliquid", SourceSapFieldglassSapFieldglass.SAP_FIELDGLASS) {{
                                    apiKey = "vero";
                                    sourceType = SourceSapFieldglassSapFieldglass.SAP_FIELDGLASS;
                                }}, "quasi");;
            }};            

            PutSourceResponse res = sdk.sources.putSource(req);

            if (res.sourceResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [com.airbyte.api.models.operations.PutSourceRequest](../../models/operations/PutSourceRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[com.airbyte.api.models.operations.PutSourceResponse](../../models/operations/PutSourceResponse.md)**


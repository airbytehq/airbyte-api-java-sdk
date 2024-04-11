# Workspaces
(*workspaces()*)

### Available Operations

* [createOrUpdateWorkspaceOAuthCredentials](#createorupdateworkspaceoauthcredentials) - Create OAuth override credentials for a workspace and source type.
* [createWorkspace](#createworkspace) - Create a workspace
* [deleteWorkspace](#deleteworkspace) - Delete a Workspace
* [getWorkspace](#getworkspace) - Get Workspace details
* [listWorkspaces](#listworkspaces) - List workspaces
* [updateWorkspace](#updateworkspace) - Update a workspace

## createOrUpdateWorkspaceOAuthCredentials

Create/update a set of OAuth credentials to override the Airbyte-provided OAuth credentials used for source/destination OAuth.
In order to determine what the credential configuration needs to be, please see the connector specification of the relevant  source/destination.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsRequest;
import com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsResponse;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.ActorTypeEnum;
import com.airbyte.api.models.shared.Airtable;
import com.airbyte.api.models.shared.AmazonAds;
import com.airbyte.api.models.shared.AmazonSellerPartner;
import com.airbyte.api.models.shared.Asana;
import com.airbyte.api.models.shared.AsanaCredentials;
import com.airbyte.api.models.shared.Authorization;
import com.airbyte.api.models.shared.BingAds;
import com.airbyte.api.models.shared.Credentials;
import com.airbyte.api.models.shared.FacebookMarketing;
import com.airbyte.api.models.shared.Github;
import com.airbyte.api.models.shared.GithubCredentials;
import com.airbyte.api.models.shared.Gitlab;
import com.airbyte.api.models.shared.GitlabCredentials;
import com.airbyte.api.models.shared.GoogleAds;
import com.airbyte.api.models.shared.GoogleAdsCredentials;
import com.airbyte.api.models.shared.GoogleAnalyticsDataApi;
import com.airbyte.api.models.shared.GoogleAnalyticsDataApiCredentials;
import com.airbyte.api.models.shared.GoogleDrive;
import com.airbyte.api.models.shared.GoogleDriveCredentials;
import com.airbyte.api.models.shared.GoogleSearchConsole;
import com.airbyte.api.models.shared.GoogleSheets;
import com.airbyte.api.models.shared.GoogleSheetsCredentials;
import com.airbyte.api.models.shared.Harvest;
import com.airbyte.api.models.shared.HarvestCredentials;
import com.airbyte.api.models.shared.Hubspot;
import com.airbyte.api.models.shared.HubspotCredentials;
import com.airbyte.api.models.shared.Instagram;
import com.airbyte.api.models.shared.Intercom;
import com.airbyte.api.models.shared.LeverHiring;
import com.airbyte.api.models.shared.LeverHiringCredentials;
import com.airbyte.api.models.shared.LinkedinAds;
import com.airbyte.api.models.shared.LinkedinAdsCredentials;
import com.airbyte.api.models.shared.Mailchimp;
import com.airbyte.api.models.shared.MailchimpCredentials;
import com.airbyte.api.models.shared.MicrosoftOnedrive;
import com.airbyte.api.models.shared.MicrosoftOnedriveCredentials;
import com.airbyte.api.models.shared.MicrosoftSharepoint;
import com.airbyte.api.models.shared.MicrosoftSharepointCredentials;
import com.airbyte.api.models.shared.MicrosoftTeams;
import com.airbyte.api.models.shared.MicrosoftTeamsCredentials;
import com.airbyte.api.models.shared.Monday;
import com.airbyte.api.models.shared.MondayCredentials;
import com.airbyte.api.models.shared.Notion;
import com.airbyte.api.models.shared.NotionCredentials;
import com.airbyte.api.models.shared.OAuthActorNames;
import com.airbyte.api.models.shared.Pinterest;
import com.airbyte.api.models.shared.PinterestCredentials;
import com.airbyte.api.models.shared.Retently;
import com.airbyte.api.models.shared.RetentlyCredentials;
import com.airbyte.api.models.shared.Salesforce;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.models.shared.Shopify;
import com.airbyte.api.models.shared.ShopifyCredentials;
import com.airbyte.api.models.shared.Slack;
import com.airbyte.api.models.shared.SlackCredentials;
import com.airbyte.api.models.shared.Smartsheets;
import com.airbyte.api.models.shared.SmartsheetsCredentials;
import com.airbyte.api.models.shared.SnapchatMarketing;
import com.airbyte.api.models.shared.Snowflake;
import com.airbyte.api.models.shared.SnowflakeCredentials;
import com.airbyte.api.models.shared.Square;
import com.airbyte.api.models.shared.SquareCredentials;
import com.airbyte.api.models.shared.Strava;
import com.airbyte.api.models.shared.Surveymonkey;
import com.airbyte.api.models.shared.SurveymonkeyCredentials;
import com.airbyte.api.models.shared.TiktokMarketing;
import com.airbyte.api.models.shared.TiktokMarketingCredentials;
import com.airbyte.api.models.shared.Typeform;
import com.airbyte.api.models.shared.TypeformCredentials;
import com.airbyte.api.models.shared.WorkspaceOAuthCredentialsRequest;
import com.airbyte.api.models.shared.YoutubeAnalytics;
import com.airbyte.api.models.shared.YoutubeAnalyticsCredentials;
import com.airbyte.api.models.shared.ZendeskChat;
import com.airbyte.api.models.shared.ZendeskChatCredentials;
import com.airbyte.api.models.shared.ZendeskSunshine;
import com.airbyte.api.models.shared.ZendeskSunshineCredentials;
import com.airbyte.api.models.shared.ZendeskSupport;
import com.airbyte.api.models.shared.ZendeskSupportCredentials;
import com.airbyte.api.models.shared.ZendeskTalk;
import com.airbyte.api.models.shared.ZendeskTalkCredentials;
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

            CreateOrUpdateWorkspaceOAuthCredentialsRequest req = CreateOrUpdateWorkspaceOAuthCredentialsRequest.builder()
                .workspaceOAuthCredentialsRequest(WorkspaceOAuthCredentialsRequest.builder()
                        .actorType(ActorTypeEnum.DESTINATION)
                        .configuration(OAuthCredentialsConfiguration.of(Airtable.builder()
                                    .credentials(Credentials.builder()
                                        .clientId("<value>")
                                        .clientSecret("<value>")
                                        .build())
                                    .build()))
                        .name(OAuthActorNames.AMAZON_ADS)
                        .build())
                .workspaceId("<value>")
                .build();

            CreateOrUpdateWorkspaceOAuthCredentialsResponse res = sdk.workspaces().createOrUpdateWorkspaceOAuthCredentials()
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

| Parameter                                                                                                                                                     | Type                                                                                                                                                          | Required                                                                                                                                                      | Description                                                                                                                                                   |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                     | [com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsRequest](../../models/operations/CreateOrUpdateWorkspaceOAuthCredentialsRequest.md) | :heavy_check_mark:                                                                                                                                            | The request object to use for the request.                                                                                                                    |


### Response

**[Optional<? extends com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsResponse>](../../models/operations/CreateOrUpdateWorkspaceOAuthCredentialsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createWorkspace

Create a workspace

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.operations.CreateWorkspaceResponse;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.models.shared.WorkspaceCreateRequest;
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

            WorkspaceCreateRequest req = WorkspaceCreateRequest.builder()
                .name("<value>")
                .build();

            CreateWorkspaceResponse res = sdk.workspaces().createWorkspace()
                .request(req)
                .call();

            if (res.workspaceResponse().isPresent()) {
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

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [com.airbyte.api.models.shared.WorkspaceCreateRequest](../../models/shared/WorkspaceCreateRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |


### Response

**[Optional<? extends com.airbyte.api.models.operations.CreateWorkspaceResponse>](../../models/operations/CreateWorkspaceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteWorkspace

Delete a Workspace

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.operations.DeleteWorkspaceRequest;
import com.airbyte.api.models.operations.DeleteWorkspaceResponse;
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

            DeleteWorkspaceRequest req = DeleteWorkspaceRequest.builder()
                .workspaceId("<value>")
                .build();

            DeleteWorkspaceResponse res = sdk.workspaces().deleteWorkspace()
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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [com.airbyte.api.models.operations.DeleteWorkspaceRequest](../../models/operations/DeleteWorkspaceRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[Optional<? extends com.airbyte.api.models.operations.DeleteWorkspaceResponse>](../../models/operations/DeleteWorkspaceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getWorkspace

Get Workspace details

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.operations.GetWorkspaceRequest;
import com.airbyte.api.models.operations.GetWorkspaceResponse;
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

            GetWorkspaceRequest req = GetWorkspaceRequest.builder()
                .workspaceId("<value>")
                .build();

            GetWorkspaceResponse res = sdk.workspaces().getWorkspace()
                .request(req)
                .call();

            if (res.workspaceResponse().isPresent()) {
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

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [com.airbyte.api.models.operations.GetWorkspaceRequest](../../models/operations/GetWorkspaceRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |


### Response

**[Optional<? extends com.airbyte.api.models.operations.GetWorkspaceResponse>](../../models/operations/GetWorkspaceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listWorkspaces

List workspaces

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.operations.ListWorkspacesRequest;
import com.airbyte.api.models.operations.ListWorkspacesResponse;
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

            ListWorkspacesRequest req = ListWorkspacesRequest.builder()
                .includeDeleted(false)
                .limit(283250)
                .offset(568374)
                .workspaceIds(java.util.List.of(
                    "53f9aa38-0387-4f54-9d38-9888ede30708"))
                .build();

            ListWorkspacesResponse res = sdk.workspaces().listWorkspaces()
                .request(req)
                .call();

            if (res.workspacesResponse().isPresent()) {
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
| `request`                                                                                                   | [com.airbyte.api.models.operations.ListWorkspacesRequest](../../models/operations/ListWorkspacesRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[Optional<? extends com.airbyte.api.models.operations.ListWorkspacesResponse>](../../models/operations/ListWorkspacesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateWorkspace

Update a workspace

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.operations.UpdateWorkspaceRequest;
import com.airbyte.api.models.operations.UpdateWorkspaceResponse;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.models.shared.WorkspaceUpdateRequest;
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

            UpdateWorkspaceRequest req = UpdateWorkspaceRequest.builder()
                .workspaceUpdateRequest(WorkspaceUpdateRequest.builder()
                        .name("<value>")
                        .build())
                .workspaceId("<value>")
                .build();

            UpdateWorkspaceResponse res = sdk.workspaces().updateWorkspace()
                .request(req)
                .call();

            if (res.workspaceResponse().isPresent()) {
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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [com.airbyte.api.models.operations.UpdateWorkspaceRequest](../../models/operations/UpdateWorkspaceRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[Optional<? extends com.airbyte.api.models.operations.UpdateWorkspaceResponse>](../../models/operations/UpdateWorkspaceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

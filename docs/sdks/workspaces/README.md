# Workspaces
(*workspaces*)

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
import com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsRequest;
import com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsResponse;
import com.airbyte.api.models.shared.ActorTypeEnum;
import com.airbyte.api.models.shared.Airtable;
import com.airbyte.api.models.shared.AirtableCredentials;
import com.airbyte.api.models.shared.AmazonAds;
import com.airbyte.api.models.shared.AmazonSellerPartner;
import com.airbyte.api.models.shared.Asana;
import com.airbyte.api.models.shared.AsanaCredentials;
import com.airbyte.api.models.shared.BingAds;
import com.airbyte.api.models.shared.FacebookMarketing;
import com.airbyte.api.models.shared.Github;
import com.airbyte.api.models.shared.GithubCredentials;
import com.airbyte.api.models.shared.Gitlab;
import com.airbyte.api.models.shared.GitlabCredentials;
import com.airbyte.api.models.shared.GoogleAds;
import com.airbyte.api.models.shared.GoogleAdsCredentials;
import com.airbyte.api.models.shared.GoogleAnalyticsDataApi;
import com.airbyte.api.models.shared.GoogleAnalyticsDataApiCredentials;
import com.airbyte.api.models.shared.GoogleAnalyticsV4;
import com.airbyte.api.models.shared.GoogleAnalyticsV4Credentials;
import com.airbyte.api.models.shared.GoogleSearchConsole;
import com.airbyte.api.models.shared.GoogleSearchConsoleAuthorization;
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
import com.airbyte.api.models.shared.Xero;
import com.airbyte.api.models.shared.XeroAuthentication;
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

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security() {{
                    basicAuth = new SchemeBasicAuth("back", "seamless") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            CreateOrUpdateWorkspaceOAuthCredentialsRequest req = new CreateOrUpdateWorkspaceOAuthCredentialsRequest(                new WorkspaceOAuthCredentialsRequest(ActorTypeEnum.DESTINATION,                 new Github() {{
                                                credentials = new GithubCredentials() {{
                                                    clientId = "Baby Rupee till";
                                                    clientSecret = "commercialize";
                                                }};
                                            }}, OAuthActorNames.GITLAB);, "Gasoline Home causal");            

            CreateOrUpdateWorkspaceOAuthCredentialsResponse res = sdk.workspaces.createOrUpdateWorkspaceOAuthCredentials(req);

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

| Parameter                                                                                                                                                     | Type                                                                                                                                                          | Required                                                                                                                                                      | Description                                                                                                                                                   |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                     | [com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsRequest](../../models/operations/CreateOrUpdateWorkspaceOAuthCredentialsRequest.md) | :heavy_check_mark:                                                                                                                                            | The request object to use for the request.                                                                                                                    |


### Response

**[com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsResponse](../../models/operations/CreateOrUpdateWorkspaceOAuthCredentialsResponse.md)**


## createWorkspace

Create a workspace

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateWorkspaceResponse;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.models.shared.WorkspaceCreateRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security() {{
                    basicAuth = new SchemeBasicAuth("Armstrong", "consectetur") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            com.airbyte.api.models.shared.WorkspaceCreateRequest req = new WorkspaceCreateRequest("payment");            

            CreateWorkspaceResponse res = sdk.workspaces.createWorkspace(req);

            if (res.workspaceResponse != null) {
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
| `request`                                                                                             | [com.airbyte.api.models.shared.WorkspaceCreateRequest](../../models/shared/WorkspaceCreateRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |


### Response

**[com.airbyte.api.models.operations.CreateWorkspaceResponse](../../models/operations/CreateWorkspaceResponse.md)**


## deleteWorkspace

Delete a Workspace

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.DeleteWorkspaceRequest;
import com.airbyte.api.models.operations.DeleteWorkspaceResponse;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security() {{
                    basicAuth = new SchemeBasicAuth("3rd", "Automotive") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            DeleteWorkspaceRequest req = new DeleteWorkspaceRequest("protocol");            

            DeleteWorkspaceResponse res = sdk.workspaces.deleteWorkspace(req);

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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [com.airbyte.api.models.operations.DeleteWorkspaceRequest](../../models/operations/DeleteWorkspaceRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[com.airbyte.api.models.operations.DeleteWorkspaceResponse](../../models/operations/DeleteWorkspaceResponse.md)**


## getWorkspace

Get Workspace details

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.GetWorkspaceRequest;
import com.airbyte.api.models.operations.GetWorkspaceResponse;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security() {{
                    basicAuth = new SchemeBasicAuth("Mercedes", "odio") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            GetWorkspaceRequest req = new GetWorkspaceRequest("Fresh Bedfordshire male");            

            GetWorkspaceResponse res = sdk.workspaces.getWorkspace(req);

            if (res.workspaceResponse != null) {
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
| `request`                                                                                               | [com.airbyte.api.models.operations.GetWorkspaceRequest](../../models/operations/GetWorkspaceRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |


### Response

**[com.airbyte.api.models.operations.GetWorkspaceResponse](../../models/operations/GetWorkspaceResponse.md)**


## listWorkspaces

List workspaces

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.ListWorkspacesRequest;
import com.airbyte.api.models.operations.ListWorkspacesResponse;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security() {{
                    basicAuth = new SchemeBasicAuth("efficient", "channels") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            ListWorkspacesRequest req = new ListWorkspacesRequest() {{
                includeDeleted = false;
                limit = 971477;
                offset = 563607;
                workspaceIds = new String[]{{
                    add("aa380387-f545-4d38-9888-ede3070833b0"),
                }};
            }};            

            ListWorkspacesResponse res = sdk.workspaces.listWorkspaces(req);

            if (res.workspacesResponse != null) {
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
| `request`                                                                                                   | [com.airbyte.api.models.operations.ListWorkspacesRequest](../../models/operations/ListWorkspacesRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[com.airbyte.api.models.operations.ListWorkspacesResponse](../../models/operations/ListWorkspacesResponse.md)**


## updateWorkspace

Update a workspace

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.UpdateWorkspaceRequest;
import com.airbyte.api.models.operations.UpdateWorkspaceResponse;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.models.shared.WorkspaceUpdateRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security() {{
                    basicAuth = new SchemeBasicAuth("Wagon", "female") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            UpdateWorkspaceRequest req = new UpdateWorkspaceRequest(                new WorkspaceUpdateRequest("afterwards");, "male");            

            UpdateWorkspaceResponse res = sdk.workspaces.updateWorkspace(req);

            if (res.workspaceResponse != null) {
                // handle response
            }
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

**[com.airbyte.api.models.operations.UpdateWorkspaceResponse](../../models/operations/UpdateWorkspaceResponse.md)**


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
import com.airbyte.api.models.shared.OAuthActorNames;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.models.shared.WorkspaceOAuthCredentialsRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security(
                ){{
                    basicAuth = new SchemeBasicAuth(
                    "string",
                    "string"){{
                        password = "<YOUR_PASSWORD_HERE>";
                        username = "<YOUR_USERNAME_HERE>";
                    }};
                }})
                .build();

            com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsRequest req = new CreateOrUpdateWorkspaceOAuthCredentialsRequest(
                new WorkspaceOAuthCredentialsRequest(
                    ActorTypeEnum.DESTINATION,
                    "string",
                    OAuthActorNames.AMAZON_ADS),
                "string");

            com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsResponse res = sdk.workspaces.createOrUpdateWorkspaceOAuthCredentials(req);

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
                .setSecurity(new Security(
                ){{
                    basicAuth = new SchemeBasicAuth(
                    "string",
                    "string"){{
                        password = "<YOUR_PASSWORD_HERE>";
                        username = "<YOUR_USERNAME_HERE>";
                    }};
                }})
                .build();

            com.airbyte.api.models.shared.WorkspaceCreateRequest req = new WorkspaceCreateRequest(
                "string");

            com.airbyte.api.models.operations.CreateWorkspaceResponse res = sdk.workspaces.createWorkspace(req);

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
                .setSecurity(new Security(
                ){{
                    basicAuth = new SchemeBasicAuth(
                    "string",
                    "string"){{
                        password = "<YOUR_PASSWORD_HERE>";
                        username = "<YOUR_USERNAME_HERE>";
                    }};
                }})
                .build();

            com.airbyte.api.models.operations.DeleteWorkspaceRequest req = new DeleteWorkspaceRequest(
                "string");

            com.airbyte.api.models.operations.DeleteWorkspaceResponse res = sdk.workspaces.deleteWorkspace(req);

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
                .setSecurity(new Security(
                ){{
                    basicAuth = new SchemeBasicAuth(
                    "string",
                    "string"){{
                        password = "<YOUR_PASSWORD_HERE>";
                        username = "<YOUR_USERNAME_HERE>";
                    }};
                }})
                .build();

            com.airbyte.api.models.operations.GetWorkspaceRequest req = new GetWorkspaceRequest(
                "string");

            com.airbyte.api.models.operations.GetWorkspaceResponse res = sdk.workspaces.getWorkspace(req);

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
                .setSecurity(new Security(
                ){{
                    basicAuth = new SchemeBasicAuth(
                    "string",
                    "string"){{
                        password = "<YOUR_PASSWORD_HERE>";
                        username = "<YOUR_USERNAME_HERE>";
                    }};
                }})
                .build();

            com.airbyte.api.models.operations.ListWorkspacesRequest req = new ListWorkspacesRequest(
){{
                includeDeleted = false;
                limit = 283250;
                offset = 568374;
                workspaceIds = new String[]{{
                    add("53f9aa38-0387-4f54-9d38-9888ede30708"),
                }};

            }};

            com.airbyte.api.models.operations.ListWorkspacesResponse res = sdk.workspaces.listWorkspaces(req);

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
                .setSecurity(new Security(
                ){{
                    basicAuth = new SchemeBasicAuth(
                    "string",
                    "string"){{
                        password = "<YOUR_PASSWORD_HERE>";
                        username = "<YOUR_USERNAME_HERE>";
                    }};
                }})
                .build();

            com.airbyte.api.models.operations.UpdateWorkspaceRequest req = new UpdateWorkspaceRequest(
                new WorkspaceUpdateRequest(
                    "string"),
                "string");

            com.airbyte.api.models.operations.UpdateWorkspaceResponse res = sdk.workspaces.updateWorkspace(req);

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


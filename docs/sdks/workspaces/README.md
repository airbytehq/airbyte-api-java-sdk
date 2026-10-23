# Workspaces

## Overview

### Available Operations

* [createOrUpdateWorkspaceOAuthCredentials](#createorupdateworkspaceoauthcredentials) - Create OAuth override credentials for a workspace and source type.
* [createWorkspace](#createworkspace) - Create a workspace
* [deleteWorkspace](#deleteworkspace) - Delete a Workspace
* [deleteWorkspaceOAuthCredentials](#deleteworkspaceoauthcredentials) - Delete OAuth override credentials for a workspace and source/destination type.
* [getWorkspace](#getworkspace) - Get Workspace details
* [listWorkspaces](#listworkspaces) - List workspaces
* [updateWorkspace](#updateworkspace) - Update a workspace

## createOrUpdateWorkspaceOAuthCredentials

Create/update a set of OAuth credentials to override the Airbyte-provided OAuth credentials used for source/destination OAuth.
In order to determine what the credential configuration needs to be, please see the connector specification of the relevant source/destination.

### Example Usage

<!-- UsageSnippet language="java" operationID="createOrUpdateWorkspaceOAuthCredentials" method="put" path="/workspaces/{workspaceId}/oauthCredentials" -->
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsRequest;
import com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsResponse;
import com.airbyte.api.models.shared.*;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

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
                    .configuration(Map.ofEntries(
                    ))
                    .name(OAuthActorNames.TRELLO)
                    .build())
                .workspaceId("<value>")
                .build();

        CreateOrUpdateWorkspaceOAuthCredentialsResponse res = sdk.workspaces().createOrUpdateWorkspaceOAuthCredentials()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [CreateOrUpdateWorkspaceOAuthCredentialsRequest](../../models/operations/CreateOrUpdateWorkspaceOAuthCredentialsRequest.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |

### Response

**[CreateOrUpdateWorkspaceOAuthCredentialsResponse](../../models/operations/CreateOrUpdateWorkspaceOAuthCredentialsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createWorkspace

Create a workspace

### Example Usage: Workspace Creation Request Example

<!-- UsageSnippet language="java" operationID="createWorkspace" method="post" path="/workspaces" example="Workspace Creation Request Example" -->
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateWorkspaceResponse;
import com.airbyte.api.models.shared.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Airbyte sdk = Airbyte.builder()
                .security(Security.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .password("")
                        .username("")
                        .build())
                    .build())
            .build();

        WorkspaceCreateRequest req = WorkspaceCreateRequest.builder()
                .name("Company Workspace Name")
                .build();

        CreateWorkspaceResponse res = sdk.workspaces().createWorkspace()
                .request(req)
                .call();

        if (res.workspaceResponse().isPresent()) {
            System.out.println(res.workspaceResponse().get());
        }
    }
}
```
### Example Usage: Workspace Creation Response Example

<!-- UsageSnippet language="java" operationID="createWorkspace" method="post" path="/workspaces" example="Workspace Creation Response Example" -->
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateWorkspaceResponse;
import com.airbyte.api.models.shared.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

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
            System.out.println(res.workspaceResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [WorkspaceCreateRequest](../../models/shared/WorkspaceCreateRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreateWorkspaceResponse](../../models/operations/CreateWorkspaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteWorkspace

Delete a Workspace

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteWorkspace" method="delete" path="/workspaces/{workspaceId}" -->
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.DeleteWorkspaceRequest;
import com.airbyte.api.models.operations.DeleteWorkspaceResponse;
import com.airbyte.api.models.shared.SchemeBasicAuth;
import com.airbyte.api.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

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
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [DeleteWorkspaceRequest](../../models/operations/DeleteWorkspaceRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[DeleteWorkspaceResponse](../../models/operations/DeleteWorkspaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteWorkspaceOAuthCredentials

Delete a set of OAuth credentials that overrides the Airbyte-provided OAuth credentials used for source/destination OAuth.

> 🚧 Warning
>
> Deleting an override that is actively used by existing sources or destinations will cause those connectors to fail on their next sync and require re-authentication.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteWorkspaceOAuthCredentials" method="delete" path="/workspaces/{workspaceId}/oauthCredentials/{actorType}/{name}" -->
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.DeleteWorkspaceOAuthCredentialsRequest;
import com.airbyte.api.models.operations.DeleteWorkspaceOAuthCredentialsResponse;
import com.airbyte.api.models.shared.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Airbyte sdk = Airbyte.builder()
                .security(Security.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .password("")
                        .username("")
                        .build())
                    .build())
            .build();

        DeleteWorkspaceOAuthCredentialsRequest req = DeleteWorkspaceOAuthCredentialsRequest.builder()
                .actorType(ActorTypeEnum.SOURCE)
                .name("<value>")
                .workspaceId("<value>")
                .build();

        DeleteWorkspaceOAuthCredentialsResponse res = sdk.workspaces().deleteWorkspaceOAuthCredentials()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [DeleteWorkspaceOAuthCredentialsRequest](../../models/operations/DeleteWorkspaceOAuthCredentialsRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[DeleteWorkspaceOAuthCredentialsResponse](../../models/operations/DeleteWorkspaceOAuthCredentialsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getWorkspace

Get Workspace details

### Example Usage

<!-- UsageSnippet language="java" operationID="getWorkspace" method="get" path="/workspaces/{workspaceId}" example="Workspace Get Response Example" -->
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.GetWorkspaceRequest;
import com.airbyte.api.models.operations.GetWorkspaceResponse;
import com.airbyte.api.models.shared.SchemeBasicAuth;
import com.airbyte.api.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

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
            System.out.println(res.workspaceResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetWorkspaceRequest](../../models/operations/GetWorkspaceRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetWorkspaceResponse](../../models/operations/GetWorkspaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listWorkspaces

List workspaces

### Example Usage

<!-- UsageSnippet language="java" operationID="listWorkspaces" method="get" path="/workspaces" -->
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.ListWorkspacesRequest;
import com.airbyte.api.models.operations.ListWorkspacesResponse;
import com.airbyte.api.models.shared.SchemeBasicAuth;
import com.airbyte.api.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Airbyte sdk = Airbyte.builder()
                .security(Security.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .password("")
                        .username("")
                        .build())
                    .build())
            .build();

        ListWorkspacesRequest req = ListWorkspacesRequest.builder()
                .build();

        ListWorkspacesResponse res = sdk.workspaces().listWorkspaces()
                .request(req)
                .call();

        if (res.workspacesResponse().isPresent()) {
            System.out.println(res.workspacesResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListWorkspacesRequest](../../models/operations/ListWorkspacesRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListWorkspacesResponse](../../models/operations/ListWorkspacesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateWorkspace

Update a workspace

### Example Usage: Workspace Update Request Example

<!-- UsageSnippet language="java" operationID="updateWorkspace" method="patch" path="/workspaces/{workspaceId}" example="Workspace Update Request Example" -->
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.UpdateWorkspaceRequest;
import com.airbyte.api.models.operations.UpdateWorkspaceResponse;
import com.airbyte.api.models.shared.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

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
                    .name("Company Workspace Name")
                    .build())
                .workspaceId("<value>")
                .build();

        UpdateWorkspaceResponse res = sdk.workspaces().updateWorkspace()
                .request(req)
                .call();

        if (res.workspaceResponse().isPresent()) {
            System.out.println(res.workspaceResponse().get());
        }
    }
}
```
### Example Usage: Workspace Update Response Example

<!-- UsageSnippet language="java" operationID="updateWorkspace" method="patch" path="/workspaces/{workspaceId}" example="Workspace Update Response Example" -->
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.UpdateWorkspaceRequest;
import com.airbyte.api.models.operations.UpdateWorkspaceResponse;
import com.airbyte.api.models.shared.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

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
                    .build())
                .workspaceId("<value>")
                .build();

        UpdateWorkspaceResponse res = sdk.workspaces().updateWorkspace()
                .request(req)
                .call();

        if (res.workspaceResponse().isPresent()) {
            System.out.println(res.workspaceResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateWorkspaceRequest](../../models/operations/UpdateWorkspaceRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateWorkspaceResponse](../../models/operations/UpdateWorkspaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |
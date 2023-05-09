# workspaces

### Available Operations

* [createOrUpdateWorkspaceOAuthCredentials](#createorupdateworkspaceoauthcredentials) - Create OAuth override credentials for a workspace and source type.
* [createWorkspace](#createworkspace) - Create a workspace
* [getWorkspace](#getworkspace) - Get Workspace details
* [listWorkspaces](#listworkspaces) - List workspaces

## createOrUpdateWorkspaceOAuthCredentials

Create/update a set of OAuth credentials to override the Airbyte-provided OAuth credentials used for source/destination OAuth.
In order to determine what the credential configuration needs to be, please see the connector specification of the relevant  source/destination.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsRequest;
import com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsResponse;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.models.shared.WorkspaceOAuthCredentialsRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security("dignissimos") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            CreateOrUpdateWorkspaceOAuthCredentialsRequest req = new CreateOrUpdateWorkspaceOAuthCredentialsRequest(                new WorkspaceOAuthCredentialsRequest("inventore",                 new java.util.HashMap<String, Object>() {{
                                                put("totam", "accusamus");
                                                put("aliquam", "odio");
                                            }}, "occaecati");, "commodi");            

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
                .setSecurity(new Security("sapiente") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            com.airbyte.api.models.shared.WorkspaceCreateRequest req = new WorkspaceCreateRequest("dolores");            

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
                .setSecurity(new Security("deserunt") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            GetWorkspaceRequest req = new GetWorkspaceRequest("molestiae");            

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
                .setSecurity(new Security("accusantium") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            ListWorkspacesRequest req = new ListWorkspacesRequest() {{
                includeDeleted = false;
                limit = 783648;
                offset = 430402;
                workspaceIds = new String[]{{
                    add("8282aa48-2562-4f22-ae98-17ee17cbe61e"),
                    add("6b7b95bc-0ab3-4c20-84f3-789fd871f99d"),
                    add("d2efd121-aa6f-41e6-b4bd-b04f15756082"),
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

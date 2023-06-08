# workspaces

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
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.models.shared.WorkspaceOAuthCredentialsRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security("quasi") {{
                    bearerAuth = "";
                }})
                .build();

            CreateOrUpdateWorkspaceOAuthCredentialsRequest req = new CreateOrUpdateWorkspaceOAuthCredentialsRequest(                new WorkspaceOAuthCredentialsRequest(ActorTypeEnum.DESTINATION,                 new java.util.HashMap<String, Object>() {{
                                                put("aliquid", "tenetur");
                                                put("quae", "earum");
                                                put("vel", "in");
                                            }}, "eius");, "libero");            

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
                .setSecurity(new Security("illum") {{
                    bearerAuth = "";
                }})
                .build();

            com.airbyte.api.models.shared.WorkspaceCreateRequest req = new WorkspaceCreateRequest("soluta");            

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
                .setSecurity(new Security("accusantium") {{
                    bearerAuth = "";
                }})
                .build();

            DeleteWorkspaceRequest req = new DeleteWorkspaceRequest("aliquam");            

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
                .setSecurity(new Security("sapiente") {{
                    bearerAuth = "";
                }})
                .build();

            GetWorkspaceRequest req = new GetWorkspaceRequest("dicta");            

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
                .setSecurity(new Security("ullam") {{
                    bearerAuth = "";
                }})
                .build();

            ListWorkspacesRequest req = new ListWorkspacesRequest() {{
                includeDeleted = false;
                limit = 443879;
                offset = 356707;
                workspaceIds = new String[]{{
                    add("082d68ea-19f1-4d17-8513-39d08086a184"),
                    add("0394c260-71f9-43f5-b064-2dac7af515cc"),
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
                .setSecurity(new Security("labore") {{
                    bearerAuth = "";
                }})
                .build();

            UpdateWorkspaceRequest req = new UpdateWorkspaceRequest(                new WorkspaceUpdateRequest("ab");, "adipisci");            

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

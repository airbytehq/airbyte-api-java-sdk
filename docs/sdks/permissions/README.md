# Permissions
(*permissions()*)

## Overview

### Available Operations

* [createPermission](#createpermission) - Create a permission
* [deletePermission](#deletepermission) - Delete a Permission
* [getPermission](#getpermission) - Get Permission details
* [listPermissions](#listpermissions) - List Permissions by user id
* [updatePermission](#updatepermission) - Update a permission

## createPermission

Create a permission

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreatePermissionResponse;
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

        PermissionCreateRequest req = PermissionCreateRequest.builder()
                .permissionType(PublicPermissionType.WORKSPACE_ADMIN)
                .userId("7d08fd6c-531e-4a00-937e-3d355f253e63")
                .workspaceId("9924bcd0-99be-453d-ba47-c2c9766f7da5")
                .build();

        CreatePermissionResponse res = sdk.permissions().createPermission()
                .request(req)
                .call();

        if (res.permissionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PermissionCreateRequest](../../models/shared/PermissionCreateRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreatePermissionResponse](../../models/operations/CreatePermissionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deletePermission

Delete a Permission

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.DeletePermissionRequest;
import com.airbyte.api.models.operations.DeletePermissionResponse;
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

        DeletePermissionRequest req = DeletePermissionRequest.builder()
                .permissionId("<value>")
                .build();

        DeletePermissionResponse res = sdk.permissions().deletePermission()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [DeletePermissionRequest](../../models/operations/DeletePermissionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[DeletePermissionResponse](../../models/operations/DeletePermissionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPermission

Get Permission details

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.GetPermissionRequest;
import com.airbyte.api.models.operations.GetPermissionResponse;
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

        GetPermissionRequest req = GetPermissionRequest.builder()
                .permissionId("<value>")
                .build();

        GetPermissionResponse res = sdk.permissions().getPermission()
                .request(req)
                .call();

        if (res.permissionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetPermissionRequest](../../models/operations/GetPermissionRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetPermissionResponse](../../models/operations/GetPermissionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPermissions

List Permissions by user id

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.ListPermissionsRequest;
import com.airbyte.api.models.operations.ListPermissionsResponse;
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

        ListPermissionsRequest req = ListPermissionsRequest.builder()
                .build();

        ListPermissionsResponse res = sdk.permissions().listPermissions()
                .request(req)
                .call();

        if (res.permissionsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListPermissionsRequest](../../models/operations/ListPermissionsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListPermissionsResponse](../../models/operations/ListPermissionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePermission

Update a permission

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.UpdatePermissionRequest;
import com.airbyte.api.models.operations.UpdatePermissionResponse;
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

        UpdatePermissionRequest req = UpdatePermissionRequest.builder()
                .permissionUpdateRequest(PermissionUpdateRequest.builder()
                    .permissionType(PermissionType.WORKSPACE_OWNER)
                    .build())
                .permissionId("<value>")
                .build();

        UpdatePermissionResponse res = sdk.permissions().updatePermission()
                .request(req)
                .call();

        if (res.permissionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdatePermissionRequest](../../models/operations/UpdatePermissionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdatePermissionResponse](../../models/operations/UpdatePermissionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |
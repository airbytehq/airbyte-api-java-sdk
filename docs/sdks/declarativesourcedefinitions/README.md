# DeclarativeSourceDefinitions
(*declarativeSourceDefinitions()*)

## Overview

### Available Operations

* [createDeclarativeSourceDefinition](#createdeclarativesourcedefinition) - Create a declarative source definition.
* [deleteDeclarativeSourceDefinition](#deletedeclarativesourcedefinition) - Delete a declarative source definition.
* [getDeclarativeSourceDefinition](#getdeclarativesourcedefinition) - Get declarative source definition details.
* [listDeclarativeSourceDefinitions](#listdeclarativesourcedefinitions) - List declarative source definitions.
* [updateDeclarativeSourceDefinition](#updatedeclarativesourcedefinition) - Update declarative source definition details.

## createDeclarativeSourceDefinition

Create a declarative source definition.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateDeclarativeSourceDefinitionRequest;
import com.airbyte.api.models.operations.CreateDeclarativeSourceDefinitionResponse;
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

        CreateDeclarativeSourceDefinitionRequest req = CreateDeclarativeSourceDefinitionRequest.builder()
                .createDeclarativeSourceDefinitionRequest(com.airbyte.api.models.shared.CreateDeclarativeSourceDefinitionRequest.builder()
                    .manifest("<value>")
                    .name("<value>")
                    .build())
                .workspaceId("2d054f48-a68c-4d16-b04d-bb444d47c285")
                .build();

        CreateDeclarativeSourceDefinitionResponse res = sdk.declarativeSourceDefinitions().createDeclarativeSourceDefinition()
                .request(req)
                .call();

        if (res.declarativeSourceDefinitionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [CreateDeclarativeSourceDefinitionRequest](../../models/operations/CreateDeclarativeSourceDefinitionRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |

### Response

**[CreateDeclarativeSourceDefinitionResponse](../../models/operations/CreateDeclarativeSourceDefinitionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteDeclarativeSourceDefinition

Delete a declarative source definition.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.DeleteDeclarativeSourceDefinitionRequest;
import com.airbyte.api.models.operations.DeleteDeclarativeSourceDefinitionResponse;
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

        DeleteDeclarativeSourceDefinitionRequest req = DeleteDeclarativeSourceDefinitionRequest.builder()
                .definitionId("26cd06ea-5caa-47b9-98a2-1d217049557d")
                .workspaceId("f7cdc65f-5255-43d5-a6be-8fee673091f3")
                .build();

        DeleteDeclarativeSourceDefinitionResponse res = sdk.declarativeSourceDefinitions().deleteDeclarativeSourceDefinition()
                .request(req)
                .call();

        if (res.declarativeSourceDefinitionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [DeleteDeclarativeSourceDefinitionRequest](../../models/operations/DeleteDeclarativeSourceDefinitionRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |

### Response

**[DeleteDeclarativeSourceDefinitionResponse](../../models/operations/DeleteDeclarativeSourceDefinitionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getDeclarativeSourceDefinition

Get declarative source definition details.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.GetDeclarativeSourceDefinitionRequest;
import com.airbyte.api.models.operations.GetDeclarativeSourceDefinitionResponse;
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

        GetDeclarativeSourceDefinitionRequest req = GetDeclarativeSourceDefinitionRequest.builder()
                .definitionId("a003b7d3-efd4-4d7e-8ea6-469e9fe7871f")
                .workspaceId("3855d0f6-8cfb-44c2-ac49-0c3965c034bd")
                .build();

        GetDeclarativeSourceDefinitionResponse res = sdk.declarativeSourceDefinitions().getDeclarativeSourceDefinition()
                .request(req)
                .call();

        if (res.declarativeSourceDefinitionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [GetDeclarativeSourceDefinitionRequest](../../models/operations/GetDeclarativeSourceDefinitionRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[GetDeclarativeSourceDefinitionResponse](../../models/operations/GetDeclarativeSourceDefinitionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listDeclarativeSourceDefinitions

List declarative source definitions.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.ListDeclarativeSourceDefinitionsRequest;
import com.airbyte.api.models.operations.ListDeclarativeSourceDefinitionsResponse;
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

        ListDeclarativeSourceDefinitionsRequest req = ListDeclarativeSourceDefinitionsRequest.builder()
                .workspaceId("23bc0a4f-72b3-4d91-abe3-3f32d8a49dfc")
                .build();

        ListDeclarativeSourceDefinitionsResponse res = sdk.declarativeSourceDefinitions().listDeclarativeSourceDefinitions()
                .request(req)
                .call();

        if (res.declarativeSourceDefinitionsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [ListDeclarativeSourceDefinitionsRequest](../../models/operations/ListDeclarativeSourceDefinitionsRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[ListDeclarativeSourceDefinitionsResponse](../../models/operations/ListDeclarativeSourceDefinitionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateDeclarativeSourceDefinition

Update declarative source definition details.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.UpdateDeclarativeSourceDefinitionRequest;
import com.airbyte.api.models.operations.UpdateDeclarativeSourceDefinitionResponse;
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

        UpdateDeclarativeSourceDefinitionRequest req = UpdateDeclarativeSourceDefinitionRequest.builder()
                .updateDeclarativeSourceDefinitionRequest(com.airbyte.api.models.shared.UpdateDeclarativeSourceDefinitionRequest.builder()
                    .manifest("<value>")
                    .build())
                .definitionId("66066427-c293-4cbf-b72e-b31a72a46545")
                .workspaceId("87f1ccdb-71b2-401c-8f60-cac1f2a2da80")
                .build();

        UpdateDeclarativeSourceDefinitionResponse res = sdk.declarativeSourceDefinitions().updateDeclarativeSourceDefinition()
                .request(req)
                .call();

        if (res.declarativeSourceDefinitionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [UpdateDeclarativeSourceDefinitionRequest](../../models/operations/UpdateDeclarativeSourceDefinitionRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |

### Response

**[UpdateDeclarativeSourceDefinitionResponse](../../models/operations/UpdateDeclarativeSourceDefinitionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |
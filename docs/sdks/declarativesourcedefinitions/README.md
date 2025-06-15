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
import com.airbyte.api.models.operations.CreateDeclarativeSourceDefinitionResponse;
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

        com.airbyte.api.models.operations.CreateDeclarativeSourceDefinitionRequest req = com.airbyte.api.models.operations.CreateDeclarativeSourceDefinitionRequest.builder()
                .createDeclarativeSourceDefinitionRequest(CreateDeclarativeSourceDefinitionRequest.builder()
                    .manifest("<value>")
                    .name("<value>")
                    .build())
                .workspaceId("9f09326e-38fd-40ea-8871-6aaf7655a237")
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
                .definitionId("0cf3a1f6-1af6-4ae7-ae77-4bd1b32041f4")
                .workspaceId("5bed2604-75d1-40cf-a858-64e430840198")
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
                .definitionId("ce3288f2-b43c-40d0-ae8e-864c7a844485")
                .workspaceId("2a50feae-cf51-42e9-b777-b8d52ea2704e")
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
                .workspaceId("76222ecd-532e-4ab1-94e3-b96d1abd686e")
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
import com.airbyte.api.models.operations.UpdateDeclarativeSourceDefinitionResponse;
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

        com.airbyte.api.models.operations.UpdateDeclarativeSourceDefinitionRequest req = com.airbyte.api.models.operations.UpdateDeclarativeSourceDefinitionRequest.builder()
                .updateDeclarativeSourceDefinitionRequest(UpdateDeclarativeSourceDefinitionRequest.builder()
                    .manifest("<value>")
                    .build())
                .definitionId("c97eb9ab-47b5-4609-8d65-0a62f74ca843")
                .workspaceId("38cb8d27-592a-4438-be38-823abf06a84e")
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
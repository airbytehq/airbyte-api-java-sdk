# SourceDefinitions
(*sourceDefinitions()*)

## Overview

### Available Operations

* [createSourceDefinition](#createsourcedefinition) - Create a source definition.
* [deleteSourceDefinition](#deletesourcedefinition) - Delete a source definition.
* [getSourceDefinition](#getsourcedefinition) - Get source definition details.
* [listSourceDefinitions](#listsourcedefinitions) - List source definitions.
* [updateSourceDefinition](#updatesourcedefinition) - Update source definition details.

## createSourceDefinition

Create a source definition.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateSourceDefinitionRequest;
import com.airbyte.api.models.operations.CreateSourceDefinitionResponse;
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

        CreateSourceDefinitionRequest req = CreateSourceDefinitionRequest.builder()
                .createDefinitionRequest(CreateDefinitionRequest.builder()
                    .dockerImageTag("<value>")
                    .dockerRepository("<value>")
                    .name("<value>")
                    .build())
                .workspaceId("8198a6e0-f056-42f7-8427-5ff6e06d6b3c")
                .build();

        CreateSourceDefinitionResponse res = sdk.sourceDefinitions().createSourceDefinition()
                .request(req)
                .call();

        if (res.definitionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateSourceDefinitionRequest](../../models/operations/CreateSourceDefinitionRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateSourceDefinitionResponse](../../models/operations/CreateSourceDefinitionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteSourceDefinition

Delete a source definition.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.DeleteSourceDefinitionRequest;
import com.airbyte.api.models.operations.DeleteSourceDefinitionResponse;
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

        DeleteSourceDefinitionRequest req = DeleteSourceDefinitionRequest.builder()
                .definitionId("21000375-129d-49b4-8099-23a142e25559")
                .workspaceId("674a8870-5757-45f8-89f2-a765895d7bcc")
                .build();

        DeleteSourceDefinitionResponse res = sdk.sourceDefinitions().deleteSourceDefinition()
                .request(req)
                .call();

        if (res.definitionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [DeleteSourceDefinitionRequest](../../models/operations/DeleteSourceDefinitionRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[DeleteSourceDefinitionResponse](../../models/operations/DeleteSourceDefinitionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSourceDefinition

Get source definition details.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.GetSourceDefinitionRequest;
import com.airbyte.api.models.operations.GetSourceDefinitionResponse;
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

        GetSourceDefinitionRequest req = GetSourceDefinitionRequest.builder()
                .definitionId("ccda715b-b5a9-4c56-9c95-7285878c622f")
                .workspaceId("ea535916-6a24-4a05-b039-7da73c74b7c5")
                .build();

        GetSourceDefinitionResponse res = sdk.sourceDefinitions().getSourceDefinition()
                .request(req)
                .call();

        if (res.definitionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetSourceDefinitionRequest](../../models/operations/GetSourceDefinitionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetSourceDefinitionResponse](../../models/operations/GetSourceDefinitionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listSourceDefinitions

List source definitions.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.ListSourceDefinitionsRequest;
import com.airbyte.api.models.operations.ListSourceDefinitionsResponse;
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

        ListSourceDefinitionsRequest req = ListSourceDefinitionsRequest.builder()
                .workspaceId("d85ea6af-c9b0-461e-8a87-d7d38bfb62a3")
                .build();

        ListSourceDefinitionsResponse res = sdk.sourceDefinitions().listSourceDefinitions()
                .request(req)
                .call();

        if (res.definitionsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListSourceDefinitionsRequest](../../models/operations/ListSourceDefinitionsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListSourceDefinitionsResponse](../../models/operations/ListSourceDefinitionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateSourceDefinition

Update source definition details.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.UpdateSourceDefinitionRequest;
import com.airbyte.api.models.operations.UpdateSourceDefinitionResponse;
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

        UpdateSourceDefinitionRequest req = UpdateSourceDefinitionRequest.builder()
                .updateDefinitionRequest(UpdateDefinitionRequest.builder()
                    .dockerImageTag("<value>")
                    .name("<value>")
                    .build())
                .definitionId("d83c1bd9-0e8c-47a0-ba61-d9fff4bea47c")
                .workspaceId("d00d0938-69b2-48ac-878f-e92689d1c3b8")
                .build();

        UpdateSourceDefinitionResponse res = sdk.sourceDefinitions().updateSourceDefinition()
                .request(req)
                .call();

        if (res.definitionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateSourceDefinitionRequest](../../models/operations/UpdateSourceDefinitionRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateSourceDefinitionResponse](../../models/operations/UpdateSourceDefinitionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |
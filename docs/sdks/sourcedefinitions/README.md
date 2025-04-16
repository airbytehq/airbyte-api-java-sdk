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
                .workspaceId("06dbde72-63a8-4326-8f4b-67eb708f9ad6")
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
                .definitionId("fddaf9d9-7e09-433e-8e25-895734ad8809")
                .workspaceId("9789f575-f200-4155-b7ec-0750094af77f")
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
                .definitionId("b6405f71-0930-4f13-a99b-6b1b0a882853")
                .workspaceId("e76093e5-5cd8-4b87-ab32-c620a178a1c3")
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
                .workspaceId("fb60a310-f38b-47cb-9633-01f0cf740c18")
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
                .definitionId("6eaf6fbb-3e08-4f73-9ff1-de62553abd76")
                .workspaceId("b6bd5c36-3814-4489-97fb-3e48c1e0fdea")
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
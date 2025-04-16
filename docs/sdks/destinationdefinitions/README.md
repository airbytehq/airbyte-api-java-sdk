# DestinationDefinitions
(*destinationDefinitions()*)

## Overview

### Available Operations

* [createDestinationDefinition](#createdestinationdefinition) - Create a destination definition.
* [deleteDestinationDefinition](#deletedestinationdefinition) - Delete a destination definition.
* [getDestinationDefinition](#getdestinationdefinition) - Get destination definition details.
* [listDestinationDefinitions](#listdestinationdefinitions) - List destination definitions.
* [updateDestinationDefinition](#updatedestinationdefinition) - Update destination definition details.

## createDestinationDefinition

Create a destination definition.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateDestinationDefinitionRequest;
import com.airbyte.api.models.operations.CreateDestinationDefinitionResponse;
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

        CreateDestinationDefinitionRequest req = CreateDestinationDefinitionRequest.builder()
                .createDefinitionRequest(CreateDefinitionRequest.builder()
                    .dockerImageTag("<value>")
                    .dockerRepository("<value>")
                    .name("<value>")
                    .build())
                .workspaceId("f49928fc-e1f7-4278-9366-b5b974ad2068")
                .build();

        CreateDestinationDefinitionResponse res = sdk.destinationDefinitions().createDestinationDefinition()
                .request(req)
                .call();

        if (res.definitionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [CreateDestinationDefinitionRequest](../../models/operations/CreateDestinationDefinitionRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[CreateDestinationDefinitionResponse](../../models/operations/CreateDestinationDefinitionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteDestinationDefinition

Delete a destination definition.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.DeleteDestinationDefinitionRequest;
import com.airbyte.api.models.operations.DeleteDestinationDefinitionResponse;
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

        DeleteDestinationDefinitionRequest req = DeleteDestinationDefinitionRequest.builder()
                .definitionId("7a6d93e0-5a99-4e33-87ce-c0e739faf1e9")
                .workspaceId("619cc567-a21d-4f39-90ab-7854d54c9c42")
                .build();

        DeleteDestinationDefinitionResponse res = sdk.destinationDefinitions().deleteDestinationDefinition()
                .request(req)
                .call();

        if (res.definitionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [DeleteDestinationDefinitionRequest](../../models/operations/DeleteDestinationDefinitionRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[DeleteDestinationDefinitionResponse](../../models/operations/DeleteDestinationDefinitionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getDestinationDefinition

Get destination definition details.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.GetDestinationDefinitionRequest;
import com.airbyte.api.models.operations.GetDestinationDefinitionResponse;
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

        GetDestinationDefinitionRequest req = GetDestinationDefinitionRequest.builder()
                .definitionId("5ddd49a6-7aa1-469d-bd19-fa66e3586402")
                .workspaceId("5a9c29a5-f169-496b-b3b1-ab05028ede0b")
                .build();

        GetDestinationDefinitionResponse res = sdk.destinationDefinitions().getDestinationDefinition()
                .request(req)
                .call();

        if (res.definitionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetDestinationDefinitionRequest](../../models/operations/GetDestinationDefinitionRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetDestinationDefinitionResponse](../../models/operations/GetDestinationDefinitionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listDestinationDefinitions

List destination definitions.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.ListDestinationDefinitionsRequest;
import com.airbyte.api.models.operations.ListDestinationDefinitionsResponse;
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

        ListDestinationDefinitionsRequest req = ListDestinationDefinitionsRequest.builder()
                .workspaceId("f1f18267-b72b-4ea5-a29c-8742c80ceaf4")
                .build();

        ListDestinationDefinitionsResponse res = sdk.destinationDefinitions().listDestinationDefinitions()
                .request(req)
                .call();

        if (res.definitionsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListDestinationDefinitionsRequest](../../models/operations/ListDestinationDefinitionsRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListDestinationDefinitionsResponse](../../models/operations/ListDestinationDefinitionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateDestinationDefinition

Update destination definition details.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.UpdateDestinationDefinitionRequest;
import com.airbyte.api.models.operations.UpdateDestinationDefinitionResponse;
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

        UpdateDestinationDefinitionRequest req = UpdateDestinationDefinitionRequest.builder()
                .updateDefinitionRequest(UpdateDefinitionRequest.builder()
                    .dockerImageTag("<value>")
                    .name("<value>")
                    .build())
                .definitionId("97416649-dabf-43f9-8715-c5c8279f7f23")
                .workspaceId("98e0ed50-276f-49ae-ad18-43bc892bb109")
                .build();

        UpdateDestinationDefinitionResponse res = sdk.destinationDefinitions().updateDestinationDefinition()
                .request(req)
                .call();

        if (res.definitionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [UpdateDestinationDefinitionRequest](../../models/operations/UpdateDestinationDefinitionRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[UpdateDestinationDefinitionResponse](../../models/operations/UpdateDestinationDefinitionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |
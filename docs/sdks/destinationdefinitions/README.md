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
                .workspaceId("20a22858-a8c3-4a9c-af3e-691931b55938")
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
                .definitionId("1f3ace88-4e9e-4438-8667-c98520825c79")
                .workspaceId("b1b184d8-4def-4e2d-8e9d-7caadc80e180")
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
                .definitionId("83a7ce8a-1507-42c5-84a3-1b95932f919f")
                .workspaceId("443f2bd2-d502-4aec-b86f-c4e3d5675ae9")
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
                .workspaceId("aed43ac9-470c-4cba-8489-c73f9e881f94")
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
                .definitionId("43c71f97-6486-49c7-9f26-4de603fa3bb2")
                .workspaceId("29dd981b-57da-413b-b1f4-012b1a97afc4")
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
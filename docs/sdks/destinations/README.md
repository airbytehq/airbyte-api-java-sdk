# Destinations
(*destinations()*)

## Overview

### Available Operations

* [createDestination](#createdestination) - Create a destination
* [deleteDestination](#deletedestination) - Delete a Destination
* [getDestination](#getdestination) - Get Destination details
* [listDestinations](#listdestinations) - List destinations
* [patchDestination](#patchdestination) - Update a Destination
* [putDestination](#putdestination) - Update a Destination and fully overwrite it

## createDestination

Creates a destination given a name, workspace id, and a json blob containing the configuration for the source.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateDestinationResponse;
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

        DestinationCreateRequest req = DestinationCreateRequest.builder()
                .configuration(DestinationConfiguration.of(DestinationOracle.builder()
                    .host("instructive-mainstream.com")
                    .sid("<id>")
                    .username("Robert.Legros98")
                    .build()))
                .name("Postgres")
                .workspaceId("2155ae5a-de39-4808-af6a-16fe7b8b4ed2")
                .build();

        CreateDestinationResponse res = sdk.destinations().createDestination()
                .request(req)
                .call();

        if (res.destinationResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [DestinationCreateRequest](../../models/shared/DestinationCreateRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateDestinationResponse](../../models/operations/CreateDestinationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteDestination

Delete a Destination

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.DeleteDestinationRequest;
import com.airbyte.api.models.operations.DeleteDestinationResponse;
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

        DeleteDestinationRequest req = DeleteDestinationRequest.builder()
                .destinationId("<value>")
                .build();

        DeleteDestinationResponse res = sdk.destinations().deleteDestination()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [DeleteDestinationRequest](../../models/operations/DeleteDestinationRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[DeleteDestinationResponse](../../models/operations/DeleteDestinationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getDestination

Get Destination details

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.GetDestinationRequest;
import com.airbyte.api.models.operations.GetDestinationResponse;
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

        GetDestinationRequest req = GetDestinationRequest.builder()
                .destinationId("<value>")
                .build();

        GetDestinationResponse res = sdk.destinations().getDestination()
                .request(req)
                .call();

        if (res.destinationResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetDestinationRequest](../../models/operations/GetDestinationRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetDestinationResponse](../../models/operations/GetDestinationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listDestinations

List destinations

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.ListDestinationsRequest;
import com.airbyte.api.models.operations.ListDestinationsResponse;
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

        ListDestinationsRequest req = ListDestinationsRequest.builder()
                .build();

        ListDestinationsResponse res = sdk.destinations().listDestinations()
                .request(req)
                .call();

        if (res.destinationsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListDestinationsRequest](../../models/operations/ListDestinationsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListDestinationsResponse](../../models/operations/ListDestinationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchDestination

Update a Destination

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.PatchDestinationRequest;
import com.airbyte.api.models.operations.PatchDestinationResponse;
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

        PatchDestinationRequest req = PatchDestinationRequest.builder()
                .destinationId("<value>")
                .destinationPatchRequest(DestinationPatchRequest.builder()
                    .configuration(DestinationConfiguration.of(DestinationDeepset.builder()
                        .apiKey("<value>")
                        .workspace("<value>")
                        .build()))
                    .name("My Destination")
                    .build())
                .build();

        PatchDestinationResponse res = sdk.destinations().patchDestination()
                .request(req)
                .call();

        if (res.destinationResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchDestinationRequest](../../models/operations/PatchDestinationRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchDestinationResponse](../../models/operations/PatchDestinationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## putDestination

Update a Destination and fully overwrite it

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.PutDestinationRequest;
import com.airbyte.api.models.operations.PutDestinationResponse;
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

        PutDestinationRequest req = PutDestinationRequest.builder()
                .destinationId("<value>")
                .destinationPutRequest(DestinationPutRequest.builder()
                    .configuration(DestinationConfiguration.of(DestinationClickhouse.builder()
                        .database("<value>")
                        .host("urban-receptor.org")
                        .username("Kaylie_Terry")
                        .build()))
                    .name("My Destination")
                    .build())
                .build();

        PutDestinationResponse res = sdk.destinations().putDestination()
                .request(req)
                .call();

        if (res.destinationResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PutDestinationRequest](../../models/operations/PutDestinationRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PutDestinationResponse](../../models/operations/PutDestinationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |
# Destinations

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

### Example Usage: Destination Creation Request Example

<!-- UsageSnippet language="java" operationID="createDestination" method="post" path="/destinations" example="Destination Creation Request Example" -->
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
                .configuration(DestinationConfiguration.of(DestinationElasticsearch.builder()
                    .endpoint("<value>")
                    .build()))
                .name("Postgres")
                .workspaceId("2155ae5a-de39-4808-af6a-16fe7b8b4ed2")
                .build();

        CreateDestinationResponse res = sdk.destinations().createDestination()
                .request(req)
                .call();

        if (res.destinationResponse().isPresent()) {
            System.out.println(res.destinationResponse().get());
        }
    }
}
```
### Example Usage: Destination Creation Response Example

<!-- UsageSnippet language="java" operationID="createDestination" method="post" path="/destinations" example="Destination Creation Response Example" -->
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
                .configuration(DestinationConfiguration.of(DestinationTimeplus.builder()
                    .apikey("<value>")
                    .endpoint("https://us-west-2.timeplus.cloud/workspace_id")
                    .build()))
                .name("<value>")
                .workspaceId("dc693cc0-960d-4c6c-9d1b-05e8bf0c96ba")
                .build();

        CreateDestinationResponse res = sdk.destinations().createDestination()
                .request(req)
                .call();

        if (res.destinationResponse().isPresent()) {
            System.out.println(res.destinationResponse().get());
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

<!-- UsageSnippet language="java" operationID="deleteDestination" method="delete" path="/destinations/{destinationId}" -->
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

<!-- UsageSnippet language="java" operationID="getDestination" method="get" path="/destinations/{destinationId}" example="Destination Get Response Example" -->
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
            System.out.println(res.destinationResponse().get());
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

<!-- UsageSnippet language="java" operationID="listDestinations" method="get" path="/destinations" -->
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
            System.out.println(res.destinationsResponse().get());
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

### Example Usage: Destination Update Request Example

<!-- UsageSnippet language="java" operationID="patchDestination" method="patch" path="/destinations/{destinationId}" example="Destination Update Request Example" -->
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
                    .configuration(DestinationConfiguration.of(DestinationDuckdb.builder()
                        .destinationPath("/local/destination.duckdb")
                        .build()))
                    .name("My Destination")
                    .build())
                .build();

        PatchDestinationResponse res = sdk.destinations().patchDestination()
                .request(req)
                .call();

        if (res.destinationResponse().isPresent()) {
            System.out.println(res.destinationResponse().get());
        }
    }
}
```
### Example Usage: Destination Update Response Example

<!-- UsageSnippet language="java" operationID="patchDestination" method="patch" path="/destinations/{destinationId}" example="Destination Update Response Example" -->
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
                    .configuration(DestinationConfiguration.of(DestinationHubspot.builder()
                        .credentials(DestinationHubspotCredentials.of(OAuth.builder()
                            .clientId("<id>")
                            .clientSecret("<value>")
                            .refreshToken("<value>")
                            .build()))
                        .build()))
                    .build())
                .build();

        PatchDestinationResponse res = sdk.destinations().patchDestination()
                .request(req)
                .call();

        if (res.destinationResponse().isPresent()) {
            System.out.println(res.destinationResponse().get());
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

### Example Usage: Destination Update Request Example

<!-- UsageSnippet language="java" operationID="putDestination" method="put" path="/destinations/{destinationId}" example="Destination Update Request Example" -->
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
                    .configuration(DestinationConfiguration.of(DestinationSftpJson.builder()
                        .destinationPath("/json_data")
                        .host("slight-consistency.info")
                        .password("TRmq8ozhIC5jwDd")
                        .username("Easton_Wilderman")
                        .build()))
                    .name("My Destination")
                    .build())
                .build();

        PutDestinationResponse res = sdk.destinations().putDestination()
                .request(req)
                .call();

        if (res.destinationResponse().isPresent()) {
            System.out.println(res.destinationResponse().get());
        }
    }
}
```
### Example Usage: Destination Update Response Example

<!-- UsageSnippet language="java" operationID="putDestination" method="put" path="/destinations/{destinationId}" example="Destination Update Response Example" -->
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
                    .configuration(DestinationConfiguration.of(DestinationSalesforce.builder()
                        .clientId("<id>")
                        .clientSecret("<value>")
                        .refreshToken("<value>")
                        .build()))
                    .name("<value>")
                    .build())
                .build();

        PutDestinationResponse res = sdk.destinations().putDestination()
                .request(req)
                .call();

        if (res.destinationResponse().isPresent()) {
            System.out.println(res.destinationResponse().get());
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
# Sources
(*sources()*)

## Overview

### Available Operations

* [createSource](#createsource) - Create a source
* [deleteSource](#deletesource) - Delete a Source
* [getSource](#getsource) - Get Source details
* [initiateOAuth](#initiateoauth) - Initiate OAuth for a source
* [listSources](#listsources) - List sources
* [patchSource](#patchsource) - Update a Source
* [putSource](#putsource) - Update a Source and fully overwrite it

## createSource

Creates a source given a name, workspace id, and a json blob containing the configuration for the source.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateSourceResponse;
import com.airbyte.api.models.shared.*;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

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

        SourceCreateRequest req = SourceCreateRequest.builder()
                .configuration(SourceConfiguration.of(SourceOnesignal.builder()
                    .applications(List.of())
                    .outcomeNames("os__session_duration.count,os__click.count,CustomOutcomeName.sum")
                    .startDate(OffsetDateTime.parse("2020-11-16T00:00:00Z"))
                    .userAuthKey("<value>")
                    .build()))
                .name("My Source")
                .workspaceId("744cc0ed-7f05-4949-9e60-2a814f90c035")
                .build();

        CreateSourceResponse res = sdk.sources().createSource()
                .request(req)
                .call();

        if (res.sourceResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [SourceCreateRequest](../../models/shared/SourceCreateRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[CreateSourceResponse](../../models/operations/CreateSourceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteSource

Delete a Source

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.DeleteSourceRequest;
import com.airbyte.api.models.operations.DeleteSourceResponse;
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

        DeleteSourceRequest req = DeleteSourceRequest.builder()
                .sourceId("<value>")
                .build();

        DeleteSourceResponse res = sdk.sources().deleteSource()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [DeleteSourceRequest](../../models/operations/DeleteSourceRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[DeleteSourceResponse](../../models/operations/DeleteSourceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSource

Get Source details

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.GetSourceRequest;
import com.airbyte.api.models.operations.GetSourceResponse;
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

        GetSourceRequest req = GetSourceRequest.builder()
                .sourceId("<value>")
                .build();

        GetSourceResponse res = sdk.sources().getSource()
                .request(req)
                .call();

        if (res.sourceResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetSourceRequest](../../models/operations/GetSourceRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetSourceResponse](../../models/operations/GetSourceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## initiateOAuth

Given a source ID, workspace ID, and redirect URL, initiates OAuth for the source.

This returns a fully formed URL for performing user authentication against the relevant source identity provider (IdP). Once authentication has been completed, the IdP will redirect to an Airbyte endpoint which will save the access and refresh tokens off as a secret and return the secret ID to the redirect URL specified in the `secret_id` query string parameter.

That secret ID can be used to create a source with credentials in place of actual tokens.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.InitiateOAuthResponse;
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

        InitiateOauthRequest req = InitiateOauthRequest.builder()
                .redirectUrl("https://cloud.airbyte.io/v1/api/oauth/callback")
                .sourceType(OAuthActorNames.INSTAGRAM)
                .workspaceId("871d9b60-11d1-44cb-8c92-c246d53bf87e")
                .build();

        InitiateOAuthResponse res = sdk.sources().initiateOAuth()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [InitiateOauthRequest](../../models/shared/InitiateOauthRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[InitiateOAuthResponse](../../models/operations/InitiateOAuthResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listSources

List sources

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.ListSourcesRequest;
import com.airbyte.api.models.operations.ListSourcesResponse;
import com.airbyte.api.models.shared.SchemeBasicAuth;
import com.airbyte.api.models.shared.Security;
import java.lang.Exception;
import java.util.List;

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

        ListSourcesRequest req = ListSourcesRequest.builder()
                .workspaceIds(List.of(
                    "d",
                    "f",
                    "0",
                    "8",
                    "f",
                    "6",
                    "b",
                    "0",
                    "-",
                    "b",
                    "3",
                    "6",
                    "4",
                    "-",
                    "4",
                    "c",
                    "c",
                    "1",
                    "-",
                    "9",
                    "b",
                    "3",
                    "f",
                    "-",
                    "9",
                    "6",
                    "f",
                    "5",
                    "d",
                    "2",
                    "f",
                    "c",
                    "c",
                    "f",
                    "b",
                    "2",
                    ",",
                    "b",
                    "0",
                    "7",
                    "9",
                    "6",
                    "7",
                    "9",
                    "7",
                    "-",
                    "d",
                    "e",
                    "2",
                    "3",
                    "-",
                    "4",
                    "f",
                    "c",
                    "7",
                    "-",
                    "a",
                    "5",
                    "e",
                    "2",
                    "-",
                    "7",
                    "e",
                    "1",
                    "3",
                    "1",
                    "3",
                    "1",
                    "4",
                    "7",
                    "1",
                    "8",
                    "c"))
                .build();

        ListSourcesResponse res = sdk.sources().listSources()
                .request(req)
                .call();

        if (res.sourcesResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ListSourcesRequest](../../models/operations/ListSourcesRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ListSourcesResponse](../../models/operations/ListSourcesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchSource

Update a Source

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.PatchSourceRequest;
import com.airbyte.api.models.operations.PatchSourceResponse;
import com.airbyte.api.models.shared.*;
import java.lang.Exception;
import java.time.OffsetDateTime;

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

        PatchSourceRequest req = PatchSourceRequest.builder()
                .sourceId("<value>")
                .sourcePatchRequest(SourcePatchRequest.builder()
                    .configuration(SourceConfiguration.of(SourceNylas.builder()
                        .apiKey("<value>")
                        .apiServer(APIServer.US)
                        .endDate(OffsetDateTime.parse("2024-09-13T05:42:44.905Z"))
                        .startDate(OffsetDateTime.parse("2023-12-03T11:21:24.468Z"))
                        .build()))
                    .name("My Source")
                    .workspaceId("744cc0ed-7f05-4949-9e60-2a814f90c035")
                    .build())
                .build();

        PatchSourceResponse res = sdk.sources().patchSource()
                .request(req)
                .call();

        if (res.sourceResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [PatchSourceRequest](../../models/operations/PatchSourceRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[PatchSourceResponse](../../models/operations/PatchSourceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## putSource

Update a Source and fully overwrite it

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.PutSourceRequest;
import com.airbyte.api.models.operations.PutSourceResponse;
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

        PutSourceRequest req = PutSourceRequest.builder()
                .sourceId("<value>")
                .sourcePutRequest(SourcePutRequest.builder()
                    .configuration(SourceConfiguration.of(SourceRdStationMarketing.builder()
                        .startDate("2017-01-25T00:00:00Z")
                        .build()))
                    .name("My Source")
                    .build())
                .build();

        PutSourceResponse res = sdk.sources().putSource()
                .request(req)
                .call();

        if (res.sourceResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [PutSourceRequest](../../models/operations/PutSourceRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[PutSourceResponse](../../models/operations/PutSourceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |
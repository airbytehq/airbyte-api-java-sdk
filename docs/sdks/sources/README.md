# Sources
(*sources()*)

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
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.Iterable;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Airbyte sdk = Airbyte.builder()
                .security(Security.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .password("")
                        .username("")
                        .build())
                    .build())
                .build();

            SourceCreateRequest req = SourceCreateRequest.builder()
                .configuration(SourceConfiguration.of(SourceAha.builder()
                            .apiKey("<value>")
                            .url("<value>")
                            .build()))
                .name("<value>")
                .workspaceId("a2cf0f31-f3dd-4c98-88c3-4bdfb109056a")
                .build();

            CreateSourceResponse res = sdk.sources().createSource()
                .request(req)
                .call();

            if (res.sourceResponse().isPresent()) {
                // handle response
            }
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [com.airbyte.api.models.shared.SourceCreateRequest](../../models/shared/SourceCreateRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |


### Response

**[com.airbyte.api.models.operations.CreateSourceResponse](../../models/operations/CreateSourceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## deleteSource

Delete a Source

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [com.airbyte.api.models.operations.DeleteSourceRequest](../../models/operations/DeleteSourceRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |


### Response

**[com.airbyte.api.models.operations.DeleteSourceResponse](../../models/operations/DeleteSourceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## getSource

Get Source details

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [com.airbyte.api.models.operations.GetSourceRequest](../../models/operations/GetSourceRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[com.airbyte.api.models.operations.GetSourceResponse](../../models/operations/GetSourceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## initiateOAuth

Given a source ID, workspace ID, and redirect URL, initiates OAuth for the source.

This returns a fully formed URL for performing user authentication against the relevant source identity provider (IdP). Once authentication has been completed, the IdP will redirect to an Airbyte endpoint which will save the access and refresh tokens off as a secret and return the secret ID to the redirect URL specified in the `secret_id` query string parameter.

That secret ID can be used to create a source with credentials in place of actual tokens.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Airbyte sdk = Airbyte.builder()
                .security(Security.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .password("")
                        .username("")
                        .build())
                    .build())
                .build();

            InitiateOauthRequest req = InitiateOauthRequest.builder()
                .redirectUrl("<value>")
                .sourceType(OAuthActorNames.GITLAB)
                .workspaceId("fd28130d-9919-4ffa-a67d-4e12eb099447")
                .build();

            InitiateOAuthResponse res = sdk.sources().initiateOAuth()
                .request(req)
                .call();

            // handle response
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [com.airbyte.api.models.shared.InitiateOauthRequest](../../models/shared/InitiateOauthRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[com.airbyte.api.models.operations.InitiateOAuthResponse](../../models/operations/InitiateOAuthResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## listSources

List sources

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Airbyte sdk = Airbyte.builder()
                .security(Security.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .password("")
                        .username("")
                        .build())
                    .build())
                .build();

            ListSourcesRequest req = ListSourcesRequest.builder()
                .workspaceIds(java.util.List.of(
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
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [com.airbyte.api.models.operations.ListSourcesRequest](../../models/operations/ListSourcesRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |


### Response

**[com.airbyte.api.models.operations.ListSourcesResponse](../../models/operations/ListSourcesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## patchSource

Update a Source

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.Iterable;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
                    .configuration(SourceConfiguration.of(SourceAha.builder()
                                .apiKey("<value>")
                                .url("<value>")
                                .build()))
                    .name("My source")
                    .build())
                .build();

            PatchSourceResponse res = sdk.sources().patchSource()
                .request(req)
                .call();

            if (res.sourceResponse().isPresent()) {
                // handle response
            }
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [com.airbyte.api.models.operations.PatchSourceRequest](../../models/operations/PatchSourceRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |


### Response

**[com.airbyte.api.models.operations.PatchSourceResponse](../../models/operations/PatchSourceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## putSource

Update a Source and fully overwrite it

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.Iterable;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
                    .configuration(SourceConfiguration.of(SourceAha.builder()
                                .apiKey("<value>")
                                .url("<value>")
                                .build()))
                    .name("<value>")
                    .build())
                .build();

            PutSourceResponse res = sdk.sources().putSource()
                .request(req)
                .call();

            if (res.sourceResponse().isPresent()) {
                // handle response
            }
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [com.airbyte.api.models.operations.PutSourceRequest](../../models/operations/PutSourceRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[com.airbyte.api.models.operations.PutSourceResponse](../../models/operations/PutSourceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

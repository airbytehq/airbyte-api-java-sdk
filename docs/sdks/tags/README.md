# Tags
(*tags()*)

## Overview

### Available Operations

* [createTag](#createtag) - Create a tag
* [deleteTag](#deletetag) - Delete a tag
* [getTag](#gettag) - Get a tag
* [listTags](#listtags) - List all tags
* [updateTag](#updatetag) - Update a tag

## createTag

Create a tag

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateTagResponse;
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

        TagCreateRequest req = TagCreateRequest.builder()
                .color("blue")
                .name("<value>")
                .workspaceId("5f85d5ab-c889-4273-91d7-c22bac981db2")
                .build();

        CreateTagResponse res = sdk.tags().createTag()
                .request(req)
                .call();

        if (res.tagResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [TagCreateRequest](../../models/shared/TagCreateRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[CreateTagResponse](../../models/operations/CreateTagResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteTag

Delete a tag

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.DeleteTagRequest;
import com.airbyte.api.models.operations.DeleteTagResponse;
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

        DeleteTagRequest req = DeleteTagRequest.builder()
                .tagId("da1c4fd4-2786-4b27-8b72-2335c85a5af8")
                .build();

        DeleteTagResponse res = sdk.tags().deleteTag()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [DeleteTagRequest](../../models/operations/DeleteTagRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[DeleteTagResponse](../../models/operations/DeleteTagResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTag

Get a tag

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.GetTagRequest;
import com.airbyte.api.models.operations.GetTagResponse;
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

        GetTagRequest req = GetTagRequest.builder()
                .tagId("808ab48f-5790-47fe-aa1e-3073281a0300")
                .build();

        GetTagResponse res = sdk.tags().getTag()
                .request(req)
                .call();

        if (res.tagResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [GetTagRequest](../../models/operations/GetTagRequest.md) | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[GetTagResponse](../../models/operations/GetTagResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTags

Lists all tags

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.ListTagsRequest;
import com.airbyte.api.models.operations.ListTagsResponse;
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

        ListTagsRequest req = ListTagsRequest.builder()
                .build();

        ListTagsResponse res = sdk.tags().listTags()
                .request(req)
                .call();

        if (res.tagsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [ListTagsRequest](../../models/operations/ListTagsRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[ListTagsResponse](../../models/operations/ListTagsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateTag

Update a tag

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.UpdateTagRequest;
import com.airbyte.api.models.operations.UpdateTagResponse;
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

        UpdateTagRequest req = UpdateTagRequest.builder()
                .tagPatchRequest(TagPatchRequest.builder()
                    .color("turquoise")
                    .name("<value>")
                    .build())
                .tagId("3043493e-7596-4d2b-8ee9-859838c615f6")
                .build();

        UpdateTagResponse res = sdk.tags().updateTag()
                .request(req)
                .call();

        if (res.tagResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [UpdateTagRequest](../../models/operations/UpdateTagRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[UpdateTagResponse](../../models/operations/UpdateTagResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |
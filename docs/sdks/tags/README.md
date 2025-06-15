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
                .color("mint green")
                .name("<value>")
                .workspaceId("fb9b459f-ba25-4500-ab48-74bb184a25d8")
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
                .tagId("a7b6d3f2-0b68-410f-9d8b-570413d4925b")
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
                .tagId("0e4206b6-0672-45f2-82cb-05850f1907ba")
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

        ListTagsResponse res = sdk.tags().listTags()
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
                    .color("red")
                    .name("<value>")
                    .build())
                .tagId("80469d11-8074-4b50-ac85-fa8ba37ca92a")
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
# Streams
(*streams()*)

## Overview

### Available Operations

* [getStreamProperties](#getstreamproperties) - Get stream properties

## getStreamProperties

Get stream properties

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.GetStreamPropertiesRequest;
import com.airbyte.api.models.operations.GetStreamPropertiesResponse;
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

        GetStreamPropertiesRequest req = GetStreamPropertiesRequest.builder()
                .sourceId("<value>")
                .build();

        GetStreamPropertiesResponse res = sdk.streams().getStreamProperties()
                .request(req)
                .call();

        if (res.streamPropertiesResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetStreamPropertiesRequest](../../models/operations/GetStreamPropertiesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetStreamPropertiesResponse](../../models/operations/GetStreamPropertiesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |
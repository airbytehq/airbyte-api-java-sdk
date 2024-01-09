# Streams
(*streams*)

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
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security(
                ){{
                    basicAuth = new SchemeBasicAuth(
                    "string",
                    "string"){{
                        password = "<YOUR_PASSWORD_HERE>";
                        username = "<YOUR_USERNAME_HERE>";
                    }};
                }})
                .build();

            com.airbyte.api.models.operations.GetStreamPropertiesRequest req = new GetStreamPropertiesRequest(
                "string",
                "string"){{
                ignoreCache = false;

            }};

            com.airbyte.api.models.operations.GetStreamPropertiesResponse res = sdk.streams.getStreamProperties(req);

            if (res.streamPropertiesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [com.airbyte.api.models.operations.GetStreamPropertiesRequest](../../models/operations/GetStreamPropertiesRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |


### Response

**[com.airbyte.api.models.operations.GetStreamPropertiesResponse](../../models/operations/GetStreamPropertiesResponse.md)**


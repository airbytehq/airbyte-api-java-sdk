# Streams
(*streams()*)

### Available Operations

* [getStreamProperties](#getstreamproperties) - Get stream properties

## getStreamProperties

Get stream properties

### Example Usage

```java
package hello.world;

import com.airbyte.api.airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.operations.GetStreamPropertiesRequest;
import com.airbyte.api.models.operations.GetStreamPropertiesResponse;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .security(Security.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .password("")
                        .username("")
                        .build())
                    .build())
                .build();

            GetStreamPropertiesRequest req = GetStreamPropertiesRequest.builder()
                .destinationId("<value>")
                .sourceId("<value>")
                .ignoreCache(false)
                .build();

            GetStreamPropertiesResponse res = sdk.streams().getStreamProperties()
                .request(req)
                .call();

            if (res.streamPropertiesResponse().isPresent()) {
                // handle response
            }
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
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

**[Optional<? extends com.airbyte.api.models.operations.GetStreamPropertiesResponse>](../../models/operations/GetStreamPropertiesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

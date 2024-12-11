# Health
(*health()*)

## Overview

### Available Operations

* [getHealthCheck](#gethealthcheck) - Health Check

## getHealthCheck

Health Check

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.GetHealthCheckResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Airbyte sdk = Airbyte.builder()
            .build();

        GetHealthCheckResponse res = sdk.health().getHealthCheck()
                .call();

        // handle response
    }
}
```

### Response

**[GetHealthCheckResponse](../../models/operations/GetHealthCheckResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |
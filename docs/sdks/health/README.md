# Health
(*health()*)

### Available Operations

* [getHealthCheck](#gethealthcheck) - Health Check

## getHealthCheck

Health Check

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.shared.*;
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
                .build();

            GetHealthCheckResponse res = sdk.health().getHealthCheck()
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


### Response

**[Optional<? extends com.airbyte.api.models.operations.GetHealthCheckResponse>](../../models/operations/GetHealthCheckResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

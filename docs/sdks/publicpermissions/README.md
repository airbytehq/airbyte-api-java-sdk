# PublicPermissions
(*publicPermissions()*)

### Available Operations

* [createPermission](#createpermission) - Create a permission

## createPermission

Create a permission

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.Security;
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

            PermissionCreateRequest req = PermissionCreateRequest.builder()
                .permissionType(PermissionType.ORGANIZATION_ADMIN)
                .userId("297cb6ba-4669-43f1-b750-c800e1a1986b")
                .build();

            CreatePermissionResponse res = sdk.publicPermissions().createPermission()
                .request(req)
                .call();

            if (res.permissionResponse().isPresent()) {
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

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [com.airbyte.api.models.shared.PermissionCreateRequest](../../models/shared/PermissionCreateRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |


### Response

**[Optional<? extends com.airbyte.api.models.operations.CreatePermissionResponse>](../../models/operations/CreatePermissionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

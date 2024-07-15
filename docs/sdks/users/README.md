# Users
(*users()*)

### Available Operations

* [listUsersWithinAnOrganization](#listuserswithinanorganization) - List all users within an organization

## listUsersWithinAnOrganization

Organization Admin user can list all users within the same organization. Also provide filtering on a list of user IDs or/and a list of user emails.

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

            ListUsersWithinAnOrganizationRequest req = ListUsersWithinAnOrganizationRequest.builder()
                .organizationId("<value>")
                .build();

            ListUsersWithinAnOrganizationResponse res = sdk.users().listUsersWithinAnOrganization()
                .request(req)
                .call();

            if (res.usersResponse().isPresent()) {
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

| Parameter                                                                                                                                 | Type                                                                                                                                      | Required                                                                                                                                  | Description                                                                                                                               |
| ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                 | [com.airbyte.api.models.operations.ListUsersWithinAnOrganizationRequest](../../models/operations/ListUsersWithinAnOrganizationRequest.md) | :heavy_check_mark:                                                                                                                        | The request object to use for the request.                                                                                                |


### Response

**[com.airbyte.api.models.operations.ListUsersWithinAnOrganizationResponse](../../models/operations/ListUsersWithinAnOrganizationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

# Organizations
(*organizations()*)

## Overview

### Available Operations

* [listOrganizationsForUser](#listorganizationsforuser) - List all organizations for a user

## listOrganizationsForUser

Lists users organizations.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.ListOrganizationsForUserResponse;
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

        ListOrganizationsForUserResponse res = sdk.organizations().listOrganizationsForUser()
                .call();

        if (res.organizationsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ListOrganizationsForUserResponse](../../models/operations/ListOrganizationsForUserResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |
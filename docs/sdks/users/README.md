# Users
(*users()*)

## Overview

### Available Operations

* [listUsersWithinAnOrganization](#listuserswithinanorganization) - List all users within an organization

## listUsersWithinAnOrganization

Organization Admin user can list all users within the same organization. Also provide filtering on a list of user IDs or/and a list of user emails.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.ListUsersWithinAnOrganizationRequest;
import com.airbyte.api.models.operations.ListUsersWithinAnOrganizationResponse;
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

        ListUsersWithinAnOrganizationRequest req = ListUsersWithinAnOrganizationRequest.builder()
                .organizationId("<value>")
                .build();

        ListUsersWithinAnOrganizationResponse res = sdk.users().listUsersWithinAnOrganization()
                .request(req)
                .call();

        if (res.usersResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [ListUsersWithinAnOrganizationRequest](../../models/operations/ListUsersWithinAnOrganizationRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[ListUsersWithinAnOrganizationResponse](../../models/operations/ListUsersWithinAnOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |
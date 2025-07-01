# Organizations
(*organizations()*)

## Overview

### Available Operations

* [createOrUpdateOrganizationOAuthCredentials](#createorupdateorganizationoauthcredentials) - Create OAuth override credentials for an organization and source type.
* [listOrganizationsForUser](#listorganizationsforuser) - List all organizations for a user

## createOrUpdateOrganizationOAuthCredentials

Create/update a set of OAuth credentials to override the Airbyte-provided OAuth credentials used for source/destination OAuth.
In order to determine what the credential configuration needs to be, please see the connector specification of the relevant source/destination.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateOrUpdateOrganizationOAuthCredentialsRequest;
import com.airbyte.api.models.operations.CreateOrUpdateOrganizationOAuthCredentialsResponse;
import com.airbyte.api.models.shared.*;
import java.lang.Exception;
import java.util.Map;

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

        CreateOrUpdateOrganizationOAuthCredentialsRequest req = CreateOrUpdateOrganizationOAuthCredentialsRequest.builder()
                .organizationOAuthCredentialsRequest(OrganizationOAuthCredentialsRequest.builder()
                    .actorType(ActorTypeEnum.SOURCE)
                    .configuration(Map.ofEntries(
                    ))
                    .name("<value>")
                    .build())
                .organizationId("<value>")
                .build();

        CreateOrUpdateOrganizationOAuthCredentialsResponse res = sdk.organizations().createOrUpdateOrganizationOAuthCredentials()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [CreateOrUpdateOrganizationOAuthCredentialsRequest](../../models/operations/CreateOrUpdateOrganizationOAuthCredentialsRequest.md) | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |

### Response

**[CreateOrUpdateOrganizationOAuthCredentialsResponse](../../models/operations/CreateOrUpdateOrganizationOAuthCredentialsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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
# Connections
(*connections()*)

### Available Operations

* [createConnection](#createconnection) - Create a connection
* [deleteConnection](#deleteconnection) - Delete a Connection
* [getConnection](#getconnection) - Get Connection details
* [listConnections](#listconnections) - List connections
* [patchConnection](#patchconnection) - Update Connection details

## createConnection

Create a connection

### Example Usage

```java
package hello.world;

import com.airbyte.api.airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.operations.CreateConnectionResponse;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.ConnectionCreateRequest;
import com.airbyte.api.models.shared.ConnectionSchedule;
import com.airbyte.api.models.shared.ConnectionStatusEnum;
import com.airbyte.api.models.shared.ConnectionSyncModeEnum;
import com.airbyte.api.models.shared.GeographyEnum;
import com.airbyte.api.models.shared.NamespaceDefinitionEnum;
import com.airbyte.api.models.shared.NonBreakingSchemaUpdatesBehaviorEnum;
import com.airbyte.api.models.shared.ScheduleTypeEnum;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.models.shared.StreamConfiguration;
import com.airbyte.api.models.shared.StreamConfigurations;
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

            ConnectionCreateRequest req = ConnectionCreateRequest.builder()
                .destinationId("c669dd1e-3620-483e-afc8-55914e0a570f")
                .sourceId("6dd427d8-3a55-4584-b835-842325b6c7b3")
                .configurations(StreamConfigurations.builder()
                    .streams(java.util.List.of(
                        StreamConfiguration.builder()
                            .name("<value>")
                            .build()))
                    .build())
                .dataResidency(GeographyEnum.EU)
                .name("<value>")
                .namespaceDefinition(NamespaceDefinitionEnum.CUSTOM_FORMAT)
                .namespaceFormat("${SOURCE_NAMESPACE}")
                .nonBreakingSchemaUpdatesBehavior(NonBreakingSchemaUpdatesBehaviorEnum.IGNORE)
                .prefix("<value>")
                .schedule(ConnectionSchedule.builder()
                    .scheduleType(ScheduleTypeEnum.CRON)
                    .cronExpression("<value>")
                    .build())
                .status(ConnectionStatusEnum.DEPRECATED)
                .build();

            CreateConnectionResponse res = sdk.connections().createConnection()
                .request(req)
                .call();

            if (res.connectionResponse().isPresent()) {
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

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [com.airbyte.api.models.shared.ConnectionCreateRequest](../../models/shared/ConnectionCreateRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |


### Response

**[Optional<? extends com.airbyte.api.models.operations.CreateConnectionResponse>](../../models/operations/CreateConnectionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteConnection

Delete a Connection

### Example Usage

```java
package hello.world;

import com.airbyte.api.airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.operations.DeleteConnectionRequest;
import com.airbyte.api.models.operations.DeleteConnectionResponse;
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

            DeleteConnectionRequest req = DeleteConnectionRequest.builder()
                .connectionId("<value>")
                .build();

            DeleteConnectionResponse res = sdk.connections().deleteConnection()
                .request(req)
                .call();

            // handle response
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [com.airbyte.api.models.operations.DeleteConnectionRequest](../../models/operations/DeleteConnectionRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[Optional<? extends com.airbyte.api.models.operations.DeleteConnectionResponse>](../../models/operations/DeleteConnectionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getConnection

Get Connection details

### Example Usage

```java
package hello.world;

import com.airbyte.api.airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.operations.GetConnectionRequest;
import com.airbyte.api.models.operations.GetConnectionResponse;
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

            GetConnectionRequest req = GetConnectionRequest.builder()
                .connectionId("<value>")
                .build();

            GetConnectionResponse res = sdk.connections().getConnection()
                .request(req)
                .call();

            if (res.connectionResponse().isPresent()) {
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

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [com.airbyte.api.models.operations.GetConnectionRequest](../../models/operations/GetConnectionRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[Optional<? extends com.airbyte.api.models.operations.GetConnectionResponse>](../../models/operations/GetConnectionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listConnections

List connections

### Example Usage

```java
package hello.world;

import com.airbyte.api.airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.operations.ListConnectionsRequest;
import com.airbyte.api.models.operations.ListConnectionsResponse;
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

            ListConnectionsRequest req = ListConnectionsRequest.builder()
                .includeDeleted(false)
                .limit(726733)
                .offset(907316)
                .workspaceIds(java.util.List.of(
                    "d8f6e532-a55f-479c-ab30-682edc879612"))
                .build();

            ListConnectionsResponse res = sdk.connections().listConnections()
                .request(req)
                .call();

            if (res.connectionsResponse().isPresent()) {
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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [com.airbyte.api.models.operations.ListConnectionsRequest](../../models/operations/ListConnectionsRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[Optional<? extends com.airbyte.api.models.operations.ListConnectionsResponse>](../../models/operations/ListConnectionsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## patchConnection

Update Connection details

### Example Usage

```java
package hello.world;

import com.airbyte.api.airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.operations.PatchConnectionRequest;
import com.airbyte.api.models.operations.PatchConnectionResponse;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.ConnectionPatchRequest;
import com.airbyte.api.models.shared.ConnectionSchedule;
import com.airbyte.api.models.shared.ConnectionStatusEnum;
import com.airbyte.api.models.shared.ConnectionSyncModeEnum;
import com.airbyte.api.models.shared.GeographyEnumNoDefault;
import com.airbyte.api.models.shared.NamespaceDefinitionEnumNoDefault;
import com.airbyte.api.models.shared.NonBreakingSchemaUpdatesBehaviorEnumNoDefault;
import com.airbyte.api.models.shared.ScheduleTypeEnum;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.models.shared.StreamConfiguration;
import com.airbyte.api.models.shared.StreamConfigurations;
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

            PatchConnectionRequest req = PatchConnectionRequest.builder()
                .connectionPatchRequest(ConnectionPatchRequest.builder()
                        .configurations(StreamConfigurations.builder()
                            .streams(java.util.List.of(
                                StreamConfiguration.builder()
                                    .name("<value>")
                                    .build()))
                            .build())
                        .dataResidency(GeographyEnumNoDefault.AUTO)
                        .name("<value>")
                        .namespaceDefinition(NamespaceDefinitionEnumNoDefault.SOURCE)
                        .namespaceFormat("${SOURCE_NAMESPACE}")
                        .nonBreakingSchemaUpdatesBehavior(NonBreakingSchemaUpdatesBehaviorEnumNoDefault.PROPAGATE_FULLY)
                        .prefix("<value>")
                        .schedule(ConnectionSchedule.builder()
                            .scheduleType(ScheduleTypeEnum.CRON)
                            .cronExpression("<value>")
                            .build())
                        .status(ConnectionStatusEnum.ACTIVE)
                        .build())
                .connectionId("<value>")
                .build();

            PatchConnectionResponse res = sdk.connections().patchConnection()
                .request(req)
                .call();

            if (res.connectionResponse().isPresent()) {
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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [com.airbyte.api.models.operations.PatchConnectionRequest](../../models/operations/PatchConnectionRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[Optional<? extends com.airbyte.api.models.operations.PatchConnectionResponse>](../../models/operations/PatchConnectionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

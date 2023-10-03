# Connections
(*connections*)

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

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateConnectionResponse;
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

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security() {{
                    basicAuth = new SchemeBasicAuth("violet", "Account") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            com.airbyte.api.models.shared.ConnectionCreateRequest req = new ConnectionCreateRequest("d1e36208-3eaf-4c85-9914-e0a570f6dd42", "7d83a555-8478-4358-8232-5b6c7b3fd2fd") {{
                configurations = new StreamConfigurations() {{
                    streams = new com.airbyte.api.models.shared.StreamConfiguration[]{{
                        add(new StreamConfiguration("though") {{
                            cursorField = new String[]{{
                                add("Ergonomic"),
                            }};
                            name = "Hyundai West";
                            primaryKey = new String[][]{{
                                add(new String[]{{
                                    add("tesla"),
                                }}),
                            }};
                            syncMode = ConnectionSyncModeEnum.FULL_REFRESH_APPEND;
                        }}),
                    }};
                }};;
                dataResidency = GeographyEnum.US;
                name = "sans contingency models";
                namespaceDefinition = NamespaceDefinitionEnum.DESTINATION;
                namespaceFormat = "${SOURCE_NAMESPACE}";
                nonBreakingSchemaUpdatesBehavior = NonBreakingSchemaUpdatesBehaviorEnum.IGNORE;
                prefix = "olive Reggae Sweden";
                schedule = new ConnectionSchedule(ScheduleTypeEnum.CRON) {{
                    cronExpression = "Rupee";
                }};;
                status = ConnectionStatusEnum.INACTIVE;
            }};            

            CreateConnectionResponse res = sdk.connections.createConnection(req);

            if (res.connectionResponse != null) {
                // handle response
            }
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

**[com.airbyte.api.models.operations.CreateConnectionResponse](../../models/operations/CreateConnectionResponse.md)**


## deleteConnection

Delete a Connection

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.DeleteConnectionRequest;
import com.airbyte.api.models.operations.DeleteConnectionResponse;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security() {{
                    basicAuth = new SchemeBasicAuth("gold", "sadly") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            DeleteConnectionRequest req = new DeleteConnectionRequest("Southeast Engineer");            

            DeleteConnectionResponse res = sdk.connections.deleteConnection(req);

            if (res.statusCode == 200) {
                // handle response
            }
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

**[com.airbyte.api.models.operations.DeleteConnectionResponse](../../models/operations/DeleteConnectionResponse.md)**


## getConnection

Get Connection details

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.GetConnectionRequest;
import com.airbyte.api.models.operations.GetConnectionResponse;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security() {{
                    basicAuth = new SchemeBasicAuth("ack", "surcharge") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            GetConnectionRequest req = new GetConnectionRequest("Southeast bluetooth Card");            

            GetConnectionResponse res = sdk.connections.getConnection(req);

            if (res.connectionResponse != null) {
                // handle response
            }
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

**[com.airbyte.api.models.operations.GetConnectionResponse](../../models/operations/GetConnectionResponse.md)**


## listConnections

List connections

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.ListConnectionsRequest;
import com.airbyte.api.models.operations.ListConnectionsResponse;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security() {{
                    basicAuth = new SchemeBasicAuth("Hassium", "Hatchback") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            ListConnectionsRequest req = new ListConnectionsRequest() {{
                includeDeleted = false;
                limit = 990687;
                offset = 410691;
                workspaceIds = new String[]{{
                    add("e532a55f-79c2-4b30-a82e-dc879612b791"),
                }};
            }};            

            ListConnectionsResponse res = sdk.connections.listConnections(req);

            if (res.connectionsResponse != null) {
                // handle response
            }
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

**[com.airbyte.api.models.operations.ListConnectionsResponse](../../models/operations/ListConnectionsResponse.md)**


## patchConnection

Update Connection details

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.PatchConnectionRequest;
import com.airbyte.api.models.operations.PatchConnectionResponse;
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

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security() {{
                    basicAuth = new SchemeBasicAuth("Northeast", "modulo") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            PatchConnectionRequest req = new PatchConnectionRequest(                new ConnectionPatchRequest() {{
                                configurations = new StreamConfigurations() {{
                                    streams = new com.airbyte.api.models.shared.StreamConfiguration[]{{
                                        add(new StreamConfiguration("Customizable") {{
                                            cursorField = new String[]{{
                                                add("Incredible"),
                                            }};
                                            name = "Automotive Clothing";
                                            primaryKey = new String[][]{{
                                                add(new String[]{{
                                                    add("connect"),
                                                }}),
                                            }};
                                            syncMode = ConnectionSyncModeEnum.INCREMENTAL_DEDUPED_HISTORY;
                                        }}),
                                    }};
                                }};;
                                dataResidency = GeographyEnumNoDefault.US;
                                name = "Chevrolet Keyboard";
                                namespaceDefinition = NamespaceDefinitionEnumNoDefault.DESTINATION;
                                namespaceFormat = "${SOURCE_NAMESPACE}";
                                nonBreakingSchemaUpdatesBehavior = NonBreakingSchemaUpdatesBehaviorEnumNoDefault.IGNORE;
                                prefix = "Shoes Serbia";
                                schedule = new ConnectionSchedule(ScheduleTypeEnum.CRON) {{
                                    cronExpression = "Indio microchip Intelligent";
                                }};;
                                status = ConnectionStatusEnum.DEPRECATED;
                            }};, "Haute port");            

            PatchConnectionResponse res = sdk.connections.patchConnection(req);

            if (res.connectionResponse != null) {
                // handle response
            }
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

**[com.airbyte.api.models.operations.PatchConnectionResponse](../../models/operations/PatchConnectionResponse.md)**


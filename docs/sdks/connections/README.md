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
                .setSecurity(new Security(){{
                    basicAuth = new SchemeBasicAuth("string", "string"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            com.airbyte.api.models.shared.ConnectionCreateRequest req = new ConnectionCreateRequest("c669dd1e-3620-483e-afc8-55914e0a570f", "6dd427d8-3a55-4584-b835-842325b6c7b3"){{
                configurations = new StreamConfigurations(){{
                    streams = new com.airbyte.api.models.shared.StreamConfiguration[]{{
                        add(new StreamConfiguration("string"){{
                            cursorField = new String[]{{
                                add("string"),
                            }};
                            name = "string";
                            primaryKey = new String[][]{{
                                add(new String[]{{
                                    add("string"),
                                }}),
                            }};
                        }}),
                    }};
                }};
                dataResidency = GeographyEnum.EU;
                name = "string";
                namespaceDefinition = NamespaceDefinitionEnum.CUSTOM_FORMAT;
                namespaceFormat = "${SOURCE_NAMESPACE}";
                nonBreakingSchemaUpdatesBehavior = NonBreakingSchemaUpdatesBehaviorEnum.IGNORE;
                prefix = "string";
                schedule = new ConnectionSchedule(ScheduleTypeEnum.CRON){{
                    cronExpression = "string";
                }};
                status = ConnectionStatusEnum.DEPRECATED;
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
                .setSecurity(new Security(){{
                    basicAuth = new SchemeBasicAuth("string", "string"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            DeleteConnectionRequest req = new DeleteConnectionRequest("string");            

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
                .setSecurity(new Security(){{
                    basicAuth = new SchemeBasicAuth("string", "string"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            GetConnectionRequest req = new GetConnectionRequest("string");            

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
                .setSecurity(new Security(){{
                    basicAuth = new SchemeBasicAuth("string", "string"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            ListConnectionsRequest req = new ListConnectionsRequest(){{
                includeDeleted = false;
                limit = 726733;
                offset = 907316;
                workspaceIds = new String[]{{
                    add("d8f6e532-a55f-479c-ab30-682edc879612"),
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
                .setSecurity(new Security(){{
                    basicAuth = new SchemeBasicAuth("string", "string"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            PatchConnectionRequest req = new PatchConnectionRequest(new ConnectionPatchRequest(){{
configurations = new StreamConfigurations(){{
    streams = new com.airbyte.api.models.shared.StreamConfiguration[]{{
        add(new StreamConfiguration("string"){{
            cursorField = new String[]{{
                add("string"),
            }};
            name = "string";
            primaryKey = new String[][]{{
                add(new String[]{{
                    add("string"),
                }}),
            }};
        }}),
    }};
}};
dataResidency = GeographyEnumNoDefault.AUTO;
name = "string";
namespaceDefinition = NamespaceDefinitionEnumNoDefault.SOURCE;
namespaceFormat = "${SOURCE_NAMESPACE}";
nonBreakingSchemaUpdatesBehavior = NonBreakingSchemaUpdatesBehaviorEnumNoDefault.PROPAGATE_FULLY;
prefix = "string";
schedule = new ConnectionSchedule(ScheduleTypeEnum.CRON){{
    cronExpression = "string";
}};
status = ConnectionStatusEnum.ACTIVE;
}}, "string");            

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


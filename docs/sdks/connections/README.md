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
                    basicAuth = new SchemeBasicAuth("voluptates", "quasi") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            com.airbyte.api.models.shared.ConnectionCreateRequest req = new ConnectionCreateRequest("e91e450a-d2ab-4d44-a698-02d502a94bb4", "f63c969e-9a3e-4fa7-bdfb-14cd66ae395e") {{
                configurations = new StreamConfigurations() {{
                    streams = new com.airbyte.api.models.shared.StreamConfiguration[]{{
                        add(new StreamConfiguration("amet") {{
                            cursorField = new String[]{{
                                add("delectus"),
                            }};
                            name = "Rene Reinger";
                            primaryKey = new String[][]{{
                                add(new String[]{{
                                    add("deleniti"),
                                }}),
                            }};
                            syncMode = ConnectionSyncModeEnum.INCREMENTAL_DEDUPED_HISTORY;
                        }}),
                    }};
                }};;
                dataResidency = GeographyEnum.US;
                name = "Wilma Mosciski";
                namespaceDefinition = NamespaceDefinitionEnum.SOURCE;
                namespaceFormat = "${SOURCE_NAMESPACE}";
                nonBreakingSchemaUpdatesBehavior = NonBreakingSchemaUpdatesBehaviorEnum.DISABLE_CONNECTION;
                prefix = "magnam";
                schedule = new ConnectionSchedule(ScheduleTypeEnum.CRON) {{
                    cronExpression = "id";
                }};;
                status = ConnectionStatusEnum.ACTIVE;
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
                    basicAuth = new SchemeBasicAuth("labore", "suscipit") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            DeleteConnectionRequest req = new DeleteConnectionRequest("natus");            

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
                    basicAuth = new SchemeBasicAuth("nobis", "eum") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            GetConnectionRequest req = new GetConnectionRequest("vero");            

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
                    basicAuth = new SchemeBasicAuth("aspernatur", "architecto") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            ListConnectionsRequest req = new ListConnectionsRequest() {{
                includeDeleted = false;
                limit = 298282;
                offset = 92373;
                workspaceIds = new String[]{{
                    add("959890af-a563-4e25-96fe-4c8b711e5b7f"),
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
                    basicAuth = new SchemeBasicAuth("quibusdam", "sed") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            PatchConnectionRequest req = new PatchConnectionRequest(                new ConnectionPatchRequest() {{
                                configurations = new StreamConfigurations() {{
                                    streams = new com.airbyte.api.models.shared.StreamConfiguration[]{{
                                        add(new StreamConfiguration("quo") {{
                                            cursorField = new String[]{{
                                                add("saepe"),
                                            }};
                                            name = "Edward Crooks";
                                            primaryKey = new String[][]{{
                                                add(new String[]{{
                                                    add("magni"),
                                                }}),
                                            }};
                                            syncMode = ConnectionSyncModeEnum.FULL_REFRESH_OVERWRITE;
                                        }}),
                                    }};
                                }};;
                                dataResidency = GeographyEnumNoDefault.EU;
                                name = "Simon Jenkins";
                                namespaceDefinition = NamespaceDefinitionEnumNoDefault.DESTINATION;
                                namespaceFormat = "${SOURCE_NAMESPACE}";
                                nonBreakingSchemaUpdatesBehavior = NonBreakingSchemaUpdatesBehaviorEnumNoDefault.IGNORE;
                                prefix = "ab";
                                schedule = new ConnectionSchedule(ScheduleTypeEnum.CRON) {{
                                    cronExpression = "quidem";
                                }};;
                                status = ConnectionStatusEnum.INACTIVE;
                            }};, "voluptate");            

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


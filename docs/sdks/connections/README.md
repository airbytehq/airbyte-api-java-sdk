# connections

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
                .setSecurity(new Security("aut") {{
                    bearerAuth = "";
                }})
                .build();

            com.airbyte.api.models.shared.ConnectionCreateRequest req = new ConnectionCreateRequest("19da1ffe-78f0-497b-8074-f15471b5e6e1", "3b99d488-e1e9-41e4-90ad-2abd44269802") {{
                configurations = new StreamConfigurations() {{
                    streams = new com.airbyte.api.models.shared.StreamConfiguration[]{{
                        add(new StreamConfiguration("officia") {{
                            cursorField = new String[]{{
                                add("alias"),
                                add("fugit"),
                            }};
                            name = "Marshall Glover";
                            primaryKey = new String[][]{{
                                add(new String[]{{
                                    add("eum"),
                                    add("non"),
                                    add("eligendi"),
                                    add("sint"),
                                }}),
                                add(new String[]{{
                                    add("provident"),
                                    add("necessitatibus"),
                                }}),
                            }};
                            syncMode = ConnectionSyncModeEnum.INCREMENTAL_APPEND;
                        }}),
                        add(new StreamConfiguration("provident") {{
                            cursorField = new String[]{{
                                add("debitis"),
                            }};
                            name = "Wilbur King";
                            primaryKey = new String[][]{{
                                add(new String[]{{
                                    add("dicta"),
                                    add("magnam"),
                                    add("cumque"),
                                }}),
                                add(new String[]{{
                                    add("ea"),
                                    add("aliquid"),
                                    add("laborum"),
                                    add("accusamus"),
                                }}),
                                add(new String[]{{
                                    add("occaecati"),
                                }}),
                                add(new String[]{{
                                    add("accusamus"),
                                    add("delectus"),
                                }}),
                            }};
                            syncMode = ConnectionSyncModeEnum.INCREMENTAL_APPEND;
                        }}),
                        add(new StreamConfiguration("nobis") {{
                            cursorField = new String[]{{
                                add("id"),
                                add("blanditiis"),
                                add("deleniti"),
                            }};
                            name = "Vincent Nolan";
                            primaryKey = new String[][]{{
                                add(new String[]{{
                                    add("molestiae"),
                                    add("perferendis"),
                                    add("nihil"),
                                }}),
                                add(new String[]{{
                                    add("distinctio"),
                                    add("id"),
                                }}),
                                add(new String[]{{
                                    add("labore"),
                                    add("suscipit"),
                                }}),
                            }};
                            syncMode = ConnectionSyncModeEnum.INCREMENTAL_APPEND;
                        }}),
                        add(new StreamConfiguration("debitis") {{
                            cursorField = new String[]{{
                                add("vero"),
                                add("aspernatur"),
                            }};
                            name = "Danielle Bosco";
                            primaryKey = new String[][]{{
                                add(new String[]{{
                                    add("sint"),
                                    add("accusantium"),
                                    add("mollitia"),
                                }}),
                                add(new String[]{{
                                    add("mollitia"),
                                    add("ad"),
                                    add("eum"),
                                    add("dolor"),
                                }}),
                                add(new String[]{{
                                    add("odit"),
                                    add("nemo"),
                                    add("quasi"),
                                    add("iure"),
                                }}),
                            }};
                            syncMode = ConnectionSyncModeEnum.INCREMENTAL_DEDUPED_HISTORY;
                        }}),
                    }};
                }};;
                dataResidency = GeographyEnum.AUTO;
                name = "Alfredo Prosacco Sr.";
                namespaceDefinition = NamespaceDefinitionEnum.CUSTOM_FORMAT;
                namespaceFormat = "${SOURCE_NAMESPACE}";
                nonBreakingSchemaUpdatesBehavior = NonBreakingSchemaUpdatesBehaviorEnum.DISABLE_CONNECTION;
                prefix = "expedita";
                schedule = new ConnectionSchedule(ScheduleTypeEnum.MANUAL) {{
                    cronExpression = "repellat";
                }};;
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
                .setSecurity(new Security("sed") {{
                    bearerAuth = "";
                }})
                .build();

            DeleteConnectionRequest req = new DeleteConnectionRequest("saepe");            

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
                .setSecurity(new Security("pariatur") {{
                    bearerAuth = "";
                }})
                .build();

            GetConnectionRequest req = new GetConnectionRequest("accusantium");            

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
                .setSecurity(new Security("consequuntur") {{
                    bearerAuth = "";
                }})
                .build();

            ListConnectionsRequest req = new ListConnectionsRequest() {{
                includeDeleted = false;
                limit = 508315;
                offset = 615560;
                workspaceIds = new String[]{{
                    add("1cddc692-601f-4b57-ab0d-5f0d30c5fbb2"),
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
                .setSecurity(new Security("quis") {{
                    bearerAuth = "";
                }})
                .build();

            PatchConnectionRequest req = new PatchConnectionRequest(                new ConnectionPatchRequest() {{
                                configurations = new StreamConfigurations() {{
                                    streams = new com.airbyte.api.models.shared.StreamConfiguration[]{{
                                        add(new StreamConfiguration("facilis") {{
                                            cursorField = new String[]{{
                                                add("eaque"),
                                                add("quis"),
                                            }};
                                            name = "Ruby Auer";
                                            primaryKey = new String[][]{{
                                                add(new String[]{{
                                                    add("vero"),
                                                }}),
                                                add(new String[]{{
                                                    add("hic"),
                                                    add("recusandae"),
                                                }}),
                                            }};
                                            syncMode = ConnectionSyncModeEnum.INCREMENTAL_APPEND;
                                        }}),
                                        add(new StreamConfiguration("pariatur") {{
                                            cursorField = new String[]{{
                                                add("voluptatem"),
                                                add("porro"),
                                                add("consequuntur"),
                                            }};
                                            name = "Jeremiah Beatty";
                                            primaryKey = new String[][]{{
                                                add(new String[]{{
                                                    add("earum"),
                                                    add("modi"),
                                                    add("iste"),
                                                    add("dolorum"),
                                                }}),
                                            }};
                                            syncMode = ConnectionSyncModeEnum.INCREMENTAL_APPEND;
                                        }}),
                                        add(new StreamConfiguration("excepturi") {{
                                            cursorField = new String[]{{
                                                add("nobis"),
                                                add("libero"),
                                                add("delectus"),
                                            }};
                                            name = "Billie Jacobi";
                                            primaryKey = new String[][]{{
                                                add(new String[]{{
                                                    add("ipsum"),
                                                }}),
                                            }};
                                            syncMode = ConnectionSyncModeEnum.INCREMENTAL_DEDUPED_HISTORY;
                                        }}),
                                    }};
                                }};;
                                dataResidency = GeographyEnumNoDefault.EU;
                                name = "Marian Wisozk";
                                namespaceDefinition = NamespaceDefinitionEnumNoDefault.SOURCE;
                                namespaceFormat = "${SOURCE_NAMESPACE}";
                                nonBreakingSchemaUpdatesBehavior = NonBreakingSchemaUpdatesBehaviorEnumNoDefault.IGNORE;
                                prefix = "ipsa";
                                schedule = new ConnectionSchedule(ScheduleTypeEnum.MANUAL) {{
                                    cronExpression = "iure";
                                }};;
                                status = ConnectionStatusEnum.INACTIVE;
                            }};, "quaerat");            

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


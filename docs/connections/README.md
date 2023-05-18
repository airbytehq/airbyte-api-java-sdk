# connections

### Available Operations

* [createConnection](#createconnection) - Create a connection
* [deleteConnection](#deleteconnection) - Delete a Connection
* [getConnection](#getconnection) - Get Connection details
* [listConnections](#listconnections) - List connections

## createConnection

Create a connection

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateConnectionResponse;
import com.airbyte.api.models.shared.ConnectionCreateRequest;
import com.airbyte.api.models.shared.ConnectionScheduleCreate;
import com.airbyte.api.models.shared.ConnectionSyncModeEnumEnum;
import com.airbyte.api.models.shared.GeographyEnumEnum;
import com.airbyte.api.models.shared.NamespaceDefinitionEnumEnum;
import com.airbyte.api.models.shared.NonBreakingSchemaUpdatesBehaviorEnumEnum;
import com.airbyte.api.models.shared.ScheduleTypeEnumEnum;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.models.shared.StreamConfiguration;
import com.airbyte.api.models.shared.StreamConfigurations;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security("possimus") {{
                    bearerAuth = "YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            com.airbyte.api.models.shared.ConnectionCreateRequest req = new ConnectionCreateRequest("019da1ff-e78f-4097-b007-4f15471b5e6e", "13b99d48-8e1e-491e-850a-d2abd4426980") {{
                configurations = new StreamConfigurations() {{
                    streams = new com.airbyte.api.models.shared.StreamConfiguration[]{{
                        add(new StreamConfiguration("rerum") {{
                            cursorField = new String[]{{
                                add("ipsam"),
                                add("alias"),
                                add("fugit"),
                                add("dolorum"),
                            }};
                            name = "Eddie Prosacco";
                            primaryKey = new String[][]{{
                                add(new String[]{{
                                    add("non"),
                                    add("eligendi"),
                                }}),
                                add(new String[]{{
                                    add("aliquid"),
                                    add("provident"),
                                    add("necessitatibus"),
                                }}),
                                add(new String[]{{
                                    add("officia"),
                                    add("dolor"),
                                    add("debitis"),
                                }}),
                                add(new String[]{{
                                    add("dolorum"),
                                    add("in"),
                                    add("in"),
                                    add("illum"),
                                }}),
                            }};
                            syncMode = ConnectionSyncModeEnumEnum.INCREMENTAL_DEDUPED_HISTORY;
                        }}),
                    }};
                }};;
                dataResidency = GeographyEnumEnum.AUTO;
                name = "Blanca Schulist";
                namespaceDefinition = NamespaceDefinitionEnumEnum.CUSTOM_FORMAT;
                namespaceFormat = "${SOURCE_NAMESPACE}";
                nonBreakingSchemaUpdatesBehavior = NonBreakingSchemaUpdatesBehaviorEnumEnum.DISABLE_CONNECTION;
                prefix = "non";
                schedule = new ConnectionScheduleCreate(ScheduleTypeEnumEnum.CRON) {{
                    cronExpression = "enim";
                }};;
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
                .setSecurity(new Security("accusamus") {{
                    bearerAuth = "YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            DeleteConnectionRequest req = new DeleteConnectionRequest("delectus");            

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
                .setSecurity(new Security("quidem") {{
                    bearerAuth = "YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            GetConnectionRequest req = new GetConnectionRequest("provident");            

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
                .setSecurity(new Security("nam") {{
                    bearerAuth = "YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            ListConnectionsRequest req = new ListConnectionsRequest() {{
                includeDeleted = false;
                limit = 659669;
                offset = 501324;
                workspaceIds = new String[]{{
                    add("f3a66997-074b-4a44-a9b6-e2141959890a"),
                    add("fa563e25-16fe-44c8-b711-e5b7fd2ed028"),
                    add("921cddc6-9260-41fb-976b-0d5f0d30c5fb"),
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

<!-- Start SDK Example Usage -->


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
                    basicAuth = new SchemeBasicAuth("corrupti", "provident") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            com.airbyte.api.models.shared.ConnectionCreateRequest req = new ConnectionCreateRequest("bd9d8d69-a674-4e0f-867c-c8796ed151a0", "5dfc2ddf-7cc7-48ca-9ba9-28fc816742cb") {{
                configurations = new StreamConfigurations() {{
                    streams = new com.airbyte.api.models.shared.StreamConfiguration[]{{
                        add(new StreamConfiguration("dolor") {{
                            cursorField = new String[]{{
                                add("esse"),
                            }};
                            name = "Mrs. Miriam Collier";
                            primaryKey = new String[][]{{
                                add(new String[]{{
                                    add("sed"),
                                }}),
                            }};
                            syncMode = ConnectionSyncModeEnum.INCREMENTAL_APPEND;
                        }}),
                    }};
                }};;
                dataResidency = GeographyEnum.US;
                name = "May Turcotte";
                namespaceDefinition = NamespaceDefinitionEnum.DESTINATION;
                namespaceFormat = "${SOURCE_NAMESPACE}";
                nonBreakingSchemaUpdatesBehavior = NonBreakingSchemaUpdatesBehaviorEnum.PROPAGATE_COLUMNS;
                prefix = "iure";
                schedule = new ConnectionSchedule(ScheduleTypeEnum.CRON) {{
                    cronExpression = "quidem";
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
<!-- End SDK Example Usage -->
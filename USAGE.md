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
<!-- End SDK Example Usage -->
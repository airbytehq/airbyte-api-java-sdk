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
<!-- End SDK Example Usage -->
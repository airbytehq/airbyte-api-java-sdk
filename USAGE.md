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
                .setSecurity(new Security("corrupti") {{
                    bearerAuth = "";
                }})
                .build();

            com.airbyte.api.models.shared.ConnectionCreateRequest req = new ConnectionCreateRequest("9bd9d8d6-9a67-44e0-b467-cc8796ed151a", "05dfc2dd-f7cc-478c-a1ba-928fc816742c") {{
                configurations = new StreamConfigurations() {{
                    streams = new com.airbyte.api.models.shared.StreamConfiguration[]{{
                        add(new StreamConfiguration("saepe") {{
                            cursorField = new String[]{{
                                add("ipsum"),
                                add("excepturi"),
                            }};
                            name = "Dorothy Hane";
                            primaryKey = new String[][]{{
                                add(new String[]{{
                                    add("natus"),
                                }}),
                                add(new String[]{{
                                    add("hic"),
                                    add("saepe"),
                                }}),
                                add(new String[]{{
                                    add("in"),
                                    add("corporis"),
                                    add("iste"),
                                }}),
                            }};
                            syncMode = ConnectionSyncModeEnum.FULL_REFRESH_APPEND;
                        }}),
                        add(new StreamConfiguration("excepturi") {{
                            cursorField = new String[]{{
                                add("architecto"),
                                add("ipsa"),
                                add("reiciendis"),
                            }};
                            name = "Shaun Osinski";
                            primaryKey = new String[][]{{
                                add(new String[]{{
                                    add("nobis"),
                                }}),
                                add(new String[]{{
                                    add("omnis"),
                                    add("nemo"),
                                }}),
                            }};
                            syncMode = ConnectionSyncModeEnum.FULL_REFRESH_APPEND;
                        }}),
                        add(new StreamConfiguration("quia") {{
                            cursorField = new String[]{{
                                add("iure"),
                            }};
                            name = "Miss Aubrey Williamson";
                            primaryKey = new String[][]{{
                                add(new String[]{{
                                    add("repellat"),
                                }}),
                                add(new String[]{{
                                    add("occaecati"),
                                    add("numquam"),
                                    add("commodi"),
                                }}),
                                add(new String[]{{
                                    add("molestiae"),
                                    add("velit"),
                                }}),
                            }};
                            syncMode = ConnectionSyncModeEnum.INCREMENTAL_APPEND;
                        }}),
                    }};
                }};;
                dataResidency = GeographyEnum.US;
                name = "Kayla O'Kon";
                namespaceDefinition = NamespaceDefinitionEnum.CUSTOM_FORMAT;
                namespaceFormat = "${SOURCE_NAMESPACE}";
                nonBreakingSchemaUpdatesBehavior = NonBreakingSchemaUpdatesBehaviorEnum.IGNORE;
                prefix = "tenetur";
                schedule = new ConnectionSchedule(ScheduleTypeEnum.MANUAL) {{
                    cronExpression = "id";
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
<!-- End SDK Example Usage -->
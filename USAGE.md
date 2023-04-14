<!-- Start SDK Example Usage -->
```java
package hello.world;

import airbyte_prod.api.Airbyte;

import airbyte_prod.api.models.operations.CreateConnectionResponse;
import airbyte_prod.api.models.shared.ConnectionCreateRequestNamespaceDefinitionEnum;
import airbyte_prod.api.models.shared.ConnectionCreateRequest;
import airbyte_prod.api.models.shared.ConnectionScheduleCreate;
import airbyte_prod.api.models.shared.ScheduleTypeEnumEnum;
import airbyte_prod.api.models.shared.GeographyEnumEnum;
import airbyte_prod.api.models.shared.StreamConfigurations;
import airbyte_prod.api.models.shared.StreamConfiguration;
import airbyte_prod.api.models.shared.ConnectionSyncModeEnumEnum;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .build();

            airbyte_prod.api.models.shared.ConnectionCreateRequest req = new ConnectionCreateRequest() {{
                configurations = new StreamConfigurations() {{
                    streams = new airbyte_prod.api.models.shared.StreamConfiguration[]{{
                        add(new StreamConfiguration() {{
                            cursorField = new String[]{{
                                add("distinctio"),
                                add("quibusdam"),
                                add("unde"),
                            }};
                            name = "Johnnie Stamm";
                            primaryKey = new String[][]{{
                                add(new String[]{{
                                    add("iure"),
                                    add("magnam"),
                                }}),
                                add(new String[]{{
                                    add("ipsa"),
                                    add("delectus"),
                                    add("tempora"),
                                    add("suscipit"),
                                }}),
                                add(new String[]{{
                                    add("minus"),
                                    add("placeat"),
                                }}),
                            }};
                            syncMode = "incremental_append";
                        }}),
                        add(new StreamConfiguration() {{
                            cursorField = new String[]{{
                                add("excepturi"),
                                add("nisi"),
                            }};
                            name = "Jake Bernier MD";
                            primaryKey = new String[][]{{
                                add(new String[]{{
                                    add("repellendus"),
                                    add("sapiente"),
                                }}),
                            }};
                            syncMode = "incremental_deduped_history";
                        }}),
                        add(new StreamConfiguration() {{
                            cursorField = new String[]{{
                                add("at"),
                            }};
                            name = "Emilio Krajcik";
                            primaryKey = new String[][]{{
                                add(new String[]{{
                                    add("porro"),
                                    add("dolorum"),
                                    add("dicta"),
                                }}),
                                add(new String[]{{
                                    add("officia"),
                                    add("occaecati"),
                                    add("fugit"),
                                }}),
                            }};
                            syncMode = "incremental_append";
                        }}),
                    }};
                }};
                dataResidency = "eu";
                destinationId = "c816742c-b739-4205-9293-96fea7596eb1";
                name = "Lela Orn";
                namespaceDefinition = "source";
                namespaceFormat = "${SOURCE_NAMESPACE}";
                prefix = "dolorem";
                schedule = new ConnectionScheduleCreate() {{
                    cronExpression = "corporis";
                    scheduleType = "manual";
                }};
                sourceId = "c5955907-aff1-4a3a-afa9-467739251aa5";
            }}            

            CreateConnectionResponse res = sdk.connections.createConnection(req);

            if (res.connectionResponse.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->
<!-- Start SDK Example Usage -->
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.models.operations.CreateConnectionResponse;
import com.airbyte.api.models.shared.ConnectionCreateRequestNamespaceDefinitionEnum;
import com.airbyte.api.models.shared.ConnectionCreateRequest;
import com.airbyte.api.models.shared.ConnectionScheduleCreate;
import com.airbyte.api.models.shared.ScheduleTypeEnumEnum;
import com.airbyte.api.models.shared.GeographyEnumEnum;
import com.airbyte.api.models.shared.StreamConfigurations;
import com.airbyte.api.models.shared.StreamConfiguration;
import com.airbyte.api.models.shared.ConnectionSyncModeEnumEnum;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security("corrupti") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            com.airbyte.api.models.shared.ConnectionCreateRequest req = new ConnectionCreateRequest("9bd9d8d6-9a67-44e0-b467-cc8796ed151a", "05dfc2dd-f7cc-478c-a1ba-928fc816742c") {{
                dataResidency = "us";
                name = "Kayla O'Kon";
                namespaceDefinition = "custom_format";
                namespaceFormat = "${SOURCE_NAMESPACE}";
                prefix = "sequi";
            }};            

            CreateConnectionResponse res = sdk.connections.createConnection(req);

            if (res.connectionResponse.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->
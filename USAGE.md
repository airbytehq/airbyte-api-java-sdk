<!-- Start SDK Example Usage -->
```java
package hello.world;

import airbyte_prod.api.Airbyte;
import airbyte_prod.api.models.shared.Security;
import airbyte_prod.api.models.operations.CreateConnectionResponse;
import airbyte_prod.api.models.shared.ConnectionCreateRequest;
import airbyte_prod.api.models.shared.ConnectionScheduleCreate;
import airbyte_prod.api.models.shared.ScheduleTypeEnumEnum;
import airbyte_prod.api.models.shared.GeographyEnumEnum;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security() {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            airbyte_prod.api.models.shared.ConnectionCreateRequest req = new ConnectionCreateRequest() {{
                destinationId = "89bd9d8d-69a6-474e-8f46-7cc8796ed151";
                geography = "us";
                name = "perferendis";
                schedule = new ConnectionScheduleCreate() {{
                    cronExpression = "ipsam";
                    scheduleType = "cron";
                }};
                sourceId = "fc2ddf7c-c78c-4a1b-a928-fc816742cb73";
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
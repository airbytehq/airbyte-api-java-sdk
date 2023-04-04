<!-- Start SDK Example Usage -->
```java
package hello.world;

import airbyte_prod.public_api.Airbyte;
import airbyte_prod.public_api.models.shared.Security;
import airbyte_prod.public_api.models.operations.CreateConnectionResponse;
import airbyte_prod.public_api.models.shared.ConnectionCreate;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security() {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            airbyte_prod.public_api.models.shared.ConnectionCreate req = new ConnectionCreate() {{
                destinationId = "89bd9d8d-69a6-474e-8f46-7cc8796ed151";
                name = "deserunt";
                sourceId = "05dfc2dd-f7cc-478c-a1ba-928fc816742c";
            }}            

            CreateConnectionResponse res = sdk.connections.createConnection(req);

            if (res.connectionId.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->
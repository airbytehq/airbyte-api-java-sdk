<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateConnectionResponse;
import com.airbyte.api.models.shared.ConnectionCreateRequest;
import com.airbyte.api.models.shared.SchemeBasicAuth;
import com.airbyte.api.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Airbyte sdk = Airbyte.builder()
                .security(Security.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .password("")
                        .username("")
                        .build())
                    .build())
            .build();

        ConnectionCreateRequest req = ConnectionCreateRequest.builder()
                .destinationId("e478de0d-a3a0-475c-b019-25f7dd29e281")
                .sourceId("95e66a59-8045-4307-9678-63bc3c9b8c93")
                .name("Postgres-to-Bigquery")
                .build();

        CreateConnectionResponse res = sdk.connections().createConnection()
                .request(req)
                .call();

        if (res.connectionResponse().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->
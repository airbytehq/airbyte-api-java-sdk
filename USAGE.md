<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.operations.CreateConnectionResponse;
import com.airbyte.api.models.shared.*;
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
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .security(Security.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .password("")
                        .username("")
                        .build())
                    .build())
                .build();

            ConnectionCreateRequest req = ConnectionCreateRequest.builder()
                .destinationId("c669dd1e-3620-483e-afc8-55914e0a570f")
                .sourceId("6dd427d8-3a55-4584-b835-842325b6c7b3")
                .configurations(StreamConfigurations.builder()
                    .streams(java.util.List.of(
                        StreamConfiguration.builder()
                            .name("<value>")
                            .build()))
                    .build())
                .dataResidency(GeographyEnum.EU)
                .name("<value>")
                .namespaceDefinition(NamespaceDefinitionEnum.CUSTOM_FORMAT)
                .namespaceFormat("${SOURCE_NAMESPACE}")
                .nonBreakingSchemaUpdatesBehavior(NonBreakingSchemaUpdatesBehaviorEnum.IGNORE)
                .prefix("<value>")
                .schedule(ConnectionSchedule.builder()
                    .scheduleType(ScheduleTypeEnum.CRON)
                    .cronExpression("<value>")
                    .build())
                .status(ConnectionStatusEnum.DEPRECATED)
                .build();

            CreateConnectionResponse res = sdk.connections().createConnection()
                .request(req)
                .call();

            if (res.connectionResponse().isPresent()) {
                // handle response
            }
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->
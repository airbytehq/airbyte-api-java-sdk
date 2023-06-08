# streams

### Available Operations

* [getStreamProperties](#getstreamproperties) - Get stream properties

## getStreamProperties

Get stream properties

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.GetStreamPropertiesRequest;
import com.airbyte.api.models.operations.GetStreamPropertiesResponse;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security("facere") {{
                    bearerAuth = "";
                }})
                .build();

            GetStreamPropertiesRequest req = new GetStreamPropertiesRequest("veritatis", "consequuntur") {{
                ignoreCache = false;
            }};            

            GetStreamPropertiesResponse res = sdk.streams.getStreamProperties(req);

            if (res.streamPropertiesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

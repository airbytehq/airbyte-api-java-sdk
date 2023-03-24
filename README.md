# public-api

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'airbyte_prod.public_api:public-api:1.0.0'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```java
package hello.world;

import airbyte_prod.public_api.SDK;
import airbyte_prod.public_api.models.shared.Security;
import airbyte_prod.public_api.models.operations.CreateConnectionRequest;
import airbyte_prod.public_api.models.operations.CreateConnectionResponse;
import airbyte_prod.public_api.models.shared.ConnectionCreate;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    bearerAuth = new SchemeBearerAuth() {{
                        authorization = "Bearer YOUR_BEARER_TOKEN_HERE";
                    }};
                }})
                .build();

            CreateConnectionRequest req = new CreateConnectionRequest() {{
                request = new ConnectionCreate() {{
                    destinationId = "89bd9d8d-69a6-474e-8f46-7cc8796ed151";
                    name = "est";
                    sourceId = "05dfc2dd-f7cc-478c-a1ba-928fc816742c";
                }};
            }};            

            CreateConnectionResponse res = sdk.connections.createConnection(req);

            if (res.connectionId.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## SDK Available Operations


### connections

* `createConnection` - Create a connection

### destinations

* `createDestination` - Create a destination

### jobs

* `cancelJob` - Cancel a running Job
* `createJob` - Trigger a sync or reset job of a connection
* `getJob` - Get Job status and details
* `listJobs` - List Jobs by sync type

### sources

* `createSource` - Create a source
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage 
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally 
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. 
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)

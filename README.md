<div align="center">
    <picture>
        <img src="https://user-images.githubusercontent.com/68016351/222853569-b35cc448-6481-4cf2-a237-bd5da47e94fd.png" width="500">
    </picture>
   <p>Programatically control Airbyte Cloud through an API.</p>
   <a href="https://reference.airbyte.com/reference/start"><img src="https://img.shields.io/static/v1?label=Docs&message=API Ref&color=000000&style=for-the-badge" /></a>
   <a href="https://github.com/airbytehq/airbyte-api-java-sdk/actions"><img src="https://img.shields.io/github/actions/workflow/status/airbytehq/airbyte-api-java-sdk/speakeasy_sdk_generation.yml?style=for-the-badge" /></a>
  <a href="https://opensource.org/licenses/MIT"><img src="https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge" /></a>
  <a href="https://github.com/airbytehq/airbyte-api-java-sdk/releases"><img src="https://img.shields.io/github/v/release/airbytehq/airbyte-api-java-sdk?sort=semver&style=for-the-badge" /></a>
</div>

## Authentication

Developers will need to create an API Key within your [Developer Portal](https://portal.airbyte.com/) to make API requests. You can use your existing Airbyte account to log in to the Developer Portal. Once you are in the Developer Portal, use the API Keys tab to create or remove API Keys. You can see a [walkthrough demo here](https://www.loom.com/share/7997a7c67cd642cc8d1c72ef0dfcc4bc)🎦

The Developer Portal UI can also be used to help build your integration by showing information about network requests in the Requests tab. API usage information is also available to you in the Usage tab.

***(Installation will not work until published to a package manager, please clone locally and run `maven install` to try out the artifact locally)***

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'airbyte_prod.api:public-api:1.2.0'
```
<!-- End SDK Installation -->

## SDK Example Usage
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
                name = "Roberta Sipes";
                schedule = new ConnectionScheduleCreate() {{
                    cronExpression = "odit";
                    scheduleType = "cron";
                }};
                sourceId = "df7cc78c-a1ba-4928-bc81-6742cb739205";
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

<!-- Start SDK Available Operations -->
## Available Resources and Operations


### connections

* `createConnection` - Create a connection
* `getConnection` - Get Connection details
* `listConnections` - List connections

### destinations

* `createDestination` - Create a destination
* `getDestination` - Get Destination details
* `listDestinations` - List destinations

### jobs

* `cancelJob` - Cancel a running Job
* `createJob` - Trigger a sync or reset job of a connection
* `getJob` - Get Job status and details
* `listJobs` - List Jobs by sync type

### sources

* `createSource` - Create a source
* `getSource` - Get Source details
* `listSources` - List sources

### workspaces

* `createWorkspace` - Create a workspace
* `getWorkspace` - Get Workspace details
* `listWorkspaces` - List workspaces
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage 
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally 
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. 
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)

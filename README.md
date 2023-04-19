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
implementation 'com.airbyte.api:public-api:0.0.2'
```
<!-- End SDK Installation -->

## SDK Example Usage
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
                .setSecurity(new Security() {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            com.airbyte.api.models.shared.ConnectionCreateRequest req = new ConnectionCreateRequest() {{
                configurations = new StreamConfigurations() {{
                    streams = new com.airbyte.api.models.shared.StreamConfiguration[]{{
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

<!-- Start SDK Available Operations -->
## Available Resources and Operations


### connections

* `createConnection` - Create a connection
* `deleteConnection` - Delete a Connection
* `getConnection` - Get Connection details
* `listConnections` - List connections

### destinations

* `createDestination` - Create a destination
* `deleteDestination` - Delete a Destination
* `getDestination` - Get Destination details
* `listDestinations` - List destinations

### jobs

* `cancelJob` - Cancel a running Job
* `createJob` - Trigger a sync or reset job of a connection
* `getJob` - Get Job status and details
* `listJobs` - List Jobs by sync type

### sources

* `createSource` - Create a source
* `deleteSource` - Delete a Source
* `getSource` - Get Source details
* `initiateOAuth` - Initiate OAuth for a source.
* `listSources` - List sources

### streams

* `getStreamProperties` - Get stream properties

### workspaces

* `createWorkspace` - Create a workspace
* `deleteWorkspace` - Delete a Workspace
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

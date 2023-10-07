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

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'com.airbyte.api:public-api:0.42.2'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateConnectionResponse;
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

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security(){{
                    basicAuth = new SchemeBasicAuth("violet", "Account"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            com.airbyte.api.models.shared.ConnectionCreateRequest req = new ConnectionCreateRequest("d1e36208-3eaf-4c85-9914-e0a570f6dd42", "7d83a555-8478-4358-8232-5b6c7b3fd2fd"){{
                configurations = new StreamConfigurations(){{
                    streams = new com.airbyte.api.models.shared.StreamConfiguration[]{{
                        add(new StreamConfiguration("state"){{
                            cursorField = new String[]{{
                                add("Ergonomic"),
                            }};
                            name = "Hyundai West";
                            primaryKey = new String[][]{{
                                add(new String[]{{
                                    add("tesla"),
                                }}),
                            }};
                        }}),
                    }};
                }};
                dataResidency = GeographyEnum.US;
                name = "sans contingency models";
                namespaceDefinition = NamespaceDefinitionEnum.DESTINATION;
                namespaceFormat = "${SOURCE_NAMESPACE}";
                nonBreakingSchemaUpdatesBehavior = NonBreakingSchemaUpdatesBehaviorEnum.IGNORE;
                prefix = "olive Reggae Sweden";
                schedule = new ConnectionSchedule(ScheduleTypeEnum.CRON){{
                    cronExpression = "Rupee";
                }};
                status = ConnectionStatusEnum.INACTIVE;
            }};            

            CreateConnectionResponse res = sdk.connections.createConnection(req);

            if (res.connectionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## Available Resources and Operations


### [connections](docs/sdks/connections/README.md)

* [createConnection](docs/sdks/connections/README.md#createconnection) - Create a connection
* [deleteConnection](docs/sdks/connections/README.md#deleteconnection) - Delete a Connection
* [getConnection](docs/sdks/connections/README.md#getconnection) - Get Connection details
* [listConnections](docs/sdks/connections/README.md#listconnections) - List connections
* [patchConnection](docs/sdks/connections/README.md#patchconnection) - Update Connection details

### [destinations](docs/sdks/destinations/README.md)

* [createDestination](docs/sdks/destinations/README.md#createdestination) - Create a destination
* [deleteDestination](docs/sdks/destinations/README.md#deletedestination) - Delete a Destination
* [getDestination](docs/sdks/destinations/README.md#getdestination) - Get Destination details
* [listDestinations](docs/sdks/destinations/README.md#listdestinations) - List destinations
* [patchDestination](docs/sdks/destinations/README.md#patchdestination) - Update a Destination
* [putDestination](docs/sdks/destinations/README.md#putdestination) - Update a Destination and fully overwrite it

### [jobs](docs/sdks/jobs/README.md)

* [cancelJob](docs/sdks/jobs/README.md#canceljob) - Cancel a running Job
* [createJob](docs/sdks/jobs/README.md#createjob) - Trigger a sync or reset job of a connection
* [getJob](docs/sdks/jobs/README.md#getjob) - Get Job status and details
* [listJobs](docs/sdks/jobs/README.md#listjobs) - List Jobs by sync type

### [sources](docs/sdks/sources/README.md)

* [createSource](docs/sdks/sources/README.md#createsource) - Create a source
* [deleteSource](docs/sdks/sources/README.md#deletesource) - Delete a Source
* [getSource](docs/sdks/sources/README.md#getsource) - Get Source details
* [initiateOAuth](docs/sdks/sources/README.md#initiateoauth) - Initiate OAuth for a source
* [listSources](docs/sdks/sources/README.md#listsources) - List sources
* [patchSource](docs/sdks/sources/README.md#patchsource) - Update a Source
* [putSource](docs/sdks/sources/README.md#putsource) - Update a Source and fully overwrite it

### [streams](docs/sdks/streams/README.md)

* [getStreamProperties](docs/sdks/streams/README.md#getstreamproperties) - Get stream properties

### [workspaces](docs/sdks/workspaces/README.md)

* [createOrUpdateWorkspaceOAuthCredentials](docs/sdks/workspaces/README.md#createorupdateworkspaceoauthcredentials) - Create OAuth override credentials for a workspace and source type.
* [createWorkspace](docs/sdks/workspaces/README.md#createworkspace) - Create a workspace
* [deleteWorkspace](docs/sdks/workspaces/README.md#deleteworkspace) - Delete a Workspace
* [getWorkspace](docs/sdks/workspaces/README.md#getworkspace) - Get Workspace details
* [listWorkspaces](docs/sdks/workspaces/README.md#listworkspaces) - List workspaces
* [updateWorkspace](docs/sdks/workspaces/README.md#updateworkspace) - Update a workspace
<!-- End SDK Available Operations -->



<!-- Start Dev Containers -->

<!-- End Dev Containers -->

<!-- Placeholder for Future Speakeasy SDK Sections -->



### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage 
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally 
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. 
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)

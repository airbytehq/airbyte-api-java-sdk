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

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'com.airbyte.api:public-api:1.1.0'
```

Maven:
```xml
<dependency>
    <groupId>com.airbyte.api</groupId>
    <artifactId>public-api</artifactId>
    <version>1.1.0</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
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
                .namespaceFormat("${SOURCE_NAMESPACE}")
                .build();

            CreateConnectionResponse res = sdk.publicConnections().createConnection()
                .request(req)
                .call();

            if (res.connectionResponse().isPresent()) {
                // handle response
            }
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

### [publicConnections()](docs/sdks/publicconnections/README.md)

* [createConnection](docs/sdks/publicconnections/README.md#createconnection) - Create a connection
* [deleteConnection](docs/sdks/publicconnections/README.md#deleteconnection) - Delete a Connection
* [getConnection](docs/sdks/publicconnections/README.md#getconnection) - Get Connection details
* [listConnections](docs/sdks/publicconnections/README.md#listconnections) - List connections
* [patchConnection](docs/sdks/publicconnections/README.md#patchconnection) - Update Connection details

### [public_()](docs/sdks/public/README.md)

* [cancelJob](docs/sdks/public/README.md#canceljob) - Cancel a running Job
* [createConnection](docs/sdks/public/README.md#createconnection) - Create a connection
* [createDestination](docs/sdks/public/README.md#createdestination) - Create a destination
* [createJob](docs/sdks/public/README.md#createjob) - Trigger a sync or reset job of a connection
* [createOrUpdateWorkspaceOAuthCredentials](docs/sdks/public/README.md#createorupdateworkspaceoauthcredentials) - Create OAuth override credentials for a workspace and source type.
* [createSource](docs/sdks/public/README.md#createsource) - Create a source
* [createWorkspace](docs/sdks/public/README.md#createworkspace) - Create a workspace
* [deleteConnection](docs/sdks/public/README.md#deleteconnection) - Delete a Connection
* [deleteDestination](docs/sdks/public/README.md#deletedestination) - Delete a Destination
* [deleteSource](docs/sdks/public/README.md#deletesource) - Delete a Source
* [deleteWorkspace](docs/sdks/public/README.md#deleteworkspace) - Delete a Workspace
* [getConnection](docs/sdks/public/README.md#getconnection) - Get Connection details
* [getDestination](docs/sdks/public/README.md#getdestination) - Get Destination details
* [getJob](docs/sdks/public/README.md#getjob) - Get Job status and details
* [getSource](docs/sdks/public/README.md#getsource) - Get Source details
* [getStreamProperties](docs/sdks/public/README.md#getstreamproperties) - Get stream properties
* [getWorkspace](docs/sdks/public/README.md#getworkspace) - Get Workspace details
* [initiateOAuth](docs/sdks/public/README.md#initiateoauth) - Initiate OAuth for a source
* [listConnections](docs/sdks/public/README.md#listconnections) - List connections
* [listDestinations](docs/sdks/public/README.md#listdestinations) - List destinations
* [listJobs](docs/sdks/public/README.md#listjobs) - List Jobs by sync type
* [listSources](docs/sdks/public/README.md#listsources) - List sources
* [listWorkspaces](docs/sdks/public/README.md#listworkspaces) - List workspaces
* [patchConnection](docs/sdks/public/README.md#patchconnection) - Update Connection details
* [patchDestination](docs/sdks/public/README.md#patchdestination) - Update a Destination
* [patchSource](docs/sdks/public/README.md#patchsource) - Update a Source
* [putDestination](docs/sdks/public/README.md#putdestination) - Update a Destination and fully overwrite it
* [putSource](docs/sdks/public/README.md#putsource) - Update a Source and fully overwrite it
* [updateWorkspace](docs/sdks/public/README.md#updateworkspace) - Update a workspace

### [connections()](docs/sdks/connections/README.md)

* [createConnection](docs/sdks/connections/README.md#createconnection) - Create a connection
* [deleteConnection](docs/sdks/connections/README.md#deleteconnection) - Delete a Connection
* [getConnection](docs/sdks/connections/README.md#getconnection) - Get Connection details
* [listConnections](docs/sdks/connections/README.md#listconnections) - List connections
* [patchConnection](docs/sdks/connections/README.md#patchconnection) - Update Connection details

### [publicDestinations()](docs/sdks/publicdestinations/README.md)

* [createDestination](docs/sdks/publicdestinations/README.md#createdestination) - Create a destination
* [deleteDestination](docs/sdks/publicdestinations/README.md#deletedestination) - Delete a Destination
* [getDestination](docs/sdks/publicdestinations/README.md#getdestination) - Get Destination details
* [listDestinations](docs/sdks/publicdestinations/README.md#listdestinations) - List destinations
* [patchDestination](docs/sdks/publicdestinations/README.md#patchdestination) - Update a Destination
* [putDestination](docs/sdks/publicdestinations/README.md#putdestination) - Update a Destination and fully overwrite it

### [destinations()](docs/sdks/destinations/README.md)

* [createDestination](docs/sdks/destinations/README.md#createdestination) - Create a destination
* [deleteDestination](docs/sdks/destinations/README.md#deletedestination) - Delete a Destination
* [getDestination](docs/sdks/destinations/README.md#getdestination) - Get Destination details
* [listDestinations](docs/sdks/destinations/README.md#listdestinations) - List destinations
* [patchDestination](docs/sdks/destinations/README.md#patchdestination) - Update a Destination
* [putDestination](docs/sdks/destinations/README.md#putdestination) - Update a Destination and fully overwrite it

### [publicJobs()](docs/sdks/publicjobs/README.md)

* [cancelJob](docs/sdks/publicjobs/README.md#canceljob) - Cancel a running Job
* [createJob](docs/sdks/publicjobs/README.md#createjob) - Trigger a sync or reset job of a connection
* [getJob](docs/sdks/publicjobs/README.md#getjob) - Get Job status and details
* [listJobs](docs/sdks/publicjobs/README.md#listjobs) - List Jobs by sync type

### [jobs()](docs/sdks/jobs/README.md)

* [cancelJob](docs/sdks/jobs/README.md#canceljob) - Cancel a running Job
* [createJob](docs/sdks/jobs/README.md#createjob) - Trigger a sync or reset job of a connection
* [getJob](docs/sdks/jobs/README.md#getjob) - Get Job status and details
* [listJobs](docs/sdks/jobs/README.md#listjobs) - List Jobs by sync type

### [publicSources()](docs/sdks/publicsources/README.md)

* [createSource](docs/sdks/publicsources/README.md#createsource) - Create a source
* [deleteSource](docs/sdks/publicsources/README.md#deletesource) - Delete a Source
* [getSource](docs/sdks/publicsources/README.md#getsource) - Get Source details
* [initiateOAuth](docs/sdks/publicsources/README.md#initiateoauth) - Initiate OAuth for a source
* [listSources](docs/sdks/publicsources/README.md#listsources) - List sources
* [patchSource](docs/sdks/publicsources/README.md#patchsource) - Update a Source
* [putSource](docs/sdks/publicsources/README.md#putsource) - Update a Source and fully overwrite it

### [sources()](docs/sdks/sources/README.md)

* [createSource](docs/sdks/sources/README.md#createsource) - Create a source
* [deleteSource](docs/sdks/sources/README.md#deletesource) - Delete a Source
* [getSource](docs/sdks/sources/README.md#getsource) - Get Source details
* [initiateOAuth](docs/sdks/sources/README.md#initiateoauth) - Initiate OAuth for a source
* [listSources](docs/sdks/sources/README.md#listsources) - List sources
* [patchSource](docs/sdks/sources/README.md#patchsource) - Update a Source
* [putSource](docs/sdks/sources/README.md#putsource) - Update a Source and fully overwrite it

### [publicStreams()](docs/sdks/publicstreams/README.md)

* [getStreamProperties](docs/sdks/publicstreams/README.md#getstreamproperties) - Get stream properties

### [streams()](docs/sdks/streams/README.md)

* [getStreamProperties](docs/sdks/streams/README.md#getstreamproperties) - Get stream properties

### [publicWorkspaces()](docs/sdks/publicworkspaces/README.md)

* [createOrUpdateWorkspaceOAuthCredentials](docs/sdks/publicworkspaces/README.md#createorupdateworkspaceoauthcredentials) - Create OAuth override credentials for a workspace and source type.
* [createWorkspace](docs/sdks/publicworkspaces/README.md#createworkspace) - Create a workspace
* [deleteWorkspace](docs/sdks/publicworkspaces/README.md#deleteworkspace) - Delete a Workspace
* [getWorkspace](docs/sdks/publicworkspaces/README.md#getworkspace) - Get Workspace details
* [listWorkspaces](docs/sdks/publicworkspaces/README.md#listworkspaces) - List workspaces
* [updateWorkspace](docs/sdks/publicworkspaces/README.md#updateworkspace) - Update a workspace

### [workspaces()](docs/sdks/workspaces/README.md)

* [createOrUpdateWorkspaceOAuthCredentials](docs/sdks/workspaces/README.md#createorupdateworkspaceoauthcredentials) - Create OAuth override credentials for a workspace and source type.
* [createWorkspace](docs/sdks/workspaces/README.md#createworkspace) - Create a workspace
* [deleteWorkspace](docs/sdks/workspaces/README.md#deleteworkspace) - Delete a Workspace
* [getWorkspace](docs/sdks/workspaces/README.md#getworkspace) - Get Workspace details
* [listWorkspaces](docs/sdks/workspaces/README.md#listworkspaces) - List workspaces
* [updateWorkspace](docs/sdks/workspaces/README.md#updateworkspace) - Update a workspace
<!-- End Available Resources and Operations [operations] -->



<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `serverIndex` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `https://api.airbyte.com/v1` | None |

#### Example

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Airbyte sdk = Airbyte.builder()
                .serverIndex(0)
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
                .namespaceFormat("${SOURCE_NAMESPACE}")
                .build();

            CreateConnectionResponse res = sdk.publicConnections().createConnection()
                .request(req)
                .call();

            if (res.connectionResponse().isPresent()) {
                // handle response
            }
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```


### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverURL` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Airbyte sdk = Airbyte.builder()
                .serverURL("https://api.airbyte.com/v1")
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
                .namespaceFormat("${SOURCE_NAMESPACE}")
                .build();

            CreateConnectionResponse res = sdk.publicConnections().createConnection()
                .request(req)
                .call();

            if (res.connectionResponse().isPresent()) {
                // handle response
            }
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations.  All operations return a response object or raise an error.  If Error objects are specified in your OpenAPI Spec, the SDK will throw the appropriate Exception type.

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

### Example

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
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
                .namespaceFormat("${SOURCE_NAMESPACE}")
                .build();

            CreateConnectionResponse res = sdk.publicConnections().createConnection()
                .request(req)
                .call();

            if (res.connectionResponse().isPresent()) {
                // handle response
            }
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```
<!-- End Error Handling [errors] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security schemes globally:

| Name                | Type                | Scheme              |
| ------------------- | ------------------- | ------------------- |
| `basicAuth`         | http                | HTTP Basic          |
| `bearerAuth`        | http                | HTTP Bearer         |
| `clientCredentials` | oauth2              | OAuth2 token        |

You can set the security parameters through the `security` builder method when initializing the SDK client instance. The selected scheme will be used by default to authenticate with the API for all operations that support it. For example:
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
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
                .namespaceFormat("${SOURCE_NAMESPACE}")
                .build();

            CreateConnectionResponse res = sdk.publicConnections().createConnection()
                .request(req)
                .call();

            if (res.connectionResponse().isPresent()) {
                // handle response
            }
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```
<!-- End Authentication [security] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->



### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage 
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally 
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. 
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)

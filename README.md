# public-api

Developer-friendly & type-safe Java SDK specifically catered to leverage *public-api* API.

<div align="left">
    <a href="https://www.speakeasy.com/?utm_source=public-api&utm_campaign=java"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://mit-license.org/">
        <img src="https://img.shields.io/badge/License-MIT-blue.svg" style="width: 100px; height: 28px;" />
    </a>
</div>

<!-- Start Summary [summary] -->
## Summary

airbyte-api: Programmatically control Airbyte Cloud, OSS & Enterprise.
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents
<!-- $toc-max-depth=2 -->
* [public-api](#public-api)
  * [SDK Installation](#sdk-installation)
  * [SDK Example Usage](#sdk-example-usage)
  * [Authentication](#authentication)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Error Handling](#error-handling)
  * [Server Selection](#server-selection)
* [Development](#development)
  * [Maturity](#maturity)
  * [Contributions](#contributions)

<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'com.airbyte:api:2.0.0'
```

Maven:
```xml
<dependency>
    <groupId>com.airbyte</groupId>
    <artifactId>api</artifactId>
    <version>2.0.0</version>
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

### Logging
A logging framework/facade has not yet been adopted but is under consideration.

For request and response logging (especially json bodies) use:
```java
SpeakeasyHTTPClient.setDebugLogging(true); // experimental API only (may change without warning)
```
Example output:
```
Sending request: http://localhost:35123/bearer#global GET
Request headers: {Accept=[application/json], Authorization=[******], Client-Level-Header=[added by client], Idempotency-Key=[some-key], x-speakeasy-user-agent=[speakeasy-sdk/java 0.0.1 internal 0.1.0 org.openapis.openapi]}
Received response: (GET http://localhost:35123/bearer#global) 200
Response headers: {access-control-allow-credentials=[true], access-control-allow-origin=[*], connection=[keep-alive], content-length=[50], content-type=[application/json], date=[Wed, 09 Apr 2025 01:43:29 GMT], server=[gunicorn/19.9.0]}
Response body:
{
  "authenticated": true, 
  "token": "global"
}
```
WARNING: This should only used for temporary debugging purposes. Leaving this option on in a production system could expose credentials/secrets in logs. <i>Authorization</i> headers are redacted by default and there is the ability to specify redacted header names via `SpeakeasyHTTPClient.setRedactedHeaders`.

Another option is to set the System property `-Djdk.httpclient.HttpClient.log=all`. However, this second option does not log bodies.
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateConnectionResponse;
import com.airbyte.api.models.shared.*;
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

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security schemes globally:

| Name                | Type   | Scheme       |
| ------------------- | ------ | ------------ |
| `basicAuth`         | http   | HTTP Basic   |
| `bearerAuth`        | http   | HTTP Bearer  |
| `clientCredentials` | oauth2 | OAuth2 token |

You can set the security parameters through the `security` builder method when initializing the SDK client instance. The selected scheme will be used by default to authenticate with the API for all operations that support it. For example:
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateConnectionResponse;
import com.airbyte.api.models.shared.*;
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
<!-- End Authentication [security] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>


### [connections()](docs/sdks/connections/README.md)

* [createConnection](docs/sdks/connections/README.md#createconnection) - Create a connection
* [deleteConnection](docs/sdks/connections/README.md#deleteconnection) - Delete a Connection
* [getConnection](docs/sdks/connections/README.md#getconnection) - Get Connection details
* [listConnections](docs/sdks/connections/README.md#listconnections) - List connections
* [patchConnection](docs/sdks/connections/README.md#patchconnection) - Update Connection details

### [declarativeSourceDefinitions()](docs/sdks/declarativesourcedefinitions/README.md)

* [createDeclarativeSourceDefinition](docs/sdks/declarativesourcedefinitions/README.md#createdeclarativesourcedefinition) - Create a declarative source definition.
* [deleteDeclarativeSourceDefinition](docs/sdks/declarativesourcedefinitions/README.md#deletedeclarativesourcedefinition) - Delete a declarative source definition.
* [getDeclarativeSourceDefinition](docs/sdks/declarativesourcedefinitions/README.md#getdeclarativesourcedefinition) - Get declarative source definition details.
* [listDeclarativeSourceDefinitions](docs/sdks/declarativesourcedefinitions/README.md#listdeclarativesourcedefinitions) - List declarative source definitions.
* [updateDeclarativeSourceDefinition](docs/sdks/declarativesourcedefinitions/README.md#updatedeclarativesourcedefinition) - Update declarative source definition details.

### [destinationDefinitions()](docs/sdks/destinationdefinitions/README.md)

* [createDestinationDefinition](docs/sdks/destinationdefinitions/README.md#createdestinationdefinition) - Create a destination definition.
* [deleteDestinationDefinition](docs/sdks/destinationdefinitions/README.md#deletedestinationdefinition) - Delete a destination definition.
* [getDestinationDefinition](docs/sdks/destinationdefinitions/README.md#getdestinationdefinition) - Get destination definition details.
* [listDestinationDefinitions](docs/sdks/destinationdefinitions/README.md#listdestinationdefinitions) - List destination definitions.
* [updateDestinationDefinition](docs/sdks/destinationdefinitions/README.md#updatedestinationdefinition) - Update destination definition details.

### [destinations()](docs/sdks/destinations/README.md)

* [createDestination](docs/sdks/destinations/README.md#createdestination) - Create a destination
* [deleteDestination](docs/sdks/destinations/README.md#deletedestination) - Delete a Destination
* [getDestination](docs/sdks/destinations/README.md#getdestination) - Get Destination details
* [listDestinations](docs/sdks/destinations/README.md#listdestinations) - List destinations
* [patchDestination](docs/sdks/destinations/README.md#patchdestination) - Update a Destination
* [putDestination](docs/sdks/destinations/README.md#putdestination) - Update a Destination and fully overwrite it

### [health()](docs/sdks/health/README.md)

* [getHealthCheck](docs/sdks/health/README.md#gethealthcheck) - Health Check

### [jobs()](docs/sdks/jobs/README.md)

* [cancelJob](docs/sdks/jobs/README.md#canceljob) - Cancel a running Job
* [createJob](docs/sdks/jobs/README.md#createjob) - Trigger a sync or reset job of a connection
* [getJob](docs/sdks/jobs/README.md#getjob) - Get Job status and details
* [listJobs](docs/sdks/jobs/README.md#listjobs) - List Jobs by sync type

### [organizations()](docs/sdks/organizations/README.md)

* [listOrganizationsForUser](docs/sdks/organizations/README.md#listorganizationsforuser) - List all organizations for a user

### [permissions()](docs/sdks/permissions/README.md)

* [createPermission](docs/sdks/permissions/README.md#createpermission) - Create a permission
* [deletePermission](docs/sdks/permissions/README.md#deletepermission) - Delete a Permission
* [getPermission](docs/sdks/permissions/README.md#getpermission) - Get Permission details
* [listPermissions](docs/sdks/permissions/README.md#listpermissions) - List Permissions by user id
* [updatePermission](docs/sdks/permissions/README.md#updatepermission) - Update a permission

### [sourceDefinitions()](docs/sdks/sourcedefinitions/README.md)

* [createSourceDefinition](docs/sdks/sourcedefinitions/README.md#createsourcedefinition) - Create a source definition.
* [deleteSourceDefinition](docs/sdks/sourcedefinitions/README.md#deletesourcedefinition) - Delete a source definition.
* [getSourceDefinition](docs/sdks/sourcedefinitions/README.md#getsourcedefinition) - Get source definition details.
* [listSourceDefinitions](docs/sdks/sourcedefinitions/README.md#listsourcedefinitions) - List source definitions.
* [updateSourceDefinition](docs/sdks/sourcedefinitions/README.md#updatesourcedefinition) - Update source definition details.

### [sources()](docs/sdks/sources/README.md)

* [createSource](docs/sdks/sources/README.md#createsource) - Create a source
* [deleteSource](docs/sdks/sources/README.md#deletesource) - Delete a Source
* [getSource](docs/sdks/sources/README.md#getsource) - Get Source details
* [initiateOAuth](docs/sdks/sources/README.md#initiateoauth) - Initiate OAuth for a source
* [listSources](docs/sdks/sources/README.md#listsources) - List sources
* [patchSource](docs/sdks/sources/README.md#patchsource) - Update a Source
* [putSource](docs/sdks/sources/README.md#putsource) - Update a Source and fully overwrite it

### [streams()](docs/sdks/streams/README.md)

* [getStreamProperties](docs/sdks/streams/README.md#getstreamproperties) - Get stream properties

### [tags()](docs/sdks/tags/README.md)

* [createTag](docs/sdks/tags/README.md#createtag) - Create a tag
* [deleteTag](docs/sdks/tags/README.md#deletetag) - Delete a tag
* [getTag](docs/sdks/tags/README.md#gettag) - Get a tag
* [listTags](docs/sdks/tags/README.md#listtags) - List all tags
* [updateTag](docs/sdks/tags/README.md#updatetag) - Update a tag

### [users()](docs/sdks/users/README.md)

* [listUsersWithinAnOrganization](docs/sdks/users/README.md#listuserswithinanorganization) - List all users within an organization

### [workspaces()](docs/sdks/workspaces/README.md)

* [createOrUpdateWorkspaceOAuthCredentials](docs/sdks/workspaces/README.md#createorupdateworkspaceoauthcredentials) - Create OAuth override credentials for a workspace and source type.
* [createWorkspace](docs/sdks/workspaces/README.md#createworkspace) - Create a workspace
* [deleteWorkspace](docs/sdks/workspaces/README.md#deleteworkspace) - Delete a Workspace
* [getWorkspace](docs/sdks/workspaces/README.md#getworkspace) - Get Workspace details
* [listWorkspaces](docs/sdks/workspaces/README.md#listworkspaces) - List workspaces
* [updateWorkspace](docs/sdks/workspaces/README.md#updateworkspace) - Update a workspace

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.

By default, an API error will throw a `models/errors/SDKError` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `createConnection` method throws the following exceptions:

| Error Type             | Status Code | Content Type |
| ---------------------- | ----------- | ------------ |
| models/errors/SDKError | 4XX, 5XX    | \*/\*        |

### Example

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateConnectionResponse;
import com.airbyte.api.models.shared.*;
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
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Override Server URL Per-Client

The default server can be overridden globally using the `.serverURL(String serverUrl)` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateConnectionResponse;
import com.airbyte.api.models.shared.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

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
<!-- End Server Selection [server] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. Any manual changes added to internal files will be overwritten on the next generation. 
We look forward to hearing your feedback. Feel free to open a PR or an issue with a proof of concept and we'll do our best to include it in a future release. 

### SDK Created by [Speakeasy](https://www.speakeasy.com/?utm_source=public-api&utm_campaign=java)

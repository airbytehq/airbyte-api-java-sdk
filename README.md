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
  * [Asynchronous Support](#asynchronous-support)
  * [Authentication](#authentication)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Error Handling](#error-handling)
  * [Server Selection](#server-selection)
  * [Custom HTTP Client](#custom-http-client)
  * [Debugging](#debugging)
  * [Jackson Configuration](#jackson-configuration)
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
implementation 'com.airbyte:api:3.0.0'
```

Maven:
```xml
<dependency>
    <groupId>com.airbyte</groupId>
    <artifactId>api</artifactId>
    <version>3.0.0</version>
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
                .namespaceFormat("${SOURCE_NAMESPACE}")
                .build();

        CreateConnectionResponse res = sdk.connections().createConnection()
                .request(req)
                .call();

        if (res.connectionResponse().isPresent()) {
            System.out.println(res.connectionResponse().get());
        }
    }
}
```
#### Asynchronous Call
An asynchronous SDK client is also available that returns a [`CompletableFuture<T>`][comp-fut]. See [Asynchronous Support](#asynchronous-support) for more details on async benefits and reactive library integration.
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.AsyncAirbyte;
import com.airbyte.api.models.operations.async.CreateConnectionResponse;
import com.airbyte.api.models.shared.*;
import java.util.concurrent.CompletableFuture;

public class Application {

    public static void main(String[] args) {

        AsyncAirbyte sdk = Airbyte.builder()
                .security(Security.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .password("")
                        .username("")
                        .build())
                    .build())
            .build()
            .async();

        ConnectionCreateRequest req = ConnectionCreateRequest.builder()
                .destinationId("e478de0d-a3a0-475c-b019-25f7dd29e281")
                .sourceId("95e66a59-8045-4307-9678-63bc3c9b8c93")
                .name("Postgres-to-Bigquery")
                .namespaceFormat("${SOURCE_NAMESPACE}")
                .build();

        CompletableFuture<CreateConnectionResponse> resFut = sdk.connections().createConnection()
                .request(req)
                .call();

        resFut.thenAccept(res -> {
            if (res.connectionResponse().isPresent()) {
                System.out.println(res.connectionResponse().get());
            }
        });
    }
}
```

[comp-fut]: https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html

#### Union Consumption Patterns

When a response field is a union model:

- Discriminated unions: branch on the discriminator (`switch`) and then narrow to the concrete type.
- Non-discriminated unions: use generated accessors (for example `string()`, `asLong()`, `simpleObject()`) to determine the active variant.

For full model-specific examples (including Java 11/16/21 variants), see each union model's **Supported Types** section in the generated model docs.
<!-- End SDK Example Usage [usage] -->

<!-- Start Asynchronous Support [async-support] -->
## Asynchronous Support

The SDK provides comprehensive asynchronous support using Java's [`CompletableFuture<T>`][comp-fut] and [Reactive Streams `Publisher<T>`][reactive-streams] APIs. This design makes no assumptions about your choice of reactive toolkit, allowing seamless integration with any reactive library.

<details>
<summary>Why Use Async?</summary>

Asynchronous operations provide several key benefits:

- **Non-blocking I/O**: Your threads stay free for other work while operations are in flight
- **Better resource utilization**: Handle more concurrent operations with fewer threads
- **Improved scalability**: Build highly responsive applications that can handle thousands of concurrent requests
- **Reactive integration**: Works seamlessly with reactive streams and backpressure handling

</details>

<details>
<summary>Reactive Library Integration</summary>

The SDK returns [Reactive Streams `Publisher<T>`][reactive-streams] instances for operations dealing with streams involving multiple I/O interactions. We use Reactive Streams instead of JDK Flow API to provide broader compatibility with the reactive ecosystem, as most reactive libraries natively support Reactive Streams.

**Why Reactive Streams over JDK Flow?**
- **Broader ecosystem compatibility**: Most reactive libraries (Project Reactor, RxJava, Akka Streams, etc.) natively support Reactive Streams
- **Industry standard**: Reactive Streams is the de facto standard for reactive programming in Java
- **Better interoperability**: Seamless integration without additional adapters for most use cases

**Integration with Popular Libraries:**
- **Project Reactor**: Use `Flux.from(publisher)` to convert to Reactor types
- **RxJava**: Use `Flowable.fromPublisher(publisher)` for RxJava integration
- **Akka Streams**: Use `Source.fromPublisher(publisher)` for Akka Streams integration
- **Vert.x**: Use `ReadStream.fromPublisher(vertx, publisher)` for Vert.x reactive streams
- **Mutiny**: Use `Multi.createFrom().publisher(publisher)` for Quarkus Mutiny integration

**For JDK Flow API Integration:**
If you need JDK Flow API compatibility (e.g., for Quarkus/Mutiny 2), you can use adapters:
```java
// Convert Reactive Streams Publisher to Flow Publisher
Flow.Publisher<T> flowPublisher = FlowAdapters.toFlowPublisher(reactiveStreamsPublisher);

// Convert Flow Publisher to Reactive Streams Publisher
Publisher<T> reactiveStreamsPublisher = FlowAdapters.toPublisher(flowPublisher);
```

For standard single-response operations, the SDK returns `CompletableFuture<T>` for straightforward async execution.

</details>

<details>
<summary>Supported Operations</summary>

Async support is available for:

- **[Server-sent Events](#server-sent-event-streaming)**: Stream real-time events with Reactive Streams `Publisher<T>`
- **[JSONL Streaming](#jsonl-streaming)**: Process streaming JSON lines asynchronously
- **[Pagination](#pagination)**: Iterate through paginated results using `callAsPublisher()` and `callAsPublisherUnwrapped()`
- **[File Uploads](#file-uploads)**: Upload files asynchronously with progress tracking
- **[File Downloads](#file-downloads)**: Download files asynchronously with streaming support
- **[Standard Operations](#example)**: All regular API calls return `CompletableFuture<T>` for async execution

</details>

[comp-fut]: https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html
[reactive-streams]: https://www.reactive-streams.org/
<!-- End Asynchronous Support [async-support] -->

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
                .namespaceFormat("${SOURCE_NAMESPACE}")
                .build();

        CreateConnectionResponse res = sdk.connections().createConnection()
                .request(req)
                .call();

        if (res.connectionResponse().isPresent()) {
            System.out.println(res.connectionResponse().get());
        }
    }
}
```
<!-- End Authentication [security] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [Connections](docs/sdks/connections/README.md)

* [createConnection](docs/sdks/connections/README.md#createconnection) - Create a connection
* [deleteConnection](docs/sdks/connections/README.md#deleteconnection) - Delete a Connection
* [getConnection](docs/sdks/connections/README.md#getconnection) - Get Connection details
* [listConnections](docs/sdks/connections/README.md#listconnections) - List connections
* [patchConnection](docs/sdks/connections/README.md#patchconnection) - Update Connection details

### [DeclarativeSourceDefinitions](docs/sdks/declarativesourcedefinitions/README.md)

* [createDeclarativeSourceDefinition](docs/sdks/declarativesourcedefinitions/README.md#createdeclarativesourcedefinition) - Create a declarative source definition.
* [deleteDeclarativeSourceDefinition](docs/sdks/declarativesourcedefinitions/README.md#deletedeclarativesourcedefinition) - Delete a declarative source definition.
* [getDeclarativeSourceDefinition](docs/sdks/declarativesourcedefinitions/README.md#getdeclarativesourcedefinition) - Get declarative source definition details.
* [listDeclarativeSourceDefinitions](docs/sdks/declarativesourcedefinitions/README.md#listdeclarativesourcedefinitions) - List declarative source definitions.
* [updateDeclarativeSourceDefinition](docs/sdks/declarativesourcedefinitions/README.md#updatedeclarativesourcedefinition) - Update declarative source definition details.

### [DestinationDefinitions](docs/sdks/destinationdefinitions/README.md)

* [createDestinationDefinition](docs/sdks/destinationdefinitions/README.md#createdestinationdefinition) - Create a destination definition.
* [deleteDestinationDefinition](docs/sdks/destinationdefinitions/README.md#deletedestinationdefinition) - Delete a destination definition.
* [getDestinationDefinition](docs/sdks/destinationdefinitions/README.md#getdestinationdefinition) - Get destination definition details.
* [listDestinationDefinitions](docs/sdks/destinationdefinitions/README.md#listdestinationdefinitions) - List destination definitions.
* [updateDestinationDefinition](docs/sdks/destinationdefinitions/README.md#updatedestinationdefinition) - Update destination definition details.

### [Destinations](docs/sdks/destinations/README.md)

* [createDestination](docs/sdks/destinations/README.md#createdestination) - Create a destination
* [deleteDestination](docs/sdks/destinations/README.md#deletedestination) - Delete a Destination
* [getDestination](docs/sdks/destinations/README.md#getdestination) - Get Destination details
* [listDestinations](docs/sdks/destinations/README.md#listdestinations) - List destinations
* [patchDestination](docs/sdks/destinations/README.md#patchdestination) - Update a Destination
* [putDestination](docs/sdks/destinations/README.md#putdestination) - Update a Destination and fully overwrite it

### [Health](docs/sdks/health/README.md)

* [getHealthCheck](docs/sdks/health/README.md#gethealthcheck) - Health Check

### [Jobs](docs/sdks/jobs/README.md)

* [cancelJob](docs/sdks/jobs/README.md#canceljob) - Cancel a running Job
* [createJob](docs/sdks/jobs/README.md#createjob) - Trigger a sync or reset job of a connection
* [getJob](docs/sdks/jobs/README.md#getjob) - Get Job status and details
* [listJobs](docs/sdks/jobs/README.md#listjobs) - List Jobs by sync type

### [Organizations](docs/sdks/organizations/README.md)

* [createOrUpdateOrganizationOAuthCredentials](docs/sdks/organizations/README.md#createorupdateorganizationoauthcredentials) - Create OAuth override credentials for an organization and source type.
* [deleteOrganizationOAuthCredentials](docs/sdks/organizations/README.md#deleteorganizationoauthcredentials) - Delete OAuth override credentials for an organization and source/destination type.
* [listOrganizationsForUser](docs/sdks/organizations/README.md#listorganizationsforuser) - List all organizations for a user

### [Permissions](docs/sdks/permissions/README.md)

* [createPermission](docs/sdks/permissions/README.md#createpermission) - Create a permission
* [deletePermission](docs/sdks/permissions/README.md#deletepermission) - Delete a Permission
* [getPermission](docs/sdks/permissions/README.md#getpermission) - Get Permission details
* [listPermissions](docs/sdks/permissions/README.md#listpermissions) - List Permissions by user id
* [updatePermission](docs/sdks/permissions/README.md#updatepermission) - Update a permission

### [SourceDefinitions](docs/sdks/sourcedefinitions/README.md)

* [createSourceDefinition](docs/sdks/sourcedefinitions/README.md#createsourcedefinition) - Create a source definition.
* [deleteSourceDefinition](docs/sdks/sourcedefinitions/README.md#deletesourcedefinition) - Delete a source definition.
* [getSourceDefinition](docs/sdks/sourcedefinitions/README.md#getsourcedefinition) - Get source definition details.
* [listSourceDefinitions](docs/sdks/sourcedefinitions/README.md#listsourcedefinitions) - List source definitions.
* [updateSourceDefinition](docs/sdks/sourcedefinitions/README.md#updatesourcedefinition) - Update source definition details.

### [Sources](docs/sdks/sources/README.md)

* [createSource](docs/sdks/sources/README.md#createsource) - Create a source
* [deleteSource](docs/sdks/sources/README.md#deletesource) - Delete a Source
* [getSource](docs/sdks/sources/README.md#getsource) - Get Source details
* [initiateOAuth](docs/sdks/sources/README.md#initiateoauth) - Initiate OAuth for a source
* [listSources](docs/sdks/sources/README.md#listsources) - List sources
* [patchSource](docs/sdks/sources/README.md#patchsource) - Update a Source
* [putSource](docs/sdks/sources/README.md#putsource) - Update a Source and fully overwrite it

### [Streams](docs/sdks/streams/README.md)

* [getStreamProperties](docs/sdks/streams/README.md#getstreamproperties) - Get stream properties

### [Tags](docs/sdks/tags/README.md)

* [createTag](docs/sdks/tags/README.md#createtag) - Create a tag
* [deleteTag](docs/sdks/tags/README.md#deletetag) - Delete a tag
* [getTag](docs/sdks/tags/README.md#gettag) - Get a tag
* [listTags](docs/sdks/tags/README.md#listtags) - List all tags
* [updateTag](docs/sdks/tags/README.md#updatetag) - Update a tag

### [Users](docs/sdks/users/README.md)

* [listUsersWithinAnOrganization](docs/sdks/users/README.md#listuserswithinanorganization) - List all users within an organization

### [Workspaces](docs/sdks/workspaces/README.md)

* [createOrUpdateWorkspaceOAuthCredentials](docs/sdks/workspaces/README.md#createorupdateworkspaceoauthcredentials) - Create OAuth override credentials for a workspace and source type.
* [createWorkspace](docs/sdks/workspaces/README.md#createworkspace) - Create a workspace
* [deleteWorkspace](docs/sdks/workspaces/README.md#deleteworkspace) - Delete a Workspace
* [deleteWorkspaceOAuthCredentials](docs/sdks/workspaces/README.md#deleteworkspaceoauthcredentials) - Delete OAuth override credentials for a workspace and source/destination type.
* [getWorkspace](docs/sdks/workspaces/README.md#getworkspace) - Get Workspace details
* [listWorkspaces](docs/sdks/workspaces/README.md#listworkspaces) - List workspaces
* [updateWorkspace](docs/sdks/workspaces/README.md#updateworkspace) - Update a workspace

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.


[`AirbyteException`](./src/main/java/models/errors/AirbyteException.java) is the base class for all HTTP error responses. It has the following properties:

| Method           | Type                        | Description                                                              |
| ---------------- | --------------------------- | ------------------------------------------------------------------------ |
| `message()`      | `String`                    | Error message                                                            |
| `code()`         | `int`                       | HTTP response status code eg `404`                                       |
| `headers`        | `Map<String, List<String>>` | HTTP response headers                                                    |
| `body()`         | `byte[]`                    | HTTP body as a byte array. Can be empty array if no body is returned.    |
| `bodyAsString()` | `String`                    | HTTP body as a UTF-8 string. Can be empty string if no body is returned. |
| `rawResponse()`  | `HttpResponse<?>`           | Raw HTTP response (body already read and not available for re-read)      |

### Example
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.errors.AirbyteException;
import com.airbyte.api.models.operations.CreateConnectionResponse;
import com.airbyte.api.models.shared.*;
import java.io.UncheckedIOException;
import java.lang.Exception;
import java.util.Optional;

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
        try {

            ConnectionCreateRequest req = ConnectionCreateRequest.builder()
                    .destinationId("e478de0d-a3a0-475c-b019-25f7dd29e281")
                    .sourceId("95e66a59-8045-4307-9678-63bc3c9b8c93")
                    .name("Postgres-to-Bigquery")
                    .namespaceFormat("${SOURCE_NAMESPACE}")
                    .build();

            CreateConnectionResponse res = sdk.connections().createConnection()
                    .request(req)
                    .call();

            if (res.connectionResponse().isPresent()) {
                System.out.println(res.connectionResponse().get());
            }
        } catch (AirbyteException ex) { // all SDK exceptions inherit from AirbyteException

            // ex.ToString() provides a detailed error message including
            // HTTP status code, headers, and error payload (if any)
            System.out.println(ex);

            // Base exception fields
            var rawResponse = ex.rawResponse();
            var headers = ex.headers();
            var contentType = headers.first("Content-Type");
            int statusCode = ex.code();
            Optional<byte[]> responseBody = ex.body();
        } catch (UncheckedIOException ex) {
            // handle IO error (connection, timeout, etc)
        }    }
}
```

### Error Classes
**Primary error:**
* [`AirbyteException`](./src/main/java/models/errors/AirbyteException.java): The base class for HTTP error responses.

<details><summary>Less common errors (6)</summary>

<br />

**Network errors:**
* `java.io.IOException` (always wrapped by `java.io.UncheckedIOException`). Commonly encountered subclasses of
`IOException` include `java.net.ConnectException`, `java.net.SocketTimeoutException`, `EOFException` (there are
many more subclasses in the JDK platform).

**Inherit from [`AirbyteException`](./src/main/java/models/errors/AirbyteException.java)**:


</details>
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
                .namespaceFormat("${SOURCE_NAMESPACE}")
                .build();

        CreateConnectionResponse res = sdk.connections().createConnection()
                .request(req)
                .call();

        if (res.connectionResponse().isPresent()) {
            System.out.println(res.connectionResponse().get());
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Start Custom HTTP Client [http-client] -->
## Custom HTTP Client

The Java SDK makes API calls using an `HTTPClient` that wraps the native
[HttpClient](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpClient.html). This
client provides the ability to attach hooks around the request lifecycle that can be used to modify the request or handle
errors and response.

The `HTTPClient` interface allows you to either use the default `SpeakeasyHTTPClient` that comes with the SDK,
or provide your own custom implementation with customized configuration such as custom executors, SSL context,
connection pools, and other HTTP client settings.

The interface provides synchronous (`send`) methods and asynchronous (`sendAsync`) methods. The `sendAsync` method
is used to power the async SDK methods and returns a `CompletableFuture<HttpResponse<Blob>>` for non-blocking operations.

The following example shows how to add a custom header and handle errors:

```java
import com.airbyte.api.Airbyte;
import com.airbyte.api.utils.HTTPClient;
import com.airbyte.api.utils.SpeakeasyHTTPClient;
import com.airbyte.api.utils.Utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.InputStream;
import java.time.Duration;

public class Application {
    public static void main(String[] args) {
        // Create a custom HTTP client with hooks
        HTTPClient httpClient = new HTTPClient() {
            private final HTTPClient defaultClient = new SpeakeasyHTTPClient();
            
            @Override
            public HttpResponse<InputStream> send(HttpRequest request) throws IOException, URISyntaxException, InterruptedException {
                // Add custom header and timeout using Utils.copy()
                HttpRequest modifiedRequest = Utils.copy(request)
                    .header("x-custom-header", "custom value")
                    .timeout(Duration.ofSeconds(30))
                    .build();
                    
                try {
                    HttpResponse<InputStream> response = defaultClient.send(modifiedRequest);
                    // Log successful response
                    System.out.println("Request successful: " + response.statusCode());
                    return response;
                } catch (Exception error) {
                    // Log error
                    System.err.println("Request failed: " + error.getMessage());
                    throw error;
                }
            }
        };

        Airbyte sdk = Airbyte.builder()
            .client(httpClient)
            .build();
    }
}
```

<details>
<summary>Custom HTTP Client Configuration</summary>

You can also provide a completely custom HTTP client with your own configuration:

```java
import com.airbyte.api.Airbyte;
import com.airbyte.api.utils.HTTPClient;
import com.airbyte.api.utils.Blob;
import com.airbyte.api.utils.ResponseWithBody;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.InputStream;
import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.CompletableFuture;

public class Application {
    public static void main(String[] args) {
        // Custom HTTP client with custom configuration
        HTTPClient customHttpClient = new HTTPClient() {
            private final HttpClient client = HttpClient.newBuilder()
                .executor(Executors.newFixedThreadPool(10))
                .connectTimeout(Duration.ofSeconds(30))
                // .sslContext(customSslContext) // Add custom SSL context if needed
                .build();

            @Override
            public HttpResponse<InputStream> send(HttpRequest request) throws IOException, URISyntaxException, InterruptedException {
                return client.send(request, HttpResponse.BodyHandlers.ofInputStream());
            }

            @Override
            public CompletableFuture<HttpResponse<Blob>> sendAsync(HttpRequest request) {
                // Convert response to HttpResponse<Blob> for async operations
                return client.sendAsync(request, HttpResponse.BodyHandlers.ofPublisher())
                    .thenApply(resp -> new ResponseWithBody<>(resp, Blob::from));
            }
        };

        Airbyte sdk = Airbyte.builder()
            .client(customHttpClient)
            .build();
    }
}
```

</details>

You can also enable debug logging on the default `SpeakeasyHTTPClient`:

```java
import com.airbyte.api.Airbyte;
import com.airbyte.api.utils.SpeakeasyHTTPClient;

public class Application {
    public static void main(String[] args) {
        SpeakeasyHTTPClient httpClient = new SpeakeasyHTTPClient();
        httpClient.enableDebugLogging(true);

        Airbyte sdk = Airbyte.builder()
            .client(httpClient)
            .build();
    }
}
```
<!-- End Custom HTTP Client [http-client] -->

<!-- Start Debugging [debug] -->
## Debugging

### Debug

You can setup your SDK to emit debug logs for SDK requests and responses.

For request and response logging (especially json bodies), call `enableHTTPDebugLogging(boolean)` on the SDK builder like so:

```java
SDK.builder()
    .enableHTTPDebugLogging(true)
    .build();
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
__WARNING__: This logging should only be used for temporary debugging purposes. Leaving this option on in a production system could expose credentials/secrets in logs. <i>Authorization</i> headers are redacted by default and there is the ability to specify redacted header names via `SpeakeasyHTTPClient.setRedactedHeaders`.

__NOTE__: This is a convenience method that calls `HTTPClient.enableDebugLogging()`. The `SpeakeasyHTTPClient` honors this setting. If you are using a custom HTTP client, it is up to the custom client to honor this setting.


Another option is to set the System property `-Djdk.httpclient.HttpClient.log=all`. However, this second option does not log bodies.
<!-- End Debugging [debug] -->

<!-- Start Jackson Configuration [jackson] -->
## Jackson Configuration

The SDK ships with a pre-configured Jackson [`ObjectMapper`][jackson-databind] accessible via
`JSON.getMapper()`. It is set up with type modules, strict deserializers, and the feature flags
needed for full SDK compatibility (including ISO-8601 `OffsetDateTime` serialization):

```java
import com.airbyte.api.utils.JSON;

String json = JSON.getMapper().writeValueAsString(response);
```

To compose with your own `ObjectMapper`, register the provided `ApiJacksonModule`, which
bundles all the same modules and feature flags as a single plug-and-play module:

```java
import com.airbyte.api.utils.ApiJacksonModule;
import com.fasterxml.jackson.databind.ObjectMapper;

ObjectMapper myMapper = new ObjectMapper()
    .registerModule(new ApiJacksonModule());

String json = myMapper.writeValueAsString(response);
```

[jackson-databind]: https://github.com/FasterXML/jackson-databind
[jackson-jsr310]: https://github.com/FasterXML/jackson-modules-java8/tree/master/datetime
<!-- End Jackson Configuration [jackson] -->

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

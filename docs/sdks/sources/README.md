# Sources
(*sources*)

### Available Operations

* [createSource](#createsource) - Create a source
* [deleteSource](#deletesource) - Delete a Source
* [getSource](#getsource) - Get Source details
* [initiateOAuth](#initiateoauth) - Initiate OAuth for a source
* [listSources](#listsources) - List sources
* [patchSource](#patchsource) - Update a Source
* [putSource](#putsource) - Update a Source and fully overwrite it

## createSource

Creates a source given a name, workspace id, and a json blob containing the configuration for the source.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateSourceResponse;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.models.shared.SourceCreateRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security(){{
                    basicAuth = new SchemeBasicAuth("Direct", "lavender"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            com.airbyte.api.models.shared.SourceCreateRequest req = new SourceCreateRequest("States", "Southwest", "3ddc9848-c34b-4dfb-9090-56aa6d6dedf2"){{
                secretId = "person";
            }};            

            CreateSourceResponse res = sdk.sources.createSource(req);

            if (res.sourceResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [com.airbyte.api.models.shared.SourceCreateRequest](../../models/shared/SourceCreateRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |


### Response

**[com.airbyte.api.models.operations.CreateSourceResponse](../../models/operations/CreateSourceResponse.md)**


## deleteSource

Delete a Source

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.DeleteSourceRequest;
import com.airbyte.api.models.operations.DeleteSourceResponse;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security(){{
                    basicAuth = new SchemeBasicAuth("South", "digital"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            DeleteSourceRequest req = new DeleteSourceRequest("Transexual");            

            DeleteSourceResponse res = sdk.sources.deleteSource(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [com.airbyte.api.models.operations.DeleteSourceRequest](../../models/operations/DeleteSourceRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |


### Response

**[com.airbyte.api.models.operations.DeleteSourceResponse](../../models/operations/DeleteSourceResponse.md)**


## getSource

Get Source details

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.GetSourceRequest;
import com.airbyte.api.models.operations.GetSourceResponse;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security(){{
                    basicAuth = new SchemeBasicAuth("Dynamic", "Refined"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            GetSourceRequest req = new GetSourceRequest("online");            

            GetSourceResponse res = sdk.sources.getSource(req);

            if (res.sourceResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [com.airbyte.api.models.operations.GetSourceRequest](../../models/operations/GetSourceRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[com.airbyte.api.models.operations.GetSourceResponse](../../models/operations/GetSourceResponse.md)**


## initiateOAuth

Given a source ID, workspace ID, and redirect URL, initiates OAuth for the source.

This returns a fully formed URL for performing user authentication against the relevant source identity provider (IdP). Once authentication has been completed, the IdP will redirect to an Airbyte endpoint which will save the access and refresh tokens off as a secret and return the secret ID to the redirect URL specified in the `secret_id` query string parameter.

That secret ID can be used to create a source with credentials in place of actual tokens.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.InitiateOAuthResponse;
import com.airbyte.api.models.shared.InitiateOauthRequest;
import com.airbyte.api.models.shared.OAuthActorNames;
import com.airbyte.api.models.shared.OAuthInputConfiguration;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security(){{
                    basicAuth = new SchemeBasicAuth("Chips", "Cadillac"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            com.airbyte.api.models.shared.InitiateOauthRequest req = new InitiateOauthRequest("bandwidth", OAuthActorNames.GITLAB, "0d9919ff-ae67-4d4e-92eb-0994476c595c"){{
                oAuthInputConfiguration = new OAuthInputConfiguration();
            }};            

            InitiateOAuthResponse res = sdk.sources.initiateOAuth(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [com.airbyte.api.models.shared.InitiateOauthRequest](../../models/shared/InitiateOauthRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[com.airbyte.api.models.operations.InitiateOAuthResponse](../../models/operations/InitiateOAuthResponse.md)**


## listSources

List sources

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.ListSourcesRequest;
import com.airbyte.api.models.operations.ListSourcesResponse;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security(){{
                    basicAuth = new SchemeBasicAuth("withdrawal", "SUV"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            ListSourcesRequest req = new ListSourcesRequest(){{
                includeDeleted = false;
                limit = 736973;
                offset = 706496;
                workspaceIds = new String[]{{
                    add("77f80b57-c454-400c-9d47-a64428ce2bab"),
                }};
            }};            

            ListSourcesResponse res = sdk.sources.listSources(req);

            if (res.sourcesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [com.airbyte.api.models.operations.ListSourcesRequest](../../models/operations/ListSourcesRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |


### Response

**[com.airbyte.api.models.operations.ListSourcesResponse](../../models/operations/ListSourcesResponse.md)**


## patchSource

Update a Source

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.PatchSourceRequest;
import com.airbyte.api.models.operations.PatchSourceResponse;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.models.shared.SourcePatchRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security(){{
                    basicAuth = new SchemeBasicAuth("Small", "septicaemia"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            PatchSourceRequest req = new PatchSourceRequest("Garden"){{
                sourcePatchRequest = new SourcePatchRequest(){{
                    configuration = "Northeast";
                    name = "My source";
                    secretId = "collaborative";
                    workspaceId = "79ed2c30-df4f-4d46-80e4-7eb2c7a42669";
                }};
            }};            

            PatchSourceResponse res = sdk.sources.patchSource(req);

            if (res.sourceResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [com.airbyte.api.models.operations.PatchSourceRequest](../../models/operations/PatchSourceRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |


### Response

**[com.airbyte.api.models.operations.PatchSourceResponse](../../models/operations/PatchSourceResponse.md)**


## putSource

Update a Source and fully overwrite it

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.PutSourceRequest;
import com.airbyte.api.models.operations.PutSourceResponse;
import com.airbyte.api.models.shared.Security;
import com.airbyte.api.models.shared.SourcePutRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security(){{
                    basicAuth = new SchemeBasicAuth("Ameliorated", "bah"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            PutSourceRequest req = new PutSourceRequest("Indio"){{
                sourcePutRequest = new SourcePutRequest("Berkshire", "ASCII");
            }};            

            PutSourceResponse res = sdk.sources.putSource(req);

            if (res.sourceResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [com.airbyte.api.models.operations.PutSourceRequest](../../models/operations/PutSourceRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[com.airbyte.api.models.operations.PutSourceResponse](../../models/operations/PutSourceResponse.md)**


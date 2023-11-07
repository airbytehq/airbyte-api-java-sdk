# Sources
(*.sources*)

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
                    basicAuth = new SchemeBasicAuth("string", "string"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            com.airbyte.api.models.shared.SourceCreateRequest req = new SourceCreateRequest("string", "string", "a2cf0f31-f3dd-4c98-88c3-4bdfb109056a"){{
                secretId = "string";
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
                    basicAuth = new SchemeBasicAuth("string", "string"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            DeleteSourceRequest req = new DeleteSourceRequest("string");            

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
                    basicAuth = new SchemeBasicAuth("string", "string"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            GetSourceRequest req = new GetSourceRequest("string");            

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
                    basicAuth = new SchemeBasicAuth("string", "string"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            com.airbyte.api.models.shared.InitiateOauthRequest req = new InitiateOauthRequest("string", OAuthActorNames.GOOGLE_ADS, "fd28130d-9919-4ffa-a67d-4e12eb099447"){{
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
                    basicAuth = new SchemeBasicAuth("string", "string"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            ListSourcesRequest req = new ListSourcesRequest(){{
                includeDeleted = false;
                limit = 442892;
                offset = 284564;
                workspaceIds = new String[]{{
                    add("dbbb77f8-0b57-4c45-800c-5d47a64428ce"),
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
                    basicAuth = new SchemeBasicAuth("string", "string"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            PatchSourceRequest req = new PatchSourceRequest("string"){{
                sourcePatchRequest = new SourcePatchRequest(){{
                    configuration = "string";
                    name = "My source";
                    secretId = "string";
                    workspaceId = "30fc2511-c44f-479e-92c3-0df4fd46c0e4";
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
                    basicAuth = new SchemeBasicAuth("string", "string"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            PutSourceRequest req = new PutSourceRequest("string"){{
                sourcePutRequest = new SourcePutRequest("string", "string");
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


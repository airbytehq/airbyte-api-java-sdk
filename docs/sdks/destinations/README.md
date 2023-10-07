# Destinations
(*destinations*)

### Available Operations

* [createDestination](#createdestination) - Create a destination
* [deleteDestination](#deletedestination) - Delete a Destination
* [getDestination](#getdestination) - Get Destination details
* [listDestinations](#listdestinations) - List destinations
* [patchDestination](#patchdestination) - Update a Destination
* [putDestination](#putdestination) - Update a Destination and fully overwrite it

## createDestination

Creates a destination given a name, workspace id, and a json blob containing the configuration for the source.

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateDestinationResponse;
import com.airbyte.api.models.shared.DestinationCreateRequest;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security(){{
                    basicAuth = new SchemeBasicAuth("override", "Dollar"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            com.airbyte.api.models.shared.DestinationCreateRequest req = new DestinationCreateRequest("Account", "Dodge", "6e8e62f6-208e-45ba-9019-ef3492fc0eef");            

            CreateDestinationResponse res = sdk.destinations.createDestination(req);

            if (res.destinationResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [com.airbyte.api.models.shared.DestinationCreateRequest](../../models/shared/DestinationCreateRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[com.airbyte.api.models.operations.CreateDestinationResponse](../../models/operations/CreateDestinationResponse.md)**


## deleteDestination

Delete a Destination

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.DeleteDestinationRequest;
import com.airbyte.api.models.operations.DeleteDestinationResponse;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security(){{
                    basicAuth = new SchemeBasicAuth("virtual", "Plastic"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            DeleteDestinationRequest req = new DeleteDestinationRequest("male");            

            DeleteDestinationResponse res = sdk.destinations.deleteDestination(req);

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

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [com.airbyte.api.models.operations.DeleteDestinationRequest](../../models/operations/DeleteDestinationRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[com.airbyte.api.models.operations.DeleteDestinationResponse](../../models/operations/DeleteDestinationResponse.md)**


## getDestination

Get Destination details

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.GetDestinationRequest;
import com.airbyte.api.models.operations.GetDestinationResponse;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security(){{
                    basicAuth = new SchemeBasicAuth("alarm", "Brakus"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            GetDestinationRequest req = new GetDestinationRequest("Bike ubiquitous");            

            GetDestinationResponse res = sdk.destinations.getDestination(req);

            if (res.destinationResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [com.airbyte.api.models.operations.GetDestinationRequest](../../models/operations/GetDestinationRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[com.airbyte.api.models.operations.GetDestinationResponse](../../models/operations/GetDestinationResponse.md)**


## listDestinations

List destinations

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.ListDestinationsRequest;
import com.airbyte.api.models.operations.ListDestinationsResponse;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security(){{
                    basicAuth = new SchemeBasicAuth("Bicycle", "up"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            ListDestinationsRequest req = new ListDestinationsRequest(){{
                includeDeleted = false;
                limit = 566557;
                offset = 673433;
                workspaceIds = new String[]{{
                    add("83172024-45cd-426f-b445-5227f2f090ad"),
                }};
            }};            

            ListDestinationsResponse res = sdk.destinations.listDestinations(req);

            if (res.destinationsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [com.airbyte.api.models.operations.ListDestinationsRequest](../../models/operations/ListDestinationsRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[com.airbyte.api.models.operations.ListDestinationsResponse](../../models/operations/ListDestinationsResponse.md)**


## patchDestination

Update a Destination

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.PatchDestinationRequest;
import com.airbyte.api.models.operations.PatchDestinationResponse;
import com.airbyte.api.models.shared.DestinationPatchRequest;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security(){{
                    basicAuth = new SchemeBasicAuth("Refined", "SUV"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            PatchDestinationRequest req = new PatchDestinationRequest("Verde pixel male"){{
                destinationPatchRequest = new DestinationPatchRequest(){{
                    configuration = "till";
                    name = "firewall West morph";
                }};
            }};            

            PatchDestinationResponse res = sdk.destinations.patchDestination(req);

            if (res.destinationResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [com.airbyte.api.models.operations.PatchDestinationRequest](../../models/operations/PatchDestinationRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[com.airbyte.api.models.operations.PatchDestinationResponse](../../models/operations/PatchDestinationResponse.md)**


## putDestination

Update a Destination and fully overwrite it

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.PutDestinationRequest;
import com.airbyte.api.models.operations.PutDestinationResponse;
import com.airbyte.api.models.shared.DestinationPutRequest;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security(){{
                    basicAuth = new SchemeBasicAuth("Heights", "Wagon"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            PutDestinationRequest req = new PutDestinationRequest("navigate female"){{
                destinationPutRequest = new DestinationPutRequest("unusual", "amidst");
            }};            

            PutDestinationResponse res = sdk.destinations.putDestination(req);

            if (res.destinationResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [com.airbyte.api.models.operations.PutDestinationRequest](../../models/operations/PutDestinationRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[com.airbyte.api.models.operations.PutDestinationResponse](../../models/operations/PutDestinationResponse.md)**


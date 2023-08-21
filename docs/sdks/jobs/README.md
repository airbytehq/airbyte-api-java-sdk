# jobs

### Available Operations

* [cancelJob](#canceljob) - Cancel a running Job
* [createJob](#createjob) - Trigger a sync or reset job of a connection
* [getJob](#getjob) - Get Job status and details
* [listJobs](#listjobs) - List Jobs by sync type

## cancelJob

Cancel a running Job

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CancelJobRequest;
import com.airbyte.api.models.operations.CancelJobResponse;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security("cupiditate") {{
                    bearerAuth = "";
                }})
                .build();

            CancelJobRequest req = new CancelJobRequest(181631L);            

            CancelJobResponse res = sdk.jobs.cancelJob(req);

            if (res.jobResponse != null) {
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
| `request`                                                                                         | [com.airbyte.api.models.operations.CancelJobRequest](../../models/operations/CancelJobRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[com.airbyte.api.models.operations.CancelJobResponse](../../models/operations/CancelJobResponse.md)**


## createJob

Trigger a sync or reset job of a connection

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateJobResponse;
import com.airbyte.api.models.shared.JobCreateRequest;
import com.airbyte.api.models.shared.JobTypeEnum;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security("quae") {{
                    bearerAuth = "";
                }})
                .build();

            com.airbyte.api.models.shared.JobCreateRequest req = new JobCreateRequest("laudantium", JobTypeEnum.SYNC);            

            CreateJobResponse res = sdk.jobs.createJob(req);

            if (res.jobResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [com.airbyte.api.models.shared.JobCreateRequest](../../models/shared/JobCreateRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |


### Response

**[com.airbyte.api.models.operations.CreateJobResponse](../../models/operations/CreateJobResponse.md)**


## getJob

Get Job status and details

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.GetJobRequest;
import com.airbyte.api.models.operations.GetJobResponse;
import com.airbyte.api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security("occaecati") {{
                    bearerAuth = "";
                }})
                .build();

            GetJobRequest req = new GetJobRequest(977496L);            

            GetJobResponse res = sdk.jobs.getJob(req);

            if (res.jobResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [com.airbyte.api.models.operations.GetJobRequest](../../models/operations/GetJobRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |


### Response

**[com.airbyte.api.models.operations.GetJobResponse](../../models/operations/GetJobResponse.md)**


## listJobs

List Jobs by sync type

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.ListJobsRequest;
import com.airbyte.api.models.operations.ListJobsResponse;
import com.airbyte.api.models.shared.JobStatusEnum;
import com.airbyte.api.models.shared.JobTypeEnum;
import com.airbyte.api.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .setSecurity(new Security("quisquam") {{
                    bearerAuth = "";
                }})
                .build();

            ListJobsRequest req = new ListJobsRequest() {{
                connectionId = "vero";
                createdAtEnd = OffsetDateTime.parse("2022-04-29T03:27:17.664Z");
                createdAtStart = OffsetDateTime.parse("2022-01-15T00:38:43.469Z");
                jobType = JobTypeEnum.SYNC;
                limit = 231701;
                offset = 878870;
                orderBy = "tenetur";
                status = JobStatusEnum.INCOMPLETE;
                updatedAtEnd = OffsetDateTime.parse("2020-11-08T11:03:10.206Z");
                updatedAtStart = OffsetDateTime.parse("2021-07-17T15:43:35.984Z");
                workspaceIds = new String[]{{
                    add("bd74dd39-c0f5-4d2c-bf7c-70a45626d436"),
                    add("813f16d9-f5fc-4e6c-9561-46c3e250fb00"),
                    add("8c42e141-aac3-466c-8dd6-b14429074747"),
                }};
            }};            

            ListJobsResponse res = sdk.jobs.listJobs(req);

            if (res.jobsResponse != null) {
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
| `request`                                                                                       | [com.airbyte.api.models.operations.ListJobsRequest](../../models/operations/ListJobsRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |


### Response

**[com.airbyte.api.models.operations.ListJobsResponse](../../models/operations/ListJobsResponse.md)**


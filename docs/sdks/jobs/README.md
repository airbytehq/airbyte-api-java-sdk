# Jobs
(*jobs*)

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
                .setSecurity(new Security() {{
                    basicAuth = new SchemeBasicAuth("tempore", "accusamus") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            CancelJobRequest req = new CancelJobRequest(253941L);            

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
                .setSecurity(new Security() {{
                    basicAuth = new SchemeBasicAuth("enim", "dolorem") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            com.airbyte.api.models.shared.JobCreateRequest req = new JobCreateRequest("sapiente", JobTypeEnum.RESET);            

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
                .setSecurity(new Security() {{
                    basicAuth = new SchemeBasicAuth("nihil", "sit") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            GetJobRequest req = new GetJobRequest(711584L);            

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
                .setSecurity(new Security() {{
                    basicAuth = new SchemeBasicAuth("neque", "sed") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            ListJobsRequest req = new ListJobsRequest() {{
                connectionId = "vel";
                createdAtEnd = OffsetDateTime.parse("2022-04-02T20:32:30.487Z");
                createdAtStart = OffsetDateTime.parse("2022-01-27T14:09:30.399Z");
                jobType = JobTypeEnum.SYNC;
                limit = 277628;
                offset = 186458;
                orderBy = "cupiditate";
                status = JobStatusEnum.SUCCEEDED;
                updatedAtEnd = OffsetDateTime.parse("2020-10-04T22:45:05.165Z");
                updatedAtStart = OffsetDateTime.parse("2022-04-29T16:20:13.800Z");
                workspaceIds = new String[]{{
                    add("8422bb67-9d23-4227-95bf-0cbb1e31b8b9"),
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


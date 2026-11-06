# Jobs

## Overview

### Available Operations

* [cancelJob](#canceljob) - Cancel a running Job
* [createJob](#createjob) - Trigger a sync or reset job of a connection
* [getJob](#getjob) - Get Job status and details
* [listJobs](#listjobs) - List Jobs by sync type

## cancelJob

Cancel a running Job

### Example Usage

<!-- UsageSnippet language="java" operationID="cancelJob" method="delete" path="/jobs/{jobId}" -->
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CancelJobRequest;
import com.airbyte.api.models.operations.CancelJobResponse;
import com.airbyte.api.models.shared.SchemeBasicAuth;
import com.airbyte.api.models.shared.Security;
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

        CancelJobRequest req = CancelJobRequest.builder()
                .jobId(621441L)
                .build();

        CancelJobResponse res = sdk.jobs().cancelJob()
                .request(req)
                .call();

        if (res.jobResponse().isPresent()) {
            System.out.println(res.jobResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [CancelJobRequest](../../models/operations/CancelJobRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[CancelJobResponse](../../models/operations/CancelJobResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createJob

Trigger a sync or reset job of a connection

### Example Usage: Job Creation Request Example

<!-- UsageSnippet language="java" operationID="createJob" method="post" path="/jobs" example="Job Creation Request Example" -->
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateJobResponse;
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

        JobCreateRequest req = JobCreateRequest.builder()
                .connectionId("e735894a-e773-4938-969f-45f53957b75b")
                .jobType(JobTypeEnum.SYNC)
                .build();

        CreateJobResponse res = sdk.jobs().createJob()
                .request(req)
                .call();

        if (res.jobResponse().isPresent()) {
            System.out.println(res.jobResponse().get());
        }
    }
}
```
### Example Usage: Job Creation Response Example

<!-- UsageSnippet language="java" operationID="createJob" method="post" path="/jobs" example="Job Creation Response Example" -->
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.CreateJobResponse;
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

        JobCreateRequest req = JobCreateRequest.builder()
                .connectionId("18dccc91-0ab1-4f72-9ed7-0b8fc27c5826")
                .jobType(JobTypeEnum.SYNC)
                .build();

        CreateJobResponse res = sdk.jobs().createJob()
                .request(req)
                .call();

        if (res.jobResponse().isPresent()) {
            System.out.println(res.jobResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [JobCreateRequest](../../models/shared/JobCreateRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[CreateJobResponse](../../models/operations/CreateJobResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getJob

Get Job status and details

### Example Usage

<!-- UsageSnippet language="java" operationID="getJob" method="get" path="/jobs/{jobId}" example="Job Get Response Example" -->
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.GetJobRequest;
import com.airbyte.api.models.operations.GetJobResponse;
import com.airbyte.api.models.shared.SchemeBasicAuth;
import com.airbyte.api.models.shared.Security;
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

        GetJobRequest req = GetJobRequest.builder()
                .jobId(245534L)
                .build();

        GetJobResponse res = sdk.jobs().getJob()
                .request(req)
                .call();

        if (res.jobResponse().isPresent()) {
            System.out.println(res.jobResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [GetJobRequest](../../models/operations/GetJobRequest.md) | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[GetJobResponse](../../models/operations/GetJobResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listJobs

List Jobs by sync type

### Example Usage

<!-- UsageSnippet language="java" operationID="listJobs" method="get" path="/jobs" example="Job List Response Example" -->
```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.ListJobsRequest;
import com.airbyte.api.models.operations.ListJobsResponse;
import com.airbyte.api.models.shared.SchemeBasicAuth;
import com.airbyte.api.models.shared.Security;
import java.lang.Exception;
import java.time.OffsetDateTime;

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

        ListJobsRequest req = ListJobsRequest.builder()
                .createdAtEnd(OffsetDateTime.parse("2024-11-05T02:58:38.581Z"))
                .createdAtStart(OffsetDateTime.parse("2024-04-14T21:55:04.172Z"))
                .orderBy("updatedAt|DESC")
                .updatedAtEnd(OffsetDateTime.parse("2025-11-15T07:41:11.221Z"))
                .updatedAtStart(OffsetDateTime.parse("2026-10-05T17:24:30.764Z"))
                .build();

        ListJobsResponse res = sdk.jobs().listJobs()
                .request(req)
                .call();

        if (res.jobsResponse().isPresent()) {
            System.out.println(res.jobsResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [ListJobsRequest](../../models/operations/ListJobsRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[ListJobsResponse](../../models/operations/ListJobsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |
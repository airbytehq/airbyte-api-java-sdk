# Jobs
(*jobs()*)

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
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.operations.CancelJobRequest;
import com.airbyte.api.models.operations.CancelJobResponse;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .security(Security.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .password("")
                        .username("")
                        .build())
                    .build())
                .build();

            CancelJobRequest req = CancelJobRequest.builder()
                .jobId(801771L)
                .build();

            CancelJobResponse res = sdk.jobs().cancelJob()
                .request(req)
                .call();

            if (res.jobResponse().isPresent()) {
                // handle response
            }
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
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

**[Optional<? extends com.airbyte.api.models.operations.CancelJobResponse>](../../models/operations/CancelJobResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createJob

Trigger a sync or reset job of a connection

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.operations.CreateJobResponse;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.JobCreateRequest;
import com.airbyte.api.models.shared.JobTypeEnum;
import com.airbyte.api.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .security(Security.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .password("")
                        .username("")
                        .build())
                    .build())
                .build();

            JobCreateRequest req = JobCreateRequest.builder()
                .connectionId("<value>")
                .jobType(JobTypeEnum.SYNC)
                .build();

            CreateJobResponse res = sdk.jobs().createJob()
                .request(req)
                .call();

            if (res.jobResponse().isPresent()) {
                // handle response
            }
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
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

**[Optional<? extends com.airbyte.api.models.operations.CreateJobResponse>](../../models/operations/CreateJobResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getJob

Get Job status and details

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.operations.GetJobRequest;
import com.airbyte.api.models.operations.GetJobResponse;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .security(Security.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .password("")
                        .username("")
                        .build())
                    .build())
                .build();

            GetJobRequest req = GetJobRequest.builder()
                .jobId(131101L)
                .build();

            GetJobResponse res = sdk.jobs().getJob()
                .request(req)
                .call();

            if (res.jobResponse().isPresent()) {
                // handle response
            }
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
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

**[Optional<? extends com.airbyte.api.models.operations.GetJobResponse>](../../models/operations/GetJobResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listJobs

List Jobs by sync type

### Example Usage

```java
package hello.world;

import com.airbyte.api.Airbyte;
import com.airbyte.api.models.operations.*;
import com.airbyte.api.models.operations.ListJobsRequest;
import com.airbyte.api.models.operations.ListJobsResponse;
import com.airbyte.api.models.shared.*;
import com.airbyte.api.models.shared.JobStatusEnum;
import com.airbyte.api.models.shared.JobTypeEnum;
import com.airbyte.api.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Airbyte sdk = Airbyte.builder()
                .security(Security.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .password("")
                        .username("")
                        .build())
                    .build())
                .build();

            ListJobsRequest req = ListJobsRequest.builder()
                .connectionId("<value>")
                .createdAtEnd(OffsetDateTime.parse("2024-06-04T16:21:45.917Z"))
                .createdAtStart(OffsetDateTime.parse("2023-04-03T04:39:28.005Z"))
                .jobType(JobTypeEnum.SYNC)
                .limit(955698)
                .offset(624731)
                .orderBy("<value>")
                .status(JobStatusEnum.PENDING)
                .updatedAtEnd(OffsetDateTime.parse("2023-12-07T18:30:31.244Z"))
                .updatedAtStart(OffsetDateTime.parse("2023-06-02T22:15:44.179Z"))
                .workspaceIds(java.util.List.of(
                    "de801f6f-5d37-41c0-9bc4-dea632e540b9"))
                .build();

            ListJobsResponse res = sdk.jobs().listJobs()
                .request(req)
                .call();

            if (res.jobsResponse().isPresent()) {
                // handle response
            }
        } catch (com.airbyte.api.models.errors.SDKError e) {
            // handle exception
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

**[Optional<? extends com.airbyte.api.models.operations.ListJobsResponse>](../../models/operations/ListJobsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

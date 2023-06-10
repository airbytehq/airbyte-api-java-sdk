# JobResponse

Provides details of a single job.


## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `bytesSynced`                                                           | *Long*                                                                  | :heavy_minus_sign:                                                      | N/A                                                                     |
| `duration`                                                              | *String*                                                                | :heavy_minus_sign:                                                      | Duration of a sync in ISO_8601 format                                   |
| `jobId`                                                                 | *Long*                                                                  | :heavy_check_mark:                                                      | N/A                                                                     |
| `jobType`                                                               | [JobTypeEnum](../../models/shared/JobTypeEnum.md)                       | :heavy_check_mark:                                                      | Enum that describes the different types of jobs that the platform runs. |
| `lastUpdatedAt`                                                         | *String*                                                                | :heavy_minus_sign:                                                      | N/A                                                                     |
| `rowsSynced`                                                            | *Long*                                                                  | :heavy_minus_sign:                                                      | N/A                                                                     |
| `startTime`                                                             | *String*                                                                | :heavy_check_mark:                                                      | N/A                                                                     |
| `status`                                                                | [JobStatusEnum](../../models/shared/JobStatusEnum.md)                   | :heavy_check_mark:                                                      | N/A                                                                     |
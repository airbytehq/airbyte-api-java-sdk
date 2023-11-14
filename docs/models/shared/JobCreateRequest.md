# JobCreateRequest

Creates a new Job from the configuration provided in the request body.


## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `connectionId`                                                                  | *String*                                                                        | :heavy_check_mark:                                                              | N/A                                                                             |
| `jobType`                                                                       | [com.airbyte.api.models.shared.JobTypeEnum](../../models/shared/JobTypeEnum.md) | :heavy_check_mark:                                                              | Enum that describes the different types of jobs that the platform runs.         |
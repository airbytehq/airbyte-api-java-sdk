# JobTypeResourceLimit

sets resource requirements for a specific job type for an actor or actor definition. these values override the default, if both are set.


## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `jobType`                                                                       | [JobType](../../models/shared/JobType.md)                                       | :heavy_check_mark:                                                              | enum that describes the different types of jobs that the platform runs.         |
| `resourceRequirements`                                                          | [ResourceRequirements](../../models/shared/ResourceRequirements.md)             | :heavy_check_mark:                                                              | optional resource requirements to run workers (blank for unbounded allocations) |
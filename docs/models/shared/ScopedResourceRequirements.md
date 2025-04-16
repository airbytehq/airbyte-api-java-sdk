# ScopedResourceRequirements

actor or actor definition specific resource requirements. if default is set, these are the requirements that should be set for ALL jobs run for this actor definition. it is overriden by the job type specific configurations. if not set, the platform will use defaults. these values will be overriden by configuration at the connection level.


## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `default_`                                                                      | [Optional\<ResourceRequirements>](../../models/shared/ResourceRequirements.md)  | :heavy_minus_sign:                                                              | optional resource requirements to run workers (blank for unbounded allocations) |
| `jobSpecific`                                                                   | List\<[JobTypeResourceLimit](../../models/shared/JobTypeResourceLimit.md)>      | :heavy_minus_sign:                                                              | N/A                                                                             |
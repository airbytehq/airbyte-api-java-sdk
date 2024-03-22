# Standard

<i>(not recommended)</i> Direct loading using SQL INSERT statements. This method is extremely inefficient and provided only for quick testing. In all other cases, you should use S3 uploading.


## Fields

| Field                                                                                                                     | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `method`                                                                                                                  | [com.airbyte.api.models.shared.DestinationRedshiftSchemasMethod](../../models/shared/DestinationRedshiftSchemasMethod.md) | :heavy_check_mark:                                                                                                        | N/A                                                                                                                       |
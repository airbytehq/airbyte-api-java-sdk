# DestinationGcsCSVCommaSeparatedValues


## Fields

| Field                                                                                                                                          | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `compression`                                                                                                                                  | [Optional<? extends com.airbyte.api.models.shared.Compression>](../../models/shared/Compression.md)                                            | :heavy_minus_sign:                                                                                                                             | Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".csv.gz"). |
| `flattening`                                                                                                                                   | [Optional<? extends com.airbyte.api.models.shared.Normalization>](../../models/shared/Normalization.md)                                        | :heavy_minus_sign:                                                                                                                             | Whether the input JSON data should be normalized (flattened) in the output CSV. Please refer to docs for details.                              |
| `formatType`                                                                                                                                   | [Optional<? extends com.airbyte.api.models.shared.DestinationGcsSchemasFormatType>](../../models/shared/DestinationGcsSchemasFormatType.md)    | :heavy_minus_sign:                                                                                                                             | N/A                                                                                                                                            |
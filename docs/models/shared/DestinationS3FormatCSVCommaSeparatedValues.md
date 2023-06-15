# DestinationS3FormatCSVCommaSeparatedValues

Format of the data output. See <a href="https://docs.airbyte.com/integrations/destinations/s3/#supported-output-schema">here</a> for more details


## Fields

| Field                                                                                                                                          | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `compression`                                                                                                                                  | *Object*                                                                                                                                       | :heavy_minus_sign:                                                                                                                             | Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".csv.gz"). |
| `flattening`                                                                                                                                   | [DestinationS3FormatCSVCommaSeparatedValuesFlattening](../../models/shared/DestinationS3FormatCSVCommaSeparatedValuesFlattening.md)            | :heavy_check_mark:                                                                                                                             | Whether the input json data should be normalized (flattened) in the output CSV. Please refer to docs for details.                              |
| `formatType`                                                                                                                                   | [DestinationS3FormatCSVCommaSeparatedValuesFormatType](../../models/shared/DestinationS3FormatCSVCommaSeparatedValuesFormatType.md)            | :heavy_check_mark:                                                                                                                             | N/A                                                                                                                                            |
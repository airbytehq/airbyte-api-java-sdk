# SourceSftpBulkParquetFormat


## Fields

| Field                                                                                                                                                             | Type                                                                                                                                                              | Required                                                                                                                                                          | Description                                                                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `decimalAsFloat`                                                                                                                                                  | *Optional<? extends Boolean>*                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                | Whether to convert decimal fields to floats. There is a loss of precision when converting decimals to floats, so this is not recommended.                         |
| `filetype`                                                                                                                                                        | [Optional<? extends com.airbyte.api.models.shared.SourceSftpBulkSchemasStreamsFormatFiletype>](../../models/shared/SourceSftpBulkSchemasStreamsFormatFiletype.md) | :heavy_minus_sign:                                                                                                                                                | N/A                                                                                                                                                               |
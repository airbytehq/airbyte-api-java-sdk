# StreamMapping

Describes the relationship between a source stream and a destination table and how to update the information.


## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `destinationTable`                                                                         | *String*                                                                                   | :heavy_check_mark:                                                                         | The name for the table to update the data in the destination.                              |
| `sourceStream`                                                                             | *String*                                                                                   | :heavy_check_mark:                                                                         | The name for the input stream.                                                             |
| `updateMode`                                                                               | [UpdateMode](../../models/shared/UpdateMode.md)                                            | :heavy_check_mark:                                                                         | How to update the data in the destination.                                                 |
| `upsertKey`                                                                                | *Optional\<String>*                                                                        | :heavy_minus_sign:                                                                         | Given the operation is an upsert, a field representing an external ID needs to be provided |
# SourceDixa

The values required to configure the source.


## Fields

| Field                                                       | Type                                                        | Required                                                    | Description                                                 | Example                                                     |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `apiToken`                                                  | *String*                                                    | :heavy_check_mark:                                          | Dixa API token                                              |                                                             |
| `batchSize`                                                 | *Long*                                                      | :heavy_minus_sign:                                          | Number of days to batch into one request. Max 31.           | 1                                                           |
| `sourceType`                                                | [SourceDixaDixa](../../models/shared/SourceDixaDixa.md)     | :heavy_check_mark:                                          | N/A                                                         |                                                             |
| `startDate`                                                 | *String*                                                    | :heavy_check_mark:                                          | The connector pulls records updated from this date onwards. | YYYY-MM-DD                                                  |
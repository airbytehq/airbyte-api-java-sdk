# SourceYounium

The values required to configure the source.


## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `legalEntity`                                                                       | *String*                                                                            | :heavy_check_mark:                                                                  | Legal Entity that data should be pulled from                                        |
| `password`                                                                          | *String*                                                                            | :heavy_check_mark:                                                                  | Account password for younium account API key                                        |
| `playground`                                                                        | *Boolean*                                                                           | :heavy_minus_sign:                                                                  | Property defining if connector is used against playground or production environment |
| `sourceType`                                                                        | [SourceYouniumYounium](../../models/shared/SourceYouniumYounium.md)                 | :heavy_check_mark:                                                                  | N/A                                                                                 |
| `username`                                                                          | *String*                                                                            | :heavy_check_mark:                                                                  | Username for Younium account                                                        |
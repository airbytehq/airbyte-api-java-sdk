# SourcePolygonStockApi

The values required to configure the source.


## Fields

| Field                                                                                                                                                                               | Type                                                                                                                                                                                | Required                                                                                                                                                                            | Description                                                                                                                                                                         | Example                                                                                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `adjusted`                                                                                                                                                                          | *String*                                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                  | Determines whether or not the results are adjusted for splits. By default, results are adjusted and set to true. Set this to false to get results that are NOT adjusted for splits. | true                                                                                                                                                                                |
| `apiKey`                                                                                                                                                                            | *String*                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                  | Your API ACCESS Key                                                                                                                                                                 |                                                                                                                                                                                     |
| `endDate`                                                                                                                                                                           | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)                                                                                                     | :heavy_check_mark:                                                                                                                                                                  | The target date for the aggregate window.                                                                                                                                           | 2020-10-14                                                                                                                                                                          |
| `limit`                                                                                                                                                                             | *Long*                                                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                                  | The target date for the aggregate window.                                                                                                                                           | 100                                                                                                                                                                                 |
| `multiplier`                                                                                                                                                                        | *Long*                                                                                                                                                                              | :heavy_check_mark:                                                                                                                                                                  | The size of the timespan multiplier.                                                                                                                                                | 1                                                                                                                                                                                   |
| `sort`                                                                                                                                                                              | *String*                                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                  | Sort the results by timestamp. asc will return results in ascending order (oldest at the top), desc will return results in descending order (newest at the top).                    | asc                                                                                                                                                                                 |
| `sourceType`                                                                                                                                                                        | [SourcePolygonStockApiPolygonStockApi](../../models/shared/SourcePolygonStockApiPolygonStockApi.md)                                                                                 | :heavy_check_mark:                                                                                                                                                                  | N/A                                                                                                                                                                                 |                                                                                                                                                                                     |
| `startDate`                                                                                                                                                                         | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)                                                                                                     | :heavy_check_mark:                                                                                                                                                                  | The beginning date for the aggregate window.                                                                                                                                        | 2020-10-14                                                                                                                                                                          |
| `stocksTicker`                                                                                                                                                                      | *String*                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                  | The exchange symbol that this item is traded under.                                                                                                                                 | IBM                                                                                                                                                                                 |
| `timespan`                                                                                                                                                                          | *String*                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                  | The size of the time window.                                                                                                                                                        | day                                                                                                                                                                                 |
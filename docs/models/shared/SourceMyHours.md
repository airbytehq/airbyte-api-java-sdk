# SourceMyHours


## Fields

| Field                                            | Type                                             | Required                                         | Description                                      | Example                                          |
| ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ |
| `email`                                          | *String*                                         | :heavy_check_mark:                               | Your My Hours username                           | john@doe.com                                     |
| `logsBatchSize`                                  | *Optional\<Long>*                                | :heavy_minus_sign:                               | Pagination size used for retrieving logs in days | 30                                               |
| `password`                                       | *String*                                         | :heavy_check_mark:                               | The password associated to the username          |                                                  |
| `sourceType`                                     | [MyHours](../../models/shared/MyHours.md)        | :heavy_check_mark:                               | N/A                                              |                                                  |
| `startDate`                                      | *String*                                         | :heavy_check_mark:                               | Start date for collecting time logs              | %Y-%m-%d                                         |
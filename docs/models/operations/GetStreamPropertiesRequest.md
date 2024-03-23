# GetStreamPropertiesRequest


## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `destinationId`                                                                      | *String*                                                                             | :heavy_check_mark:                                                                   | ID of the destination                                                                |
| `ignoreCache`                                                                        | *Optional<? extends Boolean>*                                                        | :heavy_minus_sign:                                                                   | If true pull the latest schema from the source, else pull from cache (default false) |
| `sourceId`                                                                           | *String*                                                                             | :heavy_check_mark:                                                                   | ID of the source                                                                     |
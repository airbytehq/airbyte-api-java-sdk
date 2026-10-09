# FreePlan


## Fields

| Field                                                                 | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `contactsRateLimit`                                                   | *JsonNullable\<Long>*                                                 | :heavy_minus_sign:                                                    | Maximum Rate in Limit/minute for contacts list endpoint in Free Plan  |
| `generalRateLimit`                                                    | *JsonNullable\<Long>*                                                 | :heavy_minus_sign:                                                    | General Maximum Rate in Limit/minute for other endpoints in Free Plan |
| `planType`                                                            | [Optional\<Plan>](../../models/shared/Plan.md)                        | :heavy_minus_sign:                                                    | N/A                                                                   |
| `ticketsRateLimit`                                                    | *JsonNullable\<Long>*                                                 | :heavy_minus_sign:                                                    | Maximum Rate in Limit/minute for tickets list endpoint in Free Plan   |
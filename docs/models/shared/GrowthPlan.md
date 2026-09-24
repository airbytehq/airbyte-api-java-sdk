# GrowthPlan


## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `contactsRateLimit`                                                          | *JsonNullable\<Long>*                                                        | :heavy_minus_sign:                                                           | Maximum Rate in Limit/minute for contacts list endpoint in Growth Plan       |
| `generalRateLimit`                                                           | *JsonNullable\<Long>*                                                        | :heavy_minus_sign:                                                           | General Maximum Rate in Limit/minute for other endpoints in Growth Plan      |
| `planType`                                                                   | [Optional\<SourceFreshdeskPlan>](../../models/shared/SourceFreshdeskPlan.md) | :heavy_minus_sign:                                                           | N/A                                                                          |
| `ticketsRateLimit`                                                           | *JsonNullable\<Long>*                                                        | :heavy_minus_sign:                                                           | Maximum Rate in Limit/minute for tickets list endpoint in Growth Plan        |
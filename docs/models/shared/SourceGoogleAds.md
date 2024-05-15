# SourceGoogleAds


## Fields

| Field                                                                                                                                                                                                                                                                                                      | Type                                                                                                                                                                                                                                                                                                       | Required                                                                                                                                                                                                                                                                                                   | Description                                                                                                                                                                                                                                                                                                | Example                                                                                                                                                                                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `conversionWindowDays`                                                                                                                                                                                                                                                                                     | *Optional<? extends Long>*                                                                                                                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                                                                                                         | A conversion window is the number of days after an ad interaction (such as an ad click or video view) during which a conversion, such as a purchase, is recorded in Google Ads. For more information, see <a href="https://support.google.com/google-ads/answer/3123169?hl=en">Google's documentation</a>. | 14                                                                                                                                                                                                                                                                                                         |
| `credentials`                                                                                                                                                                                                                                                                                              | [com.airbyte.api.models.shared.GoogleCredentials](../../models/shared/GoogleCredentials.md)                                                                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                                                                                                         | N/A                                                                                                                                                                                                                                                                                                        |                                                                                                                                                                                                                                                                                                            |
| `customQueriesArray`                                                                                                                                                                                                                                                                                       | List<[com.airbyte.api.models.shared.CustomQueriesArray](../../models/shared/CustomQueriesArray.md)>                                                                                                                                                                                                        | :heavy_minus_sign:                                                                                                                                                                                                                                                                                         | N/A                                                                                                                                                                                                                                                                                                        |                                                                                                                                                                                                                                                                                                            |
| `customerId`                                                                                                                                                                                                                                                                                               | *Optional<? extends String>*                                                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                                                                         | Comma-separated list of (client) customer IDs. Each customer ID must be specified as a 10-digit number without dashes. For detailed instructions on finding this value, refer to our <a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide">documentation</a>.                     | 6783948572,5839201945                                                                                                                                                                                                                                                                                      |
| `customerStatusFilter`                                                                                                                                                                                                                                                                                     | List<[com.airbyte.api.models.shared.CustomerStatus](../../models/shared/CustomerStatus.md)>                                                                                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                                                                                                                                                         | A list of customer statuses to filter on. For detailed info about what each status mean refer to Google Ads <a href="https://developers.google.com/google-ads/api/reference/rpc/v15/CustomerStatusEnum.CustomerStatus">documentation</a>.                                                                  |                                                                                                                                                                                                                                                                                                            |
| `endDate`                                                                                                                                                                                                                                                                                                  | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)                                                                                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                                                                                                                                         | UTC date in the format YYYY-MM-DD. Any data after this date will not be replicated. (Default value of today is used if not set)                                                                                                                                                                            | 2017-01-30                                                                                                                                                                                                                                                                                                 |
| `sourceType`                                                                                                                                                                                                                                                                                               | [com.airbyte.api.models.shared.SourceGoogleAdsGoogleAds](../../models/shared/SourceGoogleAdsGoogleAds.md)                                                                                                                                                                                                  | :heavy_check_mark:                                                                                                                                                                                                                                                                                         | N/A                                                                                                                                                                                                                                                                                                        |                                                                                                                                                                                                                                                                                                            |
| `startDate`                                                                                                                                                                                                                                                                                                | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)                                                                                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                                                                                                                                         | UTC date in the format YYYY-MM-DD. Any data before this date will not be replicated. (Default value of two years ago is used if not set)                                                                                                                                                                   | 2017-01-25                                                                                                                                                                                                                                                                                                 |
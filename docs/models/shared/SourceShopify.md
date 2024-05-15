# SourceShopify


## Fields

| Field                                                                                                                                                            | Type                                                                                                                                                             | Required                                                                                                                                                         | Description                                                                                                                                                      | Example                                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `bulkWindowInDays`                                                                                                                                               | *Optional<? extends Long>*                                                                                                                                       | :heavy_minus_sign:                                                                                                                                               | Defines what would be a date range per single BULK Job                                                                                                           |                                                                                                                                                                  |
| `credentials`                                                                                                                                                    | [Optional<? extends com.airbyte.api.models.shared.ShopifyAuthorizationMethod>](../../models/shared/ShopifyAuthorizationMethod.md)                                | :heavy_minus_sign:                                                                                                                                               | The authorization method to use to retrieve data from Shopify                                                                                                    |                                                                                                                                                                  |
| `fetchTransactionsUserId`                                                                                                                                        | *Optional<? extends Boolean>*                                                                                                                                    | :heavy_minus_sign:                                                                                                                                               | Defines which API type (REST/BULK) to use to fetch `Transactions` data. If you are a `Shopify Plus` user, leave the default value to speed up the fetch.         |                                                                                                                                                                  |
| `shop`                                                                                                                                                           | *String*                                                                                                                                                         | :heavy_check_mark:                                                                                                                                               | The name of your Shopify store found in the URL. For example, if your URL was https://NAME.myshopify.com, then the name would be 'NAME' or 'NAME.myshopify.com'. | my-store                                                                                                                                                         |
| `sourceType`                                                                                                                                                     | [com.airbyte.api.models.shared.SourceShopifyShopify](../../models/shared/SourceShopifyShopify.md)                                                                | :heavy_check_mark:                                                                                                                                               | N/A                                                                                                                                                              |                                                                                                                                                                  |
| `startDate`                                                                                                                                                      | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)                                                                                  | :heavy_minus_sign:                                                                                                                                               | The date you would like to replicate data from. Format: YYYY-MM-DD. Any data before this date will not be replicated.                                            |                                                                                                                                                                  |
# SourceNewsApi


## Fields

| Field                                                                                                                                                                                                                                             | Type                                                                                                                                                                                                                                              | Required                                                                                                                                                                                                                                          | Description                                                                                                                                                                                                                                       | Example                                                                                                                                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `apiKey`                                                                                                                                                                                                                                          | *String*                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                | API Key                                                                                                                                                                                                                                           |                                                                                                                                                                                                                                                   |
| `category`                                                                                                                                                                                                                                        | [Optional\<Category>](../../models/shared/Category.md)                                                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                                                                                | The category you want to get top headlines for.                                                                                                                                                                                                   |                                                                                                                                                                                                                                                   |
| `country`                                                                                                                                                                                                                                         | [Optional\<Country>](../../models/shared/Country.md)                                                                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                                                                                                | The 2-letter ISO 3166-1 code of the country you want to get headlines<br/>for. You can't mix this with the sources parameter.<br/>                                                                                                                |                                                                                                                                                                                                                                                   |
| `domains`                                                                                                                                                                                                                                         | List\<*String*>                                                                                                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                                                                                                | A comma-seperated string of domains (eg bbc.co.uk, techcrunch.com,<br/>engadget.com) to restrict the search to.<br/>                                                                                                                              |                                                                                                                                                                                                                                                   |
| `endDate`                                                                                                                                                                                                                                         | *Optional\<String>*                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                | A date and optional time for the newest article allowed. This should<br/>be in ISO 8601 format.<br/>                                                                                                                                              | 2021-01-01                                                                                                                                                                                                                                        |
| `excludeDomains`                                                                                                                                                                                                                                  | List\<*String*>                                                                                                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                                                                                                | A comma-seperated string of domains (eg bbc.co.uk, techcrunch.com,<br/>engadget.com) to remove from the results.<br/>                                                                                                                             |                                                                                                                                                                                                                                                   |
| `language`                                                                                                                                                                                                                                        | [Optional\<Language>](../../models/shared/Language.md)                                                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                                                                                | The 2-letter ISO-639-1 code of the language you want to get headlines<br/>for. Possible options: ar de en es fr he it nl no pt ru se ud zh.<br/>                                                                                                  |                                                                                                                                                                                                                                                   |
| `searchIn`                                                                                                                                                                                                                                        | List\<[SearchIn](../../models/shared/SearchIn.md)>                                                                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                                                                                                | Where to apply search query. Possible values are: title, description,<br/>content.<br/>                                                                                                                                                           |                                                                                                                                                                                                                                                   |
| `searchQuery`                                                                                                                                                                                                                                     | *Optional\<String>*                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                | Search query. See https://newsapi.org/docs/endpoints/everything for <br/>information.<br/>                                                                                                                                                        | +bitcoin OR +crypto                                                                                                                                                                                                                               |
| `sortBy`                                                                                                                                                                                                                                          | [Optional\<SortBy>](../../models/shared/SortBy.md)                                                                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                                                                                                | The order to sort the articles in. Possible options: relevancy,<br/>popularity, publishedAt.<br/>                                                                                                                                                 |                                                                                                                                                                                                                                                   |
| `sourceType`                                                                                                                                                                                                                                      | [NewsApi](../../models/shared/NewsApi.md)                                                                                                                                                                                                         | :heavy_check_mark:                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                               |                                                                                                                                                                                                                                                   |
| `sources`                                                                                                                                                                                                                                         | List\<*String*>                                                                                                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                                                                                                | Identifiers (maximum 20) for the news sources or blogs you want<br/>headlines from. Use the `/sources` endpoint to locate these<br/>programmatically or look at the sources index:<br/>https://newsapi.com/sources. Will override both country and category.<br/> |                                                                                                                                                                                                                                                   |
| `startDate`                                                                                                                                                                                                                                       | *Optional\<String>*                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                | A date and optional time for the oldest article allowed. This should<br/>be in ISO 8601 format.<br/>                                                                                                                                              | 2021-01-01                                                                                                                                                                                                                                        |
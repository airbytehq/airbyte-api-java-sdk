# SourceAlgolia


## Fields

| Field                                                                                                                                                          | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `apiKey`                                                                                                                                                       | *String*                                                                                                                                                       | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            |
| `applicationId`                                                                                                                                                | *String*                                                                                                                                                       | :heavy_check_mark:                                                                                                                                             | The application ID for your application found in settings                                                                                                      |
| `objectId`                                                                                                                                                     | *Optional<? extends String>*                                                                                                                                   | :heavy_minus_sign:                                                                                                                                             | Object ID within index for search queries                                                                                                                      |
| `searchQuery`                                                                                                                                                  | *Optional<? extends String>*                                                                                                                                   | :heavy_minus_sign:                                                                                                                                             | Search query to be used with indexes_query stream with format defined in `https://www.algolia.com/doc/rest-api/search/#tag/Search/operation/searchSingleIndex` |
| `sourceType`                                                                                                                                                   | [com.airbyte.api.models.shared.Algolia](../../models/shared/Algolia.md)                                                                                        | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            |
| `startDate`                                                                                                                                                    | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                                                      | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            |
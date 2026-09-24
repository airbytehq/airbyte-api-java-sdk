# SourceElasticsearchApiKeySecret

Use a api key and secret combination to authenticate


## Fields

| Field                                                                                       | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `additionalProperties`                                                                      | Map\<String, *Object*>                                                                      | :heavy_minus_sign:                                                                          | N/A                                                                                         |
| `apiKeyId`                                                                                  | *String*                                                                                    | :heavy_check_mark:                                                                          | The Key ID to used when accessing an enterprise Elasticsearch instance.                     |
| `apiKeySecret`                                                                              | *String*                                                                                    | :heavy_check_mark:                                                                          | The secret associated with the API Key ID.                                                  |
| `method`                                                                                    | [SourceElasticsearchSchemasMethod](../../models/shared/SourceElasticsearchSchemasMethod.md) | :heavy_check_mark:                                                                          | N/A                                                                                         |
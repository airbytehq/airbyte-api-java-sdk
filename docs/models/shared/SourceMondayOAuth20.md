# SourceMondayOAuth20


## Fields

| Field                                                                                             | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `accessToken`                                                                                     | *String*                                                                                          | :heavy_check_mark:                                                                                | Access Token for making authenticated requests.                                                   |
| `authType`                                                                                        | [com.airbyte.api.models.shared.SourceMondayAuthType](../../models/shared/SourceMondayAuthType.md) | :heavy_check_mark:                                                                                | N/A                                                                                               |
| `clientId`                                                                                        | *String*                                                                                          | :heavy_check_mark:                                                                                | The Client ID of your OAuth application.                                                          |
| `clientSecret`                                                                                    | *String*                                                                                          | :heavy_check_mark:                                                                                | The Client Secret of your OAuth application.                                                      |
| `subdomain`                                                                                       | *Optional<? extends String>*                                                                      | :heavy_minus_sign:                                                                                | Slug/subdomain of the account, or the first part of the URL that comes before .monday.com         |
# OAuth20


## Fields

| Field                                                                         | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `authMethod`                                                                  | [SourcePinterestAuthMethod](../../models/shared/SourcePinterestAuthMethod.md) | :heavy_check_mark:                                                            | N/A                                                                           |
| `clientId`                                                                    | *String*                                                                      | :heavy_check_mark:                                                            | The Client ID of your OAuth application                                       |
| `clientSecret`                                                                | *String*                                                                      | :heavy_check_mark:                                                            | The Client Secret of your OAuth application.                                  |
| `refreshToken`                                                                | *String*                                                                      | :heavy_check_mark:                                                            | Refresh Token to obtain new Access Token, when it's expired.                  |
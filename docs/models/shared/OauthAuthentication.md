# OauthAuthentication


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `authType`                                                          | [SourceSquareAuthType](../../models/shared/SourceSquareAuthType.md) | :heavy_check_mark:                                                  | N/A                                                                 |
| `clientId`                                                          | *String*                                                            | :heavy_check_mark:                                                  | The Square-issued ID of your application                            |
| `clientSecret`                                                      | *String*                                                            | :heavy_check_mark:                                                  | The Square-issued application secret for your application           |
| `refreshToken`                                                      | *String*                                                            | :heavy_check_mark:                                                  | A refresh token generated using the above client ID and secret      |
# SourcePinterestCredentialsOAuth20


## Fields

| Field                                                                                                             | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `authMethod`                                                                                                      | [SourcePinterestCredentialsOAuth20AuthMethod](../../models/shared/SourcePinterestCredentialsOAuth20AuthMethod.md) | :heavy_check_mark:                                                                                                | N/A                                                                                                               |
| `clientId`                                                                                                        | *String*                                                                                                          | :heavy_minus_sign:                                                                                                | The Client ID of your OAuth application                                                                           |
| `clientSecret`                                                                                                    | *String*                                                                                                          | :heavy_minus_sign:                                                                                                | The Client Secret of your OAuth application.                                                                      |
| `refreshToken`                                                                                                    | *String*                                                                                                          | :heavy_check_mark:                                                                                                | Refresh Token to obtain new Access Token, when it's expired.                                                      |
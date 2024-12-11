# SourceSnowflakeOAuth20


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `accessToken`                                                             | *Optional\<String>*                                                       | :heavy_minus_sign:                                                        | Access Token for making authenticated requests.                           |
| `authType`                                                                | [SourceSnowflakeAuthType](../../models/shared/SourceSnowflakeAuthType.md) | :heavy_check_mark:                                                        | N/A                                                                       |
| `clientId`                                                                | *String*                                                                  | :heavy_check_mark:                                                        | The Client ID of your Snowflake developer application.                    |
| `clientSecret`                                                            | *String*                                                                  | :heavy_check_mark:                                                        | The Client Secret of your Snowflake developer application.                |
| `refreshToken`                                                            | *Optional\<String>*                                                       | :heavy_minus_sign:                                                        | Refresh Token for making authenticated requests.                          |
# AuthenticateViaOAuth20


## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `additionalProperties`                                         | Map\<String, *Object*>                                         | :heavy_minus_sign:                                             | N/A                                                            |
| `clientId`                                                     | *String*                                                       | :heavy_check_mark:                                             | The Client ID of your developer application                    |
| `clientSecret`                                                 | *String*                                                       | :heavy_check_mark:                                             | The client secret of your developer application                |
| `refreshToken`                                                 | *String*                                                       | :heavy_check_mark:                                             | A refresh token generated using the above client ID and secret |
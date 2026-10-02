# SourceOutlook


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `clientId`                                                                | *String*                                                                  | :heavy_check_mark:                                                        | The Client ID of your Microsoft Azure application                         |
| `clientSecret`                                                            | *String*                                                                  | :heavy_check_mark:                                                        | The Client Secret of your Microsoft Azure application                     |
| `refreshToken`                                                            | *String*                                                                  | :heavy_check_mark:                                                        | Refresh token obtained from Microsoft OAuth flow                          |
| `sourceType`                                                              | [Outlook](../../models/shared/Outlook.md)                                 | :heavy_check_mark:                                                        | N/A                                                                       |
| `tenantId`                                                                | *Optional\<String>*                                                       | :heavy_minus_sign:                                                        | Azure AD Tenant ID (optional for multi-tenant apps, defaults to 'common') |
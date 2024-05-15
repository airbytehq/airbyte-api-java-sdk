# SourceGoogleDirectory


## Fields

| Field                                                                                                                                                                                                                                                                                                                                                        | Type                                                                                                                                                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `credentials`                                                                                                                                                                                                                                                                                                                                                | [Optional<? extends com.airbyte.api.models.shared.SourceGoogleDirectoryGoogleCredentials>](../../models/shared/SourceGoogleDirectoryGoogleCredentials.md)                                                                                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                           | Google APIs use the OAuth 2.0 protocol for authentication and authorization. The Source supports <a href="https://developers.google.com/identity/protocols/oauth2#webserver" target="_blank">Web server application</a> and <a href="https://developers.google.com/identity/protocols/oauth2#serviceaccount" target="_blank">Service accounts</a> scenarios. |
| `sourceType`                                                                                                                                                                                                                                                                                                                                                 | [com.airbyte.api.models.shared.GoogleDirectory](../../models/shared/GoogleDirectory.md)                                                                                                                                                                                                                                                                      | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                                                                                                                                                          |
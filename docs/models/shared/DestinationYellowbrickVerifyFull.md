# DestinationYellowbrickVerifyFull

Verify-full SSL mode.


## Fields

| Field                                                                                                                                                                           | Type                                                                                                                                                                            | Required                                                                                                                                                                        | Description                                                                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `caCertificate`                                                                                                                                                                 | *String*                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                              | CA certificate                                                                                                                                                                  |
| `clientCertificate`                                                                                                                                                             | *String*                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                              | Client certificate                                                                                                                                                              |
| `clientKey`                                                                                                                                                                     | *String*                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                              | Client key                                                                                                                                                                      |
| `clientKeyPassword`                                                                                                                                                             | *Optional<? extends String>*                                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                              | Password for keystorage. This field is optional. If you do not add it - the password will be generated automatically.                                                           |
| `mode`                                                                                                                                                                          | [Optional<? extends com.airbyte.api.models.shared.DestinationYellowbrickSchemasSSLModeSSLModes6Mode>](../../models/shared/DestinationYellowbrickSchemasSSLModeSSLModes6Mode.md) | :heavy_minus_sign:                                                                                                                                                              | N/A                                                                                                                                                                             |
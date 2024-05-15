# SourceSftpSSHKeyAuthentication


## Fields

| Field                                                                                                               | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `authMethod`                                                                                                        | [com.airbyte.api.models.shared.SourceSftpSchemasAuthMethod](../../models/shared/SourceSftpSchemasAuthMethod.md)     | :heavy_check_mark:                                                                                                  | Connect through ssh key                                                                                             |
| `authSshKey`                                                                                                        | *String*                                                                                                            | :heavy_check_mark:                                                                                                  | OS-level user account ssh key credentials in RSA PEM format ( created with ssh-keygen -t rsa -m PEM -f myuser_rsa ) |
# AuthenticateViaAccessKeys


## Fields

| Field                                                                                   | Type                                                                                    | Required                                                                                | Description                                                                             | Example                                                                                 |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `additionalProperties`                                                                  | Map\<String, *Object*>                                                                  | :heavy_minus_sign:                                                                      | N/A                                                                                     |                                                                                         |
| `accessKeyId`                                                                           | *String*                                                                                | :heavy_check_mark:                                                                      | The access key id to access Dynamodb. Airbyte requires read permissions to the database | A012345678910EXAMPLE                                                                    |
| `authType`                                                                              | [Optional\<SourceDynamodbAuthType>](../../models/shared/SourceDynamodbAuthType.md)      | :heavy_minus_sign:                                                                      | N/A                                                                                     |                                                                                         |
| `secretAccessKey`                                                                       | *String*                                                                                | :heavy_check_mark:                                                                      | The corresponding secret to the access key id.                                          | a012345678910ABCDEFGH/AbCdEfGhEXAMPLEKEY                                                |
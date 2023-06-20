# WorkspaceOAuthCredentialsRequest

POST body for creating/updating workspace level OAuth credentials


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `actorType`                                                      | [ActorTypeEnum](../../models/shared/ActorTypeEnum.md)            | :heavy_check_mark:                                               | Whether you're setting this override for a source or destination |
| `configuration`                                                  | *Object*                                                         | :heavy_check_mark:                                               | The values required to configure the source.                     |
| `sourceType`                                                     | [OAuthActorNames](../../models/shared/OAuthActorNames.md)        | :heavy_minus_sign:                                               | N/A                                                              |
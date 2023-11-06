# WorkspaceOAuthCredentialsRequest

POST body for creating/updating workspace level OAuth credentials


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      | Example                                                          |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `actorType`                                                      | [ActorTypeEnum](../../models/shared/ActorTypeEnum.md)            | :heavy_check_mark:                                               | Whether you're setting this override for a source or destination |                                                                  |
| `configuration`                                                  | *Object*                                                         | :heavy_check_mark:                                               | The values required to configure the source.                     | [object Object]                                                  |
| `name`                                                           | [OAuthActorNames](../../models/shared/OAuthActorNames.md)        | :heavy_check_mark:                                               | N/A                                                              |                                                                  |
# OrganizationOAuthCredentialsRequest

POST body for creating/updating organization level OAuth credentials


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `actorType`                                                      | [ActorTypeEnum](../../models/shared/ActorTypeEnum.md)            | :heavy_check_mark:                                               | Whether you're setting this override for a source or destination |
| `configuration`                                                  | *Object*                                                         | :heavy_check_mark:                                               | The values required to configure the source.                     |
| `name`                                                           | *String*                                                         | :heavy_check_mark:                                               | The name of the source i.e. google-ads                           |
# WorkspaceCreateRequest


## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `name`                                                                       | *String*                                                                     | :heavy_check_mark:                                                           | Name of the workspace                                                        |
| `notifications`                                                              | [Optional\<NotificationsConfig>](../../models/shared/NotificationsConfig.md) | :heavy_minus_sign:                                                           | Configures workspace notifications.                                          |
| `organizationId`                                                             | *Optional\<String>*                                                          | :heavy_minus_sign:                                                           | ID of organization to add workspace to.                                      |
| `regionId`                                                                   | *Optional\<String>*                                                          | :heavy_minus_sign:                                                           | N/A                                                                          |
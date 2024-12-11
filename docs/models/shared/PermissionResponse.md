# PermissionResponse

Provides details of a single permission.


## Fields

| Field                                                       | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `organizationId`                                            | *Optional\<String>*                                         | :heavy_minus_sign:                                          | N/A                                                         |
| `permissionId`                                              | *String*                                                    | :heavy_check_mark:                                          | N/A                                                         |
| `permissionType`                                            | [PermissionType](../../models/shared/PermissionType.md)     | :heavy_check_mark:                                          | Describes what actions/endpoints the permission entitles to |
| `userId`                                                    | *String*                                                    | :heavy_check_mark:                                          | Internal Airbyte user ID                                    |
| `workspaceId`                                               | *Optional\<String>*                                         | :heavy_minus_sign:                                          | N/A                                                         |
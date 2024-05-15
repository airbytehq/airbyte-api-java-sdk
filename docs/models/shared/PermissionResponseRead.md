# PermissionResponseRead

Reformat PermissionResponse with permission scope


## Fields

| Field                                                                                   | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `permissionId`                                                                          | *String*                                                                                | :heavy_check_mark:                                                                      | N/A                                                                                     |
| `permissionType`                                                                        | [com.airbyte.api.models.shared.PermissionType](../../models/shared/PermissionType.md)   | :heavy_check_mark:                                                                      | Describes what actions/endpoints the permission entitles to                             |
| `scope`                                                                                 | [com.airbyte.api.models.shared.PermissionScope](../../models/shared/PermissionScope.md) | :heavy_check_mark:                                                                      | Scope of a single permission, e.g. workspace, organization                              |
| `scopeId`                                                                               | *String*                                                                                | :heavy_check_mark:                                                                      | N/A                                                                                     |
| `userId`                                                                                | *String*                                                                                | :heavy_check_mark:                                                                      | Internal Airbyte user ID                                                                |
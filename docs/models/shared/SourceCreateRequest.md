# SourceCreateRequest


## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `configuration`                                                        | *Object*                                                               | :heavy_check_mark:                                                     | The values required to configure the source.                           |
| `name`                                                                 | *String*                                                               | :heavy_check_mark:                                                     | N/A                                                                    |
| `secretId`                                                             | *String*                                                               | :heavy_minus_sign:                                                     | Optional secretID obtained through the public API OAuth redirect flow. |
| `workspaceId`                                                          | *String*                                                               | :heavy_check_mark:                                                     | N/A                                                                    |
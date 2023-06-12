# SourceOrbit

The values required to configure the source.


## Fields

| Field                                                                                       | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `apiToken`                                                                                  | *String*                                                                                    | :heavy_check_mark:                                                                          | Authorizes you to work with Orbit workspaces associated with the token.                     |
| `sourceType`                                                                                | [SourceOrbitOrbit](../../models/shared/SourceOrbitOrbit.md)                                 | :heavy_check_mark:                                                                          | N/A                                                                                         |
| `startDate`                                                                                 | *String*                                                                                    | :heavy_minus_sign:                                                                          | Date in the format 2022-06-26. Only load members whose last activities are after this date. |
| `workspace`                                                                                 | *String*                                                                                    | :heavy_check_mark:                                                                          | The unique name of the workspace that your API token is associated with.                    |
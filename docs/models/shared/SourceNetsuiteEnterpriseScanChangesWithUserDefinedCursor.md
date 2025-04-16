# SourceNetsuiteEnterpriseScanChangesWithUserDefinedCursor

Incrementally detects new inserts and updates using the <a href="https://docs.airbyte.com/understanding-airbyte/connections/incremental-append/#user-defined-cursor">cursor column</a> chosen when configuring a connection (e.g. created_at, updated_at).


## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `additionalProperties`                                         | Map\<String, *Object*>                                         | :heavy_minus_sign:                                             | N/A                                                            |
| `cursorMethod`                                                 | [Optional\<CursorMethod>](../../models/shared/CursorMethod.md) | :heavy_minus_sign:                                             | N/A                                                            |
# SourceFaunaCollectionDeletionsEnabled

<b>This only applies to incremental syncs.</b> <br>
Enabling deletion mode informs your destination of deleted documents.<br>
Disabled - Leave this feature disabled, and ignore deleted documents.<br>
Enabled - Enables this feature. When a document is deleted, the connector exports a record with a "deleted at" column containing the time that the document was deleted.


## Fields

| Field                                                                                                                         | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `column`                                                                                                                      | *String*                                                                                                                      | :heavy_minus_sign:                                                                                                            | Name of the "deleted at" column.                                                                                              |
| `deletionMode`                                                                                                                | [SourceFaunaCollectionDeletionsEnabledDeletionMode](../../models/shared/SourceFaunaCollectionDeletionsEnabledDeletionMode.md) | :heavy_check_mark:                                                                                                            | N/A                                                                                                                           |
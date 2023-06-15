# SourceFaunaCollection

Settings for the Fauna Collection.


## Fields

| Field                                                                                                                                                                                                                                                                                                                                                                            | Type                                                                                                                                                                                                                                                                                                                                                                             | Required                                                                                                                                                                                                                                                                                                                                                                         | Description                                                                                                                                                                                                                                                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `deletions`                                                                                                                                                                                                                                                                                                                                                                      | *Object*                                                                                                                                                                                                                                                                                                                                                                         | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                               | <b>This only applies to incremental syncs.</b> <br><br/>Enabling deletion mode informs your destination of deleted documents.<br><br/>Disabled - Leave this feature disabled, and ignore deleted documents.<br><br/>Enabled - Enables this feature. When a document is deleted, the connector exports a record with a "deleted at" column containing the time that the document was deleted. |
| `pageSize`                                                                                                                                                                                                                                                                                                                                                                       | *Long*                                                                                                                                                                                                                                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                               | The page size used when reading documents from the database. The larger the page size, the faster the connector processes documents. However, if a page is too large, the connector may fail. <br><br/>Choose your page size based on how large the documents are. <br><br/>See <a href="https://docs.fauna.com/fauna/current/learn/understanding/types#page">the docs</a>.      |
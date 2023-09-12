# DestinationMilvusIndexing

Indexing configuration


## Fields

| Field                                                   | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `auth`                                                  | *Object*                                                | :heavy_check_mark:                                      | Authentication method                                   |                                                         |
| `collection`                                            | *String*                                                | :heavy_check_mark:                                      | The collection to load data into                        |                                                         |
| `db`                                                    | *String*                                                | :heavy_minus_sign:                                      | The database to connect to                              |                                                         |
| `host`                                                  | *String*                                                | :heavy_check_mark:                                      | The public endpoint of the Milvus instance.             | https://my-instance.zone.zillizcloud.com                |
| `textField`                                             | *String*                                                | :heavy_minus_sign:                                      | The field in the entity that contains the embedded text |                                                         |
| `vectorField`                                           | *String*                                                | :heavy_minus_sign:                                      | The field in the entity that contains the vector        |                                                         |
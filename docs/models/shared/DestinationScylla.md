# DestinationScylla

The values required to configure the destination.


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `address`                                                                 | *String*                                                                  | :heavy_check_mark:                                                        | Address to connect to.                                                    |
| `destinationType`                                                         | [DestinationScyllaScylla](../../models/shared/DestinationScyllaScylla.md) | :heavy_check_mark:                                                        | N/A                                                                       |
| `keyspace`                                                                | *String*                                                                  | :heavy_check_mark:                                                        | Default Scylla keyspace to create data in.                                |
| `password`                                                                | *String*                                                                  | :heavy_check_mark:                                                        | Password associated with Scylla.                                          |
| `port`                                                                    | *Long*                                                                    | :heavy_check_mark:                                                        | Port of Scylla.                                                           |
| `replication`                                                             | *Long*                                                                    | :heavy_minus_sign:                                                        | Indicates to how many nodes the data should be replicated to.             |
| `username`                                                                | *String*                                                                  | :heavy_check_mark:                                                        | Username to use to access Scylla.                                         |
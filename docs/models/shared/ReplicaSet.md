# ReplicaSet


## Fields

| Field                                                                                                                             | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       | Example                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `instance`                                                                                                                        | [Optional<? extends com.airbyte.api.models.shared.DestinationMongodbInstance>](../../models/shared/DestinationMongodbInstance.md) | :heavy_minus_sign:                                                                                                                | N/A                                                                                                                               |                                                                                                                                   |
| `replicaSet`                                                                                                                      | *Optional<? extends String>*                                                                                                      | :heavy_minus_sign:                                                                                                                | A replica set name.                                                                                                               |                                                                                                                                   |
| `serverAddresses`                                                                                                                 | *String*                                                                                                                          | :heavy_check_mark:                                                                                                                | The members of a replica set. Please specify `host`:`port` of each member seperated by comma.                                     | host1:27017,host2:27017,host3:27017                                                                                               |
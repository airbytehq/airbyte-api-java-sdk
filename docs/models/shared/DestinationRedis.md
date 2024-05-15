# DestinationRedis


## Fields

| Field                                                                                                                                                             | Type                                                                                                                                                              | Required                                                                                                                                                          | Description                                                                                                                                                       | Example                                                                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `cacheType`                                                                                                                                                       | [Optional<? extends com.airbyte.api.models.shared.CacheType>](../../models/shared/CacheType.md)                                                                   | :heavy_minus_sign:                                                                                                                                                | Redis cache type to store data in.                                                                                                                                |                                                                                                                                                                   |
| `destinationType`                                                                                                                                                 | [com.airbyte.api.models.shared.Redis](../../models/shared/Redis.md)                                                                                               | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               |                                                                                                                                                                   |
| `host`                                                                                                                                                            | *String*                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                | Redis host to connect to.                                                                                                                                         | localhost,127.0.0.1                                                                                                                                               |
| `password`                                                                                                                                                        | *Optional<? extends String>*                                                                                                                                      | :heavy_minus_sign:                                                                                                                                                | Password associated with Redis.                                                                                                                                   |                                                                                                                                                                   |
| `port`                                                                                                                                                            | *Optional<? extends Long>*                                                                                                                                        | :heavy_minus_sign:                                                                                                                                                | Port of Redis.                                                                                                                                                    |                                                                                                                                                                   |
| `ssl`                                                                                                                                                             | *Optional<? extends Boolean>*                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                | Indicates whether SSL encryption protocol will be used to connect to Redis. It is recommended to use SSL connection if possible.                                  |                                                                                                                                                                   |
| `sslMode`                                                                                                                                                         | [Optional<? extends com.airbyte.api.models.shared.DestinationRedisSSLModes>](../../models/shared/DestinationRedisSSLModes.md)                                     | :heavy_minus_sign:                                                                                                                                                | SSL connection modes. <br/>  <li><b>verify-full</b> - This is the most secure mode. Always require encryption and verifies the identity of the source database server |                                                                                                                                                                   |
| `tunnelMethod`                                                                                                                                                    | [Optional<? extends com.airbyte.api.models.shared.DestinationRedisSSHTunnelMethod>](../../models/shared/DestinationRedisSSHTunnelMethod.md)                       | :heavy_minus_sign:                                                                                                                                                | Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.                                              |                                                                                                                                                                   |
| `username`                                                                                                                                                        | *String*                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                | Username associated with Redis.                                                                                                                                   |                                                                                                                                                                   |
# ReadChangesUsingWriteAheadLogCDC

<i>Recommended</i> - Incrementally reads new inserts, updates, and deletes using the Postgres <a href="https://docs.airbyte.com/integrations/sources/postgres/#cdc">write-ahead log (WAL)</a>. This needs to be configured on the source database itself. Recommended for tables of any size.


## Fields

| Field                                                                                                                                                                                                                                                                                                                                                               | Type                                                                                                                                                                                                                                                                                                                                                                | Required                                                                                                                                                                                                                                                                                                                                                            | Description                                                                                                                                                                                                                                                                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `additionalProperties`                                                                                                                                                                                                                                                                                                                                              | Map\<String, *Object*>                                                                                                                                                                                                                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                  | N/A                                                                                                                                                                                                                                                                                                                                                                 |
| `heartbeatActionQuery`                                                                                                                                                                                                                                                                                                                                              | *Optional\<String>*                                                                                                                                                                                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                  | Specifies a query that the connector executes on the source database when the connector sends a heartbeat message. Please see the <a href="https://docs.airbyte.com/integrations/sources/postgres/postgres-troubleshooting#advanced-wal-disk-consumption-and-heartbeat-action-query">setup guide</a> for how and when to configure this setting.                    |
| `initialLoadTimeoutHours`                                                                                                                                                                                                                                                                                                                                           | *Optional\<Long>*                                                                                                                                                                                                                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                  | The amount of time an initial load is allowed to continue for before catching up on CDC logs.                                                                                                                                                                                                                                                                       |
| `initialWaitingSeconds`                                                                                                                                                                                                                                                                                                                                             | *Optional\<Long>*                                                                                                                                                                                                                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                  | The amount of time the connector will wait when it launches to determine if there is new data to sync or not. Defaults to 1200 seconds. Valid range: 120 seconds to 2400 seconds. Read about <a href="https://docs.airbyte.com/integrations/sources/postgres/postgres-troubleshooting#advanced-setting-up-initial-cdc-waiting-time">initial waiting time</a>.       |
| `invalidCdcCursorPositionBehavior`                                                                                                                                                                                                                                                                                                                                  | [Optional\<SourcePostgresInvalidCDCPositionBehaviorAdvanced>](../../models/shared/SourcePostgresInvalidCDCPositionBehaviorAdvanced.md)                                                                                                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                  | Determines whether Airbyte should fail or re-sync data in case of an stale/invalid cursor value into the WAL. If 'Fail sync' is chosen, a user will have to manually reset the connection before being able to continue syncing data. If 'Re-sync data' is chosen, Airbyte will automatically trigger a refresh but could lead to higher cloud costs and data loss. |
| `lsnCommitBehaviour`                                                                                                                                                                                                                                                                                                                                                | [Optional\<LSNCommitBehaviour>](../../models/shared/LSNCommitBehaviour.md)                                                                                                                                                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                  | Determines when Airbyte should flush the LSN of processed WAL logs in the source database. `After loading Data in the destination` is default. If `While reading Data` is selected, in case of a downstream failure (while loading data into the destination), next sync would result in a full sync.                                                               |
| `method`                                                                                                                                                                                                                                                                                                                                                            | [SourcePostgresMethod](../../models/shared/SourcePostgresMethod.md)                                                                                                                                                                                                                                                                                                 | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                  | N/A                                                                                                                                                                                                                                                                                                                                                                 |
| `plugin`                                                                                                                                                                                                                                                                                                                                                            | [Optional\<Plugin>](../../models/shared/Plugin.md)                                                                                                                                                                                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                  | A logical decoding plugin installed on the PostgreSQL server.                                                                                                                                                                                                                                                                                                       |
| `publication`                                                                                                                                                                                                                                                                                                                                                       | *String*                                                                                                                                                                                                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                  | A Postgres publication used for consuming changes. Read about <a href="https://docs.airbyte.com/integrations/sources/postgres#step-4-create-publications-and-replication-identities-for-tables">publications and replication identities</a>.                                                                                                                        |
| `queueSize`                                                                                                                                                                                                                                                                                                                                                         | *Optional\<Long>*                                                                                                                                                                                                                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                  | The size of the internal queue. This may interfere with memory consumption and efficiency of the connector, please be careful.                                                                                                                                                                                                                                      |
| `replicationSlot`                                                                                                                                                                                                                                                                                                                                                   | *String*                                                                                                                                                                                                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                  | A plugin logical replication slot. Read about <a href="https://docs.airbyte.com/integrations/sources/postgres#step-3-create-replication-slot">replication slots</a>.                                                                                                                                                                                                |
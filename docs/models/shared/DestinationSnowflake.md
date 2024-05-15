# DestinationSnowflake


## Fields

| Field                                                                                                                                                                                                                                                                                                         | Type                                                                                                                                                                                                                                                                                                          | Required                                                                                                                                                                                                                                                                                                      | Description                                                                                                                                                                                                                                                                                                   | Example                                                                                                                                                                                                                                                                                                       |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `credentials`                                                                                                                                                                                                                                                                                                 | [Optional<? extends com.airbyte.api.models.shared.AuthorizationMethod>](../../models/shared/AuthorizationMethod.md)                                                                                                                                                                                           | :heavy_minus_sign:                                                                                                                                                                                                                                                                                            | N/A                                                                                                                                                                                                                                                                                                           |                                                                                                                                                                                                                                                                                                               |
| `database`                                                                                                                                                                                                                                                                                                    | *String*                                                                                                                                                                                                                                                                                                      | :heavy_check_mark:                                                                                                                                                                                                                                                                                            | Enter the name of the <a href="https://docs.snowflake.com/en/sql-reference/ddl-database.html#database-schema-share-ddl">database</a> you want to sync data into                                                                                                                                               | AIRBYTE_DATABASE                                                                                                                                                                                                                                                                                              |
| `destinationType`                                                                                                                                                                                                                                                                                             | [com.airbyte.api.models.shared.DestinationSnowflakeSnowflake](../../models/shared/DestinationSnowflakeSnowflake.md)                                                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                                                                                                                                                            | N/A                                                                                                                                                                                                                                                                                                           |                                                                                                                                                                                                                                                                                                               |
| `disableTypeDedupe`                                                                                                                                                                                                                                                                                           | *Optional<? extends Boolean>*                                                                                                                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                                                                                                            | Disable Writing Final Tables. WARNING! The data format in _airbyte_data is likely stable but there are no guarantees that other metadata columns will remain the same in future versions                                                                                                                      |                                                                                                                                                                                                                                                                                                               |
| `host`                                                                                                                                                                                                                                                                                                        | *String*                                                                                                                                                                                                                                                                                                      | :heavy_check_mark:                                                                                                                                                                                                                                                                                            | Enter your Snowflake account's <a href="https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#using-an-account-locator-as-an-identifier">locator</a> (in the format <account_locator>.<region>.<cloud>.snowflakecomputing.com)                                                               | accountname.us-east-2.aws.snowflakecomputing.com                                                                                                                                                                                                                                                              |
| `jdbcUrlParams`                                                                                                                                                                                                                                                                                               | *Optional<? extends String>*                                                                                                                                                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                                                                                                                                                            | Enter the additional properties to pass to the JDBC URL string when connecting to the database (formatted as key=value pairs separated by the symbol &). Example: key1=value1&key2=value2&key3=value3                                                                                                         |                                                                                                                                                                                                                                                                                                               |
| `rawDataSchema`                                                                                                                                                                                                                                                                                               | *Optional<? extends String>*                                                                                                                                                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                                                                                                                                                            | The schema to write raw tables into (default: airbyte_internal)                                                                                                                                                                                                                                               |                                                                                                                                                                                                                                                                                                               |
| `retentionPeriodDays`                                                                                                                                                                                                                                                                                         | *Optional<? extends Long>*                                                                                                                                                                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                                                                                                                                                            | The number of days of Snowflake Time Travel to enable on the tables. See <a href="https://docs.snowflake.com/en/user-guide/data-time-travel#data-retention-period">Snowflake's documentation</a> for more information. Setting a nonzero value will incur increased storage costs in your Snowflake instance. |                                                                                                                                                                                                                                                                                                               |
| `role`                                                                                                                                                                                                                                                                                                        | *String*                                                                                                                                                                                                                                                                                                      | :heavy_check_mark:                                                                                                                                                                                                                                                                                            | Enter the <a href="https://docs.snowflake.com/en/user-guide/security-access-control-overview.html#roles">role</a> that you want to use to access Snowflake                                                                                                                                                    | AIRBYTE_ROLE                                                                                                                                                                                                                                                                                                  |
| `schema`                                                                                                                                                                                                                                                                                                      | *String*                                                                                                                                                                                                                                                                                                      | :heavy_check_mark:                                                                                                                                                                                                                                                                                            | Enter the name of the default <a href="https://docs.snowflake.com/en/sql-reference/ddl-database.html#database-schema-share-ddl">schema</a>                                                                                                                                                                    | AIRBYTE_SCHEMA                                                                                                                                                                                                                                                                                                |
| `username`                                                                                                                                                                                                                                                                                                    | *String*                                                                                                                                                                                                                                                                                                      | :heavy_check_mark:                                                                                                                                                                                                                                                                                            | Enter the name of the user you want to use to access the database                                                                                                                                                                                                                                             | AIRBYTE_USER                                                                                                                                                                                                                                                                                                  |
| `warehouse`                                                                                                                                                                                                                                                                                                   | *String*                                                                                                                                                                                                                                                                                                      | :heavy_check_mark:                                                                                                                                                                                                                                                                                            | Enter the name of the <a href="https://docs.snowflake.com/en/user-guide/warehouses-overview.html#overview-of-warehouses">warehouse</a> that you want to sync data into                                                                                                                                        | AIRBYTE_WAREHOUSE                                                                                                                                                                                                                                                                                             |
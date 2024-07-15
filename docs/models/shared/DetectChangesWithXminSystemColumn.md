# DetectChangesWithXminSystemColumn

<i>Recommended</i> - Incrementally reads new inserts and updates via Postgres <a href="https://docs.airbyte.com/integrations/sources/postgres/#xmin">Xmin system column</a>. Suitable for databases that have low transaction pressure.


## Fields

| Field                                                                                             | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `method`                                                                                          | [com.airbyte.api.models.shared.SourcePostgresMethod](../../models/shared/SourcePostgresMethod.md) | :heavy_check_mark:                                                                                | N/A                                                                                               |
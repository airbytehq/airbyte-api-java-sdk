# SourceFaker


## Fields

| Field                                                                                                                                                                                 | Type                                                                                                                                                                                  | Required                                                                                                                                                                              | Description                                                                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `alwaysUpdated`                                                                                                                                                                       | *Optional<? extends Boolean>*                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                    | Should the updated_at values for every record be new each sync?  Setting this to false will case the source to stop emitting records after COUNT records have been emitted.           |
| `count`                                                                                                                                                                               | *Optional<? extends Long>*                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                    | How many users should be generated in total. The purchases table will be scaled to match, with 10 purchases created per 10 users. This setting does not apply to the products stream. |
| `parallelism`                                                                                                                                                                         | *Optional<? extends Long>*                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                    | How many parallel workers should we use to generate fake data?  Choose a value equal to the number of CPUs you will allocate to this source.                                          |
| `recordsPerSlice`                                                                                                                                                                     | *Optional<? extends Long>*                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                    | How many fake records will be in each page (stream slice), before a state message is emitted?                                                                                         |
| `seed`                                                                                                                                                                                | *Optional<? extends Long>*                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                    | Manually control the faker random seed to return the same values on subsequent runs (leave -1 for random)                                                                             |
| `sourceType`                                                                                                                                                                          | [com.airbyte.api.models.shared.Faker](../../models/shared/Faker.md)                                                                                                                   | :heavy_check_mark:                                                                                                                                                                    | N/A                                                                                                                                                                                   |
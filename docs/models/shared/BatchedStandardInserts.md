# BatchedStandardInserts

Direct loading using batched SQL INSERT statements. This method uses the BigQuery driver to convert large INSERT statements into file uploads automatically.


## Fields

| Field                                              | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `additionalProperties`                             | Map\<String, *Object*>                             | :heavy_minus_sign:                                 | N/A                                                |
| `method`                                           | [Optional\<Method>](../../models/shared/Method.md) | :heavy_minus_sign:                                 | N/A                                                |
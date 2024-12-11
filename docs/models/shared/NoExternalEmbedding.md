# NoExternalEmbedding

Do not calculate and pass embeddings to Weaviate. Suitable for clusters with configured vectorizers to calculate embeddings within Weaviate or for classes that should only support regular text search.


## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `mode`                                                                               | [Optional\<DestinationWeaviateMode>](../../models/shared/DestinationWeaviateMode.md) | :heavy_minus_sign:                                                                   | N/A                                                                                  |
# SourceSftpBulkReplicateRecords

Recommended - Extract and load structured records into your destination of choice. This is the classic method of moving data in Airbyte. It allows for blocking and hashing individual fields or files from a structured schema. Data can be flattened, typed and deduped depending on the destination.


## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `deliveryType`                                                                             | [Optional\<SourceSftpBulkDeliveryType>](../../models/shared/SourceSftpBulkDeliveryType.md) | :heavy_minus_sign:                                                                         | N/A                                                                                        |
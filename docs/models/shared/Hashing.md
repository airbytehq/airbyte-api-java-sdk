# Hashing


## Fields

| Field                                                 | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `fieldNameSuffix`                                     | *String*                                              | :heavy_check_mark:                                    | The suffix to append to the field name after hashing. |
| `method`                                              | [HashingMethod](../../models/shared/HashingMethod.md) | :heavy_check_mark:                                    | The hashing algorithm to use.                         |
| `targetField`                                         | *String*                                              | :heavy_check_mark:                                    | The name of the field to be hashed.                   |
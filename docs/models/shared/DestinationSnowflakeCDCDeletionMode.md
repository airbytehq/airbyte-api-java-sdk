# DestinationSnowflakeCDCDeletionMode

Whether to execute CDC deletions as hard deletes (i.e. propagate source deletions to the destination), or soft deletes (i.e. leave a tombstone record in the destination). Defaults to hard deletes.

## Example Usage

```java
import com.airbyte.api.models.shared.DestinationSnowflakeCDCDeletionMode;

DestinationSnowflakeCDCDeletionMode value = DestinationSnowflakeCDCDeletionMode.HARD_DELETE;
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `HARD_DELETE` | Hard delete   |
| `SOFT_DELETE` | Soft delete   |
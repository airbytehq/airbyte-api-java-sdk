# SourceSharepointEnterpriseValidationPolicy

The name of the validation policy that dictates sync behavior when a record does not adhere to the stream schema.

## Example Usage

```java
import com.airbyte.api.models.shared.SourceSharepointEnterpriseValidationPolicy;

SourceSharepointEnterpriseValidationPolicy value = SourceSharepointEnterpriseValidationPolicy.EMIT_RECORD;
```


## Values

| Name                | Value               |
| ------------------- | ------------------- |
| `EMIT_RECORD`       | Emit Record         |
| `SKIP_RECORD`       | Skip Record         |
| `WAIT_FOR_DISCOVER` | Wait for Discover   |
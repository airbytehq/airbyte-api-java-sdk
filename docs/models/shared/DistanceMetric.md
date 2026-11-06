# DistanceMetric

The Distance metric used to measure similarities among vectors. This field is only used if the collection defined in the does not exist yet and is created automatically by the connector.

## Example Usage

```java
import com.airbyte.api.models.shared.DistanceMetric;

DistanceMetric value = DistanceMetric.DOT;
```


## Values

| Name  | Value |
| ----- | ----- |
| `DOT` | dot   |
| `COS` | cos   |
| `EUC` | euc   |
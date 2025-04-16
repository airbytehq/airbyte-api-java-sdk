/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * SourceSftpBulkReplicateRecords
 * 
 * <p>Recommended - Extract and load structured records into your destination of choice. This is the classic method of moving data in Airbyte. It allows for blocking and hashing individual fields or files from a structured schema. Data can be flattened, typed and deduped depending on the destination.
 */
public class SourceSftpBulkReplicateRecords {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("delivery_type")
    private Optional<? extends SourceSftpBulkDeliveryType> deliveryType;

    @JsonCreator
    public SourceSftpBulkReplicateRecords() {
        
        this.deliveryType = Builder._SINGLETON_VALUE_DeliveryType.value();
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceSftpBulkDeliveryType> deliveryType() {
        return (Optional<SourceSftpBulkDeliveryType>) deliveryType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SourceSftpBulkReplicateRecords other = (SourceSftpBulkReplicateRecords) o;
        return 
            Objects.deepEquals(this.deliveryType, other.deliveryType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            deliveryType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSftpBulkReplicateRecords.class,
                "deliveryType", deliveryType);
    }
    
    public final static class Builder {
        
        private Builder() {
          // force use of static builder() method
        }
        
        public SourceSftpBulkReplicateRecords build() {
            return new SourceSftpBulkReplicateRecords(
                );
        }

        private static final LazySingletonValue<Optional<? extends SourceSftpBulkDeliveryType>> _SINGLETON_VALUE_DeliveryType =
                new LazySingletonValue<>(
                        "delivery_type",
                        "\"use_records_transfer\"",
                        new TypeReference<Optional<? extends SourceSftpBulkDeliveryType>>() {});
    }
}

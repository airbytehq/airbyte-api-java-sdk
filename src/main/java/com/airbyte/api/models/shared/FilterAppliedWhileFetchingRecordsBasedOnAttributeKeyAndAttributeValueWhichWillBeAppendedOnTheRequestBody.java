/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attribute_key")
    private Optional<? extends String> attributeKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attribute_value")
    private Optional<? extends String> attributeValue;

    @JsonCreator
    public FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody(
            @JsonProperty("attribute_key") Optional<? extends String> attributeKey,
            @JsonProperty("attribute_value") Optional<? extends String> attributeValue) {
        Utils.checkNotNull(attributeKey, "attributeKey");
        Utils.checkNotNull(attributeValue, "attributeValue");
        this.attributeKey = attributeKey;
        this.attributeValue = attributeValue;
    }
    
    public FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> attributeKey() {
        return (Optional<String>) attributeKey;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> attributeValue() {
        return (Optional<String>) attributeValue;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody withAttributeKey(String attributeKey) {
        Utils.checkNotNull(attributeKey, "attributeKey");
        this.attributeKey = Optional.ofNullable(attributeKey);
        return this;
    }

    public FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody withAttributeKey(Optional<? extends String> attributeKey) {
        Utils.checkNotNull(attributeKey, "attributeKey");
        this.attributeKey = attributeKey;
        return this;
    }

    public FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody withAttributeValue(String attributeValue) {
        Utils.checkNotNull(attributeValue, "attributeValue");
        this.attributeValue = Optional.ofNullable(attributeValue);
        return this;
    }

    public FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody withAttributeValue(Optional<? extends String> attributeValue) {
        Utils.checkNotNull(attributeValue, "attributeValue");
        this.attributeValue = attributeValue;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody other = (FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody) o;
        return 
            java.util.Objects.deepEquals(this.attributeKey, other.attributeKey) &&
            java.util.Objects.deepEquals(this.attributeValue, other.attributeValue);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            attributeKey,
            attributeValue);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody.class,
                "attributeKey", attributeKey,
                "attributeValue", attributeValue);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> attributeKey;
 
        private Optional<? extends String> attributeValue;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder attributeKey(String attributeKey) {
            Utils.checkNotNull(attributeKey, "attributeKey");
            this.attributeKey = Optional.ofNullable(attributeKey);
            return this;
        }

        public Builder attributeKey(Optional<? extends String> attributeKey) {
            Utils.checkNotNull(attributeKey, "attributeKey");
            this.attributeKey = attributeKey;
            return this;
        }

        public Builder attributeValue(String attributeValue) {
            Utils.checkNotNull(attributeValue, "attributeValue");
            this.attributeValue = Optional.ofNullable(attributeValue);
            return this;
        }

        public Builder attributeValue(Optional<? extends String> attributeValue) {
            Utils.checkNotNull(attributeValue, "attributeValue");
            this.attributeValue = attributeValue;
            return this;
        }
        
        public FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody build() {
            if (attributeKey == null) {
                attributeKey = _SINGLETON_VALUE_AttributeKey.value();
            }
            if (attributeValue == null) {
                attributeValue = _SINGLETON_VALUE_AttributeValue.value();
            }
            return new FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody(
                attributeKey,
                attributeValue);
        }

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_AttributeKey =
                new LazySingletonValue<>(
                        "attribute_key",
                        "\"EventName\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_AttributeValue =
                new LazySingletonValue<>(
                        "attribute_value",
                        "\"ListInstanceAssociations\"",
                        new TypeReference<Optional<? extends String>>() {});
    }
}


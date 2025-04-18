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
import java.util.Objects;
import java.util.Optional;

public class FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attribute_key")
    private Optional<String> attributeKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attribute_value")
    private Optional<String> attributeValue;

    @JsonCreator
    public FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody(
            @JsonProperty("attribute_key") Optional<String> attributeKey,
            @JsonProperty("attribute_value") Optional<String> attributeValue) {
        Utils.checkNotNull(attributeKey, "attributeKey");
        Utils.checkNotNull(attributeValue, "attributeValue");
        this.attributeKey = attributeKey;
        this.attributeValue = attributeValue;
    }
    
    public FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> attributeKey() {
        return attributeKey;
    }

    @JsonIgnore
    public Optional<String> attributeValue() {
        return attributeValue;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody withAttributeKey(String attributeKey) {
        Utils.checkNotNull(attributeKey, "attributeKey");
        this.attributeKey = Optional.ofNullable(attributeKey);
        return this;
    }

    public FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody withAttributeKey(Optional<String> attributeKey) {
        Utils.checkNotNull(attributeKey, "attributeKey");
        this.attributeKey = attributeKey;
        return this;
    }

    public FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody withAttributeValue(String attributeValue) {
        Utils.checkNotNull(attributeValue, "attributeValue");
        this.attributeValue = Optional.ofNullable(attributeValue);
        return this;
    }

    public FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody withAttributeValue(Optional<String> attributeValue) {
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
            Objects.deepEquals(this.attributeKey, other.attributeKey) &&
            Objects.deepEquals(this.attributeValue, other.attributeValue);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Optional<String> attributeKey;
 
        private Optional<String> attributeValue;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder attributeKey(String attributeKey) {
            Utils.checkNotNull(attributeKey, "attributeKey");
            this.attributeKey = Optional.ofNullable(attributeKey);
            return this;
        }

        public Builder attributeKey(Optional<String> attributeKey) {
            Utils.checkNotNull(attributeKey, "attributeKey");
            this.attributeKey = attributeKey;
            return this;
        }

        public Builder attributeValue(String attributeValue) {
            Utils.checkNotNull(attributeValue, "attributeValue");
            this.attributeValue = Optional.ofNullable(attributeValue);
            return this;
        }

        public Builder attributeValue(Optional<String> attributeValue) {
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

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_AttributeKey =
                new LazySingletonValue<>(
                        "attribute_key",
                        "\"EventName\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_AttributeValue =
                new LazySingletonValue<>(
                        "attribute_value",
                        "\"ListInstanceAssociations\"",
                        new TypeReference<Optional<String>>() {});
    }
}

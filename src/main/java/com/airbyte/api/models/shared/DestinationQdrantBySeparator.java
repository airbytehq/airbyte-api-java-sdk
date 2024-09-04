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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * DestinationQdrantBySeparator - Split the text by the list of separators until the chunk size is reached, using the earlier mentioned separators where possible. This is useful for splitting text fields by paragraphs, sentences, words, etc.
 */

public class DestinationQdrantBySeparator {

    /**
     * Whether to keep the separator in the resulting chunks
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("keep_separator")
    private Optional<Boolean> keepSeparator;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends DestinationQdrantSchemasProcessingMode> mode;

    /**
     * List of separator strings to split text fields by. The separator itself needs to be wrapped in double quotes, e.g. to split by the dot character, use ".". To split by a newline, use "\n".
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("separators")
    private Optional<? extends List<String>> separators;

    @JsonCreator
    public DestinationQdrantBySeparator(
            @JsonProperty("keep_separator") Optional<Boolean> keepSeparator,
            @JsonProperty("separators") Optional<? extends List<String>> separators) {
        Utils.checkNotNull(keepSeparator, "keepSeparator");
        Utils.checkNotNull(separators, "separators");
        this.keepSeparator = keepSeparator;
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
        this.separators = separators;
    }
    
    public DestinationQdrantBySeparator() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * Whether to keep the separator in the resulting chunks
     */
    @JsonIgnore
    public Optional<Boolean> keepSeparator() {
        return keepSeparator;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationQdrantSchemasProcessingMode> mode() {
        return (Optional<DestinationQdrantSchemasProcessingMode>) mode;
    }

    /**
     * List of separator strings to split text fields by. The separator itself needs to be wrapped in double quotes, e.g. to split by the dot character, use ".". To split by a newline, use "\n".
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> separators() {
        return (Optional<List<String>>) separators;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Whether to keep the separator in the resulting chunks
     */
    public DestinationQdrantBySeparator withKeepSeparator(boolean keepSeparator) {
        Utils.checkNotNull(keepSeparator, "keepSeparator");
        this.keepSeparator = Optional.ofNullable(keepSeparator);
        return this;
    }

    /**
     * Whether to keep the separator in the resulting chunks
     */
    public DestinationQdrantBySeparator withKeepSeparator(Optional<Boolean> keepSeparator) {
        Utils.checkNotNull(keepSeparator, "keepSeparator");
        this.keepSeparator = keepSeparator;
        return this;
    }

    /**
     * List of separator strings to split text fields by. The separator itself needs to be wrapped in double quotes, e.g. to split by the dot character, use ".". To split by a newline, use "\n".
     */
    public DestinationQdrantBySeparator withSeparators(List<String> separators) {
        Utils.checkNotNull(separators, "separators");
        this.separators = Optional.ofNullable(separators);
        return this;
    }

    /**
     * List of separator strings to split text fields by. The separator itself needs to be wrapped in double quotes, e.g. to split by the dot character, use ".". To split by a newline, use "\n".
     */
    public DestinationQdrantBySeparator withSeparators(Optional<? extends List<String>> separators) {
        Utils.checkNotNull(separators, "separators");
        this.separators = separators;
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
        DestinationQdrantBySeparator other = (DestinationQdrantBySeparator) o;
        return 
            Objects.deepEquals(this.keepSeparator, other.keepSeparator) &&
            Objects.deepEquals(this.mode, other.mode) &&
            Objects.deepEquals(this.separators, other.separators);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            keepSeparator,
            mode,
            separators);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationQdrantBySeparator.class,
                "keepSeparator", keepSeparator,
                "mode", mode,
                "separators", separators);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> keepSeparator;
 
        private Optional<? extends List<String>> separators = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Whether to keep the separator in the resulting chunks
         */
        public Builder keepSeparator(boolean keepSeparator) {
            Utils.checkNotNull(keepSeparator, "keepSeparator");
            this.keepSeparator = Optional.ofNullable(keepSeparator);
            return this;
        }

        /**
         * Whether to keep the separator in the resulting chunks
         */
        public Builder keepSeparator(Optional<Boolean> keepSeparator) {
            Utils.checkNotNull(keepSeparator, "keepSeparator");
            this.keepSeparator = keepSeparator;
            return this;
        }

        /**
         * List of separator strings to split text fields by. The separator itself needs to be wrapped in double quotes, e.g. to split by the dot character, use ".". To split by a newline, use "\n".
         */
        public Builder separators(List<String> separators) {
            Utils.checkNotNull(separators, "separators");
            this.separators = Optional.ofNullable(separators);
            return this;
        }

        /**
         * List of separator strings to split text fields by. The separator itself needs to be wrapped in double quotes, e.g. to split by the dot character, use ".". To split by a newline, use "\n".
         */
        public Builder separators(Optional<? extends List<String>> separators) {
            Utils.checkNotNull(separators, "separators");
            this.separators = separators;
            return this;
        }
        
        public DestinationQdrantBySeparator build() {
            if (keepSeparator == null) {
                keepSeparator = _SINGLETON_VALUE_KeepSeparator.value();
            }            return new DestinationQdrantBySeparator(
                keepSeparator,
                separators);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_KeepSeparator =
                new LazySingletonValue<>(
                        "keep_separator",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});

        private static final LazySingletonValue<Optional<? extends DestinationQdrantSchemasProcessingMode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"separator\"",
                        new TypeReference<Optional<? extends DestinationQdrantSchemasProcessingMode>>() {});
    }
}


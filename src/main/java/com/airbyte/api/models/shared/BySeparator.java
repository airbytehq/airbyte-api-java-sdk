/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

/**
 * BySeparator - Split the text by the list of separators until the chunk size is reached, using the earlier mentioned separators where possible. This is useful for splitting text fields by paragraphs, sentences, words, etc.
 */

public class BySeparator {

    /**
     * Whether to keep the separator in the resulting chunks
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("keep_separator")
    private Optional<? extends Boolean> keepSeparator;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends DestinationAstraSchemasProcessingMode> mode;

    /**
     * List of separator strings to split text fields by. The separator itself needs to be wrapped in double quotes, e.g. to split by the dot character, use ".". To split by a newline, use "\n".
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("separators")
    private Optional<? extends java.util.List<String>> separators;

    public BySeparator(
            @JsonProperty("keep_separator") Optional<? extends Boolean> keepSeparator,
            @JsonProperty("separators") Optional<? extends java.util.List<String>> separators) {
        Utils.checkNotNull(keepSeparator, "keepSeparator");
        Utils.checkNotNull(separators, "separators");
        this.keepSeparator = keepSeparator;
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
        this.separators = separators;
    }

    /**
     * Whether to keep the separator in the resulting chunks
     */
    public Optional<? extends Boolean> keepSeparator() {
        return keepSeparator;
    }

    public Optional<? extends DestinationAstraSchemasProcessingMode> mode() {
        return mode;
    }

    /**
     * List of separator strings to split text fields by. The separator itself needs to be wrapped in double quotes, e.g. to split by the dot character, use ".". To split by a newline, use "\n".
     */
    public Optional<? extends java.util.List<String>> separators() {
        return separators;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Whether to keep the separator in the resulting chunks
     */
    public BySeparator withKeepSeparator(boolean keepSeparator) {
        Utils.checkNotNull(keepSeparator, "keepSeparator");
        this.keepSeparator = Optional.ofNullable(keepSeparator);
        return this;
    }

    /**
     * Whether to keep the separator in the resulting chunks
     */
    public BySeparator withKeepSeparator(Optional<? extends Boolean> keepSeparator) {
        Utils.checkNotNull(keepSeparator, "keepSeparator");
        this.keepSeparator = keepSeparator;
        return this;
    }

    /**
     * List of separator strings to split text fields by. The separator itself needs to be wrapped in double quotes, e.g. to split by the dot character, use ".". To split by a newline, use "\n".
     */
    public BySeparator withSeparators(java.util.List<String> separators) {
        Utils.checkNotNull(separators, "separators");
        this.separators = Optional.ofNullable(separators);
        return this;
    }

    /**
     * List of separator strings to split text fields by. The separator itself needs to be wrapped in double quotes, e.g. to split by the dot character, use ".". To split by a newline, use "\n".
     */
    public BySeparator withSeparators(Optional<? extends java.util.List<String>> separators) {
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
        BySeparator other = (BySeparator) o;
        return 
            java.util.Objects.deepEquals(this.keepSeparator, other.keepSeparator) &&
            java.util.Objects.deepEquals(this.mode, other.mode) &&
            java.util.Objects.deepEquals(this.separators, other.separators);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            keepSeparator,
            mode,
            separators);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BySeparator.class,
                "keepSeparator", keepSeparator,
                "mode", mode,
                "separators", separators);
    }
    
    public final static class Builder {
 
        private Optional<? extends Boolean> keepSeparator;
 
        private Optional<? extends java.util.List<String>> separators = Optional.empty();  
        
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
        public Builder keepSeparator(Optional<? extends Boolean> keepSeparator) {
            Utils.checkNotNull(keepSeparator, "keepSeparator");
            this.keepSeparator = keepSeparator;
            return this;
        }

        /**
         * List of separator strings to split text fields by. The separator itself needs to be wrapped in double quotes, e.g. to split by the dot character, use ".". To split by a newline, use "\n".
         */
        public Builder separators(java.util.List<String> separators) {
            Utils.checkNotNull(separators, "separators");
            this.separators = Optional.ofNullable(separators);
            return this;
        }

        /**
         * List of separator strings to split text fields by. The separator itself needs to be wrapped in double quotes, e.g. to split by the dot character, use ".". To split by a newline, use "\n".
         */
        public Builder separators(Optional<? extends java.util.List<String>> separators) {
            Utils.checkNotNull(separators, "separators");
            this.separators = separators;
            return this;
        }
        
        public BySeparator build() {
            if (keepSeparator == null) {
                keepSeparator = _SINGLETON_VALUE_KeepSeparator.value();
            }
            if (mode == null) {
                mode = _SINGLETON_VALUE_Mode.value();
            }
            return new BySeparator(
                keepSeparator,
                separators);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_KeepSeparator =
                new LazySingletonValue<>(
                        "keep_separator",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<Optional<? extends DestinationAstraSchemasProcessingMode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"separator\"",
                        new TypeReference<Optional<? extends DestinationAstraSchemasProcessingMode>>() {});
    }
}


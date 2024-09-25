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
/**
 * DestinationPgvectorByMarkdownHeader - Split the text by Markdown headers down to the specified header level. If the chunk size fits multiple sections, they will be combined into a single chunk.
 */

public class DestinationPgvectorByMarkdownHeader {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends DestinationPgvectorSchemasProcessingTextSplitterMode> mode;

    /**
     * Level of markdown headers to split text fields by. Headings down to the specified level will be used as split points
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("split_level")
    private Optional<? extends Long> splitLevel;

    @JsonCreator
    public DestinationPgvectorByMarkdownHeader(
            @JsonProperty("split_level") Optional<? extends Long> splitLevel) {
        Utils.checkNotNull(splitLevel, "splitLevel");
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
        this.splitLevel = splitLevel;
    }
    
    public DestinationPgvectorByMarkdownHeader() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationPgvectorSchemasProcessingTextSplitterMode> mode() {
        return (Optional<DestinationPgvectorSchemasProcessingTextSplitterMode>) mode;
    }

    /**
     * Level of markdown headers to split text fields by. Headings down to the specified level will be used as split points
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> splitLevel() {
        return (Optional<Long>) splitLevel;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Level of markdown headers to split text fields by. Headings down to the specified level will be used as split points
     */
    public DestinationPgvectorByMarkdownHeader withSplitLevel(long splitLevel) {
        Utils.checkNotNull(splitLevel, "splitLevel");
        this.splitLevel = Optional.ofNullable(splitLevel);
        return this;
    }

    /**
     * Level of markdown headers to split text fields by. Headings down to the specified level will be used as split points
     */
    public DestinationPgvectorByMarkdownHeader withSplitLevel(Optional<? extends Long> splitLevel) {
        Utils.checkNotNull(splitLevel, "splitLevel");
        this.splitLevel = splitLevel;
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
        DestinationPgvectorByMarkdownHeader other = (DestinationPgvectorByMarkdownHeader) o;
        return 
            java.util.Objects.deepEquals(this.mode, other.mode) &&
            java.util.Objects.deepEquals(this.splitLevel, other.splitLevel);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            mode,
            splitLevel);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationPgvectorByMarkdownHeader.class,
                "mode", mode,
                "splitLevel", splitLevel);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> splitLevel;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Level of markdown headers to split text fields by. Headings down to the specified level will be used as split points
         */
        public Builder splitLevel(long splitLevel) {
            Utils.checkNotNull(splitLevel, "splitLevel");
            this.splitLevel = Optional.ofNullable(splitLevel);
            return this;
        }

        /**
         * Level of markdown headers to split text fields by. Headings down to the specified level will be used as split points
         */
        public Builder splitLevel(Optional<? extends Long> splitLevel) {
            Utils.checkNotNull(splitLevel, "splitLevel");
            this.splitLevel = splitLevel;
            return this;
        }
        
        public DestinationPgvectorByMarkdownHeader build() {
            if (splitLevel == null) {
                splitLevel = _SINGLETON_VALUE_SplitLevel.value();
            }
            return new DestinationPgvectorByMarkdownHeader(
                splitLevel);
        }

        private static final LazySingletonValue<Optional<? extends DestinationPgvectorSchemasProcessingTextSplitterMode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"markdown\"",
                        new TypeReference<Optional<? extends DestinationPgvectorSchemasProcessingTextSplitterMode>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_SplitLevel =
                new LazySingletonValue<>(
                        "split_level",
                        "1",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}

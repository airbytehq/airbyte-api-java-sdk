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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * DestinationMilvusByMarkdownHeader
 * 
 * <p>Split the text by Markdown headers down to the specified header level. If the chunk size fits multiple sections, they will be combined into a single chunk.
 */
public class DestinationMilvusByMarkdownHeader {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends DestinationMilvusSchemasProcessingTextSplitterMode> mode;

    /**
     * Level of markdown headers to split text fields by. Headings down to the specified level will be used as split points
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("split_level")
    private Optional<Long> splitLevel;

    @JsonCreator
    public DestinationMilvusByMarkdownHeader(
            @JsonProperty("split_level") Optional<Long> splitLevel) {
        Utils.checkNotNull(splitLevel, "splitLevel");
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
        this.splitLevel = splitLevel;
    }
    
    public DestinationMilvusByMarkdownHeader() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationMilvusSchemasProcessingTextSplitterMode> mode() {
        return (Optional<DestinationMilvusSchemasProcessingTextSplitterMode>) mode;
    }

    /**
     * Level of markdown headers to split text fields by. Headings down to the specified level will be used as split points
     */
    @JsonIgnore
    public Optional<Long> splitLevel() {
        return splitLevel;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Level of markdown headers to split text fields by. Headings down to the specified level will be used as split points
     */
    public DestinationMilvusByMarkdownHeader withSplitLevel(long splitLevel) {
        Utils.checkNotNull(splitLevel, "splitLevel");
        this.splitLevel = Optional.ofNullable(splitLevel);
        return this;
    }

    /**
     * Level of markdown headers to split text fields by. Headings down to the specified level will be used as split points
     */
    public DestinationMilvusByMarkdownHeader withSplitLevel(Optional<Long> splitLevel) {
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
        DestinationMilvusByMarkdownHeader other = (DestinationMilvusByMarkdownHeader) o;
        return 
            Objects.deepEquals(this.mode, other.mode) &&
            Objects.deepEquals(this.splitLevel, other.splitLevel);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            mode,
            splitLevel);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationMilvusByMarkdownHeader.class,
                "mode", mode,
                "splitLevel", splitLevel);
    }
    
    public final static class Builder {
 
        private Optional<Long> splitLevel;
        
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
        public Builder splitLevel(Optional<Long> splitLevel) {
            Utils.checkNotNull(splitLevel, "splitLevel");
            this.splitLevel = splitLevel;
            return this;
        }
        
        public DestinationMilvusByMarkdownHeader build() {
            if (splitLevel == null) {
                splitLevel = _SINGLETON_VALUE_SplitLevel.value();
            }
            return new DestinationMilvusByMarkdownHeader(
                splitLevel);
        }

        private static final LazySingletonValue<Optional<? extends DestinationMilvusSchemasProcessingTextSplitterMode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"markdown\"",
                        new TypeReference<Optional<? extends DestinationMilvusSchemasProcessingTextSplitterMode>>() {});

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_SplitLevel =
                new LazySingletonValue<>(
                        "split_level",
                        "1",
                        new TypeReference<Optional<Long>>() {});
    }
}

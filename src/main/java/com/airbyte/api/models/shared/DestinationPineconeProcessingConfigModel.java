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
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class DestinationPineconeProcessingConfigModel {

    /**
     * Size of overlap between chunks in tokens to store in vector store to better capture relevant context
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("chunk_overlap")
    private Optional<Long> chunkOverlap;

    /**
     * Size of chunks in tokens to store in vector store (make sure it is not too big for the context if your LLM)
     */
    @JsonProperty("chunk_size")
    private long chunkSize;

    /**
     * List of fields to rename. Not applicable for nested fields, but can be used to rename fields already flattened via dot notation.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("field_name_mappings")
    private Optional<? extends List<DestinationPineconeFieldNameMappingConfigModel>> fieldNameMappings;

    /**
     * List of fields in the record that should be stored as metadata. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered metadata fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array. When specifying nested paths, all matching values are flattened into an array set to a field named by the path.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata_fields")
    private Optional<? extends List<String>> metadataFields;

    /**
     * List of fields in the record that should be used to calculate the embedding. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text_fields")
    private Optional<? extends List<String>> textFields;

    /**
     * Split text fields into chunks based on the specified method.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text_splitter")
    private Optional<? extends DestinationPineconeTextSplitter> textSplitter;

    @JsonCreator
    public DestinationPineconeProcessingConfigModel(
            @JsonProperty("chunk_overlap") Optional<Long> chunkOverlap,
            @JsonProperty("chunk_size") long chunkSize,
            @JsonProperty("field_name_mappings") Optional<? extends List<DestinationPineconeFieldNameMappingConfigModel>> fieldNameMappings,
            @JsonProperty("metadata_fields") Optional<? extends List<String>> metadataFields,
            @JsonProperty("text_fields") Optional<? extends List<String>> textFields,
            @JsonProperty("text_splitter") Optional<? extends DestinationPineconeTextSplitter> textSplitter) {
        Utils.checkNotNull(chunkOverlap, "chunkOverlap");
        Utils.checkNotNull(chunkSize, "chunkSize");
        Utils.checkNotNull(fieldNameMappings, "fieldNameMappings");
        Utils.checkNotNull(metadataFields, "metadataFields");
        Utils.checkNotNull(textFields, "textFields");
        Utils.checkNotNull(textSplitter, "textSplitter");
        this.chunkOverlap = chunkOverlap;
        this.chunkSize = chunkSize;
        this.fieldNameMappings = fieldNameMappings;
        this.metadataFields = metadataFields;
        this.textFields = textFields;
        this.textSplitter = textSplitter;
    }
    
    public DestinationPineconeProcessingConfigModel(
            long chunkSize) {
        this(Optional.empty(), chunkSize, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Size of overlap between chunks in tokens to store in vector store to better capture relevant context
     */
    @JsonIgnore
    public Optional<Long> chunkOverlap() {
        return chunkOverlap;
    }

    /**
     * Size of chunks in tokens to store in vector store (make sure it is not too big for the context if your LLM)
     */
    @JsonIgnore
    public long chunkSize() {
        return chunkSize;
    }

    /**
     * List of fields to rename. Not applicable for nested fields, but can be used to rename fields already flattened via dot notation.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<DestinationPineconeFieldNameMappingConfigModel>> fieldNameMappings() {
        return (Optional<List<DestinationPineconeFieldNameMappingConfigModel>>) fieldNameMappings;
    }

    /**
     * List of fields in the record that should be stored as metadata. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered metadata fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array. When specifying nested paths, all matching values are flattened into an array set to a field named by the path.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> metadataFields() {
        return (Optional<List<String>>) metadataFields;
    }

    /**
     * List of fields in the record that should be used to calculate the embedding. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> textFields() {
        return (Optional<List<String>>) textFields;
    }

    /**
     * Split text fields into chunks based on the specified method.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationPineconeTextSplitter> textSplitter() {
        return (Optional<DestinationPineconeTextSplitter>) textSplitter;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Size of overlap between chunks in tokens to store in vector store to better capture relevant context
     */
    public DestinationPineconeProcessingConfigModel withChunkOverlap(long chunkOverlap) {
        Utils.checkNotNull(chunkOverlap, "chunkOverlap");
        this.chunkOverlap = Optional.ofNullable(chunkOverlap);
        return this;
    }

    /**
     * Size of overlap between chunks in tokens to store in vector store to better capture relevant context
     */
    public DestinationPineconeProcessingConfigModel withChunkOverlap(Optional<Long> chunkOverlap) {
        Utils.checkNotNull(chunkOverlap, "chunkOverlap");
        this.chunkOverlap = chunkOverlap;
        return this;
    }

    /**
     * Size of chunks in tokens to store in vector store (make sure it is not too big for the context if your LLM)
     */
    public DestinationPineconeProcessingConfigModel withChunkSize(long chunkSize) {
        Utils.checkNotNull(chunkSize, "chunkSize");
        this.chunkSize = chunkSize;
        return this;
    }

    /**
     * List of fields to rename. Not applicable for nested fields, but can be used to rename fields already flattened via dot notation.
     */
    public DestinationPineconeProcessingConfigModel withFieldNameMappings(List<DestinationPineconeFieldNameMappingConfigModel> fieldNameMappings) {
        Utils.checkNotNull(fieldNameMappings, "fieldNameMappings");
        this.fieldNameMappings = Optional.ofNullable(fieldNameMappings);
        return this;
    }

    /**
     * List of fields to rename. Not applicable for nested fields, but can be used to rename fields already flattened via dot notation.
     */
    public DestinationPineconeProcessingConfigModel withFieldNameMappings(Optional<? extends List<DestinationPineconeFieldNameMappingConfigModel>> fieldNameMappings) {
        Utils.checkNotNull(fieldNameMappings, "fieldNameMappings");
        this.fieldNameMappings = fieldNameMappings;
        return this;
    }

    /**
     * List of fields in the record that should be stored as metadata. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered metadata fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array. When specifying nested paths, all matching values are flattened into an array set to a field named by the path.
     */
    public DestinationPineconeProcessingConfigModel withMetadataFields(List<String> metadataFields) {
        Utils.checkNotNull(metadataFields, "metadataFields");
        this.metadataFields = Optional.ofNullable(metadataFields);
        return this;
    }

    /**
     * List of fields in the record that should be stored as metadata. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered metadata fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array. When specifying nested paths, all matching values are flattened into an array set to a field named by the path.
     */
    public DestinationPineconeProcessingConfigModel withMetadataFields(Optional<? extends List<String>> metadataFields) {
        Utils.checkNotNull(metadataFields, "metadataFields");
        this.metadataFields = metadataFields;
        return this;
    }

    /**
     * List of fields in the record that should be used to calculate the embedding. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
     */
    public DestinationPineconeProcessingConfigModel withTextFields(List<String> textFields) {
        Utils.checkNotNull(textFields, "textFields");
        this.textFields = Optional.ofNullable(textFields);
        return this;
    }

    /**
     * List of fields in the record that should be used to calculate the embedding. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
     */
    public DestinationPineconeProcessingConfigModel withTextFields(Optional<? extends List<String>> textFields) {
        Utils.checkNotNull(textFields, "textFields");
        this.textFields = textFields;
        return this;
    }

    /**
     * Split text fields into chunks based on the specified method.
     */
    public DestinationPineconeProcessingConfigModel withTextSplitter(DestinationPineconeTextSplitter textSplitter) {
        Utils.checkNotNull(textSplitter, "textSplitter");
        this.textSplitter = Optional.ofNullable(textSplitter);
        return this;
    }

    /**
     * Split text fields into chunks based on the specified method.
     */
    public DestinationPineconeProcessingConfigModel withTextSplitter(Optional<? extends DestinationPineconeTextSplitter> textSplitter) {
        Utils.checkNotNull(textSplitter, "textSplitter");
        this.textSplitter = textSplitter;
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
        DestinationPineconeProcessingConfigModel other = (DestinationPineconeProcessingConfigModel) o;
        return 
            Objects.deepEquals(this.chunkOverlap, other.chunkOverlap) &&
            Objects.deepEquals(this.chunkSize, other.chunkSize) &&
            Objects.deepEquals(this.fieldNameMappings, other.fieldNameMappings) &&
            Objects.deepEquals(this.metadataFields, other.metadataFields) &&
            Objects.deepEquals(this.textFields, other.textFields) &&
            Objects.deepEquals(this.textSplitter, other.textSplitter);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            chunkOverlap,
            chunkSize,
            fieldNameMappings,
            metadataFields,
            textFields,
            textSplitter);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationPineconeProcessingConfigModel.class,
                "chunkOverlap", chunkOverlap,
                "chunkSize", chunkSize,
                "fieldNameMappings", fieldNameMappings,
                "metadataFields", metadataFields,
                "textFields", textFields,
                "textSplitter", textSplitter);
    }
    
    public final static class Builder {
 
        private Optional<Long> chunkOverlap;
 
        private Long chunkSize;
 
        private Optional<? extends List<DestinationPineconeFieldNameMappingConfigModel>> fieldNameMappings = Optional.empty();
 
        private Optional<? extends List<String>> metadataFields = Optional.empty();
 
        private Optional<? extends List<String>> textFields = Optional.empty();
 
        private Optional<? extends DestinationPineconeTextSplitter> textSplitter = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Size of overlap between chunks in tokens to store in vector store to better capture relevant context
         */
        public Builder chunkOverlap(long chunkOverlap) {
            Utils.checkNotNull(chunkOverlap, "chunkOverlap");
            this.chunkOverlap = Optional.ofNullable(chunkOverlap);
            return this;
        }

        /**
         * Size of overlap between chunks in tokens to store in vector store to better capture relevant context
         */
        public Builder chunkOverlap(Optional<Long> chunkOverlap) {
            Utils.checkNotNull(chunkOverlap, "chunkOverlap");
            this.chunkOverlap = chunkOverlap;
            return this;
        }

        /**
         * Size of chunks in tokens to store in vector store (make sure it is not too big for the context if your LLM)
         */
        public Builder chunkSize(long chunkSize) {
            Utils.checkNotNull(chunkSize, "chunkSize");
            this.chunkSize = chunkSize;
            return this;
        }

        /**
         * List of fields to rename. Not applicable for nested fields, but can be used to rename fields already flattened via dot notation.
         */
        public Builder fieldNameMappings(List<DestinationPineconeFieldNameMappingConfigModel> fieldNameMappings) {
            Utils.checkNotNull(fieldNameMappings, "fieldNameMappings");
            this.fieldNameMappings = Optional.ofNullable(fieldNameMappings);
            return this;
        }

        /**
         * List of fields to rename. Not applicable for nested fields, but can be used to rename fields already flattened via dot notation.
         */
        public Builder fieldNameMappings(Optional<? extends List<DestinationPineconeFieldNameMappingConfigModel>> fieldNameMappings) {
            Utils.checkNotNull(fieldNameMappings, "fieldNameMappings");
            this.fieldNameMappings = fieldNameMappings;
            return this;
        }

        /**
         * List of fields in the record that should be stored as metadata. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered metadata fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array. When specifying nested paths, all matching values are flattened into an array set to a field named by the path.
         */
        public Builder metadataFields(List<String> metadataFields) {
            Utils.checkNotNull(metadataFields, "metadataFields");
            this.metadataFields = Optional.ofNullable(metadataFields);
            return this;
        }

        /**
         * List of fields in the record that should be stored as metadata. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered metadata fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array. When specifying nested paths, all matching values are flattened into an array set to a field named by the path.
         */
        public Builder metadataFields(Optional<? extends List<String>> metadataFields) {
            Utils.checkNotNull(metadataFields, "metadataFields");
            this.metadataFields = metadataFields;
            return this;
        }

        /**
         * List of fields in the record that should be used to calculate the embedding. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
         */
        public Builder textFields(List<String> textFields) {
            Utils.checkNotNull(textFields, "textFields");
            this.textFields = Optional.ofNullable(textFields);
            return this;
        }

        /**
         * List of fields in the record that should be used to calculate the embedding. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
         */
        public Builder textFields(Optional<? extends List<String>> textFields) {
            Utils.checkNotNull(textFields, "textFields");
            this.textFields = textFields;
            return this;
        }

        /**
         * Split text fields into chunks based on the specified method.
         */
        public Builder textSplitter(DestinationPineconeTextSplitter textSplitter) {
            Utils.checkNotNull(textSplitter, "textSplitter");
            this.textSplitter = Optional.ofNullable(textSplitter);
            return this;
        }

        /**
         * Split text fields into chunks based on the specified method.
         */
        public Builder textSplitter(Optional<? extends DestinationPineconeTextSplitter> textSplitter) {
            Utils.checkNotNull(textSplitter, "textSplitter");
            this.textSplitter = textSplitter;
            return this;
        }
        
        public DestinationPineconeProcessingConfigModel build() {
            if (chunkOverlap == null) {
                chunkOverlap = _SINGLETON_VALUE_ChunkOverlap.value();
            }            return new DestinationPineconeProcessingConfigModel(
                chunkOverlap,
                chunkSize,
                fieldNameMappings,
                metadataFields,
                textFields,
                textSplitter);
        }

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_ChunkOverlap =
                new LazySingletonValue<>(
                        "chunk_overlap",
                        "0",
                        new TypeReference<Optional<Long>>() {});
    }
}


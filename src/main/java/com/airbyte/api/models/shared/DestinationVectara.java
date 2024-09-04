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
 * DestinationVectara - Configuration to connect to the Vectara instance
 */

public class DestinationVectara {

    /**
     * The Name of Corpus to load data into
     */
    @JsonProperty("corpus_name")
    private String corpusName;

    /**
     * Your customer id as it is in the authenticaion url
     */
    @JsonProperty("customer_id")
    private String customerId;

    @JsonProperty("destinationType")
    private Vectara destinationType;

    /**
     * List of fields in the record that should be stored as metadata. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered metadata fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array. When specifying nested paths, all matching values are flattened into an array set to a field named by the path.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata_fields")
    private Optional<? extends List<String>> metadataFields;

    /**
     * OAuth2.0 credentials used to authenticate admin actions (creating/deleting corpora)
     */
    @JsonProperty("oauth2")
    private OAuth20Credentials oauth2;

    /**
     * Parallelize indexing into Vectara with multiple threads
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parallelize")
    private Optional<Boolean> parallelize;

    /**
     * List of fields in the record that should be in the section of the document. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text_fields")
    private Optional<? extends List<String>> textFields;

    /**
     * A field that will be used to populate the `title` of each document. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title_field")
    private Optional<String> titleField;

    @JsonCreator
    public DestinationVectara(
            @JsonProperty("corpus_name") String corpusName,
            @JsonProperty("customer_id") String customerId,
            @JsonProperty("metadata_fields") Optional<? extends List<String>> metadataFields,
            @JsonProperty("oauth2") OAuth20Credentials oauth2,
            @JsonProperty("parallelize") Optional<Boolean> parallelize,
            @JsonProperty("text_fields") Optional<? extends List<String>> textFields,
            @JsonProperty("title_field") Optional<String> titleField) {
        Utils.checkNotNull(corpusName, "corpusName");
        Utils.checkNotNull(customerId, "customerId");
        Utils.checkNotNull(metadataFields, "metadataFields");
        Utils.checkNotNull(oauth2, "oauth2");
        Utils.checkNotNull(parallelize, "parallelize");
        Utils.checkNotNull(textFields, "textFields");
        Utils.checkNotNull(titleField, "titleField");
        this.corpusName = corpusName;
        this.customerId = customerId;
        this.destinationType = Builder._SINGLETON_VALUE_DestinationType.value();
        this.metadataFields = metadataFields;
        this.oauth2 = oauth2;
        this.parallelize = parallelize;
        this.textFields = textFields;
        this.titleField = titleField;
    }
    
    public DestinationVectara(
            String corpusName,
            String customerId,
            OAuth20Credentials oauth2) {
        this(corpusName, customerId, Optional.empty(), oauth2, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The Name of Corpus to load data into
     */
    @JsonIgnore
    public String corpusName() {
        return corpusName;
    }

    /**
     * Your customer id as it is in the authenticaion url
     */
    @JsonIgnore
    public String customerId() {
        return customerId;
    }

    @JsonIgnore
    public Vectara destinationType() {
        return destinationType;
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
     * OAuth2.0 credentials used to authenticate admin actions (creating/deleting corpora)
     */
    @JsonIgnore
    public OAuth20Credentials oauth2() {
        return oauth2;
    }

    /**
     * Parallelize indexing into Vectara with multiple threads
     */
    @JsonIgnore
    public Optional<Boolean> parallelize() {
        return parallelize;
    }

    /**
     * List of fields in the record that should be in the section of the document. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> textFields() {
        return (Optional<List<String>>) textFields;
    }

    /**
     * A field that will be used to populate the `title` of each document. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
     */
    @JsonIgnore
    public Optional<String> titleField() {
        return titleField;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Name of Corpus to load data into
     */
    public DestinationVectara withCorpusName(String corpusName) {
        Utils.checkNotNull(corpusName, "corpusName");
        this.corpusName = corpusName;
        return this;
    }

    /**
     * Your customer id as it is in the authenticaion url
     */
    public DestinationVectara withCustomerId(String customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = customerId;
        return this;
    }

    /**
     * List of fields in the record that should be stored as metadata. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered metadata fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array. When specifying nested paths, all matching values are flattened into an array set to a field named by the path.
     */
    public DestinationVectara withMetadataFields(List<String> metadataFields) {
        Utils.checkNotNull(metadataFields, "metadataFields");
        this.metadataFields = Optional.ofNullable(metadataFields);
        return this;
    }

    /**
     * List of fields in the record that should be stored as metadata. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered metadata fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array. When specifying nested paths, all matching values are flattened into an array set to a field named by the path.
     */
    public DestinationVectara withMetadataFields(Optional<? extends List<String>> metadataFields) {
        Utils.checkNotNull(metadataFields, "metadataFields");
        this.metadataFields = metadataFields;
        return this;
    }

    /**
     * OAuth2.0 credentials used to authenticate admin actions (creating/deleting corpora)
     */
    public DestinationVectara withOauth2(OAuth20Credentials oauth2) {
        Utils.checkNotNull(oauth2, "oauth2");
        this.oauth2 = oauth2;
        return this;
    }

    /**
     * Parallelize indexing into Vectara with multiple threads
     */
    public DestinationVectara withParallelize(boolean parallelize) {
        Utils.checkNotNull(parallelize, "parallelize");
        this.parallelize = Optional.ofNullable(parallelize);
        return this;
    }

    /**
     * Parallelize indexing into Vectara with multiple threads
     */
    public DestinationVectara withParallelize(Optional<Boolean> parallelize) {
        Utils.checkNotNull(parallelize, "parallelize");
        this.parallelize = parallelize;
        return this;
    }

    /**
     * List of fields in the record that should be in the section of the document. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
     */
    public DestinationVectara withTextFields(List<String> textFields) {
        Utils.checkNotNull(textFields, "textFields");
        this.textFields = Optional.ofNullable(textFields);
        return this;
    }

    /**
     * List of fields in the record that should be in the section of the document. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
     */
    public DestinationVectara withTextFields(Optional<? extends List<String>> textFields) {
        Utils.checkNotNull(textFields, "textFields");
        this.textFields = textFields;
        return this;
    }

    /**
     * A field that will be used to populate the `title` of each document. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
     */
    public DestinationVectara withTitleField(String titleField) {
        Utils.checkNotNull(titleField, "titleField");
        this.titleField = Optional.ofNullable(titleField);
        return this;
    }

    /**
     * A field that will be used to populate the `title` of each document. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
     */
    public DestinationVectara withTitleField(Optional<String> titleField) {
        Utils.checkNotNull(titleField, "titleField");
        this.titleField = titleField;
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
        DestinationVectara other = (DestinationVectara) o;
        return 
            Objects.deepEquals(this.corpusName, other.corpusName) &&
            Objects.deepEquals(this.customerId, other.customerId) &&
            Objects.deepEquals(this.destinationType, other.destinationType) &&
            Objects.deepEquals(this.metadataFields, other.metadataFields) &&
            Objects.deepEquals(this.oauth2, other.oauth2) &&
            Objects.deepEquals(this.parallelize, other.parallelize) &&
            Objects.deepEquals(this.textFields, other.textFields) &&
            Objects.deepEquals(this.titleField, other.titleField);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            corpusName,
            customerId,
            destinationType,
            metadataFields,
            oauth2,
            parallelize,
            textFields,
            titleField);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationVectara.class,
                "corpusName", corpusName,
                "customerId", customerId,
                "destinationType", destinationType,
                "metadataFields", metadataFields,
                "oauth2", oauth2,
                "parallelize", parallelize,
                "textFields", textFields,
                "titleField", titleField);
    }
    
    public final static class Builder {
 
        private String corpusName;
 
        private String customerId;
 
        private Optional<? extends List<String>> metadataFields = Optional.empty();
 
        private OAuth20Credentials oauth2;
 
        private Optional<Boolean> parallelize;
 
        private Optional<? extends List<String>> textFields = Optional.empty();
 
        private Optional<String> titleField;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Name of Corpus to load data into
         */
        public Builder corpusName(String corpusName) {
            Utils.checkNotNull(corpusName, "corpusName");
            this.corpusName = corpusName;
            return this;
        }

        /**
         * Your customer id as it is in the authenticaion url
         */
        public Builder customerId(String customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = customerId;
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
         * OAuth2.0 credentials used to authenticate admin actions (creating/deleting corpora)
         */
        public Builder oauth2(OAuth20Credentials oauth2) {
            Utils.checkNotNull(oauth2, "oauth2");
            this.oauth2 = oauth2;
            return this;
        }

        /**
         * Parallelize indexing into Vectara with multiple threads
         */
        public Builder parallelize(boolean parallelize) {
            Utils.checkNotNull(parallelize, "parallelize");
            this.parallelize = Optional.ofNullable(parallelize);
            return this;
        }

        /**
         * Parallelize indexing into Vectara with multiple threads
         */
        public Builder parallelize(Optional<Boolean> parallelize) {
            Utils.checkNotNull(parallelize, "parallelize");
            this.parallelize = parallelize;
            return this;
        }

        /**
         * List of fields in the record that should be in the section of the document. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
         */
        public Builder textFields(List<String> textFields) {
            Utils.checkNotNull(textFields, "textFields");
            this.textFields = Optional.ofNullable(textFields);
            return this;
        }

        /**
         * List of fields in the record that should be in the section of the document. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
         */
        public Builder textFields(Optional<? extends List<String>> textFields) {
            Utils.checkNotNull(textFields, "textFields");
            this.textFields = textFields;
            return this;
        }

        /**
         * A field that will be used to populate the `title` of each document. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
         */
        public Builder titleField(String titleField) {
            Utils.checkNotNull(titleField, "titleField");
            this.titleField = Optional.ofNullable(titleField);
            return this;
        }

        /**
         * A field that will be used to populate the `title` of each document. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
         */
        public Builder titleField(Optional<String> titleField) {
            Utils.checkNotNull(titleField, "titleField");
            this.titleField = titleField;
            return this;
        }
        
        public DestinationVectara build() {
            if (parallelize == null) {
                parallelize = _SINGLETON_VALUE_Parallelize.value();
            }
            if (titleField == null) {
                titleField = _SINGLETON_VALUE_TitleField.value();
            }            return new DestinationVectara(
                corpusName,
                customerId,
                metadataFields,
                oauth2,
                parallelize,
                textFields,
                titleField);
        }

        private static final LazySingletonValue<Vectara> _SINGLETON_VALUE_DestinationType =
                new LazySingletonValue<>(
                        "destinationType",
                        "\"vectara\"",
                        new TypeReference<Vectara>() {});

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_Parallelize =
                new LazySingletonValue<>(
                        "parallelize",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_TitleField =
                new LazySingletonValue<>(
                        "title_field",
                        "\"\"",
                        new TypeReference<Optional<String>>() {});
    }
}


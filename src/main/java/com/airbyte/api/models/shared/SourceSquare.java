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
import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;

public class SourceSquare {

    /**
     * Choose how to authenticate to Square.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    private Optional<? extends SourceSquareAuthentication> credentials;

    /**
     * In some streams there is an option to include deleted objects (Items, Categories, Discounts, Taxes)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("include_deleted_objects")
    private Optional<Boolean> includeDeletedObjects;

    /**
     * Determines whether to use the sandbox or production environment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_sandbox")
    private Optional<Boolean> isSandbox;

    @JsonProperty("sourceType")
    private Square sourceType;

    /**
     * UTC date in the format YYYY-MM-DD. Any data before this date will not be replicated. If not set, all data will be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<LocalDate> startDate;

    @JsonCreator
    public SourceSquare(
            @JsonProperty("credentials") Optional<? extends SourceSquareAuthentication> credentials,
            @JsonProperty("include_deleted_objects") Optional<Boolean> includeDeletedObjects,
            @JsonProperty("is_sandbox") Optional<Boolean> isSandbox,
            @JsonProperty("start_date") Optional<LocalDate> startDate) {
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(includeDeletedObjects, "includeDeletedObjects");
        Utils.checkNotNull(isSandbox, "isSandbox");
        Utils.checkNotNull(startDate, "startDate");
        this.credentials = credentials;
        this.includeDeletedObjects = includeDeletedObjects;
        this.isSandbox = isSandbox;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceSquare() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Choose how to authenticate to Square.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceSquareAuthentication> credentials() {
        return (Optional<SourceSquareAuthentication>) credentials;
    }

    /**
     * In some streams there is an option to include deleted objects (Items, Categories, Discounts, Taxes)
     */
    @JsonIgnore
    public Optional<Boolean> includeDeletedObjects() {
        return includeDeletedObjects;
    }

    /**
     * Determines whether to use the sandbox or production environment.
     */
    @JsonIgnore
    public Optional<Boolean> isSandbox() {
        return isSandbox;
    }

    @JsonIgnore
    public Square sourceType() {
        return sourceType;
    }

    /**
     * UTC date in the format YYYY-MM-DD. Any data before this date will not be replicated. If not set, all data will be replicated.
     */
    @JsonIgnore
    public Optional<LocalDate> startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Choose how to authenticate to Square.
     */
    public SourceSquare withCredentials(SourceSquareAuthentication credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = Optional.ofNullable(credentials);
        return this;
    }

    /**
     * Choose how to authenticate to Square.
     */
    public SourceSquare withCredentials(Optional<? extends SourceSquareAuthentication> credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * In some streams there is an option to include deleted objects (Items, Categories, Discounts, Taxes)
     */
    public SourceSquare withIncludeDeletedObjects(boolean includeDeletedObjects) {
        Utils.checkNotNull(includeDeletedObjects, "includeDeletedObjects");
        this.includeDeletedObjects = Optional.ofNullable(includeDeletedObjects);
        return this;
    }

    /**
     * In some streams there is an option to include deleted objects (Items, Categories, Discounts, Taxes)
     */
    public SourceSquare withIncludeDeletedObjects(Optional<Boolean> includeDeletedObjects) {
        Utils.checkNotNull(includeDeletedObjects, "includeDeletedObjects");
        this.includeDeletedObjects = includeDeletedObjects;
        return this;
    }

    /**
     * Determines whether to use the sandbox or production environment.
     */
    public SourceSquare withIsSandbox(boolean isSandbox) {
        Utils.checkNotNull(isSandbox, "isSandbox");
        this.isSandbox = Optional.ofNullable(isSandbox);
        return this;
    }

    /**
     * Determines whether to use the sandbox or production environment.
     */
    public SourceSquare withIsSandbox(Optional<Boolean> isSandbox) {
        Utils.checkNotNull(isSandbox, "isSandbox");
        this.isSandbox = isSandbox;
        return this;
    }

    /**
     * UTC date in the format YYYY-MM-DD. Any data before this date will not be replicated. If not set, all data will be replicated.
     */
    public SourceSquare withStartDate(LocalDate startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * UTC date in the format YYYY-MM-DD. Any data before this date will not be replicated. If not set, all data will be replicated.
     */
    public SourceSquare withStartDate(Optional<LocalDate> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
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
        SourceSquare other = (SourceSquare) o;
        return 
            Objects.deepEquals(this.credentials, other.credentials) &&
            Objects.deepEquals(this.includeDeletedObjects, other.includeDeletedObjects) &&
            Objects.deepEquals(this.isSandbox, other.isSandbox) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            credentials,
            includeDeletedObjects,
            isSandbox,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSquare.class,
                "credentials", credentials,
                "includeDeletedObjects", includeDeletedObjects,
                "isSandbox", isSandbox,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private Optional<? extends SourceSquareAuthentication> credentials = Optional.empty();
 
        private Optional<Boolean> includeDeletedObjects;
 
        private Optional<Boolean> isSandbox;
 
        private Optional<LocalDate> startDate;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Choose how to authenticate to Square.
         */
        public Builder credentials(SourceSquareAuthentication credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = Optional.ofNullable(credentials);
            return this;
        }

        /**
         * Choose how to authenticate to Square.
         */
        public Builder credentials(Optional<? extends SourceSquareAuthentication> credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * In some streams there is an option to include deleted objects (Items, Categories, Discounts, Taxes)
         */
        public Builder includeDeletedObjects(boolean includeDeletedObjects) {
            Utils.checkNotNull(includeDeletedObjects, "includeDeletedObjects");
            this.includeDeletedObjects = Optional.ofNullable(includeDeletedObjects);
            return this;
        }

        /**
         * In some streams there is an option to include deleted objects (Items, Categories, Discounts, Taxes)
         */
        public Builder includeDeletedObjects(Optional<Boolean> includeDeletedObjects) {
            Utils.checkNotNull(includeDeletedObjects, "includeDeletedObjects");
            this.includeDeletedObjects = includeDeletedObjects;
            return this;
        }

        /**
         * Determines whether to use the sandbox or production environment.
         */
        public Builder isSandbox(boolean isSandbox) {
            Utils.checkNotNull(isSandbox, "isSandbox");
            this.isSandbox = Optional.ofNullable(isSandbox);
            return this;
        }

        /**
         * Determines whether to use the sandbox or production environment.
         */
        public Builder isSandbox(Optional<Boolean> isSandbox) {
            Utils.checkNotNull(isSandbox, "isSandbox");
            this.isSandbox = isSandbox;
            return this;
        }

        /**
         * UTC date in the format YYYY-MM-DD. Any data before this date will not be replicated. If not set, all data will be replicated.
         */
        public Builder startDate(LocalDate startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * UTC date in the format YYYY-MM-DD. Any data before this date will not be replicated. If not set, all data will be replicated.
         */
        public Builder startDate(Optional<LocalDate> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceSquare build() {
            if (includeDeletedObjects == null) {
                includeDeletedObjects = _SINGLETON_VALUE_IncludeDeletedObjects.value();
            }
            if (isSandbox == null) {
                isSandbox = _SINGLETON_VALUE_IsSandbox.value();
            }
            if (startDate == null) {
                startDate = _SINGLETON_VALUE_StartDate.value();
            }
            return new SourceSquare(
                credentials,
                includeDeletedObjects,
                isSandbox,
                startDate);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_IncludeDeletedObjects =
                new LazySingletonValue<>(
                        "include_deleted_objects",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_IsSandbox =
                new LazySingletonValue<>(
                        "is_sandbox",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});

        private static final LazySingletonValue<Square> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"square\"",
                        new TypeReference<Square>() {});

        private static final LazySingletonValue<Optional<LocalDate>> _SINGLETON_VALUE_StartDate =
                new LazySingletonValue<>(
                        "start_date",
                        "\"2021-01-01\"",
                        new TypeReference<Optional<LocalDate>>() {});
    }
}

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
 * ReadChangesUsingChangeDataCaptureCDC
 * 
 * <p>&lt;i&gt;Recommended&lt;/i&gt; - Incrementally reads new inserts, updates, and deletes using the SQL Server's &lt;a href="https://docs.airbyte.com/integrations/sources/mssql/#change-data-capture-cdc"&gt;change data capture feature&lt;/a&gt;. This must be enabled on your database.
 */
public class ReadChangesUsingChangeDataCaptureCDC {

    /**
     * The amount of time an initial load is allowed to continue for before catching up on CDC logs.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("initial_load_timeout_hours")
    private Optional<Long> initialLoadTimeoutHours;

    /**
     * The amount of time the connector will wait when it launches to determine if there is new data to sync or not. Defaults to 300 seconds. Valid range: 120 seconds to 3600 seconds. Read about &lt;a href="https://docs.airbyte.com/integrations/sources/mysql/#change-data-capture-cdc"&gt;initial waiting time&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("initial_waiting_seconds")
    private Optional<Long> initialWaitingSeconds;

    /**
     * Determines whether Airbyte should fail or re-sync data in case of an stale/invalid cursor value into the WAL. If 'Fail sync' is chosen, a user will have to manually reset the connection before being able to continue syncing data. If 'Re-sync data' is chosen, Airbyte will automatically trigger a refresh but could lead to higher cloud costs and data loss.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("invalid_cdc_cursor_position_behavior")
    private Optional<? extends SourceMssqlInvalidCDCPositionBehaviorAdvanced> invalidCdcCursorPositionBehavior;

    @JsonProperty("method")
    private SourceMssqlMethod method;

    /**
     * The size of the internal queue. This may interfere with memory consumption and efficiency of the connector, please be careful.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("queue_size")
    private Optional<Long> queueSize;

    @JsonCreator
    public ReadChangesUsingChangeDataCaptureCDC(
            @JsonProperty("initial_load_timeout_hours") Optional<Long> initialLoadTimeoutHours,
            @JsonProperty("initial_waiting_seconds") Optional<Long> initialWaitingSeconds,
            @JsonProperty("invalid_cdc_cursor_position_behavior") Optional<? extends SourceMssqlInvalidCDCPositionBehaviorAdvanced> invalidCdcCursorPositionBehavior,
            @JsonProperty("queue_size") Optional<Long> queueSize) {
        Utils.checkNotNull(initialLoadTimeoutHours, "initialLoadTimeoutHours");
        Utils.checkNotNull(initialWaitingSeconds, "initialWaitingSeconds");
        Utils.checkNotNull(invalidCdcCursorPositionBehavior, "invalidCdcCursorPositionBehavior");
        Utils.checkNotNull(queueSize, "queueSize");
        this.initialLoadTimeoutHours = initialLoadTimeoutHours;
        this.initialWaitingSeconds = initialWaitingSeconds;
        this.invalidCdcCursorPositionBehavior = invalidCdcCursorPositionBehavior;
        this.method = Builder._SINGLETON_VALUE_Method.value();
        this.queueSize = queueSize;
    }
    
    public ReadChangesUsingChangeDataCaptureCDC() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The amount of time an initial load is allowed to continue for before catching up on CDC logs.
     */
    @JsonIgnore
    public Optional<Long> initialLoadTimeoutHours() {
        return initialLoadTimeoutHours;
    }

    /**
     * The amount of time the connector will wait when it launches to determine if there is new data to sync or not. Defaults to 300 seconds. Valid range: 120 seconds to 3600 seconds. Read about &lt;a href="https://docs.airbyte.com/integrations/sources/mysql/#change-data-capture-cdc"&gt;initial waiting time&lt;/a&gt;.
     */
    @JsonIgnore
    public Optional<Long> initialWaitingSeconds() {
        return initialWaitingSeconds;
    }

    /**
     * Determines whether Airbyte should fail or re-sync data in case of an stale/invalid cursor value into the WAL. If 'Fail sync' is chosen, a user will have to manually reset the connection before being able to continue syncing data. If 'Re-sync data' is chosen, Airbyte will automatically trigger a refresh but could lead to higher cloud costs and data loss.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceMssqlInvalidCDCPositionBehaviorAdvanced> invalidCdcCursorPositionBehavior() {
        return (Optional<SourceMssqlInvalidCDCPositionBehaviorAdvanced>) invalidCdcCursorPositionBehavior;
    }

    @JsonIgnore
    public SourceMssqlMethod method() {
        return method;
    }

    /**
     * The size of the internal queue. This may interfere with memory consumption and efficiency of the connector, please be careful.
     */
    @JsonIgnore
    public Optional<Long> queueSize() {
        return queueSize;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The amount of time an initial load is allowed to continue for before catching up on CDC logs.
     */
    public ReadChangesUsingChangeDataCaptureCDC withInitialLoadTimeoutHours(long initialLoadTimeoutHours) {
        Utils.checkNotNull(initialLoadTimeoutHours, "initialLoadTimeoutHours");
        this.initialLoadTimeoutHours = Optional.ofNullable(initialLoadTimeoutHours);
        return this;
    }

    /**
     * The amount of time an initial load is allowed to continue for before catching up on CDC logs.
     */
    public ReadChangesUsingChangeDataCaptureCDC withInitialLoadTimeoutHours(Optional<Long> initialLoadTimeoutHours) {
        Utils.checkNotNull(initialLoadTimeoutHours, "initialLoadTimeoutHours");
        this.initialLoadTimeoutHours = initialLoadTimeoutHours;
        return this;
    }

    /**
     * The amount of time the connector will wait when it launches to determine if there is new data to sync or not. Defaults to 300 seconds. Valid range: 120 seconds to 3600 seconds. Read about &lt;a href="https://docs.airbyte.com/integrations/sources/mysql/#change-data-capture-cdc"&gt;initial waiting time&lt;/a&gt;.
     */
    public ReadChangesUsingChangeDataCaptureCDC withInitialWaitingSeconds(long initialWaitingSeconds) {
        Utils.checkNotNull(initialWaitingSeconds, "initialWaitingSeconds");
        this.initialWaitingSeconds = Optional.ofNullable(initialWaitingSeconds);
        return this;
    }

    /**
     * The amount of time the connector will wait when it launches to determine if there is new data to sync or not. Defaults to 300 seconds. Valid range: 120 seconds to 3600 seconds. Read about &lt;a href="https://docs.airbyte.com/integrations/sources/mysql/#change-data-capture-cdc"&gt;initial waiting time&lt;/a&gt;.
     */
    public ReadChangesUsingChangeDataCaptureCDC withInitialWaitingSeconds(Optional<Long> initialWaitingSeconds) {
        Utils.checkNotNull(initialWaitingSeconds, "initialWaitingSeconds");
        this.initialWaitingSeconds = initialWaitingSeconds;
        return this;
    }

    /**
     * Determines whether Airbyte should fail or re-sync data in case of an stale/invalid cursor value into the WAL. If 'Fail sync' is chosen, a user will have to manually reset the connection before being able to continue syncing data. If 'Re-sync data' is chosen, Airbyte will automatically trigger a refresh but could lead to higher cloud costs and data loss.
     */
    public ReadChangesUsingChangeDataCaptureCDC withInvalidCdcCursorPositionBehavior(SourceMssqlInvalidCDCPositionBehaviorAdvanced invalidCdcCursorPositionBehavior) {
        Utils.checkNotNull(invalidCdcCursorPositionBehavior, "invalidCdcCursorPositionBehavior");
        this.invalidCdcCursorPositionBehavior = Optional.ofNullable(invalidCdcCursorPositionBehavior);
        return this;
    }

    /**
     * Determines whether Airbyte should fail or re-sync data in case of an stale/invalid cursor value into the WAL. If 'Fail sync' is chosen, a user will have to manually reset the connection before being able to continue syncing data. If 'Re-sync data' is chosen, Airbyte will automatically trigger a refresh but could lead to higher cloud costs and data loss.
     */
    public ReadChangesUsingChangeDataCaptureCDC withInvalidCdcCursorPositionBehavior(Optional<? extends SourceMssqlInvalidCDCPositionBehaviorAdvanced> invalidCdcCursorPositionBehavior) {
        Utils.checkNotNull(invalidCdcCursorPositionBehavior, "invalidCdcCursorPositionBehavior");
        this.invalidCdcCursorPositionBehavior = invalidCdcCursorPositionBehavior;
        return this;
    }

    /**
     * The size of the internal queue. This may interfere with memory consumption and efficiency of the connector, please be careful.
     */
    public ReadChangesUsingChangeDataCaptureCDC withQueueSize(long queueSize) {
        Utils.checkNotNull(queueSize, "queueSize");
        this.queueSize = Optional.ofNullable(queueSize);
        return this;
    }

    /**
     * The size of the internal queue. This may interfere with memory consumption and efficiency of the connector, please be careful.
     */
    public ReadChangesUsingChangeDataCaptureCDC withQueueSize(Optional<Long> queueSize) {
        Utils.checkNotNull(queueSize, "queueSize");
        this.queueSize = queueSize;
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
        ReadChangesUsingChangeDataCaptureCDC other = (ReadChangesUsingChangeDataCaptureCDC) o;
        return 
            Objects.deepEquals(this.initialLoadTimeoutHours, other.initialLoadTimeoutHours) &&
            Objects.deepEquals(this.initialWaitingSeconds, other.initialWaitingSeconds) &&
            Objects.deepEquals(this.invalidCdcCursorPositionBehavior, other.invalidCdcCursorPositionBehavior) &&
            Objects.deepEquals(this.method, other.method) &&
            Objects.deepEquals(this.queueSize, other.queueSize);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            initialLoadTimeoutHours,
            initialWaitingSeconds,
            invalidCdcCursorPositionBehavior,
            method,
            queueSize);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReadChangesUsingChangeDataCaptureCDC.class,
                "initialLoadTimeoutHours", initialLoadTimeoutHours,
                "initialWaitingSeconds", initialWaitingSeconds,
                "invalidCdcCursorPositionBehavior", invalidCdcCursorPositionBehavior,
                "method", method,
                "queueSize", queueSize);
    }
    
    public final static class Builder {
 
        private Optional<Long> initialLoadTimeoutHours;
 
        private Optional<Long> initialWaitingSeconds;
 
        private Optional<? extends SourceMssqlInvalidCDCPositionBehaviorAdvanced> invalidCdcCursorPositionBehavior;
 
        private Optional<Long> queueSize;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The amount of time an initial load is allowed to continue for before catching up on CDC logs.
         */
        public Builder initialLoadTimeoutHours(long initialLoadTimeoutHours) {
            Utils.checkNotNull(initialLoadTimeoutHours, "initialLoadTimeoutHours");
            this.initialLoadTimeoutHours = Optional.ofNullable(initialLoadTimeoutHours);
            return this;
        }

        /**
         * The amount of time an initial load is allowed to continue for before catching up on CDC logs.
         */
        public Builder initialLoadTimeoutHours(Optional<Long> initialLoadTimeoutHours) {
            Utils.checkNotNull(initialLoadTimeoutHours, "initialLoadTimeoutHours");
            this.initialLoadTimeoutHours = initialLoadTimeoutHours;
            return this;
        }

        /**
         * The amount of time the connector will wait when it launches to determine if there is new data to sync or not. Defaults to 300 seconds. Valid range: 120 seconds to 3600 seconds. Read about &lt;a href="https://docs.airbyte.com/integrations/sources/mysql/#change-data-capture-cdc"&gt;initial waiting time&lt;/a&gt;.
         */
        public Builder initialWaitingSeconds(long initialWaitingSeconds) {
            Utils.checkNotNull(initialWaitingSeconds, "initialWaitingSeconds");
            this.initialWaitingSeconds = Optional.ofNullable(initialWaitingSeconds);
            return this;
        }

        /**
         * The amount of time the connector will wait when it launches to determine if there is new data to sync or not. Defaults to 300 seconds. Valid range: 120 seconds to 3600 seconds. Read about &lt;a href="https://docs.airbyte.com/integrations/sources/mysql/#change-data-capture-cdc"&gt;initial waiting time&lt;/a&gt;.
         */
        public Builder initialWaitingSeconds(Optional<Long> initialWaitingSeconds) {
            Utils.checkNotNull(initialWaitingSeconds, "initialWaitingSeconds");
            this.initialWaitingSeconds = initialWaitingSeconds;
            return this;
        }

        /**
         * Determines whether Airbyte should fail or re-sync data in case of an stale/invalid cursor value into the WAL. If 'Fail sync' is chosen, a user will have to manually reset the connection before being able to continue syncing data. If 'Re-sync data' is chosen, Airbyte will automatically trigger a refresh but could lead to higher cloud costs and data loss.
         */
        public Builder invalidCdcCursorPositionBehavior(SourceMssqlInvalidCDCPositionBehaviorAdvanced invalidCdcCursorPositionBehavior) {
            Utils.checkNotNull(invalidCdcCursorPositionBehavior, "invalidCdcCursorPositionBehavior");
            this.invalidCdcCursorPositionBehavior = Optional.ofNullable(invalidCdcCursorPositionBehavior);
            return this;
        }

        /**
         * Determines whether Airbyte should fail or re-sync data in case of an stale/invalid cursor value into the WAL. If 'Fail sync' is chosen, a user will have to manually reset the connection before being able to continue syncing data. If 'Re-sync data' is chosen, Airbyte will automatically trigger a refresh but could lead to higher cloud costs and data loss.
         */
        public Builder invalidCdcCursorPositionBehavior(Optional<? extends SourceMssqlInvalidCDCPositionBehaviorAdvanced> invalidCdcCursorPositionBehavior) {
            Utils.checkNotNull(invalidCdcCursorPositionBehavior, "invalidCdcCursorPositionBehavior");
            this.invalidCdcCursorPositionBehavior = invalidCdcCursorPositionBehavior;
            return this;
        }

        /**
         * The size of the internal queue. This may interfere with memory consumption and efficiency of the connector, please be careful.
         */
        public Builder queueSize(long queueSize) {
            Utils.checkNotNull(queueSize, "queueSize");
            this.queueSize = Optional.ofNullable(queueSize);
            return this;
        }

        /**
         * The size of the internal queue. This may interfere with memory consumption and efficiency of the connector, please be careful.
         */
        public Builder queueSize(Optional<Long> queueSize) {
            Utils.checkNotNull(queueSize, "queueSize");
            this.queueSize = queueSize;
            return this;
        }
        
        public ReadChangesUsingChangeDataCaptureCDC build() {
            if (initialLoadTimeoutHours == null) {
                initialLoadTimeoutHours = _SINGLETON_VALUE_InitialLoadTimeoutHours.value();
            }
            if (initialWaitingSeconds == null) {
                initialWaitingSeconds = _SINGLETON_VALUE_InitialWaitingSeconds.value();
            }
            if (invalidCdcCursorPositionBehavior == null) {
                invalidCdcCursorPositionBehavior = _SINGLETON_VALUE_InvalidCdcCursorPositionBehavior.value();
            }
            if (queueSize == null) {
                queueSize = _SINGLETON_VALUE_QueueSize.value();
            }
            return new ReadChangesUsingChangeDataCaptureCDC(
                initialLoadTimeoutHours,
                initialWaitingSeconds,
                invalidCdcCursorPositionBehavior,
                queueSize);
        }

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_InitialLoadTimeoutHours =
                new LazySingletonValue<>(
                        "initial_load_timeout_hours",
                        "8",
                        new TypeReference<Optional<Long>>() {});

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_InitialWaitingSeconds =
                new LazySingletonValue<>(
                        "initial_waiting_seconds",
                        "300",
                        new TypeReference<Optional<Long>>() {});

        private static final LazySingletonValue<Optional<? extends SourceMssqlInvalidCDCPositionBehaviorAdvanced>> _SINGLETON_VALUE_InvalidCdcCursorPositionBehavior =
                new LazySingletonValue<>(
                        "invalid_cdc_cursor_position_behavior",
                        "\"Fail sync\"",
                        new TypeReference<Optional<? extends SourceMssqlInvalidCDCPositionBehaviorAdvanced>>() {});

        private static final LazySingletonValue<SourceMssqlMethod> _SINGLETON_VALUE_Method =
                new LazySingletonValue<>(
                        "method",
                        "\"CDC\"",
                        new TypeReference<SourceMssqlMethod>() {});

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_QueueSize =
                new LazySingletonValue<>(
                        "queue_size",
                        "10000",
                        new TypeReference<Optional<Long>>() {});
    }
}

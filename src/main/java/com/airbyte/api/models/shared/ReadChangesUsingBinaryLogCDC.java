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
 * ReadChangesUsingBinaryLogCDC - &lt;i&gt;Recommended&lt;/i&gt; - Incrementally reads new inserts, updates, and deletes using the MySQL &lt;a href="https://docs.airbyte.com/integrations/sources/mysql/#change-data-capture-cdc"&gt;binary log&lt;/a&gt;. This must be enabled on your database.
 */

public class ReadChangesUsingBinaryLogCDC {

    /**
     * The amount of time the connector will wait when it launches to determine if there is new data to sync or not. Defaults to 300 seconds. Valid range: 120 seconds to 1200 seconds. Read about &lt;a href="https://docs.airbyte.com/integrations/sources/mysql/#change-data-capture-cdc"&gt;initial waiting time&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("initial_waiting_seconds")
    private Optional<? extends Long> initialWaitingSeconds;

    /**
     * Determines whether Airbyte should fail or re-sync data in case of an stale/invalid cursor value into the WAL. If 'Fail sync' is chosen, a user will have to manually reset the connection before being able to continue syncing data. If 'Re-sync data' is chosen, Airbyte will automatically trigger a refresh but could lead to higher cloud costs and data loss.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("invalid_cdc_cursor_position_behavior")
    private Optional<? extends SourceMysqlInvalidCDCPositionBehaviorAdvanced> invalidCdcCursorPositionBehavior;

    @JsonProperty("method")
    private SourceMysqlMethod method;

    /**
     * Enter the configured MySQL server timezone. This should only be done if the configured timezone in your MySQL instance does not conform to IANNA standard.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("server_time_zone")
    private Optional<? extends String> serverTimeZone;

    @JsonCreator
    public ReadChangesUsingBinaryLogCDC(
            @JsonProperty("initial_waiting_seconds") Optional<? extends Long> initialWaitingSeconds,
            @JsonProperty("invalid_cdc_cursor_position_behavior") Optional<? extends SourceMysqlInvalidCDCPositionBehaviorAdvanced> invalidCdcCursorPositionBehavior,
            @JsonProperty("server_time_zone") Optional<? extends String> serverTimeZone) {
        Utils.checkNotNull(initialWaitingSeconds, "initialWaitingSeconds");
        Utils.checkNotNull(invalidCdcCursorPositionBehavior, "invalidCdcCursorPositionBehavior");
        Utils.checkNotNull(serverTimeZone, "serverTimeZone");
        this.initialWaitingSeconds = initialWaitingSeconds;
        this.invalidCdcCursorPositionBehavior = invalidCdcCursorPositionBehavior;
        this.method = Builder._SINGLETON_VALUE_Method.value();
        this.serverTimeZone = serverTimeZone;
    }
    
    public ReadChangesUsingBinaryLogCDC() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The amount of time the connector will wait when it launches to determine if there is new data to sync or not. Defaults to 300 seconds. Valid range: 120 seconds to 1200 seconds. Read about &lt;a href="https://docs.airbyte.com/integrations/sources/mysql/#change-data-capture-cdc"&gt;initial waiting time&lt;/a&gt;.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> initialWaitingSeconds() {
        return (Optional<Long>) initialWaitingSeconds;
    }

    /**
     * Determines whether Airbyte should fail or re-sync data in case of an stale/invalid cursor value into the WAL. If 'Fail sync' is chosen, a user will have to manually reset the connection before being able to continue syncing data. If 'Re-sync data' is chosen, Airbyte will automatically trigger a refresh but could lead to higher cloud costs and data loss.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceMysqlInvalidCDCPositionBehaviorAdvanced> invalidCdcCursorPositionBehavior() {
        return (Optional<SourceMysqlInvalidCDCPositionBehaviorAdvanced>) invalidCdcCursorPositionBehavior;
    }

    @JsonIgnore
    public SourceMysqlMethod method() {
        return method;
    }

    /**
     * Enter the configured MySQL server timezone. This should only be done if the configured timezone in your MySQL instance does not conform to IANNA standard.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> serverTimeZone() {
        return (Optional<String>) serverTimeZone;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The amount of time the connector will wait when it launches to determine if there is new data to sync or not. Defaults to 300 seconds. Valid range: 120 seconds to 1200 seconds. Read about &lt;a href="https://docs.airbyte.com/integrations/sources/mysql/#change-data-capture-cdc"&gt;initial waiting time&lt;/a&gt;.
     */
    public ReadChangesUsingBinaryLogCDC withInitialWaitingSeconds(long initialWaitingSeconds) {
        Utils.checkNotNull(initialWaitingSeconds, "initialWaitingSeconds");
        this.initialWaitingSeconds = Optional.ofNullable(initialWaitingSeconds);
        return this;
    }

    /**
     * The amount of time the connector will wait when it launches to determine if there is new data to sync or not. Defaults to 300 seconds. Valid range: 120 seconds to 1200 seconds. Read about &lt;a href="https://docs.airbyte.com/integrations/sources/mysql/#change-data-capture-cdc"&gt;initial waiting time&lt;/a&gt;.
     */
    public ReadChangesUsingBinaryLogCDC withInitialWaitingSeconds(Optional<? extends Long> initialWaitingSeconds) {
        Utils.checkNotNull(initialWaitingSeconds, "initialWaitingSeconds");
        this.initialWaitingSeconds = initialWaitingSeconds;
        return this;
    }

    /**
     * Determines whether Airbyte should fail or re-sync data in case of an stale/invalid cursor value into the WAL. If 'Fail sync' is chosen, a user will have to manually reset the connection before being able to continue syncing data. If 'Re-sync data' is chosen, Airbyte will automatically trigger a refresh but could lead to higher cloud costs and data loss.
     */
    public ReadChangesUsingBinaryLogCDC withInvalidCdcCursorPositionBehavior(SourceMysqlInvalidCDCPositionBehaviorAdvanced invalidCdcCursorPositionBehavior) {
        Utils.checkNotNull(invalidCdcCursorPositionBehavior, "invalidCdcCursorPositionBehavior");
        this.invalidCdcCursorPositionBehavior = Optional.ofNullable(invalidCdcCursorPositionBehavior);
        return this;
    }

    /**
     * Determines whether Airbyte should fail or re-sync data in case of an stale/invalid cursor value into the WAL. If 'Fail sync' is chosen, a user will have to manually reset the connection before being able to continue syncing data. If 'Re-sync data' is chosen, Airbyte will automatically trigger a refresh but could lead to higher cloud costs and data loss.
     */
    public ReadChangesUsingBinaryLogCDC withInvalidCdcCursorPositionBehavior(Optional<? extends SourceMysqlInvalidCDCPositionBehaviorAdvanced> invalidCdcCursorPositionBehavior) {
        Utils.checkNotNull(invalidCdcCursorPositionBehavior, "invalidCdcCursorPositionBehavior");
        this.invalidCdcCursorPositionBehavior = invalidCdcCursorPositionBehavior;
        return this;
    }

    /**
     * Enter the configured MySQL server timezone. This should only be done if the configured timezone in your MySQL instance does not conform to IANNA standard.
     */
    public ReadChangesUsingBinaryLogCDC withServerTimeZone(String serverTimeZone) {
        Utils.checkNotNull(serverTimeZone, "serverTimeZone");
        this.serverTimeZone = Optional.ofNullable(serverTimeZone);
        return this;
    }

    /**
     * Enter the configured MySQL server timezone. This should only be done if the configured timezone in your MySQL instance does not conform to IANNA standard.
     */
    public ReadChangesUsingBinaryLogCDC withServerTimeZone(Optional<? extends String> serverTimeZone) {
        Utils.checkNotNull(serverTimeZone, "serverTimeZone");
        this.serverTimeZone = serverTimeZone;
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
        ReadChangesUsingBinaryLogCDC other = (ReadChangesUsingBinaryLogCDC) o;
        return 
            java.util.Objects.deepEquals(this.initialWaitingSeconds, other.initialWaitingSeconds) &&
            java.util.Objects.deepEquals(this.invalidCdcCursorPositionBehavior, other.invalidCdcCursorPositionBehavior) &&
            java.util.Objects.deepEquals(this.method, other.method) &&
            java.util.Objects.deepEquals(this.serverTimeZone, other.serverTimeZone);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            initialWaitingSeconds,
            invalidCdcCursorPositionBehavior,
            method,
            serverTimeZone);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReadChangesUsingBinaryLogCDC.class,
                "initialWaitingSeconds", initialWaitingSeconds,
                "invalidCdcCursorPositionBehavior", invalidCdcCursorPositionBehavior,
                "method", method,
                "serverTimeZone", serverTimeZone);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> initialWaitingSeconds;
 
        private Optional<? extends SourceMysqlInvalidCDCPositionBehaviorAdvanced> invalidCdcCursorPositionBehavior;
 
        private Optional<? extends String> serverTimeZone = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The amount of time the connector will wait when it launches to determine if there is new data to sync or not. Defaults to 300 seconds. Valid range: 120 seconds to 1200 seconds. Read about &lt;a href="https://docs.airbyte.com/integrations/sources/mysql/#change-data-capture-cdc"&gt;initial waiting time&lt;/a&gt;.
         */
        public Builder initialWaitingSeconds(long initialWaitingSeconds) {
            Utils.checkNotNull(initialWaitingSeconds, "initialWaitingSeconds");
            this.initialWaitingSeconds = Optional.ofNullable(initialWaitingSeconds);
            return this;
        }

        /**
         * The amount of time the connector will wait when it launches to determine if there is new data to sync or not. Defaults to 300 seconds. Valid range: 120 seconds to 1200 seconds. Read about &lt;a href="https://docs.airbyte.com/integrations/sources/mysql/#change-data-capture-cdc"&gt;initial waiting time&lt;/a&gt;.
         */
        public Builder initialWaitingSeconds(Optional<? extends Long> initialWaitingSeconds) {
            Utils.checkNotNull(initialWaitingSeconds, "initialWaitingSeconds");
            this.initialWaitingSeconds = initialWaitingSeconds;
            return this;
        }

        /**
         * Determines whether Airbyte should fail or re-sync data in case of an stale/invalid cursor value into the WAL. If 'Fail sync' is chosen, a user will have to manually reset the connection before being able to continue syncing data. If 'Re-sync data' is chosen, Airbyte will automatically trigger a refresh but could lead to higher cloud costs and data loss.
         */
        public Builder invalidCdcCursorPositionBehavior(SourceMysqlInvalidCDCPositionBehaviorAdvanced invalidCdcCursorPositionBehavior) {
            Utils.checkNotNull(invalidCdcCursorPositionBehavior, "invalidCdcCursorPositionBehavior");
            this.invalidCdcCursorPositionBehavior = Optional.ofNullable(invalidCdcCursorPositionBehavior);
            return this;
        }

        /**
         * Determines whether Airbyte should fail or re-sync data in case of an stale/invalid cursor value into the WAL. If 'Fail sync' is chosen, a user will have to manually reset the connection before being able to continue syncing data. If 'Re-sync data' is chosen, Airbyte will automatically trigger a refresh but could lead to higher cloud costs and data loss.
         */
        public Builder invalidCdcCursorPositionBehavior(Optional<? extends SourceMysqlInvalidCDCPositionBehaviorAdvanced> invalidCdcCursorPositionBehavior) {
            Utils.checkNotNull(invalidCdcCursorPositionBehavior, "invalidCdcCursorPositionBehavior");
            this.invalidCdcCursorPositionBehavior = invalidCdcCursorPositionBehavior;
            return this;
        }

        /**
         * Enter the configured MySQL server timezone. This should only be done if the configured timezone in your MySQL instance does not conform to IANNA standard.
         */
        public Builder serverTimeZone(String serverTimeZone) {
            Utils.checkNotNull(serverTimeZone, "serverTimeZone");
            this.serverTimeZone = Optional.ofNullable(serverTimeZone);
            return this;
        }

        /**
         * Enter the configured MySQL server timezone. This should only be done if the configured timezone in your MySQL instance does not conform to IANNA standard.
         */
        public Builder serverTimeZone(Optional<? extends String> serverTimeZone) {
            Utils.checkNotNull(serverTimeZone, "serverTimeZone");
            this.serverTimeZone = serverTimeZone;
            return this;
        }
        
        public ReadChangesUsingBinaryLogCDC build() {
            if (initialWaitingSeconds == null) {
                initialWaitingSeconds = _SINGLETON_VALUE_InitialWaitingSeconds.value();
            }
            if (invalidCdcCursorPositionBehavior == null) {
                invalidCdcCursorPositionBehavior = _SINGLETON_VALUE_InvalidCdcCursorPositionBehavior.value();
            }
            return new ReadChangesUsingBinaryLogCDC(
                initialWaitingSeconds,
                invalidCdcCursorPositionBehavior,
                serverTimeZone);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_InitialWaitingSeconds =
                new LazySingletonValue<>(
                        "initial_waiting_seconds",
                        "300",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends SourceMysqlInvalidCDCPositionBehaviorAdvanced>> _SINGLETON_VALUE_InvalidCdcCursorPositionBehavior =
                new LazySingletonValue<>(
                        "invalid_cdc_cursor_position_behavior",
                        "\"Fail sync\"",
                        new TypeReference<Optional<? extends SourceMysqlInvalidCDCPositionBehaviorAdvanced>>() {});

        private static final LazySingletonValue<SourceMysqlMethod> _SINGLETON_VALUE_Method =
                new LazySingletonValue<>(
                        "method",
                        "\"CDC\"",
                        new TypeReference<SourceMysqlMethod>() {});
    }
}


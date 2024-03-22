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
 * ReadChangesUsingChangeDataCaptureCDC - &lt;i&gt;Recommended&lt;/i&gt; - Incrementally reads new inserts, updates, and deletes using the SQL Server's &lt;a href="https://docs.airbyte.com/integrations/sources/mssql/#change-data-capture-cdc"&gt;change data capture feature&lt;/a&gt;. This must be enabled on your database.
 */

public class ReadChangesUsingChangeDataCaptureCDC {

    /**
     * The amount of time the connector will wait when it launches to determine if there is new data to sync or not. Defaults to 300 seconds. Valid range: 120 seconds to 1200 seconds. Read about &lt;a href="https://docs.airbyte.com/integrations/sources/mysql/#change-data-capture-cdc"&gt;initial waiting time&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("initial_waiting_seconds")
    private Optional<? extends Long> initialWaitingSeconds;

    @JsonProperty("method")
    private SourceMssqlMethod method;

    public ReadChangesUsingChangeDataCaptureCDC(
            @JsonProperty("initial_waiting_seconds") Optional<? extends Long> initialWaitingSeconds) {
        Utils.checkNotNull(initialWaitingSeconds, "initialWaitingSeconds");
        this.initialWaitingSeconds = initialWaitingSeconds;
        this.method = Builder._SINGLETON_VALUE_Method.value();
    }

    /**
     * The amount of time the connector will wait when it launches to determine if there is new data to sync or not. Defaults to 300 seconds. Valid range: 120 seconds to 1200 seconds. Read about &lt;a href="https://docs.airbyte.com/integrations/sources/mysql/#change-data-capture-cdc"&gt;initial waiting time&lt;/a&gt;.
     */
    public Optional<? extends Long> initialWaitingSeconds() {
        return initialWaitingSeconds;
    }

    public SourceMssqlMethod method() {
        return method;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The amount of time the connector will wait when it launches to determine if there is new data to sync or not. Defaults to 300 seconds. Valid range: 120 seconds to 1200 seconds. Read about &lt;a href="https://docs.airbyte.com/integrations/sources/mysql/#change-data-capture-cdc"&gt;initial waiting time&lt;/a&gt;.
     */
    public ReadChangesUsingChangeDataCaptureCDC withInitialWaitingSeconds(long initialWaitingSeconds) {
        Utils.checkNotNull(initialWaitingSeconds, "initialWaitingSeconds");
        this.initialWaitingSeconds = Optional.ofNullable(initialWaitingSeconds);
        return this;
    }

    /**
     * The amount of time the connector will wait when it launches to determine if there is new data to sync or not. Defaults to 300 seconds. Valid range: 120 seconds to 1200 seconds. Read about &lt;a href="https://docs.airbyte.com/integrations/sources/mysql/#change-data-capture-cdc"&gt;initial waiting time&lt;/a&gt;.
     */
    public ReadChangesUsingChangeDataCaptureCDC withInitialWaitingSeconds(Optional<? extends Long> initialWaitingSeconds) {
        Utils.checkNotNull(initialWaitingSeconds, "initialWaitingSeconds");
        this.initialWaitingSeconds = initialWaitingSeconds;
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
            java.util.Objects.deepEquals(this.initialWaitingSeconds, other.initialWaitingSeconds) &&
            java.util.Objects.deepEquals(this.method, other.method);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            initialWaitingSeconds,
            method);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReadChangesUsingChangeDataCaptureCDC.class,
                "initialWaitingSeconds", initialWaitingSeconds,
                "method", method);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> initialWaitingSeconds;  
        
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
        
        public ReadChangesUsingChangeDataCaptureCDC build() {
            if (initialWaitingSeconds == null) {
                initialWaitingSeconds = _SINGLETON_VALUE_InitialWaitingSeconds.value();
            }
            return new ReadChangesUsingChangeDataCaptureCDC(
                initialWaitingSeconds);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_InitialWaitingSeconds =
                new LazySingletonValue<>(
                        "initial_waiting_seconds",
                        "300",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<SourceMssqlMethod> _SINGLETON_VALUE_Method =
                new LazySingletonValue<>(
                        "method",
                        "\"CDC\"",
                        new TypeReference<SourceMssqlMethod>() {});
    }
}


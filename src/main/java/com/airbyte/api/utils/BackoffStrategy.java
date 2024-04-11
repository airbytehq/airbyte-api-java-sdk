/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.utils;

import java.util.concurrent.TimeUnit;
import com.airbyte.api.utils.Utils;

/**
  * Exponential Backoff Strategy with Jitter
  *
  * The duration between consecutive attempts is calculated as follows:
  *     intervalMs = min(maxIntervalMs, initialIntervalMs*(baseFactor^attempts) +/- r)
  * where baseFactor is the base factor and r a random value between 0 and jitterFactor*intervalMs.
  */
public class BackoffStrategy {

    private static final long DEFAULT_INITIAL_INTERVAL_MS = 500L;
    private static final long DEFAULT_MAX_INTERVAL_MS = 60000L;
    private static final long DEFAULT_MAX_ELAPSED_TIME_MS = 3600000L;
    private static final double DEFAULT_EXPONENT = 1.5;
    private static final double DEFAULT_JITTER_FACTOR = 0.5;
    private static final boolean DEFAULT_RETRY_CONNECT_ERROR = false;
    private static final boolean DEFAULT_RETRY_READ_TIMEOUT_ERROR = false;

    private final long initialIntervalMs;
    private final long maxIntervalMs;
    private final long maxElapsedTimeMs;
    private final double baseFactor;
    private final double jitterFactor;
    private final boolean retryConnectError;
    private final boolean retryReadTimeoutError;

    private BackoffStrategy(long initialIntervalMs,
                           long maxIntervalMs,
                           long maxElapsedTimeMs,
                           double baseFactor,
                           double jitterFactor,
                           boolean retryConnectError,
                           boolean retryReadTimeoutError) {
        this.initialIntervalMs = initialIntervalMs;
        this.maxIntervalMs = maxIntervalMs;
        this.maxElapsedTimeMs = maxElapsedTimeMs;
        this.baseFactor = baseFactor;
        this.jitterFactor = jitterFactor;
        this.retryConnectError = retryConnectError;
        this.retryReadTimeoutError = retryReadTimeoutError;
    }

    public static BackoffStrategy withDefaults() {
        return BackoffStrategy.builder().build();
    }

    public long initialIntervalMs() {
        return initialIntervalMs;
    }

    public long maxIntervalMs() {
        return maxIntervalMs;
    }

    public double baseFactor() {
        return baseFactor;
    }

    /**
    * @deprecated use baseFactor instead.
    */
    @Deprecated
    public double exponent() {
        return baseFactor;
    }

    public long maxElapsedTimeMs() {
        return maxElapsedTimeMs;
    }

    public double jitterFactor() {
        return jitterFactor;
    }

    public boolean retryConnectError() {
        return retryConnectError;
    }

    public boolean retryReadTimeoutError() {
        return retryReadTimeoutError;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public final static class Builder {

        private long initialIntervalMs = DEFAULT_INITIAL_INTERVAL_MS;
        private long maxIntervalMs = DEFAULT_MAX_INTERVAL_MS;
        private long maxElapsedTimeMs = DEFAULT_MAX_ELAPSED_TIME_MS;
        private double baseFactor = DEFAULT_EXPONENT;
        private double jitterFactor = DEFAULT_JITTER_FACTOR;
        private boolean retryConnectError = DEFAULT_RETRY_CONNECT_ERROR;
        private boolean retryReadTimeoutError = DEFAULT_RETRY_READ_TIMEOUT_ERROR;

        private Builder() {}

        /**
          * Sets the initial interval
          *
          * @param duration The initial interval.
          * @param unit The time unit associated with duration.
          * @return The builder instance.
          */
        public Builder initialInterval(long duration, TimeUnit unit) {
            Utils.checkNotNull(unit, "unit");
            if (duration < 0) {
                throw new IllegalArgumentException("initialInterval must be positive");
            }
            this.initialIntervalMs = unit.toMillis(duration);
            return this;
        }

        /**
          * Sets the maximum interval
          *
          * @param duration The maximum interval.
          * @param unit The time unit associated with duration.
          * @return The builder instance.
          */
        public Builder maxInterval(long duration, TimeUnit unit) {
            Utils.checkNotNull(unit, "unit");
            if (duration <= 0) {
                throw new IllegalArgumentException("maxInterval must be strictly positive");
            }
            this.maxIntervalMs = unit.toMillis(duration);
            return this;
        }

        /**
          * Sets the maximum elapsed time
          *
          * @param duration The maximum elapsed time.
          * @param unit The time unit associated with duration.
          * @return The builder instance.
          */
        public Builder maxElapsedTime(long duration, TimeUnit unit) {
            Utils.checkNotNull(unit, "unit");
            if (duration < 0) {
                throw new IllegalArgumentException("maxElapsedTime must be positive");
            }
            this.maxElapsedTimeMs = unit.toMillis(duration);
            return this;
        }

        /**
          * Sets the backoff base factor.
          *
          * @param baseFactor The base factor to use.
          * @return The builder instance.
          */
        public Builder baseFactor(double baseFactor) {
            if (baseFactor <= 0 ) {
                throw new IllegalArgumentException("baseFactor must be strictly positive");
            }
            this.baseFactor = baseFactor;
            return this;
        }

        /**
          * Sets the backoff base factor.
          *
          * @deprecated use baseFactor instead.
          * @param exponent The base factor to use.
          * @return The builder instance.
          */
        @Deprecated
        public Builder exponent(double baseFactor) {
            if (baseFactor <= 0 ) {
                throw new IllegalArgumentException("baseFactor must be strictly positive");
            }
            this.baseFactor = baseFactor;
            return this;
        }

        /**
          * Sets the jitter factor used to randomize the backoff interval.
          *
          * @param jitterFactor The jitter factor to use (default is 0.5f).
          * @return The builder instance.
          */
        public Builder jitterFactor(double jitterFactor) {
            if (jitterFactor < 0 || jitterFactor > 1) {
                throw new IllegalArgumentException("jitterFactor must be between 0 and 1");
            }
            this.jitterFactor = jitterFactor;
            return this;
        }

        /**
          * Specifies whether connection errors should be retried.
          *
          * @param retry Whether to retry on connection error.
          * @return The builder instance.
          */
        public Builder retryConnectError(boolean retry) {
            this.retryConnectError = retry;
            return this;
        }

        /**
          * Do not retry on connection error.
          *
          * @return The builder instance.
          */
        public Builder throwConnectError() {
            this.retryConnectError = false;
            return this;
        }

        /**
          * Specifies whether Read Timeout errors should be retried.
          *
          * @param retry Whether to retry on Read Timeout error.
          * @return The builder instance.
          */
        public Builder retryReadTimeoutError(boolean retry) {
            this.retryReadTimeoutError = retry;
            return this;
        }

        /**
          * Do not retry on Read Timeout error.
          *
          * @return The builder instance.
          */
        public Builder throwReadTimeoutError() {
            this.retryReadTimeoutError = false;
            return this;
        }

        public BackoffStrategy build() {
            return new BackoffStrategy(initialIntervalMs,
                                       maxIntervalMs,
                                       maxElapsedTimeMs,
                                       baseFactor,
                                       jitterFactor,
                                       retryConnectError,
                                       retryReadTimeoutError);
        }
    }
}

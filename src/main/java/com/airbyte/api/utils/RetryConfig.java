/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.utils;

import java.util.Optional;
import com.airbyte.api.utils.Utils;


public class RetryConfig {

    public enum Strategy {
        BACKOFF,
        NONE;
    }

    private final Strategy strategy;
    private final Optional<BackoffStrategy> backoff;

    private RetryConfig(Strategy strategy, Optional<BackoffStrategy> backoff) {
        this.strategy = strategy;
        this.backoff = backoff;

    }
    public static RetryConfig noRetries() {
        return RetryConfig.builder().noRetries().build();
    }

    public Strategy strategy() {
        return strategy;
    }

    public Optional<BackoffStrategy> backoff() {
        return backoff;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public final static class Builder {

        private Strategy strategy = Strategy.NONE;
        private boolean enabled = true;
        private Optional<BackoffStrategy> backoff = Optional.empty();

        private Builder() {}

        /**
          * Disables retries (sets strategy to "none").
          *
          * @return The builder instance.
          */
        public Builder noRetries() {
            this.strategy = Strategy.NONE;
            return this;
        }

        /**
          * Enables the selected strategy.
          *
          * @return The builder instance.
          */
        public Builder enable() {
            this.enabled = true;
            return this;
        }

        /**
          * Enables or disables the selected strategy.
          *
          * @param enable Whether to enable the current strategy.
          * @return The builder instance.
          */
        public Builder enable(boolean enable) {
            this.enabled = enable;
            return this;
        }

        /**
          * Selects and configures the backoff retry strategy.
          *
          * @param backoff The backoff strategy to use.
          * @return The builder instance.
          */
        public Builder backoff(BackoffStrategy backoff) {
            Utils.checkNotNull(backoff, "backoff");
            this.strategy = Strategy.BACKOFF;
            this.backoff = Optional.ofNullable(backoff);
            return this;
        }

        /**
          * Selects the default backoff retry strategy.
          *
          * @return The builder instance.
          */
        public Builder backoff() {
            this.strategy = Strategy.BACKOFF;
            this.backoff = Optional.ofNullable(BackoffStrategy.withDefaults());
            return this;
        }

        public RetryConfig build() {
            if(!enabled) {
                return RetryConfig.noRetries();
            }
            return new RetryConfig(strategy, backoff);
        }
    }
}

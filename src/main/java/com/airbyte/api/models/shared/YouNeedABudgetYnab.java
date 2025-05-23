/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum YouNeedABudgetYnab {
    YOU_NEED_A_BUDGET_YNAB("you-need-a-budget-ynab");

    @JsonValue
    private final String value;

    private YouNeedABudgetYnab(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<YouNeedABudgetYnab> fromValue(String value) {
        for (YouNeedABudgetYnab o: YouNeedABudgetYnab.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}


/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * SourceFacebookMarketingActionReportTime
 * 
 * <p>Determines the report time of action stats. For example, if a person saw the ad on Jan 1st but converted on Jan 2nd, when you query the API with action_report_time=impression, you see a conversion on Jan 1st. When you query the API with action_report_time=conversion, you see a conversion on Jan 2nd.
 */
public enum SourceFacebookMarketingActionReportTime {
    CONVERSION("conversion"),
    IMPRESSION("impression"),
    MIXED("mixed");

    @JsonValue
    private final String value;

    private SourceFacebookMarketingActionReportTime(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceFacebookMarketingActionReportTime> fromValue(String value) {
        for (SourceFacebookMarketingActionReportTime o: SourceFacebookMarketingActionReportTime.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}


/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * ValidBreakdowns
 * 
 * <p>An enumeration.
 */
public enum ValidBreakdowns {
    AD_FORMAT_ASSET("ad_format_asset"),
    AGE("age"),
    APP_ID("app_id"),
    BODY_ASSET("body_asset"),
    BREAKDOWN_REPORTING_AD_ID("breakdown_reporting_ad_id"),
    CALL_TO_ACTION_ASSET("call_to_action_asset"),
    COARSE_CONVERSION_VALUE("coarse_conversion_value"),
    CONVERSION_DESTINATION("conversion_destination"),
    COUNTRY("country"),
    DESCRIPTION_ASSET("description_asset"),
    DEVICE_PLATFORM("device_platform"),
    DMA("dma"),
    FIDELITY_TYPE("fidelity_type"),
    FREQUENCY_VALUE("frequency_value"),
    GENDER("gender"),
    HOURLY_STATS_AGGREGATED_BY_ADVERTISER_TIME_ZONE("hourly_stats_aggregated_by_advertiser_time_zone"),
    HOURLY_STATS_AGGREGATED_BY_AUDIENCE_TIME_ZONE("hourly_stats_aggregated_by_audience_time_zone"),
    HSID("hsid"),
    IMAGE_ASSET("image_asset"),
    IMPRESSION_DEVICE("impression_device"),
    IS_CONVERSION_ID_MODELED("is_conversion_id_modeled"),
    IS_RENDERED_AS_DELAYED_SKIP_AD("is_rendered_as_delayed_skip_ad"),
    LANDING_DESTINATION("landing_destination"),
    LINK_URL_ASSET("link_url_asset"),
    MARKETING_MESSAGES_BTN_NAME("marketing_messages_btn_name"),
    MDSA_LANDING_DESTINATION("mdsa_landing_destination"),
    MEDIA_ASSET_URL("media_asset_url"),
    MEDIA_CREATOR("media_creator"),
    MEDIA_DESTINATION_URL("media_destination_url"),
    MEDIA_FORMAT("media_format"),
    MEDIA_ORIGIN_URL("media_origin_url"),
    MEDIA_TEXT_CONTENT("media_text_content"),
    MEDIA_TYPE("media_type"),
    MMM("mmm"),
    PLACE_PAGE_ID("place_page_id"),
    PLATFORM_POSITION("platform_position"),
    POSTBACK_SEQUENCE_INDEX("postback_sequence_index"),
    PRODUCT_ID("product_id"),
    PUBLISHER_PLATFORM("publisher_platform"),
    REDOWNLOAD("redownload"),
    REGION("region"),
    SIGNAL_SOURCE_BUCKET("signal_source_bucket"),
    SKAN_CAMPAIGN_ID("skan_campaign_id"),
    SKAN_CONVERSION_ID("skan_conversion_id"),
    SKAN_VERSION("skan_version"),
    SOT_ATTRIBUTION_MODEL_TYPE("sot_attribution_model_type"),
    SOT_ATTRIBUTION_WINDOW("sot_attribution_window"),
    SOT_CHANNEL("sot_channel"),
    SOT_EVENT_TYPE("sot_event_type"),
    SOT_SOURCE("sot_source"),
    STANDARD_EVENT_CONTENT_TYPE("standard_event_content_type"),
    TITLE_ASSET("title_asset"),
    USER_PERSONA_ID("user_persona_id"),
    USER_PERSONA_NAME("user_persona_name"),
    VIDEO_ASSET("video_asset");

    @JsonValue
    private final String value;

    private ValidBreakdowns(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ValidBreakdowns> fromValue(String value) {
        for (ValidBreakdowns o: ValidBreakdowns.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}


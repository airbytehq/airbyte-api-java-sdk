/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * SourceFacebookMarketingValidEnums - An enumeration.
 */
public enum SourceFacebookMarketingValidEnums {
    ACCOUNT_CURRENCY("account_currency"),
    ACCOUNT_ID("account_id"),
    ACCOUNT_NAME("account_name"),
    ACTION_VALUES("action_values"),
    ACTIONS("actions"),
    AD_CLICK_ACTIONS("ad_click_actions"),
    AD_ID("ad_id"),
    AD_IMPRESSION_ACTIONS("ad_impression_actions"),
    AD_NAME("ad_name"),
    ADSET_END("adset_end"),
    ADSET_ID("adset_id"),
    ADSET_NAME("adset_name"),
    ADSET_START("adset_start"),
    AGE_TARGETING("age_targeting"),
    ATTRIBUTION_SETTING("attribution_setting"),
    AUCTION_BID("auction_bid"),
    AUCTION_COMPETITIVENESS("auction_competitiveness"),
    AUCTION_MAX_COMPETITOR_BID("auction_max_competitor_bid"),
    BUYING_TYPE("buying_type"),
    CAMPAIGN_ID("campaign_id"),
    CAMPAIGN_NAME("campaign_name"),
    CANVAS_AVG_VIEW_PERCENT("canvas_avg_view_percent"),
    CANVAS_AVG_VIEW_TIME("canvas_avg_view_time"),
    CATALOG_SEGMENT_ACTIONS("catalog_segment_actions"),
    CATALOG_SEGMENT_VALUE("catalog_segment_value"),
    CATALOG_SEGMENT_VALUE_MOBILE_PURCHASE_ROAS("catalog_segment_value_mobile_purchase_roas"),
    CATALOG_SEGMENT_VALUE_OMNI_PURCHASE_ROAS("catalog_segment_value_omni_purchase_roas"),
    CATALOG_SEGMENT_VALUE_WEBSITE_PURCHASE_ROAS("catalog_segment_value_website_purchase_roas"),
    CLICKS("clicks"),
    CONVERSION_RATE_RANKING("conversion_rate_ranking"),
    CONVERSION_VALUES("conversion_values"),
    CONVERSIONS("conversions"),
    CONVERTED_PRODUCT_QUANTITY("converted_product_quantity"),
    CONVERTED_PRODUCT_VALUE("converted_product_value"),
    COST_PER15_SEC_VIDEO_VIEW("cost_per_15_sec_video_view"),
    COST_PER2_SEC_CONTINUOUS_VIDEO_VIEW("cost_per_2_sec_continuous_video_view"),
    COST_PER_ACTION_TYPE("cost_per_action_type"),
    COST_PER_AD_CLICK("cost_per_ad_click"),
    COST_PER_CONVERSION("cost_per_conversion"),
    COST_PER_DDA_COUNTBY_CONVS("cost_per_dda_countby_convs"),
    COST_PER_ESTIMATED_AD_RECALLERS("cost_per_estimated_ad_recallers"),
    COST_PER_INLINE_LINK_CLICK("cost_per_inline_link_click"),
    COST_PER_INLINE_POST_ENGAGEMENT("cost_per_inline_post_engagement"),
    COST_PER_ONE_THOUSAND_AD_IMPRESSION("cost_per_one_thousand_ad_impression"),
    COST_PER_OUTBOUND_CLICK("cost_per_outbound_click"),
    COST_PER_THRUPLAY("cost_per_thruplay"),
    COST_PER_UNIQUE_ACTION_TYPE("cost_per_unique_action_type"),
    COST_PER_UNIQUE_CLICK("cost_per_unique_click"),
    COST_PER_UNIQUE_CONVERSION("cost_per_unique_conversion"),
    COST_PER_UNIQUE_INLINE_LINK_CLICK("cost_per_unique_inline_link_click"),
    COST_PER_UNIQUE_OUTBOUND_CLICK("cost_per_unique_outbound_click"),
    CPC("cpc"),
    CPM("cpm"),
    CPP("cpp"),
    CREATED_TIME("created_time"),
    CREATIVE_MEDIA_TYPE("creative_media_type"),
    CTR("ctr"),
    DATE_START("date_start"),
    DATE_STOP("date_stop"),
    DDA_COUNTBY_CONVS("dda_countby_convs"),
    DDA_RESULTS("dda_results"),
    ENGAGEMENT_RATE_RANKING("engagement_rate_ranking"),
    ESTIMATED_AD_RECALL_RATE("estimated_ad_recall_rate"),
    ESTIMATED_AD_RECALL_RATE_LOWER_BOUND("estimated_ad_recall_rate_lower_bound"),
    ESTIMATED_AD_RECALL_RATE_UPPER_BOUND("estimated_ad_recall_rate_upper_bound"),
    ESTIMATED_AD_RECALLERS("estimated_ad_recallers"),
    ESTIMATED_AD_RECALLERS_LOWER_BOUND("estimated_ad_recallers_lower_bound"),
    ESTIMATED_AD_RECALLERS_UPPER_BOUND("estimated_ad_recallers_upper_bound"),
    FREQUENCY("frequency"),
    FULL_VIEW_IMPRESSIONS("full_view_impressions"),
    FULL_VIEW_REACH("full_view_reach"),
    GENDER_TARGETING("gender_targeting"),
    IMPRESSIONS("impressions"),
    INLINE_LINK_CLICK_CTR("inline_link_click_ctr"),
    INLINE_LINK_CLICKS("inline_link_clicks"),
    INLINE_POST_ENGAGEMENT("inline_post_engagement"),
    INSTAGRAM_UPCOMING_EVENT_REMINDERS_SET("instagram_upcoming_event_reminders_set"),
    INSTANT_EXPERIENCE_CLICKS_TO_OPEN("instant_experience_clicks_to_open"),
    INSTANT_EXPERIENCE_CLICKS_TO_START("instant_experience_clicks_to_start"),
    INSTANT_EXPERIENCE_OUTBOUND_CLICKS("instant_experience_outbound_clicks"),
    INTERACTIVE_COMPONENT_TAP("interactive_component_tap"),
    LABELS("labels"),
    LOCATION("location"),
    MARKETING_MESSAGES_COST_PER_DELIVERED("marketing_messages_cost_per_delivered"),
    MARKETING_MESSAGES_COST_PER_LINK_BTN_CLICK("marketing_messages_cost_per_link_btn_click"),
    MARKETING_MESSAGES_SPEND("marketing_messages_spend"),
    MOBILE_APP_PURCHASE_ROAS("mobile_app_purchase_roas"),
    OBJECTIVE("objective"),
    OPTIMIZATION_GOAL("optimization_goal"),
    OUTBOUND_CLICKS("outbound_clicks"),
    OUTBOUND_CLICKS_CTR("outbound_clicks_ctr"),
    PLACE_PAGE_NAME("place_page_name"),
    PURCHASE_ROAS("purchase_roas"),
    QUALIFYING_QUESTION_QUALIFY_ANSWER_RATE("qualifying_question_qualify_answer_rate"),
    QUALITY_RANKING("quality_ranking"),
    REACH("reach"),
    SOCIAL_SPEND("social_spend"),
    SPEND("spend"),
    TOTAL_POSTBACKS("total_postbacks"),
    TOTAL_POSTBACKS_DETAILED("total_postbacks_detailed"),
    TOTAL_POSTBACKS_DETAILED_V4("total_postbacks_detailed_v4"),
    UNIQUE_ACTIONS("unique_actions"),
    UNIQUE_CLICKS("unique_clicks"),
    UNIQUE_CONVERSIONS("unique_conversions"),
    UNIQUE_CTR("unique_ctr"),
    UNIQUE_INLINE_LINK_CLICK_CTR("unique_inline_link_click_ctr"),
    UNIQUE_INLINE_LINK_CLICKS("unique_inline_link_clicks"),
    UNIQUE_LINK_CLICKS_CTR("unique_link_clicks_ctr"),
    UNIQUE_OUTBOUND_CLICKS("unique_outbound_clicks"),
    UNIQUE_OUTBOUND_CLICKS_CTR("unique_outbound_clicks_ctr"),
    UNIQUE_VIDEO_CONTINUOUS2_SEC_WATCHED_ACTIONS("unique_video_continuous_2_sec_watched_actions"),
    UNIQUE_VIDEO_VIEW15_SEC("unique_video_view_15_sec"),
    UPDATED_TIME("updated_time"),
    VIDEO15_SEC_WATCHED_ACTIONS("video_15_sec_watched_actions"),
    VIDEO30_SEC_WATCHED_ACTIONS("video_30_sec_watched_actions"),
    VIDEO_AVG_TIME_WATCHED_ACTIONS("video_avg_time_watched_actions"),
    VIDEO_CONTINUOUS2_SEC_WATCHED_ACTIONS("video_continuous_2_sec_watched_actions"),
    VIDEO_P100_WATCHED_ACTIONS("video_p100_watched_actions"),
    VIDEO_P25_WATCHED_ACTIONS("video_p25_watched_actions"),
    VIDEO_P50_WATCHED_ACTIONS("video_p50_watched_actions"),
    VIDEO_P75_WATCHED_ACTIONS("video_p75_watched_actions"),
    VIDEO_P95_WATCHED_ACTIONS("video_p95_watched_actions"),
    VIDEO_PLAY_ACTIONS("video_play_actions"),
    VIDEO_PLAY_CURVE_ACTIONS("video_play_curve_actions"),
    VIDEO_PLAY_RETENTION0_TO15S_ACTIONS("video_play_retention_0_to_15s_actions"),
    VIDEO_PLAY_RETENTION20_TO60S_ACTIONS("video_play_retention_20_to_60s_actions"),
    VIDEO_PLAY_RETENTION_GRAPH_ACTIONS("video_play_retention_graph_actions"),
    VIDEO_THRUPLAY_WATCHED_ACTIONS("video_thruplay_watched_actions"),
    VIDEO_TIME_WATCHED_ACTIONS("video_time_watched_actions"),
    WEBSITE_CTR("website_ctr"),
    WEBSITE_PURCHASE_ROAS("website_purchase_roas"),
    WISH_BID("wish_bid");

    @JsonValue
    private final String value;

    private SourceFacebookMarketingValidEnums(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}

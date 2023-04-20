/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * DestinationPulsarTopicTypeEnum - It identifies type of topic. Pulsar supports two kind of topics: persistent and non-persistent. In persistent topic, all messages are durably persisted on disk (that means on multiple disks unless the broker is standalone), whereas non-persistent topic does not persist message into storage disk.
 */
public enum DestinationPulsarTopicTypeEnum {
    PERSISTENT("persistent"),
    NON_PERSISTENT("non-persistent");

    @JsonValue
    public final String value;

    private DestinationPulsarTopicTypeEnum(String value) {
        this.value = value;
    }
}
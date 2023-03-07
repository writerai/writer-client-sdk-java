package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum MetaDataTierEnum {
    ENTERPRISE1("enterprise-1"),
    ENTERPRISE2("enterprise-2"),
    ENTERPRISE3("enterprise-3"),
    ENTERPRISE4("enterprise-4");

    @JsonValue
    public final String value;

    private MetaDataTierEnum(String value) {
        this.value = value;
    }
}

package com.developerhelperhub.klight.ms.item.service;

import lombok.Builder;

public record ItemResponse(String id, String name) {

    @Builder
    public ItemResponse {}
}

package com.developerhelperhub.klight.ms.item.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
public class Controller {

    @GetMapping("/items")
    public ItemListResponse items(@RequestHeader("X-User") String xUser, @RequestHeader("X-Roles") String xRoles) {
        log.info("Items orders...");
        log.debug("Items X-User: {}", xUser);
        log.debug("Items X-Roles: {}", xRoles);

        List<ItemResponse> items = new ArrayList<>();

        items.add(ItemResponse.builder().id("100001").name("Item 1").build());
        items.add(ItemResponse.builder().id("100002").name("Item 2").build());

        log.info("Loaded items {}", items.size());

        return ItemListResponse.builder().items(items).build();
    }

}

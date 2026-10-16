
package com.example.demo.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingController {

    @GetMapping("/shipping")
    public Map<String, Object> getShipping() {
        return Map.of(
            "service", "Shipping Service",
            "orderId", "ORD101",
            "deliveryPartner", "BlueDart",
            "status", "In Transit"
        );
    }
}


package com.example.inventory_service.controler;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

    @GetMapping("/inventory")
    public Map<String, Object> getInventory() {
        return Map.of(
            "service", "Inventory Service",
            "product", "Laptop",
            "quantity", 50,
            "status", "Available"
        );
    }
}

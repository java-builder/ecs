package com.javabuilder.ecs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ECSController {

    @Value("${app.message}")
    private String message;

    @GetMapping
    public String ecsContainer() {
        return message;
    }

}

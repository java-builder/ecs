package com.javabuilder.ecs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ECSController {

    @GetMapping
    public String ecsContainer() {
        return "Welcome to ECS";
    }
}

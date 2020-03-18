package com.example.swaggergradleplugin;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Test")
@RestController
public class TestController {

    @Operation(summary = "Return string", tags = "Test")
    @GetMapping("/test")
    public String test(){
        return "test string";
    }
}

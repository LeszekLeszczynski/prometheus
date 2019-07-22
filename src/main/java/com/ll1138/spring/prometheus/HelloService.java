package com.ll1138.spring.prometheus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloService {

    @RequestMapping("/world")
    String hello() {
        return "Hello World!";
    }
}

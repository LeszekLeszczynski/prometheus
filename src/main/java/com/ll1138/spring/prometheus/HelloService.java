package com.ll1138.spring.prometheus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloService {

    @RequestMapping("/world")
    String hello() {
        return "Hello World!";
    }

    @RequestMapping("/sort")
    int[] sort() {
        return new Random().ints(10000).sorted().toArray();
    }
}

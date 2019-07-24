package com.ll1138.spring.prometheus;

import io.micrometer.core.instrument.MeterRegistry;
import io.prometheus.client.Counter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloService {

    /* SUPER EASY */

    @Autowired
    MeterRegistry registry;

    @RequestMapping("/world")
    String hello() {
        registry.counter("hello_service_requests","method","hello").increment();

        return "Hello World!";
    }

    @RequestMapping("/sort")
    int[] sort() {

        long start = System.currentTimeMillis();

        int[] ret =  new Random().ints(10000).sorted().toArray();

        registry.timer("hello_service_request", "method","sort").record(System.currentTimeMillis() - start, TimeUnit.MILLISECONDS);

        return ret;
    }
}

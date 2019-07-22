package com.ll1138.spring.prometheus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoaderVerificationService {

    @RequestMapping("/loaderio-8879d21d5bef703a5e4008591299454d/")
    String verify() {
        return "loaderio-8879d21d5bef703a5e4008591299454d";
    }
}

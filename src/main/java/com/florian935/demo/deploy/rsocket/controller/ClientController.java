package com.florian935.demo.deploy.rsocket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ClientController {

    @GetMapping("test")
    Mono<String> test() {



        return Mono.just("Tested !");
    }
}

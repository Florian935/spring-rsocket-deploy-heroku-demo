package com.florian935.demo.deploy.rsocket.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class PortController {

    @Value("${server.port}")
    int port;

    @Value("${spring.rsocket.server.port}")
    int rsocketPort;

    @GetMapping("/port")
    Mono<String> getPort() {

        return Mono.just("HTTP PORT: " + port + ", RSOCKET PORT: " + rsocketPort);
    }
}

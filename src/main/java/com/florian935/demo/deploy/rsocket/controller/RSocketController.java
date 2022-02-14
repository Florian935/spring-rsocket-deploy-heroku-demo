package com.florian935.demo.deploy.rsocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
public class RSocketController {

    @MessageMapping("request-response")
    Mono<String> requestResponse() {

        return Mono.just("Hello World !");
    }
}

package com.florian935.demo.deploy.rsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Hooks;

@SpringBootApplication
public class RsocketApplication {

	public static void main(String[] args) {

		Hooks.onErrorDropped(error -> {});
		SpringApplication.run(RsocketApplication.class, args);
	}

}

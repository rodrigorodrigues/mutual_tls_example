package com.example.gateway;

import lombok.AllArgsConstructor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RestController
    @AllArgsConstructor
    class NtGatewayController {
        private final RestTemplate restTemplate;

        @GetMapping("/")
        public ResponseEntity getData() {
            return ResponseEntity.ok(restTemplate.getForObject("https://localhost:9002/nt-ms/data", String.class));
        }
    }
}

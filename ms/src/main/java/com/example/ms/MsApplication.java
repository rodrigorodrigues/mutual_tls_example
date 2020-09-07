package com.example.ms;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsApplication.class, args);
    }

    @RestController
    class NtMsController {
        @GetMapping("/nt-ms/data")
        public ResponseEntity getData() {
            return ResponseEntity.ok(Collections.singletonMap("message", "Hello from NT-MS-data method"));
        }
    }
}

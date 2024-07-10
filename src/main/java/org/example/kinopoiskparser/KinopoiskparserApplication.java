package org.example.kinopoiskparser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class KinopoiskparserApplication {

    public static void main(String[] args) {
        SpringApplication.run(KinopoiskparserApplication.class, args);
    }

}

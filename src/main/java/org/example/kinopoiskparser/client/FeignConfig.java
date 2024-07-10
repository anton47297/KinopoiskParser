package org.example.kinopoiskparser.client;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FeignConfig {
    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> requestTemplate.header("X-API-KEY", "QSK9PYB-ME64BWQ-PCRHBPN-0NVXTCC");
    }
}

package com.montezano.gateway.configs;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Router {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("host_accounts",
                        r -> r.path("/api/accounts/**")
                        .filters(f -> f.rewritePath("/api/accounts", "/accounts"))
                        .uri("http://localhost:8081")
                )
                .build();
    }
}

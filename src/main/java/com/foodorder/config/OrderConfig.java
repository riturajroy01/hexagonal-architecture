package com.foodorder.config;

import com.foodorder.domain.port.output.OrderRepositoryPort;
import com.foodorder.domain.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfig {

    @Bean
    public OrderService orderService(OrderRepositoryPort repository) {
        return new OrderService(repository);
    }
}

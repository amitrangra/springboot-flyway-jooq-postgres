package com.arangra.samplerest.adapter.outbound;

import com.arangra.samplerest.adapter.outbound.user.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OutboundAdapterConfig {

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }
}

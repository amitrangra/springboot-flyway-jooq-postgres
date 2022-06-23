package com.arangra.samplerest.adapter.inbound;

import com.arangra.samplerest.adapter.inbound.user.UserEndpoint;
import com.arangra.samplerest.domain.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InboundAdapterConfig {

    @Bean
    public UserEndpoint userEndpoint(UserService userService) {
        return new UserEndpoint(userService);
    }
}

package com.arangra.samplerest;

import com.arangra.samplerest.adapter.inbound.InboundAdapterConfig;
import com.arangra.samplerest.adapter.outbound.OutboundAdapterConfig;
import com.arangra.samplerest.domain.DomainConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootConfiguration
@EnableAutoConfiguration
@Import({InboundAdapterConfig.class, OutboundAdapterConfig.class, DomainConfig.class})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

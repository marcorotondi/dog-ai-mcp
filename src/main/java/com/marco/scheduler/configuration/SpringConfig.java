package com.marco.scheduler.configuration;

import com.marco.scheduler.component.DogAdoptionScheduler;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MethodToolCallbackProvider methodToolCallbackProvider(DogAdoptionScheduler scheduler) {
        return MethodToolCallbackProvider
                .builder()
                .toolObjects(scheduler)
                .build();
    }
}
package com.redis.cache.config;

import java.time.Duration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;

@Configuration
public class RedisCacheConfig {

    @Bean
    public RedisCacheConfiguration cacheConfiguration() {
        return RedisCacheConfiguration.defaultCacheConfig()

        // "Make cached data disappear after 10 minutes"
                .entryTtl(Duration.ofMinutes(10)) // Set TTL to 10 minutes
                .disableCachingNullValues();
    }
}
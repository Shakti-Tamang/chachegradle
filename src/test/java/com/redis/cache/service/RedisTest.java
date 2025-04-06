package com.redis.cache.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void sendMail(){
        redisTemplate.opsForValue().set("email", "tamangshakti423@gmail.com");

        redisTemplate.opsForValue().get("email");
    }
    
}

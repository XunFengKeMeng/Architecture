package com.example.architecture.demos.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * redis操作Service的实现类
 */
@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    private RedisTemplate<String, Object> stringRedisTemplate;

    @Override
    public void set(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }

    @Override
    public Object get(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    @Override
    public boolean expire(String key, long time) {
        return stringRedisTemplate.expire(key, time, TimeUnit.SECONDS);
    }

    @Override
    public void remove(String key) {
        stringRedisTemplate.delete(key);
    }

    @Override
    public Long increment(String key, long delta) {
        return stringRedisTemplate.opsForValue().increment(key, delta);
    }
}
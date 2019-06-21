package com.neo.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisUtils {
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;
    public Object get(String key){
        return redisTemplate.opsForValue().get(key);
    }
    public void set(String key,Object value){
        redisTemplate.opsForValue().set(key,value);
    }
    public void delete(String key){
        redisTemplate.delete(key);
    }
}

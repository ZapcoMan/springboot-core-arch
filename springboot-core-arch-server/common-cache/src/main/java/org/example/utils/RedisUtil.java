package org.example.utils;

import jakarta.annotation.Resource;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;
/**
 * Redis 工具类
 * 提供对 Redis 的基本操作封装，包括设置键值、检查键是否存在、删除键等操作
 */
@Component
public class RedisUtil {

    @Resource(name = "stringRedisTemplate")
    private StringRedisTemplate redisTemplate;


    /**
     * 设置指定键的值，并设置过期时间
     *
     * @param key 键
     * @param value 值
     * @param timeout 过期时间
     * @param unit 时间单位
     */
    public void set(String key, String value, long timeout, TimeUnit unit) {
        redisTemplate.opsForValue().set(key, value, timeout, unit);
    }

    /**
     * 检查指定键是否存在
     *
     * @param key 要检查的键
     * @return 如果键存在返回 true，否则返回 false
     */
    public boolean exists(String key) {
        return redisTemplate.hasKey(key);
    }

    /**
     * 删除指定键
     *
     * @param key 要删除的键
     */
    public void delete(String key) {
        redisTemplate.delete(key);
    }
}


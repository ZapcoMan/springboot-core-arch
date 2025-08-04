package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * Redis 配置类
 * 用于配置 Redis 相关的 Bean，包括 RedisTemplate 和 StringRedisTemplate
 */
@Configuration
public class RedisConfig {

    /**
     * 创建并配置 RedisTemplate Bean
     * RedisTemplate 是 Spring Data Redis 提供的操作 Redis 的模板类，用于处理对象类型的键值对
     *
     * @param factory Redis 连接工厂，用于创建 Redis 连接
     * @return 配置好的 RedisTemplate 实例
     */
    @Bean(name = "redisTemplate")
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(factory);
        // 配置序列化器等（略）
        return template;
    }

    /**
     * 创建并配置 StringRedisTemplate Bean
     * StringRedisTemplate 是 RedisTemplate 的特化版本，专门用于处理字符串类型的键值对
     *
     * @param factory Redis 连接工厂，用于创建 Redis 连接
     * @return 配置好的 StringRedisTemplate 实例
     */
    @Bean(name = "stringRedisTemplate")
    public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory factory) {
        return new StringRedisTemplate(factory);
    }
}


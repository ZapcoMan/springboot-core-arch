package org.example.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// ... existing code ...
/**
 * Jackson 配置类
 * 用于配置和初始化 ObjectMapper 实例，统一管理应用中的 JSON 序列化和反序列化行为
 */
@Configuration
public class JacksonConfig {
    /**
     * 创建并配置 ObjectMapper Bean
     * ObjectMapper 是 Jackson 库的核心类，用于处理 JSON 数据的序列化和反序列化
     *
     * @return 配置好的 ObjectMapper 实例
     */
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
// ... existing code ...



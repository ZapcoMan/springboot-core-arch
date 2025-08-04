# Spring Boot 核心架构项目

一个基于Spring Boot的微服务架构项目模板，采用模块化设计，便于扩展和维护。
## 项目结构
~~~
springboot-core-arch/
├── .git/
├── .gitignore
├── .idea/
├── LICENSE
├── README.md
└── springboot-core-arch-server/
    ├── .mvn/
    ├── common-core/
    │   ├── pom.xml
    │   └── src/
    │       ├── main/
    │       │   ├── java/
    │       │   │   └── org/
    │       │   │       └── example/
    │       │   │           └── common/
    │       │   │               ├── advice/
    │       │   │               │   └── GlobalResponseAdvice.java
    │       │   │               ├── annotation/
    │       │   │               │   ├── AuditLogRecord.java
    │       │   │               │   ├── DataScope.java
    │       │   │               │   └── RequiresPermission.java
    │       │   │               ├── config/
    │       │   │               │   ├── CorsConfig.java
    │       │   │               │   ├── JacksonConfig.java
    │       │   │               │   ├── JwtProperties.java
    │       │   │               │   ├── MyBatisConfig.java
    │       │   │               │   ├── RedisConfig.java
    │       │   │               │   └── SecurityConfig.java
    │       │   │               ├── dto/
    │       │   │               │   └── PageRequestDTO.java
    │       │   │               ├── exception/
    │       │   │               │   ├── CustomerException.java
    │       │   │               │   └── GlobalExceptionHandler.java
    │       │   │               └── utils/
    │       │   │                   ├── JwtUtil.java
    │       │   │                   ├── MixUtils.java
    │       │   │                   ├── RedisUtil.java
    │       │   │                   └── TokenUtils.java
    │       │   └── resources/
    │       └── test/
    ├── common-dto/
    │   ├── pom.xml
    │   └── src/
    │       ├── main/
    │       └── test/
    ├── common-exception/
    │   ├── pom.xml
    │   └── src/
    │       ├── main/
    │       └── test/
    ├── common-log/
    │   ├── pom.xml
    │   └── src/
    │       ├── main/
    │       └── test/
    ├── common-response/
    │   ├── pom.xml
    │   └── src/
    │       ├── main/
    │       │   ├── java/
    │       │   │   └── org/
    │       │   │       └── example/
    │       │   │           └── result/
    │       │   │               ├── PageResult.java
    │       │   │               ├── R.java
    │       │   │               └── ResultCodeEnum.java
    │       │   └── resources/
    │       └── test/
    ├── common-security/
    │   ├── pom.xml
    │   └── src/
    │       ├── main/
    │       └── test/
    ├── service-auth/
    │   ├── .mvn/
    │   ├── pom.xml
    │   └── src/
    │       ├── main/
    │       │   ├── java/
    │       │   │   └── org/
    │       │   │       └── example/
    │       │   │           └── serviceauth/
    │       │   │               └── ServiceAuthApplication.java
    │       │   └── resources/
    │       │       └── application.properties
    │       └── test/
    │           └── java/
    ├── service-user/
    │   ├── .mvn/
    │   ├── pom.xml
    │   └── src/
    │       ├── main/
    │       │   ├── java/
    │       │   │   └── org/
    │       │   │       └── example/
    │       │   │           └── serviceuser/
    │       │   │               ├── ServiceUserApplication.java
    │       │   │               └── mapper/
    │       │   └── resources/
    │       │       └── application.properties
    │       └── test/
    │           └── java/
    └── pom.xml


~~~

## 许可证

本项目仅供学习和参考使用。



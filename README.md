# Spring Boot 核心架构项目

一个基于Spring Boot的微服务架构项目模板，采用模块化设计，便于扩展和维护。
## 项目结构
~~~
springboot-core-arch/
├── springboot-core-arch-server/
│   ├── common-cache/
│   │   ├── src/main/java/org/example/
│   │   │   ├── config/
│   │   │   │   ├── CorsConfig.java
│   │   │   │   ├── JacksonConfig.java
│   │   │   │   └── RedisConfig.java
│   │   │   └── utils/
│   │   │       ├── MixUtils.java
│   │   │       └── RedisUtil.java
│   │   └── pom.xml
│   ├── common-core/
│   │   ├── src/main/java/org/example/
│   │   │   ├── common/
│   │   │   │   ├── advice/
│   │   │   │   ├── annotation/
│   │   │   │   ├── dto/
│   │   │   │   └── enums/
│   │   │   └── core/
│   │   │       ├── controller/
│   │   │       ├── mapper/
│   │   │       └── service/
│   │   └── pom.xml
│   ├── common-db/
│   │   ├── src/main/java/org/example/
│   │   │   └── config/
│   │   │       └── MyBatisConfig.java
│   │   └── pom.xml
│   ├── common-dto/
│   │   └── pom.xml
│   ├── common-entity/
│   │   ├── src/main/java/org/example/
│   │   │   └── entity/
│   │   │       ├── Account.java
│   │   │       ├── Admin.java
│   │   │       └── AuditLog.java
│   │   └── pom.xml
│   ├── common-exception/
│   │   ├── src/main/java/org/example/
│   │   │   └── exception/
│   │   │       ├── CustomerException.java
│   │   │       └── GlobalExceptionHandler.java
│   │   └── pom.xml
│   ├── common-log/
│   │   ├── src/main/java/org/example/
│   │   │   └── log/
│   │   │       ├── aspect/
│   │   │       ├── mapper/
│   │   │       └── service/
│   │   └── pom.xml
│   ├── common-response/
│   │   ├── src/main/java/org/example/
│   │   │   └── result/
│   │   │       ├── PageResult.java
│   │   │       ├── R.java
│   │   │       └── ResultCodeEnum.java
│   │   └── pom.xml
│   ├── common-security/
│   │   ├── src/main/java/org/example/
│   │   │   ├── config/
│   │   │   │   ├── JwtProperties.java
│   │   │   │   └── SecurityConfig.java
│   │   │   ├── security/
│   │   │   │   ├── AccountService.java
│   │   │   │   ├── JwtAuthenticationFilter.java
│   │   │   │   └── RoleStrategyContext.java
│   │   │   ├── strategy/
│   │   │   │   ├── Context/
│   │   │   │   ├── RoleStrategy.java
│   │   │   │   └── impl/
│   │   │   └── utils/
│   │   │       ├── JwtUtil.java
│   │   │       └── TokenUtils.java
│   │   └── pom.xml
│   ├── server-auth/
│   │   ├── src/main/java/org/example/serviceauth/
│   │   │   └── ServiceAuthApplication.java
│   │   ├── src/main/resources/
│   │   │   └── application.yml
│   │   └── pom.xml
│   ├── server-user/
│   │   ├── src/main/java/org/example/serviceuser/
│   │   │   ├── ServiceUserApplication.java
│   │   │   ├── mapper/
│   │   │   └── service/
│   │   ├── src/main/resources/
│   │   │   └── application.yml
│   │   └── pom.xml
│   └── pom.xml
├── README.md
├── LICENSE
└── .gitignore

~~~


## 许可证

本项目仅供学习和参考使用。



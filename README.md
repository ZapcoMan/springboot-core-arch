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
    ├── pom.xml
    ├── common-core/
    │   ├── pom.xml
    │   └── src/
    │       ├── main/
    │       │   ├── java/
    │       │   │   └── org/example/
    │       │   │       ├── common/
    │       │   │       │   ├── advice/
    │       │   │       │   │   └── GlobalResponseAdvice.java
    │       │   │       │   ├── annotation/
    │       │   │       │   │   ├── AuditLogRecord.java
    │       │   │       │   │   ├── DataScope.java
    │       │   │       │   │   └── RequiresPermission.java
    │       │   │       │   ├── config/
    │       │   │       │   │   ├── CorsConfig.java
    │       │   │       │   │   ├── JacksonConfig.java
    │       │   │       │   │   ├── JwtProperties.java
    │       │   │       │   │   ├── MyBatisConfig.java
    │       │   │       │   │   ├── RedisConfig.java
    │       │   │       │   │   └── SecurityConfig.java
    │       │   │       │   ├── dto/
    │       │   │       │   │   └── PageRequestDTO.java
    │       │   │       │   ├── enums/
    │       │   │       │   │   └── RoleEnum.java
    │       │   │       │   └── utils/
    │       │   │       │       ├── JwtUtil.java
    │       │   │       │       ├── MixUtils.java
    │       │   │       │       ├── RedisUtil.java
    │       │   │       │       └── TokenUtils.java
    │       │   │       └── core/
    │       │   │           ├── controller/
    │       │   │           │   └── BaseController.java
    │       │   │           ├── mapper/
    │       │   │           │   └── BaseMapper.java
    │       │   │           └── service/
    │       │   │               ├── BaseService.java
    │       │   │               └── impl/
    │       │   │                   └── BaseServiceImpl.java
    │       │   └── resources/
    │       └── test/
    ├── common-dto/
    │   ├── pom.xml
    │   └── src/
    │       ├── main/
    │       │   └── java/
    │       │       └── org/example/
    │       └── test/
    ├── common-entity/
    │   ├── pom.xml
    │   └── src/
    │       ├── main/
    │       │   └── java/
    │       │       └── org/example/entity/
    │       │           ├── Account.java
    │       │           ├── Admin.java
    │       │           └── AuditLog.java
    │       └── test/
    ├── common-exception/
    │   ├── pom.xml
    │   └── src/
    │       ├── main/
    │       │   └── java/
    │       │       └── org/example/exception/
    │       │           ├── CustomerException.java
    │       │           └── GlobalExceptionHandler.java
    │       └── test/
    ├── common-log/
    │   ├── pom.xml
    │   └── src/
    │       ├── main/
    │       │   └── java/
    │       │       └── org/example/log/
    │       │           ├── aspect/
    │       │           │   └── AuditLogAspect.java
    │       │           ├── mapper/
    │       │           │   └── AuditLogMapper.java
    │       │           └── service/
    │       │               ├── AuditLogService.java
    │       │               └── impl/
    │       │                   └── AuditLogServiceImpl.java
    │       └── test/
    ├── common-response/
    │   ├── pom.xml
    │   └── src/
    │       ├── main/
    │       │   └── java/
    │       │       └── org/example/result/
    │       │           ├── PageResult.java
    │       │           ├── R.java
    │       │           └── ResultCodeEnum.java
    │       └── test/
    ├── common-security/
    │   ├── pom.xml
    │   └── src/
    │       ├── main/
    │       │   └── java/
    │       │       └── org/example/
    │       │           ├── security/
    │       │           │   ├── AccountService.java
    │       │           │   ├── JwtAuthenticationFilter.java
    │       │           │   └── RoleStrategyContext.java
    │       │           └── strategy/
    │       │               ├── Context/
    │       │               │   └── RoleStrategyContext.java
    │       │               ├── RoleStrategy.java
    │       │               └── impl/
    │       │                   ├── AdminStrategy.java
    │       │                   ├── TeacherStrategy.java
    │       │                   └── UserStrategy.java
    │       └── test/
    ├── server-auth/
    │   ├── .mvn/
    │   ├── pom.xml
    │   └── src/
    │       ├── main/
    │       │   ├── java/
    │       │   │   └── org/example/serviceauth/
    │       │   │       └── ServiceAuthApplication.java
    │       │   └── resources/
    │       │       └── application.yml
    │       └── test/
    └── server-user/
        ├── .mvn/
        ├── pom.xml
        └── src/
            ├── main/
            │   ├── java/
            │   │   └── org/example/serviceuser/
            │   │       ├── ServiceUserApplication.java
            │   │       ├── mapper/
            │   │       └── service/
            │   │           └── account/
            │   │               └── impl/
            │   │                   └── AdminAccountServiceImpl.java
            │   └── resources/
            │       └── application.yml
            └── test/

~~~


## 许可证

本项目仅供学习和参考使用。



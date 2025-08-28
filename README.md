# Spring Boot 核心架构项目

一个基于Spring Boot的微服务架构项目模板，采用模块化设计，便于扩展和维护。
## 项目结构
~~~
springboot-core-arch/
.github/
└── workflows/
    └── deploy.yml

├── README.md
├── LICENSE
├── .gitignore
└── springboot-core-arch-server/
    ├── pom.xml
    ├── docker-compose.yml
    ├── common-cache/
    │   ├── pom.xml
    │   └── src/
    │       └── main/
    │           └── java/
    │               └── org/
    │                   └── example/
    │                       ├── config/
    │                       │   ├── CorsConfig.java
    │                       │   ├── JacksonConfig.java
    │                       │   └── RedisConfig.java
    │                       └── utils/
    │                           ├── MixUtils.java
    │                           └── RedisUtil.java
    ├── common-common/
    │   ├── pom.xml
    │   └── src/
    │       └── main/
    │           └── java/
    │               └── org/
    │                   └── example/
    │                       └── common/
    │                           ├── annotation/
    │                           ├── dto/
    │                           └── enums/
    ├── common-core/
    │   ├── pom.xml
    │   └── src/
    │       └── main/
    │           └── java/
    │               └── org/
    │                   └── example/
    │                       └── core/
    │                           ├── controller/
    │                           ├── mapper/
    │                           └── service/
    ├── common-db/
    │   ├── pom.xml
    │   └── src/
    │       └── main/
    │           └── java/
    │               └── org/
    │                   └── example/
    ├── common-dto/
    │   ├── pom.xml
    │   └── src/
    │       └── main/
    │           └── java/
    │               └── org/
    │                   └── example/
    │                       ├── ConfirmDto.java
    │                       ├── LoginResult.java
    │                       └── PageRequestDTO.java
    ├── common-entity/
    │   ├── pom.xml
    │   └── src/
    │       └── main/
    │           └── java/
    │               └── org/
    │                   └── example/
    │                       └── entity/
    │                           ├── Account.java
    │                           └── Admin.java
    ├── common-exception/
    │   ├── pom.xml
    │   └── src/
    │       └── main/
    │           └── java/
    │               └── org/
    │                   └── example/
    │                       └── exception/
    │                           ├── CustomerException.java
    │                           └── GlobalExceptionHandler.java
    ├── common-log/
    │   ├── pom.xml
    │   └── src/
    │       └── main/
    │           └── java/
    │               └── org/
    │                   └── example/
    │                       └── log/
    │                           ├── aspect/
    │                           ├── entity/
    │                           ├── mapper/
    │                           └── service/
    ├── common-response/
    │   ├── pom.xml
    │   └── src/
    │       └── main/
    │           └── java/
    │               └── org/
    │                   └── example/
    │                       ├── advice/
    │                       └── result/
    │                           ├── PageResult.java
    │                           ├── R.java
    │                           └── ResultCodeEnum.java
    ├── common-security/
    │   ├── pom.xml
    │   └── src/
    │       └── main/
    │           └── java/
    │               └── org/
    │                   └── example/
    │                       ├── config/
    │                       │   ├── JwtProperties.java
    │                       │   └── SecurityConfig.java
    │                       ├── security/
    │                       │   ├── AccountService.java
    │                       │   ├── JwtAuthenticationFilter.java
    │                       │   └── RoleStrategyContext.java
    │                       ├── strategy/
    │                       │   ├── Context/
    │                       │   ├── RoleStrategy.java
    │                       │   └── impl/
    │                       └── utils/
    │                           ├── JwtUtil.java
    │                           └── TokenUtils.java
    ├── server-auth/
    │   ├── pom.xml
    │   ├── Dockerfile
    │   ├── application-docker.yml
    │   └── src/
    │       └── main/
    │           ├── java/
    │           │   └── org/
    │           │       └── example/
    │           │           └── serviceauth/
    │           │               ├── ServiceAuthApplication.java
    │           │               ├── account/
    │           │               ├── controller/
    │           │               ├── mapper/
    │           │               ├── service/
    │           │               └── strategy/
    │           └── resources/
    │               └── application.yml
    └── server-user/
        ├── pom.xml
        ├── Dockerfile
        ├── application-docker.yml
        └── src/
            └── main/
                ├── java/
                │   └── org/
                │       └── example/
                │           └── serviceuser/
                │               ├── ServiceUserApplication.java
                │               ├── mapper/
                │               └── service/
                └── resources/
                    └── application.yml


~~~
~~~
  springboot-core-arch  ls                                                                                                                                                                                                                                                                                          
╭───┬─────────────────────────────┬──────┬─────────┬────────────────╮
│ # │            name             │ type │  size   │    modified    │                                                                                                                                                                                                                                                 
├───┼─────────────────────────────┼──────┼─────────┼────────────────┤
│ 0 │ .github                     │ dir  │     0 B │ 3 minutes ago  │                                                                                                                                                                                                                                                 
│ 1 │ .gitignore                  │ file │   774 B │ 3 weeks ago    │                                                                                                                                                                                                                                                 
│ 2 │ .idea                       │ dir  │  4.0 kB │ 2 minutes ago  │                                                                                                                                                                                                                                                 
│ 3 │ LICENSE                     │ file │ 27.0 kB │ 3 weeks ago    │                                                                                                                                                                                                                                                 
│ 4 │ README.md                   │ file │  6.9 kB │ 15 seconds ago │                                                                                                                                                                                                                                                 
│ 5 │ springboot-core-arch-server │ dir  │  4.0 kB │ 2 minutes ago  │                                                                                                                                                                                                                                                 
│ 6 │ 部署                        │ dir  │     0 B │ 2 minutes ago  │                                                                                                                                                                                                                                                 
╰───┴─────────────────────────────┴──────┴─────────┴────────────────╯
 springboot-core-arch  cd 部署                                                                                                                                                                                                                                                                                      
 部署  ls                                                                                                                                                                                                                                                                                                           
╭───┬─────────────┬──────┬───────┬───────────────╮
│ # │    name     │ type │ size  │   modified    │                                                                                                                                                                                                                                                                    
├───┼─────────────┼──────┼───────┼───────────────┤
│ 0 │ install.bat │ file │ 844 B │ 3 minutes ago │                                                                                                                                                                                                                                                                    
│ 1 │ install.sh  │ file │ 830 B │ 3 minutes ago │                                                                                                                                                                                                                                                                    
╰───┴─────────────┴──────┴───────┴───────────────╯
~~~

## 许可证

本项目仅供学习和参考使用。



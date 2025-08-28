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




* 本项目采用了 Spring Security 和 JWT (JSON Web Token) 相结合的安全框架方案，实现了基于 Token 的无状态认证机制。这种方案特别适用于微服务架构，能够有效处理分布式系统中的用户认证和授权问题。

## 核心组件

### 1. Spring Security 配置

项目中的安全配置主要在 `common-security` 模块中实现：

- [SecurityConfig.java](file://E:\java\maven_project\springboot-core-arch\springboot-core-arch-server\common-security\src\main\java\org\example\config\SecurityConfig.java): Spring Security 核心配置类
- [JwtAuthenticationFilter.java](file://E:\java\maven_project\springboot-core-arch\springboot-core-arch-server\common-security\src\main\java\org\example\security\JwtAuthenticationFilter.java): JWT 认证过滤器
- [AccountService.java](file://E:\java\maven_project\springboot-core-arch\springboot-core-arch-server\common-security\src\main\java\org\example\security\AccountService.java): 账户服务接口

### 2. JWT 工具类

- [JwtUtil.java](file://E:\java\maven_project\springboot-core-arch\springboot-core-arch-server\common-security\src\main\java\org\example\utils\JwtUtil.java): JWT 工具类，负责 Token 的生成和验证
- [TokenUtils.java](file://E:\java\maven_project\springboot-core-arch\springboot-core-arch-server\common-security\src\main\java\org\example\utils\TokenUtils.java): Token 工具类，提供 Token 创建和用户信息获取功能

### 3. 配置属性

- [JwtProperties.java](file://E:\java\maven_project\springboot-core-arch\springboot-core-arch-server\common-security\src\main\java\org\example\config\JwtProperties.java): JWT 配置属性类，用于读取配置文件中的 JWT 相关参数

## 安全机制详解

### 1. 认证流程

1. 用户通过 `/auth/login` 接口提交用户名和密码进行登录
2. 系统验证用户凭据，验证通过后生成 JWT Token
3. 将 Token 返回给客户端
4. 客户端在后续请求中携带 Token（通常在请求头中）
5. 服务端通过 [JwtAuthenticationFilter](file://E:\java\maven_project\springboot-core-arch\springboot-core-arch-server\common-security\src\main\java\org\example\security\JwtAuthenticationFilter.java#L23-L139) 拦截请求并验证 Token
6. Token 验证通过后，将用户信息存入 Spring Security 上下文

### 2. JWT Token 结构

项目中使用的 JWT Token 包含以下信息：
- Subject: 用户 ID
- Claims: 用户角色信息
- ExpiresAt: 过期时间
- Signature: 使用密钥签名确保 Token 不被篡改

### 3. 自动续签机制

系统实现了 Token 自动续签功能：
- 当 Token 剂剩余有效期少于 30 分钟时，自动生成新的 Token
- 新 Token 通过响应头 `Renew-Token` 返回给客户端
- 客户端收到新 Token 后应替换旧 Token

### 4. 角色策略模式

项目采用策略模式处理不同角色的认证逻辑：
- [RoleStrategy.java](file://E:\java\maven_project\springboot-core-arch\springboot-core-arch-server\common-security\src\main\java\org\example\strategy\RoleStrategy.java): 角色策略接口
- [AdminStrategy.java](file://E:\java\maven_project\springboot-core-arch\springboot-core-arch-server\server-auth\src\main\java\org\example\serviceauth\strategy\AdminStrategy.java): 管理员角色策略实现
- [RoleStrategyContext.java](file://E:\java\maven_project\springboot-core-arch\springboot-core-arch-server\common-security\src\main\java\org\example\security\RoleStrategyContext.java): 角色策略上下文

这种设计使得系统可以轻松扩展支持更多
## 许可证

本项目仅供学习和参考使用。



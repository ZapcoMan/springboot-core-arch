# Spring Boot 核心架构项目

一个基于Spring Boot的微服务架构项目模板，采用模块化设计，便于扩展和维护。
## 项目结构
~~~
springboot-core-arch/
├── .git/                           # Git版本控制目录
├── .idea/                          # IntelliJ IDEA配置目录
├── springboot-core-arch-server/    # 服务端主目录
│   ├── .mvn/                       # Maven包装器配置
│   ├── common-core/                # 核心通用模块
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   ├── java/org/example/common/
│   │   │   │   │   ├── advice/     # 统一响应处理等切面
│   │   │   │   │   ├── annotation/ # 自定义注解
│   │   │   │   │   ├── config/     # 配置类
│   │   │   │   │   ├── dto/        # 数据传输对象
│   │   │   │   │   ├── exception/  # 异常处理相关
│   │   │   │   │   └── utils/      # 工具类
│   │   │   │   └── resources/      # 资源文件
│   │   │   └── test/               # 测试代码
│   │   └── pom.xml                 # 模块Maven配置
│   │
│   ├── common-dto/                 # 数据传输对象模块
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   ├── java/           # DTO类定义
│   │   │   │   └── resources/
│   │   │   └── test/
│   │   └── pom.xml
│   │
│   ├── common-exception/           # 统一异常处理模块
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   ├── java/           # 异常定义和处理
│   │   │   │   └── resources/
│   │   │   └── test/
│   │   └── pom.xml
│   │
│   ├── common-log/                 # 日志处理模块
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   ├── java/           # 日志相关功能
│   │   │   │   └── resources/
│   │   │   └── test/
│   │   └── pom.xml
│   │
│   ├── common-response/            # 响应处理模块
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   ├── java/           # 统一响应格式定义
│   │   │   │   └── resources/
│   │   │   └── test/
│   │   └── pom.xml
│   │
│   ├── common-security/            # 安全模块
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   ├── java/           # 安全相关功能
│   │   │   │   └── resources/
│   │   │   └── test/
│   │   └── pom.xml
│   │
│   ├── service-auth/               # 认证服务模块
│   │   ├── .mvn/                   # Maven包装器
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   ├── java/           # 认证服务业务逻辑
│   │   │   │   └── resources/      # 配置文件
│   │   │   └── test/
│   │   ├── pom.xml
│   │   └── Dockerfile              # Docker部署文件
│   │
│   ├── service-user/               # 用户服务模块
│   │   ├── .mvn/                   # Maven包装器
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   ├── java/           # 用户服务业务逻辑
│   │   │   │   └── resources/      # 配置文件
│   │   │   └── test/
│   │   ├── pom.xml
│   │   └── Dockerfile              # Docker部署文件
│   │
│   └── pom.xml                     # 父级Maven配置
├── .gitignore                      # Git忽略文件配置
├── LICENSE                         # 许可证文件
└── README.md                       # 项目说明文档

~~~

## 许可证

本项目仅供学习和参考使用。



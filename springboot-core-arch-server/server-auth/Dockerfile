# 使用官方OpenJDK运行环境作为基础镜像
FROM openjdk:17-jdk-slim

# 设置工作目录
WORKDIR /app

# 将构建好的jar文件复制到容器中
COPY target/server-auth-1.0-SNAPSHOT.jar app.jar

# 暴露端口
EXPOSE 8089

# 运行应用
ENTRYPOINT ["java", "-jar", "app.jar"]

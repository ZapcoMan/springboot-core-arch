#!/bin/bash

# 项目自动化部署脚本

echo "开始自动化部署Spring Boot核心架构项目..."

# 1. 清理并构建项目
echo "步骤1: 清理并构建项目..."
cd springboot-core-arch-server
mvn clean package -DskipTests

# 2. 构建Docker镜像
echo "步骤2: 构建Docker镜像..."

# 构建server-auth镜像
echo "构建server-auth镜像..."
cd server-auth
docker build -t server-auth:1.0 .

# 构建server-user镜像
echo "构建server-user镜像..."
cd ../server-user
docker build -t server-user:1.0 .

# 3. 启动所有服务
echo "步骤3: 启动所有服务..."
cd ..
docker-compose up -d

echo "部署完成！"
echo "可以通过以下地址访问服务:"
echo "  server-auth: http://localhost:8089"
echo "  server-user: http://localhost:8090"
echo "  mysql: localhost:3307"
echo "  redis: localhost:6379"

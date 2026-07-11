FROM eclipse-temurin:21-jre        # 官方基础镜像,自带 JRE
COPY target/*.jar /app.jar          # 把上一课的产物拷进镜像
EXPOSE 8080                         # 声明应用端口
ENTRYPOINT ["java","-jar","/app.jar"]  # 容器启动即运行
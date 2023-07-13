FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar spring-project.jar
ENTRYPOINT [ "java","-jar","/spring-project.jar" ]
EXPOSE 8080
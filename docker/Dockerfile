FROM openjdk:8-jdk-alpine
# Spring Boot with Docker
# https://spring.io/guides/gs/spring-boot-docker/
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]

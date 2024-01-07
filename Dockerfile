## Dockerfile-prod
FROM openjdk:17-jdk
## EXPOSE 8080
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=docker","/app.jar"]

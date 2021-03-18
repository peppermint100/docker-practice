FROM openjdk:11-jre-slim-buster
ADD build/libs/spring-docker.jar spring-docker.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/spring-docker.jar"]
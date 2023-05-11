FROM gradle:7.6.1-jdk17 AS build
WORKDIR /home/gradle/src
COPY . .

RUN sh gradlew build --no-daemon

FROM openjdk:17-jdk-alpine

RUN mkdir /app

COPY --from=build /home/gradle/src/build/libs/*.jar /app/spring-boot-application.jar

ENTRYPOINT ["java","-jar","/app.jar"]
FROM gradle:8.14.3-jdk21-alpine AS build

WORKDIR /app
COPY build.gradle settings.gradle ./
COPY src ./src

RUN gradle clean bootJar --no-daemon

FROM amazoncorretto:21.0.5-al2023-headless

WORKDIR /app
COPY --from=build /app/build/libs/*-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
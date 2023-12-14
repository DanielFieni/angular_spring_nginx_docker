# Use an official Maven image as a build stage
FROM maven:3.8.4-openjdk-17-slim AS build
WORKDIR /usr/src/app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

CMD mvn spring-boot:run

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /usr/src/app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=dev", "app.jar"]

###  STAGE 1: Build step ### New data
FROM openjdk:17-jdk-slim-buster as build

WORKDIR /workspace/app

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

RUN ./mvnw install -DskipTests=true

RUN mkdir -p target/dist && cp target/*.jar target/dist/app.jar

### STAGE 2: Application image  ###
FROM openjdk:17

COPY --from=build /workspace/app/target/dist/*.jar ./

ENTRYPOINT ["java", "-jar", "app.jar"]
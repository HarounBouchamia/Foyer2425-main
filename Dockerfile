# Étape 1 : build
FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Étape 2 : run
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/Foyer-1.4.0-SNAPSHOT.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app.jar"]
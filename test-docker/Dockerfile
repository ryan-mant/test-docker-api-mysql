# Etapa 1: Construção do projeto
FROM maven:3.8.4-openjdk-17 AS build

COPY src /app/src
COPY pom.xml /app

WORKDIR /app

RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim

RUN apt-get update && apt-get install -y default-mysql-client && apt-get clean


COPY --from=build /app/target/test-docker-0.0.1.jar /app/app.jar

COPY wait-for-db.sh /app/wait-for-db.sh

WORKDIR /app

RUN chmod +x /app/wait-for-db.sh

CMD ["./wait-for-db.sh", "db", "java", "-jar", "app.jar"]

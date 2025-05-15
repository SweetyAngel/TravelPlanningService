# Этап сборки с Maven
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /workspace/app
COPY pom.xml .
# Кэшируем зависимости
RUN mvn dependency:go-offline
COPY src src
RUN mvn clean package -DskipTests

# Этап запуска
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
# Явно указываем имя файла (аналогично вашему pom.xml)
COPY --from=build /workspace/app/target/travel-planning-service-*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

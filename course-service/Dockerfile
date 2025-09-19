# ==== Build stage ====
FROM eclipse-temurin:21-jdk-jammy AS build
WORKDIR /workspace

# Copy Maven wrapper & pom first for dependency resolution layer caching
COPY pom.xml ./
COPY mvnw* ./
COPY .mvn .mvn

# Copy source
COPY src src

# Build application (skip tests for faster container build; adjust if you want tests)
RUN chmod +x mvnw && ./mvnw -B -DskipTests clean package

# ==== Runtime stage ====
FROM eclipse-temurin:21-jre-jammy
WORKDIR /app

# Copy built jar
COPY --from=build /workspace/target/*.jar app.jar

# Environment placeholders (override at runtime)
ENV JAVA_OPTS="" \
    SPRING_PROFILES_ACTIVE=prod

EXPOSE 8080

# Use exec form to allow signal handling
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /app/app.jar"]

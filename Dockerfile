# Use lightweight Java 17 runtime image
FROM eclipse-temurin:17-jre-alpine

# Set working directory inside container
WORKDIR /app

# Copy the jar file into container
COPY target/docker-jenkin-cicd-0.0.1-SNAPSHOT.jar docker-jenkin-cicd-0.0.1-SNAPSHOT.jar

# Expose application port (change if needed)
EXPOSE 8081

# Run the application
ENTRYPOINT ["java", "-jar", "docker-jenkin-cicd-0.0.1-SNAPSHOT.jar"]

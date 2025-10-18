# Use official OpenJDK 17 image
FROM adoptopenjdk:17-jdk-hotspot


# Set working directory
WORKDIR /app

# Copy the jar file from target folder
COPY target/Flipcart-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
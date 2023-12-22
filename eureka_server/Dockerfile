# Use a base image with Java and Maven installed
#FROM maven:3.8.4-openjdk-17-slim AS build
#WORKDIR /app

# Copy the project files into the container
#COPY . .

# Build the Spring Boot application
#RUN mvn clean package

# Use a minimal JRE image for the final image
FROM openjdk:17-jdk-alpine
WORKDIR /app

# Copy the JAR file from the build image to the final image
COPY target/*.jar app.jar

# Expose the port that the application will run on
EXPOSE 8761

# Define the command to run the application
CMD ["java", "-jar", "app.jar"]

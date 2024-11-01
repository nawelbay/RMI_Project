# Use an OpenJDK base image
FROM openjdk:11-jdk

# Set the working directory
WORKDIR /usr/src/app

# Copy the compiled JAR file
COPY ServerDocker.jar /usr/src/app

# Expose the necessary ports for RMI registry and communication
EXPOSE 1099

# Start the RMI registry and the server
CMD ["bash", "-c", "rmiregistry & java -jar ServerDocker.jar"]

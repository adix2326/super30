FROM openjdk:18
LABEL authors="Aditya"
WORKDIR /app
COPY target/myapp.jar myapp.jar
EXPOSE 8080
CMD ["java", "-jar", "myapp.jar"]
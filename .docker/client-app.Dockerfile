FROM gradle:8.6.0-jdk21-alpine

WORKDIR /app
COPY build/libs/https-0.0.1-SNAPSHOT.jar /app

ENTRYPOINT ["java", "-jar" ,"client-app.jar"]
FROM gradle:8.6.0-jdk21-alpine

WORKDIR /app
COPY client/build/libs/client-21.jar /app

ENTRYPOINT ["java", "-jar", "client-21.jar"]
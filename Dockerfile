FROM openjdk:17-jdk-alpine

WORKDIR /app

EXPOSE 8080

ENV DATABASE_URL=${DATABASE_URL} \
    DATABASE_USER=${DATABASE_USER} \
    DATABASE_PASSWORD=${DATABASE_PASSWORD} \
    TOKEN_API=${TOKEN_API}
    
ADD ./target/aistudio-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
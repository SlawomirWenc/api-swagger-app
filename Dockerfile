FROM openjdk:12-alpine
ADD target/api-swagger-app-0.0.1-SNAPSHOT.jar .
EXPOSE 8000
CMD java -jar api-swagger-app-0.0.1-SNAPSHOT.jar
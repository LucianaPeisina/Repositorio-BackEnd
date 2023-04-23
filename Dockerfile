
FROM amazoncorretto:8-alpine-jdk

MAINTAINER Luciana

COPY target/miportfolioweb-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]

 
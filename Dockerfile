
FROM openjdk:8

MAINTAINER Luciana

COPY target/miportfolioweb-0.0.1-SNAPSHOT.jar miportfolioweb-0.0.1-SNAPSHOT.jar
EXPOSE 8080

ENTRYPOINT ["java","-jar","/miportfolioweb-0.0.1-SNAPSHOT.jar"]

 
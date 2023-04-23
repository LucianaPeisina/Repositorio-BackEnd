FROM openjdk:8

MAINTAINER Luciana

COPY target/miportfolioweb-0.0.1-SNAPSHOT.jar miportfolioweb-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/miportfolioweb-0.0.1-SNAPSHOT.jar"]

 
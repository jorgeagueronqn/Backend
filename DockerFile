FROM amazoncorretto:11-alpine-jdk
MAINTAINER jorgeAguero
COPY target/jaa-0.0.1-SNAPSHOT.jar jaa-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/jaa-0.0.1-SNAPSHOT.jar"]
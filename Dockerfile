FROM openjdk:8-jre-alpine
MAINTAINER MarvinAmari<contact@marvinamari.com>
EXPOSE 8085
RUN mkdir -p /app/
WORKDIR /app/
COPY build/libs/passenger-0.0.1-SNAPSHOT.jar /app/passenger.jar
ENTRYPOINT ["java" , "-jar" , "/app/passenger.jar"]  




 


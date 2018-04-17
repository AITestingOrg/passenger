FROM openjdk:9-jre-sid
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac PassengerApplication.java 


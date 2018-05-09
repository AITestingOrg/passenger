# Passenger CRUD Service
Passenger is meant to create, store, and serve passengers as a framework for the REST API.


## Features
* Query Passenger
    * Query by Passenger ID
    * Query all Passengers
* Creat Passenger
* Update Passenger
* Delete Passenger

# Demo
To run this project from docker:
* Make sure that the Docker daemon is installed and running.
* Assemble this project.
* Run ```docker-compose up --build``` from the root project.
* On another terminal run ```docker ps``` to see which ports were assigned.
To run locally:
   - []

To run using docker-compose: (be sure to have Docker installed)
   - Run `docker-compose pull` to make sure you have the latest images pulled.
   - Run `docker-compose up --build` within the root of the passenger folder.
   - On another terminal run '''docker ps''' to see which ports were assigned
## Endpoints

#### POST to api/v1/passenger

With json body:

```
{
	"firstName": "Marvin",
	"lastName": "Dore",
	"email": "Marvin@yolo.com",
	"streetAddress": "Black House",
	"city": "Mars",
	"state": "Pluto",
	"zip": "town",
	"phoneNumber": "null"
}
```

### GET to api/v1/passenger
* Returns list of all passengers.

### GET to api/v1/passenger/{id}
* Enter the passenger id received from the POST request in the {id} field to retrieve individual passenger.

### PUT to api/v1/passenger/{id}

With json body:

```
{
	"firstName": "Marvin",
	"lastName": "Dore",
	"email": "Marvin@yolo.com",
	"streetAddress": "Black House",
	"city": "Mars",
	"state": "Pluto",
	"zip": "town",
	"phoneNumber": "null"
}
```

### DELETE to api/v1/passenger/{id}
* Where id is the passenger id received from the POST request at creation.

# Development

## Requirements
* Docker 17.xx.x
* JDK 1.8
* IntelliJ 2018
* Postgresql


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

The following applications must have been installed in your system previous to run this application.

 - Java8
 - Postgresql
 
### Installing

Check MySQL root and username and password on file:
   src/main/resources/application.properties
   
Create DB on MySQL:
   passenger_db

To build the microservice run command on root directory of the project:
   ./gradlew clean build bootRun
   

## Running the tests

Test http://localhost:8081/api/v1/passenger -GET

## Deployment

-

## Built With

* [Spring Boot](https://spring.io/docs) - Application Framework
* [Gradle](https://docs.gradle.org/4.2/release-notes.html) - Dependency Management

## Authors

* **Marvin Dore**

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

Passenger CRUD service

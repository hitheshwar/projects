# Speaking Clock Microservice

## Introduction

The Speaking Clock Microservice is a Java-based microservice that converts the current time into words and handles user input in the format "HH:mm". It is built using Spring Boot and Maven.

## Features

- Converts the current time into words.
- Handles user input in the format "HH:mm".
- Recognizes Midday and Midnight.

## Build Instructions

To build the project, follow these steps:

1. Import the project.

2. Build the project using Maven.

3. Run the application.

## Configuration

The microservice can be configured in the application.properties file. Update the file to customize settings such as server port, logging, etc.

## APIs:

http://localhost:8080/speaking-clock/v1/convert?time=12:00 (output : It's twelve minutes)

http://localhost:8080/speaking-clock/v2/convert?time=12:00 (output : It's Midday)

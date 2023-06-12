# Project description
Build a permission based authorization system for API access control.
Users should be able to login using credentials and receive a token. That Authorization token will
be later passed on each API. Create two type of API’s:
1. Public API - Anyone canaccess
2. Private API - Only users having role with a particular permission should be able to access

## Prerequisites
Before running the project, ensure you have the following prerequisites installed and configured:

1. Java Development Kit (JDK) 8 or higher
2. Apache Maven 
3. MySQL Server

## Installation
1. Clone the repository:
```
git clone https://github.com/your-username/your-project.git
```
2. Navigate to the project directory:
```
cd your-project
```
3. Configure the database connection:
```
Open the application.properties file located in the src/main/resources directory.
Modify the database URL, username, and password according to your database setup.
```
4. Build the project using Maven:
```
mvn clean install
```

## Running the Application
1. Execute the following command to run the Spring Boot application:
```
mvn spring-boot:run
```
2. Once the application is running, you can access it at the following URL:
```
http://localhost:8080
```



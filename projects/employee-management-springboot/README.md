# Employee Management System (Spring Boot + MySQL)

This project is an Employee Management System built with Java Spring Boot, MySQL, and Apache Tomcat.

## Features
- Add, view, update, and delete employees
- RESTful API endpoints
- MySQL database integration
- Ready for deployment on Apache Tomcat

## Getting Started

### Prerequisites
- Java 17 or later
- Maven
- MySQL server
- (Optional) Apache Tomcat (for external deployment)

### Setup
1. Clone the repository or copy the project files.
2. Configure your MySQL credentials in `src/main/resources/application.properties`.
3. Run the application using Maven:
   ```bash
   mvn spring-boot:run
   ```
   Or build the WAR file for Tomcat deployment:
   ```bash
   mvn clean package
   ```
   Deploy the generated WAR file from `target/employee-management-springboot.war` to your Tomcat `webapps` directory.

### API Endpoints
- `GET /api/employees` - List all employees
- `GET /api/employees/{id}` - Get employee by ID
- `POST /api/employees` - Add new employee
- `PUT /api/employees/{id}` - Update employee
- `DELETE /api/employees/{id}` - Delete employee

## Project Structure
- `controller/` - REST controllers
- `service/` - Business logic
- `repository/` - Data access layer
- `model/` - JPA entities

## License
MIT

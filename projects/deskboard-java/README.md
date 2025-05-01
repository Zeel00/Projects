# DeskBoard Java Application

A desk booking application for employees working from home or office.

## Features
- User authentication
- Desk booking, viewing, and management
- Admin panel for desk/user management

## Tech Stack
- Java 17
- Spring Boot (Web, Data JPA, Security, Thymeleaf)
- H2 Database (for demo)

## Running the Application
1. Build with Maven:
   ```sh
   mvn clean install
   ```
2. Run:
   ```sh
   mvn spring-boot:run
   ```
3. Access the app at [http://localhost:8080](http://localhost:8080)

## Next Steps
- Implement models (User, Desk, Booking)
- Add REST endpoints
- Build the UI

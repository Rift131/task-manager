# Task Manager Learning Project

This 2 applications in one (frontend and backend) project represents an effort to regain some rusty skills that haven't been exercised since I attended my bootcamp, SkillDistillery, in 2022 as well as gain new skills. 

## Tech Stack

### Core Technologies
- **Java** - Programming language
- **Spring Boot** - Application framework
- **PostgreSQL** - Relational database
- **Docker** - Containerization

### Spring Boot Dependencies
- **Spring Web** - REST API endpoints
- **Spring Data JPA** - Database access and ORM
- **Spring Boot DevTools** - Development utilities
- **Lombok** - Reduce boilerplate code

### Testing
- **JUnit 5** - Unit testing framework
- **Mockito** - Mocking framework
- **Spring Boot Test** - Integration testing
- **H2 Database** - In-memory database for testing

### Build Tools
- **Maven** - Dependency management and build automation

## Project Structure

```
task-manager/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/yourname/taskmanager/
│   │   │       ├── TaskManagerApplication.java
│   │   │       ├── controller/
│   │   │       ├── service/
│   │   │       ├── repository/
│   │   │       └── model/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/yourname/taskmanager/
├── docker-compose.yml
├── Dockerfile
└── pom.xml
```

## Getting Started

### Prerequisites
- Java 25 or higher
- Docker and Docker Compose
- Maven (or use included Maven wrapper)

### Running Locally

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd task-manager
   ```

2. **Start PostgreSQL with Docker**
   ```bash
   docker-compose up -d
   ```

3. **Run the application**
   ```bash
   ./mvnw spring-boot:run
   ```

4. **Access the API**
   ```
   http://localhost:8080
   ```

### Running Tests

```bash
./mvnw test
```

## API Endpoints

Coming soon - built with TDD approach

## Features (Planned)

- [ ] Create tasks
- [ ] Read tasks (single and list)
- [ ] Update tasks
- [ ] Delete tasks
- [ ] Mark tasks as complete
- [ ] Filter and search tasks

## Development Approach

This project follows **Test-Driven Development (TDD)**:
1. Write failing test
2. Write minimal code to pass test
3. Refactor
4. Repeat

## License

This project is for educational and interview preparation purposes.

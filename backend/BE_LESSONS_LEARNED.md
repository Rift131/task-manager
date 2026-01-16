# Backend Lessons Learned

## Spring Boot Framework
### What does it mean to have a Spring Boot application?

A Spring Boot application is built on the Spring Framework and uses its Inversion of Control container to manage application components. Spring Boot provides auto-configuration based on classpath dependencies, an embedded web server, and production-ready features out of the box. Instead of manually instantiating and wiring objects, we use annotations like @Service and @RestController to declare components, and Spring Boot handles object creation, dependency injection, and lifecycle management through its Application Context. This allows developers to focus on business logic while Spring Boot handles infrastructure concerns.

### How do you set up a connection from the BE to the FE when both applications are in the same repo?
This is set up through a Class setup with the @Configuration annotation. See the WebConfig class file in "backend/src/main/java/com/kendev131/task_manager/config". The backend will run on one port, using the IntelliJ IDE while VSCode or Cursor runs the frontend on another port.
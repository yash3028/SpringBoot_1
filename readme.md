# Spring Boot Interview Questions

# What is SpringBoot

Spring Boot is built on top of the Spring framework to create stand-alone RESTful web applications with very minimal configuration and there is no need of external servers to run the application because it has embedded server like Tomcat.

# What are the Features of Spring Boot?

- Auto-configuration - Spring Boot automatically configures dependencies by using @EnableAutoconfiguration annotation and reduces boilerplate code
- Spring Boot Starter POM - These Starter POMs are pre-configured dependencies for functions like database, security, maven configuration etc.
- Spring Boot CLI (Command Line Interface) - This command line tool is generally for managing dependencies, creating projects and running the applications.
- Actuator - Spring Boot Actuator provides health check, metrics and monitors the endpoints of the application. It also simplifies the troubleshooting management.
- Embedded Servers - Spring Boot contains embedded servers like Tomcat and Jetty for quick application run. No need of external servers.

# How does a spring application get started?

A Spring application gets started by calling the main() method with @SpringBootApplication annotation in the SpringApplication class. This method takes a SpringApplicationBuilder object as a parameter, which is used to configure the application.

# What are the basic Spring Boot Annotations?

- @Configuration: This annotation is used to indicate that a class contains configuration methods for the application context. It is typically used in combination with @Bean annotations to define beans and their dependencies.
- @Component: This annotation is the most generic annotation for any Spring-managed component. It is used to mark a class as a Spring bean that will be managed by the Spring container.
- @RestController: This annotation is used to define a RESTful web service controller. It is a specialized version of the @Controller annotation that includes the @ResponseBody annotation by default.
- @RequestMapping: This annotation is used to map HTTP requests to a specific method in a controller. It can be applied at the class level to define a base URL for all methods in the class, or at the method level to specify a specific URL mapping.

# What is Spring Boot Actuator?

Spring Boot Actuator is a component of the Spring Boot framework that provides production-ready operational monitoring and management capabilities. We can manage and monitor your Spring Boot application while it is running.

# What is dependency Injection and its types?

Dependency Injection (DI) Instead of an object creating its own dependencies, they are provided ("injected") from an external source, typically through constructor injection, setter injection, or interface injection.

# What is inversion of conrtrol (IOC)?

- Inversion of Control (IoC) is a fundamental concept in Spring Boot where the control of object creation and lifecycle management is inverted from the programmer to the framework
- Spring implements IoC through Dependency Injection (DI), which allows the framework to inject the dependencies required by an object at runtime.

# What is Spring Bean?

An object that is managed by the Spring IoC container is referred to as a spring bean. A Spring bean can be any Java object.

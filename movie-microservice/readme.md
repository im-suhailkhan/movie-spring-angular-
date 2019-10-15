This project includes Spring Boot Tasks.
* Complete all the endpoints for CRUD operations on Muzix
* Use h2-console to view in-memory data
* Add an endpoint to search trackByName. Understand @Query and parameter passing to
@Query
* Generate API documentation using Swagger 2

* Create custom exceptions TrackNotFoundException, TrackAlreadyExistsException in a
com.stack....exceptions package. Perform appropriate exception handling and propagation
back.
* Running Logic on Startup in Spring. Create seed data to pre-fill the database with movie
information whenever the application starts. Use both approaches:
Approach 1: ApplicationListener<ContextRefreshedEvent>
Approach 2: CommandLineRunner (Find out how it differs from ApplicationRunner)

*Global exception using Controller advice
* Remove all hardcoded data from the application code to application.properties
a) by using @Value.
b) by using @PropertySource
c) by using Environment
d) by using @ConfigurationProperties
(https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/core/env/
Environment.html)
* Add @Lombok
(https://drive.google.com/file/d/1QQpEQZbDD9pmW2qrhYsx5N9XYQ5bJ5dM/view)
* Create another service implementation TrackDummyServiceImpl. Use @Primary and
@Qualifier annotations to specify which implementation to use.
11. Use @Profile to run the application with the existing service implementation, and the new
TrackDummyServiceImpl implementation.

* Swap in-memory H2 database with MySQL.
* Create two additional properties file application-dev.properties that contains configuration for
H2 and application-prod.properties that contains configurations for MySQL.
* Use spring developer tool and verify that changes are getting reflected without the need of restarting the server
* Use spring boot actuator to collect metrics for your service endpoints
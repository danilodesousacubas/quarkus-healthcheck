## requires You will need:

### JDK 1.8+ installed with JAVA_HOME configured appropriately;
### Apache Maven 3.5.3+

./mvnw compile quarkus:dev:

http://localhost:8080/first
http://localhost:8080/health/ready
http://localhost:8080/health/live

### Used quarkus extensions 
### mvn quarkus:add-extension -Dextensions="quarkus-resteasy-jackson"
### mvn quarkus:add-extension -Dextensions="quarkus-resteasy-jackson

./mvnw compile quarkus:dev:

http://localhost:8080/first
http://localhost:8080/health/ready
http://localhost:8080/health/live
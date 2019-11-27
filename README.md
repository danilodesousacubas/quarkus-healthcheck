# Quickly test health check with Quarkus

requires
JDK 1.8+ and Maven 3.5 or ++;

## To Run:
```command
$ ./mvnw compile quarkus:dev: 
```

see a simple example implementation of HealthCheck

```java
import org.eclipse.microprofile.health.Liveness;
// other imports...

@Liveness
@ApplicationScoped
public class DataHealthCheck implements HealthCheck {
    
    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.named("Health check with Json Data")
                .up()
                .withData("object1", "objectValue1")
                .withData("object2", "objectValue2")
                .withData("object3", "objectValue3")
                .build();
    }
}

```

[http://localhost:8080/health/live!](http://localhost:8080/health/live)

```javascript
{
    status: "UP",
    checks: [
        {
            name: "Basic Health Check",
            status: "UP"
        }, 
        {
            name: "Health check with Json Data",
            status: "UP",
            data: {
                object2: "objectValue2",
                object1: "objectValue1",
                object3: "objectValue3"
            }
        }
    ]
}
```

 #### use 

```xml
<dependencies>
    <dependency>
      <groupId>io.quarkus</groupId>
      <artifactId>quarkus-smallrye-health</artifactId>
    </dependency>
    <dependency>
      <groupId>io.quarkus</groupId>
      <artifactId>quarkus-resteasy-jackson</artifactId>
    </dependency>
    .
    .
    .

```
#### or use quarkus add extension

```command 
mvn quarkus:add-extension -Dextensions="quarkus-resteasy-jackson"
```
package org.quarkus.modules.health;

import javax.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

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
package org.quarkus.modules.resource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.quarkus.modules.service.FruitService;

@Path("/fruit")
public class FruitResource {
        
    @Inject
    private FruitService fruitService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findOne() {
        return Response.ok(fruitService.getFruit()).build();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/orange")
    public String getFirst(){
        return "orange";
    }
}
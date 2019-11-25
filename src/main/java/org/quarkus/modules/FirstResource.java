package org.quarkus.modules;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/first")
public class FirstResource {

    @Inject
    private FirstService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello() {
        return Response.ok(service.getFirstData()).build();
    }
}
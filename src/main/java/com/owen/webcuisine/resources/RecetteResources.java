package com.owen.webcuisine.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/recettes")
public class RecetteResources {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response fetchAll() {
        return Response.status(200).build();
    }
}

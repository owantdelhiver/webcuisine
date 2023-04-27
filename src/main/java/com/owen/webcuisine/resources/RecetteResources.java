package com.owen.webcuisine.resources;

import com.owen.webcuisine.model.Recette;
import com.owen.webcuisine.service.RecetteService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/recettes")
public class RecetteResources {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response fetchAll() {
        List<Recette> recettes = new RecetteService().fetchAll();
        return Response.status(200).entity(recettes).build();
    }
}

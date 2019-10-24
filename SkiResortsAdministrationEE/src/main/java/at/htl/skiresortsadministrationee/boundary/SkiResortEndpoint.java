package at.htl.skiresortsadministrationee.boundary;

import at.htl.skiresortsadministrationee.entity.SkiResort;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("skiresort")
public class SkiResortEndpoint {
    @PersistenceContext
    EntityManager em;

    @PostConstruct
    public void init() {
        System.err.println("SkiResortEndpoint created ***");
    }

    @GET
    @Path("get/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public SkiResort getSkiResort(@PathParam("id") long id) {
        return em.find(SkiResort.class, id);
    }
}

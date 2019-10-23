package at.htl.skiresortsadministrationee.boundary;

import at.htl.skiresortsadministrationee.entity.SkiResort;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
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
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public SkiResort getSkiResort(@PathParam("id") long id) {
        return em.find(SkiResort.class, id);
    }

}

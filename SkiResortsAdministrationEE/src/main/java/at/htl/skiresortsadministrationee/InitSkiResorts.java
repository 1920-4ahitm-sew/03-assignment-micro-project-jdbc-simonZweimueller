package at.htl.skiresortsadministrationee;

import at.htl.skiresortsadministrationee.entity.SkiResort;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Destroyed;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class InitSkiResorts {

    @PersistenceContext
    EntityManager em;

    public void init(@Observes @Initialized(ApplicationScoped.class) Object init) {
        System.out.println("*** It works! ***");

        em.persist(new SkiResort("Hoess", "Hinterstoder", 600, 2000));
        em.persist(new SkiResort("Wurzeralm", "Spital am Pyhrn", 800, 1870));
    }

    public void tearDown(@Observes @Destroyed(ApplicationScoped.class) Object init) {
        // when app is undeployed
    }
}

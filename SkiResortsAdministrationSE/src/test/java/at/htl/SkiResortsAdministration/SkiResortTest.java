package at.htl.SkiResortsAdministration;

import at.htl.skiresortsadministrationse.entity.SkiResort;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class SkiResortTest {

    static EntityManager em;

    @BeforeAll
    private static void init() {
        em = Persistence
                .createEntityManagerFactory("myPU")
                .createEntityManager();
    }

    @Test
    public void testSkiResortInsert() {
        TypedQuery<SkiResort> query = em.createNamedQuery("GetSkiResortById", SkiResort.class).setParameter(1, 1);
        SkiResort skiResort = query.getSingleResult();
        assertThat(skiResort.getSkiResortName(), is("Hoess"));
        assertThat(skiResort.getSkiResortTown(), is("Hinterstoder"));
        assertThat(skiResort.getLowestPoint(), is(600));
        assertThat(skiResort.getHighestPoint(), is(2000));
    }
}

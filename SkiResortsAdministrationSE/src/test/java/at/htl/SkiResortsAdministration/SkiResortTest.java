package at.htl.SkiResortsAdministration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class SkiResortTest {

    static EntityManager em;
    @BeforeAll
    private static void init() {
        em = Persistence
                .createEntityManagerFactory("myPU")
                .createEntityManager();
    }
}

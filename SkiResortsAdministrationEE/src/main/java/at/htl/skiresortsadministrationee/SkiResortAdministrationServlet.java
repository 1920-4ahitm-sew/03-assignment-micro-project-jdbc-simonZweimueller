package at.htl.skiresortsadministrationee;

import at.htl.skiresortsadministrationee.entity.SkiResort;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("servlet")
public class SkiResortAdministrationServlet extends HttpServlet {

    @PersistenceContext
    EntityManager em;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //String name = req.getParameter("name");
        //resp.getWriter().printf("Hello %s!", name);
        TypedQuery<SkiResort> query = em.createNamedQuery("GetAllSkiResorts", SkiResort.class);
        List<SkiResort> skiResorts = query.getResultList();
        resp.getWriter().printf("" + skiResorts);
    }
}

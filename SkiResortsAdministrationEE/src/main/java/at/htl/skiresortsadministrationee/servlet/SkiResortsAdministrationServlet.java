package at.htl.skiresortsadministrationee.servlet;

import at.htl.skiresortsadministrationee.InitSkiResorts;
import at.htl.skiresortsadministrationee.entity.SkiResort;

import javax.persistence.TypedQuery;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("skiresortsadministration")
public class SkiResortsAdministrationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String id = req.getParameter("id");
        int intId = Integer.parseInt(id);
        //InitSkiResorts initSkiResorts = new InitSkiResorts();
        //SkiResort skiResort = initSkiResorts.getSkiResortById(intId);
        //resp.getWriter().printf(skiResort.toString());
        resp.getWriter().printf("" + intId);
    }
}

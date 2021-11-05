package jspExample.context;

import jspExample.bean.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/context")
public class ContextServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServletContext selvletContext = getServletContext();
        selvletContext.setAttribute("name", "Context");
        selvletContext.setAttribute("age", 35);

        getServletContext().getRequestDispatcher("/jsp/basic.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
        context.setAttribute("country", req.getParameter("country"));
        req.setAttribute("name",req.getParameter("username"));
        req.setAttribute("age", req.getParameter("age"));
        req.setAttribute("gender", req.getParameter("gender"));
        req.setAttribute("courses", req.getParameterValues("courses"));
        req.setAttribute("door", 5);
        User user = new User("Bob", 35);
        req.setAttribute("bob", user);
        getServletContext().getRequestDispatcher("/jsp/basic.jsp").forward(req, resp);


    }
}

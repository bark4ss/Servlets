package jspExample.context;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        session.setAttribute("name", "Session");
        session.setAttribute("age", 34);
        String[] users = new String[] {"Tom", "Bob", "Sam"};
        request.setAttribute("users", users);

        getServletContext().getRequestDispatcher("/jsp/basic.jsp").forward(request, response);
    }
}

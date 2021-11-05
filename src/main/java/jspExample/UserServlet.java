package jspExample;

import jspExample.bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        User tom = new User("Tom", 25);
        request.setAttribute("user", tom);
        getServletContext()
                .getRequestDispatcher("/jsp/user.jsp")
                .forward(request, response);
    }
}

package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet("/getParameters")
public class UrlParameterServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        handleRequest(req, resp);
    }

    public void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        resp.setContentType("text/html");

        // Get Parameters From The Request
        String param1 = req.getParameter("param1");
        String param2 = req.getParameter("param2");
        Cookie cookie1 = new Cookie("param1", param1);
        HttpSession session = req.getSession();
        session.setAttribute("param2", param2);
        //session.setMaxInactiveInterval(5);
        resp.addCookie(cookie1);

        String[] paramArray = req.getParameterValues("paramArray");

        if(param1 == null || param2 == null) {
            String errorPage = "/web/error.html";
            ServletContext servletContext = getServletContext();
            RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(errorPage);
            requestDispatcher.forward(req, resp);
        } else if ("".equals(param1) || "".equals(param2)) {
            // The Request Parameters Were Present In The Query String But Has No Value. Do Something Or  Exception Handling !!
        } else {
            System.out.println("Parameter1?= " + param1 + ", Parameter2?= " + param2 + ", Array Parameters?= " + Arrays.toString(paramArray));

            // Print The Response
            PrintWriter out = resp.getWriter();
            out.write("<html><body><div id='servletResponse'>");
            out.write("<h2>Servlet HTTP Request Parameters Example</h2>");
            out.write("<p>param1: " + param1 + "</p>");
            out.write("<p>param2: " + param2 + "</p>");
            out.write("<p>paramArray: " + Arrays.toString(paramArray) + "</p>");
            out.write("</div></body></html>");
            out.close();
        }
    }
}

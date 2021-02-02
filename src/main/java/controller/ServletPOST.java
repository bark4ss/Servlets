package controller;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletPOST extends HttpServlet {

    private static final long serialVersionUID = -1641096228274971485L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        // set response headers
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        // create HTML form
        PrintWriter out = response.getWriter();
        out.append("<!DOCTYPE html>\r\n")
                .append("<html>\r\n")
                .append("        <head>\r\n")
                .append("            <title>Form input</title>\r\n")
                .append("        </head>\r\n")
                .append("        <body>\r\n")
                .append("            <form action=\"\" method=\"POST\">\r\n")
                .append("                Enter your name: \r\n")
                .append("                <input type=\"text\" name=\"user\" />\r\n")
                .append("                <input type=\"submit\" value=\"Submit\" />\r\n")
                .append("            </form>\r\n")
                .append("        </body>\r\n")
                .append("</html>\r\n");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String user = request.getParameter("user");
        Cookie[] cookies = request.getCookies();
        HttpSession session = request.getSession();
        var param2 = (String) session.getAttribute("param2");
        String cookieParam1 = "param1";
        Cookie cookie =  null;
        if(cookies !=null) {
            for (Cookie c : cookies) {
                if(cookieParam1.equals(c.getName())) {
                    cookie = c;
                }
            }
        }

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        // create HTML response
        PrintWriter out = response.getWriter();
        out.append("<!DOCTYPE html>\r\n")
                .append("<html>\r\n")
                .append("        <head>\r\n")
                .append("            <title>Welcome message</title>\r\n")
                .append("        </head>\r\n")
                .append("        <body>\r\n");
        if (user != null && !user.trim().isEmpty()) {
            out.append("    Welcome " + user + cookie.getValue() + ".\r\n");
            out.append(param2 +".\r\n");
        } else {
            out.append("    You did not entered a name!\r\n");
        }
        out.append("        </body>\r\n")
                .append("</html>\r\n");
    }
}

<%
    String[] people = new String[]{"Tom", "Bob", "Sam"};
    String header = "Users list";
%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="UTF-8" />
    <title>First JSP App</title>
</head>
<body>
<h3><%= header %></h3>
<ul>
    <%
        for(String person: people){
            out.println("<li>" + person + "</li>");
        }
    %>
</ul>
</body>
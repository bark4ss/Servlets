<%-- The first application on JSP --%>
<%
    String header = "Сегодня";
%>
<%-- the directive --%>
<%@ page import="java.util.Date, jspExample.util.*" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>First JSP App</title>
</head>
<body>
<jsp:include page="header.html" />
<h2><%= header %>: <%= new Date() %></h2>
<h2>Square of 3 = <%= new Calculator().square(3) %></h2>
<jsp:include page="footer.jsp" />
</body>
</html>
<%@ page pageEncoding="UTF-8" import="java.util.*" %>
<%@ page errorPage="error.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Today: <%= new Date()%></h2>
<%
    int i = 10 / 0;
%>
</body>
</html>

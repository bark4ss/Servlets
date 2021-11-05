<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" import="java.io.*" %>
<html>
<head>
    <title>Error page</title>
</head>
<body>
<h2>Some error in page</h2>
Message:
<%= exception.getMessage()%>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Info</title>
</head>
<body>
<p>Name: <%= request.getParameter("name") %>
</p>
<p>Age: <%= request.getParameter("age") %>
</p>
<p>Country: ${country}</p>
</body>
</html>

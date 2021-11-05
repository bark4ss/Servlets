<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- First example --%>
<html>
<head>
    <title>Jsp Include page</title>
</head>
<body>
<jsp:include page="fragments/header.jsp"/>
<h2>Hello for Beginners</h2>
<%@include file="fragments/footer.html"%>
</body>
</html>

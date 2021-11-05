<%@ page import="shop.model.Product" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<Product> products = (List<Product>) request.getAttribute("products");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    for (Product product :products) {
        out.print("<td>" + product.getName() + " " + product.getPrice() + "</td>" + "</br>");
    }
%>

</body>
</html>

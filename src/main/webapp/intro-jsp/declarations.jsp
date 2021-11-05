<%!
    int square(int n){
        return n * n;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Declaration page</title>
</head>
<body>
<p><%= square(6)%></p>
<ul>
    <%
        for (int i = 0; i <= 10; i++) {
            out.println("<li>" + square(i) + "</li>");
        }
    %>
</ul>
</body>
</html>

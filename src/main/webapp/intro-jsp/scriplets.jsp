<%
    String[] people = new String[]{"Tom", "Bob", "Sam"};
    String header = "User list";
%>

<!DOCTYPE html>
<html>
<head>
    <title>Scriplet page</title>
</head>
<body>
<h3><%= header %>
</h3>
<%
    for (int i = 1; i < 5; i++) {
        out.println("<br>Hello " + i);
    }
%>
<ul>
    <%
        for (String person : people) {
            out.println("<li>" + person + "</li>");
        }
    %>
</ul>

</body>
</html>

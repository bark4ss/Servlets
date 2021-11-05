<%
    pageContext.setAttribute("gender", "Male");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Application</title>
</head>
<body>
<p>Name: ${name}</p>
<p>Age: ${age}</p>
<p>Gender: ${requestScope.gender}</p>
<p>User Name: ${bob.name}</p>
<p>User Age: ${bob.age}</p>
<p>Country: ${country}</p>
<p>Courses 1: ${courses[0]}</p>
<p>Courses 2: ${courses[1]}</p>
</body>
</html>

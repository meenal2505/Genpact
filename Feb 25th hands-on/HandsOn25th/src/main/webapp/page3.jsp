
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>This is page 3</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body bgcolor="#fff8dc">

<%
    String name = request.getParameter("name"); %>
<div class="center-block">
    <h1 class="center-block">Welcome <%=name%> <br> this is the last page 😊</h1>
</div>
</body>
</html>

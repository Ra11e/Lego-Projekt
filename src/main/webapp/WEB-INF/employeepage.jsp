<%-- 
    Document   : employeepage.jsp
    Created on : Aug 24, 2017, 6:31:57 AM
    Author     : kasper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee home page</title>
    </head>
    <body>
        <!--Kan ændres ved at gemme oplysninger i session-->
        <% User user = (User) session.getAttribute("user"); %>
        <%@include file="navbar.jsp" %>
        <h1>Hello to the employee site <%=user.getEmail()%> </h1>

        <h1>Hello <%=request.getParameter("email")%> </h1>
        <p><%=request.getSession().getAttribute("role")%></p>
        You are now logged in as a EMPLOYEE of our wonderful site.
    </body>
</html>

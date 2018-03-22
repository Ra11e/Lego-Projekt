<%-- 
    Document   : customerpage
    Created on : Aug 22, 2017, 2:33:37 PM
    Author     : kasper
--%>

<%@page import="FunctionLayer.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>
        <title>Customer home page</title>
    </head>
    <body>
        <% User user = (User) session.getAttribute("user"); %>
        <%@include file="navbar.jsp" %>
        <h1>Hello <%=user.getEmail()%> </h1>
        <p><%=request.getSession().getAttribute("role")%></p>
/       <h2>click <a href="FrontController?command=orders">here</a> to see your orders</h2>
    </body>
</html>

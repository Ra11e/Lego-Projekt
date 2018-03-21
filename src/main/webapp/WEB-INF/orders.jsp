<%-- 
    Document   : orders
    Created on : 21-03-2018, 18:28:45
    Author     : rlumh
--%>

<%@page import="FunctionLayer.Order"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>order status</title>
    </head>
    <body>
        <%@include file="navbar.jsp" %>
        <h1>Here you can see your orders</h1>
        <%
            ArrayList<Order> orders = (ArrayList<Order>)request.getSession().getAttribute("orders");
            for (Order order : orders) {
                out.print("<p>"+ order.getHeight() +"</P>");
            }
        %>
    </body>
</html>

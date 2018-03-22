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
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>
        <title>order status</title>
    </head>
    <body>
        <%@include file="navbar.jsp" %>
        <h1>Here you can see your orders</h1>
        
        
        
        
         <div class="container">
            <div class="row">
              <div class="col-sm-6">
                <%
                    ArrayList<Order> orders = (ArrayList<Order>)request.getSession().getAttribute("orders");
                    for (Order order : orders) {
                        out.print("<p><b>Order number: </b>"+order.getOrderId()+" <b>Length: </b> " + order.getLength() + " <b>Heigth: </b> "+ order.getHeight()+" <b>status: </b> " + order.getStatus() +"</P>");
                    }
                %>
              </div>
              <div class="col-sm-6">
                <!--Der skal være en hvor man kan vælge ordrer her-->
              </div>
            </div>
          </div> 
    </body>
</html>

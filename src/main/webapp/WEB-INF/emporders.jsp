<%-- 
    Document   : emporders
    Created on : 22-03-2018, 14:17:31
    Author     : rlumh
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="FunctionLayer.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All orders</title>
    </head>
    <body>
        <%@include file="navbar.jsp" %>
        <div class="container">
            <div class="row">
                <div class="col-sm-6">

                    <%
                        ArrayList<Order> allOrders = (ArrayList<Order>) request.getSession().getAttribute("allOrders");
                        for (Order order : allOrders) {
                            out.print("<p><b>Order number: </b>" + order.getOrderId() + " <b>Length: </b> " + order.getLength() + " <b>Heigth: </b> " + order.getHeight() + " <b>status: </b> " + order.getStatus() + "</P>");
                        }
                    %>


                </div>
                <div class="col-sm-6">
                    <form name="orderConfirmation" action="FrontController" method="POST">
                        <select name="idToSent">
                            <%
                                for (Order order : allOrders) {
                                    out.print("<option value=" + order.getOrderId() + ">" + order.getOrderId() + "</option>");
                                }
                            %>    
                            
                        </select>
                        <input type="hidden" name="command" value="orderSent">
                        <button type="submit" class="btn btn-default">Set Order as SENT</button>
                        
                    </form>
                            <br>
                            <a class="btn btn-default" href="FrontController?command=emporders">Refresh</a>
                            
                </div>
            </div>
        </div> 
    </body>
</html>

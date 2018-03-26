<%-- 
    Document   : pieceList
    Created on : 24-03-2018, 20:04:45
    Author     : rlumh
--%>

<%@page import="FunctionLayer.LegoHouse"%>
<%@page import="FunctionLayer.Wall"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>
        <title>Piece List</title>
    </head>
    <body>
         <%@include file="navbar.jsp" %>
        <h1>Hello World!</h1>
        
        <h1>Orders</h1>
        <%
            LegoHouse house = (LegoHouse)request.getSession().getAttribute("legoHouse");
        %>
        <table class="table table-hover">
                <thead>
                    <tr>
                        <th></th>
                        <th>Large</th>
                        <th>Medium</th>
                        <th>Small</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <th>Front</th>
                        <td><%=house.getFront().getLarge()%></td>
                        <td><%=house.getFront().getMedium()%></td>
                        <td><%=house.getFront().getSmall()%></td>
                    </tr>
                    <tr>
                        <th>Back</th>
                        <td><%=house.getBack().getLarge()%></td>
                        <td><%=house.getBack().getMedium()%></td>
                        <td><%=house.getBack().getSmall()%></td>
                    </tr>
                    <tr>
                        <th>Left</th>
                        <td><%=house.getLeft().getLarge()%></td>
                        <td><%=house.getLeft().getMedium()%></td>
                        <td><%=house.getLeft().getSmall()%></td>
                    </tr>
                    <tr>
                        <th>Right</th>
                        <td><%=house.getRight().getLarge()%></td>
                        <td><%=house.getRight().getMedium()%></td>
                        <td><%=house.getRight().getSmall()%></td>
                    </tr>
                    <tr>
                        <th>Total</th>
                        <td><%=house.getLarge()%></td>
                        <td><%=house.getMedium()%></td>
                        <td><%=house.getSmall()%></td>
                    </tr>
                </tbody>
            </table>        
                    
    </body>
</html>

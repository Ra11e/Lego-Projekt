<%-- 
    Document   : order
    Created on : 21-03-2018, 18:05:25
    Author     : rlumh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>
        <title>Order</title>
    </head>
    <body>
        <%@include file="navbar.jsp" %>
        <h1>Order your Lego house here</h1>
        
         <form name="orderConfirmation" action="FrontController" method="POST">
            <div class="form-group">
              <label for="length">length</label>
              <input type="number" class="form-control" id="length" name="length">
            </div>
            <div class="form-group">
              <label for="heigth">heigth</label>
              <input type="number" class="form-control" id="heigth" name="heigth">
            </div>
            <div class="form-group">
              <label for="width">width</label>
              <input type="number" class="form-control" id="width" name="width">
            </div>
             <input type="hidden" name="command" value="orderConfirmation">

            <button type="submit" class="btn btn-default">Place Order</button>
      </form> 
    </body>
</html>

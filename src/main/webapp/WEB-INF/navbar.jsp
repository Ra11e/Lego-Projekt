<%-- 
    Document   : navbar
    Created on : 21-03-2018, 13:56:18
    Author     : rlumh
--%>
 <%@page import="FunctionLayer.User"%>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="navbar navbar-default">
<div class="container-fluid">
  <div class="navbar-header">
    <a class="navbar-brand" href="index.jsp">Lego</a>
  </div>
  <ul class="nav navbar-nav">
    <li class="active"><a href="index.jsp">Home</a></li>
    <li><a href="FrontController?command=help">Help</a></li>
    
    <% if (session.getAttribute("user") != null) {
            out.println("<li><a href='FrontController?command=" + session.getAttribute("role") + "'>" + session.getAttribute("role") + "</a></li>");
            out.println("<li><a href='./LogOut'>Log Out</a></li>");
             
}%>
    
    
  </ul>
</div>
</nav>

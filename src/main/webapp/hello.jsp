<%--
  Created by IntelliJ IDEA.
  User: abellah
  Date: 26/05/2021
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<html>
<style>
    h1{
        color: red;
    }
</style>
<body>
<h1> Hello : <%= request.getParameter("name")%>  You are the best</h1>
</body>
</html>

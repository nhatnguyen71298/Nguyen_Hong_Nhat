<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 9/28/2020
  Time: 11:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View customer</title>
</head>
<body>
<h1>Product details</h1>
<br>
<table>
    <tr>
        <td>Name: </td>
        <td>${requestScope["product"].getName()}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${requestScope["product"].getPrice()}</td>
    </tr>
    <tr>
        <td>Manufacture: </td>
        <td>${requestScope["product"].getManufacture()}</td>
    </tr>
    <tr>
        <td>Comment: </td>
        <td>${requestScope["product"].getComment()}</td>
    </tr>
    <tr>
        <td><a href="/products">Back to product list</a></td>
    </tr>
</table>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 9/24/2020
  Time: 8:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product</title>
  </head>
  <body>
  <h1>Input product</h1>
  <form action="/infor" method="get">
      <input type="text" name="description" placeholder="Name">
      <input type="text" name="price"  placeholder="Price">
      <input type="text" name="percent" placeholder="Discount Percent">
      <input type="submit" value="Save value">
  </form>
  </body>
</html>

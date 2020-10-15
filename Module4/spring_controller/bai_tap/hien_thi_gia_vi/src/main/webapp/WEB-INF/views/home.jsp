<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 10/14/2020
  Time: 2:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <form action="/sandwich">
        <h1>Check: </h1>
        <input type="checkbox" value="Lettuce" name="sandwich">Lettuce
        <input type="checkbox" value="Tomato" name="sandwich">Tomato
        <input type="checkbox" value="Mustard" name="sandwich">Mustard
        <input type="checkbox" value="Sprouts" name="sandwich">Sprouts
        <br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>

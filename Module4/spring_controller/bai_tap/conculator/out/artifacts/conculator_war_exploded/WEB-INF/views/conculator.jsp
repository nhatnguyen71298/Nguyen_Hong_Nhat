<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 10/14/2020
  Time: 3:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Conculator</title>
</head>
<body>
    <h1>Conculator:</h1>
    <c:if test="${not empty result}">
        Result: ${result}
    </c:if>
    <form action="/conculator">
    <input type="text" placeholder="input num1" name="num1">
    <input type="text" placeholder="input num2" name="num2">
    <br>
    <br>
    <input type="submit" value="Additon(+)" name="conculator">
    <input type="submit" value="Subtraction(-)" name="conculator">
    <input type="submit" value="Multiplication(X)" name="conculator">
    <input type="submit" value="Division(/)" name="conculator">
    </form>
</body>

</html>

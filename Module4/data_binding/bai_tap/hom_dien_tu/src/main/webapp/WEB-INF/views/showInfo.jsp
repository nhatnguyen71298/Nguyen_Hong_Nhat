<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 10/15/2020
  Time: 2:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Infor</title>
</head>
<body>
    <h1>Infor: </h1>
    <span style="font-weight: bold">Languages: </span>
    <span>${newLetter.language}</span>
    <br>
    <br>
    <span style="font-weight: bold">Page size: </span>
    <span>${newLetter.pageSize}</span>
    <br>
    <br>
    <span style="font-weight: bold">Spams filter: </span>
    <span>${newLetter.spamFilter}</span>
    <br>
    <br>
    <span style="font-weight: bold">Singature: </span>
    <span>${newLetter.singature}</span>
    <br>
    <br>
    <a href="/"><button type="button">Cancel!</button></a>
</form>
</body>
</html>

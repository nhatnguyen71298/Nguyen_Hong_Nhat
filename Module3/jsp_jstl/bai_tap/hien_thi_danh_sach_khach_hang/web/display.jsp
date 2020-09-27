<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 9/25/2020
  Time: 3:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display</title>
    <link rel="stylesheet" href="CSSDisplay.css">
</head>
<body>
<h1> Danh sách nhân viên</h1>
<table>
    <tr>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>
    <c:forEach var="employee" items="${listEmployee}">
        <tr>
            <td>${employee.name}</td>
            <td>${employee.birthday}</td>
            <td>${employee.address}</td>
            <td><img src="${employee.img}" style="height: 15em;position: relative;margin-left: 15%"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

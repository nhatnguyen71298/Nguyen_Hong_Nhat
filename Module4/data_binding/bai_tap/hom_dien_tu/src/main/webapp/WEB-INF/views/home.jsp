<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 10/15/2020
  Time: 1:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="select" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Form</title>
    <style>
        td,th{
            text-align: left;
            width: 130px;
            height: 50px;
        }
    </style>
</head>
<body>
    <form:form modelAttribute="letter" method="post" action="/showInfo">
        <table>
            <h1>Settings</h1>
            <tr>
                <th>
                    <p style="font-weight: bold">Languages</p>
                </th>
                <td>
                    <form:select path="language">
                        <form:option value="eng">English</form:option>
                        <form:option value="viet">Vietnamese</form:option>
                        <form:option value="japan">Japanese</form:option>
                        <form:option value="china">Chinese</form:option>
                    </form:select>
                </td>
            </tr>
            <tr>
                <th>
                    <p style="font-weight: bold">Page size</p>
                </th>
                <td>
                    show <form:select path="pageSize">
                    <form:option value="1">1</form:option>
                    <form:option value="5">5</form:option>
                    <form:option value="10">10</form:option>
                    <form:option value="25">25</form:option>
                    <form:option value="50">50</form:option>
                    <form:option value="100">100</form:option>
                </form:select> email per page
                </td>
            </tr>
            <tr>
                <th>
                    <p style="font-weight: bold">Spams filter</p>
                </th>
                <td>
                    <form:checkbox path="spamFilter" value="Checked"/> Enable spams filter
                </td>
            </tr>
            <tr>
                <th>
                    <span style="font-weight: bold">Spams filter</span>
                </th>
                <td>
                    <form:textarea placeholder="Thor king Asgard" path="singature"></form:textarea>

                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="Update!">
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>

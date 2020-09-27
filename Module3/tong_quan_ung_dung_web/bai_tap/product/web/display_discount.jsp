<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 9/24/2020
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>display</title>
</head>
<body>

        <div style="border: 1px solid black; text-align: center; height: 40%;width: 25%">
            <h2>Product Description: <%=request.getParameter("description")%></h2>
            <h2>Discount Amount: <%=request.getAttribute("discountAmout")%></h2>
            <h2>Discount Price: <%=request.getAttribute("discountPrice")%></h2>
        </div>
</body>
</html>

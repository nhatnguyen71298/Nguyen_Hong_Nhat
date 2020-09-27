<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 9/25/2020
  Time: 4:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <h1>Simple Calculator</h1>
  <form action="/calculate" method="get">
  <fieldset>
    <legend>Caculator</legend>
      <table>
        <tr>
          <td><p>First operand: </p ></td>
          <td><input name="num1" type="text"></td>
        </tr>
        <tr>
          <td><p>Operand: </p ></td>
          <td>
            <select style="color: white;background-color: blue" name="operator">
              <option value="+">Addition</option>
              <option value="-">Subtraction</option>
              <option value="*">Multiplication </option>
              <option value="/">Division</option>
            </select>
          </td>
        </tr>
        <tr>
          <td><p>Second operand:</p></td>
          <td><input name="num2" type="text"></td>
        </tr>
      </table>
      <input type="submit" value="Caculate!">
  </fieldset>
  </form>
  </body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 10/1/2020
  Time: 9:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Resort Furama </title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>

<nav class="navbar navbar-light bg-light pt-3" >
    <a class="navbar-brand" href="#">
        <img style="margin-left: 50px" src="https://vinadomain.vn/wp-content/uploads/2020/06/logo-maker-e1591540943421.png" width="50" height="50" class="d-inline-block align-top" alt="" loading="lazy">
        <span style="margin-left: 200%">Nguyễn Hồng Nhật</span>
    </a>
</nav>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="collapse navbar-collapse " id="navbarNavAltMarkup" >
        <div class="navbar-nav" style="margin-left: 50px">
            <a class="nav-link active" href="#">Home </a>
            <a class="nav-link active" href="#">Employee</a>
            <a class="nav-link active" href="">Customer</a>
            <a class="nav-link active" href="#">Service</a>
            <a class="nav-link active" href="#">Contract</a>
            <a class="nav-link active" href="#" style="margin-left: 450px">
                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-secondary my-2 my-sm-0" type="submit">Search</button>
                </form>
            </a>
        </div>
    </div>
</nav>

<div class="container-fluid pt-5" style="background-image: url(https://1.bp.blogspot.com/-sP3dIHuoTYw/TcQWWUfQJ2I/AAAAAAAAAnI/akgXrJLmTHo/s1600/Hoi+An+096.jpg)">
    <div class="row">
        <div class="col-3 px-0  vh-100 ">
            <div class="list-group">
                <a href="/customer?action=displayAllCustomer" class="list-group-item list-group-item-action list-group-item-primary">All Customer </a>
                <a href="/employee?action=displayAllEmployee" class="list-group-item list-group-item-action ">All Employee</a>
                <a href="#" class="list-group-item list-group-item-action ">Primary item</a>
                <a href="#" class="list-group-item list-group-item-action ">Primary item</a>
                <a href="#" class="list-group-item list-group-item-action ">Primary item</a>
                <a href="#" class="list-group-item list-group-item-action ">Primary item</a>
                <a href="#" class="list-group-item list-group-item-action ">Primary item</a>
            </div>
        </div>
        <div class="col-9">
            <form method="post" action="/employee?action=edit">
                <input class="form-control" type="hidden" value="${employeeEdit.id}" name="id">
                <select class="custom-select"name="postion_id">
                    <option >Select divison</option>
                    <option value="1">Sale – Marketing</option>
                    <option value="2">Administrative</option>
                    <option value="3">Servants</option>
                    <option value="4">Manager</option>
                </select>
                <select class="custom-select"name="education_id">
                    <option >Select education of employee</option>
                    <option value="1">Intermediate</option>
                    <option value="2">College</option>
                    <option value="3">University</option>
                    <option value="4">After university</option>
                </select>
                <select class="custom-select"name="division_id">
                    <option >Select postion</option>
                    <option value="1">Receptionist</option>
                    <option value="2">Servants</option>
                    <option value="3">Expert</option>
                    <option value="4">Supervisor</option>
                    <option value="5">Manage</option>
                    <option value="6">President</option>
                </select>
                <input class="form-control" type="text" placeholder="${employeeEdit.name}" name="name">
                <input class="form-control" type="text" placeholder="${employeeEdit.birthday}" name="birthday">
                <input class="form-control" type="text" placeholder="${employeeEdit.cmnd}" name="cmnd">
                <input class="form-control" type="text" placeholder="${employeeEdit.salary}" name="salary">
                <input class="form-control" type="text" placeholder="${employeeEdit.phoneNumber}" name="phoneNumber">
                <input class="form-control" type="text" placeholder="${employeeEdit.email}" name="email">
                <input class="form-control" type="text" placeholder="${employeeEdit.address}" name="address">
                <input class="btn btn-primary" type="submit" value="Create!">
                <h4><c:out value="${messenger}"></c:out></h4>
            </form>
        </div>
    </div>
</div>
</div>



<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</body>
</html>

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
    <span style="margin-left: 200%"><h3 style="display: inline;margin-top: 10px">Nguyễn Hồng Nhật</h3></span>
  </a>
</nav>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="collapse navbar-collapse " id="navbarNavAltMarkup" >
    <div class="navbar-nav" style="margin-left: 50px">
      <a class="nav-link active" href="#">Home </a>
      <a class="nav-link active" href="/employee?action=create">Employee</a>
      <a class="nav-link active" href="/customer?action=create_customer">Customer</a>
      <a class="nav-link active" href="/service?action=create">Service</a>
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
      <div class="w-75 mx-auto">
        <div class="bg-light rounded p-5">
          <form>
            <div class="form-group">
              <label for="exampleInputEmail1">Email address</label>
              <input type="email" class="form-control" id="exampleInputEmail1"
                     aria-describedby="emailHelp">
              <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone
                else.</small>
            </div>
            <div class="form-group ">
              <label for="exampleInputPassword1">Password</label>
              <input type="password" class="form-control" id="exampleInputPassword1">
            </div>
            <div class="form-group form-check">
              <input type="checkbox" class="form-check-input" id="exampleCheck1">
              <label class="form-check-label" for="exampleCheck1">Check me out</label>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
          </form>
        </div>
      </div>
    </div>
  </div>
</div>
</div>



<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</body>
</html>

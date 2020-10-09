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
    <link rel="stylesheet" href="bootstrap413/css/bootstrap.min.css" />
    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap4.min.css" />
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
            <a class="nav-link active" href="/home">Home </a>
            <a class="nav-link active" href="/employee?action=create">Employee</a>
            <a class="nav-link active" href="/customer?action=create_customer">Customer</a>
            <a class="nav-link active" href="/service?action=create">Service</a>
            <a class="nav-link active" href="/contract?action=create">Contract</a>
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
        <div class="col-2 px-0  vh-100 ">
            <div class="list-group">
                <a href="/customer?action=displayAllCustomer" class="list-group-item list-group-item-action">All Customer </a>
                <a href="/employee?action=displayAllEmployee" class="list-group-item list-group-item-action ">All Employee</a>
                <a href="/customer?action=displayCustomerOnline" class="list-group-item list-group-item-action ">All customer on service</a>
                <a href="/contract?action=createContractDetail" class="list-group-item list-group-item-action ">Create contract detail</a>
            </div>
        </div>
        <div class="col-10">
            <table id="tableCustomer" class="table table-light table table-striped table-bordered">
                <thead>
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Type Customer</th>
                    <th scope="col">Name</th>
                    <th scope="col">Birthday</th>
                    <th scope="col">Gender</th>
                    <th scope="col">Card ID</th>
                    <th scope="col">Phone Number</th>
                    <th scope="col">Email</th>
                    <th scope="col">Address</th>
                    <th scope="col">Edit</th>
                    <th scope="col">Delete</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="customer" items="${allCustomer}">
                <tr>
                    <th scope="col">${customer.id}</th>
                    <th scope="col">${customer.type_id}</th>
                    <th scope="col">${customer.name}</th>
                    <th scope="col">${customer.birthday}</th>
                    <th scope="col">${customer.gender}</th>
                    <th scope="col">${customer.cmnd}</th>
                    <th scope="col">${customer.phoneNumber}</th>
                    <th scope="col">${customer.email}</th>
                    <th scope="col">${customer.address}</th>
                    <th scope="col">
                        <a href="/customer?action=edit&idEdit=${customer.id}">
                            <button type="button" class="btn btn-primary-" style="color: blue;text-decoration: blue">
                                Edit
                            </button>
                        </a>
                    </th>
                    <th scope="col">
                        <button type="button" class="btn btn-primary-" data-toggle="modal" data-target="#exampleModal" style="color: blue;text-decoration: blue">
                            Delete
                        </button>
                        <!-- Modal -->
                        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="exampleModalLabel">Delete Customer</h5>
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                            <span aria-hidden="true">&times;</span>
                                        </button>
                                    </div>
                                    <div class="modal-body">
                                        Are you sure to delele Customer?
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">No</button>
                                        <a href="/customer?action=delete&idDelete=${customer.id}"> <button type="button" class="btn btn-primary">Yes</button></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </th>
                </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</div>


<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
<script>
    $(document).ready(function() {
        $('#tableCustomer').dataTable( {
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 3
        } );
    } );
</script>
</body>
</html>

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
    <title>Final exam</title>
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
            <a class="nav-link active" href="">Home </a>
            <a class="nav-link active" href="/matBang?action=create">Tạo mặt bằng mới</a>
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
                <a href="/matBang?action=display" class="list-group-item list-group-item-action ">Hiển thị tất cả mặt bằng</a>
            </div>
        </div>
        <div class="col-10">
            <form method="post" action="/matBang?action=create">
                <p style="color: red;font-weight: bold">Mã mặt bằng : </p>
                <input class="form-control" type="text" placeholder=" Nhập Mã mặt bằng " name="maMatBang">
                <p style="color: red;font-weight: bold">Diện tích :</p>
                <input class="form-control" type="text" placeholder="Nhập diện tích" name="dienTich">
                <p style="color: red;font-weight: bold">Trạng thái :</p>
                <select class="custom-select"name="trangThai">
                    <option >Chọn trạng thái</option>
                    <option value="1">Trống</option>
                    <option value="2">Hạ tầng</option>
                    <option value="3">Đầy đủ</option>
                </select>
                <p style="color: red;font-weight: bold">Số tầng :</p>
                <select class="custom-select"name="soTang">
                    <option >Chọn Tầng</option>
                    <option value="1">Tầng 1</option>
                    <option value="2">Tầng 2</option>
                    <option value="3">Tầng 3</option>
                    <option value="4">Tầng 4</option>
                    <option value="5">Tầng 5</option>
                    <option value="6">Tầng 6</option>
                    <option value="7">Tầng 7</option>
                    <option value="8">Tầng 8</option>
                    <option value="9">Tầng 9</option>
                    <option value="10">Tầng 10</option>
                    <option value="11">Tầng 11</option>
                    <option value="12">Tầng 12</option>
                    <option value="13">Tầng 13</option>
                    <option value="14">Tầng 14</option>
                    <option value="15">Tầng 15</option>
                </select>
                <p style="color: red;font-weight: bold">Loai văn phòng :</p>
                <select class="custom-select"name="loaiVanPhong">
                    <option >Chọn Loại văn phòng</option>
                    <option value="1">Văn phòng</option>
                    <option value="2">Văn phòng chia sẻ</option>
                    <option value="3">Văn phòng trọn gói</option>
                </select>
                <p style="color: red;font-weight: bold">Giá :</p>
                <input class="form-control" type="text" placeholder="Nhập giá" name="gia">
                <p style="color: red;font-weight: bold">Ngày bắt đầu :</p>
                <input class="form-control" type="date" name="ngayBatDau">
                <p style="color: red;font-weight: bold">Ngày kết thúc :</p>
                <input class="form-control" type="date" name="ngayKetThuc">

                <p> </p>
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

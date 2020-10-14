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
            <div class="row" style="height: 80px;margin-left: 15px">
                <form class="form-inline my-2 my-lg-0" method="post" action="/matBang?action=timLoaiMatBang">
                    <select class="custom-select"name="loaiVanPhongTim">
                        <option >Chọn Loại văn phòng</option>
                        <option value="1">Văn phòng</option>
                        <option value="2">Văn phòng chia sẻ</option>
                        <option value="3">Văn phòng trọn gói</option>
                    </select>
                    <button class="btn btn-light my-2 my-sm-0" type="submit">Tìm bằng loại mặt bằng</button>
                </form>
                <form class="form-inline my-2 my-lg-0" method="post" action="/matBang?action=timBangSoTang">
                    <select class="custom-select"name="soTangTim">
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
                    <button class="btn btn-light my-2 my-sm-0" type="submit">Tìm bằng loại mặt bằng</button>
                </form>
                </div>
            <div class="row" style="height: 80px;margin-left: 15px">
                <form class="form-inline my-2 my-lg-0" method="post" action="/matBang?action=timGiaTien" style="margin-left: 70px">
                    <input class="form-control mr-sm-2" type="search" placeholder="Nhập giá" name="giaTim">
                    <button class="btn btn-light my-2 my-sm-0" type="submit">Tìm bằng giá</button>
                </form>
            </div>
            <table id="tableMatBang" class="table table-light table table-striped table-bordered" >
                <thead>
                <tr>
                    <th scope="col">Mã</th>
                    <th scope="col">Diện tích</th>
                    <th scope="col">Trạng thái</th>
                    <th scope="col">Số tầng</th>
                    <th scope="col">Loai văn phòng</th>
                    <th scope="col">Giá</th>
                    <th scope="col">Ngày bắt đầu</th>
                    <th scope="col">Ngày tết thúc</th>
                    <th scope="col">Delete</th>
                </tr>
                </thead>
                <tbody>
<%--                String maMatBang ,dienTich,trangThai,soTang ,loaiVanPhong ,gia , ngayBatDau , ngayKetThuc ;--%>
                <c:forEach var="matBang" items="${matBangList}">
                    <tr>
                        <th scope="col">${matBang.maMatBang}</th>
                        <th scope="col">${matBang.dienTich}</th>
                        <th scope="col">${matBang.trangThai}</th>
                        <th scope="col">${matBang.soTang}</th>
                        <th scope="col">${matBang.loaiVanPhong}</th>
                        <th scope="col">${matBang.gia}</th>
                        <th scope="col">${matBang.ngayBatDau}</th>
                        <th scope="col">${matBang.ngayKetThuc}</th>
                        <th scope="col">
                            <button type="button" class="btn btn-primary-" data-toggle="modal" data-target="#exampleModal" style="color: blue;text-decoration: blue">
                                Delete
                            </button>
                            <!-- Modal -->
                            <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h5 class="modal-title" id="exampleModalLabel">Delete Product</h5>
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                        </div>
                                        <div class="modal-body">
                                            Bạn có chắc muốn xóa mặt bằng có mã ${matBang.maMatBang}?
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Không</button>
                                            <a href="/matBang?action=delete&maXoa=${matBang.maMatBang}"> <button type="button" class="btn btn-primary">Đồng ý</button></a>
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
        $('#tableMatBang').dataTable( {
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 3
        } );
    } );
</script>
</body>
</html>

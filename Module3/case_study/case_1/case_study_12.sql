-- drop database case_study_1;
create database case_study_1;
use case_study_1;
-- ---------------------------------------------------------------------------------------------- 
create table nhan_vien(
	id_nhan_vien int primary key,
    ho_va_ten varchar(45),
    id_vi_tri int,
    id_trinh_do int,
    id_bo_phan int,
    birthday date,
    so_cmnd varchar(45),
    luong varchar(45),
    sdt varchar(45),
    emai varchar(45),
    dia_chi varchar(45)    
);
create table vi_tri(
	id_vi_tri int primary key,
	ten_vi_tri varchar(45)
);
create table trinh_do(
	id_trinh_do int primary key,
	ten_trinh_do varchar(45)
);
create table bo_phan(
	id_bo_phan int primary key,
	ten_bo_phan varchar(45)
);
alter table nhan_vien
add foreign key(id_vi_tri) references vi_tri(id_vi_tri);
alter table nhan_vien
add foreign key(id_trinh_do) references trinh_do(id_trinh_do);
alter table nhan_vien
add foreign key(id_bo_phan) references bo_phan(id_bo_phan);
-- ------------------------------------------------------------------------------------------------ 
 create table khach_hang(
	id_khach_hang int primary key,
    id_loai_khach int,
	ho_va_ten varchar(45),
    birthday date,
    so_cmnd varchar(45),
    sdt varchar(45),
    emai varchar(45),
    dia_chi varchar(45)    
);
create table loai_khach(
	id_loai_khach int primary key,
	ten_loai_khach varchar(45)
);
alter table khach_hang
add foreign key(id_loai_khach) references loai_khach(id_loai_khach);
-- ------------------------------------------------------------------------------------------------ 
create table dich_vu(
	id_dich_vu int primary key,
	ten_dich_vu varchar(45),
    dien_tich int,
    so_tang int,	
    so_nguoi_toi_da int,
    chi_phi_thue int,
    id_kieu_thue int,
    id_loai_dich_vu int,
    trang_thai varchar(45)
);
create table kieu_thue(
	id_kieu_thue int primary key,
	ten_kieu_thue varchar(45),
    gia int
);
create table loai_dich_vu(
	id_loai_dich_vu int primary key,
	ten_loai_dich_vu varchar(45)
);
alter table dich_vu
add foreign key(id_kieu_thue) references kieu_thue(id_kieu_thue);
alter table dich_vu
add foreign key(id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu);
-- ------------------------------------------------------------------------------------------------ 
create table hop_dong(
	id_hop_dong int primary key,
	id_nhan_vien int,
    id_khach_hang int,
    id_dich_vu int,	
    ngay_lam_hop_dong date,
    ngay_ket_thuc date,
    tien_dat_coc int,
    tong_tien int
);
create table hop_dong_chi_tiet(
	id_hop_dong_chi_tiet int primary key,
    id_hop_dong int,
    id_dich_vu_di_kem int,
    so_luong int
);
create table dich_vu_di_kem(
	id_dich_vu_di_kem int primary key,
    ten_dich_vu_di_kem varchar(45),
    gia int,
    don_vi int,
    trang_thai_kha_dung varchar(45)
);
alter table hop_dong_chi_tiet
add foreign key(id_hop_dong) references hop_dong(id_hop_dong);
alter table hop_dong_chi_tiet
add foreign key(id_dich_vu_di_kem) references dich_vu_di_kem(id_dich_vu_di_kem);
-- ------------------------------------------------------------------------------------------------ 
alter table hop_dong
add foreign key(id_nhan_vien) references nhan_vien(id_nhan_vien);
alter table hop_dong
add foreign key(id_khach_hang) references khach_hang(id_khach_hang);
alter table hop_dong
add foreign key(id_dich_vu) references dich_vu(id_dich_vu);
-- ---------------------------------------------------------------------------------------------------
insert into vi_tri
values
(1,'Lễ tân'),
(2,'phục vụ'),
(3,' chuyên viên'),
(4,'giám sát'),
(5,'quản lý'),
(6,'giám đốc');
insert into trinh_do
values
(1,'Trung cấp'),
(2,'Cao đẳng'),
(3,'Đại học'),
(4,'Sau đại học');
insert into bo_phan
values
(1,'Sale – Marketing'),
(2,'Hành Chính'),
(3,'Phục vụ'),
(4,'Quản lý');
insert into nhan_vien(id_nhan_vien, ho_va_ten, id_vi_tri, id_trinh_do, id_bo_phan, birthday)
values
(1,'Nguyễn Hồng Nhật',1,1,2,'1998-12-07'),
(2,'Nguyễn Quang Danh',2,1,2,'1993-10-05'),
(3,'Nguyễn Văn Khánh',3,3,1,'1997-06-06'),
(4,'Nguyễn Quốc Khánh',3,1,3,'1997-12-24'),
(5,'Lương Phú Châu',4,4,3,'1998-12-07');
-- ---------------------------------------------------------------------------------------------------
insert into loai_khach
values
(1,'Diamond'),
(2,'Platinium'),
(3,'Gold'),
(4,'Silver'),
(5,'Member');
insert into khach_hang(id_khach_hang, id_loai_khach, ho_va_ten, birthday)
values
(1,4,'Mai Văn Tài','1998-09-02'),
(2,1,'Lê Thảo Nhi','1998-06-08'),
(3,1,'Võ Thị Lễ','1998-10-02'),
(4,2,'Lê Thị Hồng Nhung','1998-12-02'),
(5,3,'Thi Lý Chương','1998-11-23');
-- ---------------------------------------------------------------------------------------------------
insert into kieu_thue
values
(1,'Năm',50000),
(2,'Tháng',5000),
(3,'Ngày',300),
(4,'Giờ',40);
insert into loai_dich_vu
values
(1,'Villa'),
(2,'House'),
(3,'Room');
insert into dich_vu(id_dich_vu, dien_tich, so_tang, so_nguoi_toi_da, chi_phi_thue, id_kieu_thue, id_loai_dich_vu)
values
(1,300,5,10,50000,1,1),
(2,258,5,8,50000,3,2),
(3,123,5,6,50000,2,2),
(4,453,5,20,50000,3,3),
(5,205,5,9,50000,4,3);
-- ---------------------------------------------------------------------------------------------------
insert into hop_dong
values
(1,2,2,3,'2020-09-07','2020-10-07',50000,57000),
(2,3,4,1,'2020-10-01','2020-10-08',53020,44000),
(3,3,2,2,'2020-09-03','2020-09-07',45893,30400),
(4,1,1,3,'2020-09-07','2020-09-09',12984,20000),
(5,4,5,1,'2020-05-06','2020-08-19',1234,100000);
insert into dich_vu_di_kem
values
(1,'Massage',100,1,'Còn'),
(2,'Karaoke',100,1,'Còn'),
(3,'Thức ăn',50,5,'Còn'),
(4,'Thuê xe',200,1,'Còn');
insert into hop_dong_chi_tiet
values
(1,3,4,1),
(2,1,3,2),
(3,2,1,1),
(4,5,2,3),
(5,4,2,4);



select * from hop_dong;
select * from dich_vu;
select * from khach_hang;
select * from nhan_vien;
select * from dich_vu_di_kem;
select * from hop_dong_chi_tiet;
drop database case_study_2;
create database case_study_2;
use case_study_2;

create table nhan_vien(
	id_nhan_vien int primary key auto_increment,
    ho_va_ten varchar(45),
    id_vi_tri int,
    id_trinh_do int,
    id_bo_phan int,
    birthday varchar(45),
    so_cmnd varchar(45),
    luong varchar(45),
    sdt varchar(45),
    email varchar(45),
    dia_chi varchar(45),
    username varchar(255)
);
create table vi_tri(
	id_vi_tri int primary key auto_increment,
	ten_vi_tri varchar(45)
);
create table trinh_do(
	id_trinh_do int primary key auto_increment,
	ten_trinh_do varchar(45)
);
create table bo_phan(
	id_bo_phan int primary key auto_increment,
	ten_bo_phan varchar(45)
);

create table `user`(
	username varchar(255) primary key,
    `password` varchar(255)
);
 
 create table user_role(
	username varchar(255),
	role_id int
);

 create table `role`(
	role_id int primary key auto_increment,
    role_name varchar(255)
);

alter table user_role
add foreign key(username) references `user`(username);
alter table user_role
add foreign key(role_id) references `role`(role_id);
alter table nhan_vien
add foreign key(username) references user(username);
alter table nhan_vien
add foreign key(id_vi_tri) references vi_tri(id_vi_tri);
alter table nhan_vien
add foreign key(id_trinh_do) references trinh_do(id_trinh_do);
alter table nhan_vien
add foreign key(id_bo_phan) references bo_phan(id_bo_phan);
-- ------------------------------------------------------------------------------------------------ 
 create table khach_hang(
	id_khach_hang int primary key auto_increment,
    id_loai_khach int,
	ho_va_ten varchar(45),
    birthday varchar(45),
    gioi_tinh varchar(45),
    so_cmnd varchar(45),
    sdt varchar(45),
    email varchar(45),
    dia_chi varchar(45)    
);
create table loai_khach(
	id_loai_khach int primary key auto_increment,
	ten_loai_khach varchar(45)
);
alter table khach_hang
add foreign key(id_loai_khach) references loai_khach(id_loai_khach);
-- ------------------------------------------------------------------------------------------------ 
create table dich_vu(
	id_dich_vu int primary key auto_increment,
	ten_dich_vu varchar(45),
    dien_tich int,
    dien_tich_ho_boi int,
    so_tang int,	
    so_nguoi_toi_da int,
    chi_phi_thue int,
    id_kieu_thue int,
    id_loai_dich_vu int,
    tieu_chuan_phong varchar(45),
    trang_thai varchar(45)
);
create table kieu_thue(
	id_kieu_thue int primary key auto_increment,
	ten_kieu_thue varchar(45),
    gia int
);
create table loai_dich_vu(
	id_loai_dich_vu int primary key auto_increment,
	ten_loai_dich_vu varchar(45)
);
alter table dich_vu
add foreign key(id_kieu_thue) references kieu_thue(id_kieu_thue);
alter table dich_vu
add foreign key(id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu);
-- ------------------------------------------------------------------------------------------------ 
create table hop_dong(
	id_hop_dong int primary key auto_increment,
	id_nhan_vien int,
    id_khach_hang int,
    id_dich_vu int,	
    ngay_lam_hop_dong varchar(45),
    ngay_ket_thuc varchar(45),
    tien_dat_coc int,
    tong_tien int
);
create table hop_dong_chi_tiet(
	id_hop_dong_chi_tiet int primary key auto_increment,
    id_hop_dong int,
    id_dich_vu_di_kem int,
    so_luong int
);
create table dich_vu_di_kem(
	id_dich_vu_di_kem int primary key auto_increment,
    ten_dich_vu_di_kem varchar(45),
    gia int,
    don_vi varchar(45),
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
-- ------------------------------------------------------------------------------------------- 
insert into loai_khach
values
(1,'Diamond'),
(2,'Platinium'),
(3,'Gold'),
(4,'Silver'),
(5,'Member');
insert into loai_dich_vu
values
(1,'Villa'),
(2,'House'),
(3,'Room');
insert into kieu_thue
values
(1,'Năm',50000),
(2,'Tháng',5000),
(3,'Ngày',300),
(4,'Giờ',40);
-- ----------------------------------------------------------------------- 
select * from khach_hang;

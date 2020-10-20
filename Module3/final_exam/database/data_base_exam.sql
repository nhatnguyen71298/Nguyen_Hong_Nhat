drop database final_exam;
create database final_exam;
use final_exam;
create table product (
	stt varchar(45) primary key,
    `name` varchar(45),
    price varchar(45),
    quantity varchar(45),
	id_color varchar(45),
	id_type_catelory varchar(45)
);

create table type_catelory(
	id_type_catelory varchar(45) primary key,
	name_type_catelory varchar(45)
);
create table color(
	id_color varchar(45) primary key,
	name_color varchar(45)
);

insert into color
values
('1','Red'),
('2','Blue'),
('3','Black'),
('4','White'),
('5','Yellow');

insert into type_catelory
values
('1','Phone'),
('2','TV'),
('3','Tủ lạnh'),
('4','Máy giặt');

alter table product
add foreign key(id_type_catelory) references type_catelory(id_type_catelory);
alter table product
add foreign key(id_color) references color(id_color);
-- ----------------------------------------------------

create table mat_bang(
	ma varchar(45) primary key,
	trang_thai varchar(45),
    dien_tich varchar(45),
    so_tang varchar(45),
    loai_mat_bang varchar(45),
    gia varchar(45),
    ngay_bat_dau varchar(45),
    ngay_ket_thuc varchar(45)
);
select * from mat_bang;



drop database baitap;
create database baitap;
use baitap;
create table student(
	id int,
    ten varchar(45),
    tuoi int,
    khoa_hoc varchar(4),
    so_tien int
);

insert into student
values
(1,'Hoang',21,'CNTT',400000),
(2,'Viet',19,'DTVT',320000),
(3,'Thanh',18,'KTDN',400000),
(4,'Nhan',19,'CK',450000),
(5,'Huong',20,'TCNH',500000),
(5,'Huong',20,'TCNH',200000);
-- -------------------------------------------------------------------------------------
select * from student
where ten='Huong';
select sum(so_tien) as 'Tổng tiền của Hương '
from student
where ten='Huong';
select * 
from student 
group by ten;
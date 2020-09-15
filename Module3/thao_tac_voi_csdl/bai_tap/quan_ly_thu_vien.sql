drop database thuvien;
create database thuvien;
use thuvien;
create table student(
	student_number varchar(15) primary key,
    student_name varchar(50) unique,
    student_address varchar(500),
    email varchar(50) unique,
    image text
);
create table book(
	book_code varchar(15) primary key,
    book_name varchar(50) unique,
    number_of_page varchar(500),
	catelory_id int,
    image text
);
create table catelory(
	catelory_id int primary key auto_increment,
	catelory varchar(50),
    `comment` text,
    image text
);
create table borrow_order(
	order_id varchar(15) primary key,
    price int,
    `comment` text
);
alter table book
add column rented_by varchar(15);
alter table book
add foreign key (rented_by) references student(student_number);
alter table book
add foreign key (catelory_id) references catelory(catelory_id);
alter table borrow_order
add column student_number varchar(15);
alter table borrow_order
add foreign key (student_number) references student(student_number);

insert into student
values
('001','nhat','da nang','nhat.com','no'),
('002','danh','da nang','danh.com','no'),
('003','khanh','da nang','khanh.com','no'),
('004','vinh','da nang','vinh.com','no'),
('005','quan','da nang','quan.com','no');
select * from student;
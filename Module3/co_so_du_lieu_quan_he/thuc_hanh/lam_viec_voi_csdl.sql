create database employee;
use employee;
create table employee(
	id int primary key auto_increment,
    `name` varchar(50),
    date_of_birth date
);
insert into employee (`name`,date_of_birth)
values
('nhat','1998-12-07'),
('nhat1','1998-12-07'),
('nhat2','1998-12-07');
update employee
set `name`='cuong'
where id=3;
select `name` from employee
where id=3;

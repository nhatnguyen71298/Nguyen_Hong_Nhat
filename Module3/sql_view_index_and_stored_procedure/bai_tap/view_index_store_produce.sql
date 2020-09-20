drop database test_view;
create database test_view;
create table product (
	id int primary key auto_increment, 
    product_code varchar(10),
	product_name varchar(45),
	product_price int,
	product_description varchar(45),
	product_status varchar(45)
);
insert into product(product_code, product_name, product_price, product_description, product_status)
values
('VL01','Villa', 300,'Villa1', 'No'),
('VL02','Villa', 400,'Villa2', 'No'),
('HO01','House', 200,'House1', 'No'),
('RO01','Room', 300, 'Villa', 'No'),
('HO02','House', 200,'House2', 'No');
create unique index index_on_product_code
on product(product_code);
create index index_on_product_name_and_price
on product(product_name, product_price);

create view main_infor_product as
select product_code, product_name, product_price, product_status
from product;
select * from main_infor_product;

DELIMITER //
CREATE PROCEDURE get_all_products()
BEGIN
	SELECT *  FROM product;
END //
DELIMITER ;

call get_all_products();

delimiter //
create procedure add_new_product( product_code varchar(10),product_name varchar(45),product_price int, product_description varchar(45),product_status varchar(45))
begin 
	insert into product(product_code, product_name, product_price, product_description, product_status)
	values
    (product_code, product_name, product_price, product_description, product_status);
end //
delimiter ;

call add_new_product('RO02','Room', 150, 'Room2', 'No');
call get_all_products();

delimiter //
create procedure repair_product(id int, new_product_code varchar(10),new_product_name varchar(45),new_product_price int,new_product_description varchar(45),new_product_status varchar(45))
begin 
	update product
    set product_code = new_product_code , product_name= new_product_name  , product_price= new_product_price , product_description=new_product_description, product_status= new_product_status
    where id=id;
end //
delimiter ;
call repair_product(6,'RO03','Room', 250, 'Room3', 'No');

delimiter //
create procedure del_product(id int)
begin 
	delete from product
    where id=id;
end //
delimiter ;

call del_product(6);

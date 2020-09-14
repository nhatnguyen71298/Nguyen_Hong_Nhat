create database phantichvathietke;
use phantichvathietke;
create table customer(
	customer_number int primary key auto_increment,
    customer_name varchar(50) not null, 
    contact_last_name  varchar(50) not null, 
    contact_first_name  varchar(50) not null, 
    phone  varchar(50) not null, 
	address_line1 varchar(50) not null, 
	address_line2 varchar(50) not null, 
	city varchar(50) not null, 
	state varchar(50) not null, 
	postal_code varchar(15) not null, 
    country varchar(50) not null,
	credit_limit float
);
create table orders(
	order_number int primary key auto_increment,
	order_date date not null,
    required_date date not null,
    shipped_date date not null,
    `status` varchar(15) not null, 
	comments text ,
    quantity_ordered int not null,
    price_each float not null
);
create table payment(
	customer_number int primary key auto_increment,
	check_number varchar(50) not null,
    payment_date date not null,
    amout float
);
create table products(
	product_code varchar(15) primary key,
    product_name varchar(70) not null,
    product_scale varchar(10) not null,
    product_vendor varchar(50) not null,
    product_description text not null,
    quantity_in_stock int not null,
    buy_price float not null,
    msrp float not null
);
create table productlines(
	product_line varchar(50) primary key,
    text_description text not null,
    image char not null
);
create table employee(
	employee_number int primary key auto_increment,
	last_name varchar(50) not null,
	first_name varchar(50) not null,
	email  varchar(100) not null,
	job_title varchar(50) not null
);
create table offices(
	office_code varchar(10) primary key,
	city varchar(50) not null,
	phone varchar(50) not null,	
	address_line1 varchar(50) not null,
	address_line2 varchar(50) not null,
	state varchar(50) not null,
	country varchar(50) not null,
	postal_code varchar(50) not null
);
-- -----------------------------------------------------------------------------------------------------------------
alter table orders
add column customer_number int;
alter table orders
add foreign key (customer_number) references customer(customer_number);

alter table payment
add foreign key (customer_number) references customer(customer_number);

create table order_details(
	order_number int,
    product_code varchar(15),
    primary key(order_number,product_code),
    foreign key (order_number) references orders(order_number),
    foreign key (product_code) references products(product_code)
);

alter table products
add column product_line varchar(50);
alter table products
add foreign key (product_line) references productlines(product_line);

alter table customer
add column employee_number int;
alter table customer
add foreign key (employee_number) references employee(employee_number);

alter table employee
add column reportTo int;
alter table employee
add foreign key (reportTo) references employee(employee_number);

alter table employee
add column office_code varchar(10);
alter table employee
add foreign key (office_code) references offices(office_code);

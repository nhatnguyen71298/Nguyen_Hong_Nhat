create database baitap;
use baitap;
create table customers(
	customer_number varchar(10) primary key,
    fullname varchar(50),
    address varchar(50),
    email varchar(50) unique,
    phone varchar(10) unique
);
create table accounts(
	account_number varchar(10) primary key,
    account_type varchar(20),
    `date` date,
    amount int
);
create table transactions(
	tran_number  varchar(10) primary key,
    account_number varchar(10),
    `date` date,
    amount int,
    descriptions varchar(50)
);

alter table accounts
add column customer_number varchar(10) 
after amount;
alter table accounts
add foreign key (customer_number) references customers(customer_number);

alter table transactions
add foreign key (account_number) references accounts(account_number);

drop table customers,accounts,transactions;
drop database baitap;


create database pm;
use pm;
       
create table pm.PRODUCTS(
id int primary key,
name varchar(50),
price double,
makeDate date,
description varchar(200)
);

select * from pm.PRODUCTS;
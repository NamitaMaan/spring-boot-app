DROP TABLE IF EXISTS Products;

create table Products(
product_Id number,
 name varchar(100), 
 description varchar(200), 
 price number(10,2), 
 measurement_unit varchar(20), 
 available boolean);
 
create sequence hibernate_sequence start with 3 increment by 1;

insert into Products(product_Id, name, description, price, measurement_unit, available) 
values (1, 'Coffee', 'Nescafe Instant',  200.00, '100 gms', true);

insert into Products(product_Id, name, description, price, measurement_unit, available) 
values (2, 'Hair Oil', 'Shanti Amla Oil', 200.00, '100 ml', false);
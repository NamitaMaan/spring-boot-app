create table orders (id integer not null, amount double not null, cust_number bigint, order_number bigint, prod_number integer not null, primary key (id));
create table products (product_id integer not null, available boolean not null, description varchar(255), measurement_unit varchar(255), name varchar(255), price double, primary key (product_id));
create sequence hibernate_sequence start with 4 increment by 1;

insert into orders(id, cust_number , order_number , prod_number , amount )
values ( 1, 101, 111, 3, 530 );

insert into orders(id, cust_number , order_number , prod_number , amount )
values ( 2, 101, 112, 2, 700 );

insert into orders(id, cust_number , order_number , prod_number , amount )
values ( 3, 201, 211, 1, 250 );  
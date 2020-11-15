/*
 * JDBC Bank Database Creation Script
 * Schemas : jdbcbank 
 * Tables  : register, account, & customer
 *
 */

create schema if not exists jdbcbank authorization root; --creates scheme jdbcbank
set search_path to jdbcbank;


create table register( --customer object table
uid serial primary key, --Sets primary key
username varchar(30),
password varchar(30),
first varchar(30),
last varchar(30)
);


create table account( --account object table
aid serial primary key, --Sets primary key
balance double precision
);
 

create table customer( --which customer has which account
uid int,
aid int,
foreign key (uid) references register(uid) on delete cascade,
foreign key (aid) references account(aid) on delete cascade
);

--DML select key
select * from register; --view register table
select * from account;  --view account table
select * from customer; --view customers table




--user defined function
select count(*) as uid
from register;

drop table register; --debugging
drop table customer;




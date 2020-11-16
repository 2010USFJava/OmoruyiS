/*
 * JDBC Bank Database Creation Script
 * Schemas : jdbcbank 
 * Tables  : register, account, & customer
 *
 */
--create sequence mySeq;


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
aid serial primary key, --Sets primary keyint qty,
balance double precision,
qty int,
deposit double precision,
withdrawal double precision
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


/*
 * TEST & DEBUGGING COMMANDS
 */ 
--update account
--set balance=100.00
--where aid=10002;

--update account
--set qty=1
--where aid=10002;

--update register 
--set first='kevin',
--last='durant',
--password='password' 
--where uid=2;

--drop table register; --debugging
--drop table account;
--drop table customer;

--delete from register 
--where uid =3;

 




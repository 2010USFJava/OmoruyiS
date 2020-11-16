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
withdrawal double precision,
username varchar(30)
);
 
create table customer( --which customer has which account
uid serial,
aid serial,
foreign key (uid) references register(uid) on delete cascade,
foreign key (aid) references account(aid) on delete cascade
);

create table assets(
bid serial,
bank varchar(30),
equity double precision
);


--DML select key
select * from register; --view register table
select * from account;  --view account table
select * from customer; --view customers table
select * from assets; --view aggregation table

--drop table assets;
--drop table customer;
--drop table register;
--drop table account;

insert into assets (bid) values(2);

update assets
set bank='casino_royal'
where bid=2;

update assets
set equity=sum(balance) from account
where bid=2;






--update assets 
--set equity=(select sum(balance) from account) 
--where bank='casino_royal';


/*
 * TEST & DEBUGGING COMMANDS
 */ 

--user defined function
--select count(*) as uid
--from register;

--update account
--set deposit=00.00
--where aid=10003;

--update account
--set qty=1
--where aid=10002;

--update register 
--set first='kevin',
--last='durant',
--password='password' 
--where uid=2;

--delete from register 
--where uid =3;


--update assets 
--set equity=(select sum(balance) from account) 
--where bank='casino_royal';







/*
 * JDBC Bank Database Creation Script
 * Schemas : public 
 * Tables  : customers
 * Columns :
 *	1) pid (int)
 *	2) pname (varchar(30))
 */

--	private int uid;
--	private String username; 
--	private String password;
--	private String first;
--	private String last;
--	private double balance;
--	private int qty;
--	private long accountNumber;
--	private int typeOfAccount;



create table customers(
uid integer primary key, --Sets primary key
username varchar(30),
pass varchar(30),
firstname varchar(30),
lastname varchar(30)
);

insert into customers values (1,'lebron', 'password', 'lebron', 'james'); --(DML) insert

create table account(
uid integer primary key, --Sets primary key
balance integer,
bankacctid integer
);


insert into account values (1,25,001);

select * from customers; --(DML) select
select * from account;




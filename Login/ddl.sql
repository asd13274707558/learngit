create database test;
use test;
drop account;
create table account(
  username varchar(20) ,
  password varchar(100) 
 );
 
 insert into account(username,password) values('admin','21232f297a57a5a743894a0e4a801fc3');
 
 select username,password from  account  where username=admin and password=admin;

select username,password from account where username='admin' and password='admin';

select username,password from account where username=admin and password=?;

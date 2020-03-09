create database foodorderdatabase;

use foodorderdatabase;

create table user(emailId varchar(40) not null, password varchar(40) not null,
 fname varchar(20) not null, lname varchar(20) not null, phoneNumber varchar(15) not null,
 address varchar(40) not null,primary key(emailId));
 
 insert into user(emailId, password, fname, lname, phoneNumber, address) 
values('us14696@gmail.com', 'password', 'umesh', 'balasaravanan', '+19378135838', 'Dayton');
 
 

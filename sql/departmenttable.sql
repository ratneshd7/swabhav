create table department(did INT primary key ,dname varchar(20),location varchar(20) )
insert into department values(10,'Sales','Andheri')
insert into department values(20,'Marketing','Pune')

create table employee(eno INT primary key ,ename varchar(20),salary INT, depId int foreign key references department(did))

insert into employee values(1,'Ratnesh',50000,10)
insert into employee values(2,'B',500,10)
insert into employee values(3,'C',1000,20)
insert into employee values(4,'D',120,20)

select * from employee

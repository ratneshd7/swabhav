create table student(id INT primary key, first_name varchar(20),last_name varchar(20),cgpa FLOAT);
insert INTO student values(1,'Ratnesh','Dubey',8.11)
insert INTO student values(2,'Ravi','Dubey',8.12)
insert INTO student values(3,'Priyank','Shah',7.11)
insert INTO student values(4,'Meet','Dubey',9.11)
insert INTO student values(5,'Brijesh','Dubey',9.11)

select *from student
drop table student

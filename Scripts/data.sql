insert into department values 
(1,'영업',8),(2,'기획',10),(3, '개발',9),(4,'총무',7);

insert into title values 
(1, '사장'), (2, '부장'), (3, '과장'), (4, '대리'), (5, '사원');

INSERT INTO employee(eno, ename, title, salary,gender, dno, joindate) VALUES 
(4377,'이성래',1,5000000,1, 2, '2015-03-01'),
(3011,'이수민',2,4000000,1, 3, '2015-04-01'),
(3426,'박영권',3,3000000,1, 1, '2016-05-01'),
(1003,'조민희',3,3000000,0, 2, '2016-06-01'),
(1365,'김상원',5,1500000,0, 1, '2019-05-01'),
(2106,'김창섭',4,2500000,0, 2, '2018-08-01'),
(3427,'최종철',4,1500000,0, 2, '2019-05-01');

select * from department;
select * from title;

drop procedure if exists salary_total;
delimiter $$
$$
create procedure salary_total(in deptno int)
BEGIN
	select dept_name, ifnull(sum(salary),0) as total
	from employee e right join department d on e.dno = d.dept_code
	where dno = deptno;
END$$
delimiter ;

call salary_total(1);
package kr.or.yi.gradle_mybatis_c3p0.dao;

import java.util.List;

import kr.or.yi.gradle_mybatis_c3p0.dto.Employee;

public interface EmployeeDao {
	List<Employee> selectEmployeeByAll();
	int insertEmployee(Employee emp);
	int deleteEmployee(Employee emp);
	int updateEmployee(Employee emp);
	Employee selectEmployeeByCode(Employee emp);
}

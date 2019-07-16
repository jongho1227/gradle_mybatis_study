package kr.or.yi.gradle_mybatis_c3p0.dao;

import java.util.List;
import java.util.Map;

import kr.or.yi.gradle_mybatis_c3p0.dto.Employee;
import kr.or.yi.gradle_mybatis_c3p0.dto.State;

public interface EmployeeDao {
	List<Employee> selectEmployeeByAll();
	
	  int insertEmployee(Employee emp); 
	  int deleteEmployee(Employee emp); 
	  int updateEmployee(Employee emp); 
	  Employee selectEmployeeByCode(Employee emp);
	  
	  Map<String, Object> getSalaryByDepartment(Map<String, Object> param);
	  State getStateSalaryByDepartment(Map<String, Object> param);
}

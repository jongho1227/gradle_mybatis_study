package kr.or.yi.gradle_mybatis_c3p0;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.yi.gradle_mybatis_c3p0.dao.EmployeeDao;
import kr.or.yi.gradle_mybatis_c3p0.dao.EmployeeDaoImpl;
import kr.or.yi.gradle_mybatis_c3p0.dto.Department;
import kr.or.yi.gradle_mybatis_c3p0.dto.Employee;
import kr.or.yi.gradle_mybatis_c3p0.dto.Title;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeDaoTest extends AbstractTest {
	private static EmployeeDao employeeDao;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		employeeDao = new EmployeeDaoImpl();
	}	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		employeeDao = null;
	}

	@Test
	public void test01SelectEmployeeByAll() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		List<Employee> employeeList = employeeDao.selectEmployeeByAll();
		Assert.assertNotNull(employeeList);
		
		for(Employee t : employeeList) {
			log.debug(t.toString());
		}
	}
	

	@Test
	public void test02insertEmployee() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Date joinDate = new Date();
		Employee emp = new Employee(2000, "임종호", 3000000, new Department(1), true, joinDate, new Title(2));
		int res = employeeDao.insertEmployee(emp);
		Assert.assertEquals(1, res);
	}
	

	@Test
	public void test03UpdateEmployee() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Calendar join = Calendar.getInstance();
		join.clear();
		join.set(Calendar.YEAR, 2016);
		join.set(Calendar.MONTH, 7);
		join.set(Calendar.DAY_OF_MONTH, 01);
		Employee emp = new Employee(1003, "조민희", 3000000, new Department(2), false, join.getTime(), new Title(3));
		Employee upemp = new Employee(1003, "조민희2", 4000000, new Department(3), false, join.getTime(), new Title(2));
		
		int res = employeeDao.updateEmployee(upemp);
		Assert.assertEquals(1, res);
		employeeDao.updateEmployee(emp);
	}
	
	@Test
	public void test04selectEmployeeByCode() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Employee emp = employeeDao.selectEmployeeByCode(new Employee(2000));
		Assert.assertNotNull(emp);
	}
	
	@Test
	public void test05deleteEmployee() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Employee emp = new Employee(2000);
		int res = employeeDao.deleteEmployee(emp);
		Assert.assertEquals(1, res);
	}
	
}














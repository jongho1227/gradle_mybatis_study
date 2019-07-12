package kr.or.yi.gradle_mybatis_c3p0;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.yi.gradle_mybatis_c3p0.dao.EmployeeDao;
import kr.or.yi.gradle_mybatis_c3p0.dao.EmployeeDaoImpl;
import kr.or.yi.gradle_mybatis_c3p0.dto.Employee;

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
	public void testSelectEmployeeByAll() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		List<Employee> employeeList = employeeDao.selectEmployeeByAll();
		Assert.assertNotNull(employeeList);
		
		for(Employee t : employeeList) {
			log.debug(t.toString());
		}
	}

}

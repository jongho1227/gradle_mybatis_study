package kr.or.yi.gradle_mybatis_c3p0.service;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.yi.gradle_mybatis_c3p0.AbstractTest;
import kr.or.yi.gradle_mybatis_c3p0.dto.Department;
import kr.or.yi.gradle_mybatis_c3p0.dto.Title;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TransactionServiceTest extends AbstractTest {
	private static TransactionService service = new TransactionService();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test(expected = RuntimeException.class)
	public void test1Insert() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Title title = new Title(1, "사원");
		Department department = new Department(6, "H/W개발", 6);
		service.addTitleDepartment(title, department);
	}
	
	@Test(expected = RuntimeException.class)
	public void test2Insert() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Title title = new Title(7, "무기계약");
		Department department = new Department(1, "개발", 6);
		service.addTitleDepartment(title, department);
	}
	
	@Test
	public void test3Insert() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Title title = new Title(7, "무기계약");
		Department department = new Department(6, "H/W개발", 6);
		service.addTitleDepartment(title, department);
	}
	
	@Test(expected = RuntimeException.class)
	public void test4DeleteTitle() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Title title = new Title(8, "사원");
		Department department = new Department(6, "H/W개발", 6);
		service.removeTitleDepartment(title, department);
	}
	@Test(expected = RuntimeException.class)
	public void test5DeleteTitle() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Title title = new Title(7, "무기계약");
		Department department = new Department(10, "개발", 6);
		service.removeTitleDepartment(title, department);
	}
	@Test
	public void test6DeleteTitle() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Title title = new Title(7, "무기계약");
		Department department = new Department(6, "H/W개발", 6);
		service.removeTitleDepartment(title, department);
	}
}

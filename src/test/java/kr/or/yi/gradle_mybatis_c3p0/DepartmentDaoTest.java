package kr.or.yi.gradle_mybatis_c3p0;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.yi.gradle_mybatis_c3p0.dao.DepartmentDao;
import kr.or.yi.gradle_mybatis_c3p0.dao.DepartmentDaoImpl;
import kr.or.yi.gradle_mybatis_c3p0.dto.Department;
import kr.or.yi.gradle_mybatis_c3p0.dto.Title;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DepartmentDaoTest extends AbstractTest {
	private static DepartmentDao deptDao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		deptDao = new DepartmentDaoImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		deptDao = null;
	}
	
	@Test
	public void test01InsertDepartment() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department insertDepartment = new Department(5, "인사", 10);
		int res = deptDao.insertDepartment(insertDepartment);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test02SelectDepartmentByAll() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		List<Department> deptList = deptDao.selectDepartmentByAll();
		Assert.assertNotNull(deptList);
		
		for(Department dept : deptList) {
			log.debug(String.format("%d %s %s", dept.getDeptCode(), dept.getDeptName(), dept.getFloor()));
		}
	}
	
	@Test
	public void test03UpdateDepartment() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department updateDepartment = new Department(5, "인사", 20);
		int res = deptDao.updateDepartment(updateDepartment);
		Assert.assertEquals(1, res);
	}
	
	
	@Test
	public void test04DeleteDepartment() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department deleteDepartment = new Department(5);
		int res = deptDao.deleteDepartment(deleteDepartment);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test05SelectDepartmentByCode() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department seletedDepartment = new Department(1);
		Department searchDepartment = deptDao.selectDepartmentByCode(seletedDepartment);
		Assert.assertNotNull(searchDepartment);
	}

}












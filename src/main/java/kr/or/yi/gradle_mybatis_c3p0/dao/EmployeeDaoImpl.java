package kr.or.yi.gradle_mybatis_c3p0.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.yi.gradle_mybatis_c3p0.dto.Employee;
import kr.or.yi.gradle_mybatis_c3p0.jdbc.MyBatisSqlSessionFactory;

public class EmployeeDaoImpl implements EmployeeDao {
	private static final String namespace = "mappers.EmployeeMapper";
	
	@Override
	public List<Employee> selectEmployeeByAll() {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			return sqlSession.selectList(namespace + ".selectEmployeeByAll");
		}
	}

	@Override
	public int insertEmployee(Employee emp) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			int res = sqlSession.insert(namespace + ".insertEmployee", emp);
			sqlSession.commit();
			return res;
		}
	}

	@Override
	public int deleteEmployee(Employee emp) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			int res = sqlSession.delete(namespace + ".deleteEmployee", emp);
			sqlSession.commit();
			return res;
		}
	}

	@Override
	public int updateEmployee(Employee emp) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			int res = sqlSession.update(namespace + ".updateEmployee", emp);
			sqlSession.commit();
			return res;
		}
	}

	@Override
	public Employee selectEmployeeByCode(Employee emp) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			return sqlSession.selectOne(namespace + ".selectEmployeeByCode", emp);
		}
	}

}

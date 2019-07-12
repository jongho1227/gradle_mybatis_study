package kr.or.yi.gradle_mybatis_c3p0.dto;

import java.util.Date;

public class Employee {
	private int eno;
	private String ename;
	private int salary;
	private Department dno;
	private int gender;
	private Date joindate;
	private Title title;
	
	public Employee() {
		
	}
	
	public Employee(int eno) {
		this.eno = eno;
	}

	public Employee(int eno, String ename, int salary, Department dno, int gender, Date joindate, Title title) {
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
		this.dno = dno;
		this.gender = gender;
		this.joindate = joindate;
		this.title = title;
	}

	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Department getDno() {
		return dno;
	}
	public void setDno(Department dno) {
		this.dno = dno;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	public Title getTitle() {
		return title;
	}
	public void setTitle(Title title) {
		this.title = title;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eno;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (eno != other.eno)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return String.format("Employee [eno=%s, ename=%s, salary=%s, dno=%s, gender=%s, joindate=%s, title=%s]", eno,
				ename, salary, dno, gender, joindate, title);
	}
	
	
	
}

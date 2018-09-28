package demo.HystrixDemo;


public class Emp {
	
	
	private int empno;
	private String ename;
	private int salary;
	private String dept;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String geteName() {
		return ename;
	}
	public void seteName(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Emp(int empno, String ename, int salary, String dept) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
		this.dept = dept;
	}
	public Emp(){}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
}

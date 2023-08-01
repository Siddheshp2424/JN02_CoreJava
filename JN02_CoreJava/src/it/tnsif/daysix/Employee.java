package it.tnsif.daysix;

public class Employee extends Person {

	private String empId;
	private String CompanyName;
	private long salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	public Employee(String empId, String companyName, long salary) {
		super("Sachin",21,7845612314l);
		this.empId = empId;
		CompanyName = companyName;
		this.salary = salary;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", CompanyName=" + CompanyName + ", salary=" + salary + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
}

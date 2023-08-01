package it.tnsif.daysix;

public class Student extends Person {

	private String studID;
	private String department;
	private int marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studID, String department, int marks) {
		super("Siddhesh",21,8794568912l);
		this.studID = studID;
		this.department = department;
		this.marks = marks;
	}
	public String getStudID() {
		return studID;
	}
	public void setStudID(String studID) {
		this.studID = studID;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [studID=" + studID + ", department=" + department + ", marks=" + marks + ", toString()="
				+ super.toString() + "]";
	}
	
	
}

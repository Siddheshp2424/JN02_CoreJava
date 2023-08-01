package it.tnsif.dayfive;

public class Person {
	
	private String name;
	private int age;
	private long contact;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, long contact) {
		super();
		this.name = name;
		this.age = age;
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", contact=" + contact + "]";
	}
	
	

}

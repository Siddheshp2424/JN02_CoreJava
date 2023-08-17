package com.tnsif.dayten.Exception;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person p=new Person();
		p.setName("Siddhesh");
		try {
		p.setAge(15);
		System.out.println(p);
		
		
		Person p1=new Person("Sahile",18);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}

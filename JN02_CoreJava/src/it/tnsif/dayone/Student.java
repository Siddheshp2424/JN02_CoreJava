package it.tnsif.dayone;

public class Student {
	int rollNo;
	String name;
	int m1,m2,m3;
	float percentage;
	
	
	public Student()
	{
		System.out.println("This is Default Constructor");
	}
	
	public Student(int rollNo,String name,int m1,int m2,int m3)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		percentage=(m1+m2+m3)/(float)3.0;
	}
	
	public void show()
	{
		System.out.println("--------Student Information---------");
		System.out.println("Roll No:"+rollNo+"\t"+"Name:"+name+"\t"+"m1:"+m1+"\t"+"m2:"+m2+"\t"+"m3"+m3+"\t"+"Percentage:"+percentage);
	}

}

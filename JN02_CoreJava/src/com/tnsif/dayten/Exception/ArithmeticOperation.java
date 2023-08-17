package com.tnsif.dayten.Exception;

public class ArithmeticOperation {
	
	 int a,b;
    int c;
	public ArithmeticOperation(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	 
	
	public void add()
	{
		System.out.println("Addition is :"+(a+b));
	}
	
	public void div()throws ArithmeticException
	{
		if(b==0)
		{
			throw new ArithmeticException("Division by zero error...");
			
		}
		System.out.println("Division is :"+(a/b));
	}
	

}

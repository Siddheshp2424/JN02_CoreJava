package com.tnsif.dayten.Exception;

public class DemoDivision {

	
	public static void divison(int a,int b)
	{
		try
		{
		int c=a/b;
		System.out.println("Divison is :"+c);
		//System.exit(0);    It will terminate the program
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Exception occured");
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Always executed");
		}
		
	}
}

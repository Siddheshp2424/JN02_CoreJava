package com.tnsif.dayten.Exception;

public class InvalidAgeException extends Throwable{

	public InvalidAgeException()
	{
		System.out.println("Age is not valid");
	}
	
	public InvalidAgeException(String str)
	{
		super(str);
	}
	
	
}

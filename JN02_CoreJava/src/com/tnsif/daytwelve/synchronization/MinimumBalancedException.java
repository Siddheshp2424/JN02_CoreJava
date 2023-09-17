package com.tnsif.daytwelve.synchronization;

public class MinimumBalancedException extends Throwable {
	
	public MinimumBalancedException()
	{
		super("Withdraw failed!");
	}
	
	public MinimumBalancedException(String str)
	{
		super(str);
	}

}

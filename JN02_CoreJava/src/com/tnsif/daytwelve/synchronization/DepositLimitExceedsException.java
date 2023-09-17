package com.tnsif.daytwelve.synchronization;

public class DepositLimitExceedsException extends Throwable {
	
	public DepositLimitExceedsException()
	{
		super("Deposit failed!");
	}
	
	public DepositLimitExceedsException(String str)
	{
		super(str);
	}

}

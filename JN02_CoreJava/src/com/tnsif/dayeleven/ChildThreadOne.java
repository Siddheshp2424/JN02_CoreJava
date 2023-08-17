package com.tnsif.dayeleven;

public class ChildThreadOne extends Thread {

	public ChildThreadOne()
	{
		start();
	}
	
	public ChildThreadOne(String str)
	{
		setName(str);
		start();
	}
	
	public void run()
	{
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Welocme"+Thread.currentThread());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}

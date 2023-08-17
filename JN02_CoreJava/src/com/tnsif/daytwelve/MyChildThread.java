package com.tnsif.daytwelve;

public class MyChildThread implements Runnable {

	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Welcome");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

package com.tnsif.daytwelve;

public class UsingRunnable {

	public static void main(String[] args) {
		
		//using object of implementable class;
		Runnable r=new MyChildThread();
		Thread t=new Thread(r);
		//t.start();
		
		
		//anonymous class
		Runnable r2=new Runnable() {
			public void run()
			{
				char ch='A';
				for(int i=1;i<29;i++)
				{
					char ch2=(char)(ch+32);
					System.out.println(ch+","+ch2);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					ch++;
				}
				
			}
		};
		
		Thread t2=new Thread(r2);
		 
		//t2.start();
	 
		
		
		//lambda expression
		
		Runnable r3=()->{
			for(int i=1;i<10;i++)
			{
				System.out.println("****");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t3=new Thread(r3);
		//t3.start();
		
		
		t2.setPriority(Thread.MAX_PRIORITY);
		t.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
	 
		 
		t3.start();
		
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t.start();
		t2.start();
	}
	
}

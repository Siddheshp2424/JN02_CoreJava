package com.tnsif.dayeleven;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("-----------In Main--------------------");
	   System.out.println(Thread.currentThread());
	   
//	   ChildThread t1=new ChildThread();
//	   t1.start();
	   ChildThreadOne t1=new ChildThreadOne("first");
	  // t1.start();
	   ChildThreadOne t2=new ChildThreadOne("second");
	   //t2.start();
	  // t1.start();
	   Thread.sleep(2000);
		System.out.println("--------------End of main------------------------");
	}
}

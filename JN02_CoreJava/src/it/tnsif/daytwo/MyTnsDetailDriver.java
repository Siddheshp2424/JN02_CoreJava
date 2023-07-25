package it.tnsif.daytwo;

public class MyTnsDetailDriver {
	public static void main(String[] args) {
		 
		System.out.println(MyTnsDetail.getCollege());
		System.out.println(MyTnsDetail.getSsname());
		System.out.println(MyTnsDetail.getTtname());
	  
		System.out.println("\n");
	     MyTnsDetail t1=new MyTnsDetail();
	     t1.setUid("TC150");
	     t1.setName("Siddhesh");
	     t1.setCity("Aurangabad");
	     t1.setContact(9822145378l);
	     System.out.println(t1);
	     
	     
	     MyTnsDetail t2=new MyTnsDetail();
	     t2.setUid("TC151");
	     t2.setName("Sachin");
	     t2.setCity("Pune");
	     t2.setContact(9822145377l);
	     System.out.println(t2);
	     
	     MyTnsDetail t3=new MyTnsDetail();
	     t3.setUid("TC152");
	     t3.setName("Abhishek");
	     t3.setCity("Pune");
	     t3.setContact(8622145378l);
	     System.out.println(t3);
	
	}

}

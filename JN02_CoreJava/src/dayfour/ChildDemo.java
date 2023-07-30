package dayfour;

public class ChildDemo extends UsingFinal {  //if class is final then cannot be inherit
	final int a=11;
 
	 public void display()
	 {
//		 a=12  //cannot change variable values
		 System.out.println("This is Normal method");
	 }
	 
	 //@Override cannot override final method
/*	 public void finalMethod()
	 {
		 System.out.println("Child class final method");
	 }
*/
}

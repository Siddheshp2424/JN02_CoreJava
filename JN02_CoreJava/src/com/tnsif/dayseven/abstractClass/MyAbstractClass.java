package com.tnsif.dayseven.abstractClass;

public class MyAbstractClass {
	
	public static void main(String[] args) {
		Shape s;
		s=new Rectangle(40,50);
		s.calArea();
	     s.show();
	     
	     s=new Square(5);
	     s.calArea();
	     s.show();
	     
	     s=new Circle(3.4f);
	     s.calArea();
	     s.show();
	    		 
		
		
	}

}

package com.tnsif.dayseven.abstractClass;

abstract public class Shape {
	protected final float PI=3.14f;
	protected float area;
	protected int length,breath;
     public void show()
     {
    	
    	 String shapeName=this.getClass().getName().substring(getClass().getName().lastIndexOf(".")+1);
    	 System.out.println("Area of "+shapeName+ " is " +area);
     }
     
    public abstract void calArea();
     
}

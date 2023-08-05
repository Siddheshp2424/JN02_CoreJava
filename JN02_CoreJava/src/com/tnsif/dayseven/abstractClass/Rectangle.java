package com.tnsif.dayseven.abstractClass;

public class Rectangle extends Shape {
	
	private float length,breath;
	public Rectangle()
	{
		super();
		
	}
	
	public Rectangle(int length,int breath)
	{
		super();
		this.length=length;
		this.breath=breath;
		
		 
	}
	
	
	
	
	
    public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreath() {
		return breath;
	}

	public void setBreath(float breath) {
		this.breath = breath;
	}

	public void calArea()
    {
    	area=length*breath;
    }
	
	
	
	@Override
	public String toString() {
		return "Rectangle [area=" + area + ", toString()=" + super.toString() + "]";
	}
 

}

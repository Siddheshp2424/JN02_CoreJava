package com.tnsif.dayseven.abstractClass;

public class Circle extends Shape {
	
	private float radius;

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(int length, int breath) {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public void calArea()
	{
		area=PI*radius*radius;
	}
	

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", toString()=" + super.toString() + "]";
	}
	
	

}

package com.tnsif.dayseven.abstractClass;

public class Square extends Shape {
	
	private float side;
	
	public Square()
	{
		super();
	}
	
	public Square(float side)
	{
		super();
		this.side=side;
	}
	
	public void setSide(float Side)
	{
		this.side=side;
	}
	public float getSide()
	{
		return side;
	}
	
	
	public void calArea()
	{
		area=side*side;
	}
	
	public String toString()
	{
		return "Side="+side+"soString"+super.toString()+"";
	}

}

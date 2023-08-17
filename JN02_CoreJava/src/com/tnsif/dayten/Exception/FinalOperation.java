package com.tnsif.dayten.Exception;

public class FinalOperation {
	
	public static void main(String[] args) {
		
		ArithmeticOperation op=new ArithmeticOperation(100,0);
		op.add();
		
		try {
		op.div();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}

}

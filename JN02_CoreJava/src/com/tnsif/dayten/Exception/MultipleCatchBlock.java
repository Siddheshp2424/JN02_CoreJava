package com.tnsif.dayten.Exception;
import java.util.*;
public class MultipleCatchBlock {
	
	public static void main(String[] args) {
		
		try
		{
		int arr[]= {10,20,30,40,50};
		for(int i:arr)
			System.out.println(i);
		int index,value;
		System.out.println("Enter index to update");
		Scanner sc=new Scanner(System.in);
		index=sc.nextInt();
		System.out.println("Enter value to update");
		value=sc.nextInt();
		
		arr[index]=value;
	
		
		for(int i:arr)
			System.out.print(i+"\t");
	
		
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("---------------------------------------------");
		}

}

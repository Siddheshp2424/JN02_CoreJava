package com.tnsif.daynine.array;
import java.util.*;
public class SingleDimenssion {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		
		int size;
		System.out.println("Enter size of array\n");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("You Entered:");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}
}

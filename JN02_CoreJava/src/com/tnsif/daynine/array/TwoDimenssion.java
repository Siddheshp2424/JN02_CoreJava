package com.tnsif.daynine.array;

import java.util.*;
public class TwoDimenssion {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r,c;
		System.out.println("Enter row and clumns:");
		r=sc.nextInt();
		c=sc.nextInt();
		int arr[][]=new int[r][c];
		System.out.println("Enter elements:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("You Entered:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
		
		
		//jagged array
		int arr1[][]= {{10,20,50},{30,60},{70}};
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}
		
		
	}

}

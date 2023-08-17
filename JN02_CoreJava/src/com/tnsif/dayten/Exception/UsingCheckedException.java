package com.tnsif.dayten.Exception;

import java.io.*;
public class UsingCheckedException {
	
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	   System.out.println("Enter your RollNo");
	  
	   int roll=0;
	   try {
	   roll=Integer.parseInt(br.readLine());
	   
	  }
	  catch(IOException|NumberFormatException e)
	  {
		  System.out.println(e.getMessage());
		  
	  }
	System.out.println("Your roll number is :"+roll);
	
	}

}

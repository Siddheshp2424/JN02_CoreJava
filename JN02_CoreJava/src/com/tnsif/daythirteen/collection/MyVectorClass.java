package com.tnsif.daythirteen.collection;
import java.util.*;

public class MyVectorClass {

	public static void main(String[] args) {
		Vector<Integer> v1=new Vector<Integer>();
		System.out.println(v1.capacity());
		v1.add(10);
		v1.add(50);
		v1.add(30);
		v1.add(100);
		System.out.println("size:"+v1.size());
		System.out.println("Capacity:"+v1.capacity());
		System.out.println(v1);
	
		v1.add(100);
		v1.add(500);
		v1.add(300);
		v1.add(100);
		v1.add(110);
		v1.add(510);
		v1.add(310);
		v1.add(700);
		System.out.println("size:"+v1.size());
		System.out.println("Capacity:"+v1.capacity());
		System.out.println(v1);
		Iterator<Integer> it=v1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			it.remove();
		}
		System.out.println("size"+v1.size());
		System.out.println("Capacity"+v1.capacity());
	
	}
	
	
	
	 
	
}

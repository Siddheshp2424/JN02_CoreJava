package com.tnsif.daythirteen.collection;
import java.util.*;
public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("Pune");
		pq.add("Nashik");
		pq.add("Banglore");
		pq.add("Hyderabad");
		pq.add("Delhi");
		System.out.println(pq);
		
		System.out.println("First Element"+pq.peek());
		while(!pq.isEmpty())
		{
			System.out.println(pq.remove());
		}
	}
	
	
}

package com.tnsif.daythirteen.collection;
import java.util.*;
public class DemoArrayList {
  
	 public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(40);
		l1.add("Ram");
		l1.add("Nikhil");
		l1.add("Karan");
		l1.add(true);
		l1.add(false);
		
		System.out.println(l1.indexOf(10));
		
		System.out.println(l1);
		System.out.println(l1.contains(10));
		System.out.println(l1.contains("Nikhil"));
		
		System.out.println(l1.remove(4));
		
		System.out.println(l1.remove("Nikhil"));
		System.out.println(l1.contains("Nikhil"));
		
		System.out.println(l1.remove(l1.indexOf(40)));
		System.out.println(l1);
	 
		
		ArrayList<String> st=new ArrayList<String>();
		st.add("Siddhesh");
		st.add("Nikhil");
		st.add("Aniket");
		st.add("karan");
		System.out.println(st);
		
		Iterator<String> itr=st.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			if(st.equals("Siddhesh"))
				itr.remove();
		}
		System.out.println(st);
		
		
		List<Integer> m1=new ArrayList<Integer>();
		m1.add(2);
		m1.add(30);
		m1.add(4);
		m1.add(5);
	 Collections.sort(m1);
		 
		Iterator<Integer> s2=m1.iterator();
		while(s2.hasNext())
		{
			int no=s2.next();
			System.out.println(no+" "+no*no);
		
		}
        
		List<Student> l3=new ArrayList<Student>();
		l3.add(new Student(10,"Siddhesh",80));
		l3.add(new Student(20,"Nikhil",90));
		l3.add(new Student(30,"Aniket",91));
		l3.add(new Student(40,"Karan",98));
		
		System.out.println(l3);
				
	 
	 
	 }
	
}

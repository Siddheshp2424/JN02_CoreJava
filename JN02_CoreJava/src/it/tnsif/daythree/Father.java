package it.tnsif.daythree;

import it.tnsif.daythree.Father.Son;

public class Father {
   int fId;
	 String fName;
	String fHobby;

	
public static class Son
	{
		int sId;
		String sName;
		String sHobby;
		
		public Son()
		{
			sId=10;
			sName="Sarthak";
		    sHobby="Playing cricket";
		   
		    
		}
		
		public void show()
		{
			System.out.println("Student Id="+sId+"\tStudent Name="+sName+"\tStudent Hobby"+sHobby);
		}
	}

public void Outerdisp()
{
	Son s1= new Son();
	System.out.println("Student Id"+s1.sId);
}

public static void main(String[] args) {
	Father.Son t1=new Father.Son();
	t1.show();

	Father m1=new Father();
	m1.Outerdisp();
}
}

package dayfour;

public class UsingFinal {
	private int size;
	private static int length;
	
	static {
		length=5;
		
	}
	public UsingFinal()
	{
		size=40;
	}
	
	public UsingFinal(int size)
	{
		this.size=size;
	}

	public int getSize() {
		return size;
	}

	 
	public static int getLength() {
		return length;
	}

 
	public final void finalMethod()
	{
		System.out.println("Final Method");
	}
	
	

}

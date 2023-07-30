package dayfour;

public class FinalDemo {

	public static void main(String[] args) {
		UsingFinal t1=new UsingFinal();
		System.out.println(t1.getSize());
		System.out.println(t1.getLength());
		
		t1=new UsingFinal(60);
		System.out.println(t1.getSize());
		System.out.println(t1.getLength());
	}
}


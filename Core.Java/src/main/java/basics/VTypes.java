package basics;

public class VTypes {
     int b = 20;
static int c =30;
	public static void main(String[] args) {
		VTypes v = new VTypes();
		int a = 10;
		System.out.println("a="+a);
		System.out.println("b="+v.b);
		System.out.println("c="+c);
		v.m1();
	}
   public void m1() {
	System.out.println("b="+b );
	
}
}

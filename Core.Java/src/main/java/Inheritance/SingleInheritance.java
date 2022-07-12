package Inheritance;

class Parent{
	public int a=10;
	public void m1() {
		System.out.println("from parent method");
	}
}

class Child extends Parent{
	public int b=20;
	public void m2() {
		System.out.println("from child method");
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.m1();
		System.out.println(p.a);
		System.out.println();
		
		Child c = new Child();
		c.m1();
		c.m2();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println();
		
		Parent p1 = new Child();
		p1.m1();
		//p1.m2();
		System.out.println(p1.a);
	//	System.out.println(p1.b);
		
	}

}

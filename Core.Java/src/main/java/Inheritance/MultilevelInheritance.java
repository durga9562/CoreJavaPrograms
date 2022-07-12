package Inheritance;

class Parent1{
	public void m1() {
		System.out.println("Amir is good boy");
	}
}

class Parent2 extends Parent1{
	public void m2() {
		System.out.println("kARTHIK IS INTELLIGENT");
	}
}
public class MultilevelInheritance extends Parent2{

	public static void main(String[] args) {
		MultilevelInheritance obj = new MultilevelInheritance();
		obj.m1();
		obj.m2();

	}

}
